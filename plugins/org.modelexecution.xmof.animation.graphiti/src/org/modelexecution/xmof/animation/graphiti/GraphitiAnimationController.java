/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.graphiti;

import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.controller.AnimationController;

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

	public GraphitiAnimationController(Resource modelResource) {
		super(modelResource, new GraphitiDiagramHandler(modelResource));
	}

	@Override
	protected void initializeDecorators() {
		for (Activity activity : controllerMap.getActivities()) {
			controllerMap.addDecorator(activity.getName(), new GraphitiDiagramDecorator(activity,
					((GraphitiDiagramHandler) diagramHandler).getKernelEditor()));
		}
	}

	
}
