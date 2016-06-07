package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.gemoc.executionframework.engine.core.CommandExecution;
import org.gemoc.executionframework.engine.mse.LaunchConfiguration;
import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.Step;

import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

public class FumlConfigurationTraceExplorer implements ITraceExplorer {

	private fumlConfigurationTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private fumlConfigurationTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends fumlConfigurationTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<fumlConfigurationTrace.States.State> statesTrace;

	private fumlConfigurationTrace.Steps.SpecificStep stepIntoResult;
	private fumlConfigurationTrace.Steps.SpecificStep stepOverResult;
	private fumlConfigurationTrace.Steps.SpecificStep stepReturnResult;

	private fumlConfigurationTrace.Steps.SpecificStep stepBackIntoResult;
	private fumlConfigurationTrace.Steps.SpecificStep stepBackOverResult;
	private fumlConfigurationTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<fumlConfigurationTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<fumlConfigurationTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	public FumlConfigurationTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public FumlConfigurationTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends fumlConfigurationTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends fumlConfigurationTrace.States.Value>> result = new ArrayList<>();
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAbstractionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAcceptCallActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAcceptEventActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActionExecutionSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActionInputPinConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityContentConfigurations()) {
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityEdgeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityEdgeInstances()) {
			result.add(tracedObject.getEdge_ActivityEdgeInstanceSequence());
			result.add(tracedObject.getGroup_ActivityEdgeInstanceSequence());
			result.add(tracedObject.getOffersSequence());
			result.add(tracedObject.getSourceSequence());
			result.add(tracedObject.getTargetSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityExecutions()) {
			result.add(tracedObject.getActivationGroupSequence());
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityFinalNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityFinalNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityGroupConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityNodeActivationGroups()) {
			result.add(tracedObject.getActivityExecutionSequence());
			result.add(tracedObject.getEdgeInstancesSequence());
			result.add(tracedObject.getNodeActivationsSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityParameterNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getOfferedTokenCountSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityParameterNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActivityPartitionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedActorConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation tracedObject : traceRoot
				.getIntermediateActions_tracedAddStructuralFeatureValueActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAddStructuralFeatureValueActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAddVariableValueActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAnyReceiveEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedArtifactConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAssociationClassConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedAssociationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedBehaviorConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedBehaviorExecutionSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedBehavioralFeatureConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedBehavioredClassifierConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue tracedObject : traceRoot
				.getKernel_tracedBooleanValues()) {
			result.add(tracedObject.getValue_BooleanValueSequence());
			result.add(tracedObject.getTypeSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedBroadcastSignalActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCallActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation tracedObject : traceRoot
				.getBasicActions_tracedCallBehaviorActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getCallExecutionsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCallBehaviorActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCallEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCallOperationActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCentralBufferNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedChangeEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClassConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClassifierConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClassifierTemplateParameterConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClauseConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClearAssociationActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClearStructuralFeatureActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedClearVariableActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCollaborationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCollaborationUseConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCombinedFragmentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCommentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCommunicationPathConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedComponentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedComponentRealizationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConditionalNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConnectableElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConnectableElementTemplateParameterConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConnectionPointReferenceConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConnectorConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConnectorEndConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConsiderIgnoreFragmentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedConstraintConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedContinuationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedControlFlowConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedControlNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedControlToken tracedObject : traceRoot
				.getIntermediateActivities_tracedControlTokens()) {
			result.add(tracedObject.getHolderSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCreateLinkActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCreateLinkObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation tracedObject : traceRoot
				.getIntermediateActions_tracedCreateObjectActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedCreateObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDataStoreNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDataTypeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedDecisionNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDecisionNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDependencyConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDeployedArtifactConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDeploymentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDeploymentSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDeploymentTargetConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDestroyLinkActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDestroyObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDestructionOccurrenceSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDeviceConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDirectedRelationshipConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDurationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDurationConstraintConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDurationIntervalConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedDurationObservationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedElementImportConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedEncapsulatedClassifierConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedEnumerationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedEnumerationLiteralConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExceptionHandlerConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExecutableNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment tracedObject : traceRoot
				.getLoci_tracedExecutionEnvironments()) {
			result.add(tracedObject.getLocus_ExecutionEnvironmentSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExecutionEnvironmentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject : traceRoot
				.getLoci_tracedExecutionFactorys()) {
			result.add(tracedObject.getBuiltInTypesSequence());
			result.add(tracedObject.getLocus_ExecutionFactorySequence());
			result.add(tracedObject.getPrimitiveBehaviorPrototypesSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExecutionOccurrenceSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExecutionSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutor tracedObject : traceRoot
				.getLoci_tracedExecutors()) {
			result.add(tracedObject.getLocus_ExecutorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExpansionNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExpansionRegionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExpressionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExtendConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExtensionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExtensionEndConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedExtensionPointConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedFeatureConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedFinalNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedFinalStateConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedFlowFinalNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedForkNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedForkNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken tracedObject : traceRoot
				.getIntermediateActivities_tracedForkedTokens()) {
			result.add(tracedObject.getBaseTokenSequence());
			result.add(tracedObject.getBaseTokenIsWithdrawnSequence());
			result.add(tracedObject.getRemainingOffersCountSequence());
			result.add(tracedObject.getHolderSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedFunctionBehaviorConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedGateConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedGeneralOrderingConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedGeneralizationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedGeneralizationSetConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedImageConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedIncludeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInformationFlowConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInformationItemConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedInitialNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInitialNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject : traceRoot
				.getInput_tracedInputParameterValuess()) {
			result.add(tracedObject.getNameSequence());
			result.add(tracedObject.getParameterValuesSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation tracedObject : traceRoot
				.getBasicActions_tracedInputPinActivations()) {
			result.add(tracedObject.getActionActivationSequence());
			result.add(tracedObject.getCount_tempSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getOfferedTokenCountSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInputPinConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInstanceSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInstanceValueConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue tracedObject : traceRoot
				.getKernel_tracedIntegerValues()) {
			result.add(tracedObject.getValue_IntegerValueSequence());
			result.add(tracedObject.getTypeSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInteractionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInteractionConstraintConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInteractionFragmentConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInteractionOperandConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInteractionUseConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInterfaceConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInterfaceRealizationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInterruptibleActivityRegionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedIntervalConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedIntervalConstraintConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedInvocationActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedJoinNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedJoinNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLifelineConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLinkActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLinkEndCreationDataConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLinkEndDataConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLinkEndDestructionDataConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralBooleanConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation tracedObject : traceRoot
				.getKernel_tracedLiteralBooleanEvaluations()) {
			result.add(tracedObject.getLocus_EvaluationSequence());
			result.add(tracedObject.getSpecification_EvaluationSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralIntegerConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation tracedObject : traceRoot
				.getKernel_tracedLiteralIntegerEvaluations()) {
			result.add(tracedObject.getLocus_EvaluationSequence());
			result.add(tracedObject.getSpecification_EvaluationSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralNullConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralRealConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralStringConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLiteralUnlimitedNaturalConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject : traceRoot
				.getLoci_tracedLocuss()) {
			result.add(tracedObject.getExecutorSequence());
			result.add(tracedObject.getExtensionalValuesSequence());
			result.add(tracedObject.getFactorySequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedLoopNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedManifestationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation tracedObject : traceRoot
				.getIntermediateActivities_tracedMergeNodeActivations()) {
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMergeNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMessageConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMessageEndConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMessageEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMessageOccurrenceSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedModelConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedMultiplicityElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedNamedElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedNamespaceConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject : traceRoot
				.getKernel_tracedObjects()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedObjectFlowConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedObjectNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken tracedObject : traceRoot
				.getIntermediateActivities_tracedObjectTokens()) {
			result.add(tracedObject.getValueSequence());
			result.add(tracedObject.getHolderSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedObservationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOccurrenceSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject : traceRoot
				.getIntermediateActivities_tracedOffers()) {
			result.add(tracedObject.getOfferedTokensSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation tracedObject : traceRoot
				.getBasicActions_tracedOpaqueActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOpaqueActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOpaqueBehaviorConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOpaqueExpressionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOperationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOperationTemplateParameterConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation tracedObject : traceRoot
				.getBasicActions_tracedOutputPinActivations()) {
			result.add(tracedObject.getActionActivationSequence());
			result.add(tracedObject.getCount_tempSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getOfferedTokenCountSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedOutputPinConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPackageConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPackageImportConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPackageMergeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPackageableElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedParameterConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedParameterSetConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject : traceRoot
				.getBasicBehaviors_tracedParameterValues()) {
			result.add(tracedObject.getParameter_ParameterValueSequence());
			result.add(tracedObject.getValues_ParameterValueSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedParameterableElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPartDecompositionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPinConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPortConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPrimitiveTypeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedProfileApplicationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedProfileConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPropertyConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedProtocolConformanceConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedProtocolStateMachineConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedProtocolTransitionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedPseudostateConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedQualifierValueConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRaiseExceptionActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadExtentActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadIsClassifiedObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadLinkActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadLinkObjectEndActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadLinkObjectEndQualifierActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadSelfActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation tracedObject : traceRoot
				.getIntermediateActions_tracedReadStructuralFeatureActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadStructuralFeatureActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReadVariableActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRealizationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReceptionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReclassifyObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRedefinableElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRedefinableTemplateSignatureConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReduceActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedReference tracedObject : traceRoot
				.getKernel_tracedReferences()) {
			result.add(tracedObject.getReferentSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRegionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRelationshipConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRemoveStructuralFeatureValueActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedRemoveVariableValueActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedReplyActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor tracedObject : traceRoot
				.getLoci_tracedSemanticVisitors()) {
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSendObjectActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSendSignalActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSequenceNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSignalConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSignalEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSlotConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStartClassifierBehaviorActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStartObjectBehaviorActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStateConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStateInvariantConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStateMachineConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStereotypeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStringExpressionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStructuralFeatureActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStructuralFeatureConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStructuredActivityNodeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedStructuredClassifierConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedSubstitutionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTemplateBindingConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTemplateParameterConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTemplateParameterSubstitutionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTemplateSignatureConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTemplateableElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTestIdentityActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTimeConstraintConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTimeEventConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTimeExpressionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTimeIntervalConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTimeObservationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken tracedObject : traceRoot
				.getIntermediateActivities_tracedTokens()) {
			result.add(tracedObject.getHolderSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTransitionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTriggerConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTypeConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedTypedElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedUnmarshallActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedUsageConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedUseCaseConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedValuePinConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation tracedObject : traceRoot
				.getIntermediateActions_tracedValueSpecificationActionActivations()) {
			result.add(tracedObject.getFiringSequence());
			result.add(tracedObject.getPinActivationsSequence());
			result.add(tracedObject.getGroup_ActivityNodeActivationSequence());
			result.add(tracedObject.getHeldTokensSequence());
			result.add(tracedObject.getIncomingEdgesSequence());
			result.add(tracedObject.getIsRunningSequence());
			result.add(tracedObject.getNode_ActivityNodeActivationSequence());
			result.add(tracedObject.getOutgoingEdgesSequence());
			result.add(tracedObject.getRunningSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedValueSpecificationActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedValueSpecificationConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedVariableActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedVariableConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedVertexConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedWriteLinkActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedWriteStructuralFeatureActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedWriteVariableActionConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		return result;
	}

	private fumlConfigurationTrace.States.Value getActiveValue(
			List<? extends fumlConfigurationTrace.States.Value> valueTrace, fumlConfigurationTrace.States.State state) {
		fumlConfigurationTrace.States.Value result = null;
		for (fumlConfigurationTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends fumlConfigurationTrace.States.Value> valueTrace) {
		fumlConfigurationTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			return valueTrace.indexOf(value) - 1;
		} else {
			int i = getCurrentStateIndex() - 1;
			while (i > -1 && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i--;
			}
			if (value == null) {
				return -1;
			} else {
				return valueTrace.indexOf(value) - 1;
			}
		}
	}

	private int getNextValueIndex(List<? extends fumlConfigurationTrace.States.Value> valueTrace) {
		fumlConfigurationTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			final int idx = valueTrace.indexOf(value) + 1;
			if (idx < valueTrace.size()) {
				return idx;
			}
			return -1;
		} else {
			int i = getCurrentStateIndex() + 1;
			final int traceLength = valueTrace.size();
			while (i < traceLength && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i++;
			}
			if (value == null) {
				return -1;
			} else {
				final int idx = valueTrace.indexOf(value) + 1;
				if (idx < valueTrace.size()) {
					return idx;
				}
				return -1;
			}
		}
	}

	private ValueWrapper getValueWrapper(fumlConfigurationTrace.States.Value value, int valueIndex) {
		List<fumlConfigurationTrace.States.State> states = value.getStatesNoOpposite();
		fumlConfigurationTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private int getStartingIndex(fumlConfigurationTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(fumlConfigurationTrace.Steps.SpecificStep step) {
		if (stepToEndingIndex.containsKey(step)) {
			return stepToEndingIndex.get(step);
		} else {
			if (step.getEndingState() != null) {
				final int i = statesTrace.indexOf(step.getEndingState());
				stepToEndingIndex.put(step, i);
				return i;
			}
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private fumlConfigurationTrace.Steps.SpecificStep findNextStep(
			final List<fumlConfigurationTrace.Steps.SpecificStep> stepPath,
			final fumlConfigurationTrace.Steps.SpecificStep previousStep, final int start) {
		final List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		fumlConfigurationTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		fumlConfigurationTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final fumlConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<fumlConfigurationTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(
						((SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private fumlConfigurationTrace.Steps.SpecificStep computeBackInto(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		fumlConfigurationTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final fumlConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final fumlConfigurationTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) parentStep;
			final List<? extends fumlConfigurationTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast
					.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final fumlConfigurationTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				fumlConfigurationTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<fumlConfigurationTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final fumlConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				fumlConfigurationTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<fumlConfigurationTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private fumlConfigurationTrace.Steps.SpecificStep computeBackOver(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		fumlConfigurationTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final fumlConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final fumlConfigurationTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) parentStep;
			final List<fumlConfigurationTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final fumlConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private fumlConfigurationTrace.Steps.SpecificStep computeBackOut(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private fumlConfigurationTrace.Steps.SpecificStep computeStepInto(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath,
			List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private fumlConfigurationTrace.Steps.SpecificStep computeStepOver(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath,
			List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private fumlConfigurationTrace.Steps.SpecificStep computeStepReturn(
			List<fumlConfigurationTrace.Steps.SpecificStep> stepPath,
			List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<fumlConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<fumlConfigurationTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections
				.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	@SuppressWarnings("unchecked")
	private void goTo(EObject eObject) {
		if (eObject instanceof fumlConfigurationTrace.States.State) {
			fumlConfigurationTrace.States.State stateToGo = (fumlConfigurationTrace.States.State) eObject;
			for (fumlConfigurationTrace.States.ElementConfiguration_semanticVisitor_Value value : stateToGo
					.getElementConfiguration_semanticVisitor_Values()) {
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAbstractionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptCallActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAcceptEventActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActionExecutionSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActionInputPinConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityEdgeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityFinalNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityParameterNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActivityPartitionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedActorConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAddStructuralFeatureValueActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAddVariableValueActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAnyReceiveEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedArtifactConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationClassConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedAssociationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedBehaviorExecutionSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioralFeatureConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedBehavioredClassifierConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedBroadcastSignalActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCallActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCallBehaviorActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCallEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCallOperationActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCentralBufferNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedChangeEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClassConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClassifierTemplateParameterConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClauseConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClearAssociationActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClearStructuralFeatureActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedClearVariableActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCollaborationUseConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCombinedFragmentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCommentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCommunicationPathConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedComponentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedComponentRealizationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConditionalNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectableElementTemplateParameterConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectionPointReferenceConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConnectorEndConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConsiderIgnoreFragmentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedConstraintConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedContinuationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedControlFlowConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedControlNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateLinkObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedCreateObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDataStoreNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDataTypeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDecisionNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDependencyConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDeployedArtifactConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDeploymentTargetConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyLinkActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDestroyObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDestructionOccurrenceSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDeviceConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDirectedRelationshipConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationConstraintConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationIntervalConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedDurationObservationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedElementImportConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedEncapsulatedClassifierConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedEnumerationLiteralConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExceptionHandlerConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutableNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionEnvironmentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionOccurrenceSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExecutionSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExpansionRegionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExpressionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExtendConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionEndConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedExtensionPointConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedFeatureConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedFinalNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedFinalStateConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedFlowFinalNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedForkNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedFunctionBehaviorConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedGateConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralOrderingConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedGeneralizationSetConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedImageConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedIncludeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInformationFlowConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInformationItemConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInitialNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInputPinConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInstanceValueConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionConstraintConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionFragmentConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionOperandConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInteractionUseConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInterfaceRealizationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInterruptibleActivityRegionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedIntervalConstraintConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedInvocationActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedJoinNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLifelineConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndCreationDataConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDataConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLinkEndDestructionDataConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralBooleanConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralIntegerConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralNullConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralRealConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralStringConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLiteralUnlimitedNaturalConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedLoopNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedManifestationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMergeNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEndConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMessageOccurrenceSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedModelConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedMultiplicityElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedNamedElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedNamespaceConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedObjectFlowConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedObjectNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedObservationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOccurrenceSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueBehaviorConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOpaqueExpressionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOperationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOperationTemplateParameterConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedOutputPinConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageImportConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageMergeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPackageableElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterSetConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedParameterableElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPartDecompositionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPinConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPortConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPrimitiveTypeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedProfileApplicationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedProfileConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPropertyConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolConformanceConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolStateMachineConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedProtocolTransitionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedPseudostateConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedQualifierValueConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRaiseExceptionActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadExtentActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadIsClassifiedObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadLinkObjectEndQualifierActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadSelfActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadStructuralFeatureActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReadVariableActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRealizationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReceptionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReclassifyObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRedefinableTemplateSignatureConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReduceActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRegionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRelationshipConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveStructuralFeatureValueActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedRemoveVariableValueActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedReplyActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSendObjectActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSendSignalActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSequenceNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSignalConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSignalEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSlotConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStartClassifierBehaviorActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStartObjectBehaviorActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStateConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStateInvariantConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStateMachineConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStereotypeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStringExpressionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuralFeatureConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredActivityNodeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedStructuredClassifierConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedSubstitutionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateBindingConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateParameterSubstitutionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateSignatureConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTemplateableElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTestIdentityActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeConstraintConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeEventConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeExpressionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeIntervalConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTimeObservationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTransitionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTriggerConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTypeConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedTypedElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedUnmarshallActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedUsageConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedUseCaseConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedValuePinConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedVariableActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedVariableConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedVertexConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ElementConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteLinkActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteStructuralFeatureActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
				if (value
						.getParent() instanceof fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration) {
					fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration parent_cast = (fumlConfigurationTrace.States.fumlConfiguration.TracedWriteVariableActionConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject_ActivityContentConfiguration();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
			}
			for (fumlConfigurationTrace.States.ActionActivation_firing_Value value : stateToGo
					.getActionActivation_firing_Values()) {
				fumlConfiguration.Actions.BasicActions.ActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
						value.getParent());
				exeObject.setFiring((boolean) value.isFiring());
			}
			for (fumlConfigurationTrace.States.ActionActivation_pinActivations_Value value : stateToGo
					.getActionActivation_pinActivations_Values()) {
				fumlConfiguration.Actions.BasicActions.ActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
						value.getParent());
				exeObject.getPinActivations().clear();
				exeObject.getPinActivations()
						.addAll((Collection<? extends fumlConfiguration.Actions.BasicActions.PinActivation>) getTracedToExe(
								value.getPinActivations()));
			}
			for (fumlConfigurationTrace.States.CallActionActivation_callExecutions_Value value : stateToGo
					.getCallActionActivation_callExecutions_Values()) {
				fumlConfiguration.Actions.BasicActions.CallActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.CallActionActivation) getTracedToExe(
						value.getParent());
				exeObject.getCallExecutions().clear();
				exeObject.getCallExecutions()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution>) getTracedToExe(
								value.getCallExecutions()));
			}
			for (fumlConfigurationTrace.States.PinActivation_actionActivation_Value value : stateToGo
					.getPinActivation_actionActivation_Values()) {
				fumlConfiguration.Actions.BasicActions.PinActivation exeObject = (fumlConfiguration.Actions.BasicActions.PinActivation) getTracedToExe(
						value.getParent());
				exeObject.setActionActivation(
						(fumlConfiguration.Actions.BasicActions.ActionActivation) (fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
								value.getActionActivation()));
			}
			for (fumlConfigurationTrace.States.PinActivation_count_temp_Value value : stateToGo
					.getPinActivation_count_temp_Values()) {
				fumlConfiguration.Actions.BasicActions.PinActivation exeObject = (fumlConfiguration.Actions.BasicActions.PinActivation) getTracedToExe(
						value.getParent());
				exeObject.setCount_temp((int) value.getCount_temp());
			}
			for (fumlConfigurationTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value value : stateToGo
					.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setEdge_ActivityEdgeInstance(
						(org.eclipse.uml2.uml.ActivityEdge) value.getEdge_ActivityEdgeInstance());
			}
			for (fumlConfigurationTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value value : stateToGo
					.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setGroup_ActivityEdgeInstance(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getGroup_ActivityEdgeInstance()));
			}
			for (fumlConfigurationTrace.States.ActivityEdgeInstance_offers_Value value : stateToGo
					.getActivityEdgeInstance_offers_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.getOffers().clear();
				exeObject.getOffers()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Offer>) getTracedToExe(
								value.getOffers()));
			}
			for (fumlConfigurationTrace.States.ActivityEdgeInstance_source_Value value : stateToGo
					.getActivityEdgeInstance_source_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setSource(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getSource()));
			}
			for (fumlConfigurationTrace.States.ActivityEdgeInstance_target_Value value : stateToGo
					.getActivityEdgeInstance_target_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setTarget(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getTarget()));
			}
			for (fumlConfigurationTrace.States.ActivityExecution_activationGroup_Value value : stateToGo
					.getActivityExecution_activationGroup_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityExecution exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) getTracedToExe(
						value.getParent());
				exeObject.setActivationGroup(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getActivationGroup()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value value : stateToGo
					.getActivityNodeActivation_group_ActivityNodeActivation_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setGroup_ActivityNodeActivation(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getGroup_ActivityNodeActivation()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_heldTokens_Value value : stateToGo
					.getActivityNodeActivation_heldTokens_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getHeldTokens().clear();
				exeObject.getHeldTokens()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Token>) getTracedToExe(
								value.getHeldTokens()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_incomingEdges_Value value : stateToGo
					.getActivityNodeActivation_incomingEdges_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getIncomingEdges().clear();
				exeObject.getIncomingEdges()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getIncomingEdges()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_isRunning_Value value : stateToGo
					.getActivityNodeActivation_isRunning_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setIsRunning((boolean) value.isIsRunning());
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value value : stateToGo
					.getActivityNodeActivation_node_ActivityNodeActivation_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setNode_ActivityNodeActivation(
						(org.eclipse.uml2.uml.ActivityNode) value.getNode_ActivityNodeActivation());
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_outgoingEdges_Value value : stateToGo
					.getActivityNodeActivation_outgoingEdges_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getOutgoingEdges().clear();
				exeObject.getOutgoingEdges()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getOutgoingEdges()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivation_running_Value value : stateToGo
					.getActivityNodeActivation_running_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setRunning((boolean) value.isRunning());
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivationGroup_activityExecution_Value value : stateToGo
					.getActivityNodeActivationGroup_activityExecution_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.setActivityExecution(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) getTracedToExe(
								value.getActivityExecution()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivationGroup_edgeInstances_Value value : stateToGo
					.getActivityNodeActivationGroup_edgeInstances_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.getEdgeInstances().clear();
				exeObject.getEdgeInstances()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getEdgeInstances()));
			}
			for (fumlConfigurationTrace.States.ActivityNodeActivationGroup_nodeActivations_Value value : stateToGo
					.getActivityNodeActivationGroup_nodeActivations_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.getNodeActivations().clear();
				exeObject.getNodeActivations()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation>) getTracedToExe(
								value.getNodeActivations()));
			}
			for (fumlConfigurationTrace.States.ForkedToken_baseToken_Value value : stateToGo
					.getForkedToken_baseToken_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setBaseToken(
						(fumlConfiguration.Activities.IntermediateActivities.Token) (fumlConfiguration.Activities.IntermediateActivities.Token) getTracedToExe(
								value.getBaseToken()));
			}
			for (fumlConfigurationTrace.States.ForkedToken_baseTokenIsWithdrawn_Value value : stateToGo
					.getForkedToken_baseTokenIsWithdrawn_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setBaseTokenIsWithdrawn((boolean) value.isBaseTokenIsWithdrawn());
			}
			for (fumlConfigurationTrace.States.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setRemainingOffersCount((int) value.getRemainingOffersCount());
			}
			for (fumlConfigurationTrace.States.ObjectNodeActivation_offeredTokenCount_Value value : stateToGo
					.getObjectNodeActivation_offeredTokenCount_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setOfferedTokenCount((int) value.getOfferedTokenCount());
			}
			for (fumlConfigurationTrace.States.ObjectToken_value_Value value : stateToGo
					.getObjectToken_value_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ObjectToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) getTracedToExe(
						value.getParent());
				exeObject.setValue(
						(fumlConfiguration.Classes.Kernel.Value) (fumlConfiguration.Classes.Kernel.Value) getTracedToExe(
								value.getValue()));
			}
			for (fumlConfigurationTrace.States.Offer_offeredTokens_Value value : stateToGo
					.getOffer_offeredTokens_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.Offer exeObject = (fumlConfiguration.Activities.IntermediateActivities.Offer) getTracedToExe(
						value.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Token>) getTracedToExe(
								value.getOfferedTokens()));
			}
			for (fumlConfigurationTrace.States.Token_holder_Value value : stateToGo.getToken_holder_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.Token exeObject = (fumlConfiguration.Activities.IntermediateActivities.Token) getTracedToExe(
						value.getParent());
				exeObject.setHolder(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getHolder()));
			}
			for (fumlConfigurationTrace.States.BooleanValue_value_BooleanValue_Value value : stateToGo
					.getBooleanValue_value_BooleanValue_Values()) {
				fumlConfiguration.Classes.Kernel.BooleanValue exeObject = (fumlConfiguration.Classes.Kernel.BooleanValue) getTracedToExe(
						value.getParent());
				exeObject.setValue_BooleanValue((boolean) value.isValue_BooleanValue());
			}
			for (fumlConfigurationTrace.States.CompoundValue_featureValues_Value value : stateToGo
					.getCompoundValue_featureValues_Values()) {
				fumlConfiguration.Classes.Kernel.CompoundValue exeObject = (fumlConfiguration.Classes.Kernel.CompoundValue) getTracedToExe(
						value.getParent());
				exeObject.getFeatureValues().clear();
				exeObject.getFeatureValues()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.FeatureValue>) getTracedToExe(
								value.getFeatureValues()));
			}
			for (fumlConfigurationTrace.States.Evaluation_locus_Evaluation_Value value : stateToGo
					.getEvaluation_locus_Evaluation_Values()) {
				fumlConfiguration.Classes.Kernel.Evaluation exeObject = (fumlConfiguration.Classes.Kernel.Evaluation) getTracedToExe(
						value.getParent());
				exeObject.setLocus_Evaluation(
						(fumlConfiguration.Loci.Locus) (fumlConfiguration.Loci.Locus) getTracedToExe(
								value.getLocus_Evaluation()));
			}
			for (fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value value : stateToGo
					.getEvaluation_specification_Evaluation_Values()) {
				fumlConfiguration.Classes.Kernel.Evaluation exeObject = (fumlConfiguration.Classes.Kernel.Evaluation) getTracedToExe(
						value.getParent());
				exeObject.setSpecification_Evaluation(
						(org.eclipse.uml2.uml.ValueSpecification) value.getSpecification_Evaluation());
			}
			for (fumlConfigurationTrace.States.ExtensionalValue_locus_ExtensionalValue_Value value : stateToGo
					.getExtensionalValue_locus_ExtensionalValue_Values()) {
				fumlConfiguration.Classes.Kernel.ExtensionalValue exeObject = (fumlConfiguration.Classes.Kernel.ExtensionalValue) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExtensionalValue(
						(fumlConfiguration.Loci.Locus) (fumlConfiguration.Loci.Locus) getTracedToExe(
								value.getLocus_ExtensionalValue()));
			}
			for (fumlConfigurationTrace.States.FeatureValue_feature_Value value : stateToGo
					.getFeatureValue_feature_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.setFeature((org.eclipse.uml2.uml.StructuralFeature) value.getFeature());
			}
			for (fumlConfigurationTrace.States.FeatureValue_position_Value value : stateToGo
					.getFeatureValue_position_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.setPosition((int) value.getPosition());
			}
			for (fumlConfigurationTrace.States.FeatureValue_values_FeatureValue_Value value : stateToGo
					.getFeatureValue_values_FeatureValue_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.getValues_FeatureValue().clear();
				exeObject.getValues_FeatureValue()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.Value>) getTracedToExe(
								value.getValues_FeatureValue()));
			}
			for (fumlConfigurationTrace.States.IntegerValue_value_IntegerValue_Value value : stateToGo
					.getIntegerValue_value_IntegerValue_Values()) {
				fumlConfiguration.Classes.Kernel.IntegerValue exeObject = (fumlConfiguration.Classes.Kernel.IntegerValue) getTracedToExe(
						value.getParent());
				exeObject.setValue_IntegerValue((int) value.getValue_IntegerValue());
			}
			for (fumlConfigurationTrace.States.Object_types_Value value : stateToGo.getObject_types_Values()) {
				fumlConfiguration.Classes.Kernel.Object exeObject = (fumlConfiguration.Classes.Kernel.Object) getTracedToExe(
						value.getParent());
				exeObject.getTypes().clear();
				exeObject.getTypes()
						.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getTracedToExe(value.getTypes()));
			}
			for (fumlConfigurationTrace.States.PrimitiveValue_type_Value value : stateToGo
					.getPrimitiveValue_type_Values()) {
				fumlConfiguration.Classes.Kernel.PrimitiveValue exeObject = (fumlConfiguration.Classes.Kernel.PrimitiveValue) getTracedToExe(
						value.getParent());
				exeObject.setType((org.eclipse.uml2.uml.PrimitiveType) value.getType());
			}
			for (fumlConfigurationTrace.States.Reference_referent_Value value : stateToGo
					.getReference_referent_Values()) {
				fumlConfiguration.Classes.Kernel.Reference exeObject = (fumlConfiguration.Classes.Kernel.Reference) getTracedToExe(
						value.getParent());
				exeObject.setReferent(
						(fumlConfiguration.Classes.Kernel.Object) (fumlConfiguration.Classes.Kernel.Object) getTracedToExe(
								value.getReferent()));
			}
			for (fumlConfigurationTrace.States.Execution_context_Value value : stateToGo
					.getExecution_context_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) getTracedToExe(
						value.getParent());
				exeObject.setContext(
						(fumlConfiguration.Classes.Kernel.Object) (fumlConfiguration.Classes.Kernel.Object) getTracedToExe(
								value.getContext()));
			}
			for (fumlConfigurationTrace.States.Execution_parameterValues_Value value : stateToGo
					.getExecution_parameterValues_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) getTracedToExe(
						value.getParent());
				exeObject.getParameterValues().clear();
				exeObject.getParameterValues()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue>) getTracedToExe(
								value.getParameterValues()));
			}
			for (fumlConfigurationTrace.States.ParameterValue_parameter_ParameterValue_Value value : stateToGo
					.getParameterValue_parameter_ParameterValue_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) getTracedToExe(
						value.getParent());
				exeObject.setParameter_ParameterValue(
						(org.eclipse.uml2.uml.Parameter) value.getParameter_ParameterValue());
			}
			for (fumlConfigurationTrace.States.ParameterValue_values_ParameterValue_Value value : stateToGo
					.getParameterValue_values_ParameterValue_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) getTracedToExe(
						value.getParent());
				exeObject.getValues_ParameterValue().clear();
				exeObject.getValues_ParameterValue()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.Value>) getTracedToExe(
								value.getValues_ParameterValue()));
			}
			for (fumlConfigurationTrace.States.InputParameterValues_name_Value value : stateToGo
					.getInputParameterValues_name_Values()) {
				fumlConfiguration.Input.InputParameterValues exeObject = (fumlConfiguration.Input.InputParameterValues) getTracedToExe(
						value.getParent());
				exeObject.setName((java.lang.String) value.getName());
			}
			for (fumlConfigurationTrace.States.InputParameterValues_parameterValues_Value value : stateToGo
					.getInputParameterValues_parameterValues_Values()) {
				fumlConfiguration.Input.InputParameterValues exeObject = (fumlConfiguration.Input.InputParameterValues) getTracedToExe(
						value.getParent());
				exeObject.getParameterValues().clear();
				exeObject.getParameterValues()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue>) getTracedToExe(
								value.getParameterValues()));
			}
			for (fumlConfigurationTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value value : stateToGo
					.getExecutionEnvironment_locus_ExecutionEnvironment_Values()) {
				fumlConfiguration.Loci.ExecutionEnvironment exeObject = (fumlConfiguration.Loci.ExecutionEnvironment) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExecutionEnvironment(
						(fumlConfiguration.Loci.Locus) (fumlConfiguration.Loci.Locus) getTracedToExe(
								value.getLocus_ExecutionEnvironment()));
			}
			for (fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value value : stateToGo
					.getExecutionFactory_builtInTypes_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.getBuiltInTypes().clear();
				exeObject.getBuiltInTypes()
						.addAll((Collection<? extends org.eclipse.uml2.uml.PrimitiveType>) getTracedToExe(
								value.getBuiltInTypes()));
			}
			for (fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value value : stateToGo
					.getExecutionFactory_locus_ExecutionFactory_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExecutionFactory(
						(fumlConfiguration.Loci.Locus) (fumlConfiguration.Loci.Locus) getTracedToExe(
								value.getLocus_ExecutionFactory()));
			}
			for (fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value value : stateToGo
					.getExecutionFactory_primitiveBehaviorPrototypes_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.getPrimitiveBehaviorPrototypes().clear();
				exeObject.getPrimitiveBehaviorPrototypes()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution>) getTracedToExe(
								value.getPrimitiveBehaviorPrototypes()));
			}
			for (fumlConfigurationTrace.States.Executor_locus_Executor_Value value : stateToGo
					.getExecutor_locus_Executor_Values()) {
				fumlConfiguration.Loci.Executor exeObject = (fumlConfiguration.Loci.Executor) getTracedToExe(
						value.getParent());
				exeObject
						.setLocus_Executor((fumlConfiguration.Loci.Locus) (fumlConfiguration.Loci.Locus) getTracedToExe(
								value.getLocus_Executor()));
			}
			for (fumlConfigurationTrace.States.Locus_executor_Value value : stateToGo.getLocus_executor_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject
						.setExecutor((fumlConfiguration.Loci.Executor) (fumlConfiguration.Loci.Executor) getTracedToExe(
								value.getExecutor()));
			}
			for (fumlConfigurationTrace.States.Locus_extensionalValues_Value value : stateToGo
					.getLocus_extensionalValues_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject.getExtensionalValues().clear();
				exeObject.getExtensionalValues()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.ExtensionalValue>) getTracedToExe(
								value.getExtensionalValues()));
			}
			for (fumlConfigurationTrace.States.Locus_factory_Value value : stateToGo.getLocus_factory_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject.setFactory(
						(fumlConfiguration.Loci.ExecutionFactory) (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
								value.getFactory()));
			}
			for (fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value value : stateToGo
					.getSemanticVisitor_runtimeModelElement_Values()) {
				fumlConfiguration.Loci.SemanticVisitor exeObject = (fumlConfiguration.Loci.SemanticVisitor) getTracedToExe(
						value.getParent());
				exeObject.setRuntimeModelElement(
						(fumlConfiguration.ElementConfiguration) (fumlConfiguration.ElementConfiguration) getTracedToExe(
								value.getRuntimeModelElement()));
			}
		} else if (eObject instanceof fumlConfigurationTrace.States.Value) {
			goTo(((fumlConfigurationTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				final RecordingCommand command = new RecordingCommand(ed, "") {
					protected void doExecute() {
						goTo(statesTrace.get(stateNumber));
					}
				};
				CommandExecution.execute(ed, command);
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(getTracedToExe(tracedObject));
		}
		return result;
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private void jumpBeforeStep(fumlConfigurationTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(fumlConfigurationTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, fumlConfigurationTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
				final int previousValueIndex = getPreviousValueIndex(valueTrace);
				return previousValueIndex > -1;
			});
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<fumlConfigurationTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<fumlConfigurationTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<fumlConfigurationTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			fumlConfigurationTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<fumlConfigurationTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				fumlConfigurationTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<fumlConfigurationTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<fumlConfigurationTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							fumlConfigurationTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final fumlConfigurationTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> s_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<fumlConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	@Override
	public List<fumlConfigurationTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<fumlConfigurationTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public StateWrapper getStateWrapper(int stateIndex) {
		if (stateIndex > -1 && stateIndex < statesTrace.size()) {
			return new StateWrapper(statesTrace.get(stateIndex), stateIndex);
		}
		return null;
	}

	@Override
	public List<StateWrapper> getStateWrappers(int start, int end) {
		final List<StateWrapper> result = new ArrayList<>();
		final int startStateIndex = Math.max(0, start);
		final int endStateIndex = Math.min(statesTrace.size() - 1, end);

		for (int i = startStateIndex; i < endStateIndex + 1; i++) {
			result.add(new StateWrapper(statesTrace.get(i), i));
		}

		return result;
	}

	@Override
	public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int start, int end) {
		final List<ValueWrapper> result = new ArrayList<>();

		if (valueTraceIndex < valueTraces.size()) {
			final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (fumlConfigurationTrace.States.Value value : valueTrace) {
				final int currentValueIndex = valueTrace.indexOf(value);
				ValueWrapper wrapper = getValueWrapper(value, currentValueIndex);
				if (wrapper.firstStateIndex < end && wrapper.lastStateIndex > start) {
					result.add(wrapper);
				}
			}
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public StepWrapper getStepWrapper(Step step) {
		if (step instanceof fumlConfigurationTrace.Steps.SpecificStep) {
			final fumlConfigurationTrace.Steps.SpecificStep step_cast = (fumlConfigurationTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(((SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) step_cast).getSubSteps());
			}
			return new StepWrapper(step, startingIndex, endingIndex, subSteps);
		}
		return null;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		if (listener != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ITraceListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		canBackValueCache.clear();
		notifyListeners();
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public int getNumberOfTraces() {
		return valueTraces.size();
	}

	@Override
	public int getStatesTraceLength() {
		return statesTrace.size();
	}

	@Override
	public int getValuesTraceLength(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			List<? extends fumlConfigurationTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof fumlConfigurationTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof fumlConfigurationTrace.States.Value) {
			final fumlConfigurationTrace.States.State state = ((fumlConfigurationTrace.States.Value) o)
					.getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<fumlConfigurationTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		fumlConfigurationTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<fumlConfigurationTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof fumlConfigurationTrace.Steps.SpecificStep) {
			fumlConfigurationTrace.Steps.SpecificStep step_cast = (fumlConfigurationTrace.Steps.SpecificStep) step;
			final List<fumlConfigurationTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof fumlConfigurationTrace.Steps.SpecificStep) {
				newPath.add(0, (fumlConfigurationTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"FumlConfigurationTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			final fumlConfigurationTrace.States.Value value = valueTrace.get(0);
			final EObject container = value.eContainer();
			final List<String> attributes = container.eClass().getEAllReferences().stream()
					.filter(r -> r.getName().endsWith("Sequence"))
					.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
			if (!attributes.isEmpty()) {
				attributes.removeIf(s -> !value.getClass().getName().contains("_" + s + "_"));
				attributeName = attributes.get(0);
			}
			final Optional<EReference> originalObject = container.eClass().getEAllReferences().stream()
					.filter(r -> r.getName().equals("originalObject")).findFirst();
			if (originalObject.isPresent()) {
				final Object o = container.eGet(originalObject.get());
				if (o instanceof EObject) {
					final EObject eObject = (EObject) o;
					final QualifiedName qname = nameProvider.getFullyQualifiedName(eObject);
					if (qname == null) {
						return attributeName + " (" + eObject.toString() + ")";
					} else {
						return attributeName + " (" + qname.toString() + " :" + eObject.eClass().getName() + ")";
					}
				}
			}
		}
		return attributeName;
	}

	@Override
	public String getStateDescription(int stateIndex) {
		String result = "State " + stateIndex + "\n";
		for (int i = 0; i < valueTraces.size(); i++) {
			result += "\n" + getValueDescription(i, stateIndex);
		}
		return result;
	}

	@Override
	public String getValueDescription(int traceIndex, int stateIndex) {
		return getValueLabel(traceIndex) + " : " + getValueAt(traceIndex, stateIndex);
	}

	@Override
	public Object getValueAt(int traceIndex, int stateIndex) {
		final List<? extends fumlConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
		final fumlConfigurationTrace.States.State state = statesTrace.get(stateIndex);
		return getActiveValue(valueTrace, state);
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}
}
