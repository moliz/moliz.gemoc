package org.modelexecution.xmof.gemoc.tracebenchmark.phase1

import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon
import org.modelexecution.xmof.examples.petrinet.trace.tracemanager.PetrinetTraceEngineAddon
import java.util.Map
import java.util.Set

interface BenchmarkLanguage {

	def String getFolderName()

	def String getLanguageFQN()

	def AbstractTraceAddon getFullTraceAddon()

	def AbstractTraceAddon getPartialTraceAddon()

	def Set<String> getModels()

	def Set<String> getInputModelsFor(String model)
// TODO other getters for the memory queries
}

class PetriNetLanguage implements BenchmarkLanguage {

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
		#{"net1.petrinet"}
	}

	override getInputModelsFor(String model) {
		#{""}
	}

	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}