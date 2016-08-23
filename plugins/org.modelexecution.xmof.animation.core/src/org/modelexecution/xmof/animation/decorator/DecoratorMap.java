package org.modelexecution.xmof.animation.decorator;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.animation.decorator.internal.DiagramUtil;
import org.modelexecution.xmof.animation.decorator.internal.EdgeID;

public class DecoratorMap {

	private Map<String, ActivityNode> activityNodeMap;
	private Map<EdgeID, Set<ActivityEdge>> activityEdgeMap;
	private Map<ActivityNode, Set<ActivityParameterNode>> conncetedParameterNodeMap;
	private Set<ActivityNode> entryPointNodes;

	public DecoratorMap(Activity activity) {
		activityNodeMap = new HashMap<>();
		activityEdgeMap = new HashMap<>();
		conncetedParameterNodeMap = new HashMap<>();
		entryPointNodes = new HashSet<>();
		for (ActivityNode node : activity.getNode()) {
			processActivityNode(node);
		}
		for (ActivityEdge edge : activity.getEdge()) {
			processActivityEdge(edge);
		}

	}

	public Set<ActivityEdge> retrieveActiveEdges(ActivityNode activeNode, ActivityNode previouslyActiveNode) {

		if (activeNode == null)
			return null;
		Set<ActivityEdge> edges = new HashSet<>();
		if (conncetedParameterNodeMap.containsKey(activeNode)) {
			edges.addAll(retrieveEdges(activeNode, conncetedParameterNodeMap.get(activeNode)));
		}
		if (previouslyActiveNode != null) {
			EdgeID id = new EdgeID(previouslyActiveNode.getName(), activeNode.getName());
			if (activityEdgeMap.containsKey(id)) {
				edges.addAll(activityEdgeMap.get(id));
			}
			for (ActivityNode entryPoint : entryPointNodes) {
				id = new EdgeID(entryPoint.getName(), activeNode.getName());
				if (activityEdgeMap.containsKey(id)) {
					edges.addAll(activityEdgeMap.get(id));
				}

			}
		}

		return edges;

	}

	/**
	 * Determines source and target nodes of a edge and puts the result in the
	 * edge map
	 * 
	 * @param edge
	 *            Edge of an activity diagram
	 */
	private void processActivityEdge(ActivityEdge edge) {
		ActivityNode source = DiagramUtil.retreiveSourceNode(edge);
		ActivityNode target = DiagramUtil.retreiveTargetNode(edge);

		if (source != null && target != null) {
			addToEdgeMap(edge, source, target);
		}

		if (source instanceof ActivityParameterNode) {
			addToConnectedParameterNodeMap(target, (ActivityParameterNode) source);
		} else if (target instanceof ActivityParameterNode) {
			addToConnectedParameterNodeMap(source, (ActivityParameterNode) target);
		}

	}

	private void addToEdgeMap(ActivityEdge edge, ActivityNode source, ActivityNode target) {
		EdgeID id = new EdgeID(source.getName(), target.getName());
		Set<ActivityEdge> edges = activityEdgeMap.get(id);
		if (edges == null) {
			edges = new HashSet<>();
		}
		edges.add(edge);
		activityEdgeMap.put(id, edges);
	}

	private void addToConnectedParameterNodeMap(ActivityNode key, ActivityParameterNode paramteterNode) {
		Set<ActivityParameterNode> paramNodes = conncetedParameterNodeMap.get(key);
		if (paramNodes == null) {
			paramNodes = new HashSet<>();
		}
		paramNodes.add(paramteterNode);
		conncetedParameterNodeMap.put(key, paramNodes);
	}

	private void getActivityEdges(StructuredActivityNode node) {
		for (ActivityEdge edge : node.getEdge()) {
			processActivityEdge(edge);
		}

	}

	private void getActivityNodes(StructuredActivityNode expNode) {
		for (ActivityNode actNode : expNode.getNode()) {
			processActivityNode(actNode);
		}

	}

	/**
	 * Determines nodes that are linked with the node
	 * 
	 * @param node
	 *            Node of an activity diagram
	 */
	private void processActivityNode(ActivityNode node) {
		if (node.getName() != null) {
			checkForEntryNodes(node);

			if (node instanceof StructuredActivityNode) {

				getActivityNodes((StructuredActivityNode) node);
				getActivityEdges((StructuredActivityNode) node);
			}
			activityNodeMap.put(node.getName(), node);
		}
	}

	private void checkForEntryNodes(ActivityNode node) {
		if (node instanceof ActivityParameterNode) {
			addTargetsToEntryPoints((ActivityParameterNode) node);
		} else if (isEntryOrForkNode(node)) {
			entryPointNodes.add(node);
		}

	}

	private void addTargetsToEntryPoints(ActivityParameterNode paramNode) {
		for (ActivityEdge edge : paramNode.getOutgoing()) {
			ActivityNode node = DiagramUtil.retreiveTargetNode(edge);
			if (node != null) {
				entryPointNodes.add(node);
			}
		}

	}

	private boolean isEntryOrForkNode(ActivityNode node) {
		if (node instanceof ForkNode) {
			return true;
		}
		if (hasNoInputEdges(node)) {
			return true;
		}
		return false;
	}

	private boolean hasNoInputEdges(ActivityNode node) {
		if (node.getIncoming().isEmpty()) {
			if (node instanceof ExpansionRegion) {
				ExpansionRegion region = (ExpansionRegion) node;
				for (ExpansionNode expansionNode : region.getInputElement()) {
					if (!expansionNode.getIncoming().isEmpty()) {
						return false;
					}
				}
			}
			if (node instanceof Action) {
				Action action = (Action) node;
				for (InputPin pin : action.getInput()) {
					if (!pin.getIncoming().isEmpty()) {
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	private Set<ActivityEdge> retrieveEdges(ActivityNode activityNode, Set<ActivityParameterNode> parameterNodes) {
		Set<ActivityEdge> edges = new HashSet<>();
		for (ActivityParameterNode paramNode : parameterNodes) {
			edges.addAll(extractEdge(activityNode, paramNode));
		}
		return edges;
	}

	private Set<ActivityEdge> extractEdge(ActivityNode activityNode, ActivityParameterNode paramNode) {
		EdgeID id = new EdgeID(activityNode.getName(), paramNode.getName());
		if (activityEdgeMap.containsKey(id)) {
			return activityEdgeMap.get(id);
		} else {
			id = new EdgeID(paramNode.getName(), activityNode.getName());
			return activityEdgeMap.get(id);
		}

	}

	public Set<ActivityParameterNode> getConnectedParameterNodes(ActivityNode activeNode) {
		if (conncetedParameterNodeMap.containsKey(activeNode)) {
			return conncetedParameterNodeMap.get(activeNode);
		}
		return new HashSet<>();
	}

	public ActivityNode getActivityNode(String xmofElementName) {
		return activityNodeMap.get(xmofElementName);
	}

	public Map<String, ActivityNode> getActivityNodeMap() {
		return Collections.unmodifiableMap(activityNodeMap);
	}

	public Map<EdgeID, Set<ActivityEdge>> getActivityEdgeMap() {
		return Collections.unmodifiableMap(activityEdgeMap);
	}

	public Map<ActivityNode, Set<ActivityParameterNode>> getConncetedParameterNodeMap() {
		return Collections.unmodifiableMap(conncetedParameterNodeMap);
	}

	public Set<ActivityNode> retrieveAllConnectedNodes(ActivityNode node) {
		Set<ActivityNode> set = new HashSet<>();
		if (conncetedParameterNodeMap.containsKey(node)) {
			set.addAll(conncetedParameterNodeMap.get(node));

		}
		set.add(node);
		return set;

	}

}
