package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class PetrinetTraceConstructor implements ITraceConstructor {
	private petrinetTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private petrinetTrace.States.State lastState;

	private Resource traceResource;
	private Deque<petrinetTrace.Steps.SpecificStep> context = new LinkedList<petrinetTrace.Steps.SpecificStep>();

	public PetrinetTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = petrinetTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof petrinetConfiguration.PlaceConfiguration) {
						petrinetConfiguration.PlaceConfiguration o_cast = (petrinetConfiguration.PlaceConfiguration) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private void addNewObjectToState(petrinetConfiguration.PlaceConfiguration o_cast,
			petrinetTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration traced = (petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field tokens
		petrinetTrace.States.PlaceConfiguration_tokens_Value firstValue_tokens = petrinetTrace.States.StatesFactory.eINSTANCE
				.createPlaceConfiguration_tokens_Value();
		traced.getTokensSequence().add(firstValue_tokens);
		newState.getPlaceConfiguration_tokens_Values().add(firstValue_tokens);
	}

	private petrinetTrace.States.State copyState(petrinetTrace.States.State oldState) {
		petrinetTrace.States.State newState = petrinetTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getPlaceConfiguration_tokens_Values().addAll(oldState.getPlaceConfiguration_tokens_Values());
		return newState;
	}

	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			petrinetTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof petrinetConfiguration.PlaceConfiguration) {
						petrinetConfiguration.PlaceConfiguration o_cast = (petrinetConfiguration.PlaceConfiguration) o;

						if (p.getFeatureID() == petrinetConfiguration.PetrinetConfigurationPackage.eINSTANCE
								.getPlaceConfiguration_Tokens().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration traced = (petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration) exeToTraced
									.get(o);
							petrinetTrace.States.PlaceConfiguration_tokens_Value lastValue = traced.getTokensSequence()
									.get(traced.getTokensSequence().size() - 1);
							newState.getPlaceConfiguration_tokens_Values().remove(lastValue);

							// And we create a proper new value
							petrinetTrace.States.PlaceConfiguration_tokens_Value newValue = petrinetTrace.States.StatesFactory.eINSTANCE
									.createPlaceConfiguration_tokens_Value();
							newValue.setTokens(o_cast.getTokens());
							traced.getTokensSequence().add(newValue);
							newState.getPlaceConfiguration_tokens_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final petrinetTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final petrinetTrace.States.State startingState = lastState;
					final petrinetTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof petrinetTrace.Steps.SpecificStep) {
			step_cast = (petrinetTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			petrinetTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<petrinetTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) {
				petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run petrinetConfiguration_NetConfiguration_RunInstance = (petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) step_cast;
				traceRoot.getPetrinetConfiguration_NetConfiguration_Run_Sequence()
						.add(petrinetConfiguration_NetConfiguration_RunInstance);
			} else if (step_cast instanceof petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire) {
				petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire petrinetConfiguration_TransitionConfiguration_FireInstance = (petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire) step_cast;
				traceRoot.getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
						.add(petrinetConfiguration_TransitionConfiguration_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(petrinetTrace.Steps.SpecificStep currentStep, petrinetTrace.States.State startingState,
			petrinetTrace.States.State endingState) {

		petrinetTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) {
			implicitStep = petrinetTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<petrinetTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = petrinetTrace.PetrinetTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<petrinetTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private void storeAsTracedObject(petrinetConfiguration.PlaceConfiguration o) {
		// First we find the traced object, and we create it if required
		petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = petrinetTrace.States.petrinetConfiguration.PetrinetConfigurationFactory.eINSTANCE
					.createTracedPlaceConfiguration();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getPetrinetConfiguration_tracedPlaceConfigurations().add(tracedObject);
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
