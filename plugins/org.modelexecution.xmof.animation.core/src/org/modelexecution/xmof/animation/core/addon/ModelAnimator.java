/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.addon;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.provider.AnimationProviderRegistry;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
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
			initialize((XMOFExecutionEngine) executionEngine);

		}

	}

	private void initialize(XMOFExecutionEngine engine) {
		PlatformUI.getWorkbench().getDisplay().syncExec((new Runnable() {
			@Override
			public void run() {
				Resource modelResource = engine.getModelLoader().getXMOFModelResource();
				animationController = retrieveController(modelResource);
			}
		}));

	}

	private AnimationController retrieveController(Resource modelResource) {
		AnimationProviderRegistry registry = AnimationProviderRegistry.getInstance();
		if (registry.haveProvider(modelResource)) {
			List<IAnimationProvider> possibleProviders = registry.getProviders(modelResource);
			IAnimationProvider provider = null;
			if (possibleProviders.size() > 1) {
				provider = letUserSelectProvider(possibleProviders);
			}
			if (provider == null) {

				provider = possibleProviders.get(0);
			}
			return provider.retrieveController(modelResource);
		}
		return null;
	}

	private IAnimationProvider letUserSelectProvider(List<IAnimationProvider> possibleProviders) {
		Map<String, IAnimationProvider> providerMap = createProviderMap(possibleProviders);
		ElementListSelectionDialog dialog = createSelectionDialog(providerMap.keySet().toArray());
		// User pressed cancel
		if (dialog.open() != Window.OK) {
			return null;
		}
		Object[] result = dialog.getResult();

		return providerMap.get(result[0]);

	}

	private ElementListSelectionDialog createSelectionDialog(Object[] elements) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		dialog.setTitle("Choose desired animation provider");
		return dialog;
	}

	private Map<String, IAnimationProvider> createProviderMap(List<IAnimationProvider> possibleProviders) {
		Map<String, IAnimationProvider> map = new HashMap<>();
		for (IAnimationProvider provider : possibleProviders) {
			map.put(provider.getName(), provider);
		}
		return map;
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