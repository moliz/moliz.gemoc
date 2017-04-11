/*
 * Copyright (c) 2017 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package org.modelexecution.xmof.examples.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelexecution.xmof.examples.deployer.Activator;

public class FSMLanguageExampleWizard extends AbstractExampleWizard {

	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.zip",
				"org.modelexecution.xmof.examples.fsm"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.design.zip",
				"org.modelexecution.xmof.examples.fsm.design"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.edit.zip",
				"org.modelexecution.xmof.examples.fsm.edit"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.editor.zip",
				"org.modelexecution.xmof.examples.fsm.editor"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.trace.zip",
				"org.modelexecution.xmof.examples.fsm.trace"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.xdsml.zip",
				"org.modelexecution.xmof.examples.fsm.xdsml"));
		projects.add(
				new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.modelexecution.xmof.examples.fsm.xmof.dynamic.zip",
						"org.modelexecution.xmof.examples.fsm.xmof.dynamic"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		return Activator.getDefault();
	}
}