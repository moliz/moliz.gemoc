package org.modelexecution.xmof.animation.graphiti.provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
import org.modelexecution.xmof.animation.graphiti.controller.GraphitiAnimationController;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public class GraphitiAnimationProvider implements IAnimationProvider {

	@Override
	public boolean canAnimateModel(URI modelURI) {
		return new ExtensibleURIConverterImpl().exists(modelURI, null);
	}

	@Override
	public AnimationController createController(URI modelURI, XMOFBasedModel model) {
		return new GraphitiAnimationController(modelURI, model);
	}

	@Override
	public String getName() {
		return "Graphiti Animation Provider";
	}

}
