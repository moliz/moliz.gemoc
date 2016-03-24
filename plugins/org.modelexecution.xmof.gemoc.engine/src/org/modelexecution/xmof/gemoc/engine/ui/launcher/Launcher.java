package org.modelexecution.xmof.gemoc.engine.ui.launcher;

import java.util.Collection;
import java.util.Set;
import java.util.function.BiPredicate;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.gemoc.commons.eclipse.ui.ViewHelper;
import org.gemoc.executionframework.engine.commons.ModelExecutionContext;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.executionframework.engine.ui.launcher.AbstractGemocLauncher;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.gemoc.executionframework.ui.views.engine.EnginesStatusView;
import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.core.ISequentialExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionModelContext;
import org.modelexecution.xmof.gemoc.engine.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;
import org.modelexecution.xmof.gemoc.engine.ui.debug.XMOFModelDebugger;

import fr.inria.diverse.commons.messagingsystem.api.MessagingSystem;
import fr.inria.diverse.trace.gemoc.api.IMultiDimensionalTraceAddon;
import fr.obeo.dsl.debug.ide.IDSLDebugger;
import fr.obeo.dsl.debug.ide.event.DSLDebugEventDispatcher;

public class Launcher extends AbstractGemocLauncher {

	public final static String TYPE_ID = Activator.PLUGIN_ID + ".launcher";

	private IBasicExecutionEngine executionEngine;

	@Override
	public void launch(final ILaunchConfiguration configuration,
			final String mode, final ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		try {
			debug("About to initialize and run the GEMOC Execution Engine...");

			// make sure to have the engine view when starting the engine
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					ViewHelper.retrieveView(EnginesStatusView.ID);
				}
			});
			// We parse the run configuration
			final RunConfiguration runConfiguration = new RunConfiguration(
					configuration);

			// We detect if we are running in debug mode or not
			ExecutionMode executionMode = null;
			if (ILaunchManager.DEBUG_MODE.equals(mode)) {
				executionMode = ExecutionMode.Animation;

			} else {
				executionMode = ExecutionMode.Run;
			}

			// We stop the launch if an engine is already running for this model
			if (isEngineAlreadyRunning(runConfiguration.getExecutedModelURI())) {
				return;
			}
			// create and initialize engine
			executionEngine = new XMOFExecutionEngine(false);
			ModelExecutionContext executioncontext = new XMOFExecutionModelContext(
					runConfiguration, executionMode);
			executioncontext.initializeResourceModel();
			executionEngine.initialize(executioncontext);

			// And we start it within a dedicated job
			Job job = new Job(getDebugJobName(configuration,
					getFirstInstruction(configuration))) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					// If we are debugging, we add the animator and we start
					// the execution using the super class
					// AbstractDSLLaunchConfigurationDelegateUI
					// This will start yet another job and eventually start
					// the engine
					if (ILaunchManager.DEBUG_MODE.equals(mode)) {
						IEngineAddon animator = AbstractGemocAnimatorServices
								.getAnimator();
						executionEngine.getExecutionContext()
								.getExecutionPlatform()
								.addEngineAddon(animator);
						try {
							Launcher.super.launch(configuration, mode, launch,
									monitor);
							return new Status(IStatus.OK, getPluginID(),
									"Execution was launched successfully");
						} catch (CoreException e) {
							e.printStackTrace();
							return new Status(IStatus.ERROR, getPluginID(),
									"Could not start debugger.");
						}
					}

					// If we are not debugging, we simply start the engine
					// from the current job
					else {
						executionEngine.start();
						debug("Execution finished.");
						return new Status(IStatus.OK, getPluginID(),
								"Execution was launched successfully");
					}
				}
			};
			debug("Initialization done, starting engine...");
			job.schedule();

		} catch (Exception e) {
			String message = "Error occured when starting execution engine: "
					+ e.getMessage() + " (see inner exception).";
			// error(message);
			e.printStackTrace();
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, message, e));
		}

	}

	private boolean isEngineAlreadyRunning(URI launchedModelURI)
			throws CoreException {
		// make sure there is no other running engine on this model
		Collection<IBasicExecutionEngine> engines = org.gemoc.executionframework.engine.Activator
				.getDefault().gemocRunningEngineRegistry.getRunningEngines()
				.values();
		for (IBasicExecutionEngine engine : engines) {
			IExecutionEngine observable = (IExecutionEngine) engine;
			if (observable.getRunningStatus() != RunStatus.Stopped
					&& observable.getExecutionContext().getResourceModel()
							.getURI().equals(launchedModelURI)) {
				String message = "An engine is already running on this model, please stop it first";
				warn(message);
				return true;
			}
		}
		return false;
	}

	protected void debug(String message) {
		getMessagingSystem().debug(message, getPluginID());
	}

	protected void info(String message) {
		getMessagingSystem().info(message, getPluginID());
	}

	protected void warn(final String message) {
		getMessagingSystem().warn(message, getPluginID());
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openWarning(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						"GEMOC Engine Launcher", message);
			}
		});
	}

	protected void error(final String message) {
		getMessagingSystem().error(message, getPluginID());
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getShell(),
						"GEMOC Engine Launcher", message);
			}
		});
	}

	private MessagingSystem getMessagingSystem() {
		return Activator.getDefault().getMessaggingSystem();
	}

	@Override
	protected EObject getFirstInstruction(ISelection selection) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(IEditorPart editor) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected EObject getFirstInstruction(ILaunchConfiguration configuration) {
		return EcorePackage.eINSTANCE;
	}

	@Override
	protected String getLaunchConfigurationTypeID() {
		return TYPE_ID;
	}

	@Override
	protected String getDebugJobName(ILaunchConfiguration arg0, EObject arg1) {
		return "Gemoc debug job";
	}

	@Override
	protected String getDebugTargetName(ILaunchConfiguration arg0, EObject arg1) {
		return "Gemoc debug target";
	}

	@Override
	protected IDSLDebugger getDebugger(ILaunchConfiguration configuration,
			DSLDebugEventDispatcher dispatcher, EObject firstInstruction,
			IProgressMonitor monitor) {
		AbstractGemocDebugger res;
		Set<IMultiDimensionalTraceAddon> traceAddons = executionEngine
				.getAddonsTypedBy(IMultiDimensionalTraceAddon.class);
		if (traceAddons.isEmpty()) {
			res = new XMOFModelDebugger(dispatcher,
					(ISequentialExecutionEngine) executionEngine);
		} else {
			res = null;
			// res = new OmniscientGenericSequentialModelDebugger(dispatcher,
			// (ISequentialExecutionEngine) executionEngine,
			// traceAddons.iterator().next());
		}

		// If in the launch configuration it is asked to pause at the start,
		// we add this dummy break
		try {
			if (configuration.getAttribute(RunConfiguration.LAUNCH_BREAK_START,
					false)) {
				res.addPredicateBreak(new BiPredicate<IBasicExecutionEngine, MSEOccurrence>() {
					@Override
					public boolean test(IBasicExecutionEngine t, MSEOccurrence u) {
						return true;
					}
				});
			}
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

		executionEngine.getExecutionContext().getExecutionPlatform()
				.addEngineAddon(res);
		return res;
	}

	@Override
	protected String getModelIdentifier() {
		if (executionEngine instanceof XMOFExecutionEngine)
			return Activator.PLUGIN_ID + ".debugModel";
		else
			return MODEL_ID;
	}

	@Override
	protected String getPluginID() {
		return Activator.PLUGIN_ID;
	}

}
