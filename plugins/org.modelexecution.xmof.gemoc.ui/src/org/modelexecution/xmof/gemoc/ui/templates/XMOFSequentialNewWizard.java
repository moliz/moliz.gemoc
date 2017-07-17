/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.ui.templates;

import java.util.Properties;

import org.eclipse.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialNewWizard;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.ITemplateSection;

public class XMOFSequentialNewWizard extends SequentialNewWizard {
  @Override
  public ITemplateSection[] createTemplateSections() {
    return new ITemplateSection[] { new XMOFSequentialTemplate() };
  }

  public void updateOptions(Properties properties) {
    ITemplateSection[] selections = getTemplateSections();
    XMOFSequentialTemplate selection = (XMOFSequentialTemplate) selections[0];
    selection.updateOptions(properties);
  }

}
