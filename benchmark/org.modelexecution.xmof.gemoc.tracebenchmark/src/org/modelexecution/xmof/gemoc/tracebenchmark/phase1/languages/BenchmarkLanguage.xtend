package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import java.util.List
import java.util.Map

abstract class BenchmarkLanguage {

	val Map<String, List<String>> inputDataMap

	new(Map<String, List<String>> inputModels) {
		inputDataMap = inputModels
	}

	def getModels() {
		return inputDataMap.keySet
	}

	def getInputModelsFor(String model) {
		return inputDataMap.get(model)
	}

	def getJavaTraceRootName() {
		"SpecificTraceImpl"
	}

	def String getFolderName()

	def String getLanguageFQN()

	def AbstractTraceAddon getFullTraceAddon()

	def AbstractTraceAddon getPartialTraceAddon()

	def String getJavaTracePackageName()
	
	def String getJavaExePackageName() 

}
