package org.modelexecution.xmof.gemoc.tracebenchmark.api

import org.eclipse.emf.ecore.resource.Resource
import java.util.Map
import org.eclipse.emf.ecore.EObject

interface BenchmarkTraceConstructor {
	
	def Resource getTraceResource()
	
	def void cleanUp()
	
	def void preCleanUp()
	
	def Map<EObject,EObject> getExeToTraced()
	
	def int getStatesSize()
	
}