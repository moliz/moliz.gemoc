package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class PetrinetTraceEngineAddon extends AbstractTraceAddon {

	private PetrinetTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new PetrinetTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		PetrinetTraceExplorer explorer = new PetrinetTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof petrinetTrace.SpecificTrace) {
			explorer.loadTrace((petrinetTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		PetrinetTraceExplorer explorer = new PetrinetTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof petrinetTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (petrinetTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new PetrinetTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof petrinetTrace.SpecificTrace;
	}

}