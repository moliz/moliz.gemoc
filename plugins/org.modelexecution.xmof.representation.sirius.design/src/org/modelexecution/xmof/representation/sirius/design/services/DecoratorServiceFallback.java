/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.representation.sirius.design.services;

import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
/**
 *  Fallback for service-methods provided by the xmof.animation plugin. Enables the isolated use of this Sirius specification
 *  project
 *  @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 *
 */
public class DecoratorServiceFallback {
	public static boolean isActiveNode(ActivityNode node) {
		return false;
	}
	
	public static boolean isTraversedNode(ActivityNode node){
		return false;
	}
	public static boolean isActiveEdge(ActivityEdge edge){
		return false;
	}
	
	public static boolean isTraversedEdge(ActivityEdge edge){
		return false;
	}
}
