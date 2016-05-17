package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import org.modelexecution.xmof.examples.fuml.trace.tracemanager.UmlTraceEngineAddon
import java.util.Map
import java.util.List

class Fuml extends BenchmarkLanguage {

	new(Map<String, List<String>> inputModels) {
		super(inputModels)
	}

	override getFolderName() {
		"fuml"
	}

	override getLanguageFQN() {
		"org.modelexecution.examples.Fuml"
	}

	override getFullTraceAddon() {
		new UmlTraceEngineAddon()
	}

	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getJavaTracePackageName() {
		"umlTrace"
	}

}
