package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import java.io.File
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage

class DSTraceCase implements BenchmarkTracingCase {

	protected var BenchmarkLanguage language
	protected var AbstractTraceAddon traceAddon

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		this.traceAddon = language.fullTraceAddon
		context.executionPlatform.addEngineAddon(traceAddon)
	}

	static val String queryStart = '''select a.@retainedHeapSize from ".*'''
	static val String queryEndSimple = '''.*" a'''
	static val String queryEndUtil = '''".*(PackageImpl|FactoryImpl|AdapterFactory|Switch)$" a'''

	static val String msePackageName = "org.gemoc.executionframework.engine.mse"

	static def String createQuerySimple(String packageName) {
		'''«queryStart»«packageName»«queryEndSimple»'''
	}

	static def String createQueryUtil(String packageName) {
		'''«queryStart»«packageName»«queryEndUtil»'''
	}

	override computeMemoryUsage(File dumpFile) {

		val analyzer = new MemoryAnalyzer(dumpFile);

		// First we make sure that there is only one trace
		val String queryCheck = '''SELECT * FROM ".*«language.javaTraceRootName».*"''';
		val resCheck = analyzer.computeRetainedSizeWithOQLQuery(queryCheck, dumpFile);
		if (resCheck.nbElements != 1) {
			throw new Exception("Wrong number of traces: " + resCheck.nbElements);
		}

		val querySpecific = createQuerySimple(language.javaTracePackageName)
		val querySpecificRemove = createQueryUtil(language.javaTracePackageName)
		val queryGeneric = createQuerySimple(msePackageName)
		val queryGenericRemove = createQueryUtil(msePackageName)

		println("querySpecific: " + querySpecific)
		println("querySpecificRemove: " + querySpecificRemove)
		println("queryGeneric: " + queryGeneric)
		println("queryGenericRemove: " + queryGenericRemove)

		val resquerySpecific = analyzer.computeRetainedSizeWithOQLQuery(querySpecific, dumpFile);
		val resquerySpecificRemove = analyzer.computeRetainedSizeWithOQLQuery(querySpecificRemove, dumpFile);
		val resqueryGeneric = analyzer.computeRetainedSizeWithOQLQuery(queryGeneric, dumpFile);
		val resqueryGenericRemove = analyzer.computeRetainedSizeWithOQLQuery(queryGenericRemove, dumpFile);

		println("Memory package specific: " + resquerySpecific.memorySum)
		println("Memory package generic: " + resqueryGeneric.memorySum)
		println("Memory to remove specific: " + resquerySpecificRemove.memorySum)
		println("Memory to remove generic: " + resqueryGenericRemove.memorySum)

		return resquerySpecific.memorySum + resqueryGeneric.memorySum - resquerySpecificRemove.memorySum -
			resqueryGenericRemove.memorySum
	}

	override setLanguage(BenchmarkLanguage language) {
		this.language = language
	}

	override getFolderName() {
		"ds_traces"
	}

	override getNumberOfStates() {
		traceAddon.traceExplorer.statesTraceLength
	}

}
