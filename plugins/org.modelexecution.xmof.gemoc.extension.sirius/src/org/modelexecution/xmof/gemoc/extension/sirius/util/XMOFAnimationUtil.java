/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.extension.sirius.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditorWithFlyOutPalette;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.DiagramExtensionDescription;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.tools.api.command.ChangeLayerActivationCommand;
import org.eclipse.sirius.diagram.ui.business.internal.command.RefreshDiagramOnOpeningCommand;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.palette.ToolFilter;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PlatformUI;
import org.gemoc.executionframework.engine.core.CommandExecution;
import org.gemoc.executionframework.extensions.sirius.debug.DebugSessionFactory;
import org.gemoc.executionframework.extensions.sirius.modelloader.DebugPermissionProvider;
import org.gemoc.executionframework.extensions.sirius.modelloader.PaletteUtils;
import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.modelexecution.xmof.gemoc.extension.sirius.ui.Activator;

import fr.obeo.dsl.debug.ide.sirius.ui.services.AbstractDSLDebuggerServices;

public class XMOFAnimationUtil {
	private static String DEBUG_LAYER_NAME = "Debug";
	private static String ANIMATION_LAYER_NAME = "Animation";

	private XMOFAnimationUtil() {
	};

	/**
	 * Implementation copied from DefaultModelLoader.killPreviousSiriusSession()
	 * 
	 * @param sessionResourceURI
	 */
	public static void killPreviousSiriusSession(URI sessionResourceURI) {
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

	/**
	 * Implementation artifacts reused from
	 * DefaultModelLoader.openNewSiriusSession()
	 * 
	 * @param sessionResourceURI
	 */
	public static Session openDebugSiriuSession(URI airdURI, IProgressMonitor monitor) throws CoreException {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		SubMonitor subMonitor = SubMonitor.convert(monitor, 3);
		subMonitor.newChild(1);
		ResourceSet rs = new ResourceSetImpl();
		final Session session = DebugSessionFactory.INSTANCE.createSession(rs, airdURI);

		session.open(subMonitor.newChild(2));
		return session;
	}

	public static void openSiriusEditor(Session session, IProgressMonitor monitor) {
		openSiriusEditor(session, monitor, false, null);
	}

	public static void openSiriusEditor(Session session, IProgressMonitor monitor, boolean activateLayers,
			String debugModelID) {
		if (monitor == null)
			monitor = new NullProgressMonitor();
		TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
		SubMonitor openEditorSubMonitor = SubMonitor.convert(monitor, 2);
		for (DView view : session.getSelectedViews()) {
			for (DRepresentationDescriptor repDescriptor : view.getOwnedRepresentationDescriptors()) {
				DRepresentation representation = repDescriptor.getRepresentation();

				final DSemanticDiagram diagram = (DSemanticDiagram) representation;
				openEditorSubMonitor.subTask(diagram.getName());

				final IEditorPart editorPart = DialectUIManager.INSTANCE.openEditor(session, representation,
						openEditorSubMonitor.newChild(1));

				filterTools(editorPart);
				refreshDiagram(editingDomain, diagram);
				// collapse the pallette
				if (editorPart instanceof DiagramEditorWithFlyOutPalette) {
					PaletteUtils.colapsePalette((DiagramEditorWithFlyOutPalette) editorPart);
				}

				if (activateLayers) {
					activateLayers(session, diagram, debugModelID, openEditorSubMonitor.newChild(1));
				}

			}
		}

	}

	private static void activateLayers(Session session, DSemanticDiagram diagram, String debugModelID,
			IProgressMonitor monitor) {
		TransactionalEditingDomain editingDomain = session.getTransactionalEditingDomain();
		RecordingCommand command = new RecordingCommand(editingDomain, "Activating animator and debug layers") {
			@Override
			protected void doExecute() {
				boolean hasADebugLayer = false;
				Set<Layer> layers = new HashSet<Layer>();
				layers.addAll(diagram.getDescription().getAdditionalLayers());
				Collection<Viewpoint> selectedVp = session.getSelectedViewpoints(true);
				for (Viewpoint vp : selectedVp) {
					for (RepresentationExtensionDescription extension : vp.getOwnedRepresentationExtensions()) {
						if (extension instanceof DiagramExtensionDescription) {
							layers.addAll(((DiagramExtensionDescription) extension).getLayers());
						}
					}
				}
				for (Layer l : layers) {
					String descName = diagram.getDescription().getName();
					String layerName = l.getName();
					boolean mustBeActiveForDebug = AbstractDSLDebuggerServices.LISTENER.isRepresentationToRefresh(
							debugModelID, descName, layerName) || layerName.equalsIgnoreCase(DEBUG_LAYER_NAME);
					boolean mustBeActiveForAnimation = AbstractGemocAnimatorServices.ANIMATOR.isRepresentationToRefresh(
							descName, layerName) || layerName.equalsIgnoreCase(ANIMATION_LAYER_NAME);
					boolean mustBeActive = mustBeActiveForAnimation || mustBeActiveForDebug;
					hasADebugLayer = hasADebugLayer || mustBeActiveForDebug;
					if (mustBeActive && !diagram.getActivatedLayers().contains(l)) {
						ChangeLayerActivationCommand c = new ChangeLayerActivationCommand(editingDomain, diagram, l,
								monitor);
						c.execute();
					}
				}

			}

		};
		CommandExecution.execute(editingDomain, command);

	}

	@SuppressWarnings("restriction")
	private static void refreshDiagram(TransactionalEditingDomain editingDomain, DSemanticDiagram diagram) {
		try {

			RefreshDiagramOnOpeningCommand refresh = new RefreshDiagramOnOpeningCommand(editingDomain, diagram);
			CommandExecution.execute(editingDomain, refresh);
		} catch (Exception e) {
			Activator.getDefault().getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Problem refreshing diagrams : " + diagram, e));
		}

	}

	private static void filterTools(IEditorPart editorPart) {
		// Filter tools during the execution session
		if (editorPart instanceof DDiagramEditor) {
			((DDiagramEditor) editorPart).getPaletteManager().addToolFilter(new ToolFilter() {
				@Override
				public boolean filter(DDiagram diagram, AbstractToolDescription tool) {
					return true;
				}
			});
		}

	}

}
