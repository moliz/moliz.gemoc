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
