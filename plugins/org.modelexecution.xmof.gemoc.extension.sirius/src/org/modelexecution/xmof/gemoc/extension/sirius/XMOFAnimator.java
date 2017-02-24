/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.extension.sirius;

import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.gemoc.executionframework.engine.core.CommandExecution;
import org.modelexecution.xmof.configuration.ConfigurationObjectMap;
import org.modelexecution.xmof.gemoc.extension.sirius.internal.ConvertToDynamicRepresentationCommand;
import org.modelexecution.xmof.gemoc.extension.sirius.ui.Activator;
import org.modelexecution.xmof.gemoc.extension.sirius.util.XMOFAnimationUtil;

public class XMOFAnimator {

	private ConfigurationObjectMap configurationMap;
	private ResourceSet resourceSet;
	private URI animatorURI;
	private URI dynamicModelURI;
	private String debugModelID;

	public XMOFAnimator(ResourceSet resourceSet, URI animatorURI, URI dynamicModelURI,
			ConfigurationObjectMap configurationMap, String debugModelId) {
		this.resourceSet = resourceSet;
		this.animatorURI = animatorURI;
		this.dynamicModelURI = dynamicModelURI;
		this.configurationMap = configurationMap;
		this.debugModelID = debugModelId;
	}

	public void startAnimationSession() {
		if (!originalObjectsAreDynamic()) {
			transformAird();
		}
		IProgressMonitor monitor = new NullProgressMonitor();

		Session session;
		try {
			session = XMOFAnimationUtil.openDebugSiriuSession(animatorURI, monitor);
			boolean activateLayers = !(debugModelID == null || debugModelID.isEmpty());
			XMOFAnimationUtil.openSiriusEditor(session, monitor, activateLayers, debugModelID);
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}

	}

	private void transformAird() {
		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);
		ConvertToDynamicRepresentationCommand cmd = new ConvertToDynamicRepresentationCommand(editingDomain,
				resourceSet, configurationMap, animatorURI, dynamicModelURI);

		CommandExecution.execute(editingDomain, cmd);
		animatorURI = cmd.getDynamicAirdURI();

	}

	private boolean originalObjectsAreDynamic() {
		return new HashSet<EObject>(configurationMap.getConfigurationObjects())
				.equals(new HashSet<EObject>(configurationMap.getOriginalObjects()));
	}

	public void stopAnimationSession() {

	}

}
