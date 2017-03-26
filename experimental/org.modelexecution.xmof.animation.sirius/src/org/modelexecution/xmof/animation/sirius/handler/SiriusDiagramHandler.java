/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.sirius.handler;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.description.AdditionalLayer;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.palette.ToolFilter;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.gemoc.executionframework.engine.core.CommandExecution;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionProvider;
import org.gemoc.executionframework.extensions.sirius.modelloader.PaletteUtils;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.animation.core.handler.DiagramHandler;


public class SiriusDiagramHandler extends DiagramHandler {

	private static final String ANIMATION_LAYER_NAME = "Animation";
	private Map<String, IEditorPart> diagramEditorMap = new HashMap<>();
	private static String SIRIUS_SPECIFICATION_FILE = "representations.aird";
	private URI airdURI;

	public SiriusDiagramHandler(URI modelURI) {
		super(modelURI);
		this.airdURI = createURI();
		killPreviousSiriusSession(airdURI);

	}

	private URI createURI() {
		URI siriusURI = URI.createURI("platform:/" + xmofModelURI.segment(0) + "/" + xmofModelURI.segment(1) + "/"
				+ SIRIUS_SPECIFICATION_FILE);
		return siriusURI;
	}

	/**
	 * A previous session needs to be killed before the animation can take place
	 * 
	 * @param sessionResourceURI
	 *            URI of session
	 */
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
	public void openOrShowDiagram(Activity activity) {
		String key = activity.getName().toUpperCase();
		if (diagramEditorMap.containsKey(key)) {
			activateDiagramEditor(key);
		} else {
			openDiagramEditor(key);
		}
	}

	public void refreshDiagram(String diagramKey) {
		String key = diagramKey.trim().toUpperCase();
		final Session session = SessionManager.INSTANCE.getExistingSession(airdURI);
		if (session == null || !diagramEditorMap.containsKey(key))
			return;
		DialectEditor editor = (DialectEditor) diagramEditorMap.get(key);

		Collection<DRepresentation> representations = Arrays.asList(editor.getRepresentation());
		TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();

		final RefreshRepresentationsCommand refresh = new RefreshRepresentationsCommand(editingDomain,
				new NullProgressMonitor(), representations);
		CommandExecution.execute(editingDomain, refresh);

	}

	private void openDiagramEditor(String key) {
		Session siriusSession = SessionManager.INSTANCE.getExistingSession(airdURI);
		if (siriusSession == null) {
			siriusSession=SessionManager.INSTANCE.getSession(airdURI, new NullProgressMonitor());
			
		}
		DAnalysis root = (DAnalysis) siriusSession.getSessionResource().getContents().get(0);
		DView dView = root.getOwnedViews().get(0);
		for (DRepresentationDescriptor representationDescriptor : dView.getOwnedRepresentationDescriptors()) {
			DRepresentation representation=representationDescriptor.getRepresentation();
			if (representation.getName().toUpperCase().contains(key)) {
				IEditorPart editor = DialectUIManager.INSTANCE.openEditor(siriusSession, representation,
						new NullProgressMonitor());
				disableToolsAndPalette(editor);
				diagramEditorMap.put(key, editor);
				return;
			}
		}

	}


	private void disableToolsAndPalette(IEditorPart editorPart) {
		if (editorPart instanceof DDiagramEditor) {
			((DDiagramEditor) editorPart).getPaletteManager().addToolFilter(new ToolFilter() {
				@Override
				public boolean filter(DDiagram diagram, AbstractToolDescription tool) {
					return true;
				}
			});
		}
		
		if (editorPart instanceof DiagramEditorWithFlyOutPalette) {
			PaletteUtils.colapsePalette((DiagramEditorWithFlyOutPalette) editorPart);
		}
		
	}

	

	private void activateDiagramEditor(String key) {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

			@Override
			public void run() {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = window.getActivePage();
				IEditorPart editor = diagramEditorMap.get(key);
				page.activate(editor);

			}
		});

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}