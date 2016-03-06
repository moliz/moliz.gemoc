package org.xmof.execution.engine;

import org.gemoc.executionframework.engine.commons.EngineContextException;
import org.gemoc.executionframework.engine.commons.ModelExecutionContext;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IRunConfiguration;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;
import org.xmof.execution.xdsml.api.extensions.languages.XMOFLanguageDefinitionExtension;
import org.xmof.execution.xdsml.api.extensions.languages.XMOFLanguageDefinitionExtenstionPoint;

public class XMOFExecutionModelContext extends ModelExecutionContext {

	public XMOFExecutionModelContext(IRunConfiguration runConfiguration,
			ExecutionMode executionMode) throws EngineContextException {
		super(runConfiguration, executionMode);
	}

	@Override
	public MSEModel getMSEModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected LanguageDefinitionExtension getLanguageDefinition(
			String languageName) throws EngineContextException {
		XMOFLanguageDefinitionExtension languageDefinition = XMOFLanguageDefinitionExtenstionPoint
				.findDefinition(_runConfiguration.getLanguageName());
		if (languageDefinition == null)
		{
			String message = "XMOFCannot find sequential xdsml definition for the language " + _runConfiguration.getLanguageName()
					+ ", please verify that is is correctly deployed.";
			EngineContextException exception = new EngineContextException(message);
			throw exception;
		}
		return languageDefinition;
	}

}
