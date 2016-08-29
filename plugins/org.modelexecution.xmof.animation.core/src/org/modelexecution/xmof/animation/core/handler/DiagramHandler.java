/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.handler;

import org.eclipse.emf.ecore.resource.Resource;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;

public abstract class DiagramHandler {
	protected Resource modelResource;

	public DiagramHandler(Resource resource) {
		this.modelResource = resource;
	}

	public abstract void openOrShowDiagram(Activity activity);

	public abstract void dispose();
}