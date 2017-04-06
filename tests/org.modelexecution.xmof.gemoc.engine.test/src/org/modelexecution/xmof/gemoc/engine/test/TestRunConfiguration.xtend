package org.modelexecution.xmof.gemoc.engine.test

import org.eclipse.emf.common.util.URI
import org.modelexecution.xmof.gemoc.engine.ui.commons.IXMOFRunConfiguration

class TestRunConfiguration implements IXMOFRunConfiguration {

	val String modelPath
	val String melangeQueryInput
	val String paramPath
	val String languageName

	new(String modelPath, String paramPath, String languageName, String melangeQueryInput) {
		this.modelPath = modelPath
		this.melangeQueryInput = melangeQueryInput
		this.paramPath = paramPath
		this.languageName = languageName
	}

	override getDeadlockDetectionDepth() { -1 }

	override getDebugModelID() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getExecutedModelAsMelangeURI() {
		if (melangeQueryInput == null || melangeQueryInput.isEmpty())
			return getExecutedModelURI;
		val String melangeURIString = getExecutedModelURI.toString().replace("platform:/", "melange:/") +
			melangeQueryInput;
		return URI.createURI(melangeURIString);
	}

	override getExecutedModelURI() { URI.createPlatformResourceURI(modelPath, true) }

	override getLanguageName() { languageName }

	override getMelangeQuery() { melangeQueryInput }

	override getModelInitializationModel() { paramPath }

	override getIgnoreSteps() { false }

	override getNodewiseStepping() { false }

	override getEngineAddonExtensions() { return #[] }

	override getAnimationDelay() { 0 }

	override getBreakStart() { false }

	override getAnimatorURI() { null }

	override getExecutionEntryPoint() { null }

	override getModelEntryPoint() { null }

	override getModelInitializationArguments() { null }

	override getModelInitializationMethod() { null }

}
