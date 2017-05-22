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

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.gemoc.engine.XMOFExecutionEngine;

public class AddStepAnnotationHandler extends AbstractHandler {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    BehavioredEOperation selectedOperation = getSelectedOperation(event);
    if (selectedOperation != null) {
      TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(selectedOperation);
      RecordingCommand cmd = new RecordingCommand(ed) {

        @Override
        protected void doExecute() {
          EAnnotation xmofAnnotation = selectedOperation
              .getEAnnotation(XMOFExecutionEngine.STEP_ANNOTATION_SOURCE);
          if (xmofAnnotation == null) {
            xmofAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
            xmofAnnotation.setSource(XMOFExecutionEngine.STEP_ANNOTATION_SOURCE);
          }
          xmofAnnotation.getDetails().put(XMOFExecutionEngine.STEP_ANNOTATION_KEY, "true");
          selectedOperation.getEAnnotations().add(xmofAnnotation);
        }
      };
      ed.getCommandStack().execute(cmd);
    }
    return null;
  }

  /**
   * Retrieves the BehavioredEOperation selected by the user
   * 
   * @param event
   *          Received event.
   * @return BehavioredEOperation selected by the user.
   */
  private BehavioredEOperation getSelectedOperation(ExecutionEvent event) {
    ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage()
        .getSelection();
    if (selection != null && selection instanceof IStructuredSelection) {
      IStructuredSelection structuredSelection = (IStructuredSelection) selection;
      for (Iterator<?> selectionIterator = structuredSelection.iterator(); selectionIterator
          .hasNext();) {
        Object selectedElement = selectionIterator.next();
        if (selectedElement instanceof BehavioredEOperation) {
          return (BehavioredEOperation) selectedElement;
        }
      }
    }
    return null;
  }
  
}
