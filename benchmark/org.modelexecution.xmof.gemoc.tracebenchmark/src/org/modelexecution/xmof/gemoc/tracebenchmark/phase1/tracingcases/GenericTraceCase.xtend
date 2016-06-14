package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import fr.inria.diverse.trace.commons.testutil.Investigation
import java.io.File
import java.util.HashSet
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.domain.EditingDomain
import org.eclipse.emf.transaction.util.TransactionUtil
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.generictraceconstructor.GenericTraceConstructor
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.states.states.StateSystem
import java.util.function.Consumer

class GenericTraceCase extends AbstractWithTraceCase {

	private var XMOFExecutionEngine engine;
	private var BenchmarkExecutionModelContext context;
	private var GenericTraceConstructor genericTraceConstructor;
	private var ResourceSet resourceSet;

	var BenchmarkLanguage language

	val pointedObjectsNotContained = new HashSet<EObject>();
	var Resource traceResource
	

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {

		this.engine = null
		this.context = null
		this.genericTraceConstructor = null
		this.resourceSet = null
		this.pointedObjectsNotContained.clear
		this.traceResource = null

		this.engine = engine;
		this.context = context;
	}

	override initialize() {

		// resourceSet = context.resourceModel.resourceSet;
		resourceSet = new ResourceSetImpl
		genericTraceConstructor = new GenericTraceConstructor(engine.getXMOFBasedModel().modelResource);
		engine.rawVirtualMachine.addRawExecutionEventListener(genericTraceConstructor);
	}

	static val String traceRoot = "StateSystemImpl"
	static val String tracePackage = "org.modelexecution.xmof.states"

	override setLanguage(BenchmarkLanguage language) {
		this.language = language
	}

	override getSimpleName() {
		"generic_traces"
	}

	override getNumberOfStates() {
		val StateSystem trace = genericTraceConstructor.stateSystem;
		trace.states.size;
	}

	override createsTrace() {
		true
	}

	override saveTrace(String pathString) {
		getTraceResource
		traceResource.URI = URI.createPlatformResourceURI(pathString, true)
		try {
			traceResource.save(null);
		} catch (Throwable t) {
			log("Failed to serialize trace, attempt to fix the trace model")
			// Hack to find referenced objects that are not contained, to put them at the root of the resource before saving
			Investigation::findObjectsThatPointToObjectsWithoutResource(traceResource, pointedObjectsNotContained)
			val newRoots = Investigation::findRoots(pointedObjectsNotContained)
			traceResource.contents.addAll(newRoots)
			traceResource.save(null);
		}

	}

	private def Resource createTraceResource(String string) {
		val URI traceURI = URI.createPlatformResourceURI(string, true)
		val Resource traceResource = resourceSet.createResource(traceURI)
		return traceResource
	}

	private def addTraceToResource(Resource resource, StateSystem trace) {

		val EditingDomain editingDomain = TransactionUtil.getEditingDomain(resource.resourceSet)
		val Command cmd = new AddCommand(editingDomain, resource.getContents(), trace)
		if (editingDomain != null && editingDomain.getCommandStack() != null)
			editingDomain.getCommandStack().execute(cmd)
		else
			cmd.execute
	}

	override preCleanUp() {
		genericTraceConstructor.stateSystem.eAdapters.clear
		for (a : genericTraceConstructor.stateSystem.eAllContents.toSet) {
			a.eAdapters.clear
		}
		for (a : pointedObjectsNotContained) {
			a.eAdapters.clear
		}
		this.genericTraceConstructor.preCleanUp
	}

	override cleanUp() {
		preCleanUp
		if (traceResource != null && traceResource.contents != null) {
			traceResource.contents.clear
			if (traceResource != null)
				traceResource.unload
		}
		this.genericTraceConstructor.dispose()
		this.resourceSet.resources.clear
		this.resourceSet = null
	}

	override getTraceResource() {
		if (traceResource == null) {
			val StateSystem trace = genericTraceConstructor.stateSystem
			traceResource = createTraceResource("file://tmp/test.xmi")
			addTraceToResource(traceResource, trace);
		}
		return traceResource
	}

	private var Consumer<String> logOperation

	override log(String s) {
		logOperation.accept(s);
	}

	override setLogOperation(Consumer<String> logOperation) {
		this.logOperation = logOperation
	}

	override getTraceRoot() {
		return traceRoot
	}

	override getTracePackages() {
		return #{tracePackage,language.javaExePackageName}
	}
	
	override needsConfModelInTrace() {
		false
	}

}
