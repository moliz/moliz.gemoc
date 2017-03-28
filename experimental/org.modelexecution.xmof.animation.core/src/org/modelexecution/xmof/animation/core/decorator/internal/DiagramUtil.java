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
package org.modelexecution.xmof.animation.core.decorator.internal;

import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectNode;

public class DiagramUtil {
	private DiagramUtil() {
	}

	public static ActivityNode retreiveSourceNode(ActivityEdge edge) {
		ActivityNode source = null;
		if (edge instanceof ControlFlow) {
			source = edge.getSource();
		} else if (edge instanceof ObjectFlow) {
			source = retrieveConnectedNode(edge.getSource());
		}
		return source;
	}

	public static ActivityNode retreiveTargetNode(ActivityEdge edge) {
		ActivityNode target = null;
		if (edge instanceof ControlFlow) {
			target = edge.getTarget();
		} else if (edge instanceof ObjectFlow) {
			target = retrieveConnectedNode(edge.getTarget());
		}
		return target;
	}

	private static ActivityNode retrieveConnectedNode(ActivityNode node) {
		if (node instanceof ObjectNode) {
			if (node instanceof Pin) {
				return retrieveConnectedNode((Pin) node);
			} else if (node instanceof ExpansionNode) {
				return retrieveConnectedNode((ExpansionNode) node);
			} else if (node instanceof ActivityParameterNode) {
				return node;
			}
		}
		return node;

	}

	private static ActivityNode retrieveConnectedNode(ExpansionNode expansionNode) {
		if (expansionNode.getRegionAsInput() != null) {
			return expansionNode.getRegionAsInput();
		} else
			return expansionNode.getRegionAsOutput();
	}

	private static ActivityNode retrieveConnectedNode(Pin pin) {
		if (pin.eContainer() instanceof ActivityNode) {
			return (ActivityNode) pin.eContainer();
		}

		return null;
	}

	public static String toEdgeID(ActivityEdge edge) {
		ActivityNode source = DiagramUtil.retreiveSourceNode(edge);
		ActivityNode target = DiagramUtil.retreiveTargetNode(edge);
		if (source != null && target != null) {
			return toEdgeID(source.getName(), target.getName());
		}
		return null;
	}

	public static String toEdgeID(String sourceNodeName, String targetNodeName) {
		return String.format("[%s | %s]", sourceNodeName, targetNodeName);
	}
}
