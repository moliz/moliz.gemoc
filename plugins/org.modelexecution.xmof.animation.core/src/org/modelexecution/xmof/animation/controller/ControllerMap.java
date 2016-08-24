package org.modelexecution.xmof.animation.controller;

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
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.xmof.animation.decorator.DiagramDecorator;

public class ControllerMap {
	private Map<String, Activity> activityMap;
	private Map<String, String> activityCallerMap;
	private Map<String, DiagramDecorator> diagramDecoratorMap;
	private Resource xmofModelResource;

	public ControllerMap(Resource xmofModelResource) {
		this.xmofModelResource = xmofModelResource;
		diagramDecoratorMap = new HashMap<String, DiagramDecorator>();
		activityCallerMap = new HashMap<>();
		prepareMap();
	}

	public Activity getActivityByName(String name) {
		return activityMap.get(name);
	}

	private void prepareMap() {
		activityMap = new HashMap<>();
		List<EPackage> epackages = getConfigurationPackages();
		for (Activity activity : obtainActivities(epackages)) {
			String name = activity.getName();
			activityMap.put(name, activity);
		}

		return;

	}

	private List<EPackage> getConfigurationPackages() {
		List<EPackage> list = new ArrayList<>();
		for (EObject eObj : xmofModelResource.getContents()) {
			if (eObj instanceof EPackage) {
				list.add((EPackage) eObj);
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
		for (EObject eObj : eContents) {
			if (eObj instanceof BehavioredEClass) {
				activities.addAll(getActivities((BehavioredEClass) eObj));
			}
		}
		return activities;
	}

	private Set<Activity> getActivities(BehavioredEClass behavioredClass) {
		Set<Activity> activities = new HashSet<>();
		for (Behavior behavior : behavioredClass.getOwnedBehavior()) {
			if (behavior instanceof Activity) {
				activities.add((Activity) behavior);
			}
		}
		return activities;
	}

	public DiagramDecorator getDecoratorByName(String name) {
		return diagramDecoratorMap.get(name);
	}

	public void addCallingActivity(String child, String parent) {
		activityCallerMap.put(child, parent);

	}

	public String getCallingActivity(String key) {
		return activityCallerMap.get(key);
	}

	public Set<String> getActivityNames() {
		return new HashSet<>(activityMap.keySet());
	}

	public Collection<Activity> getActivities() {
		return activityMap.values();
	}

	public void addDecorator(String key, DiagramDecorator decorator) {
		diagramDecoratorMap.put(key, decorator);

	}
}
