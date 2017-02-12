/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;

public abstract class XMOFCommand extends AbstractHandler {

  protected IFile getXMOFFileFromSelection(ExecutionEvent event) {
    IProject project = null;
    ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage()
        .getSelection();
    if (selection != null && selection instanceof IStructuredSelection) {
      IStructuredSelection structuredSelection = (IStructuredSelection) selection;
      for (@SuppressWarnings("unchecked")
      Iterator<Object> selectionIterator = structuredSelection.iterator(); selectionIterator
          .hasNext();) {
        Object selectedElement = selectionIterator.next();
        if (selectedElement instanceof IResource) {
          IResource resource = (IResource) selectedElement;
          if (isXmofFile(resource)) {
            return (IFile) resource;
          }
          if (project == null)
            project = resource.getProject();
        }

      }
      return getFileFromXmofFolder(project);
    }
    return null;
  }

  private IFile getFileFromXmofFolder(IProject project) {
    try {
      for (IResource res : project.getFolder(XMOFProjectConstants.XMOF_FILE_FOLDER).members()) {
        if (isXmofFile(res))
          return (IFile) res;
      }
      return null;
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  private boolean isXmofFile(IResource resource) {
    return resource instanceof IFile
        && resource.getName().endsWith(XMOFProjectConstants.XMOF_FILE_EXTENSION);
  }
}
