/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.addon;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.animation.controller.AnimationController;
import org.modelexecution.xmof.animation.decorator.DecoratorService;
import org.modelexecution.xmof.animation.decorator.internal.Representation;
import org.modelexecution.xmof.animation.graphiti.GraphitiAnimationController;
import org.modelexecution.xmof.animation.sirius.SiriusAnimationController;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.trace.commons.model.trace.Step;

/**
 * ModelAnimator class which implements the AddonInterface for notifications of
 * debug events.
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class ModelAnimator implements IEngineAddon {

	private AnimationController animationController;
	private static String SIRIUS_SPECIFICATION_FILE = "representations.aird";
	private static boolean FORCE_GRAPHITI=true;
	/**
	 * Initialization of graphical representation. Either Graphiti or Sirius
	 * will be used
	 * 
	 * @param model
	 *            A xMOF-based Model
	 * @param resource
	 * @param animConfig
	 *            RunConfiguration where the representation should be
	 */
	private void initialize(XMOFBasedModel model, Resource resource) {
		if (!FORCE_GRAPHITI&&exisitsSiriusRepresentationFile(resource)){
			animationController = new SiriusAnimationController(model, resource);
			DecoratorService.setActiveAnimator(Representation.SIRIUS);
		}else{
			animationController = new GraphitiAnimationController(model, resource);
			DecoratorService.setActiveAnimator(Representation.GRAPHITI);
		}
		DecoratorService.setRunning(true);

	}

	private boolean exisitsSiriusRepresentationFile(Resource resource) {
		URI siriusURI = URI
				.createURI("platform:/resource/" + resource.getURI().segment(1) + "/" + SIRIUS_SPECIFICATION_FILE);
		return new ExtensibleURIConverterImpl().exists(siriusURI, null);
	}

	@Override
	public void engineAboutToStart(IBasicExecutionEngine executionEngine) {

	}

	/**
	 * After successfully starting the engine, the the animation plugin will be
	 * initialized.s
	 * 
	 * @param executionEngine
	 */
	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) {
		if (executionEngine instanceof XMOFExecutionEngine) {
			XMOFExecutionEngine xmofEngine = (XMOFExecutionEngine) executionEngine;
			initialize(xmofEngine.getXMOFBasedModel(), xmofEngine.getModelLoader().getXMOFModelResource());

		}

	}

	@Override
	public void engineAboutToStop(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void engineAboutToDispose(IBasicExecutionEngine engine) {
		if (animationController != null) {
			animationController.dispose();
			animationController = null;
		}

	}

	@Override
	public void aboutToSelectStep(IBasicExecutionEngine engine, Collection<Step> steps) {
		// TODO Auto-generated method stub

	}

	@Override
	public void proposedStepsChanged(IBasicExecutionEngine engine, Collection<Step> steps) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepSelected(IBasicExecutionEngine engine, Step selectedStep) {
		// TODO Auto-generated method stub

	}

	/**
	 * MSE occurrence is passed to controller to animate step
	 */
	@Override
	public void aboutToExecuteStep(IBasicExecutionEngine engine, Step stepToExecute) {
		if (animationController != null) {
			animationController.processMSE(stepToExecute.getMseoccurrence(), true);
		}

	}

	@Override
	public void stepExecuted(IBasicExecutionEngine engine, Step stepExecuted) {
		// TODO Auto-generated method stub

	}

	@Override
	public void engineStatusChanged(IBasicExecutionEngine engine, RunStatus newStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> validate(List<IEngineAddon> otherAddons) {
		// TODO Auto-generated method stub
		return null;
	}
}
