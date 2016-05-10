package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import java.io.File
import org.eclipse.emf.ecore.EObject
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext

interface BenchmarkTracingCase {

	def void configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context);

	def int computeMemoryUsage(File dumpFile)

	def void setLanguage(BenchmarkLanguage language)

	def String getFolderName()
	
	def int getNumberOfStates()

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

	override getFolderName() {
		""
	}
	
	override getNumberOfStates() {
		0
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

	override getFolderName() {
		"generic_traces"
	}
	
	override getNumberOfStates() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}


}


/**
 * Must be constructed with a partial trace addon.
 */
class PartialDSCase extends DSTraceCase {

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		engine.executionContext.executionPlatform.addEngineAddon(language.partialTraceAddon)
	}

	override getFolderName() {
		"partial_ds_traces"
	}
	

}