package org.xmof.execution.engine.ui.debug;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.gemoc.executionframework.engine.core.EngineStoppedException;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;
import org.gemoc.executionframework.engine.ui.debug.AbstractGemocDebugger;
import org.gemoc.xdsmlframework.api.core.IBasicExecutionEngine;
import org.gemoc.xdsmlframework.api.core.ISequentialExecutionEngine;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityNodeEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.xmof.execution.engine.XMOFExecutionEngine;

import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;
import fr.obeo.dsl.debug.ide.event.debugger.StepIntoResumingReply;

public class XMOFModelDebugger extends AbstractGemocDebugger implements
		ExecutionEventListener {
	private XMOFExecutionEngine engine;

	private boolean breakOnActivityNodes = true;

	protected final String threadName = "Model debugging";

	public XMOFModelDebugger(IDSLDebugEventProcessor target,
			ISequentialExecutionEngine engine) {
		super(target, engine);
		if (engine instanceof XMOFExecutionEngine) {
			this.engine = (XMOFExecutionEngine) engine;
		}
	}

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
		// ((XMOFExecutionEngine) engine).subscribeToVMEvents(this);
	}

	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) {
		spawnRunningThread(threadName, engine.getExecutionContext()
				.getResourceModel().getContents().get(0));

	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) {
		if (!isTerminated(threadName)) {
			terminated(threadName);
		}

	}

	@Override
	public void logicalStepExecuted(IBasicExecutionEngine engine,
			LogicalStep logicalStepExecuted) {
		ToPushPop aaa = new ToPushPop(logicalStepExecuted.getMseOccurrences()
				.get(0), false);
		toPushPop.add(aaa);
	}

	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine engine,
			LogicalStep logicalStepToExecute) {

		ToPushPop aaa = new ToPushPop(logicalStepToExecute.getMseOccurrences()
				.get(0), true);
		toPushPop.add(aaa);

		if (!control(threadName, logicalStepToExecute)) {
			throw new RuntimeException("Debug thread has stopped.");
		}

	}

	List<ToPushPop> toPushPop = new ArrayList<>();

	@Override
	public void mseOccurrenceExecuted(IBasicExecutionEngine engine,
			MSEOccurrence mseOccurrence) {
		// TODO check if super call is necessary
		super.mseOccurrenceExecuted(engine, mseOccurrence);

	}

	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine engine,
			MSEOccurrence mseOccurrence) {

		if (!control(threadName, mseOccurrence)) {
			throw new EngineStoppedException("Debug thread has stopped.");
		}

	}

	@Override
	public boolean control(String threadName, EObject instruction) {
		if (!isTerminated() && instruction instanceof LogicalStep) {
			return super.control(threadName, instruction);
		} else {
			return true;
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
	public void steppingInto(String threadName) {
		super.steppingInto(threadName);
		engine.resume();
	}

	@Override
	protected void updateStack(String threadName, EObject instruction) {

		Deque<MSEOccurrence> virtualStack = new ArrayDeque<>();
		for (ToPushPop m : toPushPop) {
			if (m.push) {
				// We push the mse onto the virtual stack.
				virtualStack.push(m.mseOccurrence);
			} else {
				if (virtualStack.isEmpty()) {
					// The virtual stack is empty, we pop the top stackframe off
					// of the real stack.
					popStackFrame(threadName);
				} else {
					// The virtual stack is not empty, we pop the top stackframe
					// off of it.
					virtualStack.pop();
				}
			}
			Iterator iterator = virtualStack.descendingIterator();
			while (iterator.hasNext()) {

				MSEOccurrence mseOccurrence = (MSEOccurrence) iterator.next();
				EObject caller = mseOccurrence.getMse().getCaller();
				// String name = caller.eClass().getName() + " ("
				// + mseOccurrence.getMse().getName() + ") ["
				// + caller.toString() + "]";

				DefaultDeclarativeQualifiedNameProvider nameprovider = new DefaultDeclarativeQualifiedNameProvider();
				QualifiedName qname = nameprovider
						.getFullyQualifiedName(caller);
				String objectName = "";
				if (qname != null)
					objectName = qname.toString();
				else if (caller != null)
					objectName = caller.toString();
				String opName = mseOccurrence.getMse().getName();
				String callerType = caller.eClass().getName();
				String prettyName = "(" + callerType + ") " + objectName
						+ " -> " + opName + "()";

				if (mseOccurrence.getMse().getAction() != null)
					pushStackFrame(threadName, prettyName, caller,
							mseOccurrence.getMse().getAction());
				else
					pushStackFrame(threadName, prettyName, caller, caller);
			}

			// setCurrentInstruction(threadName, instruction);

		}
		toPushPop.clear();
	}

	// // This initial frame will in ANY case display the root element of the
	// // model, because the first context is the one of the Thread, which is
	// // the root
	// if (!initFakeStackFrame) {
	// pushStackFrame(threadName, "Root frame", instruction, instruction);
	// initFakeStackFrame = true;
	// this.threadName = threadName;
	// }
	//
	// for (ToPushPop m : toPushPop) {
	// if (m.push) {
	// pushStackFrame(threadName, m.mseOccurrence.getMse().getName(),
	// m.mseOccurrence, m.mseOccurrence);
	// } else {
	// popStackFrame(threadName);
	// }
	// }
	//
	// toPushPop.clear();

	protected int nbStackFrames = 0;

	Deque<String> stackFrameNames = new ArrayDeque<>();

	@Override
	public void pushStackFrame(String threadName, String frameName,
			EObject context, EObject instruction) {
		super.pushStackFrame(threadName, frameName, context, instruction);
		stackFrameNames.push(frameName);
		nbStackFrames++;
	}

	@Override
	public void popStackFrame(String threadName) {
		super.popStackFrame(threadName);
		stackFrameNames.pop();
		nbStackFrames--;
	}

	@Override
	public void notify(Event rawExecutionEvent) {
		if (rawExecutionEvent instanceof ActivityNodeEntryEvent) {
			// shouldBreak = true;
		}

	}

	@Override
	public boolean shouldBreak(EObject instruction) {
		// TODO Breakpoint logic
		return true;
	}

}
