package org.modelexecution.xmof.animation.core.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.vm.XMOFBasedModel;

public class ControllerMap {
	private Map<String, Activity> activityMap;
	private Map<String, String> activityCallerMap;
	private Map<String, DiagramDecorator> diagramDecoratorMap;

	public ControllerMap(XMOFBasedModel model) {

		diagramDecoratorMap = new HashMap<String, DiagramDecorator>();
		activityCallerMap = new HashMap<>();
		prepareMap(model);
	}

	public Activity getActivityByName(String name) {
		return activityMap.get(name);
	}

	private void prepareMap(XMOFBasedModel model) {
		activityMap = new HashMap<>();
		for (Activity activity : obtainActivities(obtainDistinctModelElements(model))) {
			String name = activity.getName();
			activityMap.put(name, activity);

		}

		return;

	}

	private Collection<EObject> obtainDistinctModelElements(XMOFBasedModel model) {
		Map<String, EObject> elementMap = new HashMap<>();
		for (EObject element : model.getModelElements()) {
			if (!elementMap.containsKey(element.getClass().getName())) {
				elementMap.put(element.getClass().getName(), element);
			}
		}
		return elementMap.values();

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
