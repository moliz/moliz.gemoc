package org.modelexecution.xmof.examples.iml.sequential.sequentialiml.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class ImlTraceEngineAddon extends AbstractTraceAddon {

	private ImlTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new ImlTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		ImlTraceExplorer explorer = new ImlTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof imlTrace.SpecificTrace) {
			explorer.loadTrace((imlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		ImlTraceExplorer explorer = new ImlTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof imlTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (imlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new ImlTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof imlTrace.SpecificTrace;
	}

}