/**
 */
package fumlConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fumlConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationFactoryImpl extends EFactoryImpl implements FumlConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FumlConfigurationFactory init() {
		try {
			FumlConfigurationFactory theFumlConfigurationFactory = (FumlConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory(FumlConfigurationPackage.eNS_URI);
			if (theFumlConfigurationFactory != null) {
				return theFumlConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FumlConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FumlConfigurationPackage.MODEL_CONFIGURATION: return createModelConfiguration();
			case FumlConfigurationPackage.ELEMENT_CONFIGURATION: return createElementConfiguration();
			case FumlConfigurationPackage.ACTIVITY_CONTENT_CONFIGURATION: return createActivityContentConfiguration();
			case FumlConfigurationPackage.ACTIVITY_CONFIGURATION: return createActivityConfiguration();
			case FumlConfigurationPackage.BEHAVIOR_CONFIGURATION: return createBehaviorConfiguration();
			case FumlConfigurationPackage.CLASS_CONFIGURATION: return createClassConfiguration();
			case FumlConfigurationPackage.BEHAVIORED_CLASSIFIER_CONFIGURATION: return createBehavioredClassifierConfiguration();
			case FumlConfigurationPackage.CLASSIFIER_CONFIGURATION: return createClassifierConfiguration();
			case FumlConfigurationPackage.NAMESPACE_CONFIGURATION: return createNamespaceConfiguration();
			case FumlConfigurationPackage.NAMED_ELEMENT_CONFIGURATION: return createNamedElementConfiguration();
			case FumlConfigurationPackage.COMMENT_CONFIGURATION: return createCommentConfiguration();
			case FumlConfigurationPackage.STEREOTYPE_CONFIGURATION: return createStereotypeConfiguration();
			case FumlConfigurationPackage.IMAGE_CONFIGURATION: return createImageConfiguration();
			case FumlConfigurationPackage.PROFILE_CONFIGURATION: return createProfileConfiguration();
			case FumlConfigurationPackage.PACKAGE_CONFIGURATION: return createPackageConfiguration();
			case FumlConfigurationPackage.PACKAGEABLE_ELEMENT_CONFIGURATION: return createPackageableElementConfiguration();
			case FumlConfigurationPackage.PARAMETERABLE_ELEMENT_CONFIGURATION: return createParameterableElementConfiguration();
			case FumlConfigurationPackage.TEMPLATE_PARAMETER_CONFIGURATION: return createTemplateParameterConfiguration();
			case FumlConfigurationPackage.TEMPLATE_SIGNATURE_CONFIGURATION: return createTemplateSignatureConfiguration();
			case FumlConfigurationPackage.TEMPLATEABLE_ELEMENT_CONFIGURATION: return createTemplateableElementConfiguration();
			case FumlConfigurationPackage.TEMPLATE_BINDING_CONFIGURATION: return createTemplateBindingConfiguration();
			case FumlConfigurationPackage.DIRECTED_RELATIONSHIP_CONFIGURATION: return createDirectedRelationshipConfiguration();
			case FumlConfigurationPackage.RELATIONSHIP_CONFIGURATION: return createRelationshipConfiguration();
			case FumlConfigurationPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION: return createTemplateParameterSubstitutionConfiguration();
			case FumlConfigurationPackage.TYPE_CONFIGURATION: return createTypeConfiguration();
			case FumlConfigurationPackage.ASSOCIATION_CONFIGURATION: return createAssociationConfiguration();
			case FumlConfigurationPackage.PROPERTY_CONFIGURATION: return createPropertyConfiguration();
			case FumlConfigurationPackage.CONNECTABLE_ELEMENT_CONFIGURATION: return createConnectableElementConfiguration();
			case FumlConfigurationPackage.TYPED_ELEMENT_CONFIGURATION: return createTypedElementConfiguration();
			case FumlConfigurationPackage.CONNECTOR_END_CONFIGURATION: return createConnectorEndConfiguration();
			case FumlConfigurationPackage.MULTIPLICITY_ELEMENT_CONFIGURATION: return createMultiplicityElementConfiguration();
			case FumlConfigurationPackage.VALUE_SPECIFICATION_CONFIGURATION: return createValueSpecificationConfiguration();
			case FumlConfigurationPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION: return createConnectableElementTemplateParameterConfiguration();
			case FumlConfigurationPackage.DEPLOYMENT_TARGET_CONFIGURATION: return createDeploymentTargetConfiguration();
			case FumlConfigurationPackage.DEPLOYMENT_CONFIGURATION: return createDeploymentConfiguration();
			case FumlConfigurationPackage.DEPENDENCY_CONFIGURATION: return createDependencyConfiguration();
			case FumlConfigurationPackage.DEPLOYMENT_SPECIFICATION_CONFIGURATION: return createDeploymentSpecificationConfiguration();
			case FumlConfigurationPackage.ARTIFACT_CONFIGURATION: return createArtifactConfiguration();
			case FumlConfigurationPackage.DEPLOYED_ARTIFACT_CONFIGURATION: return createDeployedArtifactConfiguration();
			case FumlConfigurationPackage.MANIFESTATION_CONFIGURATION: return createManifestationConfiguration();
			case FumlConfigurationPackage.ABSTRACTION_CONFIGURATION: return createAbstractionConfiguration();
			case FumlConfigurationPackage.OPAQUE_EXPRESSION_CONFIGURATION: return createOpaqueExpressionConfiguration();
			case FumlConfigurationPackage.PARAMETER_CONFIGURATION: return createParameterConfiguration();
			case FumlConfigurationPackage.OPERATION_CONFIGURATION: return createOperationConfiguration();
			case FumlConfigurationPackage.BEHAVIORAL_FEATURE_CONFIGURATION: return createBehavioralFeatureConfiguration();
			case FumlConfigurationPackage.FEATURE_CONFIGURATION: return createFeatureConfiguration();
			case FumlConfigurationPackage.REDEFINABLE_ELEMENT_CONFIGURATION: return createRedefinableElementConfiguration();
			case FumlConfigurationPackage.PARAMETER_SET_CONFIGURATION: return createParameterSetConfiguration();
			case FumlConfigurationPackage.CONSTRAINT_CONFIGURATION: return createConstraintConfiguration();
			case FumlConfigurationPackage.DATA_TYPE_CONFIGURATION: return createDataTypeConfiguration();
			case FumlConfigurationPackage.INTERFACE_CONFIGURATION: return createInterfaceConfiguration();
			case FumlConfigurationPackage.RECEPTION_CONFIGURATION: return createReceptionConfiguration();
			case FumlConfigurationPackage.SIGNAL_CONFIGURATION: return createSignalConfiguration();
			case FumlConfigurationPackage.PROTOCOL_STATE_MACHINE_CONFIGURATION: return createProtocolStateMachineConfiguration();
			case FumlConfigurationPackage.STATE_MACHINE_CONFIGURATION: return createStateMachineConfiguration();
			case FumlConfigurationPackage.PSEUDOSTATE_CONFIGURATION: return createPseudostateConfiguration();
			case FumlConfigurationPackage.VERTEX_CONFIGURATION: return createVertexConfiguration();
			case FumlConfigurationPackage.REGION_CONFIGURATION: return createRegionConfiguration();
			case FumlConfigurationPackage.STATE_CONFIGURATION: return createStateConfiguration();
			case FumlConfigurationPackage.CONNECTION_POINT_REFERENCE_CONFIGURATION: return createConnectionPointReferenceConfiguration();
			case FumlConfigurationPackage.TRIGGER_CONFIGURATION: return createTriggerConfiguration();
			case FumlConfigurationPackage.EVENT_CONFIGURATION: return createEventConfiguration();
			case FumlConfigurationPackage.PORT_CONFIGURATION: return createPortConfiguration();
			case FumlConfigurationPackage.TRANSITION_CONFIGURATION: return createTransitionConfiguration();
			case FumlConfigurationPackage.PROTOCOL_CONFORMANCE_CONFIGURATION: return createProtocolConformanceConfiguration();
			case FumlConfigurationPackage.OPERATION_TEMPLATE_PARAMETER_CONFIGURATION: return createOperationTemplateParameterConfiguration();
			case FumlConfigurationPackage.STRUCTURAL_FEATURE_CONFIGURATION: return createStructuralFeatureConfiguration();
			case FumlConfigurationPackage.PACKAGE_MERGE_CONFIGURATION: return createPackageMergeConfiguration();
			case FumlConfigurationPackage.PROFILE_APPLICATION_CONFIGURATION: return createProfileApplicationConfiguration();
			case FumlConfigurationPackage.ENUMERATION_CONFIGURATION: return createEnumerationConfiguration();
			case FumlConfigurationPackage.ENUMERATION_LITERAL_CONFIGURATION: return createEnumerationLiteralConfiguration();
			case FumlConfigurationPackage.INSTANCE_SPECIFICATION_CONFIGURATION: return createInstanceSpecificationConfiguration();
			case FumlConfigurationPackage.SLOT_CONFIGURATION: return createSlotConfiguration();
			case FumlConfigurationPackage.PRIMITIVE_TYPE_CONFIGURATION: return createPrimitiveTypeConfiguration();
			case FumlConfigurationPackage.ELEMENT_IMPORT_CONFIGURATION: return createElementImportConfiguration();
			case FumlConfigurationPackage.PACKAGE_IMPORT_CONFIGURATION: return createPackageImportConfiguration();
			case FumlConfigurationPackage.EXTENSION_CONFIGURATION: return createExtensionConfiguration();
			case FumlConfigurationPackage.EXTENSION_END_CONFIGURATION: return createExtensionEndConfiguration();
			case FumlConfigurationPackage.STRING_EXPRESSION_CONFIGURATION: return createStringExpressionConfiguration();
			case FumlConfigurationPackage.EXPRESSION_CONFIGURATION: return createExpressionConfiguration();
			case FumlConfigurationPackage.USAGE_CONFIGURATION: return createUsageConfiguration();
			case FumlConfigurationPackage.COLLABORATION_USE_CONFIGURATION: return createCollaborationUseConfiguration();
			case FumlConfigurationPackage.COLLABORATION_CONFIGURATION: return createCollaborationConfiguration();
			case FumlConfigurationPackage.STRUCTURED_CLASSIFIER_CONFIGURATION: return createStructuredClassifierConfiguration();
			case FumlConfigurationPackage.CONNECTOR_CONFIGURATION: return createConnectorConfiguration();
			case FumlConfigurationPackage.GENERALIZATION_CONFIGURATION: return createGeneralizationConfiguration();
			case FumlConfigurationPackage.GENERALIZATION_SET_CONFIGURATION: return createGeneralizationSetConfiguration();
			case FumlConfigurationPackage.REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION: return createRedefinableTemplateSignatureConfiguration();
			case FumlConfigurationPackage.USE_CASE_CONFIGURATION: return createUseCaseConfiguration();
			case FumlConfigurationPackage.EXTEND_CONFIGURATION: return createExtendConfiguration();
			case FumlConfigurationPackage.EXTENSION_POINT_CONFIGURATION: return createExtensionPointConfiguration();
			case FumlConfigurationPackage.INCLUDE_CONFIGURATION: return createIncludeConfiguration();
			case FumlConfigurationPackage.SUBSTITUTION_CONFIGURATION: return createSubstitutionConfiguration();
			case FumlConfigurationPackage.REALIZATION_CONFIGURATION: return createRealizationConfiguration();
			case FumlConfigurationPackage.CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION: return createClassifierTemplateParameterConfiguration();
			case FumlConfigurationPackage.INTERFACE_REALIZATION_CONFIGURATION: return createInterfaceRealizationConfiguration();
			case FumlConfigurationPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION: return createEncapsulatedClassifierConfiguration();
			case FumlConfigurationPackage.ACTIVITY_GROUP_CONFIGURATION: return createActivityGroupConfiguration();
			case FumlConfigurationPackage.ACTIVITY_EDGE_CONFIGURATION: return createActivityEdgeConfiguration();
			case FumlConfigurationPackage.ACTIVITY_PARTITION_CONFIGURATION: return createActivityPartitionConfiguration();
			case FumlConfigurationPackage.ACTIVITY_NODE_CONFIGURATION: return createActivityNodeConfiguration();
			case FumlConfigurationPackage.INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION: return createInterruptibleActivityRegionConfiguration();
			case FumlConfigurationPackage.STRUCTURED_ACTIVITY_NODE_CONFIGURATION: return createStructuredActivityNodeConfiguration();
			case FumlConfigurationPackage.ACTION_CONFIGURATION: return createActionConfiguration();
			case FumlConfigurationPackage.EXECUTABLE_NODE_CONFIGURATION: return createExecutableNodeConfiguration();
			case FumlConfigurationPackage.EXCEPTION_HANDLER_CONFIGURATION: return createExceptionHandlerConfiguration();
			case FumlConfigurationPackage.OBJECT_NODE_CONFIGURATION: return createObjectNodeConfiguration();
			case FumlConfigurationPackage.INPUT_PIN_CONFIGURATION: return createInputPinConfiguration();
			case FumlConfigurationPackage.PIN_CONFIGURATION: return createPinConfiguration();
			case FumlConfigurationPackage.OUTPUT_PIN_CONFIGURATION: return createOutputPinConfiguration();
			case FumlConfigurationPackage.VARIABLE_CONFIGURATION: return createVariableConfiguration();
			case FumlConfigurationPackage.VALUE_SPECIFICATION_ACTION_CONFIGURATION: return createValueSpecificationActionConfiguration();
			case FumlConfigurationPackage.VARIABLE_ACTION_CONFIGURATION: return createVariableActionConfiguration();
			case FumlConfigurationPackage.WRITE_LINK_ACTION_CONFIGURATION: return createWriteLinkActionConfiguration();
			case FumlConfigurationPackage.LINK_ACTION_CONFIGURATION: return createLinkActionConfiguration();
			case FumlConfigurationPackage.LINK_END_DATA_CONFIGURATION: return createLinkEndDataConfiguration();
			case FumlConfigurationPackage.QUALIFIER_VALUE_CONFIGURATION: return createQualifierValueConfiguration();
			case FumlConfigurationPackage.WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createWriteStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.WRITE_VARIABLE_ACTION_CONFIGURATION: return createWriteVariableActionConfiguration();
			case FumlConfigurationPackage.ACCEPT_CALL_ACTION_CONFIGURATION: return createAcceptCallActionConfiguration();
			case FumlConfigurationPackage.ACCEPT_EVENT_ACTION_CONFIGURATION: return createAcceptEventActionConfiguration();
			case FumlConfigurationPackage.ACTION_INPUT_PIN_CONFIGURATION: return createActionInputPinConfiguration();
			case FumlConfigurationPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: return createAddStructuralFeatureValueActionConfiguration();
			case FumlConfigurationPackage.ADD_VARIABLE_VALUE_ACTION_CONFIGURATION: return createAddVariableValueActionConfiguration();
			case FumlConfigurationPackage.BROADCAST_SIGNAL_ACTION_CONFIGURATION: return createBroadcastSignalActionConfiguration();
			case FumlConfigurationPackage.INVOCATION_ACTION_CONFIGURATION: return createInvocationActionConfiguration();
			case FumlConfigurationPackage.CALL_ACTION_CONFIGURATION: return createCallActionConfiguration();
			case FumlConfigurationPackage.CALL_BEHAVIOR_ACTION_CONFIGURATION: return createCallBehaviorActionConfiguration();
			case FumlConfigurationPackage.CALL_OPERATION_ACTION_CONFIGURATION: return createCallOperationActionConfiguration();
			case FumlConfigurationPackage.CLAUSE_CONFIGURATION: return createClauseConfiguration();
			case FumlConfigurationPackage.CLEAR_ASSOCIATION_ACTION_CONFIGURATION: return createClearAssociationActionConfiguration();
			case FumlConfigurationPackage.CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createClearStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.CLEAR_VARIABLE_ACTION_CONFIGURATION: return createClearVariableActionConfiguration();
			case FumlConfigurationPackage.CONDITIONAL_NODE_CONFIGURATION: return createConditionalNodeConfiguration();
			case FumlConfigurationPackage.CREATE_LINK_ACTION_CONFIGURATION: return createCreateLinkActionConfiguration();
			case FumlConfigurationPackage.LINK_END_CREATION_DATA_CONFIGURATION: return createLinkEndCreationDataConfiguration();
			case FumlConfigurationPackage.CREATE_LINK_OBJECT_ACTION_CONFIGURATION: return createCreateLinkObjectActionConfiguration();
			case FumlConfigurationPackage.CREATE_OBJECT_ACTION_CONFIGURATION: return createCreateObjectActionConfiguration();
			case FumlConfigurationPackage.DESTROY_LINK_ACTION_CONFIGURATION: return createDestroyLinkActionConfiguration();
			case FumlConfigurationPackage.LINK_END_DESTRUCTION_DATA_CONFIGURATION: return createLinkEndDestructionDataConfiguration();
			case FumlConfigurationPackage.DESTROY_OBJECT_ACTION_CONFIGURATION: return createDestroyObjectActionConfiguration();
			case FumlConfigurationPackage.EXPANSION_NODE_CONFIGURATION: return createExpansionNodeConfiguration();
			case FumlConfigurationPackage.EXPANSION_REGION_CONFIGURATION: return createExpansionRegionConfiguration();
			case FumlConfigurationPackage.LOOP_NODE_CONFIGURATION: return createLoopNodeConfiguration();
			case FumlConfigurationPackage.OPAQUE_ACTION_CONFIGURATION: return createOpaqueActionConfiguration();
			case FumlConfigurationPackage.RAISE_EXCEPTION_ACTION_CONFIGURATION: return createRaiseExceptionActionConfiguration();
			case FumlConfigurationPackage.READ_EXTENT_ACTION_CONFIGURATION: return createReadExtentActionConfiguration();
			case FumlConfigurationPackage.READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION: return createReadIsClassifiedObjectActionConfiguration();
			case FumlConfigurationPackage.READ_LINK_ACTION_CONFIGURATION: return createReadLinkActionConfiguration();
			case FumlConfigurationPackage.READ_LINK_OBJECT_END_ACTION_CONFIGURATION: return createReadLinkObjectEndActionConfiguration();
			case FumlConfigurationPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION: return createReadLinkObjectEndQualifierActionConfiguration();
			case FumlConfigurationPackage.READ_SELF_ACTION_CONFIGURATION: return createReadSelfActionConfiguration();
			case FumlConfigurationPackage.READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createReadStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.READ_VARIABLE_ACTION_CONFIGURATION: return createReadVariableActionConfiguration();
			case FumlConfigurationPackage.RECLASSIFY_OBJECT_ACTION_CONFIGURATION: return createReclassifyObjectActionConfiguration();
			case FumlConfigurationPackage.REDUCE_ACTION_CONFIGURATION: return createReduceActionConfiguration();
			case FumlConfigurationPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: return createRemoveStructuralFeatureValueActionConfiguration();
			case FumlConfigurationPackage.REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION: return createRemoveVariableValueActionConfiguration();
			case FumlConfigurationPackage.REPLY_ACTION_CONFIGURATION: return createReplyActionConfiguration();
			case FumlConfigurationPackage.SEND_OBJECT_ACTION_CONFIGURATION: return createSendObjectActionConfiguration();
			case FumlConfigurationPackage.SEND_SIGNAL_ACTION_CONFIGURATION: return createSendSignalActionConfiguration();
			case FumlConfigurationPackage.SEQUENCE_NODE_CONFIGURATION: return createSequenceNodeConfiguration();
			case FumlConfigurationPackage.START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION: return createStartClassifierBehaviorActionConfiguration();
			case FumlConfigurationPackage.START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION: return createStartObjectBehaviorActionConfiguration();
			case FumlConfigurationPackage.TEST_IDENTITY_ACTION_CONFIGURATION: return createTestIdentityActionConfiguration();
			case FumlConfigurationPackage.UNMARSHALL_ACTION_CONFIGURATION: return createUnmarshallActionConfiguration();
			case FumlConfigurationPackage.VALUE_PIN_CONFIGURATION: return createValuePinConfiguration();
			case FumlConfigurationPackage.ACTIVITY_FINAL_NODE_CONFIGURATION: return createActivityFinalNodeConfiguration();
			case FumlConfigurationPackage.FINAL_NODE_CONFIGURATION: return createFinalNodeConfiguration();
			case FumlConfigurationPackage.CONTROL_NODE_CONFIGURATION: return createControlNodeConfiguration();
			case FumlConfigurationPackage.ACTIVITY_PARAMETER_NODE_CONFIGURATION: return createActivityParameterNodeConfiguration();
			case FumlConfigurationPackage.CENTRAL_BUFFER_NODE_CONFIGURATION: return createCentralBufferNodeConfiguration();
			case FumlConfigurationPackage.CONTROL_FLOW_CONFIGURATION: return createControlFlowConfiguration();
			case FumlConfigurationPackage.DATA_STORE_NODE_CONFIGURATION: return createDataStoreNodeConfiguration();
			case FumlConfigurationPackage.DECISION_NODE_CONFIGURATION: return createDecisionNodeConfiguration();
			case FumlConfigurationPackage.OBJECT_FLOW_CONFIGURATION: return createObjectFlowConfiguration();
			case FumlConfigurationPackage.FLOW_FINAL_NODE_CONFIGURATION: return createFlowFinalNodeConfiguration();
			case FumlConfigurationPackage.FORK_NODE_CONFIGURATION: return createForkNodeConfiguration();
			case FumlConfigurationPackage.INITIAL_NODE_CONFIGURATION: return createInitialNodeConfiguration();
			case FumlConfigurationPackage.JOIN_NODE_CONFIGURATION: return createJoinNodeConfiguration();
			case FumlConfigurationPackage.MERGE_NODE_CONFIGURATION: return createMergeNodeConfiguration();
			case FumlConfigurationPackage.INSTANCE_VALUE_CONFIGURATION: return createInstanceValueConfiguration();
			case FumlConfigurationPackage.ANY_RECEIVE_EVENT_CONFIGURATION: return createAnyReceiveEventConfiguration();
			case FumlConfigurationPackage.MESSAGE_EVENT_CONFIGURATION: return createMessageEventConfiguration();
			case FumlConfigurationPackage.CALL_EVENT_CONFIGURATION: return createCallEventConfiguration();
			case FumlConfigurationPackage.CHANGE_EVENT_CONFIGURATION: return createChangeEventConfiguration();
			case FumlConfigurationPackage.FUNCTION_BEHAVIOR_CONFIGURATION: return createFunctionBehaviorConfiguration();
			case FumlConfigurationPackage.OPAQUE_BEHAVIOR_CONFIGURATION: return createOpaqueBehaviorConfiguration();
			case FumlConfigurationPackage.SIGNAL_EVENT_CONFIGURATION: return createSignalEventConfiguration();
			case FumlConfigurationPackage.TIME_EVENT_CONFIGURATION: return createTimeEventConfiguration();
			case FumlConfigurationPackage.TIME_EXPRESSION_CONFIGURATION: return createTimeExpressionConfiguration();
			case FumlConfigurationPackage.OBSERVATION_CONFIGURATION: return createObservationConfiguration();
			case FumlConfigurationPackage.COMMUNICATION_PATH_CONFIGURATION: return createCommunicationPathConfiguration();
			case FumlConfigurationPackage.DEVICE_CONFIGURATION: return createDeviceConfiguration();
			case FumlConfigurationPackage.NODE_CONFIGURATION: return createNodeConfiguration();
			case FumlConfigurationPackage.EXECUTION_ENVIRONMENT_CONFIGURATION: return createExecutionEnvironmentConfiguration();
			case FumlConfigurationPackage.INFORMATION_FLOW_CONFIGURATION: return createInformationFlowConfiguration();
			case FumlConfigurationPackage.MESSAGE_CONFIGURATION: return createMessageConfiguration();
			case FumlConfigurationPackage.INTERACTION_CONFIGURATION: return createInteractionConfiguration();
			case FumlConfigurationPackage.INTERACTION_FRAGMENT_CONFIGURATION: return createInteractionFragmentConfiguration();
			case FumlConfigurationPackage.LIFELINE_CONFIGURATION: return createLifelineConfiguration();
			case FumlConfigurationPackage.PART_DECOMPOSITION_CONFIGURATION: return createPartDecompositionConfiguration();
			case FumlConfigurationPackage.INTERACTION_USE_CONFIGURATION: return createInteractionUseConfiguration();
			case FumlConfigurationPackage.GATE_CONFIGURATION: return createGateConfiguration();
			case FumlConfigurationPackage.MESSAGE_END_CONFIGURATION: return createMessageEndConfiguration();
			case FumlConfigurationPackage.INTERACTION_OPERAND_CONFIGURATION: return createInteractionOperandConfiguration();
			case FumlConfigurationPackage.INTERACTION_CONSTRAINT_CONFIGURATION: return createInteractionConstraintConfiguration();
			case FumlConfigurationPackage.GENERAL_ORDERING_CONFIGURATION: return createGeneralOrderingConfiguration();
			case FumlConfigurationPackage.OCCURRENCE_SPECIFICATION_CONFIGURATION: return createOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.INFORMATION_ITEM_CONFIGURATION: return createInformationItemConfiguration();
			case FumlConfigurationPackage.ACTION_EXECUTION_SPECIFICATION_CONFIGURATION: return createActionExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.EXECUTION_SPECIFICATION_CONFIGURATION: return createExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION: return createBehaviorExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.COMBINED_FRAGMENT_CONFIGURATION: return createCombinedFragmentConfiguration();
			case FumlConfigurationPackage.CONSIDER_IGNORE_FRAGMENT_CONFIGURATION: return createConsiderIgnoreFragmentConfiguration();
			case FumlConfigurationPackage.CONTINUATION_CONFIGURATION: return createContinuationConfiguration();
			case FumlConfigurationPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createDestructionOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createMessageOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createExecutionOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.STATE_INVARIANT_CONFIGURATION: return createStateInvariantConfiguration();
			case FumlConfigurationPackage.FINAL_STATE_CONFIGURATION: return createFinalStateConfiguration();
			case FumlConfigurationPackage.PROTOCOL_TRANSITION_CONFIGURATION: return createProtocolTransitionConfiguration();
			case FumlConfigurationPackage.ASSOCIATION_CLASS_CONFIGURATION: return createAssociationClassConfiguration();
			case FumlConfigurationPackage.COMPONENT_CONFIGURATION: return createComponentConfiguration();
			case FumlConfigurationPackage.COMPONENT_REALIZATION_CONFIGURATION: return createComponentRealizationConfiguration();
			case FumlConfigurationPackage.ACTOR_CONFIGURATION: return createActorConfiguration();
			case FumlConfigurationPackage.DURATION_CONFIGURATION: return createDurationConfiguration();
			case FumlConfigurationPackage.DURATION_CONSTRAINT_CONFIGURATION: return createDurationConstraintConfiguration();
			case FumlConfigurationPackage.INTERVAL_CONSTRAINT_CONFIGURATION: return createIntervalConstraintConfiguration();
			case FumlConfigurationPackage.INTERVAL_CONFIGURATION: return createIntervalConfiguration();
			case FumlConfigurationPackage.DURATION_INTERVAL_CONFIGURATION: return createDurationIntervalConfiguration();
			case FumlConfigurationPackage.DURATION_OBSERVATION_CONFIGURATION: return createDurationObservationConfiguration();
			case FumlConfigurationPackage.LITERAL_BOOLEAN_CONFIGURATION: return createLiteralBooleanConfiguration();
			case FumlConfigurationPackage.LITERAL_SPECIFICATION_CONFIGURATION: return createLiteralSpecificationConfiguration();
			case FumlConfigurationPackage.LITERAL_INTEGER_CONFIGURATION: return createLiteralIntegerConfiguration();
			case FumlConfigurationPackage.LITERAL_NULL_CONFIGURATION: return createLiteralNullConfiguration();
			case FumlConfigurationPackage.LITERAL_REAL_CONFIGURATION: return createLiteralRealConfiguration();
			case FumlConfigurationPackage.LITERAL_STRING_CONFIGURATION: return createLiteralStringConfiguration();
			case FumlConfigurationPackage.LITERAL_UNLIMITED_NATURAL_CONFIGURATION: return createLiteralUnlimitedNaturalConfiguration();
			case FumlConfigurationPackage.TIME_CONSTRAINT_CONFIGURATION: return createTimeConstraintConfiguration();
			case FumlConfigurationPackage.TIME_INTERVAL_CONFIGURATION: return createTimeIntervalConfiguration();
			case FumlConfigurationPackage.TIME_OBSERVATION_CONFIGURATION: return createTimeObservationConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConfiguration createModelConfiguration() {
		ModelConfigurationImpl modelConfiguration = new ModelConfigurationImpl();
		return modelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementConfiguration createElementConfiguration() {
		ElementConfigurationImpl elementConfiguration = new ElementConfigurationImpl();
		return elementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContentConfiguration createActivityContentConfiguration() {
		ActivityContentConfigurationImpl activityContentConfiguration = new ActivityContentConfigurationImpl();
		return activityContentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConfiguration createActivityConfiguration() {
		ActivityConfigurationImpl activityConfiguration = new ActivityConfigurationImpl();
		return activityConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorConfiguration createBehaviorConfiguration() {
		BehaviorConfigurationImpl behaviorConfiguration = new BehaviorConfigurationImpl();
		return behaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConfiguration createClassConfiguration() {
		ClassConfigurationImpl classConfiguration = new ClassConfigurationImpl();
		return classConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifierConfiguration createBehavioredClassifierConfiguration() {
		BehavioredClassifierConfigurationImpl behavioredClassifierConfiguration = new BehavioredClassifierConfigurationImpl();
		return behavioredClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierConfiguration createClassifierConfiguration() {
		ClassifierConfigurationImpl classifierConfiguration = new ClassifierConfigurationImpl();
		return classifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceConfiguration createNamespaceConfiguration() {
		NamespaceConfigurationImpl namespaceConfiguration = new NamespaceConfigurationImpl();
		return namespaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementConfiguration createNamedElementConfiguration() {
		NamedElementConfigurationImpl namedElementConfiguration = new NamedElementConfigurationImpl();
		return namedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentConfiguration createCommentConfiguration() {
		CommentConfigurationImpl commentConfiguration = new CommentConfigurationImpl();
		return commentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeConfiguration createStereotypeConfiguration() {
		StereotypeConfigurationImpl stereotypeConfiguration = new StereotypeConfigurationImpl();
		return stereotypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageConfiguration createImageConfiguration() {
		ImageConfigurationImpl imageConfiguration = new ImageConfigurationImpl();
		return imageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileConfiguration createProfileConfiguration() {
		ProfileConfigurationImpl profileConfiguration = new ProfileConfigurationImpl();
		return profileConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageConfiguration createPackageConfiguration() {
		PackageConfigurationImpl packageConfiguration = new PackageConfigurationImpl();
		return packageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElementConfiguration createPackageableElementConfiguration() {
		PackageableElementConfigurationImpl packageableElementConfiguration = new PackageableElementConfigurationImpl();
		return packageableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElementConfiguration createParameterableElementConfiguration() {
		ParameterableElementConfigurationImpl parameterableElementConfiguration = new ParameterableElementConfigurationImpl();
		return parameterableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterConfiguration createTemplateParameterConfiguration() {
		TemplateParameterConfigurationImpl templateParameterConfiguration = new TemplateParameterConfigurationImpl();
		return templateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignatureConfiguration createTemplateSignatureConfiguration() {
		TemplateSignatureConfigurationImpl templateSignatureConfiguration = new TemplateSignatureConfigurationImpl();
		return templateSignatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElementConfiguration createTemplateableElementConfiguration() {
		TemplateableElementConfigurationImpl templateableElementConfiguration = new TemplateableElementConfigurationImpl();
		return templateableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBindingConfiguration createTemplateBindingConfiguration() {
		TemplateBindingConfigurationImpl templateBindingConfiguration = new TemplateBindingConfigurationImpl();
		return templateBindingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationshipConfiguration createDirectedRelationshipConfiguration() {
		DirectedRelationshipConfigurationImpl directedRelationshipConfiguration = new DirectedRelationshipConfigurationImpl();
		return directedRelationshipConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConfiguration createRelationshipConfiguration() {
		RelationshipConfigurationImpl relationshipConfiguration = new RelationshipConfigurationImpl();
		return relationshipConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitutionConfiguration createTemplateParameterSubstitutionConfiguration() {
		TemplateParameterSubstitutionConfigurationImpl templateParameterSubstitutionConfiguration = new TemplateParameterSubstitutionConfigurationImpl();
		return templateParameterSubstitutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConfiguration createTypeConfiguration() {
		TypeConfigurationImpl typeConfiguration = new TypeConfigurationImpl();
		return typeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationConfiguration createAssociationConfiguration() {
		AssociationConfigurationImpl associationConfiguration = new AssociationConfigurationImpl();
		return associationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConfiguration createPropertyConfiguration() {
		PropertyConfigurationImpl propertyConfiguration = new PropertyConfigurationImpl();
		return propertyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementConfiguration createConnectableElementConfiguration() {
		ConnectableElementConfigurationImpl connectableElementConfiguration = new ConnectableElementConfigurationImpl();
		return connectableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElementConfiguration createTypedElementConfiguration() {
		TypedElementConfigurationImpl typedElementConfiguration = new TypedElementConfigurationImpl();
		return typedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEndConfiguration createConnectorEndConfiguration() {
		ConnectorEndConfigurationImpl connectorEndConfiguration = new ConnectorEndConfigurationImpl();
		return connectorEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElementConfiguration createMultiplicityElementConfiguration() {
		MultiplicityElementConfigurationImpl multiplicityElementConfiguration = new MultiplicityElementConfigurationImpl();
		return multiplicityElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationConfiguration createValueSpecificationConfiguration() {
		ValueSpecificationConfigurationImpl valueSpecificationConfiguration = new ValueSpecificationConfigurationImpl();
		return valueSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElementTemplateParameterConfiguration createConnectableElementTemplateParameterConfiguration() {
		ConnectableElementTemplateParameterConfigurationImpl connectableElementTemplateParameterConfiguration = new ConnectableElementTemplateParameterConfigurationImpl();
		return connectableElementTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTargetConfiguration createDeploymentTargetConfiguration() {
		DeploymentTargetConfigurationImpl deploymentTargetConfiguration = new DeploymentTargetConfigurationImpl();
		return deploymentTargetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConfiguration createDeploymentConfiguration() {
		DeploymentConfigurationImpl deploymentConfiguration = new DeploymentConfigurationImpl();
		return deploymentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyConfiguration createDependencyConfiguration() {
		DependencyConfigurationImpl dependencyConfiguration = new DependencyConfigurationImpl();
		return dependencyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentSpecificationConfiguration createDeploymentSpecificationConfiguration() {
		DeploymentSpecificationConfigurationImpl deploymentSpecificationConfiguration = new DeploymentSpecificationConfigurationImpl();
		return deploymentSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactConfiguration createArtifactConfiguration() {
		ArtifactConfigurationImpl artifactConfiguration = new ArtifactConfigurationImpl();
		return artifactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedArtifactConfiguration createDeployedArtifactConfiguration() {
		DeployedArtifactConfigurationImpl deployedArtifactConfiguration = new DeployedArtifactConfigurationImpl();
		return deployedArtifactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationConfiguration createManifestationConfiguration() {
		ManifestationConfigurationImpl manifestationConfiguration = new ManifestationConfigurationImpl();
		return manifestationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionConfiguration createAbstractionConfiguration() {
		AbstractionConfigurationImpl abstractionConfiguration = new AbstractionConfigurationImpl();
		return abstractionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpressionConfiguration createOpaqueExpressionConfiguration() {
		OpaqueExpressionConfigurationImpl opaqueExpressionConfiguration = new OpaqueExpressionConfigurationImpl();
		return opaqueExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterConfiguration createParameterConfiguration() {
		ParameterConfigurationImpl parameterConfiguration = new ParameterConfigurationImpl();
		return parameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationConfiguration createOperationConfiguration() {
		OperationConfigurationImpl operationConfiguration = new OperationConfigurationImpl();
		return operationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeatureConfiguration createBehavioralFeatureConfiguration() {
		BehavioralFeatureConfigurationImpl behavioralFeatureConfiguration = new BehavioralFeatureConfigurationImpl();
		return behavioralFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConfiguration createFeatureConfiguration() {
		FeatureConfigurationImpl featureConfiguration = new FeatureConfigurationImpl();
		return featureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElementConfiguration createRedefinableElementConfiguration() {
		RedefinableElementConfigurationImpl redefinableElementConfiguration = new RedefinableElementConfigurationImpl();
		return redefinableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetConfiguration createParameterSetConfiguration() {
		ParameterSetConfigurationImpl parameterSetConfiguration = new ParameterSetConfigurationImpl();
		return parameterSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintConfiguration createConstraintConfiguration() {
		ConstraintConfigurationImpl constraintConfiguration = new ConstraintConfigurationImpl();
		return constraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeConfiguration createDataTypeConfiguration() {
		DataTypeConfigurationImpl dataTypeConfiguration = new DataTypeConfigurationImpl();
		return dataTypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConfiguration createInterfaceConfiguration() {
		InterfaceConfigurationImpl interfaceConfiguration = new InterfaceConfigurationImpl();
		return interfaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptionConfiguration createReceptionConfiguration() {
		ReceptionConfigurationImpl receptionConfiguration = new ReceptionConfigurationImpl();
		return receptionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalConfiguration createSignalConfiguration() {
		SignalConfigurationImpl signalConfiguration = new SignalConfigurationImpl();
		return signalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachineConfiguration createProtocolStateMachineConfiguration() {
		ProtocolStateMachineConfigurationImpl protocolStateMachineConfiguration = new ProtocolStateMachineConfigurationImpl();
		return protocolStateMachineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineConfiguration createStateMachineConfiguration() {
		StateMachineConfigurationImpl stateMachineConfiguration = new StateMachineConfigurationImpl();
		return stateMachineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateConfiguration createPseudostateConfiguration() {
		PseudostateConfigurationImpl pseudostateConfiguration = new PseudostateConfigurationImpl();
		return pseudostateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexConfiguration createVertexConfiguration() {
		VertexConfigurationImpl vertexConfiguration = new VertexConfigurationImpl();
		return vertexConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionConfiguration createRegionConfiguration() {
		RegionConfigurationImpl regionConfiguration = new RegionConfigurationImpl();
		return regionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateConfiguration createStateConfiguration() {
		StateConfigurationImpl stateConfiguration = new StateConfigurationImpl();
		return stateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointReferenceConfiguration createConnectionPointReferenceConfiguration() {
		ConnectionPointReferenceConfigurationImpl connectionPointReferenceConfiguration = new ConnectionPointReferenceConfigurationImpl();
		return connectionPointReferenceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerConfiguration createTriggerConfiguration() {
		TriggerConfigurationImpl triggerConfiguration = new TriggerConfigurationImpl();
		return triggerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConfiguration createEventConfiguration() {
		EventConfigurationImpl eventConfiguration = new EventConfigurationImpl();
		return eventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfiguration createPortConfiguration() {
		PortConfigurationImpl portConfiguration = new PortConfigurationImpl();
		return portConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionConfiguration createTransitionConfiguration() {
		TransitionConfigurationImpl transitionConfiguration = new TransitionConfigurationImpl();
		return transitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolConformanceConfiguration createProtocolConformanceConfiguration() {
		ProtocolConformanceConfigurationImpl protocolConformanceConfiguration = new ProtocolConformanceConfigurationImpl();
		return protocolConformanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameterConfiguration createOperationTemplateParameterConfiguration() {
		OperationTemplateParameterConfigurationImpl operationTemplateParameterConfiguration = new OperationTemplateParameterConfigurationImpl();
		return operationTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureConfiguration createStructuralFeatureConfiguration() {
		StructuralFeatureConfigurationImpl structuralFeatureConfiguration = new StructuralFeatureConfigurationImpl();
		return structuralFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMergeConfiguration createPackageMergeConfiguration() {
		PackageMergeConfigurationImpl packageMergeConfiguration = new PackageMergeConfigurationImpl();
		return packageMergeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplicationConfiguration createProfileApplicationConfiguration() {
		ProfileApplicationConfigurationImpl profileApplicationConfiguration = new ProfileApplicationConfigurationImpl();
		return profileApplicationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationConfiguration createEnumerationConfiguration() {
		EnumerationConfigurationImpl enumerationConfiguration = new EnumerationConfigurationImpl();
		return enumerationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralConfiguration createEnumerationLiteralConfiguration() {
		EnumerationLiteralConfigurationImpl enumerationLiteralConfiguration = new EnumerationLiteralConfigurationImpl();
		return enumerationLiteralConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecificationConfiguration createInstanceSpecificationConfiguration() {
		InstanceSpecificationConfigurationImpl instanceSpecificationConfiguration = new InstanceSpecificationConfigurationImpl();
		return instanceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotConfiguration createSlotConfiguration() {
		SlotConfigurationImpl slotConfiguration = new SlotConfigurationImpl();
		return slotConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeConfiguration createPrimitiveTypeConfiguration() {
		PrimitiveTypeConfigurationImpl primitiveTypeConfiguration = new PrimitiveTypeConfigurationImpl();
		return primitiveTypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImportConfiguration createElementImportConfiguration() {
		ElementImportConfigurationImpl elementImportConfiguration = new ElementImportConfigurationImpl();
		return elementImportConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImportConfiguration createPackageImportConfiguration() {
		PackageImportConfigurationImpl packageImportConfiguration = new PackageImportConfigurationImpl();
		return packageImportConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionConfiguration createExtensionConfiguration() {
		ExtensionConfigurationImpl extensionConfiguration = new ExtensionConfigurationImpl();
		return extensionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEndConfiguration createExtensionEndConfiguration() {
		ExtensionEndConfigurationImpl extensionEndConfiguration = new ExtensionEndConfigurationImpl();
		return extensionEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpressionConfiguration createStringExpressionConfiguration() {
		StringExpressionConfigurationImpl stringExpressionConfiguration = new StringExpressionConfigurationImpl();
		return stringExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionConfiguration createExpressionConfiguration() {
		ExpressionConfigurationImpl expressionConfiguration = new ExpressionConfigurationImpl();
		return expressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageConfiguration createUsageConfiguration() {
		UsageConfigurationImpl usageConfiguration = new UsageConfigurationImpl();
		return usageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUseConfiguration createCollaborationUseConfiguration() {
		CollaborationUseConfigurationImpl collaborationUseConfiguration = new CollaborationUseConfigurationImpl();
		return collaborationUseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationConfiguration createCollaborationConfiguration() {
		CollaborationConfigurationImpl collaborationConfiguration = new CollaborationConfigurationImpl();
		return collaborationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifierConfiguration createStructuredClassifierConfiguration() {
		StructuredClassifierConfigurationImpl structuredClassifierConfiguration = new StructuredClassifierConfigurationImpl();
		return structuredClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorConfiguration createConnectorConfiguration() {
		ConnectorConfigurationImpl connectorConfiguration = new ConnectorConfigurationImpl();
		return connectorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationConfiguration createGeneralizationConfiguration() {
		GeneralizationConfigurationImpl generalizationConfiguration = new GeneralizationConfigurationImpl();
		return generalizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSetConfiguration createGeneralizationSetConfiguration() {
		GeneralizationSetConfigurationImpl generalizationSetConfiguration = new GeneralizationSetConfigurationImpl();
		return generalizationSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignatureConfiguration createRedefinableTemplateSignatureConfiguration() {
		RedefinableTemplateSignatureConfigurationImpl redefinableTemplateSignatureConfiguration = new RedefinableTemplateSignatureConfigurationImpl();
		return redefinableTemplateSignatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseConfiguration createUseCaseConfiguration() {
		UseCaseConfigurationImpl useCaseConfiguration = new UseCaseConfigurationImpl();
		return useCaseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendConfiguration createExtendConfiguration() {
		ExtendConfigurationImpl extendConfiguration = new ExtendConfigurationImpl();
		return extendConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionPointConfiguration createExtensionPointConfiguration() {
		ExtensionPointConfigurationImpl extensionPointConfiguration = new ExtensionPointConfigurationImpl();
		return extensionPointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeConfiguration createIncludeConfiguration() {
		IncludeConfigurationImpl includeConfiguration = new IncludeConfigurationImpl();
		return includeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionConfiguration createSubstitutionConfiguration() {
		SubstitutionConfigurationImpl substitutionConfiguration = new SubstitutionConfigurationImpl();
		return substitutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizationConfiguration createRealizationConfiguration() {
		RealizationConfigurationImpl realizationConfiguration = new RealizationConfigurationImpl();
		return realizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameterConfiguration createClassifierTemplateParameterConfiguration() {
		ClassifierTemplateParameterConfigurationImpl classifierTemplateParameterConfiguration = new ClassifierTemplateParameterConfigurationImpl();
		return classifierTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealizationConfiguration createInterfaceRealizationConfiguration() {
		InterfaceRealizationConfigurationImpl interfaceRealizationConfiguration = new InterfaceRealizationConfigurationImpl();
		return interfaceRealizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulatedClassifierConfiguration createEncapsulatedClassifierConfiguration() {
		EncapsulatedClassifierConfigurationImpl encapsulatedClassifierConfiguration = new EncapsulatedClassifierConfigurationImpl();
		return encapsulatedClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroupConfiguration createActivityGroupConfiguration() {
		ActivityGroupConfigurationImpl activityGroupConfiguration = new ActivityGroupConfigurationImpl();
		return activityGroupConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdgeConfiguration createActivityEdgeConfiguration() {
		ActivityEdgeConfigurationImpl activityEdgeConfiguration = new ActivityEdgeConfigurationImpl();
		return activityEdgeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartitionConfiguration createActivityPartitionConfiguration() {
		ActivityPartitionConfigurationImpl activityPartitionConfiguration = new ActivityPartitionConfigurationImpl();
		return activityPartitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeConfiguration createActivityNodeConfiguration() {
		ActivityNodeConfigurationImpl activityNodeConfiguration = new ActivityNodeConfigurationImpl();
		return activityNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegionConfiguration createInterruptibleActivityRegionConfiguration() {
		InterruptibleActivityRegionConfigurationImpl interruptibleActivityRegionConfiguration = new InterruptibleActivityRegionConfigurationImpl();
		return interruptibleActivityRegionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNodeConfiguration createStructuredActivityNodeConfiguration() {
		StructuredActivityNodeConfigurationImpl structuredActivityNodeConfiguration = new StructuredActivityNodeConfigurationImpl();
		return structuredActivityNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionConfiguration createActionConfiguration() {
		ActionConfigurationImpl actionConfiguration = new ActionConfigurationImpl();
		return actionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNodeConfiguration createExecutableNodeConfiguration() {
		ExecutableNodeConfigurationImpl executableNodeConfiguration = new ExecutableNodeConfigurationImpl();
		return executableNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandlerConfiguration createExceptionHandlerConfiguration() {
		ExceptionHandlerConfigurationImpl exceptionHandlerConfiguration = new ExceptionHandlerConfigurationImpl();
		return exceptionHandlerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeConfiguration createObjectNodeConfiguration() {
		ObjectNodeConfigurationImpl objectNodeConfiguration = new ObjectNodeConfigurationImpl();
		return objectNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPinConfiguration createInputPinConfiguration() {
		InputPinConfigurationImpl inputPinConfiguration = new InputPinConfigurationImpl();
		return inputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinConfiguration createPinConfiguration() {
		PinConfigurationImpl pinConfiguration = new PinConfigurationImpl();
		return pinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPinConfiguration createOutputPinConfiguration() {
		OutputPinConfigurationImpl outputPinConfiguration = new OutputPinConfigurationImpl();
		return outputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableConfiguration createVariableConfiguration() {
		VariableConfigurationImpl variableConfiguration = new VariableConfigurationImpl();
		return variableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecificationActionConfiguration createValueSpecificationActionConfiguration() {
		ValueSpecificationActionConfigurationImpl valueSpecificationActionConfiguration = new ValueSpecificationActionConfigurationImpl();
		return valueSpecificationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableActionConfiguration createVariableActionConfiguration() {
		VariableActionConfigurationImpl variableActionConfiguration = new VariableActionConfigurationImpl();
		return variableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLinkActionConfiguration createWriteLinkActionConfiguration() {
		WriteLinkActionConfigurationImpl writeLinkActionConfiguration = new WriteLinkActionConfigurationImpl();
		return writeLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkActionConfiguration createLinkActionConfiguration() {
		LinkActionConfigurationImpl linkActionConfiguration = new LinkActionConfigurationImpl();
		return linkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDataConfiguration createLinkEndDataConfiguration() {
		LinkEndDataConfigurationImpl linkEndDataConfiguration = new LinkEndDataConfigurationImpl();
		return linkEndDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierValueConfiguration createQualifierValueConfiguration() {
		QualifierValueConfigurationImpl qualifierValueConfiguration = new QualifierValueConfigurationImpl();
		return qualifierValueConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureActionConfiguration createWriteStructuralFeatureActionConfiguration() {
		WriteStructuralFeatureActionConfigurationImpl writeStructuralFeatureActionConfiguration = new WriteStructuralFeatureActionConfigurationImpl();
		return writeStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureActionConfiguration createStructuralFeatureActionConfiguration() {
		StructuralFeatureActionConfigurationImpl structuralFeatureActionConfiguration = new StructuralFeatureActionConfigurationImpl();
		return structuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteVariableActionConfiguration createWriteVariableActionConfiguration() {
		WriteVariableActionConfigurationImpl writeVariableActionConfiguration = new WriteVariableActionConfigurationImpl();
		return writeVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptCallActionConfiguration createAcceptCallActionConfiguration() {
		AcceptCallActionConfigurationImpl acceptCallActionConfiguration = new AcceptCallActionConfigurationImpl();
		return acceptCallActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventActionConfiguration createAcceptEventActionConfiguration() {
		AcceptEventActionConfigurationImpl acceptEventActionConfiguration = new AcceptEventActionConfigurationImpl();
		return acceptEventActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInputPinConfiguration createActionInputPinConfiguration() {
		ActionInputPinConfigurationImpl actionInputPinConfiguration = new ActionInputPinConfigurationImpl();
		return actionInputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStructuralFeatureValueActionConfiguration createAddStructuralFeatureValueActionConfiguration() {
		AddStructuralFeatureValueActionConfigurationImpl addStructuralFeatureValueActionConfiguration = new AddStructuralFeatureValueActionConfigurationImpl();
		return addStructuralFeatureValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableValueActionConfiguration createAddVariableValueActionConfiguration() {
		AddVariableValueActionConfigurationImpl addVariableValueActionConfiguration = new AddVariableValueActionConfigurationImpl();
		return addVariableValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastSignalActionConfiguration createBroadcastSignalActionConfiguration() {
		BroadcastSignalActionConfigurationImpl broadcastSignalActionConfiguration = new BroadcastSignalActionConfigurationImpl();
		return broadcastSignalActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationActionConfiguration createInvocationActionConfiguration() {
		InvocationActionConfigurationImpl invocationActionConfiguration = new InvocationActionConfigurationImpl();
		return invocationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActionConfiguration createCallActionConfiguration() {
		CallActionConfigurationImpl callActionConfiguration = new CallActionConfigurationImpl();
		return callActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorActionConfiguration createCallBehaviorActionConfiguration() {
		CallBehaviorActionConfigurationImpl callBehaviorActionConfiguration = new CallBehaviorActionConfigurationImpl();
		return callBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationActionConfiguration createCallOperationActionConfiguration() {
		CallOperationActionConfigurationImpl callOperationActionConfiguration = new CallOperationActionConfigurationImpl();
		return callOperationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClauseConfiguration createClauseConfiguration() {
		ClauseConfigurationImpl clauseConfiguration = new ClauseConfigurationImpl();
		return clauseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearAssociationActionConfiguration createClearAssociationActionConfiguration() {
		ClearAssociationActionConfigurationImpl clearAssociationActionConfiguration = new ClearAssociationActionConfigurationImpl();
		return clearAssociationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearStructuralFeatureActionConfiguration createClearStructuralFeatureActionConfiguration() {
		ClearStructuralFeatureActionConfigurationImpl clearStructuralFeatureActionConfiguration = new ClearStructuralFeatureActionConfigurationImpl();
		return clearStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearVariableActionConfiguration createClearVariableActionConfiguration() {
		ClearVariableActionConfigurationImpl clearVariableActionConfiguration = new ClearVariableActionConfigurationImpl();
		return clearVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNodeConfiguration createConditionalNodeConfiguration() {
		ConditionalNodeConfigurationImpl conditionalNodeConfiguration = new ConditionalNodeConfigurationImpl();
		return conditionalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkActionConfiguration createCreateLinkActionConfiguration() {
		CreateLinkActionConfigurationImpl createLinkActionConfiguration = new CreateLinkActionConfigurationImpl();
		return createLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndCreationDataConfiguration createLinkEndCreationDataConfiguration() {
		LinkEndCreationDataConfigurationImpl linkEndCreationDataConfiguration = new LinkEndCreationDataConfigurationImpl();
		return linkEndCreationDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateLinkObjectActionConfiguration createCreateLinkObjectActionConfiguration() {
		CreateLinkObjectActionConfigurationImpl createLinkObjectActionConfiguration = new CreateLinkObjectActionConfigurationImpl();
		return createLinkObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateObjectActionConfiguration createCreateObjectActionConfiguration() {
		CreateObjectActionConfigurationImpl createObjectActionConfiguration = new CreateObjectActionConfigurationImpl();
		return createObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyLinkActionConfiguration createDestroyLinkActionConfiguration() {
		DestroyLinkActionConfigurationImpl destroyLinkActionConfiguration = new DestroyLinkActionConfigurationImpl();
		return destroyLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEndDestructionDataConfiguration createLinkEndDestructionDataConfiguration() {
		LinkEndDestructionDataConfigurationImpl linkEndDestructionDataConfiguration = new LinkEndDestructionDataConfigurationImpl();
		return linkEndDestructionDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyObjectActionConfiguration createDestroyObjectActionConfiguration() {
		DestroyObjectActionConfigurationImpl destroyObjectActionConfiguration = new DestroyObjectActionConfigurationImpl();
		return destroyObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionNodeConfiguration createExpansionNodeConfiguration() {
		ExpansionNodeConfigurationImpl expansionNodeConfiguration = new ExpansionNodeConfigurationImpl();
		return expansionNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegionConfiguration createExpansionRegionConfiguration() {
		ExpansionRegionConfigurationImpl expansionRegionConfiguration = new ExpansionRegionConfigurationImpl();
		return expansionRegionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNodeConfiguration createLoopNodeConfiguration() {
		LoopNodeConfigurationImpl loopNodeConfiguration = new LoopNodeConfigurationImpl();
		return loopNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueActionConfiguration createOpaqueActionConfiguration() {
		OpaqueActionConfigurationImpl opaqueActionConfiguration = new OpaqueActionConfigurationImpl();
		return opaqueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExceptionActionConfiguration createRaiseExceptionActionConfiguration() {
		RaiseExceptionActionConfigurationImpl raiseExceptionActionConfiguration = new RaiseExceptionActionConfigurationImpl();
		return raiseExceptionActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadExtentActionConfiguration createReadExtentActionConfiguration() {
		ReadExtentActionConfigurationImpl readExtentActionConfiguration = new ReadExtentActionConfigurationImpl();
		return readExtentActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadIsClassifiedObjectActionConfiguration createReadIsClassifiedObjectActionConfiguration() {
		ReadIsClassifiedObjectActionConfigurationImpl readIsClassifiedObjectActionConfiguration = new ReadIsClassifiedObjectActionConfigurationImpl();
		return readIsClassifiedObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkActionConfiguration createReadLinkActionConfiguration() {
		ReadLinkActionConfigurationImpl readLinkActionConfiguration = new ReadLinkActionConfigurationImpl();
		return readLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndActionConfiguration createReadLinkObjectEndActionConfiguration() {
		ReadLinkObjectEndActionConfigurationImpl readLinkObjectEndActionConfiguration = new ReadLinkObjectEndActionConfigurationImpl();
		return readLinkObjectEndActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLinkObjectEndQualifierActionConfiguration createReadLinkObjectEndQualifierActionConfiguration() {
		ReadLinkObjectEndQualifierActionConfigurationImpl readLinkObjectEndQualifierActionConfiguration = new ReadLinkObjectEndQualifierActionConfigurationImpl();
		return readLinkObjectEndQualifierActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSelfActionConfiguration createReadSelfActionConfiguration() {
		ReadSelfActionConfigurationImpl readSelfActionConfiguration = new ReadSelfActionConfigurationImpl();
		return readSelfActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureActionConfiguration createReadStructuralFeatureActionConfiguration() {
		ReadStructuralFeatureActionConfigurationImpl readStructuralFeatureActionConfiguration = new ReadStructuralFeatureActionConfigurationImpl();
		return readStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadVariableActionConfiguration createReadVariableActionConfiguration() {
		ReadVariableActionConfigurationImpl readVariableActionConfiguration = new ReadVariableActionConfigurationImpl();
		return readVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReclassifyObjectActionConfiguration createReclassifyObjectActionConfiguration() {
		ReclassifyObjectActionConfigurationImpl reclassifyObjectActionConfiguration = new ReclassifyObjectActionConfigurationImpl();
		return reclassifyObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReduceActionConfiguration createReduceActionConfiguration() {
		ReduceActionConfigurationImpl reduceActionConfiguration = new ReduceActionConfigurationImpl();
		return reduceActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveStructuralFeatureValueActionConfiguration createRemoveStructuralFeatureValueActionConfiguration() {
		RemoveStructuralFeatureValueActionConfigurationImpl removeStructuralFeatureValueActionConfiguration = new RemoveStructuralFeatureValueActionConfigurationImpl();
		return removeStructuralFeatureValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveVariableValueActionConfiguration createRemoveVariableValueActionConfiguration() {
		RemoveVariableValueActionConfigurationImpl removeVariableValueActionConfiguration = new RemoveVariableValueActionConfigurationImpl();
		return removeVariableValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyActionConfiguration createReplyActionConfiguration() {
		ReplyActionConfigurationImpl replyActionConfiguration = new ReplyActionConfigurationImpl();
		return replyActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectActionConfiguration createSendObjectActionConfiguration() {
		SendObjectActionConfigurationImpl sendObjectActionConfiguration = new SendObjectActionConfigurationImpl();
		return sendObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalActionConfiguration createSendSignalActionConfiguration() {
		SendSignalActionConfigurationImpl sendSignalActionConfiguration = new SendSignalActionConfigurationImpl();
		return sendSignalActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNodeConfiguration createSequenceNodeConfiguration() {
		SequenceNodeConfigurationImpl sequenceNodeConfiguration = new SequenceNodeConfigurationImpl();
		return sequenceNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartClassifierBehaviorActionConfiguration createStartClassifierBehaviorActionConfiguration() {
		StartClassifierBehaviorActionConfigurationImpl startClassifierBehaviorActionConfiguration = new StartClassifierBehaviorActionConfigurationImpl();
		return startClassifierBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartObjectBehaviorActionConfiguration createStartObjectBehaviorActionConfiguration() {
		StartObjectBehaviorActionConfigurationImpl startObjectBehaviorActionConfiguration = new StartObjectBehaviorActionConfigurationImpl();
		return startObjectBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityActionConfiguration createTestIdentityActionConfiguration() {
		TestIdentityActionConfigurationImpl testIdentityActionConfiguration = new TestIdentityActionConfigurationImpl();
		return testIdentityActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmarshallActionConfiguration createUnmarshallActionConfiguration() {
		UnmarshallActionConfigurationImpl unmarshallActionConfiguration = new UnmarshallActionConfigurationImpl();
		return unmarshallActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePinConfiguration createValuePinConfiguration() {
		ValuePinConfigurationImpl valuePinConfiguration = new ValuePinConfigurationImpl();
		return valuePinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNodeConfiguration createActivityFinalNodeConfiguration() {
		ActivityFinalNodeConfigurationImpl activityFinalNodeConfiguration = new ActivityFinalNodeConfigurationImpl();
		return activityFinalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeConfiguration createFinalNodeConfiguration() {
		FinalNodeConfigurationImpl finalNodeConfiguration = new FinalNodeConfigurationImpl();
		return finalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNodeConfiguration createControlNodeConfiguration() {
		ControlNodeConfigurationImpl controlNodeConfiguration = new ControlNodeConfigurationImpl();
		return controlNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNodeConfiguration createActivityParameterNodeConfiguration() {
		ActivityParameterNodeConfigurationImpl activityParameterNodeConfiguration = new ActivityParameterNodeConfigurationImpl();
		return activityParameterNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNodeConfiguration createCentralBufferNodeConfiguration() {
		CentralBufferNodeConfigurationImpl centralBufferNodeConfiguration = new CentralBufferNodeConfigurationImpl();
		return centralBufferNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowConfiguration createControlFlowConfiguration() {
		ControlFlowConfigurationImpl controlFlowConfiguration = new ControlFlowConfigurationImpl();
		return controlFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNodeConfiguration createDataStoreNodeConfiguration() {
		DataStoreNodeConfigurationImpl dataStoreNodeConfiguration = new DataStoreNodeConfigurationImpl();
		return dataStoreNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNodeConfiguration createDecisionNodeConfiguration() {
		DecisionNodeConfigurationImpl decisionNodeConfiguration = new DecisionNodeConfigurationImpl();
		return decisionNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlowConfiguration createObjectFlowConfiguration() {
		ObjectFlowConfigurationImpl objectFlowConfiguration = new ObjectFlowConfigurationImpl();
		return objectFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNodeConfiguration createFlowFinalNodeConfiguration() {
		FlowFinalNodeConfigurationImpl flowFinalNodeConfiguration = new FlowFinalNodeConfigurationImpl();
		return flowFinalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeConfiguration createForkNodeConfiguration() {
		ForkNodeConfigurationImpl forkNodeConfiguration = new ForkNodeConfigurationImpl();
		return forkNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNodeConfiguration createInitialNodeConfiguration() {
		InitialNodeConfigurationImpl initialNodeConfiguration = new InitialNodeConfigurationImpl();
		return initialNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeConfiguration createJoinNodeConfiguration() {
		JoinNodeConfigurationImpl joinNodeConfiguration = new JoinNodeConfigurationImpl();
		return joinNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNodeConfiguration createMergeNodeConfiguration() {
		MergeNodeConfigurationImpl mergeNodeConfiguration = new MergeNodeConfigurationImpl();
		return mergeNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValueConfiguration createInstanceValueConfiguration() {
		InstanceValueConfigurationImpl instanceValueConfiguration = new InstanceValueConfigurationImpl();
		return instanceValueConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyReceiveEventConfiguration createAnyReceiveEventConfiguration() {
		AnyReceiveEventConfigurationImpl anyReceiveEventConfiguration = new AnyReceiveEventConfigurationImpl();
		return anyReceiveEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventConfiguration createMessageEventConfiguration() {
		MessageEventConfigurationImpl messageEventConfiguration = new MessageEventConfigurationImpl();
		return messageEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEventConfiguration createCallEventConfiguration() {
		CallEventConfigurationImpl callEventConfiguration = new CallEventConfigurationImpl();
		return callEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEventConfiguration createChangeEventConfiguration() {
		ChangeEventConfigurationImpl changeEventConfiguration = new ChangeEventConfigurationImpl();
		return changeEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehaviorConfiguration createFunctionBehaviorConfiguration() {
		FunctionBehaviorConfigurationImpl functionBehaviorConfiguration = new FunctionBehaviorConfigurationImpl();
		return functionBehaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehaviorConfiguration createOpaqueBehaviorConfiguration() {
		OpaqueBehaviorConfigurationImpl opaqueBehaviorConfiguration = new OpaqueBehaviorConfigurationImpl();
		return opaqueBehaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventConfiguration createSignalEventConfiguration() {
		SignalEventConfigurationImpl signalEventConfiguration = new SignalEventConfigurationImpl();
		return signalEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEventConfiguration createTimeEventConfiguration() {
		TimeEventConfigurationImpl timeEventConfiguration = new TimeEventConfigurationImpl();
		return timeEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpressionConfiguration createTimeExpressionConfiguration() {
		TimeExpressionConfigurationImpl timeExpressionConfiguration = new TimeExpressionConfigurationImpl();
		return timeExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationConfiguration createObservationConfiguration() {
		ObservationConfigurationImpl observationConfiguration = new ObservationConfigurationImpl();
		return observationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPathConfiguration createCommunicationPathConfiguration() {
		CommunicationPathConfigurationImpl communicationPathConfiguration = new CommunicationPathConfigurationImpl();
		return communicationPathConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceConfiguration createDeviceConfiguration() {
		DeviceConfigurationImpl deviceConfiguration = new DeviceConfigurationImpl();
		return deviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeConfiguration createNodeConfiguration() {
		NodeConfigurationImpl nodeConfiguration = new NodeConfigurationImpl();
		return nodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironmentConfiguration createExecutionEnvironmentConfiguration() {
		ExecutionEnvironmentConfigurationImpl executionEnvironmentConfiguration = new ExecutionEnvironmentConfigurationImpl();
		return executionEnvironmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowConfiguration createInformationFlowConfiguration() {
		InformationFlowConfigurationImpl informationFlowConfiguration = new InformationFlowConfigurationImpl();
		return informationFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageConfiguration createMessageConfiguration() {
		MessageConfigurationImpl messageConfiguration = new MessageConfigurationImpl();
		return messageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConfiguration createInteractionConfiguration() {
		InteractionConfigurationImpl interactionConfiguration = new InteractionConfigurationImpl();
		return interactionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragmentConfiguration createInteractionFragmentConfiguration() {
		InteractionFragmentConfigurationImpl interactionFragmentConfiguration = new InteractionFragmentConfigurationImpl();
		return interactionFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifelineConfiguration createLifelineConfiguration() {
		LifelineConfigurationImpl lifelineConfiguration = new LifelineConfigurationImpl();
		return lifelineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecompositionConfiguration createPartDecompositionConfiguration() {
		PartDecompositionConfigurationImpl partDecompositionConfiguration = new PartDecompositionConfigurationImpl();
		return partDecompositionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseConfiguration createInteractionUseConfiguration() {
		InteractionUseConfigurationImpl interactionUseConfiguration = new InteractionUseConfigurationImpl();
		return interactionUseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateConfiguration createGateConfiguration() {
		GateConfigurationImpl gateConfiguration = new GateConfigurationImpl();
		return gateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEndConfiguration createMessageEndConfiguration() {
		MessageEndConfigurationImpl messageEndConfiguration = new MessageEndConfigurationImpl();
		return messageEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperandConfiguration createInteractionOperandConfiguration() {
		InteractionOperandConfigurationImpl interactionOperandConfiguration = new InteractionOperandConfigurationImpl();
		return interactionOperandConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraintConfiguration createInteractionConstraintConfiguration() {
		InteractionConstraintConfigurationImpl interactionConstraintConfiguration = new InteractionConstraintConfigurationImpl();
		return interactionConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrderingConfiguration createGeneralOrderingConfiguration() {
		GeneralOrderingConfigurationImpl generalOrderingConfiguration = new GeneralOrderingConfigurationImpl();
		return generalOrderingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecificationConfiguration createOccurrenceSpecificationConfiguration() {
		OccurrenceSpecificationConfigurationImpl occurrenceSpecificationConfiguration = new OccurrenceSpecificationConfigurationImpl();
		return occurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItemConfiguration createInformationItemConfiguration() {
		InformationItemConfigurationImpl informationItemConfiguration = new InformationItemConfigurationImpl();
		return informationItemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutionSpecificationConfiguration createActionExecutionSpecificationConfiguration() {
		ActionExecutionSpecificationConfigurationImpl actionExecutionSpecificationConfiguration = new ActionExecutionSpecificationConfigurationImpl();
		return actionExecutionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSpecificationConfiguration createExecutionSpecificationConfiguration() {
		ExecutionSpecificationConfigurationImpl executionSpecificationConfiguration = new ExecutionSpecificationConfigurationImpl();
		return executionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecificationConfiguration createBehaviorExecutionSpecificationConfiguration() {
		BehaviorExecutionSpecificationConfigurationImpl behaviorExecutionSpecificationConfiguration = new BehaviorExecutionSpecificationConfigurationImpl();
		return behaviorExecutionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentConfiguration createCombinedFragmentConfiguration() {
		CombinedFragmentConfigurationImpl combinedFragmentConfiguration = new CombinedFragmentConfigurationImpl();
		return combinedFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsiderIgnoreFragmentConfiguration createConsiderIgnoreFragmentConfiguration() {
		ConsiderIgnoreFragmentConfigurationImpl considerIgnoreFragmentConfiguration = new ConsiderIgnoreFragmentConfigurationImpl();
		return considerIgnoreFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationConfiguration createContinuationConfiguration() {
		ContinuationConfigurationImpl continuationConfiguration = new ContinuationConfigurationImpl();
		return continuationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionOccurrenceSpecificationConfiguration createDestructionOccurrenceSpecificationConfiguration() {
		DestructionOccurrenceSpecificationConfigurationImpl destructionOccurrenceSpecificationConfiguration = new DestructionOccurrenceSpecificationConfigurationImpl();
		return destructionOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurrenceSpecificationConfiguration createMessageOccurrenceSpecificationConfiguration() {
		MessageOccurrenceSpecificationConfigurationImpl messageOccurrenceSpecificationConfiguration = new MessageOccurrenceSpecificationConfigurationImpl();
		return messageOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecificationConfiguration createExecutionOccurrenceSpecificationConfiguration() {
		ExecutionOccurrenceSpecificationConfigurationImpl executionOccurrenceSpecificationConfiguration = new ExecutionOccurrenceSpecificationConfigurationImpl();
		return executionOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariantConfiguration createStateInvariantConfiguration() {
		StateInvariantConfigurationImpl stateInvariantConfiguration = new StateInvariantConfigurationImpl();
		return stateInvariantConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalStateConfiguration createFinalStateConfiguration() {
		FinalStateConfigurationImpl finalStateConfiguration = new FinalStateConfigurationImpl();
		return finalStateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTransitionConfiguration createProtocolTransitionConfiguration() {
		ProtocolTransitionConfigurationImpl protocolTransitionConfiguration = new ProtocolTransitionConfigurationImpl();
		return protocolTransitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClassConfiguration createAssociationClassConfiguration() {
		AssociationClassConfigurationImpl associationClassConfiguration = new AssociationClassConfigurationImpl();
		return associationClassConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfiguration createComponentConfiguration() {
		ComponentConfigurationImpl componentConfiguration = new ComponentConfigurationImpl();
		return componentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRealizationConfiguration createComponentRealizationConfiguration() {
		ComponentRealizationConfigurationImpl componentRealizationConfiguration = new ComponentRealizationConfigurationImpl();
		return componentRealizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorConfiguration createActorConfiguration() {
		ActorConfigurationImpl actorConfiguration = new ActorConfigurationImpl();
		return actorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConfiguration createDurationConfiguration() {
		DurationConfigurationImpl durationConfiguration = new DurationConfigurationImpl();
		return durationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraintConfiguration createDurationConstraintConfiguration() {
		DurationConstraintConfigurationImpl durationConstraintConfiguration = new DurationConstraintConfigurationImpl();
		return durationConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConstraintConfiguration createIntervalConstraintConfiguration() {
		IntervalConstraintConfigurationImpl intervalConstraintConfiguration = new IntervalConstraintConfigurationImpl();
		return intervalConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalConfiguration createIntervalConfiguration() {
		IntervalConfigurationImpl intervalConfiguration = new IntervalConfigurationImpl();
		return intervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationIntervalConfiguration createDurationIntervalConfiguration() {
		DurationIntervalConfigurationImpl durationIntervalConfiguration = new DurationIntervalConfigurationImpl();
		return durationIntervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationObservationConfiguration createDurationObservationConfiguration() {
		DurationObservationConfigurationImpl durationObservationConfiguration = new DurationObservationConfigurationImpl();
		return durationObservationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanConfiguration createLiteralBooleanConfiguration() {
		LiteralBooleanConfigurationImpl literalBooleanConfiguration = new LiteralBooleanConfigurationImpl();
		return literalBooleanConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralSpecificationConfiguration createLiteralSpecificationConfiguration() {
		LiteralSpecificationConfigurationImpl literalSpecificationConfiguration = new LiteralSpecificationConfigurationImpl();
		return literalSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntegerConfiguration createLiteralIntegerConfiguration() {
		LiteralIntegerConfigurationImpl literalIntegerConfiguration = new LiteralIntegerConfigurationImpl();
		return literalIntegerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralNullConfiguration createLiteralNullConfiguration() {
		LiteralNullConfigurationImpl literalNullConfiguration = new LiteralNullConfigurationImpl();
		return literalNullConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralRealConfiguration createLiteralRealConfiguration() {
		LiteralRealConfigurationImpl literalRealConfiguration = new LiteralRealConfigurationImpl();
		return literalRealConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralStringConfiguration createLiteralStringConfiguration() {
		LiteralStringConfigurationImpl literalStringConfiguration = new LiteralStringConfigurationImpl();
		return literalStringConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNaturalConfiguration createLiteralUnlimitedNaturalConfiguration() {
		LiteralUnlimitedNaturalConfigurationImpl literalUnlimitedNaturalConfiguration = new LiteralUnlimitedNaturalConfigurationImpl();
		return literalUnlimitedNaturalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstraintConfiguration createTimeConstraintConfiguration() {
		TimeConstraintConfigurationImpl timeConstraintConfiguration = new TimeConstraintConfigurationImpl();
		return timeConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalConfiguration createTimeIntervalConfiguration() {
		TimeIntervalConfigurationImpl timeIntervalConfiguration = new TimeIntervalConfigurationImpl();
		return timeIntervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeObservationConfiguration createTimeObservationConfiguration() {
		TimeObservationConfigurationImpl timeObservationConfiguration = new TimeObservationConfigurationImpl();
		return timeObservationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationPackage getFumlConfigurationPackage() {
		return (FumlConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FumlConfigurationPackage getPackage() {
		return FumlConfigurationPackage.eINSTANCE;
	}

} //FumlConfigurationFactoryImpl
