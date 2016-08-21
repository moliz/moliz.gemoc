package org.modelexecution.xmof.animation.decorator.internal;

import org.modelexecution.xmof.Syntax.Actions.BasicActions.Pin;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityParameterNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ControlFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectFlow;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ObjectNode;

public class DiagramUtil {
	
	public static ActivityNode retreiveSourceNode(ActivityEdge edge){
		ActivityNode source=null;
		if (edge instanceof ControlFlow) {
			source = edge.getSource();
		} else if (edge instanceof ObjectFlow) {
			source = retrieveConnectedNode(edge.getSource());
		}
		return source;
	}
	
	public static ActivityNode retreiveTargetNode(ActivityEdge edge){
		ActivityNode target=null;
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
}
