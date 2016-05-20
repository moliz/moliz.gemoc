/**
 */
package umlTrace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.executionframework.engine.mse.MsePackage;

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
 * @see umlTrace.UmlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface UmlTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "umlTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "umlTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "umlTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlTracePackage eINSTANCE = umlTrace.impl.UmlTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link umlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see umlTrace.impl.SpecificTraceImpl
	 * @see umlTrace.impl.UmlTracePackageImpl#getSpecificTrace()
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
	int SPECIFIC_TRACE__ROOT_STEP = MsePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = MsePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_DO_ACTION_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_GET_PIN_ACTIVATION_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_HAS_OFFERS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_INISITALIZE_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_IS_READY_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKEN_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_PUT_TOKENS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SEND_OFFERS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TAKE_TOKENS_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_ACTION_ACTIVATION_TERMINATE_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_COLLECT_OUTPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_DO_ACTION_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_INITIALIZE_INPUT_PARAMETER_VALUES_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_REMOVE_CALL_EXECUTION_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_ACTION_ACTIVATION_TERMINATE_CALL_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_CALL_BEHAVIOR_ACTION_ACTIVATION_GET_CALL_EXECUTION_CALL_BEHAVIOR_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_IS_READY_INPUT_PIN_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_INPUT_PIN_ACTIVATION_RECEIVE_OFFER_INPUT_PIN_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_OPAQUE_ACTION_ACTIVATION_DO_ACTION_OPAQUE_ACTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_BASIC_ACTIONS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_DO_ACTION_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_CREATE_OBJECT_ACTION_ACTIVATION_DO_ACTION_CREATE_OBJECT_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_DO_ACTION_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIONS_INTERMEDIATE_ACTIONS_VALUE_SPECIFICATION_ACTION_ACTIVATION_DO_ACTION_VALUE_SPECIFICATION_ACTION_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_COUNT_OFFERED_VALUES_ACTIVITY_EDGE_INSTANCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_HAS_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_SEND_OFFER_ACTIVITY_EDGE_INSTANCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_COLLECT_OUTPUT_PARAMETER_VALUES_ACTIVITY_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_EXECUTE_ACTIVITY_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_SET_PARAMETER_VALUE_VALUES_ACTIVITY_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_EXECUTION_TERMINATE_ACTIVITY_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_ACTIVATE_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CHECK_INCOMING_EDGES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_INITIALLY_ENABLED_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_OUTPUT_PARAMETER_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_GET_SOURCE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_NODES_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_RUN_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GROUP_TERMINATE_ALL_ACTIVITY_NODE_ACTIVATION_GROUP_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_ADD_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_EDGE_INSTANCES_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_CREATE_NODE_ACTIVATIONS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_ACTIVITY_EXECUTION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_CONTEXT_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_EXECUTION_LOCUS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_NODE_ACTIVATION_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_GET_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_HAS_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_INITIALIZE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_READY_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_RUNNING_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_IS_SOURCE_FOR_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RECEIVE_OFFER_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_REMOVE_TOKEN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_RUN_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_SEND_OFFERS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_NODE_ACTIVATION_TERMINATE_ACTIVITY_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_CLEAR_TOKENS_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_CONTROL_TOKEN_IS_CONTROL_CONTROL_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_DETERMINE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_EXECUTE_DECISION_INPUT_BEHAVIOR_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_INSTANCE_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_INPUT_FLOW_VALUE_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_GET_DECISION_VALUES_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_HAS_OBJECT_FLOW_INPUT_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 85;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_IS_READY_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 86;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_REMOVE_JOINED_CONTROL_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 87;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 88;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_DECISION_NODE_ACTIVATION_TEST_DECISION_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 89;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 90;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_GET_VALUE_FORKED_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 91;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_INITIALIZE_FORKED_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 92;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_IS_CONTROL_FORKED_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 93;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_FORKED_TOKEN_WITHDRAW_FORKED_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 94;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 95;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_JOIN_NODE_ACTIVATION_IS_READY_JOIN_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 96;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_ADD_TOKEN_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 97;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_CLEAR_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 98;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_OFFERED_VALUES_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 99;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_COUNT_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 100;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_GET_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 101;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_INITIALIZE_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 102;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_OFFERS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 103;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_SEND_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 104;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TAKE_UNOFFERED_TOKENS_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 105;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_NODE_ACTIVATION_TERMINATE_OBJECT_NODE_ACTIVATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 106;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_GET_VALUE_OBJECT_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 107;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OBJECT_TOKEN_IS_CONTROL_OBJECT_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 108;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_COUNT_OFFERED_VALUES_OFFER_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 109;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_GET_OFFERED_TOKENS_OFFER_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 110;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_HAS_TOKENS_OFFER_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 111;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_OFFER_REMOVE_WITHDRAWN_TOKENS_OFFER_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 112;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_GET_VALUE_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 113;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_CONTROL_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 114;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_IS_WITHDRAWN_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 115;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_TRANSFER_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 116;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_ACTIVITIES_INTERMEDIATE_ACTIVITIES_TOKEN_WITHDRAW_TOKEN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 117;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_COPY_BOOLEAN_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 118;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_EQUALS_BOOLEAN_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 119;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_BOOLEAN_VALUE_NEW_BOOLEAN_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 120;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_COPY_COMPOUND_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 121;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_GET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 122;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_COMPOUND_VALUE_SET_FEATURE_VALUE_COMPOUND_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 123;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EVALUATION_EVALUATE_EVALUATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 124;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_COPY_EXTENSIONAL_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 125;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_EXTENSIONAL_VALUE_DESTROY_EXTENSIONAL_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 126;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_FEATURE_VALUE_COPY_FEATURE_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 127;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_COPY_INTEGER_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 128;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_EQUALS_INTEGER_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 129;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_INTEGER_VALUE_NEW_INTEGER_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 130;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_BOOLEAN_EVALUATION_EVALUATE_LITERAL_BOOLEAN_EVALUATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 131;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_EVALUATION_GET_TYPE_LITERAL_EVALUATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 132;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_LITERAL_INTEGER_EVALUATION_EVALUATE_LITERAL_INTEGER_EVALUATION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 133;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Copy Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_COPY_OBJECT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 134;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Destroy Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_DESTROY_OBJECT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 135;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object Get Types Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_GET_TYPES_OBJECT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 136;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Object New Object Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_OBJECT_NEW_OBJECT_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 137;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_COPY_PRIMITIVE_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 138;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_PRIMITIVE_VALUE_GET_TYPES_PRIMITIVE_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 139;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_GET_FEATURE_VALUE_REFERENCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 140;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_REFERENCE_SET_FEATURE_VALUE_REFERENCE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 141;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_STRUCTURED_VALUE_CREATE_FEATURE_VALUES_STRUCTURED_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 142;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Copy Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_COPY_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 143;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Equals Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_EQUALS_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 144;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Get Types Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_GET_TYPES_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 145;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value Has Type Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_HAS_TYPE_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 146;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Classes Kernel Value New Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_CLASSES_KERNEL_VALUE_NEW_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 147;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_COPY_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 148;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_EXECUTE_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 149;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 150;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_OUTPUT_PARAMETER_VALUES_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 151;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_GET_PARAMETER_VALUE_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 152;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_SET_PARAMETER_VALUE_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 153;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_EXECUTION_TERMINATE_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 154;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_DO_BODY_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 155;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_OPAQUE_BEHAVIOR_EXECUTION_EXECUTE_OPAQUE_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 156;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_COMMON_BEHAVIORS_BASIC_BEHAVIORS_PARAMETER_VALUE_COPY_PARAMETER_VALUE_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 157;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EVALUATION_EXECUTION_FACTORY_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 158;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_CREATE_EXECUTION_EXECUTION_FACTORY_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 159;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_GET_BUILT_IN_TYPE_EXECUTION_FACTORY_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 160;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION_EXECUTION_FACTORY_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 161;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTION_FACTORY_INSTANTIATE_VISITOR_EXECUTION_FACTORY_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 162;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Executor Evaluate Executor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EVALUATE_EXECUTOR_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 163;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Executor Execute Executor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_EXECUTOR_EXECUTE_EXECUTOR_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 164;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Add Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_ADD_LOCUS_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 165;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Instantiate Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_INSTANTIATE_LOCUS_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 166;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Locus Remove Locus Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_LOCUS_REMOVE_LOCUS_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 167;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_LOCI_SEMANTIC_VISITOR_INITIALIZE_SEMANTIC_VISITOR_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 168;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Model Configuration Main Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_MODEL_CONFIGURATION_MAIN_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 169;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 170;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 171;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 172;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 173;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_DO_BODY_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 174;

	/**
	 * The feature id for the '<em><b>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_PRIMITIVE_BEHAVIORS_INTEGER_FUNCTIONS_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_NEW_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTION_SEQUENCE = MsePackage.TRACE_FEATURE_COUNT + 175;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Call Behavior Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_CALL_BEHAVIOR_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 176;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Input Pin Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_INPUT_PIN_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 177;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Opaque Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OPAQUE_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 178;

	/**
	 * The feature id for the '<em><b>Basic Actions traced Output Pin Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_ACTIONS_TRACED_OUTPUT_PIN_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 179;

	/**
	 * The feature id for the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES = MsePackage.TRACE_FEATURE_COUNT + 180;

	/**
	 * The feature id for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = MsePackage.TRACE_FEATURE_COUNT + 181;

	/**
	 * The feature id for the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS = MsePackage.TRACE_FEATURE_COUNT + 182;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Greater Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_GREATER_FUNCTION_BEHAVIOR_EXECUTIONS = MsePackage.TRACE_FEATURE_COUNT + 183;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Less Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_LESS_FUNCTION_BEHAVIOR_EXECUTIONS = MsePackage.TRACE_FEATURE_COUNT + 184;

	/**
	 * The feature id for the '<em><b>Integer Functions traced Integer Plus Function Behavior Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTEGER_FUNCTIONS_TRACED_INTEGER_PLUS_FUNCTION_BEHAVIOR_EXECUTIONS = MsePackage.TRACE_FEATURE_COUNT + 185;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Add Structural Feature Value Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 186;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Create Object Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_CREATE_OBJECT_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 187;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Read Structural Feature Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_READ_STRUCTURAL_FEATURE_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 188;

	/**
	 * The feature id for the '<em><b>Intermediate Actions traced Value Specification Action Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIONS_TRACED_VALUE_SPECIFICATION_ACTION_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 189;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES = MsePackage.TRACE_FEATURE_COUNT + 190;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS = MsePackage.TRACE_FEATURE_COUNT + 191;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Final Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 192;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS = MsePackage.TRACE_FEATURE_COUNT + 193;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 194;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Activity Parameter Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 195;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Control Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_CONTROL_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 196;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Decision Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_DECISION_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 197;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Fork Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORK_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 198;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 199;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Initial Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_INITIAL_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 200;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Join Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_JOIN_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 201;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Merge Node Activations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_MERGE_NODE_ACTIVATIONS = MsePackage.TRACE_FEATURE_COUNT + 202;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 203;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS = MsePackage.TRACE_FEATURE_COUNT + 204;

	/**
	 * The feature id for the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS = MsePackage.TRACE_FEATURE_COUNT + 205;

	/**
	 * The feature id for the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES = MsePackage.TRACE_FEATURE_COUNT + 206;

	/**
	 * The feature id for the '<em><b>Kernel traced Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES = MsePackage.TRACE_FEATURE_COUNT + 207;

	/**
	 * The feature id for the '<em><b>Kernel traced Literal Boolean Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_BOOLEAN_EVALUATIONS = MsePackage.TRACE_FEATURE_COUNT + 208;

	/**
	 * The feature id for the '<em><b>Kernel traced Literal Integer Evaluations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_LITERAL_INTEGER_EVALUATIONS = MsePackage.TRACE_FEATURE_COUNT + 209;

	/**
	 * The feature id for the '<em><b>Kernel traced Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS = MsePackage.TRACE_FEATURE_COUNT + 210;

	/**
	 * The feature id for the '<em><b>Kernel traced References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES = MsePackage.TRACE_FEATURE_COUNT + 211;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS = MsePackage.TRACE_FEATURE_COUNT + 212;

	/**
	 * The feature id for the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS = MsePackage.TRACE_FEATURE_COUNT + 213;

	/**
	 * The feature id for the '<em><b>Loci traced Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS = MsePackage.TRACE_FEATURE_COUNT + 214;

	/**
	 * The feature id for the '<em><b>Loci traced Locuss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_LOCUSS = MsePackage.TRACE_FEATURE_COUNT + 215;

	/**
	 * The feature id for the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS = MsePackage.TRACE_FEATURE_COUNT + 216;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = MsePackage.TRACE_FEATURE_COUNT + 217;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = MsePackage.TRACE_FEATURE_COUNT + 218;

	/**
	 * The number of operations of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_OPERATION_COUNT = MsePackage.TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link umlTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see umlTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Create Node Activations Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_CreateNodeActivations_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Do Action Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_DoAction_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Fire Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Fire_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Get Pin Activation Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_GetPinActivation_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Has Offers Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_HasOffers_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Inisitalize Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Inisitalize_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Is Ready Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_IsReady_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Put Token Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutToken_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Put Tokens Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_PutTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Send Offers Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_SendOffers_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Should Fire Again Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_ShouldFireAgain_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Take Offered Tokens Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Take Tokens Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_TakeTokens_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Action Activation Terminate Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_ActionActivation_Terminate_ActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Collect Output Parameter Values Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_CollectOutputParameterValues_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Do Action Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_DoAction_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Get Call Execution Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_GetCallExecution_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Initialize Input Parameter Values Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_InitializeInputParameterValues_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Remove Call Execution Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_RemoveCallExecution_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Action Activation Terminate Call Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallActionActivation_Terminate_CallActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence <em>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Call Behavior Action Activation Get Call Execution Call Behavior Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_CallBehaviorActionActivation_GetCallExecution_CallBehaviorActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Input Pin Activation Is Ready Input Pin Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_IsReady_InputPinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Input Pin Activation Receive Offer Input Pin Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_InputPinActivation_ReceiveOffer_InputPinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence <em>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Opaque Action Activation Do Action Opaque Action Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_OpaqueActionActivation_DoAction_OpaqueAction_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Pin Activation Fire Pin Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_Fire_PinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence <em>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Basic Actions Pin Activation Take Offered Tokens Pin Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_BasicActions_PinActivation_TakeOfferedTokens_PinActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Add Structural Feature Value Action Activation Do Action Add Structural Feature Value Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_AddStructuralFeatureValueActionActivation_DoAction_AddStructuralFeatureValueActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Create Object Action Activation Do Action Create Object Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_CreateObjectActionActivation_DoAction_CreateObjectActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Read Structural Feature Action Activation Do Action Read Structural Feature Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ReadStructuralFeatureActionActivation_DoAction_ReadStructuralFeatureActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence <em>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Actions Intermediate Actions Value Specification Action Activation Do Action Value Specification Action Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Actions_IntermediateActions_ValueSpecificationActionActivation_DoAction_ValueSpecificationActionActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Count Offered Values Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_CountOfferedValues_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Has Offer Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_HasOffer_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Send Offer Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_SendOffer_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Collect Output Parameter Values Activity Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_CollectOutputParameterValues_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Execute Activity Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Execute_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Set Parameter Value Values Activity Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_SetParameterValueValues_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Execution Terminate Activity Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityExecution_Terminate_ActivityExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Activate Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Activate_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Check Incoming Edges Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CheckIncomingEdges_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Edge Instances Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateEdgeInstances_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activation Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivation_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Create Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_CreateNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Activity Execution Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetActivityExecution_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Initially Enabled Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetInitiallyEnabledNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Node Activation Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetNodeActivation_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Output Parameter Node Activations Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetOutputParameterNodeActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Get Source Activations Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_GetSourceActivations_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Nodes Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_RunNodes_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Run Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_Run_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Group Terminate All Activity Node Activation Group Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivationGroup_TerminateAll_ActivityNodeActivationGroup_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Token Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddToken_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Add Tokens Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_AddTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Clear Tokens Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ClearTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Edge Instances Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateEdgeInstances_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Create Node Activations Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_CreateNodeActivations_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Fire Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Activity Execution Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetActivityExecution_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Context Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionContext_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Execution Locus Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetExecutionLocus_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Node Activation Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetNodeActivation_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Get Tokens Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_GetTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Has Offers Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_HasOffers_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Initialize Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Initialize_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Ready Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsReady_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Running Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsRunning_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Is Source For Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_IsSourceFor_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Receive Offer Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_ReceiveOffer_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Remove Token Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_RemoveToken_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Run Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Run_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Send Offers Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_SendOffers_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Node Activation Terminate Activity Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityNodeActivation_Terminate_ActivityNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Clear Tokens Activity Parameter Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_ClearTokens_ActivityParameterNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Control Node Activation Fire Control Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlNodeActivation_Fire_ControlNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Control Token Is Control Control Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ControlToken_IsControl_ControlToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Determine Offered Tokens Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_DetermineOfferedTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Execute Decision Input Behavior Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_ExecuteDecisionInputBehavior_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Fire Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Instance Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowInstance_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Input Flow Value Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionInputFlowValue_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Get Decision Values Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_GetDecisionValues_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Has Object Flow Input Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_HasObjectFlowInput_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Is Ready Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_IsReady_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Remove Joined Control Tokens Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_RemoveJoinedControlTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Decision Node Activation Test Decision Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_DecisionNodeActivation_Test_DecisionNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Fork Node Activation Fire Fork Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkNodeActivation_Fire_ForkNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Get Value Forked Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_GetValue_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Initialize Forked Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Initialize_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Is Control Forked Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_IsControl_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Forked Token Withdraw Forked Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ForkedToken_Withdraw_ForkedToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Initial Node Activation Fire Initial Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_InitialNodeActivation_Fire_InitialNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Join Node Activation Is Ready Join Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_JoinNodeActivation_IsReady_JoinNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Add Token Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_AddToken_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Clear Tokens Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_ClearTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Offered Values Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountOfferedValues_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Count Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_CountUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Get Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_GetUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Initialize Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Initialize_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Offers Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendOffers_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Send Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_SendUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Take Unoffered Tokens Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_TakeUnofferedTokens_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Node Activation Terminate Object Node Activation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectNodeActivation_Terminate_ObjectNodeActivation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Token Get Value Object Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_GetValue_ObjectToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence <em>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Object Token Is Control Object Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_ObjectToken_IsControl_ObjectToken_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Count Offered Values Offer Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_CountOfferedValues_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Get Offered Tokens Offer Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_GetOfferedTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Has Tokens Offer Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_HasTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence <em>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Offer Remove Withdrawn Tokens Offer Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Offer_RemoveWithdrawnTokens_Offer_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Get Value Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_GetValue_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Is Control Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsControl_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Is Withdrawn Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_IsWithdrawn_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Transfer Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Transfer_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence <em>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Activities Intermediate Activities Token Withdraw Token Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Activities_IntermediateActivities_Token_Withdraw_Token_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value Copy Boolean Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Copy_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value Equals Boolean Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_Equals_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence <em>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Boolean Value New Boolean Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_BooleanValue_New_BooleanValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Copy Compound Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_Copy_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Get Feature Value Compound Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_GetFeatureValue_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence <em>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Compound Value Set Feature Value Compound Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_CompoundValue_SetFeatureValue_CompoundValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence <em>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Evaluation Evaluate Evaluation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Evaluation_Evaluate_Evaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence <em>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Extensional Value Copy Extensional Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Copy_ExtensionalValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence <em>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Extensional Value Destroy Extensional Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_ExtensionalValue_Destroy_ExtensionalValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence <em>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Feature Value Copy Feature Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_FeatureValue_Copy_FeatureValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value Copy Integer Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Copy_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value Equals Integer Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_Equals_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence <em>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Integer Value New Integer Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_IntegerValue_New_IntegerValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Boolean Evaluation Evaluate Literal Boolean Evaluation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralBooleanEvaluation_Evaluate_LiteralBooleanEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Evaluation Get Type Literal Evaluation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralEvaluation_GetType_LiteralEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence <em>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Literal Integer Evaluation Evaluate Literal Integer Evaluation Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_LiteralIntegerEvaluation_Evaluate_LiteralIntegerEvaluation_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence <em>Fuml Configuration Classes Kernel Object Copy Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Copy Object Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Copy_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence <em>Fuml Configuration Classes Kernel Object Destroy Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Destroy Object Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_Destroy_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence <em>Fuml Configuration Classes Kernel Object Get Types Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object Get Types Object Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_GetTypes_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_New_Object_Sequence <em>Fuml Configuration Classes Kernel Object New Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Object New Object Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Object_New_Object_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Object_New_Object_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence <em>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Primitive Value Copy Primitive Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_Copy_PrimitiveValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence <em>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Primitive Value Get Types Primitive Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_PrimitiveValue_GetTypes_PrimitiveValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence <em>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Reference Get Feature Value Reference Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_GetFeatureValue_Reference_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence <em>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Reference Set Feature Value Reference Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Reference_SetFeatureValue_Reference_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence <em>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Structured Value Create Feature Values Structured Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_StructuredValue_CreateFeatureValues_StructuredValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence <em>Fuml Configuration Classes Kernel Value Copy Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Copy Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Copy_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence <em>Fuml Configuration Classes Kernel Value Equals Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Equals Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_Equals_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence <em>Fuml Configuration Classes Kernel Value Get Types Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Get Types Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_GetTypes_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence <em>Fuml Configuration Classes Kernel Value Has Type Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value Has Type Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_HasType_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_New_Value_Sequence <em>Fuml Configuration Classes Kernel Value New Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Classes Kernel Value New Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Classes_Kernel_Value_New_Value_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Classes_Kernel_Value_New_Value_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Copy Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Copy_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Execute Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Execute_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetBehavior_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Output Parameter Values Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetOutputParameterValues_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Get Parameter Value Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_GetParameterValue_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Set Parameter Value Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_SetParameterValue_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Execution Terminate Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_Execution_Terminate_Execution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Do Body Opaque Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_DoBody_OpaqueBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Opaque Behavior Execution Execute Opaque Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_OpaqueBehaviorExecution_Execute_OpaqueBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence <em>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Common Behaviors Basic Behaviors Parameter Value Copy Parameter Value Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_CommonBehaviors_BasicBehaviors_ParameterValue_Copy_ParameterValue_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Create Evaluation Execution Factory Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateEvaluation_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Create Execution Execution Factory Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_CreateExecution_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Get Built In Type Execution Factory Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_GetBuiltInType_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Instantiate Opaque Behavior Execution Execution Factory Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateOpaqueBehaviorExecution_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence <em>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Execution Factory Instantiate Visitor Execution Factory Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence <em>Fuml Configuration Loci Executor Evaluate Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Executor Evaluate Executor Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Evaluate_Executor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Execute_Executor_Sequence <em>Fuml Configuration Loci Executor Execute Executor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Executor Execute Executor Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_Executor_Execute_Executor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Executor_Execute_Executor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Add_Locus_Sequence <em>Fuml Configuration Loci Locus Add Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Add Locus Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Add_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Add_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence <em>Fuml Configuration Loci Locus Instantiate Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Instantiate Locus Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Instantiate_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Remove_Locus_Sequence <em>Fuml Configuration Loci Locus Remove Locus Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Locus Remove Locus Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_Locus_Remove_Locus_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_Locus_Remove_Locus_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence <em>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_ModelConfiguration_Main_Sequence <em>Fuml Configuration Model Configuration Main Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Model Configuration Main Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_ModelConfiguration_Main_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_ModelConfiguration_Main_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution Do Body Integer Greater Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_DoBody_IntegerGreaterFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Greater Function Behavior Execution New Integer Greater Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerGreaterFunctionBehaviorExecution_New_IntegerGreaterFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution Do Body Integer Less Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_DoBody_IntegerLessFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Less Function Behavior Execution New Integer Less Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerLessFunctionBehaviorExecution_New_IntegerLessFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution Do Body Integer Plus Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_DoBody_IntegerPlusFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence <em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fuml Configuration Primitive Behaviors Integer Functions Integer Plus Function Behavior Execution New Integer Plus Function Behavior Execution Sequence</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_PrimitiveBehaviors_IntegerFunctions_IntegerPlusFunctionBehaviorExecution_New_IntegerPlusFunctionBehaviorExecution_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicActions_tracedCallBehaviorActionActivations <em>Basic Actions traced Call Behavior Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Call Behavior Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getBasicActions_tracedCallBehaviorActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedCallBehaviorActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicActions_tracedInputPinActivations <em>Basic Actions traced Input Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Input Pin Activations</em>'.
	 * @see umlTrace.SpecificTrace#getBasicActions_tracedInputPinActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedInputPinActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicActions_tracedOpaqueActionActivations <em>Basic Actions traced Opaque Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Opaque Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getBasicActions_tracedOpaqueActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedOpaqueActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicActions_tracedOutputPinActivations <em>Basic Actions traced Output Pin Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Actions traced Output Pin Activations</em>'.
	 * @see umlTrace.SpecificTrace#getBasicActions_tracedOutputPinActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicActions_tracedOutputPinActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues <em>Basic Behaviors traced Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Behaviors traced Parameter Values</em>'.
	 * @see umlTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_BasicBehaviors_tracedParameterValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations <em>Fuml Configuration traced Element Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuml Configuration traced Element Configurations</em>'.
	 * @see umlTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getInput_tracedInputParameterValuess <em>Input traced Input Parameter Valuess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input traced Input Parameter Valuess</em>'.
	 * @see umlTrace.SpecificTrace#getInput_tracedInputParameterValuess()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Input_tracedInputParameterValuess();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions <em>Integer Functions traced Integer Greater Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Greater Function Behavior Executions</em>'.
	 * @see umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions <em>Integer Functions traced Integer Less Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Less Function Behavior Executions</em>'.
	 * @see umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions <em>Integer Functions traced Integer Plus Function Behavior Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Functions traced Integer Plus Function Behavior Executions</em>'.
	 * @see umlTrace.SpecificTrace#getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActions_tracedAddStructuralFeatureValueActionActivations <em>Intermediate Actions traced Add Structural Feature Value Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Add Structural Feature Value Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActions_tracedAddStructuralFeatureValueActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedAddStructuralFeatureValueActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActions_tracedCreateObjectActionActivations <em>Intermediate Actions traced Create Object Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Create Object Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActions_tracedCreateObjectActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedCreateObjectActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActions_tracedReadStructuralFeatureActionActivations <em>Intermediate Actions traced Read Structural Feature Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Read Structural Feature Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActions_tracedReadStructuralFeatureActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedReadStructuralFeatureActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActions_tracedValueSpecificationActionActivations <em>Intermediate Actions traced Value Specification Action Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Actions traced Value Specification Action Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActions_tracedValueSpecificationActionActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActions_tracedValueSpecificationActionActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances <em>Intermediate Activities traced Activity Edge Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Edge Instances</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions <em>Intermediate Activities traced Activity Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Executions</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityExecutions();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityFinalNodeActivations <em>Intermediate Activities traced Activity Final Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Final Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityFinalNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityFinalNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups <em>Intermediate Activities traced Activity Node Activation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activation Groups</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations <em>Intermediate Activities traced Activity Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityParameterNodeActivations <em>Intermediate Activities traced Activity Parameter Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Activity Parameter Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityParameterNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedActivityParameterNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedControlTokens <em>Intermediate Activities traced Control Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Control Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedControlTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedControlTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedDecisionNodeActivations <em>Intermediate Activities traced Decision Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Decision Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedDecisionNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedDecisionNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedForkNodeActivations <em>Intermediate Activities traced Fork Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Fork Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedForkNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedForkNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens <em>Intermediate Activities traced Forked Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Forked Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedForkedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedInitialNodeActivations <em>Intermediate Activities traced Initial Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Initial Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedInitialNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedInitialNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedJoinNodeActivations <em>Intermediate Activities traced Join Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Join Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedJoinNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedJoinNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedMergeNodeActivations <em>Intermediate Activities traced Merge Node Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Merge Node Activations</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedMergeNodeActivations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedMergeNodeActivations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens <em>Intermediate Activities traced Object Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Object Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedObjectTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedOffers <em>Intermediate Activities traced Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Offers</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedOffers()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedOffers();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedTokens <em>Intermediate Activities traced Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Activities traced Tokens</em>'.
	 * @see umlTrace.SpecificTrace#getIntermediateActivities_tracedTokens()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_IntermediateActivities_tracedTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedBooleanValues <em>Kernel traced Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Boolean Values</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedBooleanValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedBooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedIntegerValues <em>Kernel traced Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Integer Values</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedIntegerValues()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedIntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedLiteralBooleanEvaluations <em>Kernel traced Literal Boolean Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Literal Boolean Evaluations</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedLiteralBooleanEvaluations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedLiteralBooleanEvaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedLiteralIntegerEvaluations <em>Kernel traced Literal Integer Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Literal Integer Evaluations</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedLiteralIntegerEvaluations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedLiteralIntegerEvaluations();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedObjects <em>Kernel traced Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced Objects</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedObjects()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getKernel_tracedReferences <em>Kernel traced References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kernel traced References</em>'.
	 * @see umlTrace.SpecificTrace#getKernel_tracedReferences()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Kernel_tracedReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutionEnvironments <em>Loci traced Execution Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Environments</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutionEnvironments()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutionFactorys <em>Loci traced Execution Factorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Execution Factorys</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutionFactorys()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutionFactorys();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedExecutors <em>Loci traced Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Executors</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedExecutors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedExecutors();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedLocuss <em>Loci traced Locuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Locuss</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedLocuss()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedLocuss();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getLoci_tracedSemanticVisitors <em>Loci traced Semantic Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loci traced Semantic Visitors</em>'.
	 * @see umlTrace.SpecificTrace#getLoci_tracedSemanticVisitors()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Loci_tracedSemanticVisitors();

	/**
	 * Returns the meta object for the containment reference list '{@link umlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see umlTrace.SpecificTrace#getStatesTrace()
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
	UmlTraceFactory getUmlTraceFactory();

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
		 * The meta object literal for the '{@link umlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see umlTrace.impl.SpecificTraceImpl
		 * @see umlTrace.impl.UmlTracePackageImpl#getSpecificTrace()
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
		 * The meta object literal for the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS = eINSTANCE.getSpecificTrace_FumlConfiguration_tracedElementConfigurations();

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

} //UmlTracePackage
