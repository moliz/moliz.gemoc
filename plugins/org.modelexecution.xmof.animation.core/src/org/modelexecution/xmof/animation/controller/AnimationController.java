/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.controller;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.decorator.DecoratorService;
import org.modelexecution.xmof.animation.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.handler.DiagramHandler;
import org.modelexecution.xmof.animation.mapping.MappingService;
import org.modelexecution.xmof.animation.mapping.Match;
import org.modelexecution.xmof.animation.ui.Activator;

import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;

/**
 * The controller manages the communication flow within the model animator. The
 * execution engine provides all information needed for the animation process
 * encapsulated in a Model Speci fic Event object.
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public abstract class AnimationController {
	protected ControllerMap controllerMap;
	protected MappingService mappingService;
	protected DiagramDecorator activeDecorator;
	protected DiagramHandler diagramHandler;

	/**
	 * Constructor resets DecoratorService
	 * 
	 * @param model
	 *            xMOF model that should be animated
	 * @param resource
	 *            that contains the configuration model
	 * @param concreteHandler
	 *            open or shows activity diagrams
	 */
	public AnimationController (Resource resource, DiagramHandler concreteHandler) {

		controllerMap = new ControllerMap(resource);
		mappingService = new MappingService(controllerMap.getActivityNames());
		this.diagramHandler = concreteHandler;
		DecoratorService.reset();
	}

	/**
	 * processes MSEOccurences to match an event
	 * 
	 * @param mseOccurrence
	 * @param verbose
	 *            Debug output
	 */
	public void processMSE(MSEOccurrence mseOccurrence, boolean verbose) {
		Match match = mappingService.matchDebugEvent(mseOccurrence.getMse());
		if (verbose) {
			String info = mseOccurrence.getMse().getName() + " has been matched to:\n" + match.getXmofElementName();
			Activator.getDefault().getMessaggingSystem().debug(info, Activator.PLUGIN_ID);
		}
		processType(match);

	}

	/**
	 * Intializes decorators and opens correct activity diagram
	 * 
	 * @param match
	 *            matched debug event
	 */
	public void handleMain(Match match) {
		initializeDecorators();
		Activity activity = controllerMap.getActivityByName(match.getXmofElementName());
		openOrCreateActivityDiagram(activity);
		activeDecorator = controllerMap.getDecoratorByName(activity.getName());
		DecoratorService.intializeContainer(activity.getName());
	}

	/**
	 * Opens activity diagram in active workbench
	 * 
	 * @param activity
	 *            Activity diagram
	 */
	protected void openOrCreateActivityDiagram(Activity activity) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				diagramHandler.openOrShowDiagram(activity);
			}

		});
	}

	/**
	 * Resets DecoratorService
	 */
	public void dispose() {
		DecoratorService.reset();
	}

	/**
	 * 
	 * 
	 * @param match
	 */
	public void handleActivity(Match match) {
		Activity activity = controllerMap.getActivityByName(match.getXmofElementName());
		openOrCreateActivityDiagram(activity);
		controllerMap.addCallingActivity(activity.getName(), activeDecorator.getActivity().getName());

		activeDecorator = controllerMap.getDecoratorByName((activity.getName()));
		DecoratorService.intializeContainer(activity.getName());
	}

	/**
	 * Determines type of match and delegates to other methods
	 * 
	 * @param match
	 *            matched debugEvent
	 */
	private void processType(Match match) {
		switch (match.getType()) {
		case MAIN:
			handleMain(match);
			return;
		case ACTIVITY:
			handleActivity(match);
			return;
		case CONTROLNODE:
		case CALLOPERATION:
		case ACTIVITYNODE:
		case STRUCTUREDACTIVITYNODE:
			decorateActivityNode(match);
			return;
		default:
			Activator.getDefault().getMessaggingSystem().debug("process type could not be determined",
					Activator.PLUGIN_ID);
		}
	}

	protected abstract void initializeDecorators();

	/**
	 * Try to decorate node in active diagram. If the node cannot be found in
	 * the currently active activity the caller activity is used.
	 * 
	 * @param match
	 *            matched debugEvent
	 */
	protected void decorateActivityNode(Match match) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				if (activeDecorator != null) {
					if (!tryDecorateInCurrentActivity(match)) {
						DiagramDecorator lastDecorator = activeDecorator;
						if (tryDecorateInCallingActivity(match)) {
							lastDecorator.setActivityFinished(true);
						} else {
							lastDecorator.setActivityFinished(false);
						}
					}

				}

			}

			private boolean tryDecorateInCallingActivity(Match match) {
				String callingActivity = controllerMap.getCallingActivity((activeDecorator.getActivity().getName()));
				if (callingActivity != null) {
					activeDecorator = controllerMap.getDecoratorByName(callingActivity);
					if (activeDecorator.decorateActivityElement(match)) {
						openOrCreateActivityDiagram(controllerMap.getActivityByName(callingActivity));
					}
					return true;
				}
				return false;

			}

			private boolean tryDecorateInCurrentActivity(Match match) {
				return activeDecorator.decorateActivityElement(match);
			}

		});

	}

}
