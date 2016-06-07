/**
 */
package fumlConfigurationTrace;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.FumlConfigurationTraceFactory
 * @model kind="package"
 * @generated
 */
public interface FumlConfigurationTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fumlConfigurationTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fumlConfigurationTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fumlConfigurationTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FumlConfigurationTracePackage eINSTANCE = fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link fumlConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fumlConfigurationTrace.impl.SpecificTraceImpl
	 * @see fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_DO_ACTION_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_GET_PIN_ACTIVATION_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_HAS_OFFERS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_INISITALIZE_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_IS_READY_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKEN_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKENS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SEND_OFFERS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_TOKENS_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TERMINATE_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_COLLECT_OUTPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_DO_ACTION_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_INITIALIZE_INPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_REMOVE_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_TERMINATE_CALL_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_BEHAVIOR_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_BEHAVIOR_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_IS_READY_INPUT_PIN_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_RECEIVE_OFFER_INPUT_PIN_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_OPAQUE_ACTION_ACTIVATION_DO_ACTION_OPAQUE_ACTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_DO_ACTION_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_CREATE_OBJECT_ACTION_ACTIVATION_DO_ACTION_CREATE_OBJECT_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_DO_ACTION_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_VALUE_SPECIFICATION_ACTION_ACTIVATION_DO_ACTION_VALUE_SPECIFICATION_ACTION_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_COUNT_OFFERED_VALUES_ACTIVITY_EDGE_INSTANCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_HAS_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_SEND_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_COLLECT_OUTPUT_PARAMETER_VALUES_ACTIVITY_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_EXECUTE_ACTIVITY_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_SET_PARAMETER_VALUE_VALUES_ACTIVITY_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_TERMINATE_ACTIVITY_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVATE_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CHECK_INCOMING_EDGES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_INITIALLY_ENABLED_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_SOURCE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_NODES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_TERMINATE_ALL_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_CONTEXT_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_LOCUS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_HAS_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_INITIALIZE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_READY_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_RUNNING_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_SOURCE_FOR_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RECEIVE_OFFER_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_REMOVE_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RUN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_SEND_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TERMINATE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_TOKEN_IS_CONTROL_CONTROL_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_DETERMINE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_EXECUTE_DECISION_INPUT_BEHAVIOR_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_INSTANCE_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_VALUE_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_VALUES_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_HAS_OBJECT_FLOW_INPUT_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 85;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_IS_READY_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 86;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_REMOVE_JOINED_CONTROL_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 87;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 88;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TEST_DECISION_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 89;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 90;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_GET_VALUE_FORKED_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 91;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_INITIALIZE_FORKED_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 92;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_IS_CONTROL_FORKED_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 93;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_WITHDRAW_FORKED_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 94;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 95;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_JOIN_NODE_ACTIVATION_IS_READY_JOIN_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 96;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_ADD_TOKEN_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 97;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_CLEAR_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 98;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_OFFERED_VALUES_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 99;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 100;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_GET_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 101;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_INITIALIZE_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 102;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_OFFERS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 103;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 104;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TAKE_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 105;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TERMINATE_OBJECT_NODE_ACTIVATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 106;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_GET_VALUE_OBJECT_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 107;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_IS_CONTROL_OBJECT_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 108;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_COUNT_OFFERED_VALUES_OFFER_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 109;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_GET_OFFERED_TOKENS_OFFER_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 110;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_HAS_TOKENS_OFFER_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 111;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_REMOVE_WITHDRAWN_TOKENS_OFFER_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 112;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_GET_VALUE_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 113;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_CONTROL_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 114;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_WITHDRAWN_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 115;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_TRANSFER_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 116;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_WITHDRAW_TOKEN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 117;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_COPY_BOOLEAN_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 118;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_EQUALS_BOOLEAN_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 119;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_NEW_BOOLEAN_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 120;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_COPY_COMPOUND_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 121;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_GET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 122;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_SET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 123;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EVALUATION_EVALUATE_EVALUATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 124;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_COPY_EXTENSIONAL_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 125;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_DESTROY_EXTENSIONAL_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 126;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_FEATURE_VALUE_COPY_FEATURE_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 127;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_COPY_INTEGER_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 128;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_EQUALS_INTEGER_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 129;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_NEW_INTEGER_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 130;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_BOOLEAN_EVALUATION_EVALUATE_LITERAL_BOOLEAN_EVALUATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 131;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_EVALUATION_GET_TYPE_LITERAL_EVALUATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 132;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_INTEGER_EVALUATION_EVALUATE_LITERAL_INTEGER_EVALUATION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 133;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Copy Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_COPY_OBJECT_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 134;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Destroy Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_DESTROY_OBJECT_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 135;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Get Types Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_GET_TYPES_OBJECT_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 136;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object New Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_NEW_OBJECT_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 137;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_COPY_PRIMITIVE_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 138;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_GET_TYPES_PRIMITIVE_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 139;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_GET_FEATURE_VALUE_REFERENCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 140;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_SET_FEATURE_VALUE_REFERENCE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 141;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_STRUCTURED_VALUE_CREATE_FEATURE_VALUES_STRUCTURED_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 142;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Copy Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_COPY_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 143;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Equals Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_EQUALS_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 144;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Get Types Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_GET_TYPES_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 145;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Has Type Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_HAS_TYPE_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 146;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value New Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_NEW_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 147;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_COPY_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 148;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_EXECUTE_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 149;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 150;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_OUTPUT_PARAMETER_VALUES_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 151;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_PARAMETER_VALUE_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 152;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 153;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_TERMINATE_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 154;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_DO_BODY_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 155;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_EXECUTE_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 156;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_PARAMETER_VALUE_COPY_PARAMETER_VALUE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 157;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EVALUATION_EXECUTION_FACTORY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 158;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EXECUTION_EXECUTION_FACTORY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 159;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_GET_BUILT_IN_TYPE_EXECUTION_FACTORY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 160;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION_EXECUTION_FACTORY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 161;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_VISITOR_EXECUTION_FACTORY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 162;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Executor Evaluate Executor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EVALUATE_EXECUTOR_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 163;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Executor Execute Executor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EXECUTE_EXECUTOR_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 164;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Add Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_ADD_LOCUS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 165;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Instantiate Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_INSTANTIATE_LOCUS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 166;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Remove Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_REMOVE_LOCUS_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 167;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_SEMANTIC_VISITOR_INITIALIZE_SEMANTIC_VISITOR_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 168;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Model Configuration Main Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_MODEL_CONFIGURATION_MAIN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 169;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 170;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 171;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 172;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 173;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 174;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 175;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Call Behavior Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_CALL_BEHAVIOR_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 176;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Input Pin Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_INPUT_PIN_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 177;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Opaque Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OPAQUE_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 178;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Output Pin Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OUTPUT_PIN_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 179;

	/**
	 * The feature id for the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES = TracePackage.TRACE_FEATURE_COUNT + 180;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Abstraction Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ABSTRACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 181;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Accept Call Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACCEPT_CALL_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 182;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Accept Event Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACCEPT_EVENT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 183;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 184;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Action Execution Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 185;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Action Input Pin Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_INPUT_PIN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 186;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 187;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Content Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_CONTENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 188;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Edge Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_EDGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 189;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Final Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_FINAL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 190;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Group Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_GROUP_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 191;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 192;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Parameter Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 193;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Activity Partition Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_PARTITION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 194;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Actor Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTOR_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 195;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Add Structural Feature Value Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 196;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Add Variable Value Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 197;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Any Receive Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ANY_RECEIVE_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 198;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Artifact Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ARTIFACT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 199;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Association Class Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ASSOCIATION_CLASS_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 200;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Association Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ASSOCIATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 201;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Behavior Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIOR_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 202;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Behavior Execution Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 203;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Behavioral Feature Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIORAL_FEATURE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 204;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Behaviored Classifier Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 205;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Broadcast Signal Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 206;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Call Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 207;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Call Behavior Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 208;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Call Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 209;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Call Operation Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_OPERATION_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 210;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Central Buffer Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CENTRAL_BUFFER_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 211;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Change Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CHANGE_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 212;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Class Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASS_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 213;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Classifier Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASSIFIER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 214;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Classifier Template Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 215;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Clause Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLAUSE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 216;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Clear Association Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 217;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Clear Structural Feature Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 218;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Clear Variable Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 219;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Collaboration Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COLLABORATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 220;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Collaboration Use Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COLLABORATION_USE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 221;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Combined Fragment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMBINED_FRAGMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 222;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Comment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 223;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Communication Path Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMMUNICATION_PATH_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 224;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Component Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMPONENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 225;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Component Realization Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMPONENT_REALIZATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 226;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Conditional Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONDITIONAL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 227;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Connectable Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTABLE_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 228;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Connectable Element Template Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 229;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Connection Point Reference Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 230;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Connector Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTOR_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 231;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Connector End Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTOR_END_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 232;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Consider Ignore Fragment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 233;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Constraint Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONSTRAINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 234;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Continuation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTINUATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 235;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Control Flow Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTROL_FLOW_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 236;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Control Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTROL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 237;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Create Link Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_LINK_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 238;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Create Link Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 239;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Create Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 240;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Data Store Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DATA_STORE_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 241;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Data Type Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DATA_TYPE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 242;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Decision Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DECISION_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 243;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Dependency Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPENDENCY_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 244;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Deployed Artifact Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYED_ARTIFACT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 245;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Deployment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 246;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Deployment Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 247;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Deployment Target Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_TARGET_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 248;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Destroy Link Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTROY_LINK_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 249;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Destroy Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTROY_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 250;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Destruction Occurrence Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 251;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Device Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEVICE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 252;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Directed Relationship Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DIRECTED_RELATIONSHIP_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 253;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Duration Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 254;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Duration Constraint Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_CONSTRAINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 255;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Duration Interval Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_INTERVAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 256;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Duration Observation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_OBSERVATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 257;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 258;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Element Import Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_IMPORT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 259;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Encapsulated Classifier Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 260;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Enumeration Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENUMERATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 261;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Enumeration Literal Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENUMERATION_LITERAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 262;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 263;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Exception Handler Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXCEPTION_HANDLER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 264;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Executable Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTABLE_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 265;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Execution Environment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_ENVIRONMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 266;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Execution Occurrence Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 267;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Execution Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 268;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Expansion Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPANSION_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 269;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Expansion Region Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPANSION_REGION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 270;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Expression Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPRESSION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 271;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Extend Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTEND_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 272;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Extension Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 273;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Extension End Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_END_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 274;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Extension Point Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_POINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 275;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Feature Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FEATURE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 276;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Final Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FINAL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 277;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Final State Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FINAL_STATE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 278;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Flow Final Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FLOW_FINAL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 279;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Fork Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FORK_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 280;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Function Behavior Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FUNCTION_BEHAVIOR_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 281;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Gate Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GATE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 282;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced General Ordering Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERAL_ORDERING_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 283;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Generalization Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERALIZATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 284;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Generalization Set Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERALIZATION_SET_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 285;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Image Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_IMAGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 286;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Include Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INCLUDE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 287;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Information Flow Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INFORMATION_FLOW_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 288;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Information Item Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INFORMATION_ITEM_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 289;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Initial Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INITIAL_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 290;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Input Pin Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INPUT_PIN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 291;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Instance Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INSTANCE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 292;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Instance Value Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INSTANCE_VALUE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 293;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interaction Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 294;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interaction Constraint Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_CONSTRAINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 295;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interaction Fragment Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_FRAGMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 296;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interaction Operand Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_OPERAND_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 297;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interaction Use Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_USE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 298;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interface Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERFACE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 299;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interface Realization Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERFACE_REALIZATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 300;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interruptible Activity Region Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 301;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interval Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERVAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 302;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Interval Constraint Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERVAL_CONSTRAINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 303;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Invocation Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INVOCATION_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 304;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Join Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_JOIN_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 305;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Lifeline Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LIFELINE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 306;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Link Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 307;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Link End Creation Data Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_CREATION_DATA_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 308;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Link End Data Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_DATA_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 309;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Link End Destruction Data Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 310;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Boolean Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_BOOLEAN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 311;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Integer Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_INTEGER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 312;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Null Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_NULL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 313;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Real Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_REAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 314;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 315;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal String Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_STRING_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 316;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Literal Unlimited Natural Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 317;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Loop Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LOOP_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 318;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Manifestation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MANIFESTATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 319;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Merge Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MERGE_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 320;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Message Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 321;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Message End Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_END_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 322;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Message Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 323;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Message Occurrence Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 324;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Model Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MODEL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 325;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Multiplicity Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MULTIPLICITY_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 326;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Named Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NAMED_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 327;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Namespace Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NAMESPACE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 328;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 329;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Object Flow Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBJECT_FLOW_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 330;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Object Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBJECT_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 331;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Observation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBSERVATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 332;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Occurrence Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 333;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Opaque Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 334;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Opaque Behavior Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_BEHAVIOR_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 335;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Opaque Expression Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_EXPRESSION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 336;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Operation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPERATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 337;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Operation Template Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 338;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Output Pin Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OUTPUT_PIN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 339;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Package Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 340;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Package Import Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_IMPORT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 341;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Package Merge Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_MERGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 342;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Packageable Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGEABLE_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 343;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 344;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Parameter Set Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETER_SET_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 345;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Parameterable Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETERABLE_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 346;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Part Decomposition Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PART_DECOMPOSITION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 347;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Pin Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PIN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 348;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Port Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PORT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 349;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Primitive Type Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PRIMITIVE_TYPE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 350;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Profile Application Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROFILE_APPLICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 351;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Profile Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROFILE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 352;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Property Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROPERTY_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 353;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Protocol Conformance Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_CONFORMANCE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 354;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Protocol State Machine Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 355;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Protocol Transition Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_TRANSITION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 356;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Pseudostate Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PSEUDOSTATE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 357;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Qualifier Value Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_QUALIFIER_VALUE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 358;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Raise Exception Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 359;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Extent Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_EXTENT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 360;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Is Classified Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 361;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Link Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 362;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Link Object End Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 363;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Link Object End Qualifier Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 364;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Self Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_SELF_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 365;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Structural Feature Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 366;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Read Variable Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_VARIABLE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 367;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Realization Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REALIZATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 368;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Reception Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RECEPTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 369;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Reclassify Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 370;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Redefinable Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDEFINABLE_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 371;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Redefinable Template Signature Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 372;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Reduce Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDUCE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 373;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Region Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REGION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 374;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Relationship Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RELATIONSHIP_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 375;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Remove Structural Feature Value Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 376;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Remove Variable Value Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 377;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Reply Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REPLY_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 378;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Send Object Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEND_OBJECT_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 379;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Send Signal Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEND_SIGNAL_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 380;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Sequence Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEQUENCE_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 381;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Signal Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SIGNAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 382;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Signal Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SIGNAL_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 383;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Slot Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SLOT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 384;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Start Classifier Behavior Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 385;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Start Object Behavior Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 386;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced State Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 387;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced State Invariant Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_INVARIANT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 388;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced State Machine Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_MACHINE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 389;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Stereotype Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STEREOTYPE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 390;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced String Expression Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRING_EXPRESSION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 391;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Structural Feature Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 392;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Structural Feature Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURAL_FEATURE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 393;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Structured Activity Node Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 394;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Structured Classifier Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURED_CLASSIFIER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 395;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Substitution Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SUBSTITUTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 396;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Template Binding Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_BINDING_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 397;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Template Parameter Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_PARAMETER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 398;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Template Parameter Substitution Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 399;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Template Signature Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_SIGNATURE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 400;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Templateable Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 401;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Test Identity Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEST_IDENTITY_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 402;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Time Constraint Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_CONSTRAINT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 403;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Time Event Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_EVENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 404;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Time Expression Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_EXPRESSION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 405;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Time Interval Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_INTERVAL_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 406;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Time Observation Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_OBSERVATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 407;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Transition Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TRANSITION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 408;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Trigger Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TRIGGER_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 409;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Type Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TYPE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 410;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Typed Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TYPED_ELEMENT_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 411;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Unmarshall Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_UNMARSHALL_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 412;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Usage Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_USAGE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 413;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Use Case Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_USE_CASE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 414;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Value Pin Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_PIN_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 415;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Value Specification Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 416;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Value Specification Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_SPECIFICATION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 417;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Variable Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VARIABLE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 418;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Variable Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VARIABLE_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 419;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Vertex Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VERTEX_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 420;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Write Link Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_LINK_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 421;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Write Structural Feature Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 422;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Write Variable Action Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_VARIABLE_ACTION_CONFIGURATIONS = TracePackage.TRACE_FEATURE_COUNT + 423;

	/**
	 * The feature id for the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS = TracePackage.TRACE_FEATURE_COUNT + 424;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Greater Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTIONS = TracePackage.TRACE_FEATURE_COUNT + 425;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Less Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTIONS = TracePackage.TRACE_FEATURE_COUNT + 426;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Plus Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTIONS = TracePackage.TRACE_FEATURE_COUNT + 427;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Add Structural Feature Value Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 428;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Create Object Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_CREATE_OBJECT_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 429;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Read Structural Feature Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 430;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Value Specification Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_VALUE_SPECIFICATION_ACTION_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 431;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES = TracePackage.TRACE_FEATURE_COUNT + 432;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS = TracePackage.TRACE_FEATURE_COUNT + 433;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Final Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 434;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS = TracePackage.TRACE_FEATURE_COUNT + 435;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 436;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Parameter Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 437;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Control Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_CONTROL_TOKENS = TracePackage.TRACE_FEATURE_COUNT + 438;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Decision Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_DECISION_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 439;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Fork Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORK_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 440;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS = TracePackage.TRACE_FEATURE_COUNT + 441;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Initial Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_INITIAL_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 442;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Join Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_JOIN_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 443;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Merge Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_MERGE_NODE_ACTIVATIONS = TracePackage.TRACE_FEATURE_COUNT + 444;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS = TracePackage.TRACE_FEATURE_COUNT + 445;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS = TracePackage.TRACE_FEATURE_COUNT + 446;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS = TracePackage.TRACE_FEATURE_COUNT + 447;

	/**
	 * The feature id for the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES = TracePackage.TRACE_FEATURE_COUNT + 448;

	/**
	 * The feature id for the '<em><b>Kernel traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES = TracePackage.TRACE_FEATURE_COUNT + 449;

	/**
	 * The feature id for the '<em><b>Kernel traced Literal Boolean Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_BOOLEAN_EVALUATIONS = TracePackage.TRACE_FEATURE_COUNT + 450;

	/**
	 * The feature id for the '<em><b>Kernel traced Literal Integer Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_INTEGER_EVALUATIONS = TracePackage.TRACE_FEATURE_COUNT + 451;

	/**
	 * The feature id for the '<em><b>Kernel traced Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS = TracePackage.TRACE_FEATURE_COUNT + 452;

	/**
	 * The feature id for the '<em><b>Kernel traced References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES = TracePackage.TRACE_FEATURE_COUNT + 453;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS = TracePackage.TRACE_FEATURE_COUNT + 454;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS = TracePackage.TRACE_FEATURE_COUNT + 455;

	/**
	 * The feature id for the '<em><b>Loci traced Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS = TracePackage.TRACE_FEATURE_COUNT + 456;

	/**
	 * The feature id for the '<em><b>Loci traced Locuss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_LOCUSS = TracePackage.TRACE_FEATURE_COUNT + 457;

	/**
	 * The feature id for the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS = TracePackage.TRACE_FEATURE_COUNT + 458;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 459;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 460;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = TracePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fumlConfigurationTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence <em>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence <em>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence <em>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence <em>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence <em>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence <em>Fuml Configuration Classes Kernel Object Copy Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Copy Object Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence <em>Fuml Configuration Classes Kernel Object Destroy Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Destroy Object Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence <em>Fuml Configuration Classes Kernel Object Get Types Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Get Types Object Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_New_Object_Sequence <em>Fuml Configuration Classes Kernel Object New Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object New Object Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_New_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_New_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence <em>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence <em>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence <em>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence <em>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence <em>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence <em>Fuml Configuration Classes Kernel Value Copy Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Copy Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence <em>Fuml Configuration Classes Kernel Value Equals Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Equals Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence <em>Fuml Configuration Classes Kernel Value Get Types Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Get Types Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence <em>Fuml Configuration Classes Kernel Value Has Type Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Has Type Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_New_Value_Sequence <em>Fuml Configuration Classes Kernel Value New Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value New Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_New_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_New_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence <em>Fuml Configuration Loci Executor Evaluate Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Executor Evaluate Executor Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Execute_Executor_Sequence <em>Fuml Configuration Loci Executor Execute Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Executor Execute Executor Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Execute_Executor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Execute_Executor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Add_Locus_Sequence <em>Fuml Configuration Loci Locus Add Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Add Locus Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Add_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Add_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence <em>Fuml Configuration Loci Locus Instantiate Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Instantiate Locus Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Remove_Locus_Sequence <em>Fuml Configuration Loci Locus Remove Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Remove Locus Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Remove_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Remove_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence <em>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_ModelConfiguration_Main_Sequence <em>Fuml Configuration Model Configuration Main Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Model Configuration Main Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_ModelConfiguration_Main_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_ModelConfiguration_Main_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedCallBehaviorActionActivations <em>Basic Actions traced Call Behavior Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Call Behavior Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedCallBehaviorActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedCallBehaviorActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedInputPinActivations <em>Basic Actions traced Input Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Input Pin Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedInputPinActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedInputPinActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedOpaqueActionActivations <em>Basic Actions traced Opaque Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Opaque Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedOpaqueActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedOpaqueActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedOutputPinActivations <em>Basic Actions traced Output Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Output Pin Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getBasicActions_tracedOutputPinActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedOutputPinActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues <em>Basic Behaviors traced Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Behaviors traced Parameter Values</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicBehaviors_tracedParameterValues();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAbstractionConfigurations <em>Fuml Configuration traced Abstraction Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Abstraction Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAbstractionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAbstractionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAcceptCallActionConfigurations <em>Fuml Configuration traced Accept Call Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Accept Call Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAcceptCallActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAcceptCallActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAcceptEventActionConfigurations <em>Fuml Configuration traced Accept Event Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Accept Event Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAcceptEventActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAcceptEventActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionConfigurations <em>Fuml Configuration traced Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionExecutionSpecificationConfigurations <em>Fuml Configuration traced Action Execution Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Action Execution Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionExecutionSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActionExecutionSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionInputPinConfigurations <em>Fuml Configuration traced Action Input Pin Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Action Input Pin Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActionInputPinConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActionInputPinConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityConfigurations <em>Fuml Configuration traced Activity Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityContentConfigurations <em>Fuml Configuration traced Activity Content Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Content Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityContentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityContentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityEdgeConfigurations <em>Fuml Configuration traced Activity Edge Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Edge Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityEdgeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityEdgeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityFinalNodeConfigurations <em>Fuml Configuration traced Activity Final Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Final Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityFinalNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityFinalNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityGroupConfigurations <em>Fuml Configuration traced Activity Group Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Group Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityGroupConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityGroupConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityNodeConfigurations <em>Fuml Configuration traced Activity Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityParameterNodeConfigurations <em>Fuml Configuration traced Activity Parameter Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Parameter Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityParameterNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityParameterNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityPartitionConfigurations <em>Fuml Configuration traced Activity Partition Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Activity Partition Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActivityPartitionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActivityPartitionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActorConfigurations <em>Fuml Configuration traced Actor Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Actor Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedActorConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedActorConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations <em>Fuml Configuration traced Add Structural Feature Value Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Add Structural Feature Value Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAddVariableValueActionConfigurations <em>Fuml Configuration traced Add Variable Value Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Add Variable Value Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAddVariableValueActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAddVariableValueActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAnyReceiveEventConfigurations <em>Fuml Configuration traced Any Receive Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Any Receive Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAnyReceiveEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAnyReceiveEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedArtifactConfigurations <em>Fuml Configuration traced Artifact Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Artifact Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedArtifactConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedArtifactConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAssociationClassConfigurations <em>Fuml Configuration traced Association Class Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Association Class Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAssociationClassConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAssociationClassConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAssociationConfigurations <em>Fuml Configuration traced Association Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Association Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedAssociationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedAssociationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehaviorConfigurations <em>Fuml Configuration traced Behavior Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Behavior Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehaviorConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedBehaviorConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations <em>Fuml Configuration traced Behavior Execution Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Behavior Execution Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehavioralFeatureConfigurations <em>Fuml Configuration traced Behavioral Feature Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Behavioral Feature Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehavioralFeatureConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedBehavioralFeatureConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehavioredClassifierConfigurations <em>Fuml Configuration traced Behaviored Classifier Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Behaviored Classifier Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBehavioredClassifierConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedBehavioredClassifierConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBroadcastSignalActionConfigurations <em>Fuml Configuration traced Broadcast Signal Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Broadcast Signal Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedBroadcastSignalActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedBroadcastSignalActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallActionConfigurations <em>Fuml Configuration traced Call Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Call Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCallActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallBehaviorActionConfigurations <em>Fuml Configuration traced Call Behavior Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Call Behavior Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallBehaviorActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCallBehaviorActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallEventConfigurations <em>Fuml Configuration traced Call Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Call Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCallEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallOperationActionConfigurations <em>Fuml Configuration traced Call Operation Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Call Operation Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCallOperationActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCallOperationActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCentralBufferNodeConfigurations <em>Fuml Configuration traced Central Buffer Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Central Buffer Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCentralBufferNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCentralBufferNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedChangeEventConfigurations <em>Fuml Configuration traced Change Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Change Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedChangeEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedChangeEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassConfigurations <em>Fuml Configuration traced Class Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Class Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClassConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassifierConfigurations <em>Fuml Configuration traced Classifier Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Classifier Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassifierConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClassifierConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassifierTemplateParameterConfigurations <em>Fuml Configuration traced Classifier Template Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Classifier Template Parameter Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClassifierTemplateParameterConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClassifierTemplateParameterConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClauseConfigurations <em>Fuml Configuration traced Clause Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Clause Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClauseConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClauseConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearAssociationActionConfigurations <em>Fuml Configuration traced Clear Association Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Clear Association Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearAssociationActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClearAssociationActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearStructuralFeatureActionConfigurations <em>Fuml Configuration traced Clear Structural Feature Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Clear Structural Feature Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearStructuralFeatureActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClearStructuralFeatureActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearVariableActionConfigurations <em>Fuml Configuration traced Clear Variable Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Clear Variable Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedClearVariableActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedClearVariableActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCollaborationConfigurations <em>Fuml Configuration traced Collaboration Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Collaboration Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCollaborationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCollaborationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCollaborationUseConfigurations <em>Fuml Configuration traced Collaboration Use Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Collaboration Use Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCollaborationUseConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCollaborationUseConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCombinedFragmentConfigurations <em>Fuml Configuration traced Combined Fragment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Combined Fragment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCombinedFragmentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCombinedFragmentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCommentConfigurations <em>Fuml Configuration traced Comment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Comment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCommentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCommentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCommunicationPathConfigurations <em>Fuml Configuration traced Communication Path Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Communication Path Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCommunicationPathConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCommunicationPathConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedComponentConfigurations <em>Fuml Configuration traced Component Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Component Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedComponentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedComponentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedComponentRealizationConfigurations <em>Fuml Configuration traced Component Realization Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Component Realization Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedComponentRealizationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedComponentRealizationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConditionalNodeConfigurations <em>Fuml Configuration traced Conditional Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Conditional Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConditionalNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConditionalNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectableElementConfigurations <em>Fuml Configuration traced Connectable Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Connectable Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectableElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConnectableElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectableElementTemplateParameterConfigurations <em>Fuml Configuration traced Connectable Element Template Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Connectable Element Template Parameter Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectableElementTemplateParameterConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConnectableElementTemplateParameterConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectionPointReferenceConfigurations <em>Fuml Configuration traced Connection Point Reference Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Connection Point Reference Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectionPointReferenceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConnectionPointReferenceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectorConfigurations <em>Fuml Configuration traced Connector Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Connector Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectorConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConnectorConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectorEndConfigurations <em>Fuml Configuration traced Connector End Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Connector End Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConnectorEndConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConnectorEndConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConsiderIgnoreFragmentConfigurations <em>Fuml Configuration traced Consider Ignore Fragment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Consider Ignore Fragment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConsiderIgnoreFragmentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConsiderIgnoreFragmentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConstraintConfigurations <em>Fuml Configuration traced Constraint Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Constraint Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedConstraintConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedConstraintConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedContinuationConfigurations <em>Fuml Configuration traced Continuation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Continuation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedContinuationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedContinuationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedControlFlowConfigurations <em>Fuml Configuration traced Control Flow Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Control Flow Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedControlFlowConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedControlFlowConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedControlNodeConfigurations <em>Fuml Configuration traced Control Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Control Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedControlNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedControlNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateLinkActionConfigurations <em>Fuml Configuration traced Create Link Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Create Link Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateLinkActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCreateLinkActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateLinkObjectActionConfigurations <em>Fuml Configuration traced Create Link Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Create Link Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateLinkObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCreateLinkObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateObjectActionConfigurations <em>Fuml Configuration traced Create Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Create Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedCreateObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedCreateObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDataStoreNodeConfigurations <em>Fuml Configuration traced Data Store Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Data Store Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDataStoreNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDataStoreNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDataTypeConfigurations <em>Fuml Configuration traced Data Type Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Data Type Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDataTypeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDataTypeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDecisionNodeConfigurations <em>Fuml Configuration traced Decision Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Decision Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDecisionNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDecisionNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDependencyConfigurations <em>Fuml Configuration traced Dependency Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Dependency Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDependencyConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDependencyConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeployedArtifactConfigurations <em>Fuml Configuration traced Deployed Artifact Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Deployed Artifact Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeployedArtifactConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDeployedArtifactConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentConfigurations <em>Fuml Configuration traced Deployment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Deployment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDeploymentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentSpecificationConfigurations <em>Fuml Configuration traced Deployment Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Deployment Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDeploymentSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentTargetConfigurations <em>Fuml Configuration traced Deployment Target Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Deployment Target Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeploymentTargetConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDeploymentTargetConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestroyLinkActionConfigurations <em>Fuml Configuration traced Destroy Link Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Destroy Link Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestroyLinkActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDestroyLinkActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestroyObjectActionConfigurations <em>Fuml Configuration traced Destroy Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Destroy Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestroyObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDestroyObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations <em>Fuml Configuration traced Destruction Occurrence Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Destruction Occurrence Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeviceConfigurations <em>Fuml Configuration traced Device Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Device Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDeviceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDeviceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDirectedRelationshipConfigurations <em>Fuml Configuration traced Directed Relationship Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Directed Relationship Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDirectedRelationshipConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDirectedRelationshipConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationConfigurations <em>Fuml Configuration traced Duration Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Duration Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDurationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationConstraintConfigurations <em>Fuml Configuration traced Duration Constraint Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Duration Constraint Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationConstraintConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDurationConstraintConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationIntervalConfigurations <em>Fuml Configuration traced Duration Interval Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Duration Interval Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationIntervalConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDurationIntervalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationObservationConfigurations <em>Fuml Configuration traced Duration Observation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Duration Observation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedDurationObservationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedDurationObservationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations <em>Fuml Configuration traced Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedElementImportConfigurations <em>Fuml Configuration traced Element Import Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Element Import Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedElementImportConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedElementImportConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEncapsulatedClassifierConfigurations <em>Fuml Configuration traced Encapsulated Classifier Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Encapsulated Classifier Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEncapsulatedClassifierConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedEncapsulatedClassifierConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEnumerationConfigurations <em>Fuml Configuration traced Enumeration Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Enumeration Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEnumerationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedEnumerationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEnumerationLiteralConfigurations <em>Fuml Configuration traced Enumeration Literal Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Enumeration Literal Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEnumerationLiteralConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedEnumerationLiteralConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEventConfigurations <em>Fuml Configuration traced Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExceptionHandlerConfigurations <em>Fuml Configuration traced Exception Handler Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Exception Handler Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExceptionHandlerConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExceptionHandlerConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutableNodeConfigurations <em>Fuml Configuration traced Executable Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Executable Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutableNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExecutableNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionEnvironmentConfigurations <em>Fuml Configuration traced Execution Environment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Execution Environment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionEnvironmentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExecutionEnvironmentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations <em>Fuml Configuration traced Execution Occurrence Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Execution Occurrence Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionSpecificationConfigurations <em>Fuml Configuration traced Execution Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Execution Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExecutionSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExecutionSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpansionNodeConfigurations <em>Fuml Configuration traced Expansion Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Expansion Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpansionNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExpansionNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpansionRegionConfigurations <em>Fuml Configuration traced Expansion Region Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Expansion Region Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpansionRegionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExpansionRegionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpressionConfigurations <em>Fuml Configuration traced Expression Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Expression Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExpressionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExpressionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtendConfigurations <em>Fuml Configuration traced Extend Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Extend Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtendConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExtendConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionConfigurations <em>Fuml Configuration traced Extension Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Extension Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExtensionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionEndConfigurations <em>Fuml Configuration traced Extension End Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Extension End Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionEndConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExtensionEndConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionPointConfigurations <em>Fuml Configuration traced Extension Point Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Extension Point Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedExtensionPointConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedExtensionPointConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFeatureConfigurations <em>Fuml Configuration traced Feature Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Feature Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFeatureConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedFeatureConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFinalNodeConfigurations <em>Fuml Configuration traced Final Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Final Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFinalNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedFinalNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFinalStateConfigurations <em>Fuml Configuration traced Final State Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Final State Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFinalStateConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedFinalStateConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFlowFinalNodeConfigurations <em>Fuml Configuration traced Flow Final Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Flow Final Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFlowFinalNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedFlowFinalNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedForkNodeConfigurations <em>Fuml Configuration traced Fork Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Fork Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedForkNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedForkNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFunctionBehaviorConfigurations <em>Fuml Configuration traced Function Behavior Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Function Behavior Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedFunctionBehaviorConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedFunctionBehaviorConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGateConfigurations <em>Fuml Configuration traced Gate Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Gate Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGateConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedGateConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralOrderingConfigurations <em>Fuml Configuration traced General Ordering Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced General Ordering Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralOrderingConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedGeneralOrderingConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralizationConfigurations <em>Fuml Configuration traced Generalization Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Generalization Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralizationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedGeneralizationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralizationSetConfigurations <em>Fuml Configuration traced Generalization Set Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Generalization Set Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedGeneralizationSetConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedGeneralizationSetConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedImageConfigurations <em>Fuml Configuration traced Image Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Image Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedImageConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedImageConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIncludeConfigurations <em>Fuml Configuration traced Include Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Include Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIncludeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedIncludeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInformationFlowConfigurations <em>Fuml Configuration traced Information Flow Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Information Flow Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInformationFlowConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInformationFlowConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInformationItemConfigurations <em>Fuml Configuration traced Information Item Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Information Item Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInformationItemConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInformationItemConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInitialNodeConfigurations <em>Fuml Configuration traced Initial Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Initial Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInitialNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInitialNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInputPinConfigurations <em>Fuml Configuration traced Input Pin Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Input Pin Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInputPinConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInputPinConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInstanceSpecificationConfigurations <em>Fuml Configuration traced Instance Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Instance Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInstanceSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInstanceSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInstanceValueConfigurations <em>Fuml Configuration traced Instance Value Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Instance Value Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInstanceValueConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInstanceValueConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionConfigurations <em>Fuml Configuration traced Interaction Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interaction Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInteractionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionConstraintConfigurations <em>Fuml Configuration traced Interaction Constraint Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interaction Constraint Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionConstraintConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInteractionConstraintConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionFragmentConfigurations <em>Fuml Configuration traced Interaction Fragment Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interaction Fragment Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionFragmentConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInteractionFragmentConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionOperandConfigurations <em>Fuml Configuration traced Interaction Operand Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interaction Operand Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionOperandConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInteractionOperandConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionUseConfigurations <em>Fuml Configuration traced Interaction Use Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interaction Use Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInteractionUseConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInteractionUseConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterfaceConfigurations <em>Fuml Configuration traced Interface Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interface Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterfaceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInterfaceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterfaceRealizationConfigurations <em>Fuml Configuration traced Interface Realization Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interface Realization Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterfaceRealizationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInterfaceRealizationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterruptibleActivityRegionConfigurations <em>Fuml Configuration traced Interruptible Activity Region Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interruptible Activity Region Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInterruptibleActivityRegionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInterruptibleActivityRegionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIntervalConfigurations <em>Fuml Configuration traced Interval Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interval Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIntervalConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedIntervalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIntervalConstraintConfigurations <em>Fuml Configuration traced Interval Constraint Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Interval Constraint Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedIntervalConstraintConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedIntervalConstraintConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInvocationActionConfigurations <em>Fuml Configuration traced Invocation Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Invocation Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedInvocationActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedInvocationActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedJoinNodeConfigurations <em>Fuml Configuration traced Join Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Join Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedJoinNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedJoinNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLifelineConfigurations <em>Fuml Configuration traced Lifeline Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Lifeline Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLifelineConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLifelineConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkActionConfigurations <em>Fuml Configuration traced Link Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Link Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLinkActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndCreationDataConfigurations <em>Fuml Configuration traced Link End Creation Data Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Link End Creation Data Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndCreationDataConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLinkEndCreationDataConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndDataConfigurations <em>Fuml Configuration traced Link End Data Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Link End Data Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndDataConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLinkEndDataConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndDestructionDataConfigurations <em>Fuml Configuration traced Link End Destruction Data Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Link End Destruction Data Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLinkEndDestructionDataConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLinkEndDestructionDataConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralBooleanConfigurations <em>Fuml Configuration traced Literal Boolean Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Boolean Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralBooleanConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralBooleanConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralIntegerConfigurations <em>Fuml Configuration traced Literal Integer Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Integer Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralIntegerConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralIntegerConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralNullConfigurations <em>Fuml Configuration traced Literal Null Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Null Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralNullConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralNullConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralRealConfigurations <em>Fuml Configuration traced Literal Real Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Real Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralRealConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralRealConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralSpecificationConfigurations <em>Fuml Configuration traced Literal Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralStringConfigurations <em>Fuml Configuration traced Literal String Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal String Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralStringConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralStringConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations <em>Fuml Configuration traced Literal Unlimited Natural Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Literal Unlimited Natural Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLoopNodeConfigurations <em>Fuml Configuration traced Loop Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Loop Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedLoopNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedLoopNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedManifestationConfigurations <em>Fuml Configuration traced Manifestation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Manifestation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedManifestationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedManifestationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMergeNodeConfigurations <em>Fuml Configuration traced Merge Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Merge Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMergeNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMergeNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageConfigurations <em>Fuml Configuration traced Message Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Message Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMessageConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageEndConfigurations <em>Fuml Configuration traced Message End Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Message End Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageEndConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMessageEndConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageEventConfigurations <em>Fuml Configuration traced Message Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Message Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMessageEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations <em>Fuml Configuration traced Message Occurrence Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Message Occurrence Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedModelConfigurations <em>Fuml Configuration traced Model Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Model Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedModelConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedModelConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMultiplicityElementConfigurations <em>Fuml Configuration traced Multiplicity Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Multiplicity Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedMultiplicityElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedMultiplicityElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNamedElementConfigurations <em>Fuml Configuration traced Named Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Named Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNamedElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedNamedElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNamespaceConfigurations <em>Fuml Configuration traced Namespace Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Namespace Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNamespaceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedNamespaceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNodeConfigurations <em>Fuml Configuration traced Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObjectFlowConfigurations <em>Fuml Configuration traced Object Flow Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Object Flow Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObjectFlowConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedObjectFlowConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObjectNodeConfigurations <em>Fuml Configuration traced Object Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Object Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObjectNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedObjectNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObservationConfigurations <em>Fuml Configuration traced Observation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Observation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedObservationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedObservationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOccurrenceSpecificationConfigurations <em>Fuml Configuration traced Occurrence Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Occurrence Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOccurrenceSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOccurrenceSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueActionConfigurations <em>Fuml Configuration traced Opaque Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Opaque Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOpaqueActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueBehaviorConfigurations <em>Fuml Configuration traced Opaque Behavior Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Opaque Behavior Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueBehaviorConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOpaqueBehaviorConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueExpressionConfigurations <em>Fuml Configuration traced Opaque Expression Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Opaque Expression Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOpaqueExpressionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOpaqueExpressionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOperationConfigurations <em>Fuml Configuration traced Operation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Operation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOperationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOperationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOperationTemplateParameterConfigurations <em>Fuml Configuration traced Operation Template Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Operation Template Parameter Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOperationTemplateParameterConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOperationTemplateParameterConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOutputPinConfigurations <em>Fuml Configuration traced Output Pin Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Output Pin Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedOutputPinConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedOutputPinConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageConfigurations <em>Fuml Configuration traced Package Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Package Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPackageConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageImportConfigurations <em>Fuml Configuration traced Package Import Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Package Import Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageImportConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPackageImportConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageMergeConfigurations <em>Fuml Configuration traced Package Merge Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Package Merge Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageMergeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPackageMergeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageableElementConfigurations <em>Fuml Configuration traced Packageable Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Packageable Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPackageableElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPackageableElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterConfigurations <em>Fuml Configuration traced Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Parameter Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedParameterConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterSetConfigurations <em>Fuml Configuration traced Parameter Set Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Parameter Set Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterSetConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedParameterSetConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterableElementConfigurations <em>Fuml Configuration traced Parameterable Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Parameterable Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedParameterableElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedParameterableElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPartDecompositionConfigurations <em>Fuml Configuration traced Part Decomposition Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Part Decomposition Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPartDecompositionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPartDecompositionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPinConfigurations <em>Fuml Configuration traced Pin Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Pin Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPinConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPinConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPortConfigurations <em>Fuml Configuration traced Port Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Port Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPortConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPortConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPrimitiveTypeConfigurations <em>Fuml Configuration traced Primitive Type Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Primitive Type Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPrimitiveTypeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPrimitiveTypeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProfileApplicationConfigurations <em>Fuml Configuration traced Profile Application Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Profile Application Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProfileApplicationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedProfileApplicationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProfileConfigurations <em>Fuml Configuration traced Profile Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Profile Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProfileConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedProfileConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPropertyConfigurations <em>Fuml Configuration traced Property Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Property Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPropertyConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPropertyConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolConformanceConfigurations <em>Fuml Configuration traced Protocol Conformance Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Protocol Conformance Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolConformanceConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedProtocolConformanceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolStateMachineConfigurations <em>Fuml Configuration traced Protocol State Machine Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Protocol State Machine Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolStateMachineConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedProtocolStateMachineConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolTransitionConfigurations <em>Fuml Configuration traced Protocol Transition Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Protocol Transition Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedProtocolTransitionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedProtocolTransitionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPseudostateConfigurations <em>Fuml Configuration traced Pseudostate Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Pseudostate Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedPseudostateConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedPseudostateConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedQualifierValueConfigurations <em>Fuml Configuration traced Qualifier Value Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Qualifier Value Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedQualifierValueConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedQualifierValueConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRaiseExceptionActionConfigurations <em>Fuml Configuration traced Raise Exception Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Raise Exception Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRaiseExceptionActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRaiseExceptionActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadExtentActionConfigurations <em>Fuml Configuration traced Read Extent Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Extent Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadExtentActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadExtentActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations <em>Fuml Configuration traced Read Is Classified Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Is Classified Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkActionConfigurations <em>Fuml Configuration traced Read Link Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Link Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadLinkActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkObjectEndActionConfigurations <em>Fuml Configuration traced Read Link Object End Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Link Object End Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkObjectEndActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations <em>Fuml Configuration traced Read Link Object End Qualifier Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Link Object End Qualifier Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadSelfActionConfigurations <em>Fuml Configuration traced Read Self Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Self Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadSelfActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadSelfActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadStructuralFeatureActionConfigurations <em>Fuml Configuration traced Read Structural Feature Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Structural Feature Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadStructuralFeatureActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadStructuralFeatureActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadVariableActionConfigurations <em>Fuml Configuration traced Read Variable Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Read Variable Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReadVariableActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReadVariableActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRealizationConfigurations <em>Fuml Configuration traced Realization Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Realization Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRealizationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRealizationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReceptionConfigurations <em>Fuml Configuration traced Reception Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Reception Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReceptionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReceptionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReclassifyObjectActionConfigurations <em>Fuml Configuration traced Reclassify Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Reclassify Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReclassifyObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReclassifyObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRedefinableElementConfigurations <em>Fuml Configuration traced Redefinable Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Redefinable Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRedefinableElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRedefinableElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRedefinableTemplateSignatureConfigurations <em>Fuml Configuration traced Redefinable Template Signature Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Redefinable Template Signature Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRedefinableTemplateSignatureConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRedefinableTemplateSignatureConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReduceActionConfigurations <em>Fuml Configuration traced Reduce Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Reduce Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReduceActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReduceActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRegionConfigurations <em>Fuml Configuration traced Region Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Region Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRegionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRegionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRelationshipConfigurations <em>Fuml Configuration traced Relationship Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Relationship Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRelationshipConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRelationshipConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations <em>Fuml Configuration traced Remove Structural Feature Value Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Remove Structural Feature Value Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRemoveVariableValueActionConfigurations <em>Fuml Configuration traced Remove Variable Value Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Remove Variable Value Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedRemoveVariableValueActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedRemoveVariableValueActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReplyActionConfigurations <em>Fuml Configuration traced Reply Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Reply Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedReplyActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedReplyActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSendObjectActionConfigurations <em>Fuml Configuration traced Send Object Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Send Object Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSendObjectActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSendObjectActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSendSignalActionConfigurations <em>Fuml Configuration traced Send Signal Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Send Signal Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSendSignalActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSendSignalActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSequenceNodeConfigurations <em>Fuml Configuration traced Sequence Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Sequence Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSequenceNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSequenceNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSignalConfigurations <em>Fuml Configuration traced Signal Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Signal Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSignalConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSignalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSignalEventConfigurations <em>Fuml Configuration traced Signal Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Signal Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSignalEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSignalEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSlotConfigurations <em>Fuml Configuration traced Slot Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Slot Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSlotConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSlotConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStartClassifierBehaviorActionConfigurations <em>Fuml Configuration traced Start Classifier Behavior Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Start Classifier Behavior Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStartClassifierBehaviorActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStartClassifierBehaviorActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStartObjectBehaviorActionConfigurations <em>Fuml Configuration traced Start Object Behavior Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Start Object Behavior Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStartObjectBehaviorActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStartObjectBehaviorActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateConfigurations <em>Fuml Configuration traced State Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced State Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStateConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateInvariantConfigurations <em>Fuml Configuration traced State Invariant Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced State Invariant Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateInvariantConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStateInvariantConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateMachineConfigurations <em>Fuml Configuration traced State Machine Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced State Machine Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStateMachineConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStateMachineConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStereotypeConfigurations <em>Fuml Configuration traced Stereotype Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Stereotype Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStereotypeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStereotypeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStringExpressionConfigurations <em>Fuml Configuration traced String Expression Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced String Expression Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStringExpressionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStringExpressionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuralFeatureActionConfigurations <em>Fuml Configuration traced Structural Feature Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Structural Feature Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuralFeatureActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStructuralFeatureActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuralFeatureConfigurations <em>Fuml Configuration traced Structural Feature Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Structural Feature Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuralFeatureConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStructuralFeatureConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuredActivityNodeConfigurations <em>Fuml Configuration traced Structured Activity Node Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Structured Activity Node Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuredActivityNodeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStructuredActivityNodeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuredClassifierConfigurations <em>Fuml Configuration traced Structured Classifier Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Structured Classifier Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedStructuredClassifierConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedStructuredClassifierConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSubstitutionConfigurations <em>Fuml Configuration traced Substitution Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Substitution Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedSubstitutionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedSubstitutionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateBindingConfigurations <em>Fuml Configuration traced Template Binding Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Template Binding Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateBindingConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTemplateBindingConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateParameterConfigurations <em>Fuml Configuration traced Template Parameter Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Template Parameter Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateParameterConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTemplateParameterConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateParameterSubstitutionConfigurations <em>Fuml Configuration traced Template Parameter Substitution Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Template Parameter Substitution Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateParameterSubstitutionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTemplateParameterSubstitutionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateSignatureConfigurations <em>Fuml Configuration traced Template Signature Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Template Signature Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateSignatureConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTemplateSignatureConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateableElementConfigurations <em>Fuml Configuration traced Templateable Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Templateable Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTemplateableElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTemplateableElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTestIdentityActionConfigurations <em>Fuml Configuration traced Test Identity Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Test Identity Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTestIdentityActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTestIdentityActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeConstraintConfigurations <em>Fuml Configuration traced Time Constraint Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Time Constraint Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeConstraintConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTimeConstraintConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeEventConfigurations <em>Fuml Configuration traced Time Event Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Time Event Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeEventConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTimeEventConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeExpressionConfigurations <em>Fuml Configuration traced Time Expression Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Time Expression Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeExpressionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTimeExpressionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeIntervalConfigurations <em>Fuml Configuration traced Time Interval Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Time Interval Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeIntervalConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTimeIntervalConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeObservationConfigurations <em>Fuml Configuration traced Time Observation Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Time Observation Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTimeObservationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTimeObservationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTransitionConfigurations <em>Fuml Configuration traced Transition Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Transition Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTransitionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTransitionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTriggerConfigurations <em>Fuml Configuration traced Trigger Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Trigger Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTriggerConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTriggerConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTypeConfigurations <em>Fuml Configuration traced Type Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Type Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTypeConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTypeConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTypedElementConfigurations <em>Fuml Configuration traced Typed Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Typed Element Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedTypedElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedTypedElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUnmarshallActionConfigurations <em>Fuml Configuration traced Unmarshall Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Unmarshall Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUnmarshallActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedUnmarshallActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUsageConfigurations <em>Fuml Configuration traced Usage Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Usage Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUsageConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedUsageConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUseCaseConfigurations <em>Fuml Configuration traced Use Case Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Use Case Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedUseCaseConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedUseCaseConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValuePinConfigurations <em>Fuml Configuration traced Value Pin Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Value Pin Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValuePinConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedValuePinConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValueSpecificationActionConfigurations <em>Fuml Configuration traced Value Specification Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Value Specification Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValueSpecificationActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedValueSpecificationActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValueSpecificationConfigurations <em>Fuml Configuration traced Value Specification Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Value Specification Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedValueSpecificationConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedValueSpecificationConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVariableActionConfigurations <em>Fuml Configuration traced Variable Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Variable Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVariableActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedVariableActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVariableConfigurations <em>Fuml Configuration traced Variable Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Variable Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVariableConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedVariableConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVertexConfigurations <em>Fuml Configuration traced Vertex Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Vertex Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedVertexConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedVertexConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteLinkActionConfigurations <em>Fuml Configuration traced Write Link Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Write Link Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteLinkActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedWriteLinkActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteStructuralFeatureActionConfigurations <em>Fuml Configuration traced Write Structural Feature Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Write Structural Feature Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteStructuralFeatureActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedWriteStructuralFeatureActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteVariableActionConfigurations <em>Fuml Configuration traced Write Variable Action Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Write Variable Action Configurations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getFumlConfiguration_tracedWriteVariableActionConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedWriteVariableActionConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getInput_tracedInputParameterValuess <em>Input traced Input Parameter Valuess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input traced Input Parameter Valuess</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getInput_tracedInputParameterValuess()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Input_tracedInputParameterValuess();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions <em>Integer Functions traced Integer Greater Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Greater Function Behavior Executions</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions <em>Integer Functions traced Integer Less Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Less Function Behavior Executions</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions <em>Integer Functions traced Integer Plus Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Plus Function Behavior Executions</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedAddStructuralFeatureValueActionActivations <em>Intermediate Actions traced Add Structural Feature Value Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Add Structural Feature Value Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedAddStructuralFeatureValueActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedAddStructuralFeatureValueActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedCreateObjectActionActivations <em>Intermediate Actions traced Create Object Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Create Object Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedCreateObjectActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedCreateObjectActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedReadStructuralFeatureActionActivations <em>Intermediate Actions traced Read Structural Feature Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Read Structural Feature Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedReadStructuralFeatureActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedReadStructuralFeatureActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedValueSpecificationActionActivations <em>Intermediate Actions traced Value Specification Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Value Specification Action Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActions_tracedValueSpecificationActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedValueSpecificationActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances <em>Intermediate Activities traced Activity Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Edge Instances</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions <em>Intermediate Activities traced Activity Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Executions</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityFinalNodeActivations <em>Intermediate Activities traced Activity Final Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Final Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityFinalNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityFinalNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups <em>Intermediate Activities traced Activity Node Activation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activation Groups</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations <em>Intermediate Activities traced Activity Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityParameterNodeActivations <em>Intermediate Activities traced Activity Parameter Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Parameter Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedActivityParameterNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityParameterNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedControlTokens <em>Intermediate Activities traced Control Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Control Tokens</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedControlTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedControlTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedDecisionNodeActivations <em>Intermediate Activities traced Decision Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Decision Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedDecisionNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedDecisionNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedForkNodeActivations <em>Intermediate Activities traced Fork Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Fork Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedForkNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedForkNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens <em>Intermediate Activities traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Forked Tokens</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedInitialNodeActivations <em>Intermediate Activities traced Initial Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Initial Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedInitialNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedInitialNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedJoinNodeActivations <em>Intermediate Activities traced Join Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Join Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedJoinNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedJoinNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedMergeNodeActivations <em>Intermediate Activities traced Merge Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Merge Node Activations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedMergeNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedMergeNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens <em>Intermediate Activities traced Object Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Object Tokens</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedObjectTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedOffers <em>Intermediate Activities traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Offers</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedOffers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedTokens <em>Intermediate Activities traced Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Tokens</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getIntermediateActivities_tracedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedBooleanValues <em>Kernel traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Boolean Values</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedBooleanValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedIntegerValues <em>Kernel traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Integer Values</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedIntegerValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedIntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedLiteralBooleanEvaluations <em>Kernel traced Literal Boolean Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Literal Boolean Evaluations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedLiteralBooleanEvaluations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedLiteralBooleanEvaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedLiteralIntegerEvaluations <em>Kernel traced Literal Integer Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Literal Integer Evaluations</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedLiteralIntegerEvaluations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedLiteralIntegerEvaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedObjects <em>Kernel traced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Objects</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedObjects()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getKernel_tracedReferences <em>Kernel traced References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced References</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getKernel_tracedReferences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutionEnvironments <em>Loci traced Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Environments</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutionEnvironments()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutionFactorys <em>Loci traced Execution Factorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Factorys</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutionFactorys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionFactorys();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutors <em>Loci traced Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Executors</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getLoci_tracedExecutors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutors();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getLoci_tracedLocuss <em>Loci traced Locuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Locuss</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getLoci_tracedLocuss()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedLocuss();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getLoci_tracedSemanticVisitors <em>Loci traced Semantic Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Semantic Visitors</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getLoci_tracedSemanticVisitors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedSemanticVisitors();

	/**
	 * Returns the meta object for the containment reference list '{@link fumlConfigurationTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see fumlConfigurationTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FumlConfigurationTraceFactory getFumlConfigurationTraceFactory();

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
		 * The meta object literal for the '{@link fumlConfigurationTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fumlConfigurationTrace.impl.SpecificTraceImpl
		 * @see fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_DO_ACTION_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_GET_PIN_ACTIVATION_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_HAS_OFFERS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_INISITALIZE_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_IS_READY_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKEN_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKENS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SEND_OFFERS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_TOKENS_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TERMINATE_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_COLLECT_OUTPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_DO_ACTION_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_INITIALIZE_INPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_REMOVE_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_TERMINATE_CALL_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_BEHAVIOR_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_BEHAVIOR_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_IS_READY_INPUT_PIN_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_RECEIVE_OFFER_INPUT_PIN_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_OPAQUE_ACTION_ACTIVATION_DO_ACTION_OPAQUE_ACTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_DO_ACTION_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_CREATE_OBJECT_ACTION_ACTIVATION_DO_ACTION_CREATE_OBJECT_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_DO_ACTION_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_VALUE_SPECIFICATION_ACTION_ACTIVATION_DO_ACTION_VALUE_SPECIFICATION_ACTION_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_COUNT_OFFERED_VALUES_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_HAS_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_SEND_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_COLLECT_OUTPUT_PARAMETER_VALUES_ACTIVITY_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_EXECUTE_ACTIVITY_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_SET_PARAMETER_VALUE_VALUES_ACTIVITY_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_TERMINATE_ACTIVITY_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVATE_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CHECK_INCOMING_EDGES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_INITIALLY_ENABLED_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_SOURCE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_NODES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_TERMINATE_ALL_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_CONTEXT_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_LOCUS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_HAS_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_INITIALIZE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_READY_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_RUNNING_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_SOURCE_FOR_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RECEIVE_OFFER_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_REMOVE_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RUN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_SEND_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TERMINATE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_TOKEN_IS_CONTROL_CONTROL_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_DETERMINE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_EXECUTE_DECISION_INPUT_BEHAVIOR_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_INSTANCE_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_VALUE_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_VALUES_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_HAS_OBJECT_FLOW_INPUT_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_IS_READY_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_REMOVE_JOINED_CONTROL_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TEST_DECISION_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_GET_VALUE_FORKED_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_INITIALIZE_FORKED_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_IS_CONTROL_FORKED_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_WITHDRAW_FORKED_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_JOIN_NODE_ACTIVATION_IS_READY_JOIN_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_ADD_TOKEN_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_CLEAR_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_OFFERED_VALUES_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_GET_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_INITIALIZE_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_OFFERS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TAKE_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TERMINATE_OBJECT_NODE_ACTIVATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_GET_VALUE_OBJECT_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_IS_CONTROL_OBJECT_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_COUNT_OFFERED_VALUES_OFFER_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_GET_OFFERED_TOKENS_OFFER_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_HAS_TOKENS_OFFER_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_REMOVE_WITHDRAWN_TOKENS_OFFER_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_GET_VALUE_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_CONTROL_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_WITHDRAWN_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_TRANSFER_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_WITHDRAW_TOKEN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_COPY_BOOLEAN_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_EQUALS_BOOLEAN_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_NEW_BOOLEAN_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_COPY_COMPOUND_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_GET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_SET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EVALUATION_EVALUATE_EVALUATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_COPY_EXTENSIONAL_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_DESTROY_EXTENSIONAL_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_FEATURE_VALUE_COPY_FEATURE_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_COPY_INTEGER_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_EQUALS_INTEGER_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_NEW_INTEGER_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_BOOLEAN_EVALUATION_EVALUATE_LITERAL_BOOLEAN_EVALUATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_EVALUATION_GET_TYPE_LITERAL_EVALUATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_INTEGER_EVALUATION_EVALUATE_LITERAL_INTEGER_EVALUATION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Object Copy Object Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_COPY_OBJECT_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Object Destroy Object Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_DESTROY_OBJECT_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Object Get Types Object Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_GET_TYPES_OBJECT_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Object New Object Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_NEW_OBJECT_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_New_Object_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_COPY_PRIMITIVE_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_GET_TYPES_PRIMITIVE_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_GET_FEATURE_VALUE_REFERENCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_SET_FEATURE_VALUE_REFERENCE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_STRUCTURED_VALUE_CREATE_FEATURE_VALUES_STRUCTURED_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Value Copy Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_COPY_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Value Equals Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_EQUALS_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Value Get Types Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_GET_TYPES_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Value Has Type Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_HAS_TYPE_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Classes Kernel Value New Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_NEW_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_New_Value_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_COPY_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_EXECUTE_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_OUTPUT_PARAMETER_VALUES_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_PARAMETER_VALUE_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_TERMINATE_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_DO_BODY_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_EXECUTE_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_PARAMETER_VALUE_COPY_PARAMETER_VALUE_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EVALUATION_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EXECUTION_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_GET_BUILT_IN_TYPE_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_VISITOR_EXECUTION_FACTORY_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Executor Evaluate Executor Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EVALUATE_EXECUTOR_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Executor Execute Executor Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EXECUTE_EXECUTOR_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_Executor_Execute_Executor_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Locus Add Locus Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_ADD_LOCUS_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_Locus_Add_Locus_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Locus Instantiate Locus Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_INSTANTIATE_LOCUS_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Locus Remove Locus Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_REMOVE_LOCUS_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_Locus_Remove_Locus_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_SEMANTIC_VISITOR_INITIALIZE_SEMANTIC_VISITOR_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Model Configuration Main Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_MODEL_CONFIGURATION_MAIN_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_ModelConfiguration_Main_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = eINSTANCE.getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence();

		/**
		 * The meta object literal for the '<em><b>Basic Actions traced Call Behavior Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_CALL_BEHAVIOR_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_BasicActions_tracedCallBehaviorActionActivations();

		/**
		 * The meta object literal for the '<em><b>Basic Actions traced Input Pin Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_INPUT_PIN_ACTIVATIONS = eINSTANCE.getSpecificTrace_BasicActions_tracedInputPinActivations();

		/**
		 * The meta object literal for the '<em><b>Basic Actions traced Opaque Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OPAQUE_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_BasicActions_tracedOpaqueActionActivations();

		/**
		 * The meta object literal for the '<em><b>Basic Actions traced Output Pin Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OUTPUT_PIN_ACTIVATIONS = eINSTANCE.getSpecificTrace_BasicActions_tracedOutputPinActivations();

		/**
		 * The meta object literal for the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES = eINSTANCE.getSpecificTrace_BasicBehaviors_tracedParameterValues();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Abstraction Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ABSTRACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAbstractionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Accept Call Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACCEPT_CALL_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAcceptCallActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Accept Event Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACCEPT_EVENT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAcceptEventActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Action Execution Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActionExecutionSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Action Input Pin Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTION_INPUT_PIN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActionInputPinConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Content Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_CONTENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityContentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Edge Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_EDGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityEdgeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Final Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_FINAL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityFinalNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Group Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_GROUP_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityGroupConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Parameter Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityParameterNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Activity Partition Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTIVITY_PARTITION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActivityPartitionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Actor Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ACTOR_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedActorConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Add Structural Feature Value Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Add Variable Value Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAddVariableValueActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Any Receive Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ANY_RECEIVE_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAnyReceiveEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Artifact Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ARTIFACT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedArtifactConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Association Class Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ASSOCIATION_CLASS_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAssociationClassConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Association Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ASSOCIATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedAssociationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Behavior Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIOR_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedBehaviorConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Behavior Execution Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Behavioral Feature Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIORAL_FEATURE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedBehavioralFeatureConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Behaviored Classifier Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedBehavioredClassifierConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Broadcast Signal Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedBroadcastSignalActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Call Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCallActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Call Behavior Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCallBehaviorActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Call Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCallEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Call Operation Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CALL_OPERATION_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCallOperationActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Central Buffer Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CENTRAL_BUFFER_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCentralBufferNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Change Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CHANGE_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedChangeEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Class Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASS_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClassConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Classifier Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASSIFIER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClassifierConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Classifier Template Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClassifierTemplateParameterConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Clause Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLAUSE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClauseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Clear Association Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClearAssociationActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Clear Structural Feature Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClearStructuralFeatureActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Clear Variable Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedClearVariableActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Collaboration Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COLLABORATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCollaborationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Collaboration Use Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COLLABORATION_USE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCollaborationUseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Combined Fragment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMBINED_FRAGMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCombinedFragmentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Comment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCommentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Communication Path Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMMUNICATION_PATH_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCommunicationPathConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Component Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMPONENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedComponentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Component Realization Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_COMPONENT_REALIZATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedComponentRealizationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Conditional Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONDITIONAL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConditionalNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Connectable Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTABLE_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConnectableElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Connectable Element Template Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConnectableElementTemplateParameterConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Connection Point Reference Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConnectionPointReferenceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Connector Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTOR_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConnectorConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Connector End Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONNECTOR_END_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConnectorEndConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Consider Ignore Fragment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConsiderIgnoreFragmentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Constraint Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONSTRAINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedConstraintConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Continuation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTINUATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedContinuationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Control Flow Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTROL_FLOW_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedControlFlowConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Control Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CONTROL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedControlNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Create Link Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_LINK_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCreateLinkActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Create Link Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCreateLinkObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Create Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_CREATE_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedCreateObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Data Store Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DATA_STORE_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDataStoreNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Data Type Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DATA_TYPE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDataTypeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Decision Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DECISION_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDecisionNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Dependency Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPENDENCY_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDependencyConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Deployed Artifact Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYED_ARTIFACT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDeployedArtifactConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Deployment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDeploymentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Deployment Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDeploymentSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Deployment Target Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEPLOYMENT_TARGET_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDeploymentTargetConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Destroy Link Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTROY_LINK_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDestroyLinkActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Destroy Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTROY_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDestroyObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Destruction Occurrence Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Device Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DEVICE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDeviceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Directed Relationship Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DIRECTED_RELATIONSHIP_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDirectedRelationshipConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Duration Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDurationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Duration Constraint Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_CONSTRAINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDurationConstraintConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Duration Interval Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_INTERVAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDurationIntervalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Duration Observation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_DURATION_OBSERVATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedDurationObservationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Element Import Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_IMPORT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedElementImportConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Encapsulated Classifier Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedEncapsulatedClassifierConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Enumeration Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENUMERATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedEnumerationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Enumeration Literal Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ENUMERATION_LITERAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedEnumerationLiteralConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Exception Handler Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXCEPTION_HANDLER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExceptionHandlerConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Executable Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTABLE_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExecutableNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Execution Environment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_ENVIRONMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExecutionEnvironmentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Execution Occurrence Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Execution Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXECUTION_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExecutionSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Expansion Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPANSION_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExpansionNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Expansion Region Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPANSION_REGION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExpansionRegionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Expression Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXPRESSION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExpressionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Extend Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTEND_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExtendConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Extension Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExtensionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Extension End Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_END_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExtensionEndConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Extension Point Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_EXTENSION_POINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedExtensionPointConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Feature Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FEATURE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedFeatureConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Final Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FINAL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedFinalNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Final State Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FINAL_STATE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedFinalStateConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Flow Final Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FLOW_FINAL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedFlowFinalNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Fork Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FORK_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedForkNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Function Behavior Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_FUNCTION_BEHAVIOR_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedFunctionBehaviorConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Gate Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GATE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedGateConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced General Ordering Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERAL_ORDERING_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedGeneralOrderingConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Generalization Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERALIZATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedGeneralizationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Generalization Set Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_GENERALIZATION_SET_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedGeneralizationSetConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Image Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_IMAGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedImageConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Include Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INCLUDE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedIncludeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Information Flow Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INFORMATION_FLOW_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInformationFlowConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Information Item Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INFORMATION_ITEM_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInformationItemConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Initial Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INITIAL_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInitialNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Input Pin Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INPUT_PIN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInputPinConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Instance Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INSTANCE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInstanceSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Instance Value Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INSTANCE_VALUE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInstanceValueConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interaction Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInteractionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interaction Constraint Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_CONSTRAINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInteractionConstraintConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interaction Fragment Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_FRAGMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInteractionFragmentConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interaction Operand Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_OPERAND_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInteractionOperandConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interaction Use Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERACTION_USE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInteractionUseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interface Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERFACE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInterfaceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interface Realization Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERFACE_REALIZATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInterfaceRealizationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interruptible Activity Region Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInterruptibleActivityRegionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interval Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERVAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedIntervalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Interval Constraint Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INTERVAL_CONSTRAINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedIntervalConstraintConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Invocation Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_INVOCATION_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedInvocationActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Join Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_JOIN_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedJoinNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Lifeline Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LIFELINE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLifelineConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Link Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLinkActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Link End Creation Data Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_CREATION_DATA_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLinkEndCreationDataConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Link End Data Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_DATA_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLinkEndDataConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Link End Destruction Data Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLinkEndDestructionDataConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Boolean Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_BOOLEAN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralBooleanConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Integer Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_INTEGER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralIntegerConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Null Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_NULL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralNullConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Real Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_REAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralRealConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal String Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_STRING_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralStringConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Literal Unlimited Natural Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Loop Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_LOOP_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedLoopNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Manifestation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MANIFESTATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedManifestationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Merge Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MERGE_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMergeNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Message Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMessageConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Message End Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_END_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMessageEndConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Message Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMessageEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Message Occurrence Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Model Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MODEL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedModelConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Multiplicity Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_MULTIPLICITY_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedMultiplicityElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Named Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NAMED_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedNamedElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Namespace Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NAMESPACE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedNamespaceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Object Flow Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBJECT_FLOW_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedObjectFlowConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Object Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBJECT_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedObjectNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Observation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OBSERVATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedObservationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Occurrence Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOccurrenceSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Opaque Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOpaqueActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Opaque Behavior Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_BEHAVIOR_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOpaqueBehaviorConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Opaque Expression Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPAQUE_EXPRESSION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOpaqueExpressionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Operation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPERATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOperationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Operation Template Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOperationTemplateParameterConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Output Pin Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_OUTPUT_PIN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedOutputPinConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Package Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPackageConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Package Import Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_IMPORT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPackageImportConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Package Merge Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGE_MERGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPackageMergeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Packageable Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PACKAGEABLE_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPackageableElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedParameterConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Parameter Set Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETER_SET_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedParameterSetConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Parameterable Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PARAMETERABLE_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedParameterableElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Part Decomposition Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PART_DECOMPOSITION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPartDecompositionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Pin Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PIN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPinConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Port Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PORT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPortConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Primitive Type Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PRIMITIVE_TYPE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPrimitiveTypeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Profile Application Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROFILE_APPLICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedProfileApplicationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Profile Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROFILE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedProfileConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Property Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROPERTY_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPropertyConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Protocol Conformance Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_CONFORMANCE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedProtocolConformanceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Protocol State Machine Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedProtocolStateMachineConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Protocol Transition Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PROTOCOL_TRANSITION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedProtocolTransitionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Pseudostate Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_PSEUDOSTATE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedPseudostateConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Qualifier Value Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_QUALIFIER_VALUE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedQualifierValueConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Raise Exception Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRaiseExceptionActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Extent Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_EXTENT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadExtentActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Is Classified Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Link Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadLinkActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Link Object End Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Link Object End Qualifier Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Self Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_SELF_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadSelfActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Structural Feature Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadStructuralFeatureActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Read Variable Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_READ_VARIABLE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReadVariableActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Realization Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REALIZATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRealizationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Reception Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RECEPTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReceptionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Reclassify Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReclassifyObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Redefinable Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDEFINABLE_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRedefinableElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Redefinable Template Signature Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRedefinableTemplateSignatureConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Reduce Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REDUCE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReduceActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Region Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REGION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRegionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Relationship Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_RELATIONSHIP_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRelationshipConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Remove Structural Feature Value Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Remove Variable Value Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedRemoveVariableValueActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Reply Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_REPLY_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedReplyActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Send Object Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEND_OBJECT_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSendObjectActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Send Signal Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEND_SIGNAL_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSendSignalActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Sequence Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SEQUENCE_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSequenceNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Signal Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SIGNAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSignalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Signal Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SIGNAL_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSignalEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Slot Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SLOT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSlotConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Start Classifier Behavior Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStartClassifierBehaviorActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Start Object Behavior Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStartObjectBehaviorActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced State Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStateConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced State Invariant Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_INVARIANT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStateInvariantConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced State Machine Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STATE_MACHINE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStateMachineConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Stereotype Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STEREOTYPE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStereotypeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced String Expression Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRING_EXPRESSION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStringExpressionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Structural Feature Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStructuralFeatureActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Structural Feature Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURAL_FEATURE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStructuralFeatureConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Structured Activity Node Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStructuredActivityNodeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Structured Classifier Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_STRUCTURED_CLASSIFIER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedStructuredClassifierConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Substitution Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_SUBSTITUTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedSubstitutionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Template Binding Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_BINDING_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTemplateBindingConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Template Parameter Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_PARAMETER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTemplateParameterConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Template Parameter Substitution Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTemplateParameterSubstitutionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Template Signature Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATE_SIGNATURE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTemplateSignatureConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Templateable Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTemplateableElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Test Identity Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TEST_IDENTITY_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTestIdentityActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Time Constraint Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_CONSTRAINT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTimeConstraintConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Time Event Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_EVENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTimeEventConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Time Expression Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_EXPRESSION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTimeExpressionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Time Interval Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_INTERVAL_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTimeIntervalConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Time Observation Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TIME_OBSERVATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTimeObservationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Transition Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TRANSITION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTransitionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Trigger Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TRIGGER_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTriggerConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Type Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TYPE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTypeConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Typed Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_TYPED_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedTypedElementConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Unmarshall Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_UNMARSHALL_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedUnmarshallActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Usage Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_USAGE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedUsageConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Use Case Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_USE_CASE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedUseCaseConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Value Pin Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_PIN_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedValuePinConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Value Specification Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedValueSpecificationActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Value Specification Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VALUE_SPECIFICATION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedValueSpecificationConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Variable Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VARIABLE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedVariableActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Variable Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VARIABLE_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedVariableConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Vertex Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_VERTEX_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedVertexConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Write Link Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_LINK_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedWriteLinkActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Write Structural Feature Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedWriteStructuralFeatureActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Fuml Configuration traced Write Variable Action Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_WRITE_VARIABLE_ACTION_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedWriteVariableActionConfigurations();

		/**
		 * The meta object literal for the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS = eINSTANCE.getSpecificTrace_Input_tracedInputParameterValuess();

		/**
		 * The meta object literal for the '<em><b>Integer Functions traced Integer Greater Function Behavior Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTIONS = eINSTANCE.getSpecificTrace_IntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions();

		/**
		 * The meta object literal for the '<em><b>Integer Functions traced Integer Less Function Behavior Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTIONS = eINSTANCE.getSpecificTrace_IntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions();

		/**
		 * The meta object literal for the '<em><b>Integer Functions traced Integer Plus Function Behavior Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTIONS = eINSTANCE.getSpecificTrace_IntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions();

		/**
		 * The meta object literal for the '<em><b>Intermediate Actions traced Add Structural Feature Value Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActions_tracedAddStructuralFeatureValueActionActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Actions traced Create Object Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_CREATE_OBJECT_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActions_tracedCreateObjectActionActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Actions traced Read Structural Feature Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActions_tracedReadStructuralFeatureActionActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Actions traced Value Specification Action Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_VALUE_SPECIFICATION_ACTION_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActions_tracedValueSpecificationActionActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityExecutions();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Final Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityFinalNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Activity Parameter Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedActivityParameterNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Control Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_CONTROL_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedControlTokens();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Decision Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_DECISION_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedDecisionNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Fork Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORK_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedForkNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedForkedTokens();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Initial Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_INITIAL_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedInitialNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Join Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_JOIN_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedJoinNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Merge Node Activations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_MERGE_NODE_ACTIVATIONS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedMergeNodeActivations();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedObjectTokens();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedOffers();

		/**
		 * The meta object literal for the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS = eINSTANCE.getSpecificTrace_IntermediateActivities_tracedTokens();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES = eINSTANCE.getSpecificTrace_Kernel_tracedBooleanValues();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES = eINSTANCE.getSpecificTrace_Kernel_tracedIntegerValues();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Literal Boolean Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_BOOLEAN_EVALUATIONS = eINSTANCE.getSpecificTrace_Kernel_tracedLiteralBooleanEvaluations();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Literal Integer Evaluations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_INTEGER_EVALUATIONS = eINSTANCE.getSpecificTrace_Kernel_tracedLiteralIntegerEvaluations();

		/**
		 * The meta object literal for the '<em><b>Kernel traced Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS = eINSTANCE.getSpecificTrace_Kernel_tracedObjects();

		/**
		 * The meta object literal for the '<em><b>Kernel traced References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES = eINSTANCE.getSpecificTrace_Kernel_tracedReferences();

		/**
		 * The meta object literal for the '<em><b>Loci traced Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS = eINSTANCE.getSpecificTrace_Loci_tracedExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS = eINSTANCE.getSpecificTrace_Loci_tracedExecutionFactorys();

		/**
		 * The meta object literal for the '<em><b>Loci traced Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS = eINSTANCE.getSpecificTrace_Loci_tracedExecutors();

		/**
		 * The meta object literal for the '<em><b>Loci traced Locuss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_LOCUSS = eINSTANCE.getSpecificTrace_Loci_tracedLocuss();

		/**
		 * The meta object literal for the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS = eINSTANCE.getSpecificTrace_Loci_tracedSemanticVisitors();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //FumlConfigurationTracePackage
