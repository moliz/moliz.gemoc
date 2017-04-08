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

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.animation.core.decorator.DecoratorService;
import org.modelexecution.xmof.animation.core.decorator.DiagramDecorator;
import org.modelexecution.xmof.animation.core.handler.DiagramHandler;
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
	protected Activity activeActivity;
	protected DiagramDecorator activeDecorator;
	protected DiagramHandler diagramHandler;

	public AnimationController(XMOFBasedModel model, DiagramHandler concreteHandler) {

		controllerMap = new ControllerMap(model);
		this.diagramHandler = concreteHandler;
		initializeDecorators();
	}

	/**
	 * processes MSEOccurences to match an event
	 * 
	 * @param mseOccurrence
	 * @param verbose
	 *            Debug output
	 */
	public void processMSE(MSEOccurrence mseOccurrence, boolean verbose) {
		EOperation action = mseOccurrence.getMse().getAction();
		if (action instanceof BehavioredEOperation) {
			processActivity(action);
		} else {
			processActivityNode(action);
		}

	}

	private void processActivityNode(EOperation action) {
		String nodeName = retrieveNodeName(action);
		decorateActivityNode(nodeName);
	}

	private String retrieveNodeName(EOperation action) {
		String name = action.getName();
		String args[] = name.split(":");
		if (isValidNodeName(args)) {
			return args[0].trim();
		}
		return null;
	}

	private boolean isValidNodeName(String[] splittedName) {
		return splittedName.length == 2 && !splittedName[0].isEmpty() && !splittedName[1].isEmpty();
	}

	private void processActivity(EOperation action) {
		Activity activity = getActivity((BehavioredEOperation) action);
		if (activity != null) {
			handleActivity(activity);
		}

	}

	private Activity getActivity(BehavioredEOperation eOperation) {
		if (!eOperation.getMethod().isEmpty())
			return (Activity) eOperation.getMethod().get(0);
		return null;
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
	 * Resets DecoratorService & refreshes Diagrams
	 */
	public void dispose() {
		DecoratorService.reset();
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				for (DiagramDecorator decorator : controllerMap.getDecorators()) {
					decorator.refreshDiagram();
				}
			}

		});
	};

	/**
	 * 
	 * 
	 * @param match
	 */
	protected void handleActivity(Activity activity) {
		openOrShowDiagram(activity);
		if (activeActivity != null) {
			controllerMap.addCallingActivity(activity, activeActivity);
		}

		activeDecorator = controllerMap.getDecoratorByName(activity);
		activeActivity = activity;
		DecoratorService.intializeContainer(activity);
	}

	protected abstract void initializeDecorators();

	/**
	 * Try to decorate node in active diagram. If the node cannot be found in
	 * the currently active activity the caller activity is used.
	 * 
	 * @param match
	 *            matched debugEvent
	 */
	protected void decorateActivityNode(String nodeName) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				if (activeDecorator != null) {
					if (!activeDecorator.decorateActivityElement(nodeName)) {
						tryDecorateInCallingActivity(nodeName);
					}

				}

			}
			
			private boolean tryDecorateInCallingActivity(String nodeName){
				activeDecorator.setActivityFinished(true);
				Activity callingActivity = controllerMap.getCallingActivity(activeActivity);
				if (callingActivity != null) {
					activeDecorator = controllerMap.getDecoratorByName(callingActivity);
					activeActivity=callingActivity;
					if (activeDecorator.decorateActivityElement(nodeName)) {
						openOrShowDiagram(callingActivity);
						return true;
					}
					tryDecorateInCallingActivity(nodeName);
				}
				return false;
			}
			

		});

	}

}
