package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.tracingcases

import java.io.File
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine
import org.modelexecution.xmof.gemoc.tracebenchmark.gemochelpers.BenchmarkExecutionModelContext
import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.gemoc.generictraceconstructor.GenericTraceConstructor
import org.modelexecution.xmof.states.states.StateSystem
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.transaction.util.TransactionUtil
import org.eclipse.emf.edit.domain.EditingDomain
import org.modelexecution.xmof.gemoc.tracebenchmark.memoryhelpers.MemoryAnalyzer
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

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

	static val String queryStart = '''select a.@retainedHeapSize from ".*'''
	static val String queryEndSimple = '''.*" a'''
	static val String queryEndUtil = '''.*(PackageImpl|FactoryImpl|AdapterFactory|Switch)$" a'''

	static val String traceRoot = "StateSystemImpl"
	static val String tracePackage = "org.modelexecution.xmof.states"

	static def String createQuerySimple(String packageName) {
		'''«queryStart»«packageName»«queryEndSimple»'''
	}

	static def String createQueryUtil(String packageName) {
		'''«queryStart»«packageName»«queryEndUtil»'''
	}

	override computeMemoryUsage(File dumpFile) {
		
		
		genericTraceConstructor.stateSystem.eAdapters.clear

		val analyzer = new MemoryAnalyzer(dumpFile);

		// First we make sure that there is only one trace
		val String queryCheck = '''SELECT * FROM ".*«traceRoot».*"''';
		val resCheck = analyzer.computeRetainedSizeWithOQLQuery(queryCheck, dumpFile);
		if (resCheck.nbElements != 1) {
			throw new Exception("Wrong number of traces: " + resCheck.nbElements);
		}

		val querySpecific = createQuerySimple(tracePackage)
		val querySpecificRemove = createQueryUtil(tracePackage)

		println("querySpecific: " + querySpecific)
		println("querySpecificRemove: " + querySpecificRemove)

		val resquerySpecific = analyzer.computeRetainedSizeWithOQLQuery(querySpecific, dumpFile);
		val resquerySpecificRemove = analyzer.computeRetainedSizeWithOQLQuery(querySpecificRemove, dumpFile);

		println("Memory package specific: " + resquerySpecific.memorySum)
		println("Memory to remove specific: " + resquerySpecificRemove.memorySum)

		return resquerySpecific.memorySum - resquerySpecificRemove.memorySum
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

	override saveTrace(String pathString) {
		val StateSystem trace = genericTraceConstructor.stateSystem

		val Resource traceResource = createTraceResource(pathString)
		addTraceToResource(traceResource, trace);

		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
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
		this.genericTraceConstructor.preCleanUp
	}

	override cleanUp() {
		preCleanUp
		this.genericTraceConstructor.dispose()
		this.resourceSet.resources.clear
		this.resourceSet = null
	}

}
