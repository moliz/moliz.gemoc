package org.modelexecution.xmof.gemoc.engine.ui.commons;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

public class RunConfiguration extends
		org.gemoc.executionframework.engine.ui.commons.RunConfiguration {

	// main launch parameters
	public static final String LAUNCH_INITIALIZATION_MODEL = "GEMOC_LAUNCH_INITIALIZATION_MODEL";

	public RunConfiguration(ILaunchConfiguration launchConfiguration)
			throws CoreException {
		super(launchConfiguration);

	}

	@Override
	protected void extractInformation() throws CoreException {
		super.extractInformation();

		modelInitializationModel = getAttribute(LAUNCH_INITIALIZATION_MODEL, "");

	}

	private String modelInitializationModel;

	public String getModelInitializationModel() {
		return modelInitializationModel;
	}

}
