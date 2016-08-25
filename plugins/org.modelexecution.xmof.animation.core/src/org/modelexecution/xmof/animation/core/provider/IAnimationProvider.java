package org.modelexecution.xmof.animation.core.provider;

import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.animation.core.controller.AnimationController;

public interface IAnimationProvider {

	/**
	 * Validates if the concrete animation provider is capable of animating the given model resource.
	 * e.g. all files needed for representation do exist
	 * @param resource
	 * @return
	 */
	public boolean canAnimateModel(Resource resource);
	
	public AnimationController retrieveController(Resource resource);
	
	public String getName();
}
