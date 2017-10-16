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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.gemoc.execution.sequential.javaxdsml.ide.ui.wizards.CreateNewGemocSequentialLanguageProject;
import org.modelexecution.xmof.gemoc.ui.Activator;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectUtil;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialNewWizard;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import fr.inria.diverse.melange.ui.MelangeUiModule;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;

public class XDSMLProjectGenerationHandler extends AbstractHandler {

  private NewMelangeProjectWizardFields context;
  private XMOFSequentialNewWizard templateWizard = new XMOFSequentialNewWizard();
  private IFile xmofFile;
  private String languageName;

  private CreateNewGemocSequentialLanguageProject delegate = new CreateNewGemocSequentialLanguageProject() {
    @Override
    public void addPages() {
      // avoid initialization of unused objects
    }

  };

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    init(event);

    final Job job = new Job("Generating xDSML project  for : " + languageName) {

      @Override
      protected IStatus run(IProgressMonitor monitor) {
        boolean success = createXDSMLProject(monitor);
        return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
            (success ? "xDSML project code generated for "
                : "Error during xDSML project  generation for ") + languageName);
      }
    };
    job.schedule();

    return null;
  }

  // Adapted code from CreateNewGemocSequentialLanguageProject.performFinish()
  private boolean createXDSMLProject(IProgressMonitor monitor) {
    try {
      Properties properties = loadTemplateSettings();
      if (properties != null) {
        templateWizard.updateOptions(properties);
      }

      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final IProjectDescription description = workspace
          .newProjectDescription(this.context.projectName);
      if (!this.context.projectLocation.equals(workspace.getRoot().getLocation().toOSString()))
        description.setLocation(new Path(this.context.projectLocation));

      final IProject project = ResourcesPlugin.getWorkspace().getRoot()
          .getProject(this.context.projectName);
      if (project.exists()) {
        project.delete(true, monitor);
      }
      project.create(description, monitor);
      project.open(monitor);
      delegate.addNaturesToProject(project);

      delegate.configureProject(project, monitor);

      // launch the template

      new ProjectTemplateApplicationOperation( context, project, templateWizard).run(monitor);

      // Easy workaround to ensure correct generation of all necessary extensions:
      // Open and save the newly generated .melange file
      PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

        @Override
        public void run() {
          generatePluginXML(project, monitor);

        }
      });

      project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
    } catch (InterruptedException | CoreException | InvocationTargetException | IOException ex) {
      MelangeUiModule.logErrorMessage(ex.getMessage(), ex);
      return false;
    }
    return true;

  }

  private void generatePluginXML(IProject project, IProgressMonitor monitor) {
    IEditorPart part;
    try {
      IWorkbenchPage page = getCurrentWorkbenchPage();
      IFile melangeFile = project.getFolder("src" + "/" + getPackageName().replace(".", "/"))
          .getFile(getMelangeFileName() + ".melange");
      IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
          .getDefaultEditor(melangeFile.getName());

      part = page.openEditor(new FileEditorInput(melangeFile), desc.getId());
      part.doSave(monitor);

    } catch (PartInitException e) {
      e.printStackTrace();
    }

  }

  private IWorkbenchPage getCurrentWorkbenchPage() {
    if (PlatformUI.getWorkbench() != null
        && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
      return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    }
    return null;
  }

  private Properties loadTemplateSettings() throws IOException, CoreException {
    Properties props = XMOFProjectUtil.loadXmofProperties(xmofFile.getProject());
    if (props != null) {
      props.put(XMOFSequentialTemplate.METAMODEL_NAME, getMetamodelname());
      props.put(XMOFSequentialTemplate.KEY_MELANGE_FILE_NAME, getMelangeFileName());
      props.put(XMOFSequentialTemplate.KEY_PACKAGE_NAME, getPackageName());
      props.put(XMOFSequentialTemplate.KEY_XMOFFILE_PATH, getXMOFModelFilePath());
      return props;

    }
    return null;
  }

  private String getPackageName() {
    return XMOFProjectUtil.getMelangePackageName(xmofFile.getProject().getName());
  }

  private String getMelangeFileName() {
    return languageName.toLowerCase();
  }

  private String getMetamodelname() {
    return languageName.substring(0, 1).toUpperCase() + languageName.substring(1);
  }

  private String getXMOFModelFilePath() {
    return URI.createPlatformResourceURI(xmofFile.getFullPath().toOSString(), false).toString();
  }

  private void init(ExecutionEvent event) {
    xmofFile = XMOFProjectUtil.getXMOFFileFromSelection(event);
    context = delegate.getContext();
    context.projectName = getProjectName();
    languageName = xmofFile.getName().replace(XMOFProjectConstants.XMOF_FILE_EXTENSION, "");

  }

  private String getProjectName() {
    return XMOFProjectUtil.getXDSMLProjectName(xmofFile.getProject().getName());

  }

}