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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialNewWizard;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialTemplate;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.wizards.CreateNewGemocSequentialLanguageProject;
import org.modelexecution.xmof.gemoc.ui.Activator;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.IProjectContentWizard;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.ITemplateSection;
import fr.inria.diverse.melange.ui.MelangeUiModule;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;

public class XDSMLProjectGenerationHandler extends AbstractHandler {
  private NewMelangeProjectWizardFields context;
  private CustomizedTemplateWizard templateWizard = new CustomizedTemplateWizard();
  private CreateNewGemocSequentialLanguageProject delegate = new CreateNewGemocSequentialLanguageProject() {
    @Override
    public void addPages() {
      // avoid initialization of unused objects
    }

  };

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {

    init();
    final Job job = new Job("Generating code for " + "s") {

      @Override
      protected IStatus run(IProgressMonitor monitor) {
        boolean success = createXDSMLProject(monitor);
        return new Status(success ? Status.OK : Status.ERROR, Activator.PLUGIN_ID,
            (success ? "Code generated for " : "Error during code generation for ") + "S");
      }
    };
    job.schedule();

    return null;
  }

  // Adapted code from CreateNewGemocSequentialLanguageProject.performFinish()
  private boolean createXDSMLProject(IProgressMonitor monitor) {
    try {
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      final IProjectDescription description = workspace
          .newProjectDescription(this.context.projectName);
      if (!this.context.projectLocation.equals(workspace.getRoot().getLocation().toOSString()))
        description.setLocation(new Path(this.context.projectLocation));

      final IProject project = ResourcesPlugin.getWorkspace().getRoot()
          .getProject(this.context.projectName);

      project.create(description, monitor);
      project.open(monitor);
      delegate.addNaturesToProject(project);

      delegate.configureProject(project, monitor);

      // launch the template

      IProjectContentWizard contentWizard = new SequentialNewWizard();
      new ProjectTemplateApplicationOperation(context, project, contentWizard).run(monitor);

      // setClassPath(project, monitor);
      project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

    } catch (Exception exception) {
      MelangeUiModule.logErrorMessage(exception.getMessage(), exception);
      return false;
    }
    return true;

  }

  @SuppressWarnings("restriction")
  private void init() {

    context = delegate.getContext();

    updateData(context);
  }

  private void updateData(NewMelangeProjectWizardFields context) {
    context.projectName = "YourMami";
    templateWizard.updateOptions("full.packed", "fXSM");

  }

  class CustomizedTemplateWizard extends SequentialNewWizard {

    public void updateOptions(String packageName, String languageName) {
      ITemplateSection[] selections = getTemplateSections();
      SequentialTemplate selection = (SequentialTemplate) selections[0];
      selection.updateOptions(packageName, languageName);
    }

  }

}