package org.modelexecution.xmof.gemoc.engine;

import org.gemoc.execution.sequential.javaxdsml.api.extensions.languages.SequentialLanguageDefinitionExtension;
import org.gemoc.execution.sequential.javaxdsml.api.extensions.languages.SequentialLanguageDefinitionExtensionPoint;
import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.commons.ModelExecutionContext;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IRunConfiguration;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;

public class XMOFExecutionModelContext extends ModelExecutionContext {

	public XMOFExecutionModelContext(IRunConfiguration runConfiguration,
			ExecutionMode executionMode) throws EngineContextException {
		super(runConfiguration, executionMode);
	}

	@Override
	public MSEModel getMSEModel() {
		return null;
	}

	@Override
	protected LanguageDefinitionExtension getLanguageDefinition(
			String languageName) throws EngineContextException {
		// TODO We want to remove this dependency to the sequential Kermeta
		SequentialLanguageDefinitionExtension languageDefinition = SequentialLanguageDefinitionExtensionPoint
				.findDefinition(_runConfiguration.getLanguageName());
		if (languageDefinition == null) {
			String message = "XMOF cannot find sequential xdsml definition for the language "
					+ _runConfiguration.getLanguageName()
					+ ", please verify that is is correctly deployed.";
			EngineContextException exception = new EngineContextException(
					message);
			throw exception;
		}
		return languageDefinition;
	}

}
