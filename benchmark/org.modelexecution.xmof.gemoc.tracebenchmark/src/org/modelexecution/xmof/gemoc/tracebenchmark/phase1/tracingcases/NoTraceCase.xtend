package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import java.io.File
import java.util.function.Consumer

class NoTraceCase implements BenchmarkTracingCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		// Nothing to do, no trace addon
	}

	override initialize() {
	}

	override computeMemoryUsage(File dumpFile) {
		return 0
	}

	override setLanguage(BenchmarkLanguage language) {
		// Nothing to do
	}

	override getSimpleName() {
		"no_trace"
	}

	override getNumberOfStates() {
		0
	}

	override createsTrace() {
		false
	}

	override saveTrace(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override cleanUp() {
	}

	override preCleanUp() {
	}

	override getTraceResource() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	private var Consumer<String> logOperation

	override log(String s) {
		logOperation.accept(s);
	}

	override setLogOperation(Consumer<String> logOperation) {
		this.logOperation = logOperation
	}
	
	override needsConfModelInTrace() {
		false
	}

}
