package org.modelexecution.xmof.gemoc.tracebenchmark

import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine

interface BenchmarkTracingCase {

	def void configureEngineForTracing(XMOFExecutionEngine engine);
	def int computeMemoryUsage()
	def void setLanguage(BenchmarkLanguage language)
	def String getFolderName()
}

class NoTraceCase implements BenchmarkTracingCase {

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		// Nothing to do, no trace addon
	}

	override computeMemoryUsage() {
		return 0
	}

	override setLanguage(BenchmarkLanguage language) {
		// Nothing to do
	}
	
	override getFolderName() {
		""
	}

}

class GenericTraceCase implements BenchmarkTracingCase {

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		// TODO Tanja, how to enable that?
	}

	override computeMemoryUsage() {
		// TODO find which are the classes used 
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override setLanguage(BenchmarkLanguage language) {
		// Nothing to do
	}
	
	override getFolderName() {
		"generic_traces"
	}

}

class DSTraceCase implements BenchmarkTracingCase {

	protected var BenchmarkLanguage language

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		engine.executionContext.executionPlatform.addEngineAddon(language.fullTraceAddon)
	}

	override computeMemoryUsage() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override setLanguage(BenchmarkLanguage language) {
		this.language = language
	}
	
	override getFolderName() {
		"ds_traces"
	}

}

/**
 * Must be constructed with a partial trace addon.
 */
class PartialDSCase extends DSTraceCase {

	override configureEngineForTracing(XMOFExecutionEngine engine) {
		engine.executionContext.executionPlatform.addEngineAddon(language.partialTraceAddon)
	}
	
	override getFolderName() {
		"partial_ds_traces"
	}

}