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

import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.animation.controller.AnimationController;
import org.modelexecution.xmof.animation.provider.AnimationProviderRegistry;
import org.modelexecution.xmof.animation.provider.IAnimationProvider;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;

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
			Resource modelResource = xmofEngine.getModelLoader().getXMOFModelResource();
			animationController = retrieveController(modelResource);
		}

	}

	private AnimationController retrieveController(Resource modelResource) {
		AnimationProviderRegistry registry = AnimationProviderRegistry.getInstance();
		if (registry.haveProvider(modelResource)) {
			IAnimationProvider provider = registry.getProvider(modelResource);
			return provider.retrieveController(modelResource);
		}
		return null;
	}

	@Override
	public void engineAboutToStop(IBasicExecutionEngine engine) {
		if (animationController != null) {
			animationController.dispose();
			animationController = null;
		}
	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void engineAboutToDispose(IBasicExecutionEngine engine) {

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
