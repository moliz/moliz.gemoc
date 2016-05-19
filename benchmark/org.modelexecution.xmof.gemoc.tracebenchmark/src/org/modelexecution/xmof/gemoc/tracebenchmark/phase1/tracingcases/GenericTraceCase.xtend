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
		resourceSet = context.resourceModel.resourceSet;
		genericTraceConstructor = new GenericTraceConstructor(engine.getXMOFBasedModel().modelResource);
		engine.rawVirtualMachine.addRawExecutionEventListener(genericTraceConstructor);
	}

	override computeMemoryUsage(File dumpFile) {
		// TODO find which are the classes used 
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
		0
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
		traceResource
	}
	
	private def addTraceToResource(Resource resource, StateSystem trace) {
		val EditingDomain editingDomain = TransactionUtil.getEditingDomain(resource.resourceSet)
		val Command cmd = new AddCommand(editingDomain, resource.getContents(), trace)
		editingDomain.getCommandStack().execute(cmd)
	}

}