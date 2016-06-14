package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import java.io.File
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.eclipse.emf.ecore.resource.Resource
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.BenchmarkPhase1
import java.util.function.Consumer

interface BenchmarkTracingCase {

	def void configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context);
	
	def void initialize();

	def long computeMemoryUsage(File dumpFile)

	def void setLanguage(BenchmarkLanguage language)

	def String getSimpleName()

	def int getNumberOfStates()

	def boolean createsTrace()
	
	def void saveTrace(String string)
	
	def void preCleanUp()
	
	def void cleanUp()
	
	def Resource getTraceResource()
	
	def void setLogOperation(Consumer<String> logOperation)

}


