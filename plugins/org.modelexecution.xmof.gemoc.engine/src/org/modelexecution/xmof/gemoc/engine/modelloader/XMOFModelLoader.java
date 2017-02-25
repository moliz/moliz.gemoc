/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.engine.modelloader;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.extensions.sirius.modelloader.DefaultModelLoader;
import org.gemoc.xdsmlframework.api.core.ExecutionMode;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IExecutionPlatform;
import org.gemoc.xdsmlframework.api.core.IExecutionWorkspace;
import org.gemoc.xdsmlframework.api.core.IRunConfiguration;
import org.gemoc.xdsmlframework.api.extensions.engine_addon.EngineAddonSpecificationExtension;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.internal.XMOFBasedModelLoader;
import org.modelexecution.xmof.gemoc.extension.sirius.ConvertToDynamicRepresentationCommand;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.osgi.framework.Bundle;

import fr.inria.diverse.trace.commons.model.trace.MSEModel;

public class XMOFModelLoader extends DefaultModelLoader {

	private XMOFBasedModel xmofBasedModel;
	private XMOFBasedModelLoader modelLoader;

	@Override
	public Resource loadModel(IExecutionContext context) throws RuntimeException {
		Resource resource = super.loadModel(context);
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resource.getResourceSet());
		return resource;
	}

	@Override
	public Resource loadModelForAnimation(IExecutionContext context) throws RuntimeException {
		Resource resource = loadModel(context);
		MutableExectutionContext executionContext = new MutableExectutionContext(context);
		executionContext.resourceModel = resource;
		modelLoader = new XMOFBasedModelLoader(executionContext);
		xmofBasedModel = modelLoader.loadXMOFBasedModel();
		if (modelLoader.isConfModel()) {
			transformToDynamic(executionContext);
		}

		return super.loadModelForAnimation(executionContext);
	}

	

	private void transformToDynamic(MutableExectutionContext executionContext) {
		URI dynamicModelURI = modelLoader.getConfigurationModelURI();
		ResourceSet resourceSet = executionContext.getResourceModel().getResourceSet();
		ConfigurationObjectMap configurationMap = modelLoader.getConfigurationMap();
		URI oldAirdURI = executionContext.getRunConfiguration().getAnimatorURI();
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);

		ConvertToDynamicRepresentationCommand cmd = new ConvertToDynamicRepresentationCommand(editingDomain,
				resourceSet, configurationMap, oldAirdURI, dynamicModelURI);
		editingDomain.getCommandStack().execute(cmd);
		URI newAirdURI = cmd.getDynamicAirdURI();
		updateExecutionContext(executionContext, dynamicModelURI, newAirdURI);
		// TODO: Maybe always transform executionModel to dynamic to avoid use of the dummy configurationMap?
	
	}

	private void updateExecutionContext(MutableExectutionContext executionContext, URI executedModelURI,
			URI animatorURI) {
		MutableRunConfiguration runConfiguration = new MutableRunConfiguration(executionContext.getRunConfiguration());
		runConfiguration.executedModelURI = executedModelURI;
		runConfiguration.animatorURI = animatorURI;
		executionContext.runConfiguration = runConfiguration;

	}

	public XMOFBasedModel getXMOFBasedModel() {
		return xmofBasedModel;
	}

	public XMOFBasedModelLoader getXMOFBasedModeLoader() {
		return modelLoader;
	}

	/**
	 * Wrapper class to enable adaptations of an existing ExecutionContext.
	 */
	class MutableExectutionContext implements IExecutionContext {
		LanguageDefinitionExtension languageDefinitionExtension;
		IExecutionWorkspace workspace;
		IExecutionPlatform executionPlatform;
		IRunConfiguration runConfiguration;
		Resource resourceModel;
		ExecutionMode executionMode;
		MSEModel mseModel;
		Bundle melangeBundle;
		IExecutionContext delegate;

		public MutableExectutionContext(IExecutionContext delegate) {
			this.delegate = delegate;
			languageDefinitionExtension = delegate.getLanguageDefinitionExtension();
			workspace = delegate.getWorkspace();
			executionMode = delegate.getExecutionMode();
			runConfiguration = delegate.getRunConfiguration();
			resourceModel = delegate.getResourceModel();
			executionMode = delegate.getExecutionMode();
			mseModel = delegate.getMSEModel();
			melangeBundle = delegate.getMelangeBundle();
		}

		@Override
		public void dispose() {
			delegate.dispose();

		}

		@Override
		public void initializeResourceModel() {
			delegate.initializeResourceModel();
		}

		@Override
		public LanguageDefinitionExtension getLanguageDefinitionExtension() {
			return languageDefinitionExtension;
		}

		@Override
		public IExecutionWorkspace getWorkspace() {
			return workspace;
		}

		@Override
		public IExecutionPlatform getExecutionPlatform() {
			return executionPlatform;
		}

		@Override
		public IRunConfiguration getRunConfiguration() {
			return runConfiguration;
		}

		@Override
		public Resource getResourceModel() {
			return resourceModel;
		}

		@Override
		public ExecutionMode getExecutionMode() {
			return executionMode;
		}

		@Override
		public MSEModel getMSEModel() {
			return mseModel;
		}

		@Override
		public Bundle getMelangeBundle() {
			return melangeBundle;
		}

	}

	/**
	 * Wrapper class to enable adaptations of an existing RunConfiguration.
	 *
	 */

	class MutableRunConfiguration implements IRunConfiguration {
		String languageName;
		URI executedModelURI;
		URI executedModelAsMelangeURI;
		String melangeQuery;
		URI animatorURI;
		int animationDelay;
		int deadlockDetectionDepth;
		Collection<EngineAddonSpecificationExtension> engineAddonExtensions;
		String modelEntryPoint;
		String modelInitializationsMethod;
		String modelInitializationArguments;
		String debugModelID;
		boolean breakStart;
		IRunConfiguration delegate;

		public MutableRunConfiguration(IRunConfiguration delegate) {
			this.delegate = delegate;
			languageName = delegate.getLanguageName();
			executedModelURI = delegate.getExecutedModelURI();
			executedModelAsMelangeURI = delegate.getExecutedModelAsMelangeURI();
			melangeQuery = delegate.getMelangeQuery();
			animatorURI = delegate.getAnimatorURI();
			animationDelay = delegate.getAnimationDelay();
			deadlockDetectionDepth = delegate.getDeadlockDetectionDepth();
			engineAddonExtensions = delegate.getEngineAddonExtensions();
			modelEntryPoint = delegate.getModelEntryPoint();
			modelInitializationArguments = delegate.getModelInitializationArguments();
			modelInitializationsMethod = delegate.getModelInitializationMethod();
			debugModelID = delegate.getDebugModelID();
			breakStart = delegate.getBreakStart();
		}

		@Override
		public String getLanguageName() {
			return languageName;
		}

		@Override
		public URI getExecutedModelURI() {
			return executedModelURI;
		}

		@Override
		public URI getExecutedModelAsMelangeURI() {
			return executedModelAsMelangeURI;
		}

		@Override
		public String getMelangeQuery() {
			return melangeQuery;
		}

		@Override
		public URI getAnimatorURI() {
			return animatorURI;
		}

		@Override
		public int getAnimationDelay() {
			return animationDelay;
		}

		@Override
		public int getDeadlockDetectionDepth() {
			return deadlockDetectionDepth;
		}

		@Override
		public Collection<EngineAddonSpecificationExtension> getEngineAddonExtensions() {
			return engineAddonExtensions;
		}

		@Override
		public String getExecutionEntryPoint() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getModelEntryPoint() {
			return modelEntryPoint;
		}

		@Override
		public String getModelInitializationMethod() {
			return modelInitializationsMethod;
		}

		@Override
		public String getModelInitializationArguments() {
			return modelInitializationArguments;
		}

		@Override
		public String getDebugModelID() {
			return debugModelID;
		}

		@Override
		public boolean getBreakStart() {
			return breakStart;
		}

	}
}
