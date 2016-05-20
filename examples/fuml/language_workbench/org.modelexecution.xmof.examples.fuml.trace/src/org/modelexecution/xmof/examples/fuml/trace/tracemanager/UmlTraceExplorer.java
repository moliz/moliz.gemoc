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

public class UmlTraceExplorer implements ITraceExplorer {

	private umlTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private umlTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends umlTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<umlTrace.States.State> statesTrace;

	private umlTrace.Steps.SpecificStep stepIntoResult;
	private umlTrace.Steps.SpecificStep stepOverResult;
	private umlTrace.Steps.SpecificStep stepReturnResult;

	private umlTrace.Steps.SpecificStep stepBackIntoResult;
	private umlTrace.Steps.SpecificStep stepBackOverResult;
	private umlTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<umlTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<umlTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	public UmlTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public UmlTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends umlTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends umlTrace.States.Value>> result = new ArrayList<>();
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityEdgeInstances()) {
			result.add(tracedObject.getEdge_ActivityEdgeInstanceSequence());
			result.add(tracedObject.getGroup_ActivityEdgeInstanceSequence());
			result.add(tracedObject.getOffersSequence());
			result.add(tracedObject.getSourceSequence());
			result.add(tracedObject.getTargetSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityExecutions()) {
			result.add(tracedObject.getActivationGroupSequence());
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityFinalNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject : traceRoot
				.getIntermediateActivities_tracedActivityNodeActivationGroups()) {
			result.add(tracedObject.getActivityExecutionSequence());
			result.add(tracedObject.getEdgeInstancesSequence());
			result.add(tracedObject.getNodeActivationsSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityParameterNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedAddStructuralFeatureValueActionActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue tracedObject : traceRoot
				.getKernel_tracedBooleanValues()) {
			result.add(tracedObject.getValue_BooleanValueSequence());
			result.add(tracedObject.getTypeSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedCallBehaviorActionActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedControlToken tracedObject : traceRoot
				.getIntermediateActivities_tracedControlTokens()) {
			result.add(tracedObject.getHolderSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedCreateObjectActionActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedDecisionNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject : traceRoot
				.getFumlConfiguration_tracedElementConfigurations()) {
			result.add(tracedObject.getSemanticVisitorSequence());
		}
		for (umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment tracedObject : traceRoot
				.getLoci_tracedExecutionEnvironments()) {
			result.add(tracedObject.getLocus_ExecutionEnvironmentSequence());
		}
		for (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject : traceRoot
				.getLoci_tracedExecutionFactorys()) {
			result.add(tracedObject.getBuiltInTypesSequence());
			result.add(tracedObject.getLocus_ExecutionFactorySequence());
			result.add(tracedObject.getPrimitiveBehaviorPrototypesSequence());
		}
		for (umlTrace.States.fumlConfiguration.Loci.TracedExecutor tracedObject : traceRoot.getLoci_tracedExecutors()) {
			result.add(tracedObject.getLocus_ExecutorSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken tracedObject : traceRoot
				.getIntermediateActivities_tracedForkedTokens()) {
			result.add(tracedObject.getBaseTokenSequence());
			result.add(tracedObject.getBaseTokenIsWithdrawnSequence());
			result.add(tracedObject.getRemainingOffersCountSequence());
			result.add(tracedObject.getHolderSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedInitialNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject : traceRoot
				.getInput_tracedInputParameterValuess()) {
			result.add(tracedObject.getNameSequence());
			result.add(tracedObject.getParameterValuesSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedInputPinActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerGreaterFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerGreaterFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerLessFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerLessFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.PrimitiveBehaviors.IntegerFunctions.TracedIntegerPlusFunctionBehaviorExecution tracedObject : traceRoot
				.getIntegerFunctions_tracedIntegerPlusFunctionBehaviorExecutions()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getContextSequence());
			result.add(tracedObject.getParameterValuesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue tracedObject : traceRoot
				.getKernel_tracedIntegerValues()) {
			result.add(tracedObject.getValue_IntegerValueSequence());
			result.add(tracedObject.getTypeSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedJoinNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralBooleanEvaluation tracedObject : traceRoot
				.getKernel_tracedLiteralBooleanEvaluations()) {
			result.add(tracedObject.getLocus_EvaluationSequence());
			result.add(tracedObject.getSpecification_EvaluationSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedLiteralIntegerEvaluation tracedObject : traceRoot
				.getKernel_tracedLiteralIntegerEvaluations()) {
			result.add(tracedObject.getLocus_EvaluationSequence());
			result.add(tracedObject.getSpecification_EvaluationSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject : traceRoot.getLoci_tracedLocuss()) {
			result.add(tracedObject.getExecutorSequence());
			result.add(tracedObject.getExtensionalValuesSequence());
			result.add(tracedObject.getFactorySequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedMergeNodeActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject : traceRoot
				.getKernel_tracedObjects()) {
			result.add(tracedObject.getFeatureValuesSequence());
			result.add(tracedObject.getLocus_ExtensionalValueSequence());
			result.add(tracedObject.getTypesSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken tracedObject : traceRoot
				.getIntermediateActivities_tracedObjectTokens()) {
			result.add(tracedObject.getValueSequence());
			result.add(tracedObject.getHolderSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject : traceRoot
				.getIntermediateActivities_tracedOffers()) {
			result.add(tracedObject.getOfferedTokensSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOpaqueActionActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Actions.BasicActions.TracedOutputPinActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject : traceRoot
				.getBasicBehaviors_tracedParameterValues()) {
			result.add(tracedObject.getParameter_ParameterValueSequence());
			result.add(tracedObject.getValues_ParameterValueSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedReadStructuralFeatureActionActivation tracedObject : traceRoot
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
		for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference tracedObject : traceRoot
				.getKernel_tracedReferences()) {
			result.add(tracedObject.getReferentSequence());
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor tracedObject : traceRoot
				.getLoci_tracedSemanticVisitors()) {
			result.add(tracedObject.getRuntimeModelElementSequence());
		}
		for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken tracedObject : traceRoot
				.getIntermediateActivities_tracedTokens()) {
			result.add(tracedObject.getHolderSequence());
		}
		for (umlTrace.States.fumlConfiguration.Actions.IntermediateActions.TracedValueSpecificationActionActivation tracedObject : traceRoot
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
		return result;
	}

	private umlTrace.States.Value getActiveValue(List<? extends umlTrace.States.Value> valueTrace,
			umlTrace.States.State state) {
		umlTrace.States.Value result = null;
		for (umlTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends umlTrace.States.Value> valueTrace) {
		umlTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private int getNextValueIndex(List<? extends umlTrace.States.Value> valueTrace) {
		umlTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private ValueWrapper getValueWrapper(umlTrace.States.Value value, int valueIndex) {
		List<umlTrace.States.State> states = value.getStatesNoOpposite();
		umlTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private int getStartingIndex(umlTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(umlTrace.Steps.SpecificStep step) {
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
	private umlTrace.Steps.SpecificStep findNextStep(final List<umlTrace.Steps.SpecificStep> stepPath,
			final umlTrace.Steps.SpecificStep previousStep, final int start) {
		final List<umlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		umlTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		umlTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final umlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<umlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<umlTrace.Steps.SpecificStep>) currentStep).getSubSteps());
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
	private umlTrace.Steps.SpecificStep computeBackInto(List<umlTrace.Steps.SpecificStep> stepPath) {
		final List<umlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		umlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final umlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final umlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<umlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) parentStep;
			final List<? extends umlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final umlTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				umlTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<umlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<umlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<umlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final umlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				umlTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<umlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<umlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<umlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private umlTrace.Steps.SpecificStep computeBackOver(List<umlTrace.Steps.SpecificStep> stepPath) {
		final List<umlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		umlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final umlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final umlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<umlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) parentStep;
			final List<umlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
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
			final umlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private umlTrace.Steps.SpecificStep computeBackOut(List<umlTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private umlTrace.Steps.SpecificStep computeStepInto(List<umlTrace.Steps.SpecificStep> stepPath,
			List<umlTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private umlTrace.Steps.SpecificStep computeStepOver(List<umlTrace.Steps.SpecificStep> stepPath,
			List<umlTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private umlTrace.Steps.SpecificStep computeStepReturn(List<umlTrace.Steps.SpecificStep> stepPath,
			List<umlTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<umlTrace.Steps.SpecificStep> stepPath) {
		final List<umlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<umlTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

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
		if (eObject instanceof umlTrace.States.State) {
			umlTrace.States.State stateToGo = (umlTrace.States.State) eObject;
			for (umlTrace.States.ElementConfiguration_semanticVisitor_Value value : stateToGo
					.getElementConfiguration_semanticVisitor_Values()) {
				if (value.getParent() instanceof umlTrace.States.fumlConfiguration.TracedElementConfiguration) {
					umlTrace.States.fumlConfiguration.TracedElementConfiguration parent_cast = (umlTrace.States.fumlConfiguration.TracedElementConfiguration) value
							.getParent();
					fumlConfiguration.ElementConfiguration originalObject = (fumlConfiguration.ElementConfiguration) parent_cast
							.getOriginalObject();
					originalObject.getSemanticVisitor().clear();
					originalObject.getSemanticVisitor()
							.addAll((Collection<? extends fumlConfiguration.Loci.SemanticVisitor>) getTracedToExe(
									value.getSemanticVisitor()));
				}
			}
			for (umlTrace.States.ActionActivation_firing_Value value : stateToGo.getActionActivation_firing_Values()) {
				fumlConfiguration.Actions.BasicActions.ActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
						value.getParent());
				exeObject.setFiring(value.isFiring());
			}
			for (umlTrace.States.ActionActivation_pinActivations_Value value : stateToGo
					.getActionActivation_pinActivations_Values()) {
				fumlConfiguration.Actions.BasicActions.ActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
						value.getParent());
				exeObject.getPinActivations().clear();
				exeObject.getPinActivations()
						.addAll((Collection<? extends fumlConfiguration.Actions.BasicActions.PinActivation>) getTracedToExe(
								value.getPinActivations()));
			}
			for (umlTrace.States.CallActionActivation_callExecutions_Value value : stateToGo
					.getCallActionActivation_callExecutions_Values()) {
				fumlConfiguration.Actions.BasicActions.CallActionActivation exeObject = (fumlConfiguration.Actions.BasicActions.CallActionActivation) getTracedToExe(
						value.getParent());
				exeObject.getCallExecutions().clear();
				exeObject.getCallExecutions()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution>) getTracedToExe(
								value.getCallExecutions()));
			}
			for (umlTrace.States.PinActivation_actionActivation_Value value : stateToGo
					.getPinActivation_actionActivation_Values()) {
				fumlConfiguration.Actions.BasicActions.PinActivation exeObject = (fumlConfiguration.Actions.BasicActions.PinActivation) getTracedToExe(
						value.getParent());
				exeObject.setActionActivation((fumlConfiguration.Actions.BasicActions.ActionActivation) getTracedToExe(
						value.getActionActivation()));
			}
			for (umlTrace.States.PinActivation_count_temp_Value value : stateToGo
					.getPinActivation_count_temp_Values()) {
				fumlConfiguration.Actions.BasicActions.PinActivation exeObject = (fumlConfiguration.Actions.BasicActions.PinActivation) getTracedToExe(
						value.getParent());
				exeObject.setCount_temp(value.getCount_temp());
			}
			for (umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value value : stateToGo
					.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setEdge_ActivityEdgeInstance(value.getEdge_ActivityEdgeInstance());
			}
			for (umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value value : stateToGo
					.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setGroup_ActivityEdgeInstance(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getGroup_ActivityEdgeInstance()));
			}
			for (umlTrace.States.ActivityEdgeInstance_offers_Value value : stateToGo
					.getActivityEdgeInstance_offers_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.getOffers().clear();
				exeObject.getOffers()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Offer>) getTracedToExe(
								value.getOffers()));
			}
			for (umlTrace.States.ActivityEdgeInstance_source_Value value : stateToGo
					.getActivityEdgeInstance_source_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setSource(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getSource()));
			}
			for (umlTrace.States.ActivityEdgeInstance_target_Value value : stateToGo
					.getActivityEdgeInstance_target_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) getTracedToExe(
						value.getParent());
				exeObject.setTarget(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getTarget()));
			}
			for (umlTrace.States.ActivityExecution_activationGroup_Value value : stateToGo
					.getActivityExecution_activationGroup_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityExecution exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) getTracedToExe(
						value.getParent());
				exeObject.setActivationGroup(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getActivationGroup()));
			}
			for (umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value value : stateToGo
					.getActivityNodeActivation_group_ActivityNodeActivation_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setGroup_ActivityNodeActivation(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
								value.getGroup_ActivityNodeActivation()));
			}
			for (umlTrace.States.ActivityNodeActivation_heldTokens_Value value : stateToGo
					.getActivityNodeActivation_heldTokens_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getHeldTokens().clear();
				exeObject.getHeldTokens()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Token>) getTracedToExe(
								value.getHeldTokens()));
			}
			for (umlTrace.States.ActivityNodeActivation_incomingEdges_Value value : stateToGo
					.getActivityNodeActivation_incomingEdges_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getIncomingEdges().clear();
				exeObject.getIncomingEdges()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getIncomingEdges()));
			}
			for (umlTrace.States.ActivityNodeActivation_isRunning_Value value : stateToGo
					.getActivityNodeActivation_isRunning_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setIsRunning(value.isIsRunning());
			}
			for (umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value value : stateToGo
					.getActivityNodeActivation_node_ActivityNodeActivation_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setNode_ActivityNodeActivation(value.getNode_ActivityNodeActivation());
			}
			for (umlTrace.States.ActivityNodeActivation_outgoingEdges_Value value : stateToGo
					.getActivityNodeActivation_outgoingEdges_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.getOutgoingEdges().clear();
				exeObject.getOutgoingEdges()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getOutgoingEdges()));
			}
			for (umlTrace.States.ActivityNodeActivation_running_Value value : stateToGo
					.getActivityNodeActivation_running_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setRunning(value.isRunning());
			}
			for (umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value value : stateToGo
					.getActivityNodeActivationGroup_activityExecution_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.setActivityExecution(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) getTracedToExe(
								value.getActivityExecution()));
			}
			for (umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value value : stateToGo
					.getActivityNodeActivationGroup_edgeInstances_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.getEdgeInstances().clear();
				exeObject.getEdgeInstances()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance>) getTracedToExe(
								value.getEdgeInstances()));
			}
			for (umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value value : stateToGo
					.getActivityNodeActivationGroup_nodeActivations_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup exeObject = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) getTracedToExe(
						value.getParent());
				exeObject.getNodeActivations().clear();
				exeObject.getNodeActivations()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation>) getTracedToExe(
								value.getNodeActivations()));
			}
			for (umlTrace.States.ForkedToken_baseToken_Value value : stateToGo.getForkedToken_baseToken_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setBaseToken((fumlConfiguration.Activities.IntermediateActivities.Token) getTracedToExe(
						value.getBaseToken()));
			}
			for (umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value value : stateToGo
					.getForkedToken_baseTokenIsWithdrawn_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setBaseTokenIsWithdrawn(value.isBaseTokenIsWithdrawn());
			}
			for (umlTrace.States.ForkedToken_remainingOffersCount_Value value : stateToGo
					.getForkedToken_remainingOffersCount_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ForkedToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) getTracedToExe(
						value.getParent());
				exeObject.setRemainingOffersCount(value.getRemainingOffersCount());
			}
			for (umlTrace.States.ObjectNodeActivation_offeredTokenCount_Value value : stateToGo
					.getObjectNodeActivation_offeredTokenCount_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation exeObject = (fumlConfiguration.Activities.IntermediateActivities.ObjectNodeActivation) getTracedToExe(
						value.getParent());
				exeObject.setOfferedTokenCount(value.getOfferedTokenCount());
			}
			for (umlTrace.States.ObjectToken_value_Value value : stateToGo.getObjectToken_value_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.ObjectToken exeObject = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) getTracedToExe(
						value.getParent());
				exeObject.setValue((fumlConfiguration.Classes.Kernel.Value) getTracedToExe(value.getValue()));
			}
			for (umlTrace.States.Offer_offeredTokens_Value value : stateToGo.getOffer_offeredTokens_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.Offer exeObject = (fumlConfiguration.Activities.IntermediateActivities.Offer) getTracedToExe(
						value.getParent());
				exeObject.getOfferedTokens().clear();
				exeObject.getOfferedTokens()
						.addAll((Collection<? extends fumlConfiguration.Activities.IntermediateActivities.Token>) getTracedToExe(
								value.getOfferedTokens()));
			}
			for (umlTrace.States.Token_holder_Value value : stateToGo.getToken_holder_Values()) {
				fumlConfiguration.Activities.IntermediateActivities.Token exeObject = (fumlConfiguration.Activities.IntermediateActivities.Token) getTracedToExe(
						value.getParent());
				exeObject.setHolder(
						(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) getTracedToExe(
								value.getHolder()));
			}
			for (umlTrace.States.BooleanValue_value_BooleanValue_Value value : stateToGo
					.getBooleanValue_value_BooleanValue_Values()) {
				fumlConfiguration.Classes.Kernel.BooleanValue exeObject = (fumlConfiguration.Classes.Kernel.BooleanValue) getTracedToExe(
						value.getParent());
				exeObject.setValue_BooleanValue(value.isValue_BooleanValue());
			}
			for (umlTrace.States.CompoundValue_featureValues_Value value : stateToGo
					.getCompoundValue_featureValues_Values()) {
				fumlConfiguration.Classes.Kernel.CompoundValue exeObject = (fumlConfiguration.Classes.Kernel.CompoundValue) getTracedToExe(
						value.getParent());
				exeObject.getFeatureValues().clear();
				exeObject.getFeatureValues()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.FeatureValue>) getTracedToExe(
								value.getFeatureValues()));
			}
			for (umlTrace.States.Evaluation_locus_Evaluation_Value value : stateToGo
					.getEvaluation_locus_Evaluation_Values()) {
				fumlConfiguration.Classes.Kernel.Evaluation exeObject = (fumlConfiguration.Classes.Kernel.Evaluation) getTracedToExe(
						value.getParent());
				exeObject.setLocus_Evaluation(
						(fumlConfiguration.Loci.Locus) getTracedToExe(value.getLocus_Evaluation()));
			}
			for (umlTrace.States.Evaluation_specification_Evaluation_Value value : stateToGo
					.getEvaluation_specification_Evaluation_Values()) {
				fumlConfiguration.Classes.Kernel.Evaluation exeObject = (fumlConfiguration.Classes.Kernel.Evaluation) getTracedToExe(
						value.getParent());
				exeObject.setSpecification_Evaluation(value.getSpecification_Evaluation());
			}
			for (umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value value : stateToGo
					.getExtensionalValue_locus_ExtensionalValue_Values()) {
				fumlConfiguration.Classes.Kernel.ExtensionalValue exeObject = (fumlConfiguration.Classes.Kernel.ExtensionalValue) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExtensionalValue(
						(fumlConfiguration.Loci.Locus) getTracedToExe(value.getLocus_ExtensionalValue()));
			}
			for (umlTrace.States.FeatureValue_feature_Value value : stateToGo.getFeatureValue_feature_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.setFeature(value.getFeature());
			}
			for (umlTrace.States.FeatureValue_position_Value value : stateToGo.getFeatureValue_position_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.setPosition(value.getPosition());
			}
			for (umlTrace.States.FeatureValue_values_FeatureValue_Value value : stateToGo
					.getFeatureValue_values_FeatureValue_Values()) {
				fumlConfiguration.Classes.Kernel.FeatureValue exeObject = (fumlConfiguration.Classes.Kernel.FeatureValue) getTracedToExe(
						value.getParent());
				exeObject.getValues_FeatureValue().clear();
				exeObject.getValues_FeatureValue()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.Value>) getTracedToExe(
								value.getValues_FeatureValue()));
			}
			for (umlTrace.States.IntegerValue_value_IntegerValue_Value value : stateToGo
					.getIntegerValue_value_IntegerValue_Values()) {
				fumlConfiguration.Classes.Kernel.IntegerValue exeObject = (fumlConfiguration.Classes.Kernel.IntegerValue) getTracedToExe(
						value.getParent());
				exeObject.setValue_IntegerValue(value.getValue_IntegerValue());
			}
			for (umlTrace.States.Object_types_Value value : stateToGo.getObject_types_Values()) {
				fumlConfiguration.Classes.Kernel.Object exeObject = (fumlConfiguration.Classes.Kernel.Object) getTracedToExe(
						value.getParent());
				exeObject.getTypes().clear();
				exeObject.getTypes()
						.addAll((Collection<? extends org.eclipse.uml2.uml.Class>) getTracedToExe(value.getTypes()));
			}
			for (umlTrace.States.PrimitiveValue_type_Value value : stateToGo.getPrimitiveValue_type_Values()) {
				fumlConfiguration.Classes.Kernel.PrimitiveValue exeObject = (fumlConfiguration.Classes.Kernel.PrimitiveValue) getTracedToExe(
						value.getParent());
				exeObject.setType(value.getType());
			}
			for (umlTrace.States.Reference_referent_Value value : stateToGo.getReference_referent_Values()) {
				fumlConfiguration.Classes.Kernel.Reference exeObject = (fumlConfiguration.Classes.Kernel.Reference) getTracedToExe(
						value.getParent());
				exeObject.setReferent((fumlConfiguration.Classes.Kernel.Object) getTracedToExe(value.getReferent()));
			}
			for (umlTrace.States.Execution_context_Value value : stateToGo.getExecution_context_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) getTracedToExe(
						value.getParent());
				exeObject.setContext((fumlConfiguration.Classes.Kernel.Object) getTracedToExe(value.getContext()));
			}
			for (umlTrace.States.Execution_parameterValues_Value value : stateToGo
					.getExecution_parameterValues_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution) getTracedToExe(
						value.getParent());
				exeObject.getParameterValues().clear();
				exeObject.getParameterValues()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue>) getTracedToExe(
								value.getParameterValues()));
			}
			for (umlTrace.States.ParameterValue_parameter_ParameterValue_Value value : stateToGo
					.getParameterValue_parameter_ParameterValue_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) getTracedToExe(
						value.getParent());
				exeObject.setParameter_ParameterValue(value.getParameter_ParameterValue());
			}
			for (umlTrace.States.ParameterValue_values_ParameterValue_Value value : stateToGo
					.getParameterValue_values_ParameterValue_Values()) {
				fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue exeObject = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) getTracedToExe(
						value.getParent());
				exeObject.getValues_ParameterValue().clear();
				exeObject.getValues_ParameterValue()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.Value>) getTracedToExe(
								value.getValues_ParameterValue()));
			}
			for (umlTrace.States.InputParameterValues_name_Value value : stateToGo
					.getInputParameterValues_name_Values()) {
				fumlConfiguration.Input.InputParameterValues exeObject = (fumlConfiguration.Input.InputParameterValues) getTracedToExe(
						value.getParent());
				exeObject.setName(value.getName());
			}
			for (umlTrace.States.InputParameterValues_parameterValues_Value value : stateToGo
					.getInputParameterValues_parameterValues_Values()) {
				fumlConfiguration.Input.InputParameterValues exeObject = (fumlConfiguration.Input.InputParameterValues) getTracedToExe(
						value.getParent());
				exeObject.getParameterValues().clear();
				exeObject.getParameterValues()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue>) getTracedToExe(
								value.getParameterValues()));
			}
			for (umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value value : stateToGo
					.getExecutionEnvironment_locus_ExecutionEnvironment_Values()) {
				fumlConfiguration.Loci.ExecutionEnvironment exeObject = (fumlConfiguration.Loci.ExecutionEnvironment) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExecutionEnvironment(
						(fumlConfiguration.Loci.Locus) getTracedToExe(value.getLocus_ExecutionEnvironment()));
			}
			for (umlTrace.States.ExecutionFactory_builtInTypes_Value value : stateToGo
					.getExecutionFactory_builtInTypes_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.getBuiltInTypes().clear();
				exeObject.getBuiltInTypes()
						.addAll((Collection<? extends org.eclipse.uml2.uml.PrimitiveType>) getTracedToExe(
								value.getBuiltInTypes()));
			}
			for (umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value value : stateToGo
					.getExecutionFactory_locus_ExecutionFactory_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.setLocus_ExecutionFactory(
						(fumlConfiguration.Loci.Locus) getTracedToExe(value.getLocus_ExecutionFactory()));
			}
			for (umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value value : stateToGo
					.getExecutionFactory_primitiveBehaviorPrototypes_Values()) {
				fumlConfiguration.Loci.ExecutionFactory exeObject = (fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(
						value.getParent());
				exeObject.getPrimitiveBehaviorPrototypes().clear();
				exeObject.getPrimitiveBehaviorPrototypes()
						.addAll((Collection<? extends fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution>) getTracedToExe(
								value.getPrimitiveBehaviorPrototypes()));
			}
			for (umlTrace.States.Executor_locus_Executor_Value value : stateToGo.getExecutor_locus_Executor_Values()) {
				fumlConfiguration.Loci.Executor exeObject = (fumlConfiguration.Loci.Executor) getTracedToExe(
						value.getParent());
				exeObject.setLocus_Executor((fumlConfiguration.Loci.Locus) getTracedToExe(value.getLocus_Executor()));
			}
			for (umlTrace.States.Locus_executor_Value value : stateToGo.getLocus_executor_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject.setExecutor((fumlConfiguration.Loci.Executor) getTracedToExe(value.getExecutor()));
			}
			for (umlTrace.States.Locus_extensionalValues_Value value : stateToGo.getLocus_extensionalValues_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject.getExtensionalValues().clear();
				exeObject.getExtensionalValues()
						.addAll((Collection<? extends fumlConfiguration.Classes.Kernel.ExtensionalValue>) getTracedToExe(
								value.getExtensionalValues()));
			}
			for (umlTrace.States.Locus_factory_Value value : stateToGo.getLocus_factory_Values()) {
				fumlConfiguration.Loci.Locus exeObject = (fumlConfiguration.Loci.Locus) getTracedToExe(
						value.getParent());
				exeObject.setFactory((fumlConfiguration.Loci.ExecutionFactory) getTracedToExe(value.getFactory()));
			}
			for (umlTrace.States.SemanticVisitor_runtimeModelElement_Value value : stateToGo
					.getSemanticVisitor_runtimeModelElement_Values()) {
				fumlConfiguration.Loci.SemanticVisitor exeObject = (fumlConfiguration.Loci.SemanticVisitor) getTracedToExe(
						value.getParent());
				exeObject.setRuntimeModelElement(
						(fumlConfiguration.ElementConfiguration) getTracedToExe(value.getRuntimeModelElement()));
			}
		} else if (eObject instanceof umlTrace.States.Value) {
			goTo(((umlTrace.States.Value) eObject).getStatesNoOpposite().get(0));
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

	private void jumpBeforeStep(umlTrace.Steps.SpecificStep step) {
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

	public void loadTrace(umlTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, umlTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
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
			final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<umlTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<umlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<umlTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			umlTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<umlTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				umlTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<umlTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<umlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<umlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) currentStep;
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
								final SequentialStep<umlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							umlTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<umlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) currentStep;
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
											final umlTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<umlTrace.Steps.SpecificStep> s_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) s;
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
								final SequentialStep<umlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<umlTrace.Steps.SpecificStep>) currentStep;
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
	public List<umlTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<umlTrace.Steps.SpecificStep> predicate = s -> {
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
			final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (umlTrace.States.Value value : valueTrace) {
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
		if (step instanceof umlTrace.Steps.SpecificStep) {
			final umlTrace.Steps.SpecificStep step_cast = (umlTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(((SequentialStep<umlTrace.Steps.SpecificStep>) step_cast).getSubSteps());
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
			List<? extends umlTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof umlTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof umlTrace.States.Value) {
			final umlTrace.States.State state = ((umlTrace.States.Value) o).getStatesNoOpposite().get(0);
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
		final List<umlTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		umlTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<umlTrace.Steps.SpecificStep>) lastStep).getSubSteps());
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
		if (step instanceof umlTrace.Steps.SpecificStep) {
			umlTrace.Steps.SpecificStep step_cast = (umlTrace.Steps.SpecificStep) step;
			final List<umlTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof umlTrace.Steps.SpecificStep) {
				newPath.add(0, (umlTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"UmlTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			final umlTrace.States.Value value = valueTrace.get(0);
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
		final List<? extends umlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
		final umlTrace.States.State state = statesTrace.get(stateIndex);
		return getActiveValue(valueTrace, state);
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}
}
