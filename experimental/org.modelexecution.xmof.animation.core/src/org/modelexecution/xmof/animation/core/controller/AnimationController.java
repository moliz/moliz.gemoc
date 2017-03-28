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

import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.core.decorator.DecoratorService;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.core.handler.DiagramHandler;
import org.modelexecution.xmof.animation.core.mapping.MappingService;
import org.modelexecution.xmof.animation.core.mapping.Match;
import org.modelexecution.xmof.animation.core.ui.Activator;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;

/**
 * The controller manages the communication flow within the model animator. The
 * execution engine provides all information needed for the animation process
 * encapsulated in a Model Specific Event object.
 * 
 **/
public abstract class AnimationController {
	protected ControllerMap controllerMap;
	protected MappingService mappingService;
	protected DiagramDecorator activeDecorator;
	protected DiagramHandler diagramHandler;

	public AnimationController(XMOFBasedModel model, DiagramHandler concreteHandler) {

		controllerMap = new ControllerMap(model);
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
	protected void handleMain(Match match) {
		initializeDecorators();
		Activity activity = controllerMap.getActivityByName(match.getXmofElementName());
		openOrShowDiagram(activity);
		activeDecorator = controllerMap.getDecoratorByName(activity.getName());
		DecoratorService.intializeContainer(activity.getName());
	}

	/**
	 * Opens activity diagram in active workbench
	 * 
	 * @param activity
	 *            Activity diagram
	 */
	protected void openOrShowDiagram(Activity activity) {
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
	protected void handleActivity(Match match) {
		Activity activity = controllerMap.getActivityByName(match.getXmofElementName());
		openOrShowDiagram(activity);
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
		switch (match.getXmofType()) {
		case Match.XMOF_ACTIVITY_MAIN:
			handleMain(match);
			return;
		case Match.XMOF_ACTIVITY:
			handleActivity(match);
			return;
		case Match.XMOF_ACTIVITYNODE:
			decorateActivityNode(match);
			return;
		default:
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
						openOrShowDiagram(controllerMap.getActivityByName(callingActivity));
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
