package org.modelexecution.xmof.gemoc.engine.ui.commons;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

public class RunConfiguration extends
		org.gemoc.executionframework.engine.ui.commons.RunConfiguration
		implements IXMOFRunConfiguration {

	// main launch parameters
	public static final String LAUNCH_INITIALIZATION_MODEL = "GEMOC_LAUNCH_INITIALIZATION_MODEL";
	public static final String LAUNCH_NODEWISE_STEP = "GEMOC_LAUNCH_NODEWISE_STEP";
	public static final String LAUNCH_IGNORE_STEPS = "GEMOC_LAUNCH_IGNORE_STEPS";
	public static final String LAUNCH_XMOF_REPRESENTATION = "GEMOC_XMOF_REPRESENTATION";
	public static final String LAUNC_XMOF_SIRIUS_MODELPATH="XMOF_SIRIUS_RERESENTATION_MODELPATH";

	public RunConfiguration(ILaunchConfiguration launchConfiguration)
			throws CoreException {
		super(launchConfiguration);

	}

	@Override
	protected void extractInformation() throws CoreException {
		super.extractInformation();

		modelInitializationModel = getAttribute(LAUNCH_INITIALIZATION_MODEL, "");
		nodewiseStepping = getAttribute(LAUNCH_NODEWISE_STEP, false);
		ignoreSteps = getAttribute(LAUNCH_IGNORE_STEPS, true);
		xmofRepresentation = getAttribute(LAUNCH_XMOF_REPRESENTATION, XMOFRepresentation.REPRESENTATION_GRAPHITI);
		siriusRepresentationModelPath=getAttribute(LAUNC_XMOF_SIRIUS_MODELPATH, "");
	}

	private String modelInitializationModel;

	@Override
	public String getModelInitializationModel() {
		return modelInitializationModel;
	}

	private boolean nodewiseStepping;

	@Override
	public boolean getNodewiseStepping() {
		return nodewiseStepping;
	}

	private boolean ignoreSteps;

	public boolean getIgnoreSteps() {
		return ignoreSteps;
	}
	
	private String xmofRepresentation;

	public String getXMOFRepresentation() {
		return xmofRepresentation;
	}
	
	private String siriusRepresentationModelPath;
	public String getSiriusRepresentationModelPath(){
		return siriusRepresentationModelPath;
	}

}
