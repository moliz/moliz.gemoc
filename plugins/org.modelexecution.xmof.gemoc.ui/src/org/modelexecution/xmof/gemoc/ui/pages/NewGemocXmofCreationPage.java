package org.modelexecution.xmof.gemoc.ui.pages;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.pde.internal.ui.PDEUIMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea.IErrorMessageReporter;
import org.modelexecution.xmof.configuration.ui.wizards.SelectEcoreModelFilePage;

@SuppressWarnings("restriction")
public class NewGemocXmofCreationPage extends SelectEcoreModelFilePage {

  private static final int SIZING_TEXT_FIELD_WIDTH = 250;
  private Text projectNameField;
  private String initialProjectFieldValue;
  private ProjectContentsLocationArea locationArea;

  public NewGemocXmofCreationPage(ISelection selection, ResourceSet resourceSet) {
    super(selection, resourceSet);
    setTitle("Create a new GEMOC xMOF Language Project");
    // TODO Auto-generated constructor stub
  }

  @Override
  public void createControl(Composite parent) {
    super.createControl(parent);
    Composite composite = (Composite) getControl();
    createProjectNameGroup(composite);
    locationArea = new ProjectContentsLocationArea(getErrorReporter(), composite);
    if (initialProjectFieldValue != null) {
      locationArea.updateProjectName(initialProjectFieldValue);
    }
  }

  private final void createProjectNameGroup(Composite parent) {
    // project specification group
    Composite projectGroup = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 2;
    projectGroup.setLayout(layout);
    projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    // new project label
    Label projectLabel = new Label(projectGroup, SWT.NONE);
    projectLabel.setText("&Project name:");
    projectLabel.setFont(parent.getFont());

    // new project name entry field
    projectNameField = new Text(projectGroup, SWT.BORDER);
    GridData data = new GridData(GridData.FILL_HORIZONTAL);
    data.widthHint = SIZING_TEXT_FIELD_WIDTH;
    projectNameField.setLayoutData(data);
    projectNameField.setFont(parent.getFont());

    // Set the initial value first before listener
    // to avoid handling an event during the creation.
    if (initialProjectFieldValue != null) {
      projectNameField.setText(initialProjectFieldValue);
    }
    projectNameField.addListener(SWT.Modify, nameModifyListener);
    BidiUtils.applyBidiProcessing(projectNameField, BidiUtils.BTD_DEFAULT);
  }

  private Listener nameModifyListener = e -> {
    boolean valid = validatePage();
    setPageComplete(valid);

  };

  protected boolean validatePage() {
    String name = getProjectName();
    if (name.indexOf('%') >= 0) {
      setErrorMessage(PDEUIMessages.NewProjectCreationPage_invalidProjectName);
      return false;
    }

    String location = getLocationPath().toString();
    if (location.indexOf('%') >= 0) {
      setErrorMessage(PDEUIMessages.NewProjectCreationPage_invalidLocationPath);
      return false;
    }

    setMessage(null);
    return true;
  }

  public String getProjectName() {
    if (projectNameField == null) {
      return initialProjectFieldValue;
    }

    return getProjectNameFieldValue();
  }

  private String getProjectNameFieldValue() {
    if (projectNameField == null) {
      return ""; //$NON-NLS-1$
    }

    return projectNameField.getText().trim();
  }

  public IPath getLocationPath() {
    return new Path(locationArea.getProjectLocation());
  }

  private IErrorMessageReporter getErrorReporter() {
    return (errorMessage, infoOnly) -> {
      if (infoOnly) {
        setMessage(errorMessage, IStatus.INFO);
        setErrorMessage(null);
      } else
        setErrorMessage(errorMessage);
      boolean valid = errorMessage == null;
      if (valid) {
        valid = validatePage();
      }

      setPageComplete(valid);
    };
  }
}
