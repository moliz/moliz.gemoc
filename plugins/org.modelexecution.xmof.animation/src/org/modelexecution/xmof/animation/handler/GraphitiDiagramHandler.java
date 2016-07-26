/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.handler;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.presentation.KernelEditor;

/**
 * Handler for Graphiti animation service
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class GraphitiDiagramHandler extends DiagramHandler {

	private static final String KERNEL_EDITOR_ID = "org.modelexecution.xmof.Syntax.Classes.Kernel.presentation.KernelEditorID";

	private KernelEditor activeEditor;
	private Resource modelResource;

	public GraphitiDiagramHandler(Resource modelResource) {
		this.modelResource = modelResource;
		PlatformUI.getWorkbench().getDisplay().asyncExec((new Runnable() {
			@Override
			public void run() {
				openModel();
			}
		}));

	}

	public void openOrShowDiagram(Activity activity) {
		activeEditor.showDiagram(activity);
	}

	private boolean openModel() {
		IEditorInput editorInput = getEditorInput();

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		try {
			activeEditor = (KernelEditor) page.openEditor(editorInput, KERNEL_EDITOR_ID);

		} catch (PartInitException e) {
			e.printStackTrace();
			return false;

		}

		return true;

	}

	private IEditorInput getEditorInput() {
		URI modelPathURI = modelResource.getURI();
		return new URIEditorInput(modelPathURI);
	}

	public KernelEditor getKernelEditor() {
		return activeEditor;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
