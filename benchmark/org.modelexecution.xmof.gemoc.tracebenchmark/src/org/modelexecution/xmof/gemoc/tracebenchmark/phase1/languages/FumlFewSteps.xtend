package org.modelexecution.xmof.gemoc.tracebenchmark.phase1.languages

import java.util.Map
import java.util.List
import org.modelexecution.xmof.examples.fuml.fumlfewsteps.trace.tracemanager.FumlConfigurationFewStepsTraceEngineAddon

class FumlFewSteps extends BenchmarkLanguage {

	new(Map<String, List<String>> inputModels) {
		super(inputModels)
	}

	override getFolderName() {
		"fumlFewSteps"
	}

	override getLanguageFQN() {
		"org.modelexecution.examples.FumlFewSteps"
	}

	override getFullTraceAddon() {
		return null
	}

	override getPartialTraceAddon() {
		new FumlConfigurationFewStepsTraceEngineAddon
	}

	override getJavaTracePackageName() {
		"fumlConfigurationFewStepsTrace"
	}

	override getJavaExePackageName() {
		"fumlConfigurationFewSteps"
	}

}
