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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.modelexecution.xmof.gemoc.ui.internal.XMOFProjectConstants;

@SuppressWarnings("restriction")
public class NewXMOFProjectCreationPage extends WizardNewProjectCreationPage {
  private static final int SIZING_TEXT_FIELD_WIDTH = 250;
  private static final String DEFAULT_MESSAGE = "Define project details";
  private PluginFieldData data;
  private IStructuredSelection selection;
  private Text languageNameField;
  private String initiallanguageNameFieldValue = XMOFProjectConstants.DEFAULT_LANGUAGE_NAME;

  public NewXMOFProjectCreationPage(String pageName, PluginFieldData data,
      IStructuredSelection selection) {
    super(pageName);
    setTitle(pageName);
    this.data = data;
    this.selection = selection;

  }

  @Override
  public void createControl(Composite parent) {
    super.createControl(parent);
    Composite control = (Composite) getControl();
    GridLayout layout = new GridLayout();
    control.setLayout(layout);
    createLanguageNameGroup(control);
    createWorkingSetGroup(control, selection,
        new String[] { "org.eclipse.jdt.ui.JavaWorkingSetPage",
            "org.eclipse.pde.ui.pluginWorkingSet", "org.eclipse.ui.resourceWorkingSetPage" });
    validate();
  }

  private final void createLanguageNameGroup(Composite parent) {
    // project specification group
    Composite group = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 2;
    group.setLayout(layout);
    group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    // new project label
    Label languageLabel = new Label(group, SWT.NONE);
    languageLabel.setText("Language name:");
    languageLabel.setFont(parent.getFont());

    // new project name entry field
    languageNameField = new Text(group, SWT.BORDER);
    GridData data = new GridData(GridData.FILL_HORIZONTAL);
    data.widthHint = SIZING_TEXT_FIELD_WIDTH;
    languageNameField.setLayoutData(data);
    languageNameField.setFont(parent.getFont());

    // Set the initial value first before listener
    // to avoid handling an event during the creation.
    if (initiallanguageNameFieldValue != null) {
      languageNameField.setText(initiallanguageNameFieldValue);
    }
    languageNameField.addListener(SWT.Modify, langaugeNameModifyListener);
  }

  private Listener langaugeNameModifyListener = e -> {
    validate();
  };

  private void validate() {
    boolean valid = validatePage();
    setPageComplete(valid);

  }

  @Override
  protected boolean validatePage() {
    if (!super.validatePage()) {
      return false;
    }

    String xmofNameStringFieldContent = "";
    if (languageNameField != null && languageNameField.getText() != null) {
      xmofNameStringFieldContent = languageNameField.getText();
    }

    if (xmofNameStringFieldContent.equals("")) {
      setErrorMessage("Language name must be specified");
      return false;
    }

    setErrorMessage(null);
    setMessage(DEFAULT_MESSAGE);
    return true;
  }

  public void updateData() {
    data.setWorkingSets(getSelectedWorkingSets());
  }

  public String getLanguageName() {
    return languageNameField.getText();
  }

}
