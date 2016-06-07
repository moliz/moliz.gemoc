/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.impl;

import fumlConfigurationTrace.FumlConfigurationTracePackage;

import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.BasicActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.impl.BasicActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.IntermediateActionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.impl.IntermediateActionsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.impl.IntermediateActivitiesPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.impl.KernelPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.impl.BasicBehaviorsPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationFactory;
import fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Input.InputPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Input.impl.InputPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.LociPackageImpl;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.impl.IntegerFunctionsPackageImpl;

import fumlConfigurationTrace.States.impl.StatesPackageImpl;

import fumlConfigurationTrace.Steps.StepsPackage;

import fumlConfigurationTrace.Steps.impl.StepsPackageImpl;

import fumlConfigurationTrace.impl.FumlConfigurationTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.executionframework.engine.mse.MsePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FumlConfigurationPackageImpl extends EPackageImpl implements FumlConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAbstractionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAcceptCallActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAcceptEventActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActionExecutionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActionInputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityContentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityEdgeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityFinalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityGroupConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityParameterNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActivityPartitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedActorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAddStructuralFeatureValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAddVariableValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAnyReceiveEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedArtifactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAssociationClassConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedAssociationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBehaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBehaviorExecutionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBehavioralFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBehavioredClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedBroadcastSignalActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCallActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCallBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCallEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCallOperationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCentralBufferNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedChangeEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClassConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClassifierTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClauseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClearAssociationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClearStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedClearVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCollaborationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCollaborationUseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCombinedFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCommentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCommunicationPathConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedComponentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedComponentRealizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConditionalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectableElementTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectionPointReferenceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConnectorEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConsiderIgnoreFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedContinuationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedControlNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCreateLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCreateLinkObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedCreateObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDataStoreNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDataTypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDecisionNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDependencyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDeployedArtifactConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDeploymentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDeploymentSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDeploymentTargetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDestroyLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDestroyObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDestructionOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDeviceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDirectedRelationshipConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDurationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDurationConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDurationIntervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedDurationObservationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedElementImportConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEncapsulatedClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEnumerationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEnumerationLiteralConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExceptionHandlerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutableNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionEnvironmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExecutionSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExpansionNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExpansionRegionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExtendConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExtensionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExtensionEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedExtensionPointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFinalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFinalStateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFlowFinalNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedForkNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedFunctionBehaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedGateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedGeneralOrderingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedGeneralizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedGeneralizationSetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedImageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIncludeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInformationFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInformationItemConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInitialNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInstanceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInstanceValueConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInteractionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInteractionConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInteractionFragmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInteractionOperandConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInteractionUseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInterfaceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInterfaceRealizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInterruptibleActivityRegionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedIntervalConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedInvocationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedJoinNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLifelineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLinkEndCreationDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLinkEndDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLinkEndDestructionDataConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralBooleanConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralIntegerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralNullConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralRealConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralStringConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLiteralUnlimitedNaturalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedLoopNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedManifestationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMergeNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMessageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMessageEndConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMessageEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMessageOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedModelConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedMultiplicityElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamespaceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectFlowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObservationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOccurrenceSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOpaqueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOpaqueBehaviorConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOpaqueExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOperationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOperationTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedOutputPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPackageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPackageImportConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPackageMergeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPackageableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedParameterSetConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedParameterableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPartDecompositionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPortConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPrimitiveTypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedProfileApplicationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedProfileConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPropertyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedProtocolConformanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedProtocolStateMachineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedProtocolTransitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedPseudostateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedQualifierValueConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRaiseExceptionActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadExtentActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadIsClassifiedObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadLinkObjectEndActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadLinkObjectEndQualifierActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadSelfActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReadVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRealizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReceptionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReclassifyObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRedefinableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRedefinableTemplateSignatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReduceActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRegionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRelationshipConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRemoveStructuralFeatureValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRemoveVariableValueActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedReplyActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSendObjectActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSendSignalActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSequenceNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSignalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSignalEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSlotConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStartClassifierBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStartObjectBehaviorActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateInvariantConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStateMachineConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStereotypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStringExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuralFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuredActivityNodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedStructuredClassifierConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedSubstitutionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTemplateBindingConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTemplateParameterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTemplateParameterSubstitutionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTemplateSignatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTemplateableElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTestIdentityActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTimeConstraintConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTimeEventConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTimeExpressionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTimeIntervalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTimeObservationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTransitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTriggerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTypeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTypedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedUnmarshallActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedUsageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedUseCaseConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValuePinConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValueSpecificationActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedValueSpecificationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVariableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedVertexConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedWriteLinkActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedWriteStructuralFeatureActionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedWriteVariableActionConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FumlConfigurationPackageImpl() {
		super(eNS_URI, FumlConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FumlConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FumlConfigurationPackage init() {
		if (isInited) return (FumlConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		FumlConfigurationPackageImpl theFumlConfigurationPackage = (FumlConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FumlConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FumlConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		fumlConfiguration.FumlConfigurationPackage.eINSTANCE.eClass();
		MsePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FumlConfigurationTracePackageImpl theFumlConfigurationTracePackage = (FumlConfigurationTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) instanceof FumlConfigurationTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationTracePackage.eNS_URI) : FumlConfigurationTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		LociPackageImpl theLociPackage = (LociPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) instanceof LociPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LociPackage.eNS_URI) : LociPackage.eINSTANCE);
		IntermediateActivitiesPackageImpl theIntermediateActivitiesPackage = (IntermediateActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) instanceof IntermediateActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActivitiesPackage.eNS_URI) : IntermediateActivitiesPackage.eINSTANCE);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) instanceof KernelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI) : KernelPackage.eINSTANCE);
		BasicBehaviorsPackageImpl theBasicBehaviorsPackage = (BasicBehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) instanceof BasicBehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicBehaviorsPackage.eNS_URI) : BasicBehaviorsPackage.eINSTANCE);
		BasicActionsPackageImpl theBasicActionsPackage = (BasicActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) instanceof BasicActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicActionsPackage.eNS_URI) : BasicActionsPackage.eINSTANCE);
		IntermediateActionsPackageImpl theIntermediateActionsPackage = (IntermediateActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) instanceof IntermediateActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntermediateActionsPackage.eNS_URI) : IntermediateActionsPackage.eINSTANCE);
		InputPackageImpl theInputPackage = (InputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) instanceof InputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InputPackage.eNS_URI) : InputPackage.eINSTANCE);
		IntegerFunctionsPackageImpl theIntegerFunctionsPackage = (IntegerFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) instanceof IntegerFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegerFunctionsPackage.eNS_URI) : IntegerFunctionsPackage.eINSTANCE);

		// Load packages
		theFumlConfigurationTracePackage.loadPackage();

		// Fix loaded packages
		theFumlConfigurationPackage.fixPackageContents();
		theFumlConfigurationTracePackage.fixPackageContents();
		theStepsPackage.fixPackageContents();
		theStatesPackage.fixPackageContents();
		theLociPackage.fixPackageContents();
		theIntermediateActivitiesPackage.fixPackageContents();
		theKernelPackage.fixPackageContents();
		theBasicBehaviorsPackage.fixPackageContents();
		theBasicActionsPackage.fixPackageContents();
		theIntermediateActionsPackage.fixPackageContents();
		theInputPackage.fixPackageContents();
		theIntegerFunctionsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFumlConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FumlConfigurationPackage.eNS_URI, theFumlConfigurationPackage);
		return theFumlConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAbstractionConfiguration() {
		if (tracedAbstractionConfigurationEClass == null) {
			tracedAbstractionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(0);
		}
		return tracedAbstractionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAcceptCallActionConfiguration() {
		if (tracedAcceptCallActionConfigurationEClass == null) {
			tracedAcceptCallActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(1);
		}
		return tracedAcceptCallActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAcceptEventActionConfiguration() {
		if (tracedAcceptEventActionConfigurationEClass == null) {
			tracedAcceptEventActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(2);
		}
		return tracedAcceptEventActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActionConfiguration() {
		if (tracedActionConfigurationEClass == null) {
			tracedActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tracedActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActionExecutionSpecificationConfiguration() {
		if (tracedActionExecutionSpecificationConfigurationEClass == null) {
			tracedActionExecutionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tracedActionExecutionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActionInputPinConfiguration() {
		if (tracedActionInputPinConfigurationEClass == null) {
			tracedActionInputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(5);
		}
		return tracedActionInputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityConfiguration() {
		if (tracedActivityConfigurationEClass == null) {
			tracedActivityConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(6);
		}
		return tracedActivityConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityContentConfiguration() {
		if (tracedActivityContentConfigurationEClass == null) {
			tracedActivityContentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(7);
		}
		return tracedActivityContentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedActivityContentConfiguration_OriginalObject_ActivityContentConfiguration() {
        return (EReference)getTracedActivityContentConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityEdgeConfiguration() {
		if (tracedActivityEdgeConfigurationEClass == null) {
			tracedActivityEdgeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(8);
		}
		return tracedActivityEdgeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityFinalNodeConfiguration() {
		if (tracedActivityFinalNodeConfigurationEClass == null) {
			tracedActivityFinalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(9);
		}
		return tracedActivityFinalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityGroupConfiguration() {
		if (tracedActivityGroupConfigurationEClass == null) {
			tracedActivityGroupConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(10);
		}
		return tracedActivityGroupConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityNodeConfiguration() {
		if (tracedActivityNodeConfigurationEClass == null) {
			tracedActivityNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(11);
		}
		return tracedActivityNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityParameterNodeConfiguration() {
		if (tracedActivityParameterNodeConfigurationEClass == null) {
			tracedActivityParameterNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(12);
		}
		return tracedActivityParameterNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActivityPartitionConfiguration() {
		if (tracedActivityPartitionConfigurationEClass == null) {
			tracedActivityPartitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(13);
		}
		return tracedActivityPartitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedActorConfiguration() {
		if (tracedActorConfigurationEClass == null) {
			tracedActorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(14);
		}
		return tracedActorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAddStructuralFeatureValueActionConfiguration() {
		if (tracedAddStructuralFeatureValueActionConfigurationEClass == null) {
			tracedAddStructuralFeatureValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(15);
		}
		return tracedAddStructuralFeatureValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAddVariableValueActionConfiguration() {
		if (tracedAddVariableValueActionConfigurationEClass == null) {
			tracedAddVariableValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(16);
		}
		return tracedAddVariableValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAnyReceiveEventConfiguration() {
		if (tracedAnyReceiveEventConfigurationEClass == null) {
			tracedAnyReceiveEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(17);
		}
		return tracedAnyReceiveEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedArtifactConfiguration() {
		if (tracedArtifactConfigurationEClass == null) {
			tracedArtifactConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(18);
		}
		return tracedArtifactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAssociationClassConfiguration() {
		if (tracedAssociationClassConfigurationEClass == null) {
			tracedAssociationClassConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(19);
		}
		return tracedAssociationClassConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedAssociationConfiguration() {
		if (tracedAssociationConfigurationEClass == null) {
			tracedAssociationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(20);
		}
		return tracedAssociationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBehaviorConfiguration() {
		if (tracedBehaviorConfigurationEClass == null) {
			tracedBehaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(21);
		}
		return tracedBehaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBehaviorExecutionSpecificationConfiguration() {
		if (tracedBehaviorExecutionSpecificationConfigurationEClass == null) {
			tracedBehaviorExecutionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(22);
		}
		return tracedBehaviorExecutionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBehavioralFeatureConfiguration() {
		if (tracedBehavioralFeatureConfigurationEClass == null) {
			tracedBehavioralFeatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(23);
		}
		return tracedBehavioralFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBehavioredClassifierConfiguration() {
		if (tracedBehavioredClassifierConfigurationEClass == null) {
			tracedBehavioredClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(24);
		}
		return tracedBehavioredClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedBroadcastSignalActionConfiguration() {
		if (tracedBroadcastSignalActionConfigurationEClass == null) {
			tracedBroadcastSignalActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(25);
		}
		return tracedBroadcastSignalActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCallActionConfiguration() {
		if (tracedCallActionConfigurationEClass == null) {
			tracedCallActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(26);
		}
		return tracedCallActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCallBehaviorActionConfiguration() {
		if (tracedCallBehaviorActionConfigurationEClass == null) {
			tracedCallBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(27);
		}
		return tracedCallBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCallEventConfiguration() {
		if (tracedCallEventConfigurationEClass == null) {
			tracedCallEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(28);
		}
		return tracedCallEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCallOperationActionConfiguration() {
		if (tracedCallOperationActionConfigurationEClass == null) {
			tracedCallOperationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(29);
		}
		return tracedCallOperationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCentralBufferNodeConfiguration() {
		if (tracedCentralBufferNodeConfigurationEClass == null) {
			tracedCentralBufferNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(30);
		}
		return tracedCentralBufferNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedChangeEventConfiguration() {
		if (tracedChangeEventConfigurationEClass == null) {
			tracedChangeEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(31);
		}
		return tracedChangeEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClassConfiguration() {
		if (tracedClassConfigurationEClass == null) {
			tracedClassConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(32);
		}
		return tracedClassConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClassifierConfiguration() {
		if (tracedClassifierConfigurationEClass == null) {
			tracedClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(33);
		}
		return tracedClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClassifierTemplateParameterConfiguration() {
		if (tracedClassifierTemplateParameterConfigurationEClass == null) {
			tracedClassifierTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(34);
		}
		return tracedClassifierTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClauseConfiguration() {
		if (tracedClauseConfigurationEClass == null) {
			tracedClauseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(35);
		}
		return tracedClauseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClearAssociationActionConfiguration() {
		if (tracedClearAssociationActionConfigurationEClass == null) {
			tracedClearAssociationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(36);
		}
		return tracedClearAssociationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClearStructuralFeatureActionConfiguration() {
		if (tracedClearStructuralFeatureActionConfigurationEClass == null) {
			tracedClearStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(37);
		}
		return tracedClearStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedClearVariableActionConfiguration() {
		if (tracedClearVariableActionConfigurationEClass == null) {
			tracedClearVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(38);
		}
		return tracedClearVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCollaborationConfiguration() {
		if (tracedCollaborationConfigurationEClass == null) {
			tracedCollaborationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(39);
		}
		return tracedCollaborationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCollaborationUseConfiguration() {
		if (tracedCollaborationUseConfigurationEClass == null) {
			tracedCollaborationUseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(40);
		}
		return tracedCollaborationUseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCombinedFragmentConfiguration() {
		if (tracedCombinedFragmentConfigurationEClass == null) {
			tracedCombinedFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(41);
		}
		return tracedCombinedFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCommentConfiguration() {
		if (tracedCommentConfigurationEClass == null) {
			tracedCommentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(42);
		}
		return tracedCommentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCommunicationPathConfiguration() {
		if (tracedCommunicationPathConfigurationEClass == null) {
			tracedCommunicationPathConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(43);
		}
		return tracedCommunicationPathConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedComponentConfiguration() {
		if (tracedComponentConfigurationEClass == null) {
			tracedComponentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(44);
		}
		return tracedComponentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedComponentRealizationConfiguration() {
		if (tracedComponentRealizationConfigurationEClass == null) {
			tracedComponentRealizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(45);
		}
		return tracedComponentRealizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConditionalNodeConfiguration() {
		if (tracedConditionalNodeConfigurationEClass == null) {
			tracedConditionalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(46);
		}
		return tracedConditionalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectableElementConfiguration() {
		if (tracedConnectableElementConfigurationEClass == null) {
			tracedConnectableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(47);
		}
		return tracedConnectableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectableElementTemplateParameterConfiguration() {
		if (tracedConnectableElementTemplateParameterConfigurationEClass == null) {
			tracedConnectableElementTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(48);
		}
		return tracedConnectableElementTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectionPointReferenceConfiguration() {
		if (tracedConnectionPointReferenceConfigurationEClass == null) {
			tracedConnectionPointReferenceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(49);
		}
		return tracedConnectionPointReferenceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectorConfiguration() {
		if (tracedConnectorConfigurationEClass == null) {
			tracedConnectorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(50);
		}
		return tracedConnectorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConnectorEndConfiguration() {
		if (tracedConnectorEndConfigurationEClass == null) {
			tracedConnectorEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(51);
		}
		return tracedConnectorEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConsiderIgnoreFragmentConfiguration() {
		if (tracedConsiderIgnoreFragmentConfigurationEClass == null) {
			tracedConsiderIgnoreFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(52);
		}
		return tracedConsiderIgnoreFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedConstraintConfiguration() {
		if (tracedConstraintConfigurationEClass == null) {
			tracedConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(53);
		}
		return tracedConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedContinuationConfiguration() {
		if (tracedContinuationConfigurationEClass == null) {
			tracedContinuationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(54);
		}
		return tracedContinuationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlFlowConfiguration() {
		if (tracedControlFlowConfigurationEClass == null) {
			tracedControlFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(55);
		}
		return tracedControlFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedControlNodeConfiguration() {
		if (tracedControlNodeConfigurationEClass == null) {
			tracedControlNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(56);
		}
		return tracedControlNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCreateLinkActionConfiguration() {
		if (tracedCreateLinkActionConfigurationEClass == null) {
			tracedCreateLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(57);
		}
		return tracedCreateLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCreateLinkObjectActionConfiguration() {
		if (tracedCreateLinkObjectActionConfigurationEClass == null) {
			tracedCreateLinkObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(58);
		}
		return tracedCreateLinkObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedCreateObjectActionConfiguration() {
		if (tracedCreateObjectActionConfigurationEClass == null) {
			tracedCreateObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(59);
		}
		return tracedCreateObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDataStoreNodeConfiguration() {
		if (tracedDataStoreNodeConfigurationEClass == null) {
			tracedDataStoreNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(60);
		}
		return tracedDataStoreNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDataTypeConfiguration() {
		if (tracedDataTypeConfigurationEClass == null) {
			tracedDataTypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(61);
		}
		return tracedDataTypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDecisionNodeConfiguration() {
		if (tracedDecisionNodeConfigurationEClass == null) {
			tracedDecisionNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(62);
		}
		return tracedDecisionNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDependencyConfiguration() {
		if (tracedDependencyConfigurationEClass == null) {
			tracedDependencyConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(63);
		}
		return tracedDependencyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDeployedArtifactConfiguration() {
		if (tracedDeployedArtifactConfigurationEClass == null) {
			tracedDeployedArtifactConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(64);
		}
		return tracedDeployedArtifactConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDeploymentConfiguration() {
		if (tracedDeploymentConfigurationEClass == null) {
			tracedDeploymentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(65);
		}
		return tracedDeploymentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDeploymentSpecificationConfiguration() {
		if (tracedDeploymentSpecificationConfigurationEClass == null) {
			tracedDeploymentSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(66);
		}
		return tracedDeploymentSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDeploymentTargetConfiguration() {
		if (tracedDeploymentTargetConfigurationEClass == null) {
			tracedDeploymentTargetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(67);
		}
		return tracedDeploymentTargetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDestroyLinkActionConfiguration() {
		if (tracedDestroyLinkActionConfigurationEClass == null) {
			tracedDestroyLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(68);
		}
		return tracedDestroyLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDestroyObjectActionConfiguration() {
		if (tracedDestroyObjectActionConfigurationEClass == null) {
			tracedDestroyObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(69);
		}
		return tracedDestroyObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDestructionOccurrenceSpecificationConfiguration() {
		if (tracedDestructionOccurrenceSpecificationConfigurationEClass == null) {
			tracedDestructionOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(70);
		}
		return tracedDestructionOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDeviceConfiguration() {
		if (tracedDeviceConfigurationEClass == null) {
			tracedDeviceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(71);
		}
		return tracedDeviceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDirectedRelationshipConfiguration() {
		if (tracedDirectedRelationshipConfigurationEClass == null) {
			tracedDirectedRelationshipConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(72);
		}
		return tracedDirectedRelationshipConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDurationConfiguration() {
		if (tracedDurationConfigurationEClass == null) {
			tracedDurationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(73);
		}
		return tracedDurationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDurationConstraintConfiguration() {
		if (tracedDurationConstraintConfigurationEClass == null) {
			tracedDurationConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(74);
		}
		return tracedDurationConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDurationIntervalConfiguration() {
		if (tracedDurationIntervalConfigurationEClass == null) {
			tracedDurationIntervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(75);
		}
		return tracedDurationIntervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedDurationObservationConfiguration() {
		if (tracedDurationObservationConfigurationEClass == null) {
			tracedDurationObservationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(76);
		}
		return tracedDurationObservationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedElementConfiguration() {
		if (tracedElementConfigurationEClass == null) {
			tracedElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(77);
		}
		return tracedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedElementConfiguration_OriginalObject_ElementConfiguration() {
        return (EReference)getTracedElementConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedElementConfiguration_SemanticVisitorSequence() {
        return (EReference)getTracedElementConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedElementImportConfiguration() {
		if (tracedElementImportConfigurationEClass == null) {
			tracedElementImportConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(78);
		}
		return tracedElementImportConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEncapsulatedClassifierConfiguration() {
		if (tracedEncapsulatedClassifierConfigurationEClass == null) {
			tracedEncapsulatedClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(79);
		}
		return tracedEncapsulatedClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEnumerationConfiguration() {
		if (tracedEnumerationConfigurationEClass == null) {
			tracedEnumerationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(80);
		}
		return tracedEnumerationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEnumerationLiteralConfiguration() {
		if (tracedEnumerationLiteralConfigurationEClass == null) {
			tracedEnumerationLiteralConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(81);
		}
		return tracedEnumerationLiteralConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedEventConfiguration() {
		if (tracedEventConfigurationEClass == null) {
			tracedEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(82);
		}
		return tracedEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExceptionHandlerConfiguration() {
		if (tracedExceptionHandlerConfigurationEClass == null) {
			tracedExceptionHandlerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(83);
		}
		return tracedExceptionHandlerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutableNodeConfiguration() {
		if (tracedExecutableNodeConfigurationEClass == null) {
			tracedExecutableNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(84);
		}
		return tracedExecutableNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutionEnvironmentConfiguration() {
		if (tracedExecutionEnvironmentConfigurationEClass == null) {
			tracedExecutionEnvironmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(85);
		}
		return tracedExecutionEnvironmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutionOccurrenceSpecificationConfiguration() {
		if (tracedExecutionOccurrenceSpecificationConfigurationEClass == null) {
			tracedExecutionOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(86);
		}
		return tracedExecutionOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExecutionSpecificationConfiguration() {
		if (tracedExecutionSpecificationConfigurationEClass == null) {
			tracedExecutionSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(87);
		}
		return tracedExecutionSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExpansionNodeConfiguration() {
		if (tracedExpansionNodeConfigurationEClass == null) {
			tracedExpansionNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(88);
		}
		return tracedExpansionNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExpansionRegionConfiguration() {
		if (tracedExpansionRegionConfigurationEClass == null) {
			tracedExpansionRegionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(89);
		}
		return tracedExpansionRegionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExpressionConfiguration() {
		if (tracedExpressionConfigurationEClass == null) {
			tracedExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(90);
		}
		return tracedExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExtendConfiguration() {
		if (tracedExtendConfigurationEClass == null) {
			tracedExtendConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(91);
		}
		return tracedExtendConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExtensionConfiguration() {
		if (tracedExtensionConfigurationEClass == null) {
			tracedExtensionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(92);
		}
		return tracedExtensionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExtensionEndConfiguration() {
		if (tracedExtensionEndConfigurationEClass == null) {
			tracedExtensionEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(93);
		}
		return tracedExtensionEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedExtensionPointConfiguration() {
		if (tracedExtensionPointConfigurationEClass == null) {
			tracedExtensionPointConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(94);
		}
		return tracedExtensionPointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFeatureConfiguration() {
		if (tracedFeatureConfigurationEClass == null) {
			tracedFeatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(95);
		}
		return tracedFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFinalNodeConfiguration() {
		if (tracedFinalNodeConfigurationEClass == null) {
			tracedFinalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(96);
		}
		return tracedFinalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFinalStateConfiguration() {
		if (tracedFinalStateConfigurationEClass == null) {
			tracedFinalStateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(97);
		}
		return tracedFinalStateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFlowFinalNodeConfiguration() {
		if (tracedFlowFinalNodeConfigurationEClass == null) {
			tracedFlowFinalNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(98);
		}
		return tracedFlowFinalNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedForkNodeConfiguration() {
		if (tracedForkNodeConfigurationEClass == null) {
			tracedForkNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(99);
		}
		return tracedForkNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedFunctionBehaviorConfiguration() {
		if (tracedFunctionBehaviorConfigurationEClass == null) {
			tracedFunctionBehaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(100);
		}
		return tracedFunctionBehaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedGateConfiguration() {
		if (tracedGateConfigurationEClass == null) {
			tracedGateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(101);
		}
		return tracedGateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedGeneralOrderingConfiguration() {
		if (tracedGeneralOrderingConfigurationEClass == null) {
			tracedGeneralOrderingConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(102);
		}
		return tracedGeneralOrderingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedGeneralizationConfiguration() {
		if (tracedGeneralizationConfigurationEClass == null) {
			tracedGeneralizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(103);
		}
		return tracedGeneralizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedGeneralizationSetConfiguration() {
		if (tracedGeneralizationSetConfigurationEClass == null) {
			tracedGeneralizationSetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(104);
		}
		return tracedGeneralizationSetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedImageConfiguration() {
		if (tracedImageConfigurationEClass == null) {
			tracedImageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(105);
		}
		return tracedImageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIncludeConfiguration() {
		if (tracedIncludeConfigurationEClass == null) {
			tracedIncludeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(106);
		}
		return tracedIncludeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInformationFlowConfiguration() {
		if (tracedInformationFlowConfigurationEClass == null) {
			tracedInformationFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(107);
		}
		return tracedInformationFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInformationItemConfiguration() {
		if (tracedInformationItemConfigurationEClass == null) {
			tracedInformationItemConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(108);
		}
		return tracedInformationItemConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInitialNodeConfiguration() {
		if (tracedInitialNodeConfigurationEClass == null) {
			tracedInitialNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(109);
		}
		return tracedInitialNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInputPinConfiguration() {
		if (tracedInputPinConfigurationEClass == null) {
			tracedInputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(110);
		}
		return tracedInputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInstanceSpecificationConfiguration() {
		if (tracedInstanceSpecificationConfigurationEClass == null) {
			tracedInstanceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(111);
		}
		return tracedInstanceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInstanceValueConfiguration() {
		if (tracedInstanceValueConfigurationEClass == null) {
			tracedInstanceValueConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(112);
		}
		return tracedInstanceValueConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInteractionConfiguration() {
		if (tracedInteractionConfigurationEClass == null) {
			tracedInteractionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(113);
		}
		return tracedInteractionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInteractionConstraintConfiguration() {
		if (tracedInteractionConstraintConfigurationEClass == null) {
			tracedInteractionConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(114);
		}
		return tracedInteractionConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInteractionFragmentConfiguration() {
		if (tracedInteractionFragmentConfigurationEClass == null) {
			tracedInteractionFragmentConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(115);
		}
		return tracedInteractionFragmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInteractionOperandConfiguration() {
		if (tracedInteractionOperandConfigurationEClass == null) {
			tracedInteractionOperandConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(116);
		}
		return tracedInteractionOperandConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInteractionUseConfiguration() {
		if (tracedInteractionUseConfigurationEClass == null) {
			tracedInteractionUseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(117);
		}
		return tracedInteractionUseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInterfaceConfiguration() {
		if (tracedInterfaceConfigurationEClass == null) {
			tracedInterfaceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(118);
		}
		return tracedInterfaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInterfaceRealizationConfiguration() {
		if (tracedInterfaceRealizationConfigurationEClass == null) {
			tracedInterfaceRealizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(119);
		}
		return tracedInterfaceRealizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInterruptibleActivityRegionConfiguration() {
		if (tracedInterruptibleActivityRegionConfigurationEClass == null) {
			tracedInterruptibleActivityRegionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(120);
		}
		return tracedInterruptibleActivityRegionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntervalConfiguration() {
		if (tracedIntervalConfigurationEClass == null) {
			tracedIntervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(121);
		}
		return tracedIntervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedIntervalConstraintConfiguration() {
		if (tracedIntervalConstraintConfigurationEClass == null) {
			tracedIntervalConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(122);
		}
		return tracedIntervalConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedInvocationActionConfiguration() {
		if (tracedInvocationActionConfigurationEClass == null) {
			tracedInvocationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(123);
		}
		return tracedInvocationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedJoinNodeConfiguration() {
		if (tracedJoinNodeConfigurationEClass == null) {
			tracedJoinNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(124);
		}
		return tracedJoinNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLifelineConfiguration() {
		if (tracedLifelineConfigurationEClass == null) {
			tracedLifelineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(125);
		}
		return tracedLifelineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLinkActionConfiguration() {
		if (tracedLinkActionConfigurationEClass == null) {
			tracedLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(126);
		}
		return tracedLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLinkEndCreationDataConfiguration() {
		if (tracedLinkEndCreationDataConfigurationEClass == null) {
			tracedLinkEndCreationDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(127);
		}
		return tracedLinkEndCreationDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLinkEndDataConfiguration() {
		if (tracedLinkEndDataConfigurationEClass == null) {
			tracedLinkEndDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(128);
		}
		return tracedLinkEndDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLinkEndDestructionDataConfiguration() {
		if (tracedLinkEndDestructionDataConfigurationEClass == null) {
			tracedLinkEndDestructionDataConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(129);
		}
		return tracedLinkEndDestructionDataConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralBooleanConfiguration() {
		if (tracedLiteralBooleanConfigurationEClass == null) {
			tracedLiteralBooleanConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(130);
		}
		return tracedLiteralBooleanConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralIntegerConfiguration() {
		if (tracedLiteralIntegerConfigurationEClass == null) {
			tracedLiteralIntegerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(131);
		}
		return tracedLiteralIntegerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralNullConfiguration() {
		if (tracedLiteralNullConfigurationEClass == null) {
			tracedLiteralNullConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(132);
		}
		return tracedLiteralNullConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralRealConfiguration() {
		if (tracedLiteralRealConfigurationEClass == null) {
			tracedLiteralRealConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(133);
		}
		return tracedLiteralRealConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralSpecificationConfiguration() {
		if (tracedLiteralSpecificationConfigurationEClass == null) {
			tracedLiteralSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(134);
		}
		return tracedLiteralSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralStringConfiguration() {
		if (tracedLiteralStringConfigurationEClass == null) {
			tracedLiteralStringConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(135);
		}
		return tracedLiteralStringConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLiteralUnlimitedNaturalConfiguration() {
		if (tracedLiteralUnlimitedNaturalConfigurationEClass == null) {
			tracedLiteralUnlimitedNaturalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(136);
		}
		return tracedLiteralUnlimitedNaturalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedLoopNodeConfiguration() {
		if (tracedLoopNodeConfigurationEClass == null) {
			tracedLoopNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(137);
		}
		return tracedLoopNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedManifestationConfiguration() {
		if (tracedManifestationConfigurationEClass == null) {
			tracedManifestationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(138);
		}
		return tracedManifestationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMergeNodeConfiguration() {
		if (tracedMergeNodeConfigurationEClass == null) {
			tracedMergeNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(139);
		}
		return tracedMergeNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMessageConfiguration() {
		if (tracedMessageConfigurationEClass == null) {
			tracedMessageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(140);
		}
		return tracedMessageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMessageEndConfiguration() {
		if (tracedMessageEndConfigurationEClass == null) {
			tracedMessageEndConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(141);
		}
		return tracedMessageEndConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMessageEventConfiguration() {
		if (tracedMessageEventConfigurationEClass == null) {
			tracedMessageEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(142);
		}
		return tracedMessageEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMessageOccurrenceSpecificationConfiguration() {
		if (tracedMessageOccurrenceSpecificationConfigurationEClass == null) {
			tracedMessageOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(143);
		}
		return tracedMessageOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedModelConfiguration() {
		if (tracedModelConfigurationEClass == null) {
			tracedModelConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(144);
		}
		return tracedModelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedMultiplicityElementConfiguration() {
		if (tracedMultiplicityElementConfigurationEClass == null) {
			tracedMultiplicityElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(145);
		}
		return tracedMultiplicityElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElementConfiguration() {
		if (tracedNamedElementConfigurationEClass == null) {
			tracedNamedElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(146);
		}
		return tracedNamedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamespaceConfiguration() {
		if (tracedNamespaceConfigurationEClass == null) {
			tracedNamespaceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(147);
		}
		return tracedNamespaceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNodeConfiguration() {
		if (tracedNodeConfigurationEClass == null) {
			tracedNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(148);
		}
		return tracedNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectFlowConfiguration() {
		if (tracedObjectFlowConfigurationEClass == null) {
			tracedObjectFlowConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(149);
		}
		return tracedObjectFlowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectNodeConfiguration() {
		if (tracedObjectNodeConfigurationEClass == null) {
			tracedObjectNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(150);
		}
		return tracedObjectNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObservationConfiguration() {
		if (tracedObservationConfigurationEClass == null) {
			tracedObservationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(151);
		}
		return tracedObservationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOccurrenceSpecificationConfiguration() {
		if (tracedOccurrenceSpecificationConfigurationEClass == null) {
			tracedOccurrenceSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(152);
		}
		return tracedOccurrenceSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOpaqueActionConfiguration() {
		if (tracedOpaqueActionConfigurationEClass == null) {
			tracedOpaqueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(153);
		}
		return tracedOpaqueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOpaqueBehaviorConfiguration() {
		if (tracedOpaqueBehaviorConfigurationEClass == null) {
			tracedOpaqueBehaviorConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(154);
		}
		return tracedOpaqueBehaviorConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOpaqueExpressionConfiguration() {
		if (tracedOpaqueExpressionConfigurationEClass == null) {
			tracedOpaqueExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(155);
		}
		return tracedOpaqueExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOperationConfiguration() {
		if (tracedOperationConfigurationEClass == null) {
			tracedOperationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(156);
		}
		return tracedOperationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOperationTemplateParameterConfiguration() {
		if (tracedOperationTemplateParameterConfigurationEClass == null) {
			tracedOperationTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(157);
		}
		return tracedOperationTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedOutputPinConfiguration() {
		if (tracedOutputPinConfigurationEClass == null) {
			tracedOutputPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(158);
		}
		return tracedOutputPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPackageConfiguration() {
		if (tracedPackageConfigurationEClass == null) {
			tracedPackageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(159);
		}
		return tracedPackageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPackageImportConfiguration() {
		if (tracedPackageImportConfigurationEClass == null) {
			tracedPackageImportConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(160);
		}
		return tracedPackageImportConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPackageMergeConfiguration() {
		if (tracedPackageMergeConfigurationEClass == null) {
			tracedPackageMergeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(161);
		}
		return tracedPackageMergeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPackageableElementConfiguration() {
		if (tracedPackageableElementConfigurationEClass == null) {
			tracedPackageableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(162);
		}
		return tracedPackageableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedParameterConfiguration() {
		if (tracedParameterConfigurationEClass == null) {
			tracedParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(163);
		}
		return tracedParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedParameterSetConfiguration() {
		if (tracedParameterSetConfigurationEClass == null) {
			tracedParameterSetConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(164);
		}
		return tracedParameterSetConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedParameterableElementConfiguration() {
		if (tracedParameterableElementConfigurationEClass == null) {
			tracedParameterableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(165);
		}
		return tracedParameterableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPartDecompositionConfiguration() {
		if (tracedPartDecompositionConfigurationEClass == null) {
			tracedPartDecompositionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(166);
		}
		return tracedPartDecompositionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPinConfiguration() {
		if (tracedPinConfigurationEClass == null) {
			tracedPinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(167);
		}
		return tracedPinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPortConfiguration() {
		if (tracedPortConfigurationEClass == null) {
			tracedPortConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(168);
		}
		return tracedPortConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPrimitiveTypeConfiguration() {
		if (tracedPrimitiveTypeConfigurationEClass == null) {
			tracedPrimitiveTypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(169);
		}
		return tracedPrimitiveTypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedProfileApplicationConfiguration() {
		if (tracedProfileApplicationConfigurationEClass == null) {
			tracedProfileApplicationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(170);
		}
		return tracedProfileApplicationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedProfileConfiguration() {
		if (tracedProfileConfigurationEClass == null) {
			tracedProfileConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(171);
		}
		return tracedProfileConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPropertyConfiguration() {
		if (tracedPropertyConfigurationEClass == null) {
			tracedPropertyConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(172);
		}
		return tracedPropertyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedProtocolConformanceConfiguration() {
		if (tracedProtocolConformanceConfigurationEClass == null) {
			tracedProtocolConformanceConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(173);
		}
		return tracedProtocolConformanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedProtocolStateMachineConfiguration() {
		if (tracedProtocolStateMachineConfigurationEClass == null) {
			tracedProtocolStateMachineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(174);
		}
		return tracedProtocolStateMachineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedProtocolTransitionConfiguration() {
		if (tracedProtocolTransitionConfigurationEClass == null) {
			tracedProtocolTransitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(175);
		}
		return tracedProtocolTransitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedPseudostateConfiguration() {
		if (tracedPseudostateConfigurationEClass == null) {
			tracedPseudostateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(176);
		}
		return tracedPseudostateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedQualifierValueConfiguration() {
		if (tracedQualifierValueConfigurationEClass == null) {
			tracedQualifierValueConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(177);
		}
		return tracedQualifierValueConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRaiseExceptionActionConfiguration() {
		if (tracedRaiseExceptionActionConfigurationEClass == null) {
			tracedRaiseExceptionActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(178);
		}
		return tracedRaiseExceptionActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadExtentActionConfiguration() {
		if (tracedReadExtentActionConfigurationEClass == null) {
			tracedReadExtentActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(179);
		}
		return tracedReadExtentActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadIsClassifiedObjectActionConfiguration() {
		if (tracedReadIsClassifiedObjectActionConfigurationEClass == null) {
			tracedReadIsClassifiedObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(180);
		}
		return tracedReadIsClassifiedObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadLinkActionConfiguration() {
		if (tracedReadLinkActionConfigurationEClass == null) {
			tracedReadLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(181);
		}
		return tracedReadLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadLinkObjectEndActionConfiguration() {
		if (tracedReadLinkObjectEndActionConfigurationEClass == null) {
			tracedReadLinkObjectEndActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(182);
		}
		return tracedReadLinkObjectEndActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadLinkObjectEndQualifierActionConfiguration() {
		if (tracedReadLinkObjectEndQualifierActionConfigurationEClass == null) {
			tracedReadLinkObjectEndQualifierActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(183);
		}
		return tracedReadLinkObjectEndQualifierActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadSelfActionConfiguration() {
		if (tracedReadSelfActionConfigurationEClass == null) {
			tracedReadSelfActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(184);
		}
		return tracedReadSelfActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadStructuralFeatureActionConfiguration() {
		if (tracedReadStructuralFeatureActionConfigurationEClass == null) {
			tracedReadStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(185);
		}
		return tracedReadStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReadVariableActionConfiguration() {
		if (tracedReadVariableActionConfigurationEClass == null) {
			tracedReadVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(186);
		}
		return tracedReadVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRealizationConfiguration() {
		if (tracedRealizationConfigurationEClass == null) {
			tracedRealizationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(187);
		}
		return tracedRealizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReceptionConfiguration() {
		if (tracedReceptionConfigurationEClass == null) {
			tracedReceptionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(188);
		}
		return tracedReceptionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReclassifyObjectActionConfiguration() {
		if (tracedReclassifyObjectActionConfigurationEClass == null) {
			tracedReclassifyObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(189);
		}
		return tracedReclassifyObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRedefinableElementConfiguration() {
		if (tracedRedefinableElementConfigurationEClass == null) {
			tracedRedefinableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(190);
		}
		return tracedRedefinableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRedefinableTemplateSignatureConfiguration() {
		if (tracedRedefinableTemplateSignatureConfigurationEClass == null) {
			tracedRedefinableTemplateSignatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(191);
		}
		return tracedRedefinableTemplateSignatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReduceActionConfiguration() {
		if (tracedReduceActionConfigurationEClass == null) {
			tracedReduceActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(192);
		}
		return tracedReduceActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRegionConfiguration() {
		if (tracedRegionConfigurationEClass == null) {
			tracedRegionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(193);
		}
		return tracedRegionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRelationshipConfiguration() {
		if (tracedRelationshipConfigurationEClass == null) {
			tracedRelationshipConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(194);
		}
		return tracedRelationshipConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRemoveStructuralFeatureValueActionConfiguration() {
		if (tracedRemoveStructuralFeatureValueActionConfigurationEClass == null) {
			tracedRemoveStructuralFeatureValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(195);
		}
		return tracedRemoveStructuralFeatureValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRemoveVariableValueActionConfiguration() {
		if (tracedRemoveVariableValueActionConfigurationEClass == null) {
			tracedRemoveVariableValueActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(196);
		}
		return tracedRemoveVariableValueActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedReplyActionConfiguration() {
		if (tracedReplyActionConfigurationEClass == null) {
			tracedReplyActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(197);
		}
		return tracedReplyActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSendObjectActionConfiguration() {
		if (tracedSendObjectActionConfigurationEClass == null) {
			tracedSendObjectActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(198);
		}
		return tracedSendObjectActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSendSignalActionConfiguration() {
		if (tracedSendSignalActionConfigurationEClass == null) {
			tracedSendSignalActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(199);
		}
		return tracedSendSignalActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSequenceNodeConfiguration() {
		if (tracedSequenceNodeConfigurationEClass == null) {
			tracedSequenceNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(200);
		}
		return tracedSequenceNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSignalConfiguration() {
		if (tracedSignalConfigurationEClass == null) {
			tracedSignalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(201);
		}
		return tracedSignalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSignalEventConfiguration() {
		if (tracedSignalEventConfigurationEClass == null) {
			tracedSignalEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(202);
		}
		return tracedSignalEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSlotConfiguration() {
		if (tracedSlotConfigurationEClass == null) {
			tracedSlotConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(203);
		}
		return tracedSlotConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStartClassifierBehaviorActionConfiguration() {
		if (tracedStartClassifierBehaviorActionConfigurationEClass == null) {
			tracedStartClassifierBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(204);
		}
		return tracedStartClassifierBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStartObjectBehaviorActionConfiguration() {
		if (tracedStartObjectBehaviorActionConfigurationEClass == null) {
			tracedStartObjectBehaviorActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(205);
		}
		return tracedStartObjectBehaviorActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStateConfiguration() {
		if (tracedStateConfigurationEClass == null) {
			tracedStateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(206);
		}
		return tracedStateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStateInvariantConfiguration() {
		if (tracedStateInvariantConfigurationEClass == null) {
			tracedStateInvariantConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(207);
		}
		return tracedStateInvariantConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStateMachineConfiguration() {
		if (tracedStateMachineConfigurationEClass == null) {
			tracedStateMachineConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(208);
		}
		return tracedStateMachineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStereotypeConfiguration() {
		if (tracedStereotypeConfigurationEClass == null) {
			tracedStereotypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(209);
		}
		return tracedStereotypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStringExpressionConfiguration() {
		if (tracedStringExpressionConfigurationEClass == null) {
			tracedStringExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(210);
		}
		return tracedStringExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuralFeatureActionConfiguration() {
		if (tracedStructuralFeatureActionConfigurationEClass == null) {
			tracedStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(211);
		}
		return tracedStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuralFeatureConfiguration() {
		if (tracedStructuralFeatureConfigurationEClass == null) {
			tracedStructuralFeatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(212);
		}
		return tracedStructuralFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuredActivityNodeConfiguration() {
		if (tracedStructuredActivityNodeConfigurationEClass == null) {
			tracedStructuredActivityNodeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(213);
		}
		return tracedStructuredActivityNodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedStructuredClassifierConfiguration() {
		if (tracedStructuredClassifierConfigurationEClass == null) {
			tracedStructuredClassifierConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(214);
		}
		return tracedStructuredClassifierConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedSubstitutionConfiguration() {
		if (tracedSubstitutionConfigurationEClass == null) {
			tracedSubstitutionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(215);
		}
		return tracedSubstitutionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTemplateBindingConfiguration() {
		if (tracedTemplateBindingConfigurationEClass == null) {
			tracedTemplateBindingConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(216);
		}
		return tracedTemplateBindingConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTemplateParameterConfiguration() {
		if (tracedTemplateParameterConfigurationEClass == null) {
			tracedTemplateParameterConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(217);
		}
		return tracedTemplateParameterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTemplateParameterSubstitutionConfiguration() {
		if (tracedTemplateParameterSubstitutionConfigurationEClass == null) {
			tracedTemplateParameterSubstitutionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(218);
		}
		return tracedTemplateParameterSubstitutionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTemplateSignatureConfiguration() {
		if (tracedTemplateSignatureConfigurationEClass == null) {
			tracedTemplateSignatureConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(219);
		}
		return tracedTemplateSignatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTemplateableElementConfiguration() {
		if (tracedTemplateableElementConfigurationEClass == null) {
			tracedTemplateableElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(220);
		}
		return tracedTemplateableElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTestIdentityActionConfiguration() {
		if (tracedTestIdentityActionConfigurationEClass == null) {
			tracedTestIdentityActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(221);
		}
		return tracedTestIdentityActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTimeConstraintConfiguration() {
		if (tracedTimeConstraintConfigurationEClass == null) {
			tracedTimeConstraintConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(222);
		}
		return tracedTimeConstraintConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTimeEventConfiguration() {
		if (tracedTimeEventConfigurationEClass == null) {
			tracedTimeEventConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(223);
		}
		return tracedTimeEventConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTimeExpressionConfiguration() {
		if (tracedTimeExpressionConfigurationEClass == null) {
			tracedTimeExpressionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(224);
		}
		return tracedTimeExpressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTimeIntervalConfiguration() {
		if (tracedTimeIntervalConfigurationEClass == null) {
			tracedTimeIntervalConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(225);
		}
		return tracedTimeIntervalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTimeObservationConfiguration() {
		if (tracedTimeObservationConfigurationEClass == null) {
			tracedTimeObservationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(226);
		}
		return tracedTimeObservationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTransitionConfiguration() {
		if (tracedTransitionConfigurationEClass == null) {
			tracedTransitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(227);
		}
		return tracedTransitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTriggerConfiguration() {
		if (tracedTriggerConfigurationEClass == null) {
			tracedTriggerConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(228);
		}
		return tracedTriggerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTypeConfiguration() {
		if (tracedTypeConfigurationEClass == null) {
			tracedTypeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(229);
		}
		return tracedTypeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTypedElementConfiguration() {
		if (tracedTypedElementConfigurationEClass == null) {
			tracedTypedElementConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(230);
		}
		return tracedTypedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedUnmarshallActionConfiguration() {
		if (tracedUnmarshallActionConfigurationEClass == null) {
			tracedUnmarshallActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(231);
		}
		return tracedUnmarshallActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedUsageConfiguration() {
		if (tracedUsageConfigurationEClass == null) {
			tracedUsageConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(232);
		}
		return tracedUsageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedUseCaseConfiguration() {
		if (tracedUseCaseConfigurationEClass == null) {
			tracedUseCaseConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(233);
		}
		return tracedUseCaseConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValuePinConfiguration() {
		if (tracedValuePinConfigurationEClass == null) {
			tracedValuePinConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(234);
		}
		return tracedValuePinConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValueSpecificationActionConfiguration() {
		if (tracedValueSpecificationActionConfigurationEClass == null) {
			tracedValueSpecificationActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(235);
		}
		return tracedValueSpecificationActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedValueSpecificationConfiguration() {
		if (tracedValueSpecificationConfigurationEClass == null) {
			tracedValueSpecificationConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(236);
		}
		return tracedValueSpecificationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariableActionConfiguration() {
		if (tracedVariableActionConfigurationEClass == null) {
			tracedVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(237);
		}
		return tracedVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVariableConfiguration() {
		if (tracedVariableConfigurationEClass == null) {
			tracedVariableConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(238);
		}
		return tracedVariableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedVertexConfiguration() {
		if (tracedVertexConfigurationEClass == null) {
			tracedVertexConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(239);
		}
		return tracedVertexConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedWriteLinkActionConfiguration() {
		if (tracedWriteLinkActionConfigurationEClass == null) {
			tracedWriteLinkActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(240);
		}
		return tracedWriteLinkActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedWriteStructuralFeatureActionConfiguration() {
		if (tracedWriteStructuralFeatureActionConfigurationEClass == null) {
			tracedWriteStructuralFeatureActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(241);
		}
		return tracedWriteStructuralFeatureActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedWriteVariableActionConfiguration() {
		if (tracedWriteVariableActionConfigurationEClass == null) {
			tracedWriteVariableActionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FumlConfigurationPackage.eNS_URI).getEClassifiers().get(242);
		}
		return tracedWriteVariableActionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationFactory getFumlConfigurationFactory() {
		return (FumlConfigurationFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fumlConfigurationTrace.States.fumlConfiguration." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FumlConfigurationPackageImpl
