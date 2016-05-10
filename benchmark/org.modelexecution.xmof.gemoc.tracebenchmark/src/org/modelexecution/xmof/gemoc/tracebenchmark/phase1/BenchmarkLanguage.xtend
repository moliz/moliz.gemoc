package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetTraceEngineAddon
import java.util.Map
import java.util.Set
import java.util.List

interface BenchmarkLanguage {

	def String getFolderName()

	def String getLanguageFQN()

	def AbstractTraceAddon getFullTraceAddon()

	def AbstractTraceAddon getPartialTraceAddon()

	def Set<String> getModels()

	def List<String> getInputModelsFor(String model)
	
	def String getJavaTraceRootName()
	
	def String getJavaTracePackageName()
	
// TODO other getters for the memory queries
} 

