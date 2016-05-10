package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import java.util.List
import java.util.Map
import org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetTraceEngineAddon

class PetriNetLanguage implements BenchmarkLanguage {

	val Map<String, List<String>> inputDataMap

	new(Map<String, List<String>> inputModels) {
		inputDataMap = inputModels
	}

	override getFolderName() {
		"petrinet"
	}

	override getLanguageFQN() {
		"org.modelexecution.examples.petrinet.Petrinet"
	}

	override getFullTraceAddon() {
		new PetrinetTraceEngineAddon
	}

	override getModels() {
		return inputDataMap.keySet
	}

	override getInputModelsFor(String model) {
		return inputDataMap.get(model)
	}

	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getJavaTraceRootName() {
		"SpecificTraceImpl"
	}

	override getJavaTracePackageName() {
		"petrinetTrace"
	}

}