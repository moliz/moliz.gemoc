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

class GenericTraceCase implements BenchmarkTracingCase {

	private var XMOFExecutionEngine engine;
	private var BenchmarkExecutionModelContext context;
	private var GenericTraceConstructor genericTraceConstructor;
	private var ResourceSet resourceSet;

	override configureEngineForTracing(XMOFExecutionEngine engine, BenchmarkExecutionModelContext context) {
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

	static val String queryStart = '''SELECT * FROM ".*'''
	static val String queryEnd = '''.*"'''

	static val String queryAllUtil = '''SELECT * FROM ".*(PackageImpl|FactoryImpl|AdapterFactory|Switch)$"'''

	static def String createQuery(String... packagesNames) {
		'''«queryStart»«packagesNames.join("|")»«queryEnd»'''
	}

	override computeMemoryUsage(File dumpFile) {

		val analyzer = new MemoryAnalyzer(dumpFile);

		// First we make sure that there is only one trace
		val String queryCheck = '''SELECT * FROM ".*«traceRoot».*"''';
		val resCheck = analyzer.computeRetainedSizeWithOQLQuery(queryCheck);
		if (resCheck.nbElements != 1) {
			throw new Exception("Wrong number of traces: " + resCheck.nbElements);
		}

		val query = createQuery(tracePackage)

		log("query: " + query)

		val resquery = analyzer.computeRetainedSizeWithOQLQuery(query, queryAllUtil);

		log("Memory: " + resquery.memorySum)

		analyzer.cleanUp

		return resquery.memorySum
	}

	override setLanguage(BenchmarkLanguage language) {
		// Nothing to do
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

	val pointedObjectsNotContained = new HashSet<EObject>();

	override saveTrace(String pathString) {
		val StateSystem trace = genericTraceConstructor.stateSystem

		val Resource traceResource = createTraceResource(pathString)
		addTraceToResource(traceResource, trace);

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
		return genericTraceConstructor.stateSystem.eResource
	}
	
		
	private var Consumer<String> logOperation
	private def void log(String s) {
		logOperation.accept(s);
	}
	
	override setLogOperation(Consumer<String> logOperation) {
		this.logOperation = logOperation
	}
	

}
