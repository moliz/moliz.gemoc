package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.Collection;
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

public class PetrinetConfigurationTraceConstructor implements ITraceConstructor {
	private petrinetConfigurationTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private petrinetConfigurationTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<petrinetConfigurationTrace.Steps.SpecificStep> context = new LinkedList<petrinetConfigurationTrace.Steps.SpecificStep>();

	public PetrinetConfigurationTraceConstructor(Resource exeModel, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = petrinetConfigurationTrace.States.StatesFactory.eINSTANCE.createState();
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

	private boolean addNewObjectToState(petrinetConfiguration.PlaceConfiguration o_cast,
			petrinetConfigurationTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration tracedObject = petrinetConfigurationTrace.States.petrinetConfiguration.PetrinetConfigurationFactory.eINSTANCE
					.createTracedPlaceConfiguration();
			tracedObject.setOriginalObject((petrinetConfiguration.PlaceConfiguration) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getPetrinetConfiguration_tracedPlaceConfigurations().add(tracedObject);

			// Creation of the first value of the field tokens
			petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value firstValue_tokens = petrinetConfigurationTrace.States.StatesFactory.eINSTANCE
					.createPlaceConfiguration_tokens_Value();

			firstValue_tokens.setTokens((int) o_cast.getTokens());
			tracedObject.getTokensSequence().add(firstValue_tokens);
			newState.getPlaceConfiguration_tokens_Values().add(firstValue_tokens);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private petrinetConfigurationTrace.States.State copyState(petrinetConfigurationTrace.States.State oldState) {
		petrinetConfigurationTrace.States.State newState = petrinetConfigurationTrace.States.StatesFactory.eINSTANCE
				.createState();
		newState.getPlaceConfiguration_tokens_Values().addAll(oldState.getPlaceConfiguration_tokens_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			petrinetConfigurationTrace.States.State newState = copyState(lastState);
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
							petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration traced = (petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration) exeToTraced
									.get(o);
							petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value lastValue = traced
									.getTokensSequence().get(traced.getTokensSequence().size() - 1);
							newState.getPlaceConfiguration_tokens_Values().remove(lastValue);

							// And we create a proper new value
							petrinetConfigurationTrace.States.PlaceConfiguration_tokens_Value newValue = petrinetConfigurationTrace.States.StatesFactory.eINSTANCE
									.createPlaceConfiguration_tokens_Value();

							int value = o_cast.getTokens();

							newValue.setTokens((int) value);

							traced.getTokensSequence().add(newValue);
							newState.getPlaceConfiguration_tokens_Values().add(newValue);
						}
					}
				}
			}
			if (stateChanged) {
				final petrinetConfigurationTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final petrinetConfigurationTrace.States.State startingState = lastState;
					final petrinetConfigurationTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getPlaceConfiguration_tokens_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetConfigurationTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof petrinetConfigurationTrace.Steps.SpecificStep) {
			step_cast = (petrinetConfigurationTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			petrinetConfigurationTrace.States.State state = traceRoot.getStatesTrace()
					.get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps()
						.add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main) {
				petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main petrinetConfiguration_NetConfiguration_MainInstance = (petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main) step_cast;
				traceRoot.getPetrinetConfiguration_NetConfiguration_Main_Sequence()
						.add(petrinetConfiguration_NetConfiguration_MainInstance);
			} else
				if (step_cast instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) {
				petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run petrinetConfiguration_NetConfiguration_RunInstance = (petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) step_cast;
				traceRoot.getPetrinetConfiguration_NetConfiguration_Run_Sequence()
						.add(petrinetConfiguration_NetConfiguration_RunInstance);
			} else if (step_cast instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire) {
				petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire petrinetConfiguration_TransitionConfiguration_FireInstance = (petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire) step_cast;
				traceRoot.getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
						.add(petrinetConfiguration_TransitionConfiguration_FireInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(petrinetConfigurationTrace.Steps.SpecificStep currentStep,
			petrinetConfigurationTrace.States.State startingState,
			petrinetConfigurationTrace.States.State endingState) {

		petrinetConfigurationTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main) {
			implicitStep = petrinetConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_NetConfiguration_Main_ImplicitStep();
		} else if (currentStep instanceof petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run) {
			implicitStep = petrinetConfigurationTrace.Steps.StepsFactory.eINSTANCE
					.createPetrinetConfiguration_NetConfiguration_Run_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep>) currentStep).getSubSteps()
					.add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		petrinetConfigurationTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = petrinetConfigurationTrace.PetrinetConfigurationTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<petrinetConfigurationTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
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

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
