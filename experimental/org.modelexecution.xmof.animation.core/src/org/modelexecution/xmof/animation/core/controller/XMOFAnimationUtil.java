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
package org.modelexecution.xmof.animation.core.controller;

import org.eclipse.emf.ecore.ENamedElement;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectNode;

public class XMOFAnimationUtil {
	private XMOFAnimationUtil() {
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

	public static ActivityNode retrieveConnectedNode(Pin pin) {
		if (pin.eContainer() instanceof ActivityNode) {
			return (ActivityNode) pin.eContainer();
		}

		return null;
	}

	public static String toEdgeID(ActivityEdge edge) {
		ActivityNode source = XMOFAnimationUtil.retreiveSourceNode(edge);
		ActivityNode target = XMOFAnimationUtil.retreiveTargetNode(edge);
		if (source != null && target != null) {
			return toEdgeID(source.getName(), target.getName());
		}
		return null;
	}

	public static String toEdgeID(String sourceNodeName, String targetNodeName) {
		return String.format("[%s | %s]", sourceNodeName, targetNodeName);
	}

	public static String toActivityID(Activity activity) {
		String container = "";
		if (activity.eContainer() != null && activity.eContainer() instanceof ENamedElement) {
			container = ((ENamedElement) activity.eContainer()).getName();
		}
		return String.format("[%s_%s]", container, activity.getName());
	}

	public static Activity getActivity(ActivityNode node) {
		ActivityNode parentNode = node;
		while (parentNode.getInStructuredNode() != null) {
			parentNode = parentNode.getInStructuredNode();
		}
		if (parentNode.getActivity() != null) {
			return parentNode.getActivity();
		}

		return null;
	}

	public static Activity getActivity(ActivityEdge edge) {
		if (edge.getActivity() != null) {
			return edge.getActivity();
		}
		ActivityNode parentNode = edge.getInStructuredNode();
		while (parentNode.getInStructuredNode() != null) {
			parentNode = parentNode.getInStructuredNode();
		}
		if (parentNode.getActivity() != null) {
			return parentNode.getActivity();
		}

		return null;
	}
}
