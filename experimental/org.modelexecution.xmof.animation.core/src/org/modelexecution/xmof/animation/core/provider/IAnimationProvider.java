/*******************************************************************************
 * Copyright (c) 2016 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.provider;

import org.eclipse.emf.common.util.URI;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public interface IAnimationProvider {

	/**
	 * Validates if the concrete animation provider is capable of animating the
	 * given model resource. e.g. all files needed for the graphical representation do exist
	 * 
	 * @param xmofModelURI
	 * @return
	 */
	public boolean canAnimateModel(URI xmofModelURI);


	public AnimationController createController(URI xmofModelURI, XMOFBasedModel model);


	public String getName();
}
