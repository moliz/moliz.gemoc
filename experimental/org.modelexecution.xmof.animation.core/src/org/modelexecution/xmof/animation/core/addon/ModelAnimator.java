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
package org.modelexecution.xmof.animation.core.addon;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.animation.core.controller.AnimationController;
import org.modelexecution.xmof.animation.core.decorator.DecoratorService;
import org.modelexecution.xmof.animation.core.provider.AnimationProviderRegistry;
import org.modelexecution.xmof.animation.core.provider.IAnimationProvider;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;
import org.modelexecution.xmof.vm.XMOFBasedModel;

import fr.inria.diverse.trace.commons.model.trace.Step;

public class ModelAnimator implements IEngineAddon {

	private AnimationController animationController;

	@Override
	public void engineAboutToStart(IExecutionEngine executionEngine) {

	}

	@Override
	public void engineStarted(IExecutionEngine executionEngine) {
		if (executionEngine instanceof XMOFExecutionEngine) {
			initialize((XMOFExecutionEngine) executionEngine);

		}

	}

	private void initialize(XMOFExecutionEngine engine) {
		PlatformUI.getWorkbench().getDisplay().syncExec((new Runnable() {
			@Override
			public void run() {
				animationController = retrieveController(engine);
			}
		}));

	}

	private AnimationController retrieveController(XMOFExecutionEngine engine) {
		URI xmofModelURI = retrieveXMOFModelURI(engine);
		XMOFBasedModel model = engine.getRawVirtualMachine().getModel();
		AnimationProviderRegistry registry = AnimationProviderRegistry.getInstance();
		if (registry.haveProvider(xmofModelURI)) {
			List<IAnimationProvider> possibleProviders = registry.getProviders(xmofModelURI);
			IAnimationProvider provider = null;
			if (possibleProviders.size() > 1) {
				provider = letUserSelectProvider(possibleProviders);
			}
			if (provider == null) {

				provider = possibleProviders.get(0);
			}
			return provider.createController(xmofModelURI, model);
		}
		return null;
	}

	private URI retrieveXMOFModelURI(XMOFExecutionEngine engine) {
		Resource modelResource = engine.getModelLoader().getXMOFModelResource();
		return modelResource.getURI();
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
	public void engineAboutToStop(IExecutionEngine engine) {
	
	}

	@Override
	public void engineStopped(IExecutionEngine engine) {
		if (animationController!=null){
			animationController.dispose();
		}

	}

	@Override
	public void engineAboutToDispose(IExecutionEngine engine) {
	}

	@Override
	public void aboutToSelectStep(IExecutionEngine engine, Collection<Step> steps) {
		// TODO Auto-generated method stub

	}

	@Override
	public void proposedStepsChanged(IExecutionEngine engine, Collection<Step> steps) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepSelected(IExecutionEngine engine, Step selectedStep) {
		// TODO Auto-generated method stub

	}

	/**
	 * MSE occurrence is passed to controller to animate step
	 */
	@Override
	public void aboutToExecuteStep(IExecutionEngine engine, Step stepToExecute) {
		if (animationController != null) {
			animationController.processMSE(stepToExecute.getMseoccurrence(), false);
		}

	}

	@Override
	public void stepExecuted(IExecutionEngine engine, Step stepExecuted) {
		// TODO Auto-generated method stub

	}

	@Override
	public void engineStatusChanged(IExecutionEngine engine, RunStatus newStatus) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> validate(List<IEngineAddon> otherAddons) {
		// TODO Auto-generated method stub
		return null;
	}
}
