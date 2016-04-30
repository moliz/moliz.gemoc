package org.modelexecution.xmof.gemoc.tracebenchmark

import org.modelexecution.xmof.gemoc.engine.XMOFExecutionModelContext
import org.gemoc.xdsmlframework.api.core.IRunConfiguration
import org.gemoc.xdsmlframework.api.core.ExecutionMode
import org.gemoc.executionframework.engine.commons.EngineContextException

class BenchmarkExecutionModelContext extends XMOFExecutionModelContext {
	
	new(IRunConfiguration runConfiguration) throws EngineContextException {
		super(runConfiguration, ExecutionMode.Run)
	}
	
}