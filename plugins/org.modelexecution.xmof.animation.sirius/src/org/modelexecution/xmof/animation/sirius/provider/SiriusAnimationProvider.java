package org.modelexecution.xmof.animation.sirius.provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
import org.modelexecution.xmof.animation.sirius.controller.SiriusAnimationController;

public class SiriusAnimationProvider implements IAnimationProvider {
	private static String SIRIUS_SPECIFICATION_FILE = "representations.aird";

	@Override
	public boolean canAnimateModel(Resource resource) {
		// Check if a representations aird file exists in the project root
		// folder
		URI siriusURI = URI.createURI("platform:/" + resource.getURI().segment(0) + "/" + resource.getURI().segment(1)
				+ "/" + SIRIUS_SPECIFICATION_FILE);
		return new ExtensibleURIConverterImpl().exists(siriusURI, null);
	}

	@Override
	public AnimationController retrieveController(Resource resource) {
		return new SiriusAnimationController(resource);
	}

	@Override
	public String getName() {
		return "Sirius Animation Provider";
	}

}
