/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */

package org.modelexecution.xmof.gemoc.ui.commands;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class AllGenerationHandler extends AbstractHandler {
  private List<AbstractHandler> commands;

  public AllGenerationHandler() {
    super();
    commands = Arrays.asList(new XMOFCodeGenerationHandler(), new XDSMLProjectGenerationHandler());

  }

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    for (AbstractHandler command : commands) {
      command.execute(event);
    }
    return null;
  }

}
