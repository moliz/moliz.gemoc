package org.modelexecution.xmof.examples.iml.sequential.sequentialiml.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.internal.spec.MatchSpec;
import org.eclipse.emf.compare.postprocessor.BasicPostProcessorDescriptorImpl;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;
import org.eclipse.emf.compare.postprocessor.IPostProcessor.Descriptor.Registry;
import org.eclipse.emf.compare.postprocessor.PostProcessorDescriptorRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

@SuppressWarnings("restriction")
public class ImlTraceExplorer implements ITraceExplorer {

	private imlTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private imlTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends imlTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<imlTrace.States.State> statesTrace;

	private imlTrace.Steps.SpecificStep stepIntoResult;
	private imlTrace.Steps.SpecificStep stepOverResult;
	private imlTrace.Steps.SpecificStep stepReturnResult;

	private imlTrace.Steps.SpecificStep stepBackIntoResult;
	private imlTrace.Steps.SpecificStep stepBackOverResult;
	private imlTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<imlTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<imlTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	public ImlTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
		configureDiffEngine();
	}

	public ImlTraceExplorer() {
		this.tracedToExe = null;
		configureDiffEngine();
	}

	private IDiffEngine diffEngine = null;

	private void configureDiffEngine() {
		IDiffProcessor diffProcessor = new DiffBuilder();
		diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new FeatureFilter() {
					@Override
					protected boolean isIgnoredReference(Match match, EReference reference) {
						return true;
					}
				};
			}
		};
	}

	@SuppressWarnings("unused")
	private List<List<? extends imlTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends imlTrace.States.Value>> result = new ArrayList<>();
		for (imlTrace.States.iml.TracedActivity tracedObject : traceRoot.getIml_tracedActivitys()) {
			result.add(tracedObject.getCurrentSequence());
		}
		for (imlTrace.States.iml.TracedAddData tracedObject : traceRoot.getIml_tracedAddDatas()) {
		}
		for (imlTrace.States.iml.TracedConnection tracedObject : traceRoot.getIml_tracedConnections()) {
		}
		for (imlTrace.States.iml.TracedEvent tracedObject : traceRoot.getIml_tracedEvents()) {
		}
		for (imlTrace.States.iml.TracedHeader tracedObject : traceRoot.getIml_tracedHeaders()) {
		}
		for (imlTrace.States.iml.TracedJump tracedObject : traceRoot.getIml_tracedJumps()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSelectionConvergence tracedObject : traceRoot
				.getIml_tracedSelectionConvergences()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSelectionDivergence tracedObject : traceRoot
				.getIml_tracedSelectionDivergences()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSimultaneousConvergence tracedObject : traceRoot
				.getIml_tracedSimultaneousConvergences()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSimultaneousDivergence tracedObject : traceRoot
				.getIml_tracedSimultaneousDivergences()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedState tracedObject : traceRoot.getIml_tracedStates()) {
			result.add(tracedObject.getCurrentSequence());
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedStateTransition tracedObject : traceRoot.getIml_tracedStateTransitions()) {
			result.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedVariable tracedObject : traceRoot.getIml_tracedVariables()) {
			result.add(tracedObject.getValueSequence());
		}
		return result;
	}

	private imlTrace.States.Value getActiveValue(List<? extends imlTrace.States.Value> valueTrace,
			imlTrace.States.State state) {
		imlTrace.States.Value result = null;
		for (imlTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends imlTrace.States.Value> valueTrace) {
		imlTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private int getNextValueIndex(List<? extends imlTrace.States.Value> valueTrace) {
		imlTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private ValueWrapper getValueWrapper(imlTrace.States.Value value, int valueIndex) {
		List<imlTrace.States.State> states = value.getStatesNoOpposite();
		imlTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private final IPostProcessor customPostProcessor = new IPostProcessor() {

		private final Function<EObject, String> getIdFunction = e -> e.eClass().getName();

		@Override
		public void postMatch(Comparison comparison, Monitor monitor) {
			final List<Match> matches = new ArrayList<>(comparison.getMatches());
			final List<Match> treatedMatches = new ArrayList<>();
			matches.forEach(m1 -> {
				matches.forEach(m2 -> {
					if (m1 != m2 && !treatedMatches.contains(m2)) {
						final EObject left;
						final EObject right;
						if (m1.getLeft() != null && m1.getRight() == null && m2.getLeft() == null
								&& m2.getRight() != null) {
							left = m1.getLeft();
							right = m2.getRight();
						} else if (m2.getLeft() != null && m2.getRight() == null && m1.getLeft() == null
								&& m1.getRight() != null) {
							left = m2.getLeft();
							right = m1.getRight();
						} else {
							return;
						}
						final String leftId = getIdFunction.apply(left);
						final String rightId = getIdFunction.apply(right);
						if (leftId.equals(rightId)) {
							comparison.getMatches().remove(m1);
							comparison.getMatches().remove(m2);
							final Match match = new MatchSpec();
							match.setLeft(left);
							match.setRight(right);
							comparison.getMatches().add(match);
						}
					}
				});
				treatedMatches.add(m1);
			});
		}

		@Override
		public void postDiff(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postRequirements(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postEquivalences(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postConflicts(Comparison comparison, Monitor monitor) {
		}

		@Override
		public void postComparison(Comparison comparison, Monitor monitor) {
		}
	};

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List<Diff> compareEObjects(EObject e1, EObject e2) {
		IPostProcessor.Descriptor descriptor = new BasicPostProcessorDescriptorImpl(customPostProcessor,
				Pattern.compile(".*"), null);

		Registry registry = new PostProcessorDescriptorRegistryImpl();
		registry.put(customPostProcessor.getClass().getName(), descriptor);

		final EMFCompare compare;

		compare = EMFCompare.builder().setPostProcessorRegistry(registry).setDiffEngine(diffEngine).build();

		final IComparisonScope scope = new DefaultComparisonScope(e1, e2, null);
		final Comparison comparison = compare.compare(scope);
		return comparison.getDifferences();
	}

	@Override
	public boolean compareStates(EObject eObject1, EObject eObject2, List<Integer> hiddenValues) {
		final imlTrace.States.State state1;
		final imlTrace.States.State state2;

		if (eObject1 instanceof imlTrace.States.State) {
			state1 = (imlTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof imlTrace.States.State) {
			state2 = (imlTrace.States.State) eObject2;
		} else {
			return false;
		}

		final List<imlTrace.States.Value> values1 = getAllStateValues(state1);
		final List<imlTrace.States.Value> values2 = getAllStateValues(state2);

		if (values1.size() != values2.size()) {
			return false;
		} else {
			final List<Diff> result = new ArrayList<>();
			for (int i = 0; i < values1.size(); i++) {
				if (!hiddenValues.contains(i)) {
					result.addAll(compareEObjects(values1.get(i), values2.get(i)));
				}
			}
			return result.isEmpty();
		}
	}

	@SuppressWarnings("unused")
	private List<imlTrace.States.Value> getAllStateValues(imlTrace.States.State state) {
		final List<List<? extends imlTrace.States.Value>> traces = new ArrayList<>();
		final List<imlTrace.States.Value> result = new ArrayList<>();
		for (imlTrace.States.iml.TracedActivity tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedActivitys()) {
			traces.add(tracedObject.getCurrentSequence());
		}
		for (imlTrace.States.iml.TracedAddData tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedAddDatas()) {
		}
		for (imlTrace.States.iml.TracedConnection tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedConnections()) {
		}
		for (imlTrace.States.iml.TracedEvent tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedEvents()) {
		}
		for (imlTrace.States.iml.TracedHeader tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedHeaders()) {
		}
		for (imlTrace.States.iml.TracedJump tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedJumps()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSelectionConvergence tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedSelectionConvergences()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSelectionDivergence tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedSelectionDivergences()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSimultaneousConvergence tracedObject : ((imlTrace.SpecificTrace) state
				.eContainer()).getIml_tracedSimultaneousConvergences()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedSimultaneousDivergence tracedObject : ((imlTrace.SpecificTrace) state
				.eContainer()).getIml_tracedSimultaneousDivergences()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedState tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedStates()) {
			traces.add(tracedObject.getCurrentSequence());
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedStateTransition tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedStateTransitions()) {
			traces.add(tracedObject.getFiringSequence());
		}
		for (imlTrace.States.iml.TracedVariable tracedObject : ((imlTrace.SpecificTrace) state.eContainer())
				.getIml_tracedVariables()) {
			traces.add(tracedObject.getValueSequence());
		}
		for (List<? extends imlTrace.States.Value> trace : traces) {
			for (imlTrace.States.Value value : trace) {
				if (value.getStatesNoOpposite().contains(state)) {
					result.add(value);
					break;
				}
			}
		}
		return result;
	}

	private int getStartingIndex(imlTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(imlTrace.Steps.SpecificStep step) {
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
	private imlTrace.Steps.SpecificStep findNextStep(final List<imlTrace.Steps.SpecificStep> stepPath,
			final imlTrace.Steps.SpecificStep previousStep, final int start) {
		final List<imlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		imlTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		imlTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final imlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<imlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<imlTrace.Steps.SpecificStep>) currentStep).getSubSteps());
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
	private imlTrace.Steps.SpecificStep computeBackInto(List<imlTrace.Steps.SpecificStep> stepPath) {
		final List<imlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		imlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final imlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final imlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<imlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) parentStep;
			final List<? extends imlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final imlTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				imlTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<imlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<imlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<imlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final imlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				imlTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<imlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<imlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<imlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private imlTrace.Steps.SpecificStep computeBackOver(List<imlTrace.Steps.SpecificStep> stepPath) {
		final List<imlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		imlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final imlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final imlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<imlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) parentStep;
			final List<imlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
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
			final imlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private imlTrace.Steps.SpecificStep computeBackOut(List<imlTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private imlTrace.Steps.SpecificStep computeStepInto(List<imlTrace.Steps.SpecificStep> stepPath,
			List<imlTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private imlTrace.Steps.SpecificStep computeStepOver(List<imlTrace.Steps.SpecificStep> stepPath,
			List<imlTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private imlTrace.Steps.SpecificStep computeStepReturn(List<imlTrace.Steps.SpecificStep> stepPath,
			List<imlTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<imlTrace.Steps.SpecificStep> stepPath) {
		final List<imlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<imlTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof imlTrace.States.State) {
			imlTrace.States.State stateToGo = (imlTrace.States.State) eObject;
			for (imlTrace.States.State_current_Value value : stateToGo.getState_current_Values()) {
				if (value.getParent() instanceof imlTrace.States.iml.TracedState) {
					imlTrace.States.iml.TracedState parent_cast = (imlTrace.States.iml.TracedState) value.getParent();
					boolean toset = value.isCurrent();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) parent_cast
							.getOriginalObject()).isCurrent();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.State) parent_cast.getOriginalObject())
								.setCurrent((boolean) toset);
					}
				}
			}
			for (imlTrace.States.Activity_current_Value value : stateToGo.getActivity_current_Values()) {
				if (value.getParent() instanceof imlTrace.States.iml.TracedActivity) {
					imlTrace.States.iml.TracedActivity parent_cast = (imlTrace.States.iml.TracedActivity) value
							.getParent();
					boolean toset = value.isCurrent();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) parent_cast
							.getOriginalObject()).isCurrent();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity) parent_cast
								.getOriginalObject()).setCurrent((boolean) toset);
					}
				}
			}
			for (imlTrace.States.ConnectionPoint_firing_Value value : stateToGo.getConnectionPoint_firing_Values()) {
				if (value.getParent() instanceof imlTrace.States.iml.TracedJump) {
					imlTrace.States.iml.TracedJump parent_cast = (imlTrace.States.iml.TracedJump) value.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedSelectionConvergence) {
					imlTrace.States.iml.TracedSelectionConvergence parent_cast = (imlTrace.States.iml.TracedSelectionConvergence) value
							.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedSelectionDivergence) {
					imlTrace.States.iml.TracedSelectionDivergence parent_cast = (imlTrace.States.iml.TracedSelectionDivergence) value
							.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedSimultaneousConvergence) {
					imlTrace.States.iml.TracedSimultaneousConvergence parent_cast = (imlTrace.States.iml.TracedSimultaneousConvergence) value
							.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedSimultaneousDivergence) {
					imlTrace.States.iml.TracedSimultaneousDivergence parent_cast = (imlTrace.States.iml.TracedSimultaneousDivergence) value
							.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedState) {
					imlTrace.States.iml.TracedState parent_cast = (imlTrace.States.iml.TracedState) value.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
				if (value.getParent() instanceof imlTrace.States.iml.TracedStateTransition) {
					imlTrace.States.iml.TracedStateTransition parent_cast = (imlTrace.States.iml.TracedStateTransition) value
							.getParent();
					boolean toset = value.isFiring();
					boolean current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
							.getOriginalObject()).isFiring();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint) parent_cast
								.getOriginalObject()).setFiring((boolean) toset);
					}
				}
			}
			for (imlTrace.States.Variable_value_Value value : stateToGo.getVariable_value_Values()) {
				if (value.getParent() instanceof imlTrace.States.iml.TracedVariable) {
					imlTrace.States.iml.TracedVariable parent_cast = (imlTrace.States.iml.TracedVariable) value
							.getParent();
					java.lang.String toset = value.getValue();
					java.lang.String current = ((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) parent_cast
							.getOriginalObject()).getValue();
					if (current != toset) {
						((org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable) parent_cast
								.getOriginalObject()).setValue((java.lang.String) toset);
					}
				}
			}
		} else if (eObject instanceof imlTrace.States.Value) {
			goTo(((imlTrace.States.Value) eObject).getStatesNoOpposite().get(0));
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

	private void jumpBeforeStep(imlTrace.Steps.SpecificStep step) {
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

	public void loadTrace(imlTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, imlTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
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
			final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<imlTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<imlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<imlTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			imlTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<imlTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				imlTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<imlTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<imlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<imlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) currentStep;
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
								final SequentialStep<imlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							imlTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<imlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) currentStep;
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
											final imlTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<imlTrace.Steps.SpecificStep> s_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) s;
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
								final SequentialStep<imlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<imlTrace.Steps.SpecificStep>) currentStep;
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
	public List<imlTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<imlTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	private boolean isStateBreakable(imlTrace.States.State state) {
		final boolean b = state.getStartedSteps().size() == 1;
		if (b) {
			imlTrace.Steps.SpecificStep s = state.getStartedSteps().get(0);
			return !(s instanceof imlTrace.Steps.Iml_Header_Execute_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_SelectionConvergence_DoFire_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_SelectionDivergence_DoFire_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_SimultaneousConvergence_DoFire_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_SimultaneousDivergence_DoFire_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_StateTransition_DoFire_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_State_Activate_ImplicitStep
					|| s instanceof imlTrace.Steps.Iml_State_ExecuteActivities_ImplicitStep);
		}
		return true;
	}

	@Override
	public StateWrapper getStateWrapper(int stateIndex) {
		if (stateIndex > -1 && stateIndex < statesTrace.size()) {
			final imlTrace.States.State state = statesTrace.get(stateIndex);
			return new StateWrapper(state, stateIndex, isStateBreakable(state));
		}
		return null;
	}

	@Override
	public List<StateWrapper> getStateWrappers(int start, int end) {
		final List<StateWrapper> result = new ArrayList<>();
		final int startStateIndex = Math.max(0, start);
		final int endStateIndex = Math.min(statesTrace.size() - 1, end);

		for (int i = startStateIndex; i < endStateIndex + 1; i++) {
			final imlTrace.States.State state = statesTrace.get(i);
			result.add(new StateWrapper(state, i, isStateBreakable(state)));
		}

		return result;
	}

	@Override
	public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int start, int end) {
		final List<ValueWrapper> result = new ArrayList<>();

		if (valueTraceIndex < valueTraces.size()) {
			final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (imlTrace.States.Value value : valueTrace) {
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
		if (step instanceof imlTrace.Steps.SpecificStep) {
			final imlTrace.Steps.SpecificStep step_cast = (imlTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(((SequentialStep<imlTrace.Steps.SpecificStep>) step_cast).getSubSteps());
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
			List<? extends imlTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof imlTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof imlTrace.States.Value) {
			final imlTrace.States.State state = ((imlTrace.States.Value) o).getStatesNoOpposite().get(0);
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
		final List<imlTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		imlTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<imlTrace.Steps.SpecificStep>) lastStep).getSubSteps());
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
		if (step instanceof imlTrace.Steps.SpecificStep) {
			imlTrace.Steps.SpecificStep step_cast = (imlTrace.Steps.SpecificStep) step;
			final List<imlTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof imlTrace.Steps.SpecificStep) {
				newPath.add(0, (imlTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"ImlTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			final imlTrace.States.Value value = valueTrace.get(0);
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
		final List<? extends imlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
		final imlTrace.States.State state = statesTrace.get(stateIndex);
		return getActiveValue(valueTrace, state);
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}
}
