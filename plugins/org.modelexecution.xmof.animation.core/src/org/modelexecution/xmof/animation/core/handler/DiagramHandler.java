/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.handler;

import org.eclipse.emf.common.util.URI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;

public abstract class DiagramHandler {
	protected URI xmofModelURI;

	public DiagramHandler(URI modelURI) {
		this.xmofModelURI = modelURI;
	}

	public abstract void openOrShowDiagram(Activity activity);

	public abstract void dispose();
}
