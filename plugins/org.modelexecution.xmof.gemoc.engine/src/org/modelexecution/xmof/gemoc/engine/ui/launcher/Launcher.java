package org.modelexecution.xmof.gemoc.engine.ui.launcher;

import java.util.Arrays;
import java.util.Set;
import java.util.function.BiPredicate;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.ui.ViewHelper;
import org.eclipse.gemoc.dsl.debug.ide.IDSLDebugger;
import org.eclipse.gemoc.dsl.debug.ide.event.DSLDebugEventDispatcher;
import org.eclipse.gemoc.execution.sequential.javaengine.SequentialModelExecutionContext;
import org.eclipse.gemoc.execution.sequential.javaengine.ui.debug.GenericSequentialModelDebugger;
import org.eclipse.gemoc.executionframework.debugger.AbstractGemocDebugger;
import org.eclipse.gemoc.executionframework.debugger.AnnotationMutableFieldExtractor;
import org.eclipse.gemoc.executionframework.engine.commons.EngineContextException;
import org.eclipse.gemoc.executionframework.engine.commons.ModelExecutionContext;
import org.eclipse.gemoc.executionframework.engine.ui.launcher.AbstractSequentialGemocLauncher;
import org.eclipse.gemoc.executionframework.ui.views.engine.EnginesStatusView;
import org.eclipse.gemoc.trace.commons.model.trace.MSEOccurrence;
import org.eclipse.gemoc.trace.gemoc.api.IMultiDimensionalTraceAddon;
import org.eclipse.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;
import org.modelexecution.xmof.gemoc.engine.ui.Activator;
import org.modelexecution.xmof.gemoc.engine.ui.commons.RunConfiguration;

public class Launcher extends AbstractSequentialGemocLauncher {

	public final static String TYPE_ID = Activator.PLUGIN_ID + ".launcher";

	@Override
	protected IExecutionEngine createExecutionEngine(
			org.eclipse.gemoc.executionframework.engine.ui.commons.RunConfiguration runConfiguration,
			ExecutionMode executionMode) throws CoreException, EngineContextException {
		IExecutionEngine executionEngine = new XMOFExecutionEngine();
		ModelExecutionContext executioncontext = new SequentialModelExecutionContext(runConfiguration, executionMode);
		//new//new XMOFExecutionModelContext(runConfiguration, executionMode);
		executioncontext.initializeResourceModel();
		executionEngine.initialize(executioncontext);
		return executionEngine;
	}

	@Override
	protected IDSLDebugger getDebugger(ILaunchConfiguration configuration, DSLDebugEventDispatcher dispatcher,
			EObject firstInstruction, IProgressMonitor monitor) {
		AbstractGemocDebugger debugger;
		@SuppressWarnings("rawtypes")
		Set<IMultiDimensionalTraceAddon> traceAddons = _executionEngine
				.getAddonsTypedBy(IMultiDimensionalTraceAddon.class);
		if (traceAddons.isEmpty()) {
			debugger = new GenericSequentialModelDebugger(dispatcher, _executionEngine);
		} else {
			debugger = new GenericSequentialModelDebugger(dispatcher, _executionEngine);
			// res = new OmniscientGenericSequentialModelDebugger(dispatcher,
			// (ISequentialExecutionEngine) executionEngine,
			// traceAddons.iterator().next());
		}

		//ConfigurationObjectMap configurationMap = ((XMOFExecutionEngine)_executionEngine).getConfigurationMap();
		//debugger.setMutableFieldExtractors(Arrays.asList(new XMOFMutableFieldExtractor(configurationMap)));
		debugger.setMutableFieldExtractors(Arrays.asList(new AnnotationMutableFieldExtractor()));
		

		
		// If in the launch configuration it is asked to pause at the start,
		// we add this dummy break
		try {
			if (configuration.getAttribute(RunConfiguration.LAUNCH_BREAK_START, false)) {
				debugger.addPredicateBreak(new BiPredicate<IExecutionEngine, MSEOccurrence>() {
					@Override
					public boolean test(IExecutionEngine t, MSEOccurrence u) {
						return true;
					}
				});
			}
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

		_executionEngine.getExecutionContext().getExecutionPlatform().addEngineAddon(debugger);
		return debugger;
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
	public String getModelIdentifier() {
		if (_executionEngine instanceof XMOFExecutionEngine)
			return Activator.PLUGIN_ID + ".debugModel";
		else
			return MODEL_ID;
	}

	@Override
	protected String getPluginID() {
		return Activator.PLUGIN_ID;
	}

	@Override
	protected void prepareViews() {
		ViewHelper.retrieveView(EnginesStatusView.ID);
	}

	@Override
	protected org.eclipse.gemoc.executionframework.engine.ui.commons.RunConfiguration parseLaunchConfiguration(
			ILaunchConfiguration configuration) throws CoreException {
		return new RunConfiguration(configuration);
	}

	@Override
	protected void error(String message, Exception e) {
		Activator.error(message, e);
	}

	@Override
	protected MessagingSystem getMessagingSystem() {
		return Activator.getDefault().getMessaggingSystem();
	}

	@Override
	protected void setDefaultsLaunchConfiguration(ILaunchConfigurationWorkingCopy configuration) {

	}

}
