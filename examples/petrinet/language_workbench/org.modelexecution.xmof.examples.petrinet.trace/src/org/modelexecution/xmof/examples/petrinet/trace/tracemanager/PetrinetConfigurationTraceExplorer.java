package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.gemoc.api.ITraceExplorer;
import org.eclipse.gemoc.trace.gemoc.api.ITraceListener;

public class PetrinetConfigurationTraceExplorer implements ITraceExplorer {
	private petrinetConfigurationTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private petrinetConfigurationTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends petrinetConfigurationTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<petrinetConfigurationTrace.States.State> statesTrace;

	private petrinetConfigurationTrace.Steps.SpecificStep stepIntoResult;
	private petrinetConfigurationTrace.Steps.SpecificStep stepOverResult;
	private petrinetConfigurationTrace.Steps.SpecificStep stepReturnResult;

	private petrinetConfigurationTrace.Steps.SpecificStep stepBackIntoResult;
	private petrinetConfigurationTrace.Steps.SpecificStep stepBackOverResult;
	private petrinetConfigurationTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<petrinetConfigurationTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<petrinetConfigurationTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	public PetrinetConfigurationTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public PetrinetConfigurationTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends petrinetConfigurationTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends petrinetConfigurationTrace.States.Value>> result = new ArrayList<>();
		for (petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration tracedObject : traceRoot
				.getPetrinetConfiguration_tracedPlaceConfigurations()) {
			result.add(tracedObject.getTokensSequence());
		}
		return result;
	}

	private petrinetConfigurationTrace.States.Value getActiveValue(
			List<? extends petrinetConfigurationTrace.States.Value> valueTrace,
			petrinetConfigurationTrace.States.State state) {
		petrinetConfigurationTrace.States.Value result = null;
		for (petrinetConfigurationTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends petrinetConfigurationTrace.States.Value> valueTrace) {
		petrinetConfigurationTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private int getNextValueIndex(List<? extends petrinetConfigurationTrace.States.Value> valueTrace) {
		petrinetConfigurationTrace.States.Value value = getActiveValue(valueTrace, currentState);
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

	private int getStartingIndex(petrinetConfigurationTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(petrinetConfigurationTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private petrinetConfigurationTrace.Steps.SpecificStep findNextStep(
			final List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath,
			final petrinetConfigurationTrace.Steps.SpecificStep previousStep, final int start) {
		final List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		petrinetConfigurationTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		petrinetConfigurationTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final petrinetConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<petrinetConfigurationTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(
						((SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep).getSubSteps());
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
	private petrinetConfigurationTrace.Steps.SpecificStep computeBackInto(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		petrinetConfigurationTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final petrinetConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final petrinetConfigurationTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) parentStep;
			final List<? extends petrinetConfigurationTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast
					.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final petrinetConfigurationTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				petrinetConfigurationTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<petrinetConfigurationTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final petrinetConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				petrinetConfigurationTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<petrinetConfigurationTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private petrinetConfigurationTrace.Steps.SpecificStep computeBackOver(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		petrinetConfigurationTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final petrinetConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final petrinetConfigurationTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) parentStep;
			final List<petrinetConfigurationTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
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
			final petrinetConfigurationTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private petrinetConfigurationTrace.Steps.SpecificStep computeBackOut(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private petrinetConfigurationTrace.Steps.SpecificStep computeStepInto(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath,
			List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private petrinetConfigurationTrace.Steps.SpecificStep computeStepOver(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath,
			List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private petrinetConfigurationTrace.Steps.SpecificStep computeStepReturn(
			List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath,
			List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<petrinetConfigurationTrace.Steps.SpecificStep> stepPath) {
		final List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<petrinetConfigurationTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections
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

	private void goTo(EObject eObject) {
		if (eObject instanceof petrinetConfigurationTrace.States.State) {
			petrinetConfigurationTrace.States.State stateToGo = (petrinetConfigurationTrace.States.State) eObject;
			for (petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value value : stateToGo
					.getPlaceConfiguration_tokens_Values()) {
				if (value
						.getParent() instanceof petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration) {
					petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration parent_cast = (petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration) value
							.getParent();
					int toset = value.getTokens();
					int current = ((petrinetConfiguration.PlaceConfiguration) parent_cast.getOriginalObject())
							.getTokens();
					if (current != toset) {
						((petrinetConfiguration.PlaceConfiguration) parent_cast.getOriginalObject())
								.setTokens((int) toset);
					}
				}
			}
		} else if (eObject instanceof petrinetConfigurationTrace.States.Value) {
			goTo(((petrinetConfigurationTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private void jumpBeforeStep(petrinetConfigurationTrace.Steps.SpecificStep step) {
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

	public void loadTrace(petrinetConfigurationTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, petrinetConfigurationTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
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
			final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<petrinetConfigurationTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<petrinetConfigurationTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<petrinetConfigurationTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			petrinetConfigurationTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<petrinetConfigurationTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				petrinetConfigurationTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<petrinetConfigurationTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<petrinetConfigurationTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep;
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
								final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							petrinetConfigurationTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep;
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
											final petrinetConfigurationTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> s_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) s;
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
								final SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep;
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

	private List<petrinetConfigurationTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<petrinetConfigurationTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
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
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof petrinetConfigurationTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof petrinetConfigurationTrace.States.Value) {
			final petrinetConfigurationTrace.States.State state = ((petrinetConfigurationTrace.States.Value) o)
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
		final List<petrinetConfigurationTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		petrinetConfigurationTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) lastStep).getSubSteps());
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
		if (step instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
			petrinetConfigurationTrace.Steps.SpecificStep step_cast = (petrinetConfigurationTrace.Steps.SpecificStep) step;
			final List<petrinetConfigurationTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
				newPath.add(0, (petrinetConfigurationTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"PetrinetConfigurationTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}
}
