/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.extension.sirius.modelloader;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IModelLoader;

public class XMOFModelLoader implements IModelLoader {

	@Override
	public Resource loadModel(IExecutionContext context) {
		Resource resource = null;
		ResourceSet resourceSet;
		resourceSet = new ResourceSetImpl();
		TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		resource = resourceSet.createResource(context.getRunConfiguration().getExecutedModelURI());
		try {
			resource.load(null);
		} catch (IOException e) {
			new RuntimeException(e);
		}
		return resource;
	}

	@Override
	public Resource loadModelForAnimation(IExecutionContext context) throws RuntimeException {
		return loadModel(context);
	}

	@Override
	public void setProgressMonitor(IProgressMonitor progressMonitor) {

	}

}
