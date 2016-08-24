/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.mapping;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallOperationAction;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.ConditionalNode;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.LoopNode;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.JoinNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

import fr.inria.diverse.trace.commons.model.trace.MSE;

/**
 * Mapping for the debug events
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class MappingService {
	private static final String MAIN = "main";
	private static final String ACTION_SUFFIX = Action.class.getSimpleName();
	private static final String[] CONTROLNODE_SUFFIX = { InitialNode.class.getSimpleName(),
			ActivityFinalNode.class.getSimpleName(), ForkNode.class.getSimpleName(), JoinNode.class.getSimpleName(),
			DecisionNode.class.getSimpleName(), MergeNode.class.getSimpleName() };

	private static final String[] STRUCTURED_ACTIVITY_NODE_SUFFIX = { StructuredActivityNode.class.getSimpleName(),
			ExpansionRegion.class.getSimpleName(), LoopNode.class.getSimpleName(),
			ConditionalNode.class.getSimpleName() };
	private static final String CALL_OPERATION = CallOperationAction.class.getSimpleName();

	private Set<String> activityNames;

	public MappingService(Set<String> activityNames) {
		super();
		this.activityNames = activityNames;
	}

	public Match matchDebugEvent(MSE debugevent) {
		EObject caller = debugevent.getCaller();
		EOperation action = debugevent.getAction();
		Match match = new Match(debugevent.getName());
		match.setCallerObject(caller);
		if (action instanceof BehavioredEOperation) {
			return matchActivity(action, match);
		} else {
			return matchNode(action, match);
		}

	}

	private Match matchNode(EOperation action, Match match) {
		String actionName = action.getName();
		String[] args = actionName.split(":");
		if (args.length == 2) {
			match.setXmofElementName(args[0].trim());
			match.setType(matchType(args[0], args[1]));
		}
		return match;
	}

	private Match matchActivity(EOperation action, Match match) {
		if (activityNames.contains(action.getName())) {
			match.setXmofElementName(action.getName());
			if (action.getName().equals(MAIN)) {
				match.setType(XMOFType.MAIN);
			} else {
				match.setType(XMOFType.ACTIVITY);
			}
			return match;
		}
		return null;
	}

	private XMOFType matchType(String name, String type) {
		if (!type.isEmpty()) {
			if (type.endsWith(MappingService.ACTION_SUFFIX)) {
				if (type.equals(MappingService.CALL_OPERATION)) {
					return XMOFType.CALLOPERATION;
				}
				return XMOFType.ACTIVITYNODE;
			} else if (hasControlNodeSuffix(type)) {
				return XMOFType.CONTROLNODE;
			} else if (hasStructuredNodeSuffix(type)) {
				return XMOFType.STRUCTUREDACTIVITYNODE;
			}
		}
		return XMOFType.UNKOWN;
	}

	private boolean hasControlNodeSuffix(String type) {
		for (String clazz : CONTROLNODE_SUFFIX) {
			if (type.endsWith(clazz))
				return true;
		}
		return false;
	}

	private boolean hasStructuredNodeSuffix(String type) {
		for (String clazz : STRUCTURED_ACTIVITY_NODE_SUFFIX) {
			if (type.endsWith(clazz))
				return true;
		}
		return false;
	}

}
