package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext

/**
 * Must be constructed with a partial trace addon.
 */
class PartialDSCase extends DSTraceCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		
		
		this.engine = null
		this.traceAddon = null
		
		if (engine.executionContext != null && engine.executionContext.executionPlatform != null) {
			for (addon : engine.executionContext.executionPlatform.engineAddons) {
				engine.executionContext.executionPlatform.removeEngineAddon(addon)
			}
		}
		this.traceAddon = language.partialTraceAddon
		this.traceAddon.disableTraceSaving
		context.executionPlatform.addEngineAddon(traceAddon)
		traceAddon.disableTraceSaving
		this.engine = engine
		
	}

	override getSimpleName() {
		"partial_ds_traces"
	}


}