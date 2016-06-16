package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import fr.inria.diverse.trace.commons.model.trace.GenericMSE
import fr.inria.diverse.trace.commons.testutil.Investigation
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import java.util.HashSet
import java.util.function.Consumer
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.transaction.util.TransactionUtil
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.tracebenchmark.api.BenchmarkTraceConstructor

class DSTraceCase extends AbstractWithTraceCase{ 

	protected var BenchmarkLanguage language
	protected var AbstractTraceAddon traceAddon
	protected var XMOFExecutionEngine engine

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
		
		this.engine = null
		this.traceAddon = null
		
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


	static val String msePackageName = "fr.inria.diverse.trace.commons.model"


	override setLanguage(BenchmarkLanguage language) {
		this.language = language
	}

	override getSimpleName() {
		"ds_traces"
	}

	override getNumberOfStates() {
		if (this.traceAddon.traceConstructor instanceof BenchmarkTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as BenchmarkTraceConstructor
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
		if (this.traceAddon.traceConstructor instanceof BenchmarkTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as BenchmarkTraceConstructor
			val pointed = new HashSet<EObject>
			val pointers = Investigation::findObjectsThatPointToObjectsWithoutResource(traceResource, pointed)
			for (mse : pointers.filter(GenericMSE)) {
				if (pointed.contains(mse.caller)) {
					val traced = cast.exeToTraced.get(mse.caller)
					mse.callerReference = traced
				}
			}
		}

		try {
			traceAddon.traceConstructor.save(uri)
		} catch (Throwable t) {
			log("Failed to serialize trace, attempt to fix the trace model")
			// Hack to find referenced objects that are not contained, to put them at the root of the resource before saving
			val pointed2 = new HashSet<EObject>
			Investigation::findObjectsThatPointToObjectsWithoutResource(traceResource, pointed2)
			val newRoots = Investigation::findRoots(pointed2)
			traceResource.contents.addAll(newRoots)
			traceAddon.traceConstructor.save(uri)
		}

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

		if (this.traceAddon.traceConstructor instanceof BenchmarkTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as BenchmarkTraceConstructor

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

		if (this.traceAddon.traceConstructor instanceof BenchmarkTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as BenchmarkTraceConstructor
			cast.cleanUp
		}

		this.engine = null
		this.traceAddon = null
	}

	override getTraceResource() {
		if (this.traceAddon.traceConstructor instanceof BenchmarkTraceConstructor) {
			val cast = this.traceAddon.traceConstructor as BenchmarkTraceConstructor
			return cast.traceResource
		}
		return null
	}
	
	private var Consumer<String> logOperation
	override log(String s) {
		logOperation.accept(s);
	}
	
	override setLogOperation(Consumer<String> logOperation) {
		this.logOperation = logOperation
	}
	
	override getTraceRoot() {
		language.javaTraceRootName
	}
	
	override getTracePackages() {
		return #{language.javaTracePackageName,msePackageName,language.javaExePackageName}
	}
	
	override needsConfModelInTrace() {
		true
	}
	

}
