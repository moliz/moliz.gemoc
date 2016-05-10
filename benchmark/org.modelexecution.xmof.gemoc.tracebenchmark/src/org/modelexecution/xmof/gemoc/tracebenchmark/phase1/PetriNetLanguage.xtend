package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetTraceEngineAddon
import java.util.Map
import java.util.Set
import java.util.List

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