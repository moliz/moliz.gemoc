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
package org.modelexecution.xmof.animation.sirius.controller;

import org.eclipse.emf.common.util.URI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.sirius.decorator.SiriusDiagramDecorator;
import org.modelexecution.xmof.animation.sirius.handler.SiriusDiagramHandler;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public class SiriusAnimationController extends AnimationController {

	public SiriusAnimationController(URI modelURI, XMOFBasedModel model) {
		super(model, new SiriusDiagramHandler(modelURI));
	}

	@Override
	protected void initializeDecorators() {
		for (Activity activity : controllerMap.getActivities()) {
			controllerMap.addDecorator(activity,
					new SiriusDiagramDecorator(activity, this));
		}

	}

	@Override
	protected void decorateActivityNode(String nodeName) {
		super.decorateActivityNode(nodeName);
		refresh(activeDecorator);
	}

	public void refresh(DiagramDecorator decorator) {
		((SiriusDiagramHandler) diagramHandler).refreshDiagram(decorator.getActivity().getName());
	}

}
