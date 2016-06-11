package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import fr.inria.diverse.trace.commons.model.trace.GenericMSE
import fr.inria.diverse.trace.commons.testutil.Investigation
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import java.io.File
import java.util.HashSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.transaction.util.TransactionUtil
import org.modelexecution.xmof.examples.fuml.trace.tracemanager.FumlConfigurationTraceConstructor
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage

class DSTraceCase implements BenchmarkTracingCase {

	protected var BenchmarkLanguage language
	protected var AbstractTraceAddon traceAddon
	protected var XMOFExecutionEngine engine

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		if (engine.executionContext != null && engine.executionContext.executionPlatform != null) {
			for (addon : engine.executionContext.executionPlatform.engineAddons) {
				engine.executionContext.executionPlatform.removeEngineAddon(addon)
			}
		}
		this.traceAddon = language.fullTraceAddon
		this.traceAddon.disableTraceSaving
		context.executionPlatform.addEngineAddon(traceAddon)
		traceAddon.disableTraceSaving
		this.engine = engine
	}

	override initialize() {
	}

	static val String queryStart = '''SELECT * FROM ".*('''
	static val String queryEndWithoutUtil = ''').*[^(PackageImpl|FactoryImpl|AdapterFactory|Switch)]?$" '''

	static val String msePackageName = "fr.inria.diverse.trace.commons.model"

	static def String createQueryWithoutUtil(String... packagesNames) {
		'''«queryStart»«packagesNames.join("|")»«queryEndWithoutUtil»'''
	}

	override computeMemoryUsage(File dumpFile) {

		val analyzer = new MemoryAnalyzer(dumpFile);

		// First we make sure that there is only one trace
		val String queryCheck = '''SELECT * FROM ".*«language.javaTraceRootName».*"''';
		val resCheck = analyzer.computeRetainedSizeWithOQLQuery(queryCheck);
		if (resCheck.nbElements != 1) {
			throw new Exception("Wrong number of traces: " + resCheck.nbElements);
		}

		val query = createQueryWithoutUtil(language.javaTracePackageName, msePackageName)

		println("query: " + query)

		val resquery = analyzer.computeRetainedSizeWithOQLQuery(query);

		println("Memory: " + resquery.memorySum)

		analyzer.cleanUp

		return resquery.memorySum
	}

	override setLanguage(BenchmarkLanguage language) {
		this.language = language
	}

	override getSimpleName() {
		"ds_traces"
	}

	override getNumberOfStates() {
		if (this.traceAddon.traceConstructor instanceof FumlConfigurationTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as FumlConfigurationTraceConstructor
			return cast.statesSize
		}
		return -12
	}

	override createsTrace() {
		true
	}

	override saveTrace(String pathInWS) {
		val uri = URI.createPlatformResourceURI(pathInWS, true)

		// Hack to replace references to regular objects in MSEs by traced objects (which are always serializable)
		if (this.traceAddon.traceConstructor instanceof FumlConfigurationTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as FumlConfigurationTraceConstructor
			val pointed = new HashSet<EObject>
			val pointers = Investigation::findObjectsThatPointToObjectsWithoutResource(cast.traceResource, pointed)
			for (mse : pointers.filter(GenericMSE)) {
				if (pointed.contains(mse.caller)) {
					val traced = cast.exeToTraced.get(mse.caller)
					mse.callerReference = traced
				}
			}
		}

		traceAddon.traceConstructor.save(uri)
	}

	override preCleanUp() {
		for (r : engine.executionContext.resourceModel.resourceSet.resources) {
			for (a : r.allContents.toSet) {
				a.eAdapters.clear
			}
			r.eAdapters.clear

			val ed = TransactionUtil.getEditingDomain(engine.executionContext.resourceModel.resourceSet)
			if (ed != null)
				ed.dispose

		}

		if (this.traceAddon.traceConstructor instanceof FumlConfigurationTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as FumlConfigurationTraceConstructor

			val ed = TransactionUtil.getEditingDomain(cast.traceResource)
			if (ed != null)
				ed.dispose

			for (a : cast.traceResource.allContents.toSet) {
				a.eAdapters.clear
			}
			cast.traceResource.eAdapters.clear

			cast.preCleanUp
			cast.traceResource
		}
	}

	override cleanUp() {
		preCleanUp

		if (this.traceAddon.traceConstructor instanceof FumlConfigurationTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as FumlConfigurationTraceConstructor
			cast.cleanUp
		}

		this.engine = null
		this.traceAddon = null
	}
	
	override getTraceResource() {
		if (this.traceAddon.traceConstructor instanceof FumlConfigurationTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as FumlConfigurationTraceConstructor
			return cast.traceResource
		}
		return null
	}

}
