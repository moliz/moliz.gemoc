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

package org.modelexecution.xmof.animation.sirius.provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
import org.modelexecution.xmof.animation.sirius.controller.SiriusAnimationController;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public class SiriusAnimationProvider implements IAnimationProvider {
	private static String SIRIUS_SPECIFICATION_FILE = "representations.aird";

	@Override
	public boolean canAnimateModel(URI modelUri) {
		// Check if a representations aird file exists in the project root
		// folder
		URI siriusURI = URI.createURI(
				"platform:/" + modelUri.segment(0) + "/" + modelUri.segment(1) + "/" + SIRIUS_SPECIFICATION_FILE);
		return new ExtensibleURIConverterImpl().exists(siriusURI, null);
	}

	@Override
	public AnimationController createController(URI modelUri, XMOFBasedModel model) {
		return new SiriusAnimationController(modelUri, model);
	}

	@Override
	public String getName() {
		return "Sirius Animation Provider";
	}

}
