package org.modelexecution.xmof.animation.graphiti;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.modelexecution.xmof.animation.controller.AnimationController;
import org.modelexecution.xmof.animation.decorator.DecoratorService;
import org.modelexecution.xmof.animation.decorator.internal.Representation;
import org.modelexecution.xmof.animation.provider.IAnimationProvider;

public class GraphitiAnimationProvider implements IAnimationProvider {

	@Override
	public boolean canAnimateModel(Resource resource) {
		return new ExtensibleURIConverterImpl().exists(resource.getURI(), null);
	}

	@Override
	public AnimationController retrieveController(Resource resource) {
		return new GraphitiAnimationController(resource);
	}

}
