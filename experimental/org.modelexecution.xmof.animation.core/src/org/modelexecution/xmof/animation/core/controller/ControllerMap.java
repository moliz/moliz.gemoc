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
	private Map<Activity, Activity> activityCallerMap;
	private Map<Activity, DiagramDecorator> diagramDecoratorMap;
	private Collection<Activity> activies;

	public ControllerMap(XMOFBasedModel model) {
		diagramDecoratorMap = new HashMap<Activity, DiagramDecorator>();
		activityCallerMap = new HashMap<>();
		activies = new HashSet<>(obtainActivities(obtainDistinctModelElements(model)));

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

	public DiagramDecorator getDecoratorByName(Activity activity) {
		return diagramDecoratorMap.get(activity);
	}

	public void addCallingActivity(Activity called, Activity calling) {
		activityCallerMap.put(called, calling);

	}

	public Activity getCallingActivity(Activity activity) {
		return activityCallerMap.get(activity);
	}

	public Collection<Activity> getActivities() {
		return activies;
	}

	public void addDecorator(Activity key, DiagramDecorator decorator) {
		diagramDecoratorMap.put(key, decorator);

	}

	public Collection<DiagramDecorator> getDecorators() {
		return diagramDecoratorMap.values();
	}

}
