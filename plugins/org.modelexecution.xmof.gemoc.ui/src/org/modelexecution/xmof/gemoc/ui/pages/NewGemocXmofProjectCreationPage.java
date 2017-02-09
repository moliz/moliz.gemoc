/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.ui.pages;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.ui.wizards.plugin.AbstractFieldData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

@SuppressWarnings("restriction")
public class NewGemocXmofProjectCreationPage extends WizardNewProjectCreationPage {
  private static final int SIZING_TEXT_FIELD_WIDTH = 250;
  private static final String DEFAULT_MESSAGE = "Define project details";
  private AbstractFieldData data;
  private IStructuredSelection selection;
  private Text xmofNameField;
  private String initialxmofNameFieldValue = "model";

  public NewGemocXmofProjectCreationPage(String pageName, AbstractFieldData data,
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

    createXmofFileNameGroup(control);
    createWorkingSetGroup(control, selection,
        new String[] { "org.eclipse.jdt.ui.JavaWorkingSetPage",
            "org.eclipse.pde.ui.pluginWorkingSet", "org.eclipse.ui.resourceWorkingSetPage" });
    validate();
  }

  private final void createXmofFileNameGroup(Composite parent) {
    // project specification group
    Composite xmofGroup = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 2;
    xmofGroup.setLayout(layout);
    xmofGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    // new project label
    Label xmofFileLabel = new Label(xmofGroup, SWT.NONE);
    xmofFileLabel.setText("xMOF file name:");
    xmofFileLabel.setFont(parent.getFont());

    // new project name entry field
    xmofNameField = new Text(xmofGroup, SWT.BORDER);
    GridData data = new GridData(GridData.FILL_HORIZONTAL);
    data.widthHint = SIZING_TEXT_FIELD_WIDTH;
    xmofNameField.setLayoutData(data);
    xmofNameField.setFont(parent.getFont());

    // Set the initial value first before listener
    // to avoid handling an event during the creation.
    if (initialxmofNameFieldValue != null) {
      xmofNameField.setText(initialxmofNameFieldValue);
    }
    xmofNameField.addListener(SWT.Modify, nameModifyListener);
  }

  private Listener nameModifyListener = e -> {
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
    if (xmofNameField != null && xmofNameField.getText() != null) {
      xmofNameStringFieldContent = xmofNameField.getText();
    }

    if (xmofNameStringFieldContent.equals("")) {
      setErrorMessage("xMOF file name must be specified");
      return false;
    }

    setErrorMessage(null);
    setMessage(DEFAULT_MESSAGE);
    return true;
  }

  public void updateData() {
    data.setWorkingSets(getSelectedWorkingSets());
  }

  public String getXmofFileName() {
    return xmofNameField.getText();
  }

}
