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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.internal.session.SessionTransientAttachment;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PlatformUI;
import org.gemoc.executionframework.extensions.sirius.debug.DebugSessionFactory;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionProvider;
import org.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.gemoc.xdsmlframework.api.core.IModelLoader;

@SuppressWarnings("restriction")
public class XMOFModelLoader implements IModelLoader {
	private IProgressMonitor progressMonitor;

	@Override
	public Resource loadModel(IExecutionContext context) {
		Resource resource = null;
		ResourceSet resourceSet;
		resourceSet = new ResourceSetImpl();
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
		Resource modelResource = loadModel(context);
		if (context.getRunConfiguration().getAnimatorURI() == null)
			return modelResource;

		killPreviousSiriusSession(context.getRunConfiguration().getAnimatorURI());
		try {
			openNewSiriusSession(context, context.getRunConfiguration().getAnimatorURI(), modelResource);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		return modelResource;

	}

	private Session openNewSiriusSession(IExecutionContext context, URI animatorURI, Resource modelResource)
			throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(this.progressMonitor, 5);
		subMonitor.newChild(1);
		final Session session = DebugSessionFactory.INSTANCE.createSession(modelResource.getResourceSet(), animatorURI);
		if (modelResource.getContents().size() > 0) {
			Resource res = modelResource.getContents().get(0).eResource(); // get
																			// the
																			// used
			// resource
			res.eAdapters().add(new SessionTransientAttachment(session));
		}
		subMonitor.subTask("Opening Sirius session");
		session.open(subMonitor.newChild(2));

		return session;
	}

	// TODO: Make method in superclass protected to avoid duplicated code
	private void killPreviousSiriusSession(URI sessionResourceURI) {
		final Session session = SessionManager.INSTANCE.getExistingSession(sessionResourceURI);
		if (session != null) {
			final IEditingSession uiSession = SessionUIManager.INSTANCE.getUISession(session);
			DebugPermissionProvider permProvider = new DebugPermissionProvider();
			if (!permProvider.provides(session.getTransactionalEditingDomain().getResourceSet())) {
				// this is a not debugSession (ie. a normal editing session)
				if (uiSession != null) {
					for (final DialectEditor editor : uiSession.getEditors()) {
						final IEditorSite editorSite = editor.getEditorSite();
						if (editor.getSite() == null) {
							editorSite.getShell().getDisplay().syncExec(new Runnable() {
								@Override
								public void run() {
									editorSite.getPage().closeEditor(editor, true);
								}
							});
						}
					}
					PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
						@Override
						public void run() {
							uiSession.close();
						}
					});
				}
			}
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					session.close(new NullProgressMonitor());
					SessionManager.INSTANCE.remove(session);
				}
			});
		}
	}

	@Override
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;

	}

}
