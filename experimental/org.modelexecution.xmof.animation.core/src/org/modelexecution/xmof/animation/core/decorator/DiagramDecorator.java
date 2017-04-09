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
package org.modelexecution.xmof.animation.core.decorator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.animation.core.decorator.internal.DiagramState;
import org.modelexecution.xmof.animation.core.decorator.internal.ElementState;

public abstract class DiagramDecorator {
	protected boolean activityFinished = false;
	protected Activity activity;
	protected DiagramState diagramState;
	protected Map<String, ActivityNode> activityNodeMap;

	public DiagramDecorator(Activity activity) {
		this.activity = activity;
		diagramState = new DiagramState();

	}

	public void initializeMaps() {
		activityNodeMap = new HashMap<>();
		for (ActivityNode node : activity.getNode()) {
			addAllNodes(node);
		}
	}

	private void addAllNodes(ActivityNode node) {
		activityNodeMap.put(node.getName(), node);
		if (node instanceof StructuredActivityNode) {
			for (ActivityNode subNode : ((StructuredActivityNode) node).getNode()) {
				addAllNodes(subNode);
			}
		}
	}

	/**
	 * Decorates activity node in different nodes depending of the status
	 * (traversed or active)
	 * 
	 * @return true if node has a xMOFName
	 */
	public boolean decorateActivityElement(String activityNodeName) {

		if (activityNodeMap == null) {
			initializeMaps();
		}
		if (isActivityFinished()) {
			resetDiagram();
		}

		ActivityNode activeNode = activityNodeMap.get(activityNodeName);
		diagramState.setActiveNode(activeNode);
		decoratePreviouslyActiveElements();
		if (activeNode == null)
			return false;
		decorateActiveElements();

		return true;

	}

	private void decorateActiveElements() {
		for (ActivityNode node : diagramState.getActiveNodes()) {
			if (!(node instanceof StructuredActivityNode)) {
				decorateElement(node, ElementState.ACTIVE);
			}
		}
		for (ActivityEdge edge : diagramState.getActiveEdges()) {
			decorateElement(edge, ElementState.ACTIVE);
		}

	}

	private void decoratePreviouslyActiveElements() {
		for (ActivityNode node : diagramState.getPreviouslyActiveNodes()) {
			if (!(node instanceof StructuredActivityNode)) {
				decorateElement(node, ElementState.TRAVERSED);
			}
		}
		for (ActivityEdge edge : diagramState.getPreviouslyActiveEdges()) {
			decorateElement(edge, ElementState.TRAVERSED);
		}

	}

	private void resetDiagram() {
		resetDecorations();
		setActivityFinished(false);
		diagramState = new DiagramState();

	}

	protected void resetDecorations() {
		DecoratorService.clear(activity);
		refreshDiagram();
	};

	public abstract void refreshDiagram();

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
