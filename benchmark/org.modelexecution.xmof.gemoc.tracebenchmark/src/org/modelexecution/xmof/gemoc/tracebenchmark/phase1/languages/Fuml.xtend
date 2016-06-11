package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages.BenchmarkLanguage
import java.util.Map
import java.util.List
import org.modelexecution.xmof.examples.fuml.trace.tracemanager.FumlConfigurationTraceEngineAddon

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
		new FumlConfigurationTraceEngineAddon()
	}

	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getJavaTracePackageName() {
		"fumlConfigurationTrace"
	}
	
	override getJavaExePackageName() {
		"fumlConfiguration"
	}

}
