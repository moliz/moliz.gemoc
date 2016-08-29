package org.modelexecution.xmof.animation.graphiti.provider;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
import org.modelexecution.xmof.animation.graphiti.controller.GraphitiAnimationController;

public class GraphitiAnimationProvider implements IAnimationProvider {

	@Override
	public boolean canAnimateModel(Resource resource) {
		return new ExtensibleURIConverterImpl().exists(resource.getURI(), null);
	}

	@Override
	public AnimationController retrieveController(Resource resource) {
		return new GraphitiAnimationController(resource);
	}

	@Override
	public String getName() {
		return "Graphiti Animation Provider";
	}

}
