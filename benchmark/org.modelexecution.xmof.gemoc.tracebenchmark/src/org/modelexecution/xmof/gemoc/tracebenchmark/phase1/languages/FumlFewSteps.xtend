package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import java.util.Map
import java.util.List
import org.modelexecution.xmof.examples.fuml.fumlfewsteps.trace.tracemanager.FumlConfigurationFewStepsTraceEngineAddon

class FumlFewSteps extends BenchmarkLanguage{
	
	new(Map<String, List<String>> inputModels) {
		super(inputModels)
	}
	
	override getFolderName() {
		"fumlFewerSteps"
	}
	
	override getLanguageFQN() {
		"org.modelexecution.examples.FumlFewSteps"
	}
	
	override getFullTraceAddon() {
		new FumlConfigurationFewStepsTraceEngineAddon
	}
	
	override getPartialTraceAddon() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getJavaTracePackageName() {
		"fumlConfigurationFewStepsTrace"
	}
	
	override getJavaExePackageName() {
		"fumlConfigurationFewSteps"
	}
	
}