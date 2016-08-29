/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.sirius.controller;

import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.core.mapping.Match;
import org.modelexecution.xmof.animation.sirius.decorator.SiriusDiagramDecorator;
import org.modelexecution.xmof.animation.sirius.handler.SiriusDiagramHandler;

/**
 * Animation controller for Sirius implementation. It extends the Animation
 * Controller.
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @see org.modelexecution.xmof.animation.core.controller.AnimationController
 * @version 1.0
 *
 */
public class SiriusAnimationController extends AnimationController {

	public SiriusAnimationController(Resource resource) {
		super(resource, new SiriusDiagramHandler(resource));
	}

	@Override
	protected void initializeDecorators() {
		for (String activityName : controllerMap.getActivityNames()) {
			controllerMap.addDecorator(activityName,
					new SiriusDiagramDecorator(controllerMap.getActivityByName(activityName), this));
		}

	}

	@Override
	protected void decorateActivityNode(Match match) {
		super.decorateActivityNode(match);
		refresh(activeDecorator);
	}

	public void refresh(DiagramDecorator decorator) {
		((SiriusDiagramHandler) diagramHandler).refreshDiagram(decorator.getActivity().getName());
	}

}
