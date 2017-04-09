/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.util.VMUtil;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.IPluginContentWizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.modelexecution.xmof.configuration.ui.wizards.NewConfigurationWizard;
import org.modelexecution.xmof.configuration.ui.wizards.SelectEcoreModelFilePage;
import org.modelexecution.xmof.configuration.ui.wizards.SelectTargetFilePage;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectUtil;

@SuppressWarnings("restriction")
public class NewXMOFProjectWizard extends NewConfigurationWizard {

  private PluginFieldData pluginData;
  private NewXMOFProjectCreationPage newProjectCreationPage;
  private IProjectProvider projectProvider;
  private NewXMOFProjectCreationOperation projectCreationOperation;

  public NewXMOFProjectWizard() {
    super();
    pluginData = new PluginFieldData();

  }

  @Override
  public void addPages() {
    newProjectCreationPage = new NewXMOFProjectCreationPage("New xMOF Project",
        pluginData, (IStructuredSelection) selection);
    newProjectCreationPage.setInitialProjectName(XMOFProjectConstants.DEFAULT_PROJECT_NAME);

    projectProvider = new IProjectProvider() {
      @Override
      public String getProjectName() {
        return newProjectCreationPage.getProjectName();
      }

      @Override
      public IProject getProject() {
        return newProjectCreationPage.getProjectHandle();
      }

      @Override
      public IPath getLocationPath() {
        return newProjectCreationPage.getLocationPath();
      }
    };

    selectEcoreModelFilePage = createSelectEcoreModelFilePage();
    selectTargetFilePage = createTargeFilePageMock();
    addPage(newProjectCreationPage);
    addPage(selectEcoreModelFilePage);
  }

  private SelectEcoreModelFilePage createSelectEcoreModelFilePage() {
    return new SelectEcoreModelFilePage(selection, resourceSet) {

      @Override
      public void createControl(Composite parent) {
        super.createControl(parent);
        browseEPackageRegistryButton.setVisible(false);
      }

      @Override
      public boolean canFlipToNextPage() {
        return super.canFlipToNextPage() && getNextPage() != null;
      }

      @Override
      public boolean isPageComplete() {
        return super.isPageComplete() && super.canFlipToNextPage();
      }

    };
  }

  private SelectTargetFilePage createTargeFilePageMock() {
    return new SelectTargetFilePage(selection) {

      @Override
      public IFile getModelFile() {
        if (projectCreationOperation == null
            || projectCreationOperation.getGeneratedXmofFolder() == null) {
          return null;
        }
        return projectCreationOperation.getGeneratedXmofFolder()
            .getFile(Path.fromOSString(getXmofFileString()));
      }

    };
  }

  private String getXmofFileString() {
    String name = newProjectCreationPage.getLanguageName();
    return name.toLowerCase().concat(XMOFProjectConstants.XMOF_FILE_EXTENSION);

  }

  @Override
  public boolean performFinish() {
    return createBasePluginProject() && super.performFinish() && storeXdsmlPreferences();
  }

  @Override
  public boolean canFinish() {
    return newProjectCreationPage.isPageComplete() && selectEcoreModelFilePage.isPageComplete();
  }

  private boolean createBasePluginProject() {
    try {
      updatePluginData();

      // If the PDE models are not initialized, initialize with option to cancel
      if (!PDECore.getDefault().areModelsInitialized()) {
        try {
          getContainer().run(true, true, new IRunnableWithProgress() {
            @Override
            public void run(IProgressMonitor monitor)
                throws InvocationTargetException, InterruptedException {
              // Target reloaded method clears existing models (which don't exist currently) and
              // inits them with a progress monitor
              PDECore.getDefault().getModelManager().targetReloaded(monitor);
              if (monitor.isCanceled()) {
                throw new InterruptedException();
              }
            }
          });
        } catch (InterruptedException e) {
          // Target platform will be empty, but project still can be created
        }
      }

      projectCreationOperation = new NewXMOFProjectCreationOperation(pluginData, projectProvider,
          null);
      getContainer().run(false, true, projectCreationOperation);

      IWorkingSet[] workingSets = newProjectCreationPage.getSelectedWorkingSets();
      if (workingSets.length > 0) {
        PlatformUI.getWorkbench().getWorkingSetManager()
            .addToWorkingSets(projectProvider.getProject(), workingSets);
      }
      return true;
    } catch (InvocationTargetException e) {
      PDEPlugin.logException(e);
    } catch (InterruptedException e) {
      PDEPlugin.logException(e);
    }
    return false;
  }

  private void updatePluginData() {
    newProjectCreationPage.updateData();
    // set Hardcoded default values
    pluginData.setSimple(false);
    pluginData.setSourceFolderName("src");
    pluginData.setOutputFolderName("bin");
    pluginData.setLegacy(false);
    pluginData.setTargetVersion(ICoreConstants.TARGET_VERSION_LATEST);
    pluginData.setHasBundleStructure(true);
    pluginData.setOSGiFramework(null);

    pluginData.setId(newProjectCreationPage.getProjectName());
    pluginData.setVersion(XMOFProjectConstants.PLUGIN_VERSION);
    pluginData.setName(XMOFProjectConstants.PLUGIN_NAME);
    pluginData.setProvider(XMOFProjectConstants.PLUGIN_VENDOR);
    pluginData.setDoGenerateClass(false);
    pluginData.setUIPlugin(false);
    pluginData.setRCPApplicationPlugin(false);
    pluginData.setEnableAPITooling(false);
    pluginData.setExecutionEnvironment(getDefaultExecutionEnvironment());
  }

  private String getDefaultExecutionEnvironment() {
    IVMInstall defaultVM = JavaRuntime.getDefaultVMInstall();
    for (IExecutionEnvironment exeEnv : VMUtil.getExecutionEnvironments()) {
      if (exeEnv.isStrictlyCompatible(defaultVM))
        return exeEnv.getId();
    }
    return PDEUIMessages.PluginContentPage_noEE;
  }

  private boolean storeXdsmlPreferences() {
    final Properties properties = createTemplateProperties();
    IRunnableWithProgress op = new IRunnableWithProgress() {
      public void run(IProgressMonitor monitor) throws InvocationTargetException {
        try {
          XMOFProjectUtil.persistXmofProperties(projectCreationOperation.getGeneratedProject(),
              properties, monitor);
        } finally {
          monitor.done();
        }
      }
    };
    try {
      getContainer().run(true, false, op);
    } catch (InterruptedException e) {
      return false;
    } catch (InvocationTargetException e) {
      Throwable realException = e.getTargetException();
      MessageDialog.openError(getShell(), "Error", realException.getMessage());
      return false;
    }
    return true;
  }

  private Properties createTemplateProperties() {
    Properties properties = new Properties();
    properties.put(XMOFProjectConstants.KEY_XDSMLPROJECT_NAME, getXdsmlProjectName());
    properties.put(XMOFProjectConstants.KEY_ECOREMODEL_FILE_PATH, getEcoreModelPath());
    properties.put(XMOFProjectConstants.KEY_PACAKGE_NAME,
        XMOFProjectUtil.getMelangePackageName(getXdsmlProjectName()));
    return properties;
  }

  private String getXdsmlProjectName() {
    return XMOFProjectUtil.getXDSMLProjectName(newProjectCreationPage.getProjectName());
  }

  private String getEcoreModelPath() {
    URI uri = selectEcoreModelFilePage.getMetamodelResource().getURI();
    if (uri.isHierarchical()) {
      // TODO: implement resolving of ns-uri to platform:// uri
    }
    return selectEcoreModelFilePage.getMetamodelResource().getURI().toString();

  }

  class NewXMOFProjectCreationOperation extends NewProjectCreationOperation {

    private IFolder generatedXmofFolder;
    private IProject generatedProject;

    public NewXMOFProjectCreationOperation(IFieldData data, IProjectProvider provider,
        IPluginContentWizard contentWizard) {
      super(data, provider, contentWizard);
    }

    @Override
    protected void createContents(IProgressMonitor monitor, IProject project)
        throws CoreException, JavaModelException, InvocationTargetException, InterruptedException {
      super.createContents(monitor, project);
      SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
      generatedProject = project;
      generatedXmofFolder = project.getFolder(XMOFProjectConstants.XMOF_FILE_FOLDER);
      if (!generatedXmofFolder.exists()) {
        generatedXmofFolder.create(IResource.NONE, true, subMonitor);
      }
      subMonitor.setWorkRemaining(0);
    }

    public IFolder getGeneratedXmofFolder() {
      return generatedXmofFolder;
    }

    public IProject getGeneratedProject() {
      return generatedProject;
    }
  }

}
