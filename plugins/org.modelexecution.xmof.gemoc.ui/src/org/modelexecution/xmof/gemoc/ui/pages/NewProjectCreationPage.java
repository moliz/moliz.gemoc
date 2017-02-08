package org.modelexecution.xmof.gemoc.ui.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.AbstractFieldData;

@SuppressWarnings("restriction")
public class NewProjectCreationPage extends org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage{

  public NewProjectCreationPage(String pageName, AbstractFieldData data, boolean fragment,
      IStructuredSelection selection) {
    super(pageName, data, fragment, selection);

  }

}
