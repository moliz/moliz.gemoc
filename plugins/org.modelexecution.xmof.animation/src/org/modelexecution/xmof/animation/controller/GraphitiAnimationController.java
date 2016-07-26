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

import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.decorator.GraphitiDiagramDecorator;
import org.modelexecution.xmof.animation.handler.GraphitiDiagramHandler;
import org.modelexecution.xmof.vm.XMOFBasedModel;

/**
 * Animation controller for Graphiti implementation. It extends the Animation Controller.
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @see org.modelexecution.xmof.animation.controller.AnimationController
 * @version 1.0
 *
 */
public class GraphitiAnimationController extends AnimationController {

	public GraphitiAnimationController(XMOFBasedModel model, Resource modelResource) {
		super(model, new GraphitiDiagramHandler(modelResource));
	}

	@Override
	protected void initializeDecorators() {
		diagramDecoratorMap = new HashMap<>();
		for (Activity activity : getModelProcessor().getActivities()) {
			diagramDecoratorMap.put(activity.getName(), new GraphitiDiagramDecorator(activity,
					((GraphitiDiagramHandler) diagramHandler).getKernelEditor()));
		}
	}

	
}
