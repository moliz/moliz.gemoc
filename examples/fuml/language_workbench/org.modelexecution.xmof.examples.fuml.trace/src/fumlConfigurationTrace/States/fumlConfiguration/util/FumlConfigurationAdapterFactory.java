/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.util;

import fumlConfigurationTrace.States.fumlConfiguration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage
 * @generated
 */
public class FumlConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FumlConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FumlConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FumlConfigurationSwitch<Adapter> modelSwitch =
		new FumlConfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseTracedAbstractionConfiguration(TracedAbstractionConfiguration object) {
				return createTracedAbstractionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAcceptCallActionConfiguration(TracedAcceptCallActionConfiguration object) {
				return createTracedAcceptCallActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAcceptEventActionConfiguration(TracedAcceptEventActionConfiguration object) {
				return createTracedAcceptEventActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActionConfiguration(TracedActionConfiguration object) {
				return createTracedActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActionExecutionSpecificationConfiguration(TracedActionExecutionSpecificationConfiguration object) {
				return createTracedActionExecutionSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActionInputPinConfiguration(TracedActionInputPinConfiguration object) {
				return createTracedActionInputPinConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityConfiguration(TracedActivityConfiguration object) {
				return createTracedActivityConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityContentConfiguration(TracedActivityContentConfiguration object) {
				return createTracedActivityContentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityEdgeConfiguration(TracedActivityEdgeConfiguration object) {
				return createTracedActivityEdgeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityFinalNodeConfiguration(TracedActivityFinalNodeConfiguration object) {
				return createTracedActivityFinalNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityGroupConfiguration(TracedActivityGroupConfiguration object) {
				return createTracedActivityGroupConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityNodeConfiguration(TracedActivityNodeConfiguration object) {
				return createTracedActivityNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityParameterNodeConfiguration(TracedActivityParameterNodeConfiguration object) {
				return createTracedActivityParameterNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActivityPartitionConfiguration(TracedActivityPartitionConfiguration object) {
				return createTracedActivityPartitionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedActorConfiguration(TracedActorConfiguration object) {
				return createTracedActorConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAddStructuralFeatureValueActionConfiguration(TracedAddStructuralFeatureValueActionConfiguration object) {
				return createTracedAddStructuralFeatureValueActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAddVariableValueActionConfiguration(TracedAddVariableValueActionConfiguration object) {
				return createTracedAddVariableValueActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAnyReceiveEventConfiguration(TracedAnyReceiveEventConfiguration object) {
				return createTracedAnyReceiveEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedArtifactConfiguration(TracedArtifactConfiguration object) {
				return createTracedArtifactConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAssociationClassConfiguration(TracedAssociationClassConfiguration object) {
				return createTracedAssociationClassConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedAssociationConfiguration(TracedAssociationConfiguration object) {
				return createTracedAssociationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedBehaviorConfiguration(TracedBehaviorConfiguration object) {
				return createTracedBehaviorConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedBehaviorExecutionSpecificationConfiguration(TracedBehaviorExecutionSpecificationConfiguration object) {
				return createTracedBehaviorExecutionSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedBehavioralFeatureConfiguration(TracedBehavioralFeatureConfiguration object) {
				return createTracedBehavioralFeatureConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedBehavioredClassifierConfiguration(TracedBehavioredClassifierConfiguration object) {
				return createTracedBehavioredClassifierConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedBroadcastSignalActionConfiguration(TracedBroadcastSignalActionConfiguration object) {
				return createTracedBroadcastSignalActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCallActionConfiguration(TracedCallActionConfiguration object) {
				return createTracedCallActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCallBehaviorActionConfiguration(TracedCallBehaviorActionConfiguration object) {
				return createTracedCallBehaviorActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCallEventConfiguration(TracedCallEventConfiguration object) {
				return createTracedCallEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCallOperationActionConfiguration(TracedCallOperationActionConfiguration object) {
				return createTracedCallOperationActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCentralBufferNodeConfiguration(TracedCentralBufferNodeConfiguration object) {
				return createTracedCentralBufferNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedChangeEventConfiguration(TracedChangeEventConfiguration object) {
				return createTracedChangeEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClassConfiguration(TracedClassConfiguration object) {
				return createTracedClassConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClassifierConfiguration(TracedClassifierConfiguration object) {
				return createTracedClassifierConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClassifierTemplateParameterConfiguration(TracedClassifierTemplateParameterConfiguration object) {
				return createTracedClassifierTemplateParameterConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClauseConfiguration(TracedClauseConfiguration object) {
				return createTracedClauseConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClearAssociationActionConfiguration(TracedClearAssociationActionConfiguration object) {
				return createTracedClearAssociationActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClearStructuralFeatureActionConfiguration(TracedClearStructuralFeatureActionConfiguration object) {
				return createTracedClearStructuralFeatureActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedClearVariableActionConfiguration(TracedClearVariableActionConfiguration object) {
				return createTracedClearVariableActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCollaborationConfiguration(TracedCollaborationConfiguration object) {
				return createTracedCollaborationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCollaborationUseConfiguration(TracedCollaborationUseConfiguration object) {
				return createTracedCollaborationUseConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCombinedFragmentConfiguration(TracedCombinedFragmentConfiguration object) {
				return createTracedCombinedFragmentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCommentConfiguration(TracedCommentConfiguration object) {
				return createTracedCommentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCommunicationPathConfiguration(TracedCommunicationPathConfiguration object) {
				return createTracedCommunicationPathConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedComponentConfiguration(TracedComponentConfiguration object) {
				return createTracedComponentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedComponentRealizationConfiguration(TracedComponentRealizationConfiguration object) {
				return createTracedComponentRealizationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConditionalNodeConfiguration(TracedConditionalNodeConfiguration object) {
				return createTracedConditionalNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConnectableElementConfiguration(TracedConnectableElementConfiguration object) {
				return createTracedConnectableElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConnectableElementTemplateParameterConfiguration(TracedConnectableElementTemplateParameterConfiguration object) {
				return createTracedConnectableElementTemplateParameterConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConnectionPointReferenceConfiguration(TracedConnectionPointReferenceConfiguration object) {
				return createTracedConnectionPointReferenceConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConnectorConfiguration(TracedConnectorConfiguration object) {
				return createTracedConnectorConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConnectorEndConfiguration(TracedConnectorEndConfiguration object) {
				return createTracedConnectorEndConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConsiderIgnoreFragmentConfiguration(TracedConsiderIgnoreFragmentConfiguration object) {
				return createTracedConsiderIgnoreFragmentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedConstraintConfiguration(TracedConstraintConfiguration object) {
				return createTracedConstraintConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedContinuationConfiguration(TracedContinuationConfiguration object) {
				return createTracedContinuationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedControlFlowConfiguration(TracedControlFlowConfiguration object) {
				return createTracedControlFlowConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedControlNodeConfiguration(TracedControlNodeConfiguration object) {
				return createTracedControlNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCreateLinkActionConfiguration(TracedCreateLinkActionConfiguration object) {
				return createTracedCreateLinkActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCreateLinkObjectActionConfiguration(TracedCreateLinkObjectActionConfiguration object) {
				return createTracedCreateLinkObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedCreateObjectActionConfiguration(TracedCreateObjectActionConfiguration object) {
				return createTracedCreateObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDataStoreNodeConfiguration(TracedDataStoreNodeConfiguration object) {
				return createTracedDataStoreNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDataTypeConfiguration(TracedDataTypeConfiguration object) {
				return createTracedDataTypeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDecisionNodeConfiguration(TracedDecisionNodeConfiguration object) {
				return createTracedDecisionNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDependencyConfiguration(TracedDependencyConfiguration object) {
				return createTracedDependencyConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDeployedArtifactConfiguration(TracedDeployedArtifactConfiguration object) {
				return createTracedDeployedArtifactConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDeploymentConfiguration(TracedDeploymentConfiguration object) {
				return createTracedDeploymentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDeploymentSpecificationConfiguration(TracedDeploymentSpecificationConfiguration object) {
				return createTracedDeploymentSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDeploymentTargetConfiguration(TracedDeploymentTargetConfiguration object) {
				return createTracedDeploymentTargetConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDestroyLinkActionConfiguration(TracedDestroyLinkActionConfiguration object) {
				return createTracedDestroyLinkActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDestroyObjectActionConfiguration(TracedDestroyObjectActionConfiguration object) {
				return createTracedDestroyObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDestructionOccurrenceSpecificationConfiguration(TracedDestructionOccurrenceSpecificationConfiguration object) {
				return createTracedDestructionOccurrenceSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDeviceConfiguration(TracedDeviceConfiguration object) {
				return createTracedDeviceConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDirectedRelationshipConfiguration(TracedDirectedRelationshipConfiguration object) {
				return createTracedDirectedRelationshipConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDurationConfiguration(TracedDurationConfiguration object) {
				return createTracedDurationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDurationConstraintConfiguration(TracedDurationConstraintConfiguration object) {
				return createTracedDurationConstraintConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDurationIntervalConfiguration(TracedDurationIntervalConfiguration object) {
				return createTracedDurationIntervalConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedDurationObservationConfiguration(TracedDurationObservationConfiguration object) {
				return createTracedDurationObservationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedElementConfiguration(TracedElementConfiguration object) {
				return createTracedElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedElementImportConfiguration(TracedElementImportConfiguration object) {
				return createTracedElementImportConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedEncapsulatedClassifierConfiguration(TracedEncapsulatedClassifierConfiguration object) {
				return createTracedEncapsulatedClassifierConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedEnumerationConfiguration(TracedEnumerationConfiguration object) {
				return createTracedEnumerationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedEnumerationLiteralConfiguration(TracedEnumerationLiteralConfiguration object) {
				return createTracedEnumerationLiteralConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedEventConfiguration(TracedEventConfiguration object) {
				return createTracedEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExceptionHandlerConfiguration(TracedExceptionHandlerConfiguration object) {
				return createTracedExceptionHandlerConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExecutableNodeConfiguration(TracedExecutableNodeConfiguration object) {
				return createTracedExecutableNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExecutionEnvironmentConfiguration(TracedExecutionEnvironmentConfiguration object) {
				return createTracedExecutionEnvironmentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExecutionOccurrenceSpecificationConfiguration(TracedExecutionOccurrenceSpecificationConfiguration object) {
				return createTracedExecutionOccurrenceSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExecutionSpecificationConfiguration(TracedExecutionSpecificationConfiguration object) {
				return createTracedExecutionSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExpansionNodeConfiguration(TracedExpansionNodeConfiguration object) {
				return createTracedExpansionNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExpansionRegionConfiguration(TracedExpansionRegionConfiguration object) {
				return createTracedExpansionRegionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExpressionConfiguration(TracedExpressionConfiguration object) {
				return createTracedExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExtendConfiguration(TracedExtendConfiguration object) {
				return createTracedExtendConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExtensionConfiguration(TracedExtensionConfiguration object) {
				return createTracedExtensionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExtensionEndConfiguration(TracedExtensionEndConfiguration object) {
				return createTracedExtensionEndConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedExtensionPointConfiguration(TracedExtensionPointConfiguration object) {
				return createTracedExtensionPointConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedFeatureConfiguration(TracedFeatureConfiguration object) {
				return createTracedFeatureConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedFinalNodeConfiguration(TracedFinalNodeConfiguration object) {
				return createTracedFinalNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedFinalStateConfiguration(TracedFinalStateConfiguration object) {
				return createTracedFinalStateConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedFlowFinalNodeConfiguration(TracedFlowFinalNodeConfiguration object) {
				return createTracedFlowFinalNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedForkNodeConfiguration(TracedForkNodeConfiguration object) {
				return createTracedForkNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedFunctionBehaviorConfiguration(TracedFunctionBehaviorConfiguration object) {
				return createTracedFunctionBehaviorConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedGateConfiguration(TracedGateConfiguration object) {
				return createTracedGateConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedGeneralOrderingConfiguration(TracedGeneralOrderingConfiguration object) {
				return createTracedGeneralOrderingConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedGeneralizationConfiguration(TracedGeneralizationConfiguration object) {
				return createTracedGeneralizationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedGeneralizationSetConfiguration(TracedGeneralizationSetConfiguration object) {
				return createTracedGeneralizationSetConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedImageConfiguration(TracedImageConfiguration object) {
				return createTracedImageConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedIncludeConfiguration(TracedIncludeConfiguration object) {
				return createTracedIncludeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInformationFlowConfiguration(TracedInformationFlowConfiguration object) {
				return createTracedInformationFlowConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInformationItemConfiguration(TracedInformationItemConfiguration object) {
				return createTracedInformationItemConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInitialNodeConfiguration(TracedInitialNodeConfiguration object) {
				return createTracedInitialNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInputPinConfiguration(TracedInputPinConfiguration object) {
				return createTracedInputPinConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInstanceSpecificationConfiguration(TracedInstanceSpecificationConfiguration object) {
				return createTracedInstanceSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInstanceValueConfiguration(TracedInstanceValueConfiguration object) {
				return createTracedInstanceValueConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInteractionConfiguration(TracedInteractionConfiguration object) {
				return createTracedInteractionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInteractionConstraintConfiguration(TracedInteractionConstraintConfiguration object) {
				return createTracedInteractionConstraintConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInteractionFragmentConfiguration(TracedInteractionFragmentConfiguration object) {
				return createTracedInteractionFragmentConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInteractionOperandConfiguration(TracedInteractionOperandConfiguration object) {
				return createTracedInteractionOperandConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInteractionUseConfiguration(TracedInteractionUseConfiguration object) {
				return createTracedInteractionUseConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInterfaceConfiguration(TracedInterfaceConfiguration object) {
				return createTracedInterfaceConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInterfaceRealizationConfiguration(TracedInterfaceRealizationConfiguration object) {
				return createTracedInterfaceRealizationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInterruptibleActivityRegionConfiguration(TracedInterruptibleActivityRegionConfiguration object) {
				return createTracedInterruptibleActivityRegionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedIntervalConfiguration(TracedIntervalConfiguration object) {
				return createTracedIntervalConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedIntervalConstraintConfiguration(TracedIntervalConstraintConfiguration object) {
				return createTracedIntervalConstraintConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedInvocationActionConfiguration(TracedInvocationActionConfiguration object) {
				return createTracedInvocationActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedJoinNodeConfiguration(TracedJoinNodeConfiguration object) {
				return createTracedJoinNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLifelineConfiguration(TracedLifelineConfiguration object) {
				return createTracedLifelineConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLinkActionConfiguration(TracedLinkActionConfiguration object) {
				return createTracedLinkActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLinkEndCreationDataConfiguration(TracedLinkEndCreationDataConfiguration object) {
				return createTracedLinkEndCreationDataConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLinkEndDataConfiguration(TracedLinkEndDataConfiguration object) {
				return createTracedLinkEndDataConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLinkEndDestructionDataConfiguration(TracedLinkEndDestructionDataConfiguration object) {
				return createTracedLinkEndDestructionDataConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralBooleanConfiguration(TracedLiteralBooleanConfiguration object) {
				return createTracedLiteralBooleanConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralIntegerConfiguration(TracedLiteralIntegerConfiguration object) {
				return createTracedLiteralIntegerConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralNullConfiguration(TracedLiteralNullConfiguration object) {
				return createTracedLiteralNullConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralRealConfiguration(TracedLiteralRealConfiguration object) {
				return createTracedLiteralRealConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralSpecificationConfiguration(TracedLiteralSpecificationConfiguration object) {
				return createTracedLiteralSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralStringConfiguration(TracedLiteralStringConfiguration object) {
				return createTracedLiteralStringConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLiteralUnlimitedNaturalConfiguration(TracedLiteralUnlimitedNaturalConfiguration object) {
				return createTracedLiteralUnlimitedNaturalConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedLoopNodeConfiguration(TracedLoopNodeConfiguration object) {
				return createTracedLoopNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedManifestationConfiguration(TracedManifestationConfiguration object) {
				return createTracedManifestationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMergeNodeConfiguration(TracedMergeNodeConfiguration object) {
				return createTracedMergeNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMessageConfiguration(TracedMessageConfiguration object) {
				return createTracedMessageConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMessageEndConfiguration(TracedMessageEndConfiguration object) {
				return createTracedMessageEndConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMessageEventConfiguration(TracedMessageEventConfiguration object) {
				return createTracedMessageEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMessageOccurrenceSpecificationConfiguration(TracedMessageOccurrenceSpecificationConfiguration object) {
				return createTracedMessageOccurrenceSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedModelConfiguration(TracedModelConfiguration object) {
				return createTracedModelConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedMultiplicityElementConfiguration(TracedMultiplicityElementConfiguration object) {
				return createTracedMultiplicityElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedNamedElementConfiguration(TracedNamedElementConfiguration object) {
				return createTracedNamedElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedNamespaceConfiguration(TracedNamespaceConfiguration object) {
				return createTracedNamespaceConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedNodeConfiguration(TracedNodeConfiguration object) {
				return createTracedNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedObjectFlowConfiguration(TracedObjectFlowConfiguration object) {
				return createTracedObjectFlowConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedObjectNodeConfiguration(TracedObjectNodeConfiguration object) {
				return createTracedObjectNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedObservationConfiguration(TracedObservationConfiguration object) {
				return createTracedObservationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOccurrenceSpecificationConfiguration(TracedOccurrenceSpecificationConfiguration object) {
				return createTracedOccurrenceSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOpaqueActionConfiguration(TracedOpaqueActionConfiguration object) {
				return createTracedOpaqueActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOpaqueBehaviorConfiguration(TracedOpaqueBehaviorConfiguration object) {
				return createTracedOpaqueBehaviorConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOpaqueExpressionConfiguration(TracedOpaqueExpressionConfiguration object) {
				return createTracedOpaqueExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOperationConfiguration(TracedOperationConfiguration object) {
				return createTracedOperationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOperationTemplateParameterConfiguration(TracedOperationTemplateParameterConfiguration object) {
				return createTracedOperationTemplateParameterConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedOutputPinConfiguration(TracedOutputPinConfiguration object) {
				return createTracedOutputPinConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPackageConfiguration(TracedPackageConfiguration object) {
				return createTracedPackageConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPackageImportConfiguration(TracedPackageImportConfiguration object) {
				return createTracedPackageImportConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPackageMergeConfiguration(TracedPackageMergeConfiguration object) {
				return createTracedPackageMergeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPackageableElementConfiguration(TracedPackageableElementConfiguration object) {
				return createTracedPackageableElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedParameterConfiguration(TracedParameterConfiguration object) {
				return createTracedParameterConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedParameterSetConfiguration(TracedParameterSetConfiguration object) {
				return createTracedParameterSetConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedParameterableElementConfiguration(TracedParameterableElementConfiguration object) {
				return createTracedParameterableElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPartDecompositionConfiguration(TracedPartDecompositionConfiguration object) {
				return createTracedPartDecompositionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPinConfiguration(TracedPinConfiguration object) {
				return createTracedPinConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPortConfiguration(TracedPortConfiguration object) {
				return createTracedPortConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPrimitiveTypeConfiguration(TracedPrimitiveTypeConfiguration object) {
				return createTracedPrimitiveTypeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedProfileApplicationConfiguration(TracedProfileApplicationConfiguration object) {
				return createTracedProfileApplicationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedProfileConfiguration(TracedProfileConfiguration object) {
				return createTracedProfileConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPropertyConfiguration(TracedPropertyConfiguration object) {
				return createTracedPropertyConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedProtocolConformanceConfiguration(TracedProtocolConformanceConfiguration object) {
				return createTracedProtocolConformanceConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedProtocolStateMachineConfiguration(TracedProtocolStateMachineConfiguration object) {
				return createTracedProtocolStateMachineConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedProtocolTransitionConfiguration(TracedProtocolTransitionConfiguration object) {
				return createTracedProtocolTransitionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedPseudostateConfiguration(TracedPseudostateConfiguration object) {
				return createTracedPseudostateConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedQualifierValueConfiguration(TracedQualifierValueConfiguration object) {
				return createTracedQualifierValueConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRaiseExceptionActionConfiguration(TracedRaiseExceptionActionConfiguration object) {
				return createTracedRaiseExceptionActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadExtentActionConfiguration(TracedReadExtentActionConfiguration object) {
				return createTracedReadExtentActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadIsClassifiedObjectActionConfiguration(TracedReadIsClassifiedObjectActionConfiguration object) {
				return createTracedReadIsClassifiedObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadLinkActionConfiguration(TracedReadLinkActionConfiguration object) {
				return createTracedReadLinkActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadLinkObjectEndActionConfiguration(TracedReadLinkObjectEndActionConfiguration object) {
				return createTracedReadLinkObjectEndActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadLinkObjectEndQualifierActionConfiguration(TracedReadLinkObjectEndQualifierActionConfiguration object) {
				return createTracedReadLinkObjectEndQualifierActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadSelfActionConfiguration(TracedReadSelfActionConfiguration object) {
				return createTracedReadSelfActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadStructuralFeatureActionConfiguration(TracedReadStructuralFeatureActionConfiguration object) {
				return createTracedReadStructuralFeatureActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReadVariableActionConfiguration(TracedReadVariableActionConfiguration object) {
				return createTracedReadVariableActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRealizationConfiguration(TracedRealizationConfiguration object) {
				return createTracedRealizationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReceptionConfiguration(TracedReceptionConfiguration object) {
				return createTracedReceptionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReclassifyObjectActionConfiguration(TracedReclassifyObjectActionConfiguration object) {
				return createTracedReclassifyObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRedefinableElementConfiguration(TracedRedefinableElementConfiguration object) {
				return createTracedRedefinableElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRedefinableTemplateSignatureConfiguration(TracedRedefinableTemplateSignatureConfiguration object) {
				return createTracedRedefinableTemplateSignatureConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReduceActionConfiguration(TracedReduceActionConfiguration object) {
				return createTracedReduceActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRegionConfiguration(TracedRegionConfiguration object) {
				return createTracedRegionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRelationshipConfiguration(TracedRelationshipConfiguration object) {
				return createTracedRelationshipConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRemoveStructuralFeatureValueActionConfiguration(TracedRemoveStructuralFeatureValueActionConfiguration object) {
				return createTracedRemoveStructuralFeatureValueActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedRemoveVariableValueActionConfiguration(TracedRemoveVariableValueActionConfiguration object) {
				return createTracedRemoveVariableValueActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedReplyActionConfiguration(TracedReplyActionConfiguration object) {
				return createTracedReplyActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSendObjectActionConfiguration(TracedSendObjectActionConfiguration object) {
				return createTracedSendObjectActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSendSignalActionConfiguration(TracedSendSignalActionConfiguration object) {
				return createTracedSendSignalActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSequenceNodeConfiguration(TracedSequenceNodeConfiguration object) {
				return createTracedSequenceNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSignalConfiguration(TracedSignalConfiguration object) {
				return createTracedSignalConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSignalEventConfiguration(TracedSignalEventConfiguration object) {
				return createTracedSignalEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSlotConfiguration(TracedSlotConfiguration object) {
				return createTracedSlotConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStartClassifierBehaviorActionConfiguration(TracedStartClassifierBehaviorActionConfiguration object) {
				return createTracedStartClassifierBehaviorActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStartObjectBehaviorActionConfiguration(TracedStartObjectBehaviorActionConfiguration object) {
				return createTracedStartObjectBehaviorActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStateConfiguration(TracedStateConfiguration object) {
				return createTracedStateConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStateInvariantConfiguration(TracedStateInvariantConfiguration object) {
				return createTracedStateInvariantConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStateMachineConfiguration(TracedStateMachineConfiguration object) {
				return createTracedStateMachineConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStereotypeConfiguration(TracedStereotypeConfiguration object) {
				return createTracedStereotypeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStringExpressionConfiguration(TracedStringExpressionConfiguration object) {
				return createTracedStringExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStructuralFeatureActionConfiguration(TracedStructuralFeatureActionConfiguration object) {
				return createTracedStructuralFeatureActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStructuralFeatureConfiguration(TracedStructuralFeatureConfiguration object) {
				return createTracedStructuralFeatureConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStructuredActivityNodeConfiguration(TracedStructuredActivityNodeConfiguration object) {
				return createTracedStructuredActivityNodeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedStructuredClassifierConfiguration(TracedStructuredClassifierConfiguration object) {
				return createTracedStructuredClassifierConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedSubstitutionConfiguration(TracedSubstitutionConfiguration object) {
				return createTracedSubstitutionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTemplateBindingConfiguration(TracedTemplateBindingConfiguration object) {
				return createTracedTemplateBindingConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTemplateParameterConfiguration(TracedTemplateParameterConfiguration object) {
				return createTracedTemplateParameterConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTemplateParameterSubstitutionConfiguration(TracedTemplateParameterSubstitutionConfiguration object) {
				return createTracedTemplateParameterSubstitutionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTemplateSignatureConfiguration(TracedTemplateSignatureConfiguration object) {
				return createTracedTemplateSignatureConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTemplateableElementConfiguration(TracedTemplateableElementConfiguration object) {
				return createTracedTemplateableElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTestIdentityActionConfiguration(TracedTestIdentityActionConfiguration object) {
				return createTracedTestIdentityActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTimeConstraintConfiguration(TracedTimeConstraintConfiguration object) {
				return createTracedTimeConstraintConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTimeEventConfiguration(TracedTimeEventConfiguration object) {
				return createTracedTimeEventConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTimeExpressionConfiguration(TracedTimeExpressionConfiguration object) {
				return createTracedTimeExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTimeIntervalConfiguration(TracedTimeIntervalConfiguration object) {
				return createTracedTimeIntervalConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTimeObservationConfiguration(TracedTimeObservationConfiguration object) {
				return createTracedTimeObservationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTransitionConfiguration(TracedTransitionConfiguration object) {
				return createTracedTransitionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTriggerConfiguration(TracedTriggerConfiguration object) {
				return createTracedTriggerConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTypeConfiguration(TracedTypeConfiguration object) {
				return createTracedTypeConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedTypedElementConfiguration(TracedTypedElementConfiguration object) {
				return createTracedTypedElementConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedUnmarshallActionConfiguration(TracedUnmarshallActionConfiguration object) {
				return createTracedUnmarshallActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedUsageConfiguration(TracedUsageConfiguration object) {
				return createTracedUsageConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedUseCaseConfiguration(TracedUseCaseConfiguration object) {
				return createTracedUseCaseConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedValuePinConfiguration(TracedValuePinConfiguration object) {
				return createTracedValuePinConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedValueSpecificationActionConfiguration(TracedValueSpecificationActionConfiguration object) {
				return createTracedValueSpecificationActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedValueSpecificationConfiguration(TracedValueSpecificationConfiguration object) {
				return createTracedValueSpecificationConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedVariableActionConfiguration(TracedVariableActionConfiguration object) {
				return createTracedVariableActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedVariableConfiguration(TracedVariableConfiguration object) {
				return createTracedVariableConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedVertexConfiguration(TracedVertexConfiguration object) {
				return createTracedVertexConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedWriteLinkActionConfiguration(TracedWriteLinkActionConfiguration object) {
				return createTracedWriteLinkActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedWriteStructuralFeatureActionConfiguration(TracedWriteStructuralFeatureActionConfiguration object) {
				return createTracedWriteStructuralFeatureActionConfigurationAdapter();
			}
			@Override
			public Adapter caseTracedWriteVariableActionConfiguration(TracedWriteVariableActionConfiguration object) {
				return createTracedWriteVariableActionConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration <em>Traced Abstraction Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration
	 * @generated
	 */
	public Adapter createTracedAbstractionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration <em>Traced Accept Call Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration
	 * @generated
	 */
	public Adapter createTracedAcceptCallActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration <em>Traced Accept Event Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration
	 * @generated
	 */
	public Adapter createTracedAcceptEventActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration <em>Traced Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration
	 * @generated
	 */
	public Adapter createTracedActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration <em>Traced Action Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedActionExecutionSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration <em>Traced Action Input Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration
	 * @generated
	 */
	public Adapter createTracedActionInputPinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration <em>Traced Activity Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration <em>Traced Activity Content Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityContentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration <em>Traced Activity Edge Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityEdgeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration <em>Traced Activity Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityFinalNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration <em>Traced Activity Group Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityGroupConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration <em>Traced Activity Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration <em>Traced Activity Parameter Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityParameterNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration <em>Traced Activity Partition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration
	 * @generated
	 */
	public Adapter createTracedActivityPartitionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration <em>Traced Actor Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration
	 * @generated
	 */
	public Adapter createTracedActorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration <em>Traced Add Structural Feature Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration
	 * @generated
	 */
	public Adapter createTracedAddStructuralFeatureValueActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration <em>Traced Add Variable Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration
	 * @generated
	 */
	public Adapter createTracedAddVariableValueActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration <em>Traced Any Receive Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration
	 * @generated
	 */
	public Adapter createTracedAnyReceiveEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration <em>Traced Artifact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration
	 * @generated
	 */
	public Adapter createTracedArtifactConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration <em>Traced Association Class Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration
	 * @generated
	 */
	public Adapter createTracedAssociationClassConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration <em>Traced Association Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration
	 * @generated
	 */
	public Adapter createTracedAssociationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration <em>Traced Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration
	 * @generated
	 */
	public Adapter createTracedBehaviorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration <em>Traced Behavior Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedBehaviorExecutionSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration <em>Traced Behavioral Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration
	 * @generated
	 */
	public Adapter createTracedBehavioralFeatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration <em>Traced Behaviored Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration
	 * @generated
	 */
	public Adapter createTracedBehavioredClassifierConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration <em>Traced Broadcast Signal Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration
	 * @generated
	 */
	public Adapter createTracedBroadcastSignalActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration <em>Traced Call Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCallActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration <em>Traced Call Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCallBehaviorActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration <em>Traced Call Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration
	 * @generated
	 */
	public Adapter createTracedCallEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration <em>Traced Call Operation Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCallOperationActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration <em>Traced Central Buffer Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedCentralBufferNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration <em>Traced Change Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration
	 * @generated
	 */
	public Adapter createTracedChangeEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration <em>Traced Class Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration
	 * @generated
	 */
	public Adapter createTracedClassConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration <em>Traced Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration
	 * @generated
	 */
	public Adapter createTracedClassifierConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration <em>Traced Classifier Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration
	 * @generated
	 */
	public Adapter createTracedClassifierTemplateParameterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration <em>Traced Clause Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration
	 * @generated
	 */
	public Adapter createTracedClauseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration <em>Traced Clear Association Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration
	 * @generated
	 */
	public Adapter createTracedClearAssociationActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration <em>Traced Clear Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration
	 * @generated
	 */
	public Adapter createTracedClearStructuralFeatureActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration <em>Traced Clear Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration
	 * @generated
	 */
	public Adapter createTracedClearVariableActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration <em>Traced Collaboration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration
	 * @generated
	 */
	public Adapter createTracedCollaborationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration <em>Traced Collaboration Use Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration
	 * @generated
	 */
	public Adapter createTracedCollaborationUseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration <em>Traced Combined Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration
	 * @generated
	 */
	public Adapter createTracedCombinedFragmentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration <em>Traced Comment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration
	 * @generated
	 */
	public Adapter createTracedCommentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration <em>Traced Communication Path Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration
	 * @generated
	 */
	public Adapter createTracedCommunicationPathConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration <em>Traced Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration
	 * @generated
	 */
	public Adapter createTracedComponentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration <em>Traced Component Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration
	 * @generated
	 */
	public Adapter createTracedComponentRealizationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration <em>Traced Conditional Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedConditionalNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration <em>Traced Connectable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration
	 * @generated
	 */
	public Adapter createTracedConnectableElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration <em>Traced Connectable Element Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration
	 * @generated
	 */
	public Adapter createTracedConnectableElementTemplateParameterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration <em>Traced Connection Point Reference Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration
	 * @generated
	 */
	public Adapter createTracedConnectionPointReferenceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration <em>Traced Connector Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration
	 * @generated
	 */
	public Adapter createTracedConnectorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration <em>Traced Connector End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration
	 * @generated
	 */
	public Adapter createTracedConnectorEndConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration <em>Traced Consider Ignore Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration
	 * @generated
	 */
	public Adapter createTracedConsiderIgnoreFragmentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration <em>Traced Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration
	 * @generated
	 */
	public Adapter createTracedConstraintConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration <em>Traced Continuation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration
	 * @generated
	 */
	public Adapter createTracedContinuationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration <em>Traced Control Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration
	 * @generated
	 */
	public Adapter createTracedControlFlowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration <em>Traced Control Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedControlNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration <em>Traced Create Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCreateLinkActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration <em>Traced Create Link Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCreateLinkObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration <em>Traced Create Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedCreateObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration <em>Traced Data Store Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedDataStoreNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration <em>Traced Data Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration
	 * @generated
	 */
	public Adapter createTracedDataTypeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration <em>Traced Decision Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedDecisionNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration <em>Traced Dependency Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration
	 * @generated
	 */
	public Adapter createTracedDependencyConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration <em>Traced Deployed Artifact Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration
	 * @generated
	 */
	public Adapter createTracedDeployedArtifactConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration <em>Traced Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration
	 * @generated
	 */
	public Adapter createTracedDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration <em>Traced Deployment Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedDeploymentSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration <em>Traced Deployment Target Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration
	 * @generated
	 */
	public Adapter createTracedDeploymentTargetConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration <em>Traced Destroy Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration
	 * @generated
	 */
	public Adapter createTracedDestroyLinkActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration <em>Traced Destroy Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedDestroyObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration <em>Traced Destruction Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedDestructionOccurrenceSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration <em>Traced Device Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration
	 * @generated
	 */
	public Adapter createTracedDeviceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration <em>Traced Directed Relationship Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration
	 * @generated
	 */
	public Adapter createTracedDirectedRelationshipConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration <em>Traced Duration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration
	 * @generated
	 */
	public Adapter createTracedDurationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration <em>Traced Duration Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration
	 * @generated
	 */
	public Adapter createTracedDurationConstraintConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration <em>Traced Duration Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration
	 * @generated
	 */
	public Adapter createTracedDurationIntervalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration <em>Traced Duration Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration
	 * @generated
	 */
	public Adapter createTracedDurationObservationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration <em>Traced Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration
	 * @generated
	 */
	public Adapter createTracedElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration <em>Traced Element Import Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration
	 * @generated
	 */
	public Adapter createTracedElementImportConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration <em>Traced Encapsulated Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration
	 * @generated
	 */
	public Adapter createTracedEncapsulatedClassifierConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration <em>Traced Enumeration Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration
	 * @generated
	 */
	public Adapter createTracedEnumerationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration <em>Traced Enumeration Literal Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration
	 * @generated
	 */
	public Adapter createTracedEnumerationLiteralConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration <em>Traced Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration
	 * @generated
	 */
	public Adapter createTracedEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration <em>Traced Exception Handler Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration
	 * @generated
	 */
	public Adapter createTracedExceptionHandlerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration <em>Traced Executable Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedExecutableNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration <em>Traced Execution Environment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration
	 * @generated
	 */
	public Adapter createTracedExecutionEnvironmentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration <em>Traced Execution Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedExecutionOccurrenceSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration <em>Traced Execution Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedExecutionSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration <em>Traced Expansion Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedExpansionNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration <em>Traced Expansion Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration
	 * @generated
	 */
	public Adapter createTracedExpansionRegionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration <em>Traced Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration
	 * @generated
	 */
	public Adapter createTracedExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration <em>Traced Extend Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration
	 * @generated
	 */
	public Adapter createTracedExtendConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration <em>Traced Extension Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration
	 * @generated
	 */
	public Adapter createTracedExtensionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration <em>Traced Extension End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration
	 * @generated
	 */
	public Adapter createTracedExtensionEndConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration <em>Traced Extension Point Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration
	 * @generated
	 */
	public Adapter createTracedExtensionPointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration <em>Traced Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration
	 * @generated
	 */
	public Adapter createTracedFeatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration <em>Traced Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedFinalNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration <em>Traced Final State Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration
	 * @generated
	 */
	public Adapter createTracedFinalStateConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration <em>Traced Flow Final Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedFlowFinalNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration <em>Traced Fork Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedForkNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration <em>Traced Function Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration
	 * @generated
	 */
	public Adapter createTracedFunctionBehaviorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration <em>Traced Gate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration
	 * @generated
	 */
	public Adapter createTracedGateConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration <em>Traced General Ordering Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration
	 * @generated
	 */
	public Adapter createTracedGeneralOrderingConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration <em>Traced Generalization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration
	 * @generated
	 */
	public Adapter createTracedGeneralizationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration <em>Traced Generalization Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration
	 * @generated
	 */
	public Adapter createTracedGeneralizationSetConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration <em>Traced Image Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration
	 * @generated
	 */
	public Adapter createTracedImageConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration <em>Traced Include Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration
	 * @generated
	 */
	public Adapter createTracedIncludeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration <em>Traced Information Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration
	 * @generated
	 */
	public Adapter createTracedInformationFlowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration <em>Traced Information Item Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration
	 * @generated
	 */
	public Adapter createTracedInformationItemConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration <em>Traced Initial Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedInitialNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration <em>Traced Input Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration
	 * @generated
	 */
	public Adapter createTracedInputPinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration <em>Traced Instance Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedInstanceSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration <em>Traced Instance Value Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration
	 * @generated
	 */
	public Adapter createTracedInstanceValueConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration <em>Traced Interaction Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration
	 * @generated
	 */
	public Adapter createTracedInteractionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration <em>Traced Interaction Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration
	 * @generated
	 */
	public Adapter createTracedInteractionConstraintConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration <em>Traced Interaction Fragment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration
	 * @generated
	 */
	public Adapter createTracedInteractionFragmentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration <em>Traced Interaction Operand Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration
	 * @generated
	 */
	public Adapter createTracedInteractionOperandConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration <em>Traced Interaction Use Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration
	 * @generated
	 */
	public Adapter createTracedInteractionUseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration <em>Traced Interface Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration
	 * @generated
	 */
	public Adapter createTracedInterfaceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration <em>Traced Interface Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration
	 * @generated
	 */
	public Adapter createTracedInterfaceRealizationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration <em>Traced Interruptible Activity Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration
	 * @generated
	 */
	public Adapter createTracedInterruptibleActivityRegionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration <em>Traced Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration
	 * @generated
	 */
	public Adapter createTracedIntervalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration <em>Traced Interval Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration
	 * @generated
	 */
	public Adapter createTracedIntervalConstraintConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration <em>Traced Invocation Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration
	 * @generated
	 */
	public Adapter createTracedInvocationActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration <em>Traced Join Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedJoinNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration <em>Traced Lifeline Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration
	 * @generated
	 */
	public Adapter createTracedLifelineConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration <em>Traced Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration
	 * @generated
	 */
	public Adapter createTracedLinkActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration <em>Traced Link End Creation Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration
	 * @generated
	 */
	public Adapter createTracedLinkEndCreationDataConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration <em>Traced Link End Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration
	 * @generated
	 */
	public Adapter createTracedLinkEndDataConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration <em>Traced Link End Destruction Data Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration
	 * @generated
	 */
	public Adapter createTracedLinkEndDestructionDataConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration <em>Traced Literal Boolean Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralBooleanConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration <em>Traced Literal Integer Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralIntegerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration <em>Traced Literal Null Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralNullConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration <em>Traced Literal Real Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralRealConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration <em>Traced Literal Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration <em>Traced Literal String Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralStringConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration <em>Traced Literal Unlimited Natural Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration
	 * @generated
	 */
	public Adapter createTracedLiteralUnlimitedNaturalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration <em>Traced Loop Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedLoopNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration <em>Traced Manifestation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration
	 * @generated
	 */
	public Adapter createTracedManifestationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration <em>Traced Merge Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedMergeNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration <em>Traced Message Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration
	 * @generated
	 */
	public Adapter createTracedMessageConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration <em>Traced Message End Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration
	 * @generated
	 */
	public Adapter createTracedMessageEndConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration <em>Traced Message Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration
	 * @generated
	 */
	public Adapter createTracedMessageEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration <em>Traced Message Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedMessageOccurrenceSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration <em>Traced Model Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration
	 * @generated
	 */
	public Adapter createTracedModelConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration <em>Traced Multiplicity Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration
	 * @generated
	 */
	public Adapter createTracedMultiplicityElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration <em>Traced Named Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration
	 * @generated
	 */
	public Adapter createTracedNamedElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration <em>Traced Namespace Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration
	 * @generated
	 */
	public Adapter createTracedNamespaceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration <em>Traced Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration <em>Traced Object Flow Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration
	 * @generated
	 */
	public Adapter createTracedObjectFlowConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration <em>Traced Object Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedObjectNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration <em>Traced Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration
	 * @generated
	 */
	public Adapter createTracedObservationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration <em>Traced Occurrence Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedOccurrenceSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration <em>Traced Opaque Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration
	 * @generated
	 */
	public Adapter createTracedOpaqueActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration <em>Traced Opaque Behavior Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration
	 * @generated
	 */
	public Adapter createTracedOpaqueBehaviorConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration <em>Traced Opaque Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration
	 * @generated
	 */
	public Adapter createTracedOpaqueExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration <em>Traced Operation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration
	 * @generated
	 */
	public Adapter createTracedOperationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration <em>Traced Operation Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration
	 * @generated
	 */
	public Adapter createTracedOperationTemplateParameterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration <em>Traced Output Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration
	 * @generated
	 */
	public Adapter createTracedOutputPinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration <em>Traced Package Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration
	 * @generated
	 */
	public Adapter createTracedPackageConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration <em>Traced Package Import Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration
	 * @generated
	 */
	public Adapter createTracedPackageImportConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration <em>Traced Package Merge Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration
	 * @generated
	 */
	public Adapter createTracedPackageMergeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration <em>Traced Packageable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration
	 * @generated
	 */
	public Adapter createTracedPackageableElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration <em>Traced Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration
	 * @generated
	 */
	public Adapter createTracedParameterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration <em>Traced Parameter Set Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration
	 * @generated
	 */
	public Adapter createTracedParameterSetConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration <em>Traced Parameterable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration
	 * @generated
	 */
	public Adapter createTracedParameterableElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration <em>Traced Part Decomposition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration
	 * @generated
	 */
	public Adapter createTracedPartDecompositionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration <em>Traced Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration
	 * @generated
	 */
	public Adapter createTracedPinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration <em>Traced Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration
	 * @generated
	 */
	public Adapter createTracedPortConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration <em>Traced Primitive Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration
	 * @generated
	 */
	public Adapter createTracedPrimitiveTypeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration <em>Traced Profile Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration
	 * @generated
	 */
	public Adapter createTracedProfileApplicationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration <em>Traced Profile Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration
	 * @generated
	 */
	public Adapter createTracedProfileConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration <em>Traced Property Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration
	 * @generated
	 */
	public Adapter createTracedPropertyConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration <em>Traced Protocol Conformance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration
	 * @generated
	 */
	public Adapter createTracedProtocolConformanceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration <em>Traced Protocol State Machine Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration
	 * @generated
	 */
	public Adapter createTracedProtocolStateMachineConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration <em>Traced Protocol Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration
	 * @generated
	 */
	public Adapter createTracedProtocolTransitionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration <em>Traced Pseudostate Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration
	 * @generated
	 */
	public Adapter createTracedPseudostateConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration <em>Traced Qualifier Value Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration
	 * @generated
	 */
	public Adapter createTracedQualifierValueConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration <em>Traced Raise Exception Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration
	 * @generated
	 */
	public Adapter createTracedRaiseExceptionActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration <em>Traced Read Extent Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadExtentActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration <em>Traced Read Is Classified Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadIsClassifiedObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration <em>Traced Read Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadLinkActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration <em>Traced Read Link Object End Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadLinkObjectEndActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration <em>Traced Read Link Object End Qualifier Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadLinkObjectEndQualifierActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration <em>Traced Read Self Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadSelfActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration <em>Traced Read Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadStructuralFeatureActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration <em>Traced Read Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReadVariableActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration <em>Traced Realization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration
	 * @generated
	 */
	public Adapter createTracedRealizationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration <em>Traced Reception Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration
	 * @generated
	 */
	public Adapter createTracedReceptionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration <em>Traced Reclassify Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReclassifyObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration <em>Traced Redefinable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration
	 * @generated
	 */
	public Adapter createTracedRedefinableElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration <em>Traced Redefinable Template Signature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration
	 * @generated
	 */
	public Adapter createTracedRedefinableTemplateSignatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration <em>Traced Reduce Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReduceActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration <em>Traced Region Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration
	 * @generated
	 */
	public Adapter createTracedRegionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration <em>Traced Relationship Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration
	 * @generated
	 */
	public Adapter createTracedRelationshipConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration <em>Traced Remove Structural Feature Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration
	 * @generated
	 */
	public Adapter createTracedRemoveStructuralFeatureValueActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration <em>Traced Remove Variable Value Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration
	 * @generated
	 */
	public Adapter createTracedRemoveVariableValueActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration <em>Traced Reply Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration
	 * @generated
	 */
	public Adapter createTracedReplyActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration <em>Traced Send Object Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration
	 * @generated
	 */
	public Adapter createTracedSendObjectActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration <em>Traced Send Signal Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration
	 * @generated
	 */
	public Adapter createTracedSendSignalActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration <em>Traced Sequence Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedSequenceNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration <em>Traced Signal Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration
	 * @generated
	 */
	public Adapter createTracedSignalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration <em>Traced Signal Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration
	 * @generated
	 */
	public Adapter createTracedSignalEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration <em>Traced Slot Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration
	 * @generated
	 */
	public Adapter createTracedSlotConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration <em>Traced Start Classifier Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration
	 * @generated
	 */
	public Adapter createTracedStartClassifierBehaviorActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration <em>Traced Start Object Behavior Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration
	 * @generated
	 */
	public Adapter createTracedStartObjectBehaviorActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration <em>Traced State Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration
	 * @generated
	 */
	public Adapter createTracedStateConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration <em>Traced State Invariant Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration
	 * @generated
	 */
	public Adapter createTracedStateInvariantConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration <em>Traced State Machine Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration
	 * @generated
	 */
	public Adapter createTracedStateMachineConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration <em>Traced Stereotype Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration
	 * @generated
	 */
	public Adapter createTracedStereotypeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration <em>Traced String Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration
	 * @generated
	 */
	public Adapter createTracedStringExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration <em>Traced Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration
	 * @generated
	 */
	public Adapter createTracedStructuralFeatureActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration <em>Traced Structural Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration
	 * @generated
	 */
	public Adapter createTracedStructuralFeatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration <em>Traced Structured Activity Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration
	 * @generated
	 */
	public Adapter createTracedStructuredActivityNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration <em>Traced Structured Classifier Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration
	 * @generated
	 */
	public Adapter createTracedStructuredClassifierConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration <em>Traced Substitution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration
	 * @generated
	 */
	public Adapter createTracedSubstitutionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration <em>Traced Template Binding Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration
	 * @generated
	 */
	public Adapter createTracedTemplateBindingConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration <em>Traced Template Parameter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration
	 * @generated
	 */
	public Adapter createTracedTemplateParameterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration <em>Traced Template Parameter Substitution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration
	 * @generated
	 */
	public Adapter createTracedTemplateParameterSubstitutionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration <em>Traced Template Signature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration
	 * @generated
	 */
	public Adapter createTracedTemplateSignatureConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration <em>Traced Templateable Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration
	 * @generated
	 */
	public Adapter createTracedTemplateableElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration <em>Traced Test Identity Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration
	 * @generated
	 */
	public Adapter createTracedTestIdentityActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration <em>Traced Time Constraint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration
	 * @generated
	 */
	public Adapter createTracedTimeConstraintConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration <em>Traced Time Event Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration
	 * @generated
	 */
	public Adapter createTracedTimeEventConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration <em>Traced Time Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration
	 * @generated
	 */
	public Adapter createTracedTimeExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration <em>Traced Time Interval Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration
	 * @generated
	 */
	public Adapter createTracedTimeIntervalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration <em>Traced Time Observation Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration
	 * @generated
	 */
	public Adapter createTracedTimeObservationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration <em>Traced Transition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration
	 * @generated
	 */
	public Adapter createTracedTransitionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration <em>Traced Trigger Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration
	 * @generated
	 */
	public Adapter createTracedTriggerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration <em>Traced Type Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration
	 * @generated
	 */
	public Adapter createTracedTypeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration <em>Traced Typed Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration
	 * @generated
	 */
	public Adapter createTracedTypedElementConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration <em>Traced Unmarshall Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration
	 * @generated
	 */
	public Adapter createTracedUnmarshallActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration <em>Traced Usage Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration
	 * @generated
	 */
	public Adapter createTracedUsageConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration <em>Traced Use Case Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration
	 * @generated
	 */
	public Adapter createTracedUseCaseConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration <em>Traced Value Pin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration
	 * @generated
	 */
	public Adapter createTracedValuePinConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration <em>Traced Value Specification Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration
	 * @generated
	 */
	public Adapter createTracedValueSpecificationActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration <em>Traced Value Specification Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration
	 * @generated
	 */
	public Adapter createTracedValueSpecificationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration <em>Traced Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration
	 * @generated
	 */
	public Adapter createTracedVariableActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration <em>Traced Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration
	 * @generated
	 */
	public Adapter createTracedVariableConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration <em>Traced Vertex Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration
	 * @generated
	 */
	public Adapter createTracedVertexConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration <em>Traced Write Link Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration
	 * @generated
	 */
	public Adapter createTracedWriteLinkActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration <em>Traced Write Structural Feature Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration
	 * @generated
	 */
	public Adapter createTracedWriteStructuralFeatureActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration <em>Traced Write Variable Action Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration
	 * @generated
	 */
	public Adapter createTracedWriteVariableActionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FumlConfigurationAdapterFactory
