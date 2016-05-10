package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import java.util.List
import java.util.Set

interface BenchmarkLanguage {

	def String getFolderName()

	def String getLanguageFQN()

	def AbstractTraceAddon getFullTraceAddon()

	def AbstractTraceAddon getPartialTraceAddon()

	def Set<String> getModels()

	def List<String> getInputModelsFor(String model)
	
	def String getJavaTraceRootName()
	
	def String getJavaTracePackageName()
	
} 

