package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class FumlConfigurationTraceEngineAddon extends AbstractTraceAddon {

	private FumlConfigurationTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new FumlConfigurationTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer loadTrace(Resource traceResource) {
		FumlConfigurationTraceExplorer explorer = new FumlConfigurationTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof fumlConfigurationTrace.SpecificTrace) {
			explorer.loadTrace((fumlConfigurationTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer loadTrace(Resource modelResource, Resource traceResource, Map<EObject, EObject> tracedToExe) {
		FumlConfigurationTraceExplorer explorer = new FumlConfigurationTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof fumlConfigurationTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (fumlConfigurationTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new FumlConfigurationTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof fumlConfigurationTrace.SpecificTrace;
	}

}