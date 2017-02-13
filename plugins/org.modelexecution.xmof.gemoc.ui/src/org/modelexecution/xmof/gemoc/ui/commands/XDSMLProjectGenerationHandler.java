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
import java.util.Properties;

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
import org.gemoc.execution.sequential.javaxdsml.ide.ui.wizards.CreateNewGemocSequentialLanguageProject;
import org.modelexecution.xmof.gemoc.ui.Activator;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialNewWizard;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import fr.inria.diverse.melange.ui.MelangeUiModule;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;

public class XDSMLProjectGenerationHandler extends XMOFCommand {

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

    final Job job = new Job("Generating xDSML project code for : " + languageName) {

      @Override
      protected IStatus run(IProgressMonitor monitor) {
        boolean success = createXDSMLProject(monitor);
        return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
            (success ? "xDSML project code generated for "
                : "Error during xDSML project code generation for ") + languageName);
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

      new ProjectTemplateApplicationOperation(context, project, templateWizard).run(monitor);

      // setClassPath(project, monitor);
      project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

    } catch (Exception exception) {
      MelangeUiModule.logErrorMessage(exception.getMessage(), exception);
      return false;
    }
    return true;

  }

  private Properties loadTemplateSettings() throws IOException, CoreException {
    IFile pref = xmofFile.getProject().getFile(XMOFProjectConstants.PREFERENCES_FILE_NAME);
    if (pref.exists()) {
      Properties props = new Properties();
      props.load(pref.getContents());
      props.put(XMOFSequentialTemplate.KEY_METAMODEL_NAME, getMetamodelname());
      props.put(XMOFSequentialTemplate.KEY_MELANGE_FILE_NAME, languageName);
      props.put(XMOFSequentialTemplate.KEY_PACKAGE_NAME, getPackageName());
      props.put(XMOFSequentialTemplate.KEY_XMOFFILE_PATH, getXMOFModelFilePath());
      return props;

    }
    return null;
  }

  private String getPackageName() {
    String packageName = getProjectName().replace(XMOFProjectConstants.DEFAULT_XDSML_SUFFIX, "")
        .toLowerCase();
    return cleanPackageName(packageName);

  }

  private String cleanPackageName(String packageName) {
    String cleanPackage = "";
    for (String fragment : packageName.split("\\.")) {
      if (!XMOFProjectConstants.RESERVED_MELANGE_KEYWORDS.contains(fragment)) {
        cleanPackage += fragment + ".";
      }
    }
    cleanPackage = cleanPackage.substring(0, cleanPackage.length() - 1);
    if (cleanPackage.isEmpty()) {
      return "xdsml";
    }
    return cleanPackage;
  }

  private Object getMetamodelname() {
    return languageName.substring(0, 1).toUpperCase() + languageName.substring(1);
  }

  private String getXMOFModelFilePath() {
    return URI.createPlatformResourceURI(xmofFile.getFullPath().toOSString(), false).toString();
  }

  private String getProjectName() {
    String projectName = xmofFile.getProject().getName();
    projectName = projectName.endsWith(XMOFProjectConstants.DEFAULT_XMOF_PROJECT_SUFFIX)
        ? projectName.replace(XMOFProjectConstants.DEFAULT_XMOF_PROJECT_SUFFIX, "") : projectName;
    return projectName + XMOFProjectConstants.DEFAULT_XDSML_SUFFIX;
  }

  private void init(ExecutionEvent event) {
    xmofFile = getXMOFFileFromSelection(event);
    context = delegate.getContext();
    context.projectName = getProjectName();
    languageName = xmofFile.getName().replace(XMOFProjectConstants.XMOF_FILE_EXTENSION, "");

  }

}