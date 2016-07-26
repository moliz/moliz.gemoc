/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.handler;

import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;

public  abstract class DiagramHandler {
	public abstract void openOrShowDiagram(Activity activity);
	public abstract void dispose();
}
