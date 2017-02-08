package org.modelexecution.xmof.gemoc.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.modelexecution.xmof.configuration.ui.wizards.NewConfigurationWizard;
import org.modelexecution.xmof.configuration.ui.wizards.SelectEcoreModelFilePage;
import org.modelexecution.xmof.configuration.ui.wizards.SelectTargetFilePage;
import org.modelexecution.xmof.gemoc.ui.pages.NewGemocXmofCreationPage;

@SuppressWarnings("restriction")
public class NewGemocXmofProjectWizard extends NewConfigurationWizard {

  private PluginFieldData pluginData;
  private NewGemocXmofCreationPage newProjectCreationPage;

  public NewGemocXmofProjectWizard() {
    super();
    pluginData = new PluginFieldData();
  }

  @Override
  public void addPages() {
    selectEcoreModelFilePage = new NewGemocXmofCreationPage(selection, resourceSet);
    addPage(selectEcoreModelFilePage);

  }

}
