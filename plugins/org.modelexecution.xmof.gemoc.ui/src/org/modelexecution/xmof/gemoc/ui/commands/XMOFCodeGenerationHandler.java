/*
 * Copyright (c) 2016 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelexecution.xmof.gemoc.codegen.XMOFCodeGenerator;
import org.modelexecution.xmof.gemoc.ui.Activator;

public class XMOFCodeGenerationHandler extends XMOFCommand {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    final IFile xmofFile = getXMOFFileFromSelection(event);
    final Resource xmofResource = loadXMOFResource(xmofFile);

    String xmofFileName = xmofResource.getURI().lastSegment();
    final Job job = new Job("Generating code for " + xmofFileName) {

      @Override
      protected IStatus run(IProgressMonitor monitor) {
        XMOFCodeGenerator xmofCodeGenerator = new XMOFCodeGenerator();
        boolean success = xmofCodeGenerator.generateCode(xmofResource, monitor);
        return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
            (success ? "Code generated for " : "Error during code generation for ") + xmofFileName);
      }
    };
    job.schedule();

    return null;
  }

  private Resource loadXMOFResource(final IFile xmofFile) {
    final ResourceSet resourceSet = new ResourceSetImpl();
    final URI uri = URI.createPlatformResourceURI(xmofFile.getFullPath().toString(), true);
    return resourceSet.getResource(uri, true);
  }



}
