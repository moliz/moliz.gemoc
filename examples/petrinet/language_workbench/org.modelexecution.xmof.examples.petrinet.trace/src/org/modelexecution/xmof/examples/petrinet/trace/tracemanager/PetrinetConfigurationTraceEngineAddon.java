package org.modelexecution.xmof.examples.petrinet.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class PetrinetConfigurationTraceEngineAddon extends AbstractTraceAddon {

	private PetrinetConfigurationTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new PetrinetConfigurationTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		PetrinetConfigurationTraceExplorer explorer = new PetrinetConfigurationTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof petrinetConfigurationTrace.SpecificTrace) {
			explorer.loadTrace((petrinetConfigurationTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		PetrinetConfigurationTraceExplorer explorer = new PetrinetConfigurationTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof petrinetConfigurationTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (petrinetConfigurationTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		PetrinetConfigurationTraceExtractor extractor = new PetrinetConfigurationTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof petrinetConfigurationTrace.SpecificTrace) {
			extractor.loadTrace((petrinetConfigurationTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new PetrinetConfigurationTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof petrinetConfigurationTrace.SpecificTrace;
	}

}