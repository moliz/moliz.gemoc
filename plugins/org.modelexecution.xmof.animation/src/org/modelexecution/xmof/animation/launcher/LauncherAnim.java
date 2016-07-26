/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.launcher;

import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.ui.commons.RunConfiguration;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.animation.ModelAnimator;
import org.modelexecution.xmof.animation.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;
import org.modelexecution.xmof.gemoc.engine.ui.launcher.Launcher;

/**
 * Launcher for animation addon
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class LauncherAnim extends Launcher {

	public final static String TYPE_ID = Activator.PLUGIN_ID + ".launcheranim";

	@Override
	protected IBasicExecutionEngine createExecutionEngine(RunConfiguration runConfiguration,
			ExecutionMode executionMode) throws CoreException, EngineContextException {
		IBasicExecutionEngine executionEngine = super.createExecutionEngine(runConfiguration, executionMode);
		initializeAnimationAddon(executionEngine, runConfiguration);
		return executionEngine;
	}

	private void initializeAnimationAddon(IBasicExecutionEngine executionEngine, RunConfiguration runConfiguration) {
		if (executionEngine instanceof XMOFExecutionEngine) {
			XMOFExecutionEngine xmofEngine = (XMOFExecutionEngine) executionEngine;
			Set<IEngineAddon> addons = xmofEngine.getAddonsTypedBy(IEngineAddon.class);
			for (IEngineAddon addon : addons) {
				if (addon instanceof ModelAnimator) {
					org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration animConfig=(org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration) runConfiguration;
					initializeAnimationAddon((ModelAnimator) addon, xmofEngine, animConfig);
				}
			}

		}
	}

	private void initializeAnimationAddon(ModelAnimator addon, XMOFExecutionEngine xmofEngine, org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration animConfig) {

		addon.initialize(xmofEngine.getXMOFBasedModel(), xmofEngine.getLoader().getXMOFModelResource(), animConfig);

	}

}
