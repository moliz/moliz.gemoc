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
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.animation.decorator.internal.DiagramUtil;
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
	protected DecoratorMap decoratorMap;
	protected ActivityNode activeNode;
	protected ActivityNode previouslyActiveNode;
	protected StructuredActivityNode inStructuredNode = null;
	protected Set<ActivityEdge> activeEdges;
	protected Set<ActivityEdge> previouslyActiveEdges;

	public DiagramDecorator(Activity activity) {
		this.activity = activity;
	}

	public void initializeMaps() {
		decoratorMap = new DecoratorMap(activity);
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
		if (decoratorMap == null) {
			initializeMaps();
		}
		if (isActivityFinished()) {
			resetDiagram();
		}

		activeNode = decoratorMap.getActivityNode(match.getXmofElementName());

		decoratePreviouslyActiveNodes();
		decoratePreviouslyActiveEdges();
		decorateActiveNode();
		decorateActiveEdges();

		previouslyActiveNode = activeNode;
		previouslyActiveEdges = activeEdges;
		return activeNode != null;

	}

	private void decorateActiveEdges() {
		activeEdges = decoratorMap.retrieveActiveEdges(activeNode, previouslyActiveNode);
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
			for (ActivityNode node : decoratorMap.retrieveAllConnectedNodes(activeNode)) {
				decorateElement(node, ElementState.ACTIVE);
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
			for (ActivityNode node: decoratorMap.retrieveAllConnectedNodes(previouslyActiveNode)){
				if (!(previouslyActiveNode instanceof StructuredActivityNode)) {
					decorateElement(node, ElementState.TRAVERSED);
				}
			}
			
		}
		if (inStructuredNode != null) {
			if (executionOfStructuredNodeFinished()) {
				decorateLastEdgeOfExpansionRegion();
				previouslyActiveNode = inStructuredNode;
				for (ActivityNode node: decoratorMap.retrieveAllConnectedNodes(previouslyActiveNode)){
					decorateElement(node, ElementState.TRAVERSED);
				}
				
				
				inStructuredNode = null;
			}
		}
	}
	
	private void decorateLastEdgeOfExpansionRegion() {
		if(previouslyActiveNode==null || previouslyActiveNode.getOutgoing().isEmpty()) return;
		for(ActivityEdge edge: previouslyActiveNode.getOutgoing()) {
			ActivityNode target = DiagramUtil.retreiveTargetNode(edge);
			if(target instanceof ExpansionRegion) {
				decorateElement(edge, ElementState.TRAVERSED);
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
