/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.Action;
import org.modelexecution.xmof.Syntax.Actions.BasicActions.CallOperationAction;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.ConditionalNode;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.LoopNode;
import org.modelexecution.xmof.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.xmof.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityFinalNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.DecisionNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ForkNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.InitialNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.JoinNode;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.MergeNode;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.vm.XMOFBasedModel;

/**
 * Mapping for the debug events
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class MappingService {
	private static final String MSE_PREFIX = "MSE";
	private static final String MAIN = "main";
	private static final String ACTION_SUFFIX = Action.class.getSimpleName();
	private static final String[] CONTROLNODE_SUFFIX = { InitialNode.class.getSimpleName(),
			ActivityFinalNode.class.getSimpleName(), ForkNode.class.getSimpleName(), JoinNode.class.getSimpleName(),
			DecisionNode.class.getSimpleName(), MergeNode.class.getSimpleName() };
	private static final String[] STRUCTURED_ACTIVITY_NODE_SUFFIX = { StructuredActivityNode.class.getSimpleName(),
			ExpansionRegion.class.getSimpleName(), LoopNode.class.getSimpleName(),
			ConditionalNode.class.getSimpleName() };
	private static final String CALL_OPERATION = CallOperationAction.class.getSimpleName();
	private XMOFBasedModel model;
	private Set<String> allowedEObjects;
	private Map<String, Activity> activityMap;
	private Match lastMatchAttempt;

	public MappingService(XMOFBasedModel model) {
		this.model = model;
		prepareMap();
		obtainAllowedEObjects();
	}

	public Activity getActivityByName(String name) {
		return activityMap.get(name);
	}

	public XMOFBasedModel getModel() {
		return model;
	}

	public Match matchDebugEvent(String debugevent) {
		lastMatchAttempt = new Match(debugevent);
		String[] prefixArgs = debugevent.split("_", 3);
		if (hasCorrectPrefix(prefixArgs)) {
			tryToFindMatch(prefixArgs[2]);
		}
		return lastMatchAttempt;
	}

	public Set<String> getActivityNames() {
		return activityMap.keySet();
	}

	public Collection<Activity> getActivities() {
		return activityMap.values();
	}

	private void obtainAllowedEObjects() {
		allowedEObjects = new HashSet<>();
		for (EObject modelElement : model.getModelElements()) {
			allowedEObjects.add(modelElement.getClass().getSimpleName());
		}
	}

	private Map<String, EObject> obtainDistinctModelElements() {
		Map<String, EObject> elementMap = new HashMap<>();
		for (EObject element : model.getModelElements()) {
			if (!elementMap.containsKey(element.getClass().getName())) {
				elementMap.put(element.getClass().getName(), element);
			}
		}
		return elementMap;

	}

	private void prepareMap() {
		activityMap = new HashMap<>();

		for (Activity activity : obtainActivities(obtainDistinctModelElements().values())) {
			String name = activity.getName();
			activityMap.put(name, activity);

		}

		return;

	}

	private Set<Activity> obtainActivities(Collection<EObject> modelElements) {
		Set<Activity> activities = new HashSet<>();
		for (EObject element : modelElements) {
			activities.addAll(obtainActivities(element));
		}
		return activities;
	}

	private Set<Activity> obtainActivities(EObject modelElement) {
		Set<Activity> activities = new HashSet<>();
		EClass eClass = modelElement.eClass();
		for (EOperation eOperation : eClass.getEOperations()) {
			if (eOperation instanceof BehavioredEOperation) {
				activities.add(getActivity((BehavioredEOperation) eOperation));
			}

		}
		return activities;

	}

	private Activity getActivity(BehavioredEOperation eOperation) {
		if (!eOperation.getMethod().isEmpty())
			return (Activity) eOperation.getMethod().get(0);
		return null;
	}

	private void tryToFindMatch(String name) {
		String[] args = name.split(":");
		switch (args.length) {
		case 1:
			matchName(args[0]);
			return;
		case 2:
			matchNameAndType(args[0], args[1]);
			return;
		default:

		}

	}

	private void matchNameAndType(String name, String type) {
		if (!type.isEmpty()) {
			if (type.endsWith(MappingService.ACTION_SUFFIX)) {
				if (type.equals(MappingService.CALL_OPERATION)) {
					lastMatchAttempt.setType(XMOFType.CALLOPERATION);
				} else {
					lastMatchAttempt.setType(XMOFType.ACTIVITYNODE);
				}
			} else if (hasControlNodeSuffix(type)) {
				lastMatchAttempt.setType(XMOFType.CONTROLNODE);
			} else if (hasStructuredNodeSuffix(type)) {
				lastMatchAttempt.setType(XMOFType.STRUCTUREDACTIVITYNODE);
			}
			lastMatchAttempt.setXmofElementName(name);
		}

	}

	private boolean hasControlNodeSuffix(String type){
		for (String clazz:CONTROLNODE_SUFFIX){
			if (type.endsWith(clazz))return true;
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

	private void matchName(String name) {
		if (name.equals(MappingService.MAIN)) {
			lastMatchAttempt.setType(XMOFType.MAIN);
			lastMatchAttempt.setXmofElementName(MappingService.MAIN);
		} else if (getActivityNames().contains(name)) {
			lastMatchAttempt.setType(XMOFType.ACTITVITY);
			lastMatchAttempt.setXmofElementName(name);
		}
	}

	private boolean hasCorrectPrefix(String[] args) {
		if (args.length == 3) {
			lastMatchAttempt.setCallerObjectName(args[1]);
			return MappingService.MSE_PREFIX.equals(args[0]) && allowedEObjects.contains(args[1]);
		}
		return false;
	}

}
