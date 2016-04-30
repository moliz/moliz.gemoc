package org.modelexecution.xmof.gemoc.tracebenchmark

import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon

interface TracingSort {

	def void configureEngineForTracing(XMOFExecutionEngine engine);

}

class NoTraceSort implements TracingSort {

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

class GenericTraceSort implements TracingSort {

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

class DSTraceSort implements TracingSort {

	val AbstractTraceAddon traceAddon

	new(AbstractTraceAddon traceAddon) {
		this.traceAddon = traceAddon
	}

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

class PartialDSSort extends DSTraceSort {
	
	new(AbstractTraceAddon traceAddon) {
		super(traceAddon)
	}
	
}