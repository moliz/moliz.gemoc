/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.ui.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;

@SuppressWarnings("restriction")
public class NewGemoXmofProjectCreationOperation extends NewProjectCreationOperation {

  private String xmofFolder;
  private IFolder generatedXmofFolder;

  public NewGemoXmofProjectCreationOperation(IFieldData data, IProjectProvider provider,
      IPluginContentWizard contentWizard, String xmofFolder) {
    super(data, provider, contentWizard);
    this.xmofFolder = xmofFolder;
  }

  @Override
  protected void createContents(IProgressMonitor monitor, IProject project)
      throws CoreException, JavaModelException, InvocationTargetException, InterruptedException {
    super.createContents(monitor, project);
    SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
    generatedXmofFolder = project.getFolder(xmofFolder);
    if (!generatedXmofFolder.exists()) {
      generatedXmofFolder.create(IResource.NONE, true, subMonitor);
    }

    subMonitor.setWorkRemaining(0);
  }

  public IFolder getGeneratedXmofFolder() {
    return generatedXmofFolder;
  }

}
