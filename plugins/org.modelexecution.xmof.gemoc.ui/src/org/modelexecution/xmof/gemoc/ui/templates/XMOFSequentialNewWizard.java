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

import java.util.Map;

import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialNewWizard;
import org.gemoc.execution.sequential.javaxdsml.ide.ui.templates.SequentialTemplate;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.ITemplateSection;

public class XMOFSequentialNewWizard extends SequentialNewWizard {
  @Override
  public ITemplateSection[] createTemplateSections() {
    return new ITemplateSection[] { new XMOFSequentialTemplate() };
  }

  public void updateOptions(Map<String,String> optionsMap) {
    ITemplateSection[] selections = getTemplateSections();
    XMOFSequentialTemplate selection = (XMOFSequentialTemplate) selections[0];
    selection.updateOptions(optionsMap);
  }
  
  

}
