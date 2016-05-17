package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import java.io.File
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage

interface BenchmarkTracingCase {

	def void configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context);

	def int computeMemoryUsage(File dumpFile)

	def void setLanguage(BenchmarkLanguage language)

	def String getSimpleName()

	def int getNumberOfStates()

	def boolean createsTrace()
	
	def void saveTrace(String string)

}

class NoTraceCase implements BenchmarkTracingCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		// Nothing to do, no trace addon
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

}

class GenericTraceCase implements BenchmarkTracingCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		// TODO Tanja, how to enable that?
	}

	override computeMemoryUsage(File dumpFile) {
		// TODO find which are the classes used 
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override setLanguage(BenchmarkLanguage language) {
		// Nothing to do
	}

	override getSimpleName() {
		"generic_traces"
	}

	override getNumberOfStates() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override createsTrace() {
		true
	}
	
	override saveTrace(String string) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}

/**
 * Must be constructed with a partial trace addon.
 */
class PartialDSCase extends DSTraceCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		if (engine.executionContext != null && engine.executionContext.executionPlatform != null) {
			for (addon : engine.executionContext.executionPlatform.engineAddons) {
				engine.executionContext.executionPlatform.removeEngineAddon(addon)
			}
		}
		engine.executionContext.executionPlatform.addEngineAddon(language.partialTraceAddon)
	}

	override getSimpleName() {
		"partial_ds_traces"
	}


}
