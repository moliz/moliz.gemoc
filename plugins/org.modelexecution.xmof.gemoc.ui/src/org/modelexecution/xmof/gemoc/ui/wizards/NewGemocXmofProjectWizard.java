package org.modelexecution.xmof.gemoc.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.modelexecution.xmof.configuration.ui.wizards.NewConfigurationWizard;
import org.modelexecution.xmof.configuration.ui.wizards.SelectEcoreModelFilePage;
import org.modelexecution.xmof.gemoc.ui.pages.NewProjectCreationPage;

public class NewGemocXmofProjectWizard extends NewConfigurationWizard {

  private PluginFieldData pluginData;
  private NewProjectCreationPage newProjectCreationPage;

  public NewGemocXmofProjectWizard() {
    super();
    pluginData = new PluginFieldData();
  }

  @Override
  public void addPages() {
    selectEcoreModelFilePage = new SelectEcoreModelFilePage(selection, resourceSet);
    newProjectCreationPage = new NewProjectCreationPage("second", pluginData, false,
        (IStructuredSelection) getSelection());
  }

}
