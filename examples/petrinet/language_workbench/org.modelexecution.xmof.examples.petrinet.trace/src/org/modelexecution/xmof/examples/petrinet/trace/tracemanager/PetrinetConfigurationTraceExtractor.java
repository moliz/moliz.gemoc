package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import org.eclipse.gemoc.trace.commons.model.trace.LaunchConfiguration;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.gemoc.api.ITraceExtractor;

public class PetrinetConfigurationTraceExtractor implements ITraceExtractor {

	private petrinetConfigurationTrace.SpecificTrace traceRoot;

	final private List<List<? extends petrinetConfigurationTrace.States.Value>> valueTraces = Collections
			.synchronizedList(new ArrayList<>());

	private List<petrinetConfigurationTrace.States.State> statesTrace;

	final private Map<petrinetConfigurationTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<petrinetConfigurationTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	final private DefaultDeclarativeQualifiedNameProvider nameProvider = new DefaultDeclarativeQualifiedNameProvider();

	final private Map<Integer, Boolean> ignoredValueTraces = new HashMap<>();

	public PetrinetConfigurationTraceExtractor() {
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
						final String name = reference.getName();
						return name.equals("parent") || name.equals("states") || name.equals("statesNoOpposite");
					}
				};
			}
		};
	}

	private List<List<? extends petrinetConfigurationTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends petrinetConfigurationTrace.States.Value>> result = new ArrayList<>();
		for (petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration tracedObject : traceRoot
				.getPetrinetConfiguration_tracedPlaceConfigurations()) {
			result.add(tracedObject.getTokensSequence());
		}
		return result;
	}

	private ValueWrapper getValueWrapper(petrinetConfigurationTrace.States.Value value, int valueIndex) {
		List<petrinetConfigurationTrace.States.State> states = value.getStatesNoOpposite();
		petrinetConfigurationTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, valueIndex);
	}

	private petrinetConfigurationTrace.States.Value getValueAt(int traceIndex, int stateIndex) {
		petrinetConfigurationTrace.States.Value result = null;
		if (traceIndex >= 0 && traceIndex < valueTraces.size()) {
			final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final petrinetConfigurationTrace.States.State state = statesTrace.get(stateIndex);
			for (petrinetConfigurationTrace.States.Value value : valueTrace) {
				if (value.getStatesNoOpposite().contains(state)) {
					result = value;
					break;
				}
			}
		}
		return result;
	}

	@Override
	public ValueWrapper getValueWrapper(int traceIndex, int stateIndex) {
		petrinetConfigurationTrace.States.Value value = getValueAt(traceIndex, stateIndex);
		if (value == null) {
			return null;
		}
		List<petrinetConfigurationTrace.States.State> states = value.getStatesNoOpposite();
		petrinetConfigurationTrace.States.State firstState = states.get(0);
		final int firstStateIndex = statesTrace.indexOf(firstState);
		final int lastStateIndex = (int) (firstStateIndex + states.stream().distinct().count() - 1);
		return new ValueWrapper(value, firstStateIndex, lastStateIndex, traceIndex);
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

	private boolean compareInitialized = false;

	private IPostProcessor.Descriptor descriptor = null;

	private Registry registry = null;

	private EMFCompare compare;

	private List<Diff> compareEObjects(EObject e1, EObject e2) {
		if (e1 == e2) {
			return Collections.emptyList();
		}

		if (!compareInitialized) {
			descriptor = new BasicPostProcessorDescriptorImpl(customPostProcessor, Pattern.compile(".*"), null);
			registry = new PostProcessorDescriptorRegistryImpl();
			registry.put(customPostProcessor.getClass().getName(), descriptor);
			compare = EMFCompare.builder().setPostProcessorRegistry(registry).setDiffEngine(diffEngine).build();
			compareInitialized = true;
		}

		final IComparisonScope scope = new DefaultComparisonScope(e1, e2, null);
		final Comparison comparison = compare.compare(scope);
		return comparison.getDifferences();
	}

	private void computeStateComparisonValue(final petrinetConfigurationTrace.States.State state,
			final List<petrinetConfigurationTrace.States.Value> values,
			final Map<petrinetConfigurationTrace.States.State, Integer> stateToComparisonValue,
			final List<petrinetConfigurationTrace.States.Value> observedValues, final int statesNb) {
		Integer stateComparisonValue = stateToComparisonValue.get(state);
		for (int i = 0; i < values.size(); i++) {
			final petrinetConfigurationTrace.States.Value value = values.get(i);
			int idx = -1;
			for (int j = 0; j < observedValues.size(); j++) {
				final petrinetConfigurationTrace.States.Value v1 = observedValues.get(j);
				final petrinetConfigurationTrace.States.Value v2 = value;
				if (v1.eClass() == v2.eClass() && compareEObjects(v1, v2).isEmpty()) {
					idx = j;
					break;
				}
			}
			final int pow = (int) Math.pow(statesNb, i);
			if (idx != -1) {
				if (stateComparisonValue == null) {
					stateComparisonValue = (idx + 1) * pow;
				} else {
					stateComparisonValue = stateComparisonValue + (idx + 1) * pow;
				}
			} else {
				observedValues.add(value);
				idx = observedValues.size();
				if (stateComparisonValue == null) {
					stateComparisonValue = idx * pow;
				} else {
					stateComparisonValue = stateComparisonValue + idx * pow;
				}
			}
			stateToComparisonValue.put(state, stateComparisonValue);
		}
	}

	@Override
	public Collection<List<EObject>> computeStateEquivalenceClasses() {
		return computeStateEquivalenceClasses(statesTrace);
	}

	@Override
	public Collection<List<EObject>> computeStateEquivalenceClasses(List<? extends EObject> states) {
		final Map<petrinetConfigurationTrace.States.State, List<petrinetConfigurationTrace.States.Value>> stateToValues = new HashMap<>();
		final List<Entry<petrinetConfigurationTrace.States.State, List<Integer>>> stateToValueIndexes = new ArrayList<>();
		final List<petrinetConfigurationTrace.States.State> stateList = new ArrayList<>();
		final List<petrinetConfigurationTrace.States.Value> observedValues = new ArrayList<>();

		states.stream().distinct().map(e -> (petrinetConfigurationTrace.States.State) e).forEach(s -> {
			final List<petrinetConfigurationTrace.States.Value> values = getAllStateValues(s);
			stateToValues.put(s, values);
			stateList.add(s);
		});

		for (petrinetConfigurationTrace.States.State state : stateList) {
			final List<Integer> valueIndexes = new ArrayList<>();
			stateToValueIndexes.add(new SimpleEntry<>(state, valueIndexes));
			final List<petrinetConfigurationTrace.States.Value> values = stateToValues.get(state);
			for (int i = 0; i < values.size(); i++) {
				final petrinetConfigurationTrace.States.Value value = values.get(i);
				int idx = -1;
				for (int j = 0; j < observedValues.size(); j++) {
					final EObject v1 = observedValues.get(j);
					final EObject v2 = value;
					if (compareEObjects(v1, v2).isEmpty()) {
						idx = j;
						break;
					}
				}
				if (idx != -1) {
					valueIndexes.add(idx);
				} else {
					valueIndexes.add(observedValues.size());
					observedValues.add(value);
				}
			}
		}

		final List<List<Integer>> distinctClasses = stateToValueIndexes.stream().map(p -> p.getValue()).distinct()
				.collect(Collectors.toList());
		final Map<Integer, List<EObject>> result = new HashMap<>();

		stateToValueIndexes.forEach(p -> {
			final petrinetConfigurationTrace.States.State state = p.getKey();
			final List<Integer> indexes = p.getValue();
			int v = distinctClasses.indexOf(indexes);
			List<EObject> equivalentStates = result.get(v);
			if (equivalentStates == null) {
				equivalentStates = new ArrayList<>();
				result.put(v, equivalentStates);
			}
			if (equivalentStates.isEmpty()) {
				equivalentStates.add(state);
			} else {
				if (states.indexOf(state) < states.indexOf(equivalentStates.get(0))) {
					equivalentStates.add(0, state);
				} else {
					equivalentStates.add(state);
				}
			}
		});

		return result.values().stream().collect(Collectors.toList());
	}

	@Override
	public boolean compareStates(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final petrinetConfigurationTrace.States.State state1;
		final petrinetConfigurationTrace.States.State state2;

		if (eObject1 instanceof petrinetConfigurationTrace.States.State) {
			state1 = (petrinetConfigurationTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof petrinetConfigurationTrace.States.State) {
			state2 = (petrinetConfigurationTrace.States.State) eObject2;
		} else {
			return false;
		}

		final List<petrinetConfigurationTrace.States.Value> values1 = getAllStateValues(state1);
		final List<petrinetConfigurationTrace.States.Value> values2 = getAllStateValues(state2);

		if (values1.size() != values2.size()) {
			return false;
		}

		final List<List<Diff>> result = new ArrayList<>();
		for (int i = 0; i < values1.size(); i++) {
			if (!respectIgnored || !isValueTraceIgnored(i)) {
				final petrinetConfigurationTrace.States.Value value1 = values1.get(i);
				final petrinetConfigurationTrace.States.Value value2 = values2.get(i);
				if (value1 != value2) {
					final List<Diff> diffs = compareEObjects(value1, value2);
					if (!diffs.isEmpty()) {
						result.add(diffs);
					}
				}
			}
		}

		return result.isEmpty();
	}

	public boolean compareSteps(EObject eObject1, EObject eObject2) {
		final petrinetConfigurationTrace.Steps.SpecificStep step1;
		final petrinetConfigurationTrace.Steps.SpecificStep step2;

		if (eObject1 instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
			step1 = (petrinetConfigurationTrace.Steps.SpecificStep) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
			step2 = (petrinetConfigurationTrace.Steps.SpecificStep) eObject2;
		} else {
			return false;
		}

		if (step1.eClass() == step2.eClass()) {
			return true;
		}

		return false;
	}

	public boolean compareStatesWithSteps(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final petrinetConfigurationTrace.States.State state1;
		final petrinetConfigurationTrace.States.State state2;

		if (eObject1 instanceof petrinetConfigurationTrace.States.State) {
			state1 = (petrinetConfigurationTrace.States.State) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof petrinetConfigurationTrace.States.State) {
			state2 = (petrinetConfigurationTrace.States.State) eObject2;
		} else {
			return false;
		}

		if (compareStates(state1, state2, respectIgnored)) {
			final List<petrinetConfigurationTrace.Steps.SpecificStep> endedSteps1 = state1.getEndedSteps();
			final List<petrinetConfigurationTrace.Steps.SpecificStep> startedSteps1 = state1.getStartedSteps();
			final List<petrinetConfigurationTrace.Steps.SpecificStep> endedSteps2 = state2.getEndedSteps();
			final List<petrinetConfigurationTrace.Steps.SpecificStep> startedSteps2 = state2.getStartedSteps();
			if (endedSteps1.size() == endedSteps2.size() && startedSteps1.size() == startedSteps2.size()) {
				boolean result = true;
				for (int i = 0; i < endedSteps1.size(); i++) {
					final petrinetConfigurationTrace.Steps.SpecificStep endedStep1 = endedSteps1.get(i);
					final petrinetConfigurationTrace.Steps.SpecificStep endedStep2 = endedSteps2.get(i);
					if (!compareSteps(endedStep1, endedStep2)) {
						result = false;
						break;
					}
				}
				if (!result) {
					return false;
				}
				for (int i = 0; i < startedSteps1.size(); i++) {
					final petrinetConfigurationTrace.Steps.SpecificStep startedStep1 = startedSteps1.get(i);
					final petrinetConfigurationTrace.Steps.SpecificStep startedStep2 = startedSteps2.get(i);
					if (!compareSteps(startedStep1, startedStep2)) {
						result = false;
						break;
					}
				}
				return result;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean compareTraces(EObject eObject1, EObject eObject2, boolean respectIgnored) {
		final petrinetConfigurationTrace.SpecificTrace trace1;
		final petrinetConfigurationTrace.SpecificTrace trace2;

		if (eObject1 instanceof petrinetConfigurationTrace.SpecificTrace) {
			trace1 = (petrinetConfigurationTrace.SpecificTrace) eObject1;
		} else {
			return false;
		}

		if (eObject2 instanceof petrinetConfigurationTrace.SpecificTrace) {
			trace2 = (petrinetConfigurationTrace.SpecificTrace) eObject2;
		} else {
			return false;
		}

		final List<petrinetConfigurationTrace.States.State> states1 = trace1.getStatesTrace();
		final List<petrinetConfigurationTrace.States.State> states2 = trace2.getStatesTrace();

		if (states1.size() != states2.size()) {
			return false;
		}

		boolean result = true;

		for (int i = 0; i < states1.size(); i++) {
			final petrinetConfigurationTrace.States.State state1 = states1.get(i);
			final petrinetConfigurationTrace.States.State state2 = states2.get(i);
			if (!compareStatesWithSteps(state1, state2, respectIgnored)) {
				result = false;
				break;
			}
		}

		return result;
	}

	private List<petrinetConfigurationTrace.States.Value> getAllStateValues(
			petrinetConfigurationTrace.States.State state) {
		final List<List<? extends petrinetConfigurationTrace.States.Value>> traces = new ArrayList<>();
		final List<petrinetConfigurationTrace.States.Value> result = new ArrayList<>();
		for (petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration tracedObject : ((petrinetConfigurationTrace.SpecificTrace) state
				.eContainer()).getPetrinetConfiguration_tracedPlaceConfigurations()) {
			traces.add(tracedObject.getTokensSequence());
		}
		for (int i = 0; i < traces.size(); i++) {
			if (!isValueTraceIgnored(i)) {
				final List<? extends petrinetConfigurationTrace.States.Value> trace = traces.get(i);
				for (petrinetConfigurationTrace.States.Value value : trace) {
					if (value.getStatesNoOpposite().contains(state)) {
						result.add(value);
						break;
					}
				}
			}
		}
		return result;
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

	public void loadTrace(petrinetConfigurationTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		valueTraces.addAll(getAllValueTraces());
	}

	@Override
	public List<StepWrapper> getStepWrappers(int startingState, int endingState) {
		Predicate<petrinetConfigurationTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).map(s -> getStepWrapper(s))
				.collect(Collectors.toList());
	}

	private boolean isStateBreakable(petrinetConfigurationTrace.States.State state) {
		final boolean b = state.getStartedSteps().size() == 1;
		if (b) {
			petrinetConfigurationTrace.Steps.SpecificStep s = state.getStartedSteps().get(0);
			return !(s instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main_ImplicitStep
					|| s instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run_ImplicitStep);
		}
		return true;
	}

	@Override
	public StateWrapper getStateWrapper(int stateIndex) {
		if (stateIndex > -1 && stateIndex < statesTrace.size()) {
			final petrinetConfigurationTrace.States.State state = statesTrace.get(stateIndex);
			return new StateWrapper(state, stateIndex, isStateBreakable(state), getStateDescription(stateIndex));
		}
		return null;
	}

	@Override
	public StateWrapper getStateWrapper(EObject state) {
		if (state instanceof petrinetConfigurationTrace.States.State) {
			final int idx = statesTrace.indexOf(state);
			if (idx != -1) {
				final petrinetConfigurationTrace.States.State state_cast = (petrinetConfigurationTrace.States.State) state;
				return new StateWrapper(state_cast, idx, isStateBreakable(state_cast), getStateDescription(idx));
			}
		}
		return null;
	}

	@Override
	public List<StateWrapper> getStateWrappers(int start, int end) {
		final List<StateWrapper> result = new ArrayList<>();
		final int startStateIndex = Math.max(0, start);
		final int endStateIndex = Math.min(statesTrace.size() - 1, end);

		for (int i = startStateIndex; i < endStateIndex + 1; i++) {
			final petrinetConfigurationTrace.States.State state = statesTrace.get(i);
			result.add(new StateWrapper(state, i, isStateBreakable(state), getStateDescription(i)));
		}

		return result;
	}

	@Override
	public List<ValueWrapper> getValueWrappers(int valueTraceIndex, int start, int end) {
		final List<ValueWrapper> result = new ArrayList<>();

		if (valueTraceIndex < valueTraces.size()) {
			final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(valueTraceIndex);
			for (petrinetConfigurationTrace.States.Value value : valueTrace) {
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
		if (step instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
			final petrinetConfigurationTrace.Steps.SpecificStep step_cast = (petrinetConfigurationTrace.Steps.SpecificStep) step;
			final int startingIndex = getStartingIndex(step_cast);
			final int endingIndex = getEndingIndex(step_cast);
			final List<Step> subSteps = new ArrayList<>();
			if (step_cast instanceof SequentialStep<?>) {
				subSteps.addAll(
						((SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) step_cast).getSubSteps());
			}
			return new StepWrapper(step, startingIndex, endingIndex, subSteps);
		}
		return null;
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
			List<? extends petrinetConfigurationTrace.States.Value> trace = valueTraces.get(traceIndex);
			return trace.size();
		}
		return -1;
	}

	private String getValueName(EObject value) {
		final EObject container = value.eContainer();
		final List<String> attributes = container.eClass().getEAllReferences().stream()
				.filter(r -> r.getName().endsWith("Sequence"))
				.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
		if (attributes.isEmpty()) {
			return "";
		} else {
			return attributes.stream().filter(s -> value.getClass().getName().contains("_" + s + "_")).findFirst()
					.orElse("");
		}
	}

	private Object getOriginalObject(EObject eObject) {
		return eObject.eClass().getEAllReferences().stream().filter(r -> r.getName().startsWith("originalObject"))
				.findFirst().map(r -> eObject.eGet(r)).orElse(null);
	}

	private String getObjectDescription(Object object) {
		if (object == null) {
			return "null";
		}
		if (object instanceof EObject) {
			final Object originalObject = getOriginalObject((EObject) object);
			if (originalObject != null) {
				if (originalObject instanceof EObject) {
					final QualifiedName qname = nameProvider.getFullyQualifiedName((EObject) originalObject);
					if (qname != null) {
						return qname.getLastSegment();
					}
				}
				return originalObject.toString();
			}
			QualifiedName qname = nameProvider.getFullyQualifiedName((EObject) object);
			if (qname != null) {
				return qname.getLastSegment();
			}
		}
		if (object instanceof Collection) {
			@SuppressWarnings("unchecked")
			final Collection<Object> o_cast = (Collection<Object>) object;
			if (!o_cast.isEmpty()) {
				List<String> strings = o_cast.stream().map(o -> getObjectDescription(o)).collect(Collectors.toList());
				return strings.toString();
			}
		}
		return object.toString();
	}

	@Override
	public String getValueLabel(int traceIndex) {
		String attributeName = "";
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends petrinetConfigurationTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			if (valueTrace.isEmpty()) {
				return "";
			}
			if (valueTrace instanceof EcoreEList) {
				final EcoreEList<?> eList = (EcoreEList<?>) valueTrace;
				final EObject owner = eList.getEObject();
				final List<String> attributes = owner.eClass().getEAllReferences().stream()
						.filter(r -> r.getName().endsWith("Sequence"))
						.map(r -> r.getName().substring(0, r.getName().length() - 8)).collect(Collectors.toList());
				final Object originalObject = getOriginalObject(owner);
				if (!attributes.isEmpty()) {
					String n = eList.data().getClass().getComponentType().getName();
					attributeName = attributes.stream().filter(s -> n.contains("_" + s + "_")).findFirst().orElse("");
				}
				if (originalObject != null) {
					if (originalObject instanceof EObject) {
						final EObject eObject = (EObject) originalObject;
						if (eObject.eIsProxy()) {
							final String proxyToString = eObject.toString();
							final int idx = proxyToString.indexOf("eProxyURI: ") + 11;
							final String s = proxyToString.substring(idx, proxyToString.length() - 1);
							return attributeName + " (" + s + ")";
						}
						final QualifiedName qname = nameProvider.getFullyQualifiedName(eObject);
						if (qname != null) {
							return attributeName + " (" + qname.toString() + " :" + eObject.eClass().getName() + ")";
						}
					}
					return attributeName + " (" + originalObject.toString() + ")";
				}
			}
		}
		return attributeName;
	}

	@Override
	public String getStateDescription(int stateIndex) {
		String result = "";
		for (int i = 0; i < valueTraces.size(); i++) {
			if (!isValueTraceIgnored(i)) {
				String description = getValueDescription(i, stateIndex);
				result += (description == null ? "" : (result.length() == 0 ? "" : "\n") + description);
			}
		}
		return result;
	}

	@Override
	public String getValueDescription(int traceIndex, int stateIndex) {
		final EObject value = getValueAt(traceIndex, stateIndex);
		if (value == null) {
			return null;
		}
		String description = getValueLabel(traceIndex) + " : ";
		final String attributeName = getValueName(value);
		if (attributeName.length() > 0) {
			final Optional<EStructuralFeature> attribute = value.eClass().getEAllStructuralFeatures().stream()
					.filter(r -> r.getName().equals(attributeName)).findFirst();
			if (attribute.isPresent()) {
				final Object o = value.eGet(attribute.get());
				return description + getObjectDescription(o);
			}
		}
		return description + value;
	}

	@Override
	public LaunchConfiguration getLaunchConfiguration() {
		return traceRoot.getLaunchconfiguration();
	}

	@Override
	public void ignoreValueTrace(int trace, boolean ignore) {
		ignoredValueTraces.put(trace, ignore);
	}

	@Override
	public boolean isValueTraceIgnored(int trace) {
		Boolean result = ignoredValueTraces.get(trace);
		return result != null && result;
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
	}
}
