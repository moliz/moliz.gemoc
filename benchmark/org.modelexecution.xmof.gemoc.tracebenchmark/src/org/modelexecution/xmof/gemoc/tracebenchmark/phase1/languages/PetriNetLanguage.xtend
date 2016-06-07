package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import java.util.List
import java.util.Map

class PetriNetLanguage extends BenchmarkLanguage {

	new(Map<String, List<String>> inputModels) {
		super(inputModels)
	}

	override getFolderName() {
		"petrinet"
	}

	override getLanguageFQN() {
		"org.modelexecution.examples.petrinet.Petrinet"
	}

	override getFullTraceAddon() {
		new org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetConfigurationTraceEngineAddon()
	}

	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getJavaTracePackageName() {
		"petrinetTrace"
	}

}
