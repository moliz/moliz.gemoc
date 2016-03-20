package org.modelexecution.xmof.gemoc.engine.ui.debug;

import org.gemoc.execution.sequential.javaengine.ui.debug.GenericSequentialModelDebugger;
import org.gemoc.xdsmlframework.api.core.ISequentialExecutionEngine;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;

import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

public class XMOFModelDebugger extends GenericSequentialModelDebugger {
	private XMOFExecutionEngine engine;

	protected final String threadName = "Model debugging";

	public XMOFModelDebugger(IDSLDebugEventProcessor target,
			ISequentialExecutionEngine engine) {
		super(target, engine);
		if (engine instanceof XMOFExecutionEngine) {
			this.engine = (XMOFExecutionEngine) engine;
		}
	}

	@Override
	public void steppingInto(String threadName) {
		super.steppingInto(threadName);
		engine.resume();
	}

}
