package org.xmof.execution.engine.ui.debug;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.executionframework.engine.ui.debug.IGemocDebugger;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.xmof.execution.engine.XMOFExecutionEngine;

import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

public class XMOFModelDebugger extends AbstractGemocDebugger implements
IEngineAddon, IGemocDebugger, ExecutionEventListener{

	// XmofExecutionEngine
	private final XMOFExecutionEngine engine;
	private boolean shouldBreak = false;
	
	private boolean initFakeStackFrame = false;
	private String threadName = "a6tIIuOOz8Ir1ppWaAxAtKKoH";
	private List<ToPushPop> toPushPop = new ArrayList<>();
	
	private static class ToPushPop {
		public MSEOccurrence mseOccurrence;
		public boolean push;

		ToPushPop(MSEOccurrence mseOccurrence, boolean push) {
			this.mseOccurrence = mseOccurrence;
			this.push = push;
		}
	}
	
	public XMOFModelDebugger(IDSLDebugEventProcessor target,
			IBasicExecutionEngine engine) {
		super(target, engine);
		this.engine = (XMOFExecutionEngine) engine;
		((XMOFExecutionEngine) engine).subscribeToVMEvents(this);
	}

	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) {
		spawnRunningThread(Thread.currentThread().getName(), engine
				.getExecutionContext().getResourceModel().getContents().get(0));
		
	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		if (!isTerminated(Thread.currentThread().getName())) {
			terminated(Thread.currentThread().getName());
		}
		
	}

	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine engine,
			LogicalStep logicalStepToExecute) {
//		if (!control(Thread.currentThread().getName(), logicalStepToApply)) {
//		throw new RuntimeException("Debug thread has stopped.");
//	}
		
	}

	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine engine,
			MSEOccurrence mseOccurrence) {
		ToPushPop aaa = new ToPushPop(mseOccurrence, true);
		toPushPop.add(aaa);

		if (!control(Thread.currentThread().getName(), mseOccurrence)) {
			throw new RuntimeException("Debug thread has stopped.");
		}
		
	}

	@Override
	public boolean canStepInto(String threadName, EObject instruction) {
		// TODO generate code to test small/big step
				return true;
	}

	@Override
	public void disconnect() {
		return;
		
	}

	@Override
	public void start() {
		engine.start();
		
	}

	@Override
	protected void updateStack(String threadName, EObject instruction) {
		// This initial frame will in ANY case display the root element of the
				// model, because the first context is the one of the Thread, which is
				// the root
				if (!initFakeStackFrame) {
					pushStackFrame(threadName, "Root frame", instruction, instruction);
					initFakeStackFrame = true;
					this.threadName = threadName;
				}

				for (ToPushPop m : toPushPop) {
					if (m.push) {
						pushStackFrame(threadName, m.mseOccurrence.getMse().getName(),
								m.mseOccurrence, m.mseOccurrence);
					} else {
						popStackFrame(threadName);
					}
				}

				toPushPop.clear();
		
	}

	@Override
	public void notify(Event rawExecutionEvent) {
		if (rawExecutionEvent instanceof ActivityNodeEntryEvent) {
			shouldBreak = true;
		}

		
	}

}
