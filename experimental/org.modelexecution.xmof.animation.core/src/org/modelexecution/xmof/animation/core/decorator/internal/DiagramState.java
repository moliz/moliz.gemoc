/*******************************************************************************
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.decorator.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.JoinNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.xmof.animation.core.controller.XMOFAnimationUtil;

public class DiagramState {

	private Collection<ActivityNode> allTraversedNodes = new HashSet<>();
	private ActivityNode activeNode;
	private Collection<ActivityEdge> activeEdges = new HashSet<>();
	private Collection<ActivityNode> previouslyActiveNodes = new HashSet<>();
	private Collection<ActivityNode> additionalActiveNodes = new HashSet<>();
	private Collection<ActivityEdge> previouslyActiveEdges = new HashSet<>();

	public DiagramState() {
	}

	public void setActiveNode(ActivityNode newNode) {
		if (activeNode != null) {
			previouslyActiveNodes.clear();
			previouslyActiveNodes.add(activeNode);
			previouslyActiveNodes.addAll(additionalActiveNodes);
			allTraversedNodes.addAll(previouslyActiveNodes);
			previouslyActiveEdges.clear();
			previouslyActiveEdges.addAll(activeEdges);
		}

		activeNode = newNode;
		if (activeNode != null) {
			additionalActiveNodes.clear();
			activeEdges.clear();
			getIncomingEdges();
			postProcessElements();
		}

	}

	private void postProcessElements() {
		Set<ActivityEdge> edgesToRemove = new HashSet<>();
		Set<ActivityEdge> edgesToAdd = new HashSet<>();
		for (ActivityEdge edge : activeEdges) {
			if (edge.getSource() instanceof ForkNode | edge.getSource() instanceof ExpansionNode
					|| edge.getSource() instanceof ActivityParameterNode) {
				additionalActiveNodes.add(edge.getSource());
			} else if (shouldNotBeActive(edge)) {
				edgesToRemove.add(edge);
				continue;
			}
			if (edge.getSource() instanceof ExpansionNode) {
				edgesToAdd.addAll(edge.getSource().getIncoming());
			}
			if (edge.getTarget() instanceof ActivityParameterNode) {
				edgesToAdd.add(edge);
				additionalActiveNodes.add(edge.getTarget());

			}

		}

		activeEdges.removeAll(edgesToRemove);
		activeEdges.addAll(edgesToAdd);
		if (activeNode instanceof Action) {
			for (OutputPin pin : ((Action) activeNode).getOutput()) {
				processOutgoingEdges(pin.getOutgoing());
			}
		}

		if (activeNode instanceof ExpansionNode) {
			processOutgoingEdges(activeNode.getOutgoing());

		}

	}

	private void processOutgoingEdges(EList<ActivityEdge> outgoing) {
		for (ActivityEdge outEdge : outgoing) {
			if (outEdge.getTarget() instanceof ActivityParameterNode) {
				activeEdges.add(outEdge);
				additionalActiveNodes.add(outEdge.getTarget());
			}
		}

	}

	private void getIncomingEdges() {
		if (activeNode != null) {
			if (activeNode.getIncoming() != null) {
				activeEdges.addAll(activeNode.getIncoming());
			}
			if (activeNode instanceof Action) {
				for (InputPin pin : ((Action) activeNode).getInput()) {
					activeEdges.addAll(pin.getIncoming());
				}
			}
			if (activeNode instanceof ExpansionRegion) {
				for (ExpansionNode exNode : ((ExpansionRegion) activeNode).getInputElement()) {
					activeEdges.addAll(exNode.getIncoming());
				}
			}

		}
	}

	private boolean shouldNotBeActive(ActivityEdge edge) {
		if (activeNode instanceof MergeNode || activeNode instanceof JoinNode) {
			return !allTraversedNodes.contains(XMOFAnimationUtil.retreiveSourceNode(edge));
		}
		return false;
	}

	public Set<ActivityNode> getActiveNodes() {
		Set<ActivityNode> nodes = new HashSet<ActivityNode>();
		nodes.add(activeNode);
		nodes.addAll(additionalActiveNodes);
		return nodes;
	}

	public Collection<ActivityEdge> getActiveEdges() {
		return activeEdges;
	}

	public Collection<ActivityNode> getAllTraversedNodes() {
		return allTraversedNodes;
	}

	public Collection<ActivityNode> getPreviouslyActiveNodes() {
		return previouslyActiveNodes;
	}

	public Collection<ActivityEdge> getPreviouslyActiveEdges() {
		return previouslyActiveEdges;
	}

}
