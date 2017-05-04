package org.modelexecution.xmof.examples.fsm.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.State;
import fr.inria.diverse.trace.gemoc.api.IStateManager;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.commons.model.trace.TracedObject;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class FsmConfigurationTraceEngineAddon extends AbstractTraceAddon {

	private FsmConfigurationTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		return new FsmConfigurationTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public IStateManager<State<?, ?>> constructStateManager(Resource modelResource,
			Map<TracedObject<?>, EObject> tracedToExe) {
		return new FsmConfigurationTraceStateManager(modelResource, tracedToExe);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new FsmConfigurationTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof fsmConfigurationTrace.SpecificTrace;
	}

}