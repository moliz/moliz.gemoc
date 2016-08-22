/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.decorator;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.animation.decorator.internal.ElementState;
import org.modelexecution.xmof.animation.mapping.Match;

/**
 * The DiagramDecorator is capable of manipulating the graphical representation
 * via decorating of diagram elements
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public abstract class DiagramDecorator {
	private boolean activityFinished = false;
	protected Activity activity;
	protected MapDecorator mapDecorator;
	protected ActivityNode activeNode;
	protected ActivityNode previouslyActiveNode;
	protected StructuredActivityNode inStructuredNode = null;
	protected Set<ActivityEdge> activeEdges;
	protected Set<ActivityEdge> previouslyActiveEdges;

	public DiagramDecorator(Activity activity) {
		this.activity = activity;
		mapDecorator = new MapDecorator(activity);
	}

	/**
	 * Decorates activity node in different nodes depending of the status
	 * (traversed or active)
	 * 
	 * @param match
	 *            matched debug event
	 * @return true if node has a xMOFName
	 */
	public boolean decorateActivityElement(Match match) {
		if (isActivityFinished()) {
			resetDiagram();
		}

		activeNode = mapDecorator.getActivityNodeMap().get(match.getXmofElementName());

		decoratePreviouslyActiveNodes();
		decoratePreviouslyActiveEdges();
		decorateActiveNode();
		decorateActiveEdges();

		previouslyActiveNode = activeNode;
		previouslyActiveEdges = activeEdges;
		return activeNode != null;

	}

	private void decorateActiveEdges() {
		activeEdges = mapDecorator.retrieveActiveEdges(activeNode, previouslyActiveNode);
		if (activeEdges != null) {
			for (ActivityEdge edge : activeEdges) {
				decorateElement(edge, ElementState.ACTIVE);
			}

		}
	}

	private void decorateActiveNode() {
		if (activeNode != null) {
			if (activeNode instanceof StructuredActivityNode) {
				inStructuredNode = (StructuredActivityNode) activeNode;
			}
			decorateElement(activeNode, ElementState.ACTIVE);
			if (mapDecorator.getConncetedParameterNodeMap().containsKey(activeNode)) {
				for (ActivityNode node : mapDecorator.getConncetedParameterNodeMap().get(activeNode)) {
					decorateElement(node, ElementState.ACTIVE);
				}
			}
		}
	}

	private void decoratePreviouslyActiveEdges() {
		if (previouslyActiveEdges != null) {
			for (ActivityEdge edge : previouslyActiveEdges) {
				decorateElement(edge, ElementState.TRAVERSED);
			}

		}
	}

	private void decoratePreviouslyActiveNodes() {
		if (previouslyActiveNode != null) {
			if (mapDecorator.getConncetedParameterNodeMap().containsKey(previouslyActiveNode)) {
				for (ActivityNode node : mapDecorator.getConncetedParameterNodeMap().get(previouslyActiveNode)) {
					decorateElement(node, ElementState.TRAVERSED);
				}
			}
			if (!(previouslyActiveNode instanceof StructuredActivityNode)) {
				decorateElement(previouslyActiveNode, ElementState.TRAVERSED);
			}

		}
		if (inStructuredNode != null) {
			if (executionOfStructuredNodeFinished()) {
				previouslyActiveNode = inStructuredNode;
				decorateElement(previouslyActiveNode, ElementState.TRAVERSED);
				inStructuredNode = null;
			}
		}
	}

	private boolean executionOfStructuredNodeFinished() {
		return activeNode == null || activeNode.getInStructuredNode() == null
				|| !activeNode.getInStructuredNode().equals(inStructuredNode);
	}

	private void resetDiagram() {
		resetDecorations();
		setActivityFinished(false);
		activeEdges = null;
		previouslyActiveEdges = null;
		inStructuredNode = null;
		activeNode = null;
		previouslyActiveNode = null;

	}

	protected void resetDecorations() {
		DecoratorService.clear(activity.getName());
		refreshDiagram();
	};

	protected abstract void refreshDiagram();

	protected void decorateElement(EObject element, ElementState state) {
		DecoratorService.addDecoratedElement(activity, element, state);

	}

	public boolean isActivityFinished() {
		return activityFinished;
	}

	public void setActivityFinished(boolean activityFinished) {
		refreshDiagram();
		this.activityFinished = activityFinished;
	}

	public Activity getActivity() {
		return activity;
	}	

}
