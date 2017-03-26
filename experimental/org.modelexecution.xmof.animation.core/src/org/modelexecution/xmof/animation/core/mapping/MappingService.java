/*******************************************************************************
 * Copyright (c) 2016 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Tobias Ortmayr - initial API and implementation
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.mapping;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;

import fr.inria.diverse.trace.commons.model.trace.MSE;

/**
 * Mapping for the debug events
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class MappingService {
	private static final String MAIN = "main";
	private Set<String> activityNames;

	public MappingService(Set<String> activityNames) {
		super();
		this.activityNames = activityNames;
	}

	public Match matchDebugEvent(MSE debugevent) {
		Match match = new Match(debugevent.getName());
		EObject caller = debugevent.getCaller();
		EOperation action = debugevent.getAction();
		if (action != null && caller != null) {
			match.setCallerObject(caller);
			if (action instanceof BehavioredEOperation) {
				matchActivity(action, match);
			} else {
				matchNode(action, match);
			}
		}
		return match;

	}

	private Match matchNode(EOperation action, Match match) {
		String actionName = action.getName();
		String[] args = actionName.split(":");
		if (args.length == 2) {
			String name = args[0];
			String type = args[1];
			if (name != null && !name.isEmpty() && type != null && !type.isEmpty()) {
				match.setXmofElementName(args[0].trim());
				match.setXmofType(Match.XMOF_ACTIVITYNODE);
			}
		}
		return match;

	}

	private Match matchActivity(EOperation action, Match match) {
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
