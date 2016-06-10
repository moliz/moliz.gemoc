/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.impl;

import fumlConfigurationTrace.States.fumlConfiguration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case FumlConfigurationPackage.TRACED_ABSTRACTION_CONFIGURATION: return createTracedAbstractionConfiguration();
			case FumlConfigurationPackage.TRACED_ACCEPT_CALL_ACTION_CONFIGURATION: return createTracedAcceptCallActionConfiguration();
			case FumlConfigurationPackage.TRACED_ACCEPT_EVENT_ACTION_CONFIGURATION: return createTracedAcceptEventActionConfiguration();
			case FumlConfigurationPackage.TRACED_ACTION_CONFIGURATION: return createTracedActionConfiguration();
			case FumlConfigurationPackage.TRACED_ACTION_EXECUTION_SPECIFICATION_CONFIGURATION: return createTracedActionExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_ACTION_INPUT_PIN_CONFIGURATION: return createTracedActionInputPinConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_CONFIGURATION: return createTracedActivityConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_CONTENT_CONFIGURATION: return createTracedActivityContentConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_EDGE_CONFIGURATION: return createTracedActivityEdgeConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_FINAL_NODE_CONFIGURATION: return createTracedActivityFinalNodeConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION: return createTracedActivityGroupConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_NODE_CONFIGURATION: return createTracedActivityNodeConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_PARAMETER_NODE_CONFIGURATION: return createTracedActivityParameterNodeConfiguration();
			case FumlConfigurationPackage.TRACED_ACTIVITY_PARTITION_CONFIGURATION: return createTracedActivityPartitionConfiguration();
			case FumlConfigurationPackage.TRACED_ACTOR_CONFIGURATION: return createTracedActorConfiguration();
			case FumlConfigurationPackage.TRACED_ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: return createTracedAddStructuralFeatureValueActionConfiguration();
			case FumlConfigurationPackage.TRACED_ADD_VARIABLE_VALUE_ACTION_CONFIGURATION: return createTracedAddVariableValueActionConfiguration();
			case FumlConfigurationPackage.TRACED_ANY_RECEIVE_EVENT_CONFIGURATION: return createTracedAnyReceiveEventConfiguration();
			case FumlConfigurationPackage.TRACED_ARTIFACT_CONFIGURATION: return createTracedArtifactConfiguration();
			case FumlConfigurationPackage.TRACED_ASSOCIATION_CLASS_CONFIGURATION: return createTracedAssociationClassConfiguration();
			case FumlConfigurationPackage.TRACED_ASSOCIATION_CONFIGURATION: return createTracedAssociationConfiguration();
			case FumlConfigurationPackage.TRACED_BEHAVIOR_CONFIGURATION: return createTracedBehaviorConfiguration();
			case FumlConfigurationPackage.TRACED_BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION: return createTracedBehaviorExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_BEHAVIORAL_FEATURE_CONFIGURATION: return createTracedBehavioralFeatureConfiguration();
			case FumlConfigurationPackage.TRACED_BEHAVIORED_CLASSIFIER_CONFIGURATION: return createTracedBehavioredClassifierConfiguration();
			case FumlConfigurationPackage.TRACED_BROADCAST_SIGNAL_ACTION_CONFIGURATION: return createTracedBroadcastSignalActionConfiguration();
			case FumlConfigurationPackage.TRACED_CALL_ACTION_CONFIGURATION: return createTracedCallActionConfiguration();
			case FumlConfigurationPackage.TRACED_CALL_BEHAVIOR_ACTION_CONFIGURATION: return createTracedCallBehaviorActionConfiguration();
			case FumlConfigurationPackage.TRACED_CALL_EVENT_CONFIGURATION: return createTracedCallEventConfiguration();
			case FumlConfigurationPackage.TRACED_CALL_OPERATION_ACTION_CONFIGURATION: return createTracedCallOperationActionConfiguration();
			case FumlConfigurationPackage.TRACED_CENTRAL_BUFFER_NODE_CONFIGURATION: return createTracedCentralBufferNodeConfiguration();
			case FumlConfigurationPackage.TRACED_CHANGE_EVENT_CONFIGURATION: return createTracedChangeEventConfiguration();
			case FumlConfigurationPackage.TRACED_CLASS_CONFIGURATION: return createTracedClassConfiguration();
			case FumlConfigurationPackage.TRACED_CLASSIFIER_CONFIGURATION: return createTracedClassifierConfiguration();
			case FumlConfigurationPackage.TRACED_CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION: return createTracedClassifierTemplateParameterConfiguration();
			case FumlConfigurationPackage.TRACED_CLAUSE_CONFIGURATION: return createTracedClauseConfiguration();
			case FumlConfigurationPackage.TRACED_CLEAR_ASSOCIATION_ACTION_CONFIGURATION: return createTracedClearAssociationActionConfiguration();
			case FumlConfigurationPackage.TRACED_CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createTracedClearStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.TRACED_CLEAR_VARIABLE_ACTION_CONFIGURATION: return createTracedClearVariableActionConfiguration();
			case FumlConfigurationPackage.TRACED_COLLABORATION_CONFIGURATION: return createTracedCollaborationConfiguration();
			case FumlConfigurationPackage.TRACED_COLLABORATION_USE_CONFIGURATION: return createTracedCollaborationUseConfiguration();
			case FumlConfigurationPackage.TRACED_COMBINED_FRAGMENT_CONFIGURATION: return createTracedCombinedFragmentConfiguration();
			case FumlConfigurationPackage.TRACED_COMMENT_CONFIGURATION: return createTracedCommentConfiguration();
			case FumlConfigurationPackage.TRACED_COMMUNICATION_PATH_CONFIGURATION: return createTracedCommunicationPathConfiguration();
			case FumlConfigurationPackage.TRACED_COMPONENT_CONFIGURATION: return createTracedComponentConfiguration();
			case FumlConfigurationPackage.TRACED_COMPONENT_REALIZATION_CONFIGURATION: return createTracedComponentRealizationConfiguration();
			case FumlConfigurationPackage.TRACED_CONDITIONAL_NODE_CONFIGURATION: return createTracedConditionalNodeConfiguration();
			case FumlConfigurationPackage.TRACED_CONNECTABLE_ELEMENT_CONFIGURATION: return createTracedConnectableElementConfiguration();
			case FumlConfigurationPackage.TRACED_CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION: return createTracedConnectableElementTemplateParameterConfiguration();
			case FumlConfigurationPackage.TRACED_CONNECTION_POINT_REFERENCE_CONFIGURATION: return createTracedConnectionPointReferenceConfiguration();
			case FumlConfigurationPackage.TRACED_CONNECTOR_CONFIGURATION: return createTracedConnectorConfiguration();
			case FumlConfigurationPackage.TRACED_CONNECTOR_END_CONFIGURATION: return createTracedConnectorEndConfiguration();
			case FumlConfigurationPackage.TRACED_CONSIDER_IGNORE_FRAGMENT_CONFIGURATION: return createTracedConsiderIgnoreFragmentConfiguration();
			case FumlConfigurationPackage.TRACED_CONSTRAINT_CONFIGURATION: return createTracedConstraintConfiguration();
			case FumlConfigurationPackage.TRACED_CONTINUATION_CONFIGURATION: return createTracedContinuationConfiguration();
			case FumlConfigurationPackage.TRACED_CONTROL_FLOW_CONFIGURATION: return createTracedControlFlowConfiguration();
			case FumlConfigurationPackage.TRACED_CONTROL_NODE_CONFIGURATION: return createTracedControlNodeConfiguration();
			case FumlConfigurationPackage.TRACED_CREATE_LINK_ACTION_CONFIGURATION: return createTracedCreateLinkActionConfiguration();
			case FumlConfigurationPackage.TRACED_CREATE_LINK_OBJECT_ACTION_CONFIGURATION: return createTracedCreateLinkObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_CREATE_OBJECT_ACTION_CONFIGURATION: return createTracedCreateObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_DATA_STORE_NODE_CONFIGURATION: return createTracedDataStoreNodeConfiguration();
			case FumlConfigurationPackage.TRACED_DATA_TYPE_CONFIGURATION: return createTracedDataTypeConfiguration();
			case FumlConfigurationPackage.TRACED_DECISION_NODE_CONFIGURATION: return createTracedDecisionNodeConfiguration();
			case FumlConfigurationPackage.TRACED_DEPENDENCY_CONFIGURATION: return createTracedDependencyConfiguration();
			case FumlConfigurationPackage.TRACED_DEPLOYED_ARTIFACT_CONFIGURATION: return createTracedDeployedArtifactConfiguration();
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_CONFIGURATION: return createTracedDeploymentConfiguration();
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_SPECIFICATION_CONFIGURATION: return createTracedDeploymentSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_DEPLOYMENT_TARGET_CONFIGURATION: return createTracedDeploymentTargetConfiguration();
			case FumlConfigurationPackage.TRACED_DESTROY_LINK_ACTION_CONFIGURATION: return createTracedDestroyLinkActionConfiguration();
			case FumlConfigurationPackage.TRACED_DESTROY_OBJECT_ACTION_CONFIGURATION: return createTracedDestroyObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createTracedDestructionOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_DEVICE_CONFIGURATION: return createTracedDeviceConfiguration();
			case FumlConfigurationPackage.TRACED_DIRECTED_RELATIONSHIP_CONFIGURATION: return createTracedDirectedRelationshipConfiguration();
			case FumlConfigurationPackage.TRACED_DURATION_CONFIGURATION: return createTracedDurationConfiguration();
			case FumlConfigurationPackage.TRACED_DURATION_CONSTRAINT_CONFIGURATION: return createTracedDurationConstraintConfiguration();
			case FumlConfigurationPackage.TRACED_DURATION_INTERVAL_CONFIGURATION: return createTracedDurationIntervalConfiguration();
			case FumlConfigurationPackage.TRACED_DURATION_OBSERVATION_CONFIGURATION: return createTracedDurationObservationConfiguration();
			case FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION: return createTracedElementConfiguration();
			case FumlConfigurationPackage.TRACED_ELEMENT_IMPORT_CONFIGURATION: return createTracedElementImportConfiguration();
			case FumlConfigurationPackage.TRACED_ENCAPSULATED_CLASSIFIER_CONFIGURATION: return createTracedEncapsulatedClassifierConfiguration();
			case FumlConfigurationPackage.TRACED_ENUMERATION_CONFIGURATION: return createTracedEnumerationConfiguration();
			case FumlConfigurationPackage.TRACED_ENUMERATION_LITERAL_CONFIGURATION: return createTracedEnumerationLiteralConfiguration();
			case FumlConfigurationPackage.TRACED_EVENT_CONFIGURATION: return createTracedEventConfiguration();
			case FumlConfigurationPackage.TRACED_EXCEPTION_HANDLER_CONFIGURATION: return createTracedExceptionHandlerConfiguration();
			case FumlConfigurationPackage.TRACED_EXECUTABLE_NODE_CONFIGURATION: return createTracedExecutableNodeConfiguration();
			case FumlConfigurationPackage.TRACED_EXECUTION_ENVIRONMENT_CONFIGURATION: return createTracedExecutionEnvironmentConfiguration();
			case FumlConfigurationPackage.TRACED_EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createTracedExecutionOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_EXECUTION_SPECIFICATION_CONFIGURATION: return createTracedExecutionSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_EXPANSION_NODE_CONFIGURATION: return createTracedExpansionNodeConfiguration();
			case FumlConfigurationPackage.TRACED_EXPANSION_REGION_CONFIGURATION: return createTracedExpansionRegionConfiguration();
			case FumlConfigurationPackage.TRACED_EXPRESSION_CONFIGURATION: return createTracedExpressionConfiguration();
			case FumlConfigurationPackage.TRACED_EXTEND_CONFIGURATION: return createTracedExtendConfiguration();
			case FumlConfigurationPackage.TRACED_EXTENSION_CONFIGURATION: return createTracedExtensionConfiguration();
			case FumlConfigurationPackage.TRACED_EXTENSION_END_CONFIGURATION: return createTracedExtensionEndConfiguration();
			case FumlConfigurationPackage.TRACED_EXTENSION_POINT_CONFIGURATION: return createTracedExtensionPointConfiguration();
			case FumlConfigurationPackage.TRACED_FEATURE_CONFIGURATION: return createTracedFeatureConfiguration();
			case FumlConfigurationPackage.TRACED_FINAL_NODE_CONFIGURATION: return createTracedFinalNodeConfiguration();
			case FumlConfigurationPackage.TRACED_FINAL_STATE_CONFIGURATION: return createTracedFinalStateConfiguration();
			case FumlConfigurationPackage.TRACED_FLOW_FINAL_NODE_CONFIGURATION: return createTracedFlowFinalNodeConfiguration();
			case FumlConfigurationPackage.TRACED_FORK_NODE_CONFIGURATION: return createTracedForkNodeConfiguration();
			case FumlConfigurationPackage.TRACED_FUNCTION_BEHAVIOR_CONFIGURATION: return createTracedFunctionBehaviorConfiguration();
			case FumlConfigurationPackage.TRACED_GATE_CONFIGURATION: return createTracedGateConfiguration();
			case FumlConfigurationPackage.TRACED_GENERAL_ORDERING_CONFIGURATION: return createTracedGeneralOrderingConfiguration();
			case FumlConfigurationPackage.TRACED_GENERALIZATION_CONFIGURATION: return createTracedGeneralizationConfiguration();
			case FumlConfigurationPackage.TRACED_GENERALIZATION_SET_CONFIGURATION: return createTracedGeneralizationSetConfiguration();
			case FumlConfigurationPackage.TRACED_IMAGE_CONFIGURATION: return createTracedImageConfiguration();
			case FumlConfigurationPackage.TRACED_INCLUDE_CONFIGURATION: return createTracedIncludeConfiguration();
			case FumlConfigurationPackage.TRACED_INFORMATION_FLOW_CONFIGURATION: return createTracedInformationFlowConfiguration();
			case FumlConfigurationPackage.TRACED_INFORMATION_ITEM_CONFIGURATION: return createTracedInformationItemConfiguration();
			case FumlConfigurationPackage.TRACED_INITIAL_NODE_CONFIGURATION: return createTracedInitialNodeConfiguration();
			case FumlConfigurationPackage.TRACED_INPUT_PIN_CONFIGURATION: return createTracedInputPinConfiguration();
			case FumlConfigurationPackage.TRACED_INSTANCE_SPECIFICATION_CONFIGURATION: return createTracedInstanceSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_INSTANCE_VALUE_CONFIGURATION: return createTracedInstanceValueConfiguration();
			case FumlConfigurationPackage.TRACED_INTERACTION_CONFIGURATION: return createTracedInteractionConfiguration();
			case FumlConfigurationPackage.TRACED_INTERACTION_CONSTRAINT_CONFIGURATION: return createTracedInteractionConstraintConfiguration();
			case FumlConfigurationPackage.TRACED_INTERACTION_FRAGMENT_CONFIGURATION: return createTracedInteractionFragmentConfiguration();
			case FumlConfigurationPackage.TRACED_INTERACTION_OPERAND_CONFIGURATION: return createTracedInteractionOperandConfiguration();
			case FumlConfigurationPackage.TRACED_INTERACTION_USE_CONFIGURATION: return createTracedInteractionUseConfiguration();
			case FumlConfigurationPackage.TRACED_INTERFACE_CONFIGURATION: return createTracedInterfaceConfiguration();
			case FumlConfigurationPackage.TRACED_INTERFACE_REALIZATION_CONFIGURATION: return createTracedInterfaceRealizationConfiguration();
			case FumlConfigurationPackage.TRACED_INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION: return createTracedInterruptibleActivityRegionConfiguration();
			case FumlConfigurationPackage.TRACED_INTERVAL_CONFIGURATION: return createTracedIntervalConfiguration();
			case FumlConfigurationPackage.TRACED_INTERVAL_CONSTRAINT_CONFIGURATION: return createTracedIntervalConstraintConfiguration();
			case FumlConfigurationPackage.TRACED_INVOCATION_ACTION_CONFIGURATION: return createTracedInvocationActionConfiguration();
			case FumlConfigurationPackage.TRACED_JOIN_NODE_CONFIGURATION: return createTracedJoinNodeConfiguration();
			case FumlConfigurationPackage.TRACED_LIFELINE_CONFIGURATION: return createTracedLifelineConfiguration();
			case FumlConfigurationPackage.TRACED_LINK_ACTION_CONFIGURATION: return createTracedLinkActionConfiguration();
			case FumlConfigurationPackage.TRACED_LINK_END_CREATION_DATA_CONFIGURATION: return createTracedLinkEndCreationDataConfiguration();
			case FumlConfigurationPackage.TRACED_LINK_END_DATA_CONFIGURATION: return createTracedLinkEndDataConfiguration();
			case FumlConfigurationPackage.TRACED_LINK_END_DESTRUCTION_DATA_CONFIGURATION: return createTracedLinkEndDestructionDataConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_BOOLEAN_CONFIGURATION: return createTracedLiteralBooleanConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_INTEGER_CONFIGURATION: return createTracedLiteralIntegerConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_NULL_CONFIGURATION: return createTracedLiteralNullConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_REAL_CONFIGURATION: return createTracedLiteralRealConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_SPECIFICATION_CONFIGURATION: return createTracedLiteralSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_STRING_CONFIGURATION: return createTracedLiteralStringConfiguration();
			case FumlConfigurationPackage.TRACED_LITERAL_UNLIMITED_NATURAL_CONFIGURATION: return createTracedLiteralUnlimitedNaturalConfiguration();
			case FumlConfigurationPackage.TRACED_LOOP_NODE_CONFIGURATION: return createTracedLoopNodeConfiguration();
			case FumlConfigurationPackage.TRACED_MANIFESTATION_CONFIGURATION: return createTracedManifestationConfiguration();
			case FumlConfigurationPackage.TRACED_MERGE_NODE_CONFIGURATION: return createTracedMergeNodeConfiguration();
			case FumlConfigurationPackage.TRACED_MESSAGE_CONFIGURATION: return createTracedMessageConfiguration();
			case FumlConfigurationPackage.TRACED_MESSAGE_END_CONFIGURATION: return createTracedMessageEndConfiguration();
			case FumlConfigurationPackage.TRACED_MESSAGE_EVENT_CONFIGURATION: return createTracedMessageEventConfiguration();
			case FumlConfigurationPackage.TRACED_MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createTracedMessageOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_MODEL_CONFIGURATION: return createTracedModelConfiguration();
			case FumlConfigurationPackage.TRACED_MULTIPLICITY_ELEMENT_CONFIGURATION: return createTracedMultiplicityElementConfiguration();
			case FumlConfigurationPackage.TRACED_NAMED_ELEMENT_CONFIGURATION: return createTracedNamedElementConfiguration();
			case FumlConfigurationPackage.TRACED_NAMESPACE_CONFIGURATION: return createTracedNamespaceConfiguration();
			case FumlConfigurationPackage.TRACED_NODE_CONFIGURATION: return createTracedNodeConfiguration();
			case FumlConfigurationPackage.TRACED_OBJECT_FLOW_CONFIGURATION: return createTracedObjectFlowConfiguration();
			case FumlConfigurationPackage.TRACED_OBJECT_NODE_CONFIGURATION: return createTracedObjectNodeConfiguration();
			case FumlConfigurationPackage.TRACED_OBSERVATION_CONFIGURATION: return createTracedObservationConfiguration();
			case FumlConfigurationPackage.TRACED_OCCURRENCE_SPECIFICATION_CONFIGURATION: return createTracedOccurrenceSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_OPAQUE_ACTION_CONFIGURATION: return createTracedOpaqueActionConfiguration();
			case FumlConfigurationPackage.TRACED_OPAQUE_BEHAVIOR_CONFIGURATION: return createTracedOpaqueBehaviorConfiguration();
			case FumlConfigurationPackage.TRACED_OPAQUE_EXPRESSION_CONFIGURATION: return createTracedOpaqueExpressionConfiguration();
			case FumlConfigurationPackage.TRACED_OPERATION_CONFIGURATION: return createTracedOperationConfiguration();
			case FumlConfigurationPackage.TRACED_OPERATION_TEMPLATE_PARAMETER_CONFIGURATION: return createTracedOperationTemplateParameterConfiguration();
			case FumlConfigurationPackage.TRACED_OUTPUT_PIN_CONFIGURATION: return createTracedOutputPinConfiguration();
			case FumlConfigurationPackage.TRACED_PACKAGE_CONFIGURATION: return createTracedPackageConfiguration();
			case FumlConfigurationPackage.TRACED_PACKAGE_IMPORT_CONFIGURATION: return createTracedPackageImportConfiguration();
			case FumlConfigurationPackage.TRACED_PACKAGE_MERGE_CONFIGURATION: return createTracedPackageMergeConfiguration();
			case FumlConfigurationPackage.TRACED_PACKAGEABLE_ELEMENT_CONFIGURATION: return createTracedPackageableElementConfiguration();
			case FumlConfigurationPackage.TRACED_PARAMETER_CONFIGURATION: return createTracedParameterConfiguration();
			case FumlConfigurationPackage.TRACED_PARAMETER_SET_CONFIGURATION: return createTracedParameterSetConfiguration();
			case FumlConfigurationPackage.TRACED_PARAMETERABLE_ELEMENT_CONFIGURATION: return createTracedParameterableElementConfiguration();
			case FumlConfigurationPackage.TRACED_PART_DECOMPOSITION_CONFIGURATION: return createTracedPartDecompositionConfiguration();
			case FumlConfigurationPackage.TRACED_PIN_CONFIGURATION: return createTracedPinConfiguration();
			case FumlConfigurationPackage.TRACED_PORT_CONFIGURATION: return createTracedPortConfiguration();
			case FumlConfigurationPackage.TRACED_PRIMITIVE_TYPE_CONFIGURATION: return createTracedPrimitiveTypeConfiguration();
			case FumlConfigurationPackage.TRACED_PROFILE_APPLICATION_CONFIGURATION: return createTracedProfileApplicationConfiguration();
			case FumlConfigurationPackage.TRACED_PROFILE_CONFIGURATION: return createTracedProfileConfiguration();
			case FumlConfigurationPackage.TRACED_PROPERTY_CONFIGURATION: return createTracedPropertyConfiguration();
			case FumlConfigurationPackage.TRACED_PROTOCOL_CONFORMANCE_CONFIGURATION: return createTracedProtocolConformanceConfiguration();
			case FumlConfigurationPackage.TRACED_PROTOCOL_STATE_MACHINE_CONFIGURATION: return createTracedProtocolStateMachineConfiguration();
			case FumlConfigurationPackage.TRACED_PROTOCOL_TRANSITION_CONFIGURATION: return createTracedProtocolTransitionConfiguration();
			case FumlConfigurationPackage.TRACED_PSEUDOSTATE_CONFIGURATION: return createTracedPseudostateConfiguration();
			case FumlConfigurationPackage.TRACED_QUALIFIER_VALUE_CONFIGURATION: return createTracedQualifierValueConfiguration();
			case FumlConfigurationPackage.TRACED_RAISE_EXCEPTION_ACTION_CONFIGURATION: return createTracedRaiseExceptionActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_EXTENT_ACTION_CONFIGURATION: return createTracedReadExtentActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION: return createTracedReadIsClassifiedObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_LINK_ACTION_CONFIGURATION: return createTracedReadLinkActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_LINK_OBJECT_END_ACTION_CONFIGURATION: return createTracedReadLinkObjectEndActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION: return createTracedReadLinkObjectEndQualifierActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_SELF_ACTION_CONFIGURATION: return createTracedReadSelfActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createTracedReadStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.TRACED_READ_VARIABLE_ACTION_CONFIGURATION: return createTracedReadVariableActionConfiguration();
			case FumlConfigurationPackage.TRACED_REALIZATION_CONFIGURATION: return createTracedRealizationConfiguration();
			case FumlConfigurationPackage.TRACED_RECEPTION_CONFIGURATION: return createTracedReceptionConfiguration();
			case FumlConfigurationPackage.TRACED_RECLASSIFY_OBJECT_ACTION_CONFIGURATION: return createTracedReclassifyObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_REDEFINABLE_ELEMENT_CONFIGURATION: return createTracedRedefinableElementConfiguration();
			case FumlConfigurationPackage.TRACED_REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION: return createTracedRedefinableTemplateSignatureConfiguration();
			case FumlConfigurationPackage.TRACED_REDUCE_ACTION_CONFIGURATION: return createTracedReduceActionConfiguration();
			case FumlConfigurationPackage.TRACED_REGION_CONFIGURATION: return createTracedRegionConfiguration();
			case FumlConfigurationPackage.TRACED_RELATIONSHIP_CONFIGURATION: return createTracedRelationshipConfiguration();
			case FumlConfigurationPackage.TRACED_REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: return createTracedRemoveStructuralFeatureValueActionConfiguration();
			case FumlConfigurationPackage.TRACED_REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION: return createTracedRemoveVariableValueActionConfiguration();
			case FumlConfigurationPackage.TRACED_REPLY_ACTION_CONFIGURATION: return createTracedReplyActionConfiguration();
			case FumlConfigurationPackage.TRACED_SEND_OBJECT_ACTION_CONFIGURATION: return createTracedSendObjectActionConfiguration();
			case FumlConfigurationPackage.TRACED_SEND_SIGNAL_ACTION_CONFIGURATION: return createTracedSendSignalActionConfiguration();
			case FumlConfigurationPackage.TRACED_SEQUENCE_NODE_CONFIGURATION: return createTracedSequenceNodeConfiguration();
			case FumlConfigurationPackage.TRACED_SIGNAL_CONFIGURATION: return createTracedSignalConfiguration();
			case FumlConfigurationPackage.TRACED_SIGNAL_EVENT_CONFIGURATION: return createTracedSignalEventConfiguration();
			case FumlConfigurationPackage.TRACED_SLOT_CONFIGURATION: return createTracedSlotConfiguration();
			case FumlConfigurationPackage.TRACED_START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION: return createTracedStartClassifierBehaviorActionConfiguration();
			case FumlConfigurationPackage.TRACED_START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION: return createTracedStartObjectBehaviorActionConfiguration();
			case FumlConfigurationPackage.TRACED_STATE_CONFIGURATION: return createTracedStateConfiguration();
			case FumlConfigurationPackage.TRACED_STATE_INVARIANT_CONFIGURATION: return createTracedStateInvariantConfiguration();
			case FumlConfigurationPackage.TRACED_STATE_MACHINE_CONFIGURATION: return createTracedStateMachineConfiguration();
			case FumlConfigurationPackage.TRACED_STEREOTYPE_CONFIGURATION: return createTracedStereotypeConfiguration();
			case FumlConfigurationPackage.TRACED_STRING_EXPRESSION_CONFIGURATION: return createTracedStringExpressionConfiguration();
			case FumlConfigurationPackage.TRACED_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createTracedStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.TRACED_STRUCTURAL_FEATURE_CONFIGURATION: return createTracedStructuralFeatureConfiguration();
			case FumlConfigurationPackage.TRACED_STRUCTURED_ACTIVITY_NODE_CONFIGURATION: return createTracedStructuredActivityNodeConfiguration();
			case FumlConfigurationPackage.TRACED_STRUCTURED_CLASSIFIER_CONFIGURATION: return createTracedStructuredClassifierConfiguration();
			case FumlConfigurationPackage.TRACED_SUBSTITUTION_CONFIGURATION: return createTracedSubstitutionConfiguration();
			case FumlConfigurationPackage.TRACED_TEMPLATE_BINDING_CONFIGURATION: return createTracedTemplateBindingConfiguration();
			case FumlConfigurationPackage.TRACED_TEMPLATE_PARAMETER_CONFIGURATION: return createTracedTemplateParameterConfiguration();
			case FumlConfigurationPackage.TRACED_TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION: return createTracedTemplateParameterSubstitutionConfiguration();
			case FumlConfigurationPackage.TRACED_TEMPLATE_SIGNATURE_CONFIGURATION: return createTracedTemplateSignatureConfiguration();
			case FumlConfigurationPackage.TRACED_TEMPLATEABLE_ELEMENT_CONFIGURATION: return createTracedTemplateableElementConfiguration();
			case FumlConfigurationPackage.TRACED_TEST_IDENTITY_ACTION_CONFIGURATION: return createTracedTestIdentityActionConfiguration();
			case FumlConfigurationPackage.TRACED_TIME_CONSTRAINT_CONFIGURATION: return createTracedTimeConstraintConfiguration();
			case FumlConfigurationPackage.TRACED_TIME_EVENT_CONFIGURATION: return createTracedTimeEventConfiguration();
			case FumlConfigurationPackage.TRACED_TIME_EXPRESSION_CONFIGURATION: return createTracedTimeExpressionConfiguration();
			case FumlConfigurationPackage.TRACED_TIME_INTERVAL_CONFIGURATION: return createTracedTimeIntervalConfiguration();
			case FumlConfigurationPackage.TRACED_TIME_OBSERVATION_CONFIGURATION: return createTracedTimeObservationConfiguration();
			case FumlConfigurationPackage.TRACED_TRANSITION_CONFIGURATION: return createTracedTransitionConfiguration();
			case FumlConfigurationPackage.TRACED_TRIGGER_CONFIGURATION: return createTracedTriggerConfiguration();
			case FumlConfigurationPackage.TRACED_TYPE_CONFIGURATION: return createTracedTypeConfiguration();
			case FumlConfigurationPackage.TRACED_TYPED_ELEMENT_CONFIGURATION: return createTracedTypedElementConfiguration();
			case FumlConfigurationPackage.TRACED_UNMARSHALL_ACTION_CONFIGURATION: return createTracedUnmarshallActionConfiguration();
			case FumlConfigurationPackage.TRACED_USAGE_CONFIGURATION: return createTracedUsageConfiguration();
			case FumlConfigurationPackage.TRACED_USE_CASE_CONFIGURATION: return createTracedUseCaseConfiguration();
			case FumlConfigurationPackage.TRACED_VALUE_PIN_CONFIGURATION: return createTracedValuePinConfiguration();
			case FumlConfigurationPackage.TRACED_VALUE_SPECIFICATION_ACTION_CONFIGURATION: return createTracedValueSpecificationActionConfiguration();
			case FumlConfigurationPackage.TRACED_VALUE_SPECIFICATION_CONFIGURATION: return createTracedValueSpecificationConfiguration();
			case FumlConfigurationPackage.TRACED_VARIABLE_ACTION_CONFIGURATION: return createTracedVariableActionConfiguration();
			case FumlConfigurationPackage.TRACED_VARIABLE_CONFIGURATION: return createTracedVariableConfiguration();
			case FumlConfigurationPackage.TRACED_VERTEX_CONFIGURATION: return createTracedVertexConfiguration();
			case FumlConfigurationPackage.TRACED_WRITE_LINK_ACTION_CONFIGURATION: return createTracedWriteLinkActionConfiguration();
			case FumlConfigurationPackage.TRACED_WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: return createTracedWriteStructuralFeatureActionConfiguration();
			case FumlConfigurationPackage.TRACED_WRITE_VARIABLE_ACTION_CONFIGURATION: return createTracedWriteVariableActionConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAbstractionConfiguration createTracedAbstractionConfiguration() {
		TracedAbstractionConfigurationImpl tracedAbstractionConfiguration = new TracedAbstractionConfigurationImpl();
		return tracedAbstractionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAcceptCallActionConfiguration createTracedAcceptCallActionConfiguration() {
		TracedAcceptCallActionConfigurationImpl tracedAcceptCallActionConfiguration = new TracedAcceptCallActionConfigurationImpl();
		return tracedAcceptCallActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAcceptEventActionConfiguration createTracedAcceptEventActionConfiguration() {
		TracedAcceptEventActionConfigurationImpl tracedAcceptEventActionConfiguration = new TracedAcceptEventActionConfigurationImpl();
		return tracedAcceptEventActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActionConfiguration createTracedActionConfiguration() {
		TracedActionConfigurationImpl tracedActionConfiguration = new TracedActionConfigurationImpl();
		return tracedActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActionExecutionSpecificationConfiguration createTracedActionExecutionSpecificationConfiguration() {
		TracedActionExecutionSpecificationConfigurationImpl tracedActionExecutionSpecificationConfiguration = new TracedActionExecutionSpecificationConfigurationImpl();
		return tracedActionExecutionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActionInputPinConfiguration createTracedActionInputPinConfiguration() {
		TracedActionInputPinConfigurationImpl tracedActionInputPinConfiguration = new TracedActionInputPinConfigurationImpl();
		return tracedActionInputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityConfiguration createTracedActivityConfiguration() {
		TracedActivityConfigurationImpl tracedActivityConfiguration = new TracedActivityConfigurationImpl();
		return tracedActivityConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityContentConfiguration createTracedActivityContentConfiguration() {
		TracedActivityContentConfigurationImpl tracedActivityContentConfiguration = new TracedActivityContentConfigurationImpl();
		return tracedActivityContentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityEdgeConfiguration createTracedActivityEdgeConfiguration() {
		TracedActivityEdgeConfigurationImpl tracedActivityEdgeConfiguration = new TracedActivityEdgeConfigurationImpl();
		return tracedActivityEdgeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityFinalNodeConfiguration createTracedActivityFinalNodeConfiguration() {
		TracedActivityFinalNodeConfigurationImpl tracedActivityFinalNodeConfiguration = new TracedActivityFinalNodeConfigurationImpl();
		return tracedActivityFinalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityGroupConfiguration createTracedActivityGroupConfiguration() {
		TracedActivityGroupConfigurationImpl tracedActivityGroupConfiguration = new TracedActivityGroupConfigurationImpl();
		return tracedActivityGroupConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityNodeConfiguration createTracedActivityNodeConfiguration() {
		TracedActivityNodeConfigurationImpl tracedActivityNodeConfiguration = new TracedActivityNodeConfigurationImpl();
		return tracedActivityNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityParameterNodeConfiguration createTracedActivityParameterNodeConfiguration() {
		TracedActivityParameterNodeConfigurationImpl tracedActivityParameterNodeConfiguration = new TracedActivityParameterNodeConfigurationImpl();
		return tracedActivityParameterNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActivityPartitionConfiguration createTracedActivityPartitionConfiguration() {
		TracedActivityPartitionConfigurationImpl tracedActivityPartitionConfiguration = new TracedActivityPartitionConfigurationImpl();
		return tracedActivityPartitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedActorConfiguration createTracedActorConfiguration() {
		TracedActorConfigurationImpl tracedActorConfiguration = new TracedActorConfigurationImpl();
		return tracedActorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAddStructuralFeatureValueActionConfiguration createTracedAddStructuralFeatureValueActionConfiguration() {
		TracedAddStructuralFeatureValueActionConfigurationImpl tracedAddStructuralFeatureValueActionConfiguration = new TracedAddStructuralFeatureValueActionConfigurationImpl();
		return tracedAddStructuralFeatureValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAddVariableValueActionConfiguration createTracedAddVariableValueActionConfiguration() {
		TracedAddVariableValueActionConfigurationImpl tracedAddVariableValueActionConfiguration = new TracedAddVariableValueActionConfigurationImpl();
		return tracedAddVariableValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAnyReceiveEventConfiguration createTracedAnyReceiveEventConfiguration() {
		TracedAnyReceiveEventConfigurationImpl tracedAnyReceiveEventConfiguration = new TracedAnyReceiveEventConfigurationImpl();
		return tracedAnyReceiveEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedArtifactConfiguration createTracedArtifactConfiguration() {
		TracedArtifactConfigurationImpl tracedArtifactConfiguration = new TracedArtifactConfigurationImpl();
		return tracedArtifactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAssociationClassConfiguration createTracedAssociationClassConfiguration() {
		TracedAssociationClassConfigurationImpl tracedAssociationClassConfiguration = new TracedAssociationClassConfigurationImpl();
		return tracedAssociationClassConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedAssociationConfiguration createTracedAssociationConfiguration() {
		TracedAssociationConfigurationImpl tracedAssociationConfiguration = new TracedAssociationConfigurationImpl();
		return tracedAssociationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBehaviorConfiguration createTracedBehaviorConfiguration() {
		TracedBehaviorConfigurationImpl tracedBehaviorConfiguration = new TracedBehaviorConfigurationImpl();
		return tracedBehaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBehaviorExecutionSpecificationConfiguration createTracedBehaviorExecutionSpecificationConfiguration() {
		TracedBehaviorExecutionSpecificationConfigurationImpl tracedBehaviorExecutionSpecificationConfiguration = new TracedBehaviorExecutionSpecificationConfigurationImpl();
		return tracedBehaviorExecutionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBehavioralFeatureConfiguration createTracedBehavioralFeatureConfiguration() {
		TracedBehavioralFeatureConfigurationImpl tracedBehavioralFeatureConfiguration = new TracedBehavioralFeatureConfigurationImpl();
		return tracedBehavioralFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBehavioredClassifierConfiguration createTracedBehavioredClassifierConfiguration() {
		TracedBehavioredClassifierConfigurationImpl tracedBehavioredClassifierConfiguration = new TracedBehavioredClassifierConfigurationImpl();
		return tracedBehavioredClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedBroadcastSignalActionConfiguration createTracedBroadcastSignalActionConfiguration() {
		TracedBroadcastSignalActionConfigurationImpl tracedBroadcastSignalActionConfiguration = new TracedBroadcastSignalActionConfigurationImpl();
		return tracedBroadcastSignalActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallActionConfiguration createTracedCallActionConfiguration() {
		TracedCallActionConfigurationImpl tracedCallActionConfiguration = new TracedCallActionConfigurationImpl();
		return tracedCallActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallBehaviorActionConfiguration createTracedCallBehaviorActionConfiguration() {
		TracedCallBehaviorActionConfigurationImpl tracedCallBehaviorActionConfiguration = new TracedCallBehaviorActionConfigurationImpl();
		return tracedCallBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallEventConfiguration createTracedCallEventConfiguration() {
		TracedCallEventConfigurationImpl tracedCallEventConfiguration = new TracedCallEventConfigurationImpl();
		return tracedCallEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCallOperationActionConfiguration createTracedCallOperationActionConfiguration() {
		TracedCallOperationActionConfigurationImpl tracedCallOperationActionConfiguration = new TracedCallOperationActionConfigurationImpl();
		return tracedCallOperationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCentralBufferNodeConfiguration createTracedCentralBufferNodeConfiguration() {
		TracedCentralBufferNodeConfigurationImpl tracedCentralBufferNodeConfiguration = new TracedCentralBufferNodeConfigurationImpl();
		return tracedCentralBufferNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedChangeEventConfiguration createTracedChangeEventConfiguration() {
		TracedChangeEventConfigurationImpl tracedChangeEventConfiguration = new TracedChangeEventConfigurationImpl();
		return tracedChangeEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClassConfiguration createTracedClassConfiguration() {
		TracedClassConfigurationImpl tracedClassConfiguration = new TracedClassConfigurationImpl();
		return tracedClassConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClassifierConfiguration createTracedClassifierConfiguration() {
		TracedClassifierConfigurationImpl tracedClassifierConfiguration = new TracedClassifierConfigurationImpl();
		return tracedClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClassifierTemplateParameterConfiguration createTracedClassifierTemplateParameterConfiguration() {
		TracedClassifierTemplateParameterConfigurationImpl tracedClassifierTemplateParameterConfiguration = new TracedClassifierTemplateParameterConfigurationImpl();
		return tracedClassifierTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClauseConfiguration createTracedClauseConfiguration() {
		TracedClauseConfigurationImpl tracedClauseConfiguration = new TracedClauseConfigurationImpl();
		return tracedClauseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClearAssociationActionConfiguration createTracedClearAssociationActionConfiguration() {
		TracedClearAssociationActionConfigurationImpl tracedClearAssociationActionConfiguration = new TracedClearAssociationActionConfigurationImpl();
		return tracedClearAssociationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClearStructuralFeatureActionConfiguration createTracedClearStructuralFeatureActionConfiguration() {
		TracedClearStructuralFeatureActionConfigurationImpl tracedClearStructuralFeatureActionConfiguration = new TracedClearStructuralFeatureActionConfigurationImpl();
		return tracedClearStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedClearVariableActionConfiguration createTracedClearVariableActionConfiguration() {
		TracedClearVariableActionConfigurationImpl tracedClearVariableActionConfiguration = new TracedClearVariableActionConfigurationImpl();
		return tracedClearVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCollaborationConfiguration createTracedCollaborationConfiguration() {
		TracedCollaborationConfigurationImpl tracedCollaborationConfiguration = new TracedCollaborationConfigurationImpl();
		return tracedCollaborationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCollaborationUseConfiguration createTracedCollaborationUseConfiguration() {
		TracedCollaborationUseConfigurationImpl tracedCollaborationUseConfiguration = new TracedCollaborationUseConfigurationImpl();
		return tracedCollaborationUseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCombinedFragmentConfiguration createTracedCombinedFragmentConfiguration() {
		TracedCombinedFragmentConfigurationImpl tracedCombinedFragmentConfiguration = new TracedCombinedFragmentConfigurationImpl();
		return tracedCombinedFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCommentConfiguration createTracedCommentConfiguration() {
		TracedCommentConfigurationImpl tracedCommentConfiguration = new TracedCommentConfigurationImpl();
		return tracedCommentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCommunicationPathConfiguration createTracedCommunicationPathConfiguration() {
		TracedCommunicationPathConfigurationImpl tracedCommunicationPathConfiguration = new TracedCommunicationPathConfigurationImpl();
		return tracedCommunicationPathConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedComponentConfiguration createTracedComponentConfiguration() {
		TracedComponentConfigurationImpl tracedComponentConfiguration = new TracedComponentConfigurationImpl();
		return tracedComponentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedComponentRealizationConfiguration createTracedComponentRealizationConfiguration() {
		TracedComponentRealizationConfigurationImpl tracedComponentRealizationConfiguration = new TracedComponentRealizationConfigurationImpl();
		return tracedComponentRealizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConditionalNodeConfiguration createTracedConditionalNodeConfiguration() {
		TracedConditionalNodeConfigurationImpl tracedConditionalNodeConfiguration = new TracedConditionalNodeConfigurationImpl();
		return tracedConditionalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectableElementConfiguration createTracedConnectableElementConfiguration() {
		TracedConnectableElementConfigurationImpl tracedConnectableElementConfiguration = new TracedConnectableElementConfigurationImpl();
		return tracedConnectableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectableElementTemplateParameterConfiguration createTracedConnectableElementTemplateParameterConfiguration() {
		TracedConnectableElementTemplateParameterConfigurationImpl tracedConnectableElementTemplateParameterConfiguration = new TracedConnectableElementTemplateParameterConfigurationImpl();
		return tracedConnectableElementTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectionPointReferenceConfiguration createTracedConnectionPointReferenceConfiguration() {
		TracedConnectionPointReferenceConfigurationImpl tracedConnectionPointReferenceConfiguration = new TracedConnectionPointReferenceConfigurationImpl();
		return tracedConnectionPointReferenceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectorConfiguration createTracedConnectorConfiguration() {
		TracedConnectorConfigurationImpl tracedConnectorConfiguration = new TracedConnectorConfigurationImpl();
		return tracedConnectorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConnectorEndConfiguration createTracedConnectorEndConfiguration() {
		TracedConnectorEndConfigurationImpl tracedConnectorEndConfiguration = new TracedConnectorEndConfigurationImpl();
		return tracedConnectorEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConsiderIgnoreFragmentConfiguration createTracedConsiderIgnoreFragmentConfiguration() {
		TracedConsiderIgnoreFragmentConfigurationImpl tracedConsiderIgnoreFragmentConfiguration = new TracedConsiderIgnoreFragmentConfigurationImpl();
		return tracedConsiderIgnoreFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedConstraintConfiguration createTracedConstraintConfiguration() {
		TracedConstraintConfigurationImpl tracedConstraintConfiguration = new TracedConstraintConfigurationImpl();
		return tracedConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedContinuationConfiguration createTracedContinuationConfiguration() {
		TracedContinuationConfigurationImpl tracedContinuationConfiguration = new TracedContinuationConfigurationImpl();
		return tracedContinuationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedControlFlowConfiguration createTracedControlFlowConfiguration() {
		TracedControlFlowConfigurationImpl tracedControlFlowConfiguration = new TracedControlFlowConfigurationImpl();
		return tracedControlFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedControlNodeConfiguration createTracedControlNodeConfiguration() {
		TracedControlNodeConfigurationImpl tracedControlNodeConfiguration = new TracedControlNodeConfigurationImpl();
		return tracedControlNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCreateLinkActionConfiguration createTracedCreateLinkActionConfiguration() {
		TracedCreateLinkActionConfigurationImpl tracedCreateLinkActionConfiguration = new TracedCreateLinkActionConfigurationImpl();
		return tracedCreateLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCreateLinkObjectActionConfiguration createTracedCreateLinkObjectActionConfiguration() {
		TracedCreateLinkObjectActionConfigurationImpl tracedCreateLinkObjectActionConfiguration = new TracedCreateLinkObjectActionConfigurationImpl();
		return tracedCreateLinkObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedCreateObjectActionConfiguration createTracedCreateObjectActionConfiguration() {
		TracedCreateObjectActionConfigurationImpl tracedCreateObjectActionConfiguration = new TracedCreateObjectActionConfigurationImpl();
		return tracedCreateObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDataStoreNodeConfiguration createTracedDataStoreNodeConfiguration() {
		TracedDataStoreNodeConfigurationImpl tracedDataStoreNodeConfiguration = new TracedDataStoreNodeConfigurationImpl();
		return tracedDataStoreNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDataTypeConfiguration createTracedDataTypeConfiguration() {
		TracedDataTypeConfigurationImpl tracedDataTypeConfiguration = new TracedDataTypeConfigurationImpl();
		return tracedDataTypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDecisionNodeConfiguration createTracedDecisionNodeConfiguration() {
		TracedDecisionNodeConfigurationImpl tracedDecisionNodeConfiguration = new TracedDecisionNodeConfigurationImpl();
		return tracedDecisionNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDependencyConfiguration createTracedDependencyConfiguration() {
		TracedDependencyConfigurationImpl tracedDependencyConfiguration = new TracedDependencyConfigurationImpl();
		return tracedDependencyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDeployedArtifactConfiguration createTracedDeployedArtifactConfiguration() {
		TracedDeployedArtifactConfigurationImpl tracedDeployedArtifactConfiguration = new TracedDeployedArtifactConfigurationImpl();
		return tracedDeployedArtifactConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDeploymentConfiguration createTracedDeploymentConfiguration() {
		TracedDeploymentConfigurationImpl tracedDeploymentConfiguration = new TracedDeploymentConfigurationImpl();
		return tracedDeploymentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDeploymentSpecificationConfiguration createTracedDeploymentSpecificationConfiguration() {
		TracedDeploymentSpecificationConfigurationImpl tracedDeploymentSpecificationConfiguration = new TracedDeploymentSpecificationConfigurationImpl();
		return tracedDeploymentSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDeploymentTargetConfiguration createTracedDeploymentTargetConfiguration() {
		TracedDeploymentTargetConfigurationImpl tracedDeploymentTargetConfiguration = new TracedDeploymentTargetConfigurationImpl();
		return tracedDeploymentTargetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDestroyLinkActionConfiguration createTracedDestroyLinkActionConfiguration() {
		TracedDestroyLinkActionConfigurationImpl tracedDestroyLinkActionConfiguration = new TracedDestroyLinkActionConfigurationImpl();
		return tracedDestroyLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDestroyObjectActionConfiguration createTracedDestroyObjectActionConfiguration() {
		TracedDestroyObjectActionConfigurationImpl tracedDestroyObjectActionConfiguration = new TracedDestroyObjectActionConfigurationImpl();
		return tracedDestroyObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDestructionOccurrenceSpecificationConfiguration createTracedDestructionOccurrenceSpecificationConfiguration() {
		TracedDestructionOccurrenceSpecificationConfigurationImpl tracedDestructionOccurrenceSpecificationConfiguration = new TracedDestructionOccurrenceSpecificationConfigurationImpl();
		return tracedDestructionOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDeviceConfiguration createTracedDeviceConfiguration() {
		TracedDeviceConfigurationImpl tracedDeviceConfiguration = new TracedDeviceConfigurationImpl();
		return tracedDeviceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDirectedRelationshipConfiguration createTracedDirectedRelationshipConfiguration() {
		TracedDirectedRelationshipConfigurationImpl tracedDirectedRelationshipConfiguration = new TracedDirectedRelationshipConfigurationImpl();
		return tracedDirectedRelationshipConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDurationConfiguration createTracedDurationConfiguration() {
		TracedDurationConfigurationImpl tracedDurationConfiguration = new TracedDurationConfigurationImpl();
		return tracedDurationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDurationConstraintConfiguration createTracedDurationConstraintConfiguration() {
		TracedDurationConstraintConfigurationImpl tracedDurationConstraintConfiguration = new TracedDurationConstraintConfigurationImpl();
		return tracedDurationConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDurationIntervalConfiguration createTracedDurationIntervalConfiguration() {
		TracedDurationIntervalConfigurationImpl tracedDurationIntervalConfiguration = new TracedDurationIntervalConfigurationImpl();
		return tracedDurationIntervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedDurationObservationConfiguration createTracedDurationObservationConfiguration() {
		TracedDurationObservationConfigurationImpl tracedDurationObservationConfiguration = new TracedDurationObservationConfigurationImpl();
		return tracedDurationObservationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedElementConfiguration createTracedElementConfiguration() {
		TracedElementConfigurationImpl tracedElementConfiguration = new TracedElementConfigurationImpl();
		return tracedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedElementImportConfiguration createTracedElementImportConfiguration() {
		TracedElementImportConfigurationImpl tracedElementImportConfiguration = new TracedElementImportConfigurationImpl();
		return tracedElementImportConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEncapsulatedClassifierConfiguration createTracedEncapsulatedClassifierConfiguration() {
		TracedEncapsulatedClassifierConfigurationImpl tracedEncapsulatedClassifierConfiguration = new TracedEncapsulatedClassifierConfigurationImpl();
		return tracedEncapsulatedClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEnumerationConfiguration createTracedEnumerationConfiguration() {
		TracedEnumerationConfigurationImpl tracedEnumerationConfiguration = new TracedEnumerationConfigurationImpl();
		return tracedEnumerationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEnumerationLiteralConfiguration createTracedEnumerationLiteralConfiguration() {
		TracedEnumerationLiteralConfigurationImpl tracedEnumerationLiteralConfiguration = new TracedEnumerationLiteralConfigurationImpl();
		return tracedEnumerationLiteralConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEventConfiguration createTracedEventConfiguration() {
		TracedEventConfigurationImpl tracedEventConfiguration = new TracedEventConfigurationImpl();
		return tracedEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExceptionHandlerConfiguration createTracedExceptionHandlerConfiguration() {
		TracedExceptionHandlerConfigurationImpl tracedExceptionHandlerConfiguration = new TracedExceptionHandlerConfigurationImpl();
		return tracedExceptionHandlerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutableNodeConfiguration createTracedExecutableNodeConfiguration() {
		TracedExecutableNodeConfigurationImpl tracedExecutableNodeConfiguration = new TracedExecutableNodeConfigurationImpl();
		return tracedExecutableNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionEnvironmentConfiguration createTracedExecutionEnvironmentConfiguration() {
		TracedExecutionEnvironmentConfigurationImpl tracedExecutionEnvironmentConfiguration = new TracedExecutionEnvironmentConfigurationImpl();
		return tracedExecutionEnvironmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionOccurrenceSpecificationConfiguration createTracedExecutionOccurrenceSpecificationConfiguration() {
		TracedExecutionOccurrenceSpecificationConfigurationImpl tracedExecutionOccurrenceSpecificationConfiguration = new TracedExecutionOccurrenceSpecificationConfigurationImpl();
		return tracedExecutionOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExecutionSpecificationConfiguration createTracedExecutionSpecificationConfiguration() {
		TracedExecutionSpecificationConfigurationImpl tracedExecutionSpecificationConfiguration = new TracedExecutionSpecificationConfigurationImpl();
		return tracedExecutionSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExpansionNodeConfiguration createTracedExpansionNodeConfiguration() {
		TracedExpansionNodeConfigurationImpl tracedExpansionNodeConfiguration = new TracedExpansionNodeConfigurationImpl();
		return tracedExpansionNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExpansionRegionConfiguration createTracedExpansionRegionConfiguration() {
		TracedExpansionRegionConfigurationImpl tracedExpansionRegionConfiguration = new TracedExpansionRegionConfigurationImpl();
		return tracedExpansionRegionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExpressionConfiguration createTracedExpressionConfiguration() {
		TracedExpressionConfigurationImpl tracedExpressionConfiguration = new TracedExpressionConfigurationImpl();
		return tracedExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExtendConfiguration createTracedExtendConfiguration() {
		TracedExtendConfigurationImpl tracedExtendConfiguration = new TracedExtendConfigurationImpl();
		return tracedExtendConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExtensionConfiguration createTracedExtensionConfiguration() {
		TracedExtensionConfigurationImpl tracedExtensionConfiguration = new TracedExtensionConfigurationImpl();
		return tracedExtensionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExtensionEndConfiguration createTracedExtensionEndConfiguration() {
		TracedExtensionEndConfigurationImpl tracedExtensionEndConfiguration = new TracedExtensionEndConfigurationImpl();
		return tracedExtensionEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedExtensionPointConfiguration createTracedExtensionPointConfiguration() {
		TracedExtensionPointConfigurationImpl tracedExtensionPointConfiguration = new TracedExtensionPointConfigurationImpl();
		return tracedExtensionPointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFeatureConfiguration createTracedFeatureConfiguration() {
		TracedFeatureConfigurationImpl tracedFeatureConfiguration = new TracedFeatureConfigurationImpl();
		return tracedFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFinalNodeConfiguration createTracedFinalNodeConfiguration() {
		TracedFinalNodeConfigurationImpl tracedFinalNodeConfiguration = new TracedFinalNodeConfigurationImpl();
		return tracedFinalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFinalStateConfiguration createTracedFinalStateConfiguration() {
		TracedFinalStateConfigurationImpl tracedFinalStateConfiguration = new TracedFinalStateConfigurationImpl();
		return tracedFinalStateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFlowFinalNodeConfiguration createTracedFlowFinalNodeConfiguration() {
		TracedFlowFinalNodeConfigurationImpl tracedFlowFinalNodeConfiguration = new TracedFlowFinalNodeConfigurationImpl();
		return tracedFlowFinalNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedForkNodeConfiguration createTracedForkNodeConfiguration() {
		TracedForkNodeConfigurationImpl tracedForkNodeConfiguration = new TracedForkNodeConfigurationImpl();
		return tracedForkNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedFunctionBehaviorConfiguration createTracedFunctionBehaviorConfiguration() {
		TracedFunctionBehaviorConfigurationImpl tracedFunctionBehaviorConfiguration = new TracedFunctionBehaviorConfigurationImpl();
		return tracedFunctionBehaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedGateConfiguration createTracedGateConfiguration() {
		TracedGateConfigurationImpl tracedGateConfiguration = new TracedGateConfigurationImpl();
		return tracedGateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedGeneralOrderingConfiguration createTracedGeneralOrderingConfiguration() {
		TracedGeneralOrderingConfigurationImpl tracedGeneralOrderingConfiguration = new TracedGeneralOrderingConfigurationImpl();
		return tracedGeneralOrderingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedGeneralizationConfiguration createTracedGeneralizationConfiguration() {
		TracedGeneralizationConfigurationImpl tracedGeneralizationConfiguration = new TracedGeneralizationConfigurationImpl();
		return tracedGeneralizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedGeneralizationSetConfiguration createTracedGeneralizationSetConfiguration() {
		TracedGeneralizationSetConfigurationImpl tracedGeneralizationSetConfiguration = new TracedGeneralizationSetConfigurationImpl();
		return tracedGeneralizationSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedImageConfiguration createTracedImageConfiguration() {
		TracedImageConfigurationImpl tracedImageConfiguration = new TracedImageConfigurationImpl();
		return tracedImageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIncludeConfiguration createTracedIncludeConfiguration() {
		TracedIncludeConfigurationImpl tracedIncludeConfiguration = new TracedIncludeConfigurationImpl();
		return tracedIncludeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInformationFlowConfiguration createTracedInformationFlowConfiguration() {
		TracedInformationFlowConfigurationImpl tracedInformationFlowConfiguration = new TracedInformationFlowConfigurationImpl();
		return tracedInformationFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInformationItemConfiguration createTracedInformationItemConfiguration() {
		TracedInformationItemConfigurationImpl tracedInformationItemConfiguration = new TracedInformationItemConfigurationImpl();
		return tracedInformationItemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInitialNodeConfiguration createTracedInitialNodeConfiguration() {
		TracedInitialNodeConfigurationImpl tracedInitialNodeConfiguration = new TracedInitialNodeConfigurationImpl();
		return tracedInitialNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInputPinConfiguration createTracedInputPinConfiguration() {
		TracedInputPinConfigurationImpl tracedInputPinConfiguration = new TracedInputPinConfigurationImpl();
		return tracedInputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInstanceSpecificationConfiguration createTracedInstanceSpecificationConfiguration() {
		TracedInstanceSpecificationConfigurationImpl tracedInstanceSpecificationConfiguration = new TracedInstanceSpecificationConfigurationImpl();
		return tracedInstanceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInstanceValueConfiguration createTracedInstanceValueConfiguration() {
		TracedInstanceValueConfigurationImpl tracedInstanceValueConfiguration = new TracedInstanceValueConfigurationImpl();
		return tracedInstanceValueConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInteractionConfiguration createTracedInteractionConfiguration() {
		TracedInteractionConfigurationImpl tracedInteractionConfiguration = new TracedInteractionConfigurationImpl();
		return tracedInteractionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInteractionConstraintConfiguration createTracedInteractionConstraintConfiguration() {
		TracedInteractionConstraintConfigurationImpl tracedInteractionConstraintConfiguration = new TracedInteractionConstraintConfigurationImpl();
		return tracedInteractionConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInteractionFragmentConfiguration createTracedInteractionFragmentConfiguration() {
		TracedInteractionFragmentConfigurationImpl tracedInteractionFragmentConfiguration = new TracedInteractionFragmentConfigurationImpl();
		return tracedInteractionFragmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInteractionOperandConfiguration createTracedInteractionOperandConfiguration() {
		TracedInteractionOperandConfigurationImpl tracedInteractionOperandConfiguration = new TracedInteractionOperandConfigurationImpl();
		return tracedInteractionOperandConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInteractionUseConfiguration createTracedInteractionUseConfiguration() {
		TracedInteractionUseConfigurationImpl tracedInteractionUseConfiguration = new TracedInteractionUseConfigurationImpl();
		return tracedInteractionUseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInterfaceConfiguration createTracedInterfaceConfiguration() {
		TracedInterfaceConfigurationImpl tracedInterfaceConfiguration = new TracedInterfaceConfigurationImpl();
		return tracedInterfaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInterfaceRealizationConfiguration createTracedInterfaceRealizationConfiguration() {
		TracedInterfaceRealizationConfigurationImpl tracedInterfaceRealizationConfiguration = new TracedInterfaceRealizationConfigurationImpl();
		return tracedInterfaceRealizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInterruptibleActivityRegionConfiguration createTracedInterruptibleActivityRegionConfiguration() {
		TracedInterruptibleActivityRegionConfigurationImpl tracedInterruptibleActivityRegionConfiguration = new TracedInterruptibleActivityRegionConfigurationImpl();
		return tracedInterruptibleActivityRegionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntervalConfiguration createTracedIntervalConfiguration() {
		TracedIntervalConfigurationImpl tracedIntervalConfiguration = new TracedIntervalConfigurationImpl();
		return tracedIntervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedIntervalConstraintConfiguration createTracedIntervalConstraintConfiguration() {
		TracedIntervalConstraintConfigurationImpl tracedIntervalConstraintConfiguration = new TracedIntervalConstraintConfigurationImpl();
		return tracedIntervalConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedInvocationActionConfiguration createTracedInvocationActionConfiguration() {
		TracedInvocationActionConfigurationImpl tracedInvocationActionConfiguration = new TracedInvocationActionConfigurationImpl();
		return tracedInvocationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedJoinNodeConfiguration createTracedJoinNodeConfiguration() {
		TracedJoinNodeConfigurationImpl tracedJoinNodeConfiguration = new TracedJoinNodeConfigurationImpl();
		return tracedJoinNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLifelineConfiguration createTracedLifelineConfiguration() {
		TracedLifelineConfigurationImpl tracedLifelineConfiguration = new TracedLifelineConfigurationImpl();
		return tracedLifelineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLinkActionConfiguration createTracedLinkActionConfiguration() {
		TracedLinkActionConfigurationImpl tracedLinkActionConfiguration = new TracedLinkActionConfigurationImpl();
		return tracedLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLinkEndCreationDataConfiguration createTracedLinkEndCreationDataConfiguration() {
		TracedLinkEndCreationDataConfigurationImpl tracedLinkEndCreationDataConfiguration = new TracedLinkEndCreationDataConfigurationImpl();
		return tracedLinkEndCreationDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLinkEndDataConfiguration createTracedLinkEndDataConfiguration() {
		TracedLinkEndDataConfigurationImpl tracedLinkEndDataConfiguration = new TracedLinkEndDataConfigurationImpl();
		return tracedLinkEndDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLinkEndDestructionDataConfiguration createTracedLinkEndDestructionDataConfiguration() {
		TracedLinkEndDestructionDataConfigurationImpl tracedLinkEndDestructionDataConfiguration = new TracedLinkEndDestructionDataConfigurationImpl();
		return tracedLinkEndDestructionDataConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralBooleanConfiguration createTracedLiteralBooleanConfiguration() {
		TracedLiteralBooleanConfigurationImpl tracedLiteralBooleanConfiguration = new TracedLiteralBooleanConfigurationImpl();
		return tracedLiteralBooleanConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralIntegerConfiguration createTracedLiteralIntegerConfiguration() {
		TracedLiteralIntegerConfigurationImpl tracedLiteralIntegerConfiguration = new TracedLiteralIntegerConfigurationImpl();
		return tracedLiteralIntegerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralNullConfiguration createTracedLiteralNullConfiguration() {
		TracedLiteralNullConfigurationImpl tracedLiteralNullConfiguration = new TracedLiteralNullConfigurationImpl();
		return tracedLiteralNullConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralRealConfiguration createTracedLiteralRealConfiguration() {
		TracedLiteralRealConfigurationImpl tracedLiteralRealConfiguration = new TracedLiteralRealConfigurationImpl();
		return tracedLiteralRealConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralSpecificationConfiguration createTracedLiteralSpecificationConfiguration() {
		TracedLiteralSpecificationConfigurationImpl tracedLiteralSpecificationConfiguration = new TracedLiteralSpecificationConfigurationImpl();
		return tracedLiteralSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralStringConfiguration createTracedLiteralStringConfiguration() {
		TracedLiteralStringConfigurationImpl tracedLiteralStringConfiguration = new TracedLiteralStringConfigurationImpl();
		return tracedLiteralStringConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLiteralUnlimitedNaturalConfiguration createTracedLiteralUnlimitedNaturalConfiguration() {
		TracedLiteralUnlimitedNaturalConfigurationImpl tracedLiteralUnlimitedNaturalConfiguration = new TracedLiteralUnlimitedNaturalConfigurationImpl();
		return tracedLiteralUnlimitedNaturalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedLoopNodeConfiguration createTracedLoopNodeConfiguration() {
		TracedLoopNodeConfigurationImpl tracedLoopNodeConfiguration = new TracedLoopNodeConfigurationImpl();
		return tracedLoopNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedManifestationConfiguration createTracedManifestationConfiguration() {
		TracedManifestationConfigurationImpl tracedManifestationConfiguration = new TracedManifestationConfigurationImpl();
		return tracedManifestationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMergeNodeConfiguration createTracedMergeNodeConfiguration() {
		TracedMergeNodeConfigurationImpl tracedMergeNodeConfiguration = new TracedMergeNodeConfigurationImpl();
		return tracedMergeNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMessageConfiguration createTracedMessageConfiguration() {
		TracedMessageConfigurationImpl tracedMessageConfiguration = new TracedMessageConfigurationImpl();
		return tracedMessageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMessageEndConfiguration createTracedMessageEndConfiguration() {
		TracedMessageEndConfigurationImpl tracedMessageEndConfiguration = new TracedMessageEndConfigurationImpl();
		return tracedMessageEndConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMessageEventConfiguration createTracedMessageEventConfiguration() {
		TracedMessageEventConfigurationImpl tracedMessageEventConfiguration = new TracedMessageEventConfigurationImpl();
		return tracedMessageEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMessageOccurrenceSpecificationConfiguration createTracedMessageOccurrenceSpecificationConfiguration() {
		TracedMessageOccurrenceSpecificationConfigurationImpl tracedMessageOccurrenceSpecificationConfiguration = new TracedMessageOccurrenceSpecificationConfigurationImpl();
		return tracedMessageOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedModelConfiguration createTracedModelConfiguration() {
		TracedModelConfigurationImpl tracedModelConfiguration = new TracedModelConfigurationImpl();
		return tracedModelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedMultiplicityElementConfiguration createTracedMultiplicityElementConfiguration() {
		TracedMultiplicityElementConfigurationImpl tracedMultiplicityElementConfiguration = new TracedMultiplicityElementConfigurationImpl();
		return tracedMultiplicityElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedNamedElementConfiguration createTracedNamedElementConfiguration() {
		TracedNamedElementConfigurationImpl tracedNamedElementConfiguration = new TracedNamedElementConfigurationImpl();
		return tracedNamedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedNamespaceConfiguration createTracedNamespaceConfiguration() {
		TracedNamespaceConfigurationImpl tracedNamespaceConfiguration = new TracedNamespaceConfigurationImpl();
		return tracedNamespaceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedNodeConfiguration createTracedNodeConfiguration() {
		TracedNodeConfigurationImpl tracedNodeConfiguration = new TracedNodeConfigurationImpl();
		return tracedNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjectFlowConfiguration createTracedObjectFlowConfiguration() {
		TracedObjectFlowConfigurationImpl tracedObjectFlowConfiguration = new TracedObjectFlowConfigurationImpl();
		return tracedObjectFlowConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjectNodeConfiguration createTracedObjectNodeConfiguration() {
		TracedObjectNodeConfigurationImpl tracedObjectNodeConfiguration = new TracedObjectNodeConfigurationImpl();
		return tracedObjectNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObservationConfiguration createTracedObservationConfiguration() {
		TracedObservationConfigurationImpl tracedObservationConfiguration = new TracedObservationConfigurationImpl();
		return tracedObservationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOccurrenceSpecificationConfiguration createTracedOccurrenceSpecificationConfiguration() {
		TracedOccurrenceSpecificationConfigurationImpl tracedOccurrenceSpecificationConfiguration = new TracedOccurrenceSpecificationConfigurationImpl();
		return tracedOccurrenceSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueActionConfiguration createTracedOpaqueActionConfiguration() {
		TracedOpaqueActionConfigurationImpl tracedOpaqueActionConfiguration = new TracedOpaqueActionConfigurationImpl();
		return tracedOpaqueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueBehaviorConfiguration createTracedOpaqueBehaviorConfiguration() {
		TracedOpaqueBehaviorConfigurationImpl tracedOpaqueBehaviorConfiguration = new TracedOpaqueBehaviorConfigurationImpl();
		return tracedOpaqueBehaviorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOpaqueExpressionConfiguration createTracedOpaqueExpressionConfiguration() {
		TracedOpaqueExpressionConfigurationImpl tracedOpaqueExpressionConfiguration = new TracedOpaqueExpressionConfigurationImpl();
		return tracedOpaqueExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOperationConfiguration createTracedOperationConfiguration() {
		TracedOperationConfigurationImpl tracedOperationConfiguration = new TracedOperationConfigurationImpl();
		return tracedOperationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOperationTemplateParameterConfiguration createTracedOperationTemplateParameterConfiguration() {
		TracedOperationTemplateParameterConfigurationImpl tracedOperationTemplateParameterConfiguration = new TracedOperationTemplateParameterConfigurationImpl();
		return tracedOperationTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedOutputPinConfiguration createTracedOutputPinConfiguration() {
		TracedOutputPinConfigurationImpl tracedOutputPinConfiguration = new TracedOutputPinConfigurationImpl();
		return tracedOutputPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPackageConfiguration createTracedPackageConfiguration() {
		TracedPackageConfigurationImpl tracedPackageConfiguration = new TracedPackageConfigurationImpl();
		return tracedPackageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPackageImportConfiguration createTracedPackageImportConfiguration() {
		TracedPackageImportConfigurationImpl tracedPackageImportConfiguration = new TracedPackageImportConfigurationImpl();
		return tracedPackageImportConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPackageMergeConfiguration createTracedPackageMergeConfiguration() {
		TracedPackageMergeConfigurationImpl tracedPackageMergeConfiguration = new TracedPackageMergeConfigurationImpl();
		return tracedPackageMergeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPackageableElementConfiguration createTracedPackageableElementConfiguration() {
		TracedPackageableElementConfigurationImpl tracedPackageableElementConfiguration = new TracedPackageableElementConfigurationImpl();
		return tracedPackageableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameterConfiguration createTracedParameterConfiguration() {
		TracedParameterConfigurationImpl tracedParameterConfiguration = new TracedParameterConfigurationImpl();
		return tracedParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameterSetConfiguration createTracedParameterSetConfiguration() {
		TracedParameterSetConfigurationImpl tracedParameterSetConfiguration = new TracedParameterSetConfigurationImpl();
		return tracedParameterSetConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedParameterableElementConfiguration createTracedParameterableElementConfiguration() {
		TracedParameterableElementConfigurationImpl tracedParameterableElementConfiguration = new TracedParameterableElementConfigurationImpl();
		return tracedParameterableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPartDecompositionConfiguration createTracedPartDecompositionConfiguration() {
		TracedPartDecompositionConfigurationImpl tracedPartDecompositionConfiguration = new TracedPartDecompositionConfigurationImpl();
		return tracedPartDecompositionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPinConfiguration createTracedPinConfiguration() {
		TracedPinConfigurationImpl tracedPinConfiguration = new TracedPinConfigurationImpl();
		return tracedPinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPortConfiguration createTracedPortConfiguration() {
		TracedPortConfigurationImpl tracedPortConfiguration = new TracedPortConfigurationImpl();
		return tracedPortConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPrimitiveTypeConfiguration createTracedPrimitiveTypeConfiguration() {
		TracedPrimitiveTypeConfigurationImpl tracedPrimitiveTypeConfiguration = new TracedPrimitiveTypeConfigurationImpl();
		return tracedPrimitiveTypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedProfileApplicationConfiguration createTracedProfileApplicationConfiguration() {
		TracedProfileApplicationConfigurationImpl tracedProfileApplicationConfiguration = new TracedProfileApplicationConfigurationImpl();
		return tracedProfileApplicationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedProfileConfiguration createTracedProfileConfiguration() {
		TracedProfileConfigurationImpl tracedProfileConfiguration = new TracedProfileConfigurationImpl();
		return tracedProfileConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPropertyConfiguration createTracedPropertyConfiguration() {
		TracedPropertyConfigurationImpl tracedPropertyConfiguration = new TracedPropertyConfigurationImpl();
		return tracedPropertyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedProtocolConformanceConfiguration createTracedProtocolConformanceConfiguration() {
		TracedProtocolConformanceConfigurationImpl tracedProtocolConformanceConfiguration = new TracedProtocolConformanceConfigurationImpl();
		return tracedProtocolConformanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedProtocolStateMachineConfiguration createTracedProtocolStateMachineConfiguration() {
		TracedProtocolStateMachineConfigurationImpl tracedProtocolStateMachineConfiguration = new TracedProtocolStateMachineConfigurationImpl();
		return tracedProtocolStateMachineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedProtocolTransitionConfiguration createTracedProtocolTransitionConfiguration() {
		TracedProtocolTransitionConfigurationImpl tracedProtocolTransitionConfiguration = new TracedProtocolTransitionConfigurationImpl();
		return tracedProtocolTransitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedPseudostateConfiguration createTracedPseudostateConfiguration() {
		TracedPseudostateConfigurationImpl tracedPseudostateConfiguration = new TracedPseudostateConfigurationImpl();
		return tracedPseudostateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedQualifierValueConfiguration createTracedQualifierValueConfiguration() {
		TracedQualifierValueConfigurationImpl tracedQualifierValueConfiguration = new TracedQualifierValueConfigurationImpl();
		return tracedQualifierValueConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRaiseExceptionActionConfiguration createTracedRaiseExceptionActionConfiguration() {
		TracedRaiseExceptionActionConfigurationImpl tracedRaiseExceptionActionConfiguration = new TracedRaiseExceptionActionConfigurationImpl();
		return tracedRaiseExceptionActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadExtentActionConfiguration createTracedReadExtentActionConfiguration() {
		TracedReadExtentActionConfigurationImpl tracedReadExtentActionConfiguration = new TracedReadExtentActionConfigurationImpl();
		return tracedReadExtentActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadIsClassifiedObjectActionConfiguration createTracedReadIsClassifiedObjectActionConfiguration() {
		TracedReadIsClassifiedObjectActionConfigurationImpl tracedReadIsClassifiedObjectActionConfiguration = new TracedReadIsClassifiedObjectActionConfigurationImpl();
		return tracedReadIsClassifiedObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadLinkActionConfiguration createTracedReadLinkActionConfiguration() {
		TracedReadLinkActionConfigurationImpl tracedReadLinkActionConfiguration = new TracedReadLinkActionConfigurationImpl();
		return tracedReadLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadLinkObjectEndActionConfiguration createTracedReadLinkObjectEndActionConfiguration() {
		TracedReadLinkObjectEndActionConfigurationImpl tracedReadLinkObjectEndActionConfiguration = new TracedReadLinkObjectEndActionConfigurationImpl();
		return tracedReadLinkObjectEndActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadLinkObjectEndQualifierActionConfiguration createTracedReadLinkObjectEndQualifierActionConfiguration() {
		TracedReadLinkObjectEndQualifierActionConfigurationImpl tracedReadLinkObjectEndQualifierActionConfiguration = new TracedReadLinkObjectEndQualifierActionConfigurationImpl();
		return tracedReadLinkObjectEndQualifierActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadSelfActionConfiguration createTracedReadSelfActionConfiguration() {
		TracedReadSelfActionConfigurationImpl tracedReadSelfActionConfiguration = new TracedReadSelfActionConfigurationImpl();
		return tracedReadSelfActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadStructuralFeatureActionConfiguration createTracedReadStructuralFeatureActionConfiguration() {
		TracedReadStructuralFeatureActionConfigurationImpl tracedReadStructuralFeatureActionConfiguration = new TracedReadStructuralFeatureActionConfigurationImpl();
		return tracedReadStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReadVariableActionConfiguration createTracedReadVariableActionConfiguration() {
		TracedReadVariableActionConfigurationImpl tracedReadVariableActionConfiguration = new TracedReadVariableActionConfigurationImpl();
		return tracedReadVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRealizationConfiguration createTracedRealizationConfiguration() {
		TracedRealizationConfigurationImpl tracedRealizationConfiguration = new TracedRealizationConfigurationImpl();
		return tracedRealizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReceptionConfiguration createTracedReceptionConfiguration() {
		TracedReceptionConfigurationImpl tracedReceptionConfiguration = new TracedReceptionConfigurationImpl();
		return tracedReceptionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReclassifyObjectActionConfiguration createTracedReclassifyObjectActionConfiguration() {
		TracedReclassifyObjectActionConfigurationImpl tracedReclassifyObjectActionConfiguration = new TracedReclassifyObjectActionConfigurationImpl();
		return tracedReclassifyObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRedefinableElementConfiguration createTracedRedefinableElementConfiguration() {
		TracedRedefinableElementConfigurationImpl tracedRedefinableElementConfiguration = new TracedRedefinableElementConfigurationImpl();
		return tracedRedefinableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRedefinableTemplateSignatureConfiguration createTracedRedefinableTemplateSignatureConfiguration() {
		TracedRedefinableTemplateSignatureConfigurationImpl tracedRedefinableTemplateSignatureConfiguration = new TracedRedefinableTemplateSignatureConfigurationImpl();
		return tracedRedefinableTemplateSignatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReduceActionConfiguration createTracedReduceActionConfiguration() {
		TracedReduceActionConfigurationImpl tracedReduceActionConfiguration = new TracedReduceActionConfigurationImpl();
		return tracedReduceActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRegionConfiguration createTracedRegionConfiguration() {
		TracedRegionConfigurationImpl tracedRegionConfiguration = new TracedRegionConfigurationImpl();
		return tracedRegionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRelationshipConfiguration createTracedRelationshipConfiguration() {
		TracedRelationshipConfigurationImpl tracedRelationshipConfiguration = new TracedRelationshipConfigurationImpl();
		return tracedRelationshipConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRemoveStructuralFeatureValueActionConfiguration createTracedRemoveStructuralFeatureValueActionConfiguration() {
		TracedRemoveStructuralFeatureValueActionConfigurationImpl tracedRemoveStructuralFeatureValueActionConfiguration = new TracedRemoveStructuralFeatureValueActionConfigurationImpl();
		return tracedRemoveStructuralFeatureValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRemoveVariableValueActionConfiguration createTracedRemoveVariableValueActionConfiguration() {
		TracedRemoveVariableValueActionConfigurationImpl tracedRemoveVariableValueActionConfiguration = new TracedRemoveVariableValueActionConfigurationImpl();
		return tracedRemoveVariableValueActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedReplyActionConfiguration createTracedReplyActionConfiguration() {
		TracedReplyActionConfigurationImpl tracedReplyActionConfiguration = new TracedReplyActionConfigurationImpl();
		return tracedReplyActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSendObjectActionConfiguration createTracedSendObjectActionConfiguration() {
		TracedSendObjectActionConfigurationImpl tracedSendObjectActionConfiguration = new TracedSendObjectActionConfigurationImpl();
		return tracedSendObjectActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSendSignalActionConfiguration createTracedSendSignalActionConfiguration() {
		TracedSendSignalActionConfigurationImpl tracedSendSignalActionConfiguration = new TracedSendSignalActionConfigurationImpl();
		return tracedSendSignalActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSequenceNodeConfiguration createTracedSequenceNodeConfiguration() {
		TracedSequenceNodeConfigurationImpl tracedSequenceNodeConfiguration = new TracedSequenceNodeConfigurationImpl();
		return tracedSequenceNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSignalConfiguration createTracedSignalConfiguration() {
		TracedSignalConfigurationImpl tracedSignalConfiguration = new TracedSignalConfigurationImpl();
		return tracedSignalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSignalEventConfiguration createTracedSignalEventConfiguration() {
		TracedSignalEventConfigurationImpl tracedSignalEventConfiguration = new TracedSignalEventConfigurationImpl();
		return tracedSignalEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSlotConfiguration createTracedSlotConfiguration() {
		TracedSlotConfigurationImpl tracedSlotConfiguration = new TracedSlotConfigurationImpl();
		return tracedSlotConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStartClassifierBehaviorActionConfiguration createTracedStartClassifierBehaviorActionConfiguration() {
		TracedStartClassifierBehaviorActionConfigurationImpl tracedStartClassifierBehaviorActionConfiguration = new TracedStartClassifierBehaviorActionConfigurationImpl();
		return tracedStartClassifierBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStartObjectBehaviorActionConfiguration createTracedStartObjectBehaviorActionConfiguration() {
		TracedStartObjectBehaviorActionConfigurationImpl tracedStartObjectBehaviorActionConfiguration = new TracedStartObjectBehaviorActionConfigurationImpl();
		return tracedStartObjectBehaviorActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStateConfiguration createTracedStateConfiguration() {
		TracedStateConfigurationImpl tracedStateConfiguration = new TracedStateConfigurationImpl();
		return tracedStateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStateInvariantConfiguration createTracedStateInvariantConfiguration() {
		TracedStateInvariantConfigurationImpl tracedStateInvariantConfiguration = new TracedStateInvariantConfigurationImpl();
		return tracedStateInvariantConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStateMachineConfiguration createTracedStateMachineConfiguration() {
		TracedStateMachineConfigurationImpl tracedStateMachineConfiguration = new TracedStateMachineConfigurationImpl();
		return tracedStateMachineConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStereotypeConfiguration createTracedStereotypeConfiguration() {
		TracedStereotypeConfigurationImpl tracedStereotypeConfiguration = new TracedStereotypeConfigurationImpl();
		return tracedStereotypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStringExpressionConfiguration createTracedStringExpressionConfiguration() {
		TracedStringExpressionConfigurationImpl tracedStringExpressionConfiguration = new TracedStringExpressionConfigurationImpl();
		return tracedStringExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStructuralFeatureActionConfiguration createTracedStructuralFeatureActionConfiguration() {
		TracedStructuralFeatureActionConfigurationImpl tracedStructuralFeatureActionConfiguration = new TracedStructuralFeatureActionConfigurationImpl();
		return tracedStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStructuralFeatureConfiguration createTracedStructuralFeatureConfiguration() {
		TracedStructuralFeatureConfigurationImpl tracedStructuralFeatureConfiguration = new TracedStructuralFeatureConfigurationImpl();
		return tracedStructuralFeatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStructuredActivityNodeConfiguration createTracedStructuredActivityNodeConfiguration() {
		TracedStructuredActivityNodeConfigurationImpl tracedStructuredActivityNodeConfiguration = new TracedStructuredActivityNodeConfigurationImpl();
		return tracedStructuredActivityNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedStructuredClassifierConfiguration createTracedStructuredClassifierConfiguration() {
		TracedStructuredClassifierConfigurationImpl tracedStructuredClassifierConfiguration = new TracedStructuredClassifierConfigurationImpl();
		return tracedStructuredClassifierConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedSubstitutionConfiguration createTracedSubstitutionConfiguration() {
		TracedSubstitutionConfigurationImpl tracedSubstitutionConfiguration = new TracedSubstitutionConfigurationImpl();
		return tracedSubstitutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTemplateBindingConfiguration createTracedTemplateBindingConfiguration() {
		TracedTemplateBindingConfigurationImpl tracedTemplateBindingConfiguration = new TracedTemplateBindingConfigurationImpl();
		return tracedTemplateBindingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTemplateParameterConfiguration createTracedTemplateParameterConfiguration() {
		TracedTemplateParameterConfigurationImpl tracedTemplateParameterConfiguration = new TracedTemplateParameterConfigurationImpl();
		return tracedTemplateParameterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTemplateParameterSubstitutionConfiguration createTracedTemplateParameterSubstitutionConfiguration() {
		TracedTemplateParameterSubstitutionConfigurationImpl tracedTemplateParameterSubstitutionConfiguration = new TracedTemplateParameterSubstitutionConfigurationImpl();
		return tracedTemplateParameterSubstitutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTemplateSignatureConfiguration createTracedTemplateSignatureConfiguration() {
		TracedTemplateSignatureConfigurationImpl tracedTemplateSignatureConfiguration = new TracedTemplateSignatureConfigurationImpl();
		return tracedTemplateSignatureConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTemplateableElementConfiguration createTracedTemplateableElementConfiguration() {
		TracedTemplateableElementConfigurationImpl tracedTemplateableElementConfiguration = new TracedTemplateableElementConfigurationImpl();
		return tracedTemplateableElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTestIdentityActionConfiguration createTracedTestIdentityActionConfiguration() {
		TracedTestIdentityActionConfigurationImpl tracedTestIdentityActionConfiguration = new TracedTestIdentityActionConfigurationImpl();
		return tracedTestIdentityActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeConstraintConfiguration createTracedTimeConstraintConfiguration() {
		TracedTimeConstraintConfigurationImpl tracedTimeConstraintConfiguration = new TracedTimeConstraintConfigurationImpl();
		return tracedTimeConstraintConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeEventConfiguration createTracedTimeEventConfiguration() {
		TracedTimeEventConfigurationImpl tracedTimeEventConfiguration = new TracedTimeEventConfigurationImpl();
		return tracedTimeEventConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeExpressionConfiguration createTracedTimeExpressionConfiguration() {
		TracedTimeExpressionConfigurationImpl tracedTimeExpressionConfiguration = new TracedTimeExpressionConfigurationImpl();
		return tracedTimeExpressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeIntervalConfiguration createTracedTimeIntervalConfiguration() {
		TracedTimeIntervalConfigurationImpl tracedTimeIntervalConfiguration = new TracedTimeIntervalConfigurationImpl();
		return tracedTimeIntervalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTimeObservationConfiguration createTracedTimeObservationConfiguration() {
		TracedTimeObservationConfigurationImpl tracedTimeObservationConfiguration = new TracedTimeObservationConfigurationImpl();
		return tracedTimeObservationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransitionConfiguration createTracedTransitionConfiguration() {
		TracedTransitionConfigurationImpl tracedTransitionConfiguration = new TracedTransitionConfigurationImpl();
		return tracedTransitionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTriggerConfiguration createTracedTriggerConfiguration() {
		TracedTriggerConfigurationImpl tracedTriggerConfiguration = new TracedTriggerConfigurationImpl();
		return tracedTriggerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTypeConfiguration createTracedTypeConfiguration() {
		TracedTypeConfigurationImpl tracedTypeConfiguration = new TracedTypeConfigurationImpl();
		return tracedTypeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTypedElementConfiguration createTracedTypedElementConfiguration() {
		TracedTypedElementConfigurationImpl tracedTypedElementConfiguration = new TracedTypedElementConfigurationImpl();
		return tracedTypedElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedUnmarshallActionConfiguration createTracedUnmarshallActionConfiguration() {
		TracedUnmarshallActionConfigurationImpl tracedUnmarshallActionConfiguration = new TracedUnmarshallActionConfigurationImpl();
		return tracedUnmarshallActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedUsageConfiguration createTracedUsageConfiguration() {
		TracedUsageConfigurationImpl tracedUsageConfiguration = new TracedUsageConfigurationImpl();
		return tracedUsageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedUseCaseConfiguration createTracedUseCaseConfiguration() {
		TracedUseCaseConfigurationImpl tracedUseCaseConfiguration = new TracedUseCaseConfigurationImpl();
		return tracedUseCaseConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValuePinConfiguration createTracedValuePinConfiguration() {
		TracedValuePinConfigurationImpl tracedValuePinConfiguration = new TracedValuePinConfigurationImpl();
		return tracedValuePinConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValueSpecificationActionConfiguration createTracedValueSpecificationActionConfiguration() {
		TracedValueSpecificationActionConfigurationImpl tracedValueSpecificationActionConfiguration = new TracedValueSpecificationActionConfigurationImpl();
		return tracedValueSpecificationActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValueSpecificationConfiguration createTracedValueSpecificationConfiguration() {
		TracedValueSpecificationConfigurationImpl tracedValueSpecificationConfiguration = new TracedValueSpecificationConfigurationImpl();
		return tracedValueSpecificationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableActionConfiguration createTracedVariableActionConfiguration() {
		TracedVariableActionConfigurationImpl tracedVariableActionConfiguration = new TracedVariableActionConfigurationImpl();
		return tracedVariableActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariableConfiguration createTracedVariableConfiguration() {
		TracedVariableConfigurationImpl tracedVariableConfiguration = new TracedVariableConfigurationImpl();
		return tracedVariableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVertexConfiguration createTracedVertexConfiguration() {
		TracedVertexConfigurationImpl tracedVertexConfiguration = new TracedVertexConfigurationImpl();
		return tracedVertexConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedWriteLinkActionConfiguration createTracedWriteLinkActionConfiguration() {
		TracedWriteLinkActionConfigurationImpl tracedWriteLinkActionConfiguration = new TracedWriteLinkActionConfigurationImpl();
		return tracedWriteLinkActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedWriteStructuralFeatureActionConfiguration createTracedWriteStructuralFeatureActionConfiguration() {
		TracedWriteStructuralFeatureActionConfigurationImpl tracedWriteStructuralFeatureActionConfiguration = new TracedWriteStructuralFeatureActionConfigurationImpl();
		return tracedWriteStructuralFeatureActionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedWriteVariableActionConfiguration createTracedWriteVariableActionConfiguration() {
		TracedWriteVariableActionConfigurationImpl tracedWriteVariableActionConfiguration = new TracedWriteVariableActionConfigurationImpl();
		return tracedWriteVariableActionConfiguration;
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
