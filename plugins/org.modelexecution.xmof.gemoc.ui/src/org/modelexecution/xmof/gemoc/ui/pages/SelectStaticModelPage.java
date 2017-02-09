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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.modelexecution.xmof.configuration.ui.wizards.SelectEcoreModelFilePage;

public class SelectStaticModelPage extends SelectEcoreModelFilePage {

  public SelectStaticModelPage(ISelection selection, ResourceSet resourceSet) {
    super(selection, resourceSet);

  }

  @Override
  public boolean canFlipToNextPage() {
    return super.canFlipToNextPage() && getNextPage() != null;
  }

}
