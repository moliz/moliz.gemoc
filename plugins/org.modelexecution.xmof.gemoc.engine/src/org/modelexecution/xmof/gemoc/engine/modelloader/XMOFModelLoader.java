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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
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
import org.modelexecution.xmof.Semantics.Classes.Kernel.ObjectValue;
import org.modelexecution.xmof.Semantics.Classes.Kernel.Value;
import org.modelexecution.xmof.Semantics.CommonBehaviors.BasicBehaviors.ParameterValue;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.engine.internal.XMOFBasedModelLoader;
import org.modelexecution.xmof.gemoc.extension.sirius.ConvertToDynamicRepresentationCommand;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.osgi.framework.Bundle;

import fr.inria.diverse.trace.commons.model.trace.MSEModel;

public class XMOFModelLoader extends DefaultModelLoader {

	private XMOFBasedModel xmofBasedModel;
	private XMOFBasedModelLoader modelLoader;
	private MutableExectutionContext updatedContext;

	@Override
	public Resource loadModel(IExecutionContext context) throws RuntimeException {
		Resource resource = super.loadModel(context);
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resource.getResourceSet());
		// We manipulate the execution context so we can reuse the existing
		// implementation of the XMOFBasedModeLoader
		createAndUpdateContext(context, resource);
		modelLoader = new XMOFBasedModelLoader(updatedContext);
		xmofBasedModel = modelLoader.loadXMOFBasedModel();

		return xmofBasedModel.getModelResource();
	}

	@Override
	public Resource loadModelForAnimation(IExecutionContext context) throws RuntimeException {
		Resource oldResource = loadModel(context);

		// if the originally loaded input model was static we relink the aird
		// file used for animation to the dynamic model resource
		if (!modelLoader.inputIsConfigurationModel()) {
			adaptAirdForDynamicModel(updatedContext);
		}

		// Reuse default super implementation for loading and initializing the
		// animation session. Unfortunately a new ResourceSet is created which
		// means we have to adapt some references later on to ensure correct
		// functionality of animation and debugging
		Resource newResource = super.loadModelForAnimation(updatedContext);

		// Since we swapped the executionModel from static do dynamic we have to
		// create a new XMOFBasedModel with the updated resource
		createXMOFBasedModel(oldResource, newResource);

		return newResource;
	}

	private void createXMOFBasedModel(Resource oldResource, Resource newResource) {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(newResource);

		// The parameter values from the xMOFBasedModel are referencing elements
		// of a different ResourceSet
		// so we have to update those references
		List<ParameterValue> parameterValues = getUpdatedParameterValues(xmofBasedModel.getParameterValues(),
				oldResource, newResource);

		xmofBasedModel = new XMOFBasedModel(newResource.getContents(), parameterValues, editingDomain);

	}

	private Map<EObject, EObject> createObjectMap(Resource oldResource, Resource newResource) {
		Map<EObject, EObject> map = new HashMap<EObject, EObject>();
		List<EObject> keyList = oldResource.getContents();
		List<EObject> valueList = newResource.getContents();
		for (int i = 0; i < keyList.size(); i++) {
			map.put(keyList.get(i), valueList.get(i));
		}
		return map;
	}

	private List<ParameterValue> getUpdatedParameterValues(List<ParameterValue> inputParameterValues,
			Resource oldResource, Resource newResource) {

		List<ParameterValue> parameterValueConfiguration = new ArrayList<ParameterValue>();
		Map<EObject, EObject> objectMap = createObjectMap(oldResource, newResource);
		Copier copier = new EcoreUtil.Copier(true, false);
		copier.copyAll(inputParameterValues);
		copier.copyReferences();

		for (ParameterValue parameterValue : inputParameterValues) {
			ParameterValue parameterValueConf = (ParameterValue) copier.get(parameterValue);
			parameterValueConf.setParameter(parameterValue.getParameter());
			for (Value value : parameterValue.getValues()) {
				if (value instanceof ObjectValue) {
					ObjectValue objectValue = (ObjectValue) value;
					EObject referencedEObject = objectValue.getEObject();
					if (referencedEObject != null) {
						EObject referencedEObjectConf = objectMap.get(referencedEObject);
						ObjectValue objectValueConf = (ObjectValue) copier.get(value);
						objectValueConf.setEObject(referencedEObjectConf);
					}
				}
			}
			parameterValueConfiguration.add(parameterValueConf);
		}
		return parameterValueConfiguration;
	}

	private void createAndUpdateContext(IExecutionContext context, Resource resourceModel) {
		updatedContext = new MutableExectutionContext(context);
		updatedContext.resourceModel = resourceModel;

	}

	private void adaptAirdForDynamicModel(MutableExectutionContext executionContext) {
		URI dynamicModelURI = xmofBasedModel.getModelResource().getURI();
		ResourceSet resourceSet = executionContext.getResourceModel().getResourceSet();
		ConfigurationObjectMap configurationMap = modelLoader.getConfigurationMap();
		URI oldAirdURI = executionContext.getRunConfiguration().getAnimatorURI();
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);

		ConvertToDynamicRepresentationCommand cmd = new ConvertToDynamicRepresentationCommand(editingDomain,
				resourceSet, configurationMap, oldAirdURI, dynamicModelURI);

		editingDomain.getCommandStack().execute(cmd);
		URI newAirdURI = cmd.getDynamicAirdURI();
		// Manipulate the execution context to point to new dynamic URIs.
		// This enables the reuse of the super-class
		// loadModelForAnimation-method
		updateContext(dynamicModelURI, newAirdURI);

	}

	private void updateContext(URI executedModelURI, URI animatorURI) {
		MutableRunConfiguration runConfiguration = new MutableRunConfiguration(updatedContext.getRunConfiguration());
		runConfiguration.executedModelURI = executedModelURI;
		runConfiguration.animatorURI = animatorURI;
		updatedContext.runConfiguration = runConfiguration;
		updatedContext.resourceModel = null;

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
