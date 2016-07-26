/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.controller;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.modelexecution.xmof.animation.decorator.SiriusDiagramDecorator;
import org.modelexecution.xmof.animation.handler.SiriusDiagramHandler;
import org.modelexecution.xmof.animation.mapping.Match;
import org.modelexecution.xmof.vm.XMOFBasedModel;

/**
 * Animation controller for Sirius implementation. It extends the Animation Controller.
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @see org.modelexecution.xmof.animation.controller.AnimationController
 * @version 1.0
 *
 */
public class SiriusAnimationController extends AnimationController {

	public SiriusAnimationController(XMOFBasedModel model, URI airdURI) {
		super(model, new SiriusDiagramHandler(airdURI));
	}

	@Override
	protected void initializeDecorators() {
		diagramDecoratorMap = new HashMap<>();
		for (String activityName : getModelProcessor().getActivityNames()) {
			diagramDecoratorMap.put(activityName,
					new SiriusDiagramDecorator(getModelProcessor().getActivityByName(activityName), this));
		}

	}


	@Override
	protected void decorateActivityNode(Match match) {
		super.decorateActivityNode(match);
		refresh();
	}

	

	public void refresh() {
		((SiriusDiagramHandler) diagramHandler).refreshDiagram(activeDecorator.getActivity().getName());
	}

}
