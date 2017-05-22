/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 */
package org.modelexecution.xmof.gemoc.engine.ui.debug;

import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.execution.sequential.javaengine.ui.debug.GenericSequentialModelDebugger;
import org.gemoc.executionframework.debugger.GemocBreakpoint;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;

import fr.inria.diverse.melange.resource.MelangeResource;
import fr.inria.diverse.trace.commons.model.trace.MSEOccurrence;
import fr.obeo.dsl.debug.ide.event.IDSLDebugEventProcessor;

public class XMOFSequentialModelDebugger extends GenericSequentialModelDebugger {

	private MelangeResource melangeResource = null;

	public XMOFSequentialModelDebugger(IDSLDebugEventProcessor target, IExecutionEngine engine) {
		super(target, engine);
		if (engine.getExecutionContext().getResourceModel() instanceof MelangeResource) {
			melangeResource = (MelangeResource) engine.getExecutionContext().getResourceModel();
		}
	}

	@Override
	public boolean shouldBreak(EObject instruction) {
		if (super.shouldBreak(instruction)) {
			return true;
		}
		if (instruction instanceof MSEOccurrence) {
			EObject caller = ((MSEOccurrence) instruction).getMse().getCaller();
			if (hasRegularBreakpointTrue(caller)) {
				return true;
			}
		}

		return false;

	}

	private boolean hasRegularBreakpointTrue(EObject o) {
		EObject target = o;
		Resource res = o.eResource();
		if (melangeResource != null) {
			target = melangeResource.getWrappedResource().getEObject(res.getURIFragment(o));
		}

		return shouldBreakOnCaller(target) && (Boolean
				.valueOf((String) getBreakpointAttributes(target, GemocBreakpoint.BREAK_ON_LOGICAL_STEP))
				|| Boolean.valueOf((String) getBreakpointAttributes(target, GemocBreakpoint.BREAK_ON_MSE_OCCURRENCE)));
	}

	public boolean shouldBreakOnCaller(EObject instruction) {
		final boolean res;

		res = getBreakpointAttributes(instruction, IBreakpoint.ENABLED) == Boolean.TRUE;

		return res;
	}
}
