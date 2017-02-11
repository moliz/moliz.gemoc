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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess.OpOrElements;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialTemplate;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.wizards.CreateNewGemocSequentialLanguageProject;
import org.modelexecution.xmof.gemoc.ui.Activator;
import org.modelexecution.xmof.gemoc.ui.internal.TemplateData;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialNewWizard;
import org.modelexecution.xmof.gemoc.ui.templates.XMOFSequentialTemplate;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import fr.inria.diverse.melange.ui.MelangeUiModule;
import fr.inria.diverse.melange.ui.templates.melange.SimpleMTTemplate;
import fr.inria.diverse.melange.ui.wizards.pages.NewMelangeProjectWizardFields;

public class XDSMLProjectGenerationHandler extends XMOFCommand {

  private NewMelangeProjectWizardFields context;
  private XMOFSequentialNewWizard templateWizard = new XMOFSequentialNewWizard();
  private CreateNewGemocSequentialLanguageProject delegate = new CreateNewGemocSequentialLanguageProject() {
    @Override
    public void addPages() {
      // avoid initialization of unused objects
    }

  };

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
   
    init(event);
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

  private TemplateData loadData(ExecutionEvent event) {
    TemplateData temp = new TemplateData();
    temp.setProjectName("org.test.project.xdsml");
    temp.setPackageName("org.test.project");
    temp.setLanguageName("MyLanguage");
    temp.setEcoreModelFilePath("platform:/resource//org.modelexecution.notMof");
    temp.setXmofModelFilePath(
        "platform:/resource//org.modelexecution.xmof.examples.petrinet2.xmof");
    return temp;
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

      new ProjectTemplateApplicationOperation(context, project, templateWizard).run(monitor);

      // setClassPath(project, monitor);
      project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

    } catch (Exception exception) {
      MelangeUiModule.logErrorMessage(exception.getMessage(), exception);
      return false;
    }
    return true;

  }

  private void init(ExecutionEvent event) {
    context = delegate.getContext();
   
    TemplateData data = loadData(event);
    context.projectName=data.getProjectName();
    Map<String, String> optionMap = generateOptionsMap(data);
    templateWizard.updateOptions(optionMap);
  }

  private Map<String, String> generateOptionsMap(TemplateData data) {
    Map<String, String> optionsMap = new HashMap<String, String>();
    optionsMap.put(XMOFSequentialTemplate.KEY_ECOREFILE_PATH,data.getEcoreModelFilePath());
    optionsMap.put(XMOFSequentialTemplate.KEY_MELANGE_FILE_NAME,data.getLanguageName().toLowerCase());
    optionsMap.put(XMOFSequentialTemplate.KEY_METAMODEL_NAME, data.getLanguageName());
    optionsMap.put(XMOFSequentialTemplate.KEY_PACKAGE_NAME, data.getPackageName());
    optionsMap.put(XMOFSequentialTemplate.KEY_XMOFFILE_PATH,data.getXmofModelFilePath());
    return optionsMap;
  }


}