/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.mapping;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

import fr.inria.diverse.trace.commons.model.trace.MSE;

public class MappingService {
	private static final String MAIN = "main";
	private Set<String> activityNames;

	public MappingService(Set<String> activityNames) {
		super();
		this.activityNames = activityNames;
	}

	public Match matchDebugEvent(MSE debugevent) {

		EObject caller = debugevent.getCaller();
		EOperation action = debugevent.getAction();

		if (action != null && caller != null) {
			Match match = action instanceof BehavioredEOperation ? matchActivity(action) : matchNode(action);
			if (match != null) {
				match.setCallerObject(caller);
				match.setMseName(debugevent.getName());
				return match;
			}

		}
		return null;

	}

	private Match matchNode(EOperation action) {

		String actionName = action.getName();
		String[] args = actionName.split(":");
		if (args.length == 2) {
			String name = args[0];
			String type = args[1];
			if (name != null && !name.isEmpty() && type != null && !type.isEmpty()) {
				Match match = new Match();
				match.setXmofElementName(args[0].trim());
				match.setXmofType(Match.XMOF_ACTIVITYNODE);
				return match;
			}
		}
		return null;

	}

	private Match matchActivity(EOperation action) {
		Match match = new Match();
		if (activityNames.contains(action.getName())) {
			match.setXmofElementName(action.getName());
			if (action.getName().equals(MAIN)) {
				match.setXmofType(Match.XMOF_ACTIVITY_MAIN);
			} else {
				match.setXmofType(Match.XMOF_ACTIVITY);
			}

		}
		return match;
	}

}
