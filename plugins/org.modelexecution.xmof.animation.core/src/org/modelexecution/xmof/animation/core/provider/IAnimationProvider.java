package org.modelexecution.xmof.animation.core.provider;

import org.eclipse.emf.common.util.URI;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public interface IAnimationProvider {

	/**
	 * Validates if the concrete animation provider is capable of animating the
	 * given model resource. e.g. all files needed for representation do exist
	 * 
	 * @param xmofModelURI
	 * @return
	 */
	public boolean canAnimateModel(URI xmofModelURI);

	public AnimationController createController(URI xmofModelURI, XMOFBasedModel model);

	public String getName();
}
