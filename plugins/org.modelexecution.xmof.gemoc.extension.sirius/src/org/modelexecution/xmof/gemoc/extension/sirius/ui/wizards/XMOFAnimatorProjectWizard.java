/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.extension.sirius.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.gemoc.xdsmlframework.extensions.sirius.Activator;
import org.eclipse.gemoc.xdsmlframework.extensions.sirius.wizards.NewGemocDebugRepresentationWizard;
import org.eclipse.gemoc.xdsmlframework.extensions.sirius.wizards.pages.DebugRepresentationSelectionPage;
import org.modelexecution.xmof.gemoc.extension.sirius.ui.command.AddAnimationLayerRunnable;

public class XMOFAnimatorProjectWizard extends NewGemocDebugRepresentationWizard {

  public XMOFAnimatorProjectWizard() {
    super();
    setWindowTitle("Create xMOF GEMOC debug/animator representation");
  }

  @Override
  public boolean performFinish() {
    if (!super.performFinish()) {
      return false;
    }

    IFile odesignFile = getOdesignFile();
    String diagramName = getDiagramName();

    final AddAnimationLayerRunnable finisher = new AddAnimationLayerRunnable(odesignFile,
        diagramName);
    try {
      getContainer().run(false, true, finisher);
    } catch (InvocationTargetException e) {
      Activator.getMessagingSystem().error(e.getMessage(), Activator.PLUGIN_ID, e);
    } catch (InterruptedException e) {
      Activator.getMessagingSystem().error(e.getMessage(), Activator.PLUGIN_ID, e);
    }

    return finisher.getResult();

  }

  private String getDiagramName() {
    if (getDebugRepresentationSelectionPage()
        .getSelected() == DebugRepresentationSelectionPage.ADD_DEBUG_LAYER) {
      return getSelectDiagramDefinitionPage().getSelectedDiagram().getName();
    } else {
      return getNewViewPointProjectPage().getDiagramName();
    }

  }

  private IFile getOdesignFile() {
    String filePath = getNewViewPointProjectPage().getProjectName() + "/description/"
        + getNewViewPointProjectPage().getViewpointSpecificationModelName();
    if (getDebugRepresentationSelectionPage()
        .getSelected() != DebugRepresentationSelectionPage.ADD_DEBUG_LAYER) {
      return ResourcesPlugin.getWorkspace().getRoot().getFile(Path.fromOSString(filePath));
    } else {
      DiagramDescription desc = getSelectDiagramDefinitionPage().getSelectedDiagram();
      return (IFile) ResourcesPlugin.getWorkspace().getRoot()
          .findMember(desc.eResource().getURI().toPlatformString(true));
    }

  }

}
