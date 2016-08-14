/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
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
	private Resource resource;

	public MappingService(XMOFBasedModel model, Resource resource) {
		this.model = model;
		this.resource=resource;
		prepareMap();
		obtainAllowedEObjects();
	}

	public Activity getActivityByName(String name) {
		return activityMap.get(name);
	}

	public XMOFBasedModel getModel() {
		return model;
	}
	
	public Resource getResource(){
		return resource;
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

	

	private void prepareMap() {
		activityMap = new HashMap<>();
		List<EPackage> epackages= getConfigurationPackages();
		for (Activity activity: obtainActivities(epackages)){
			String name = activity.getName();
			activityMap.put(name, activity);
		}

		return;

	}

	private List<EPackage> getConfigurationPackages() {
		List<EPackage> list= new ArrayList<>();
		for (EObject eObj:resource.getContents()){
			if (eObj instanceof EPackage){
				list.add((EPackage)eObj);
			}
		}
		return list;
	}

	private Set<Activity> obtainActivities(List<EPackage> epackages) {
		Set<Activity> activities = new HashSet<>();
		for (EPackage epackage : epackages) {
			activities.addAll(obtainActivities(epackage.eContents()));
		}
		return activities;
	}

	
	private Collection<Activity> obtainActivities(EList<EObject> eContents) {
		Set<Activity> activities = new HashSet<>();
		for (EObject eObj:eContents){
			if (eObj instanceof BehavioredEClass){
				activities.addAll(getActivities((BehavioredEClass)eObj));
			}
		}
		return activities;
	}



	private Set<Activity> getActivities(BehavioredEClass behavioredClass) {
		Set<Activity> activities = new HashSet<>();
		for (Behavior behavior:behavioredClass.getOwnedBehavior()){
			if (behavior instanceof Activity){
				activities.add((Activity)behavior);
			}
		}
		return activities;
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
