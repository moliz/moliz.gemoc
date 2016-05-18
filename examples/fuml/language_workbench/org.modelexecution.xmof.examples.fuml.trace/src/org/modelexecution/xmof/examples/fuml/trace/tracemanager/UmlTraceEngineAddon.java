package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class UmlTraceEngineAddon extends AbstractTraceAddon {

	private UmlTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new UmlTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		UmlTraceExplorer explorer = new UmlTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof umlTrace.SpecificTrace) {
			explorer.loadTrace((umlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		UmlTraceExplorer explorer = new UmlTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof umlTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (umlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new UmlTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof umlTrace.SpecificTrace;
	}

}