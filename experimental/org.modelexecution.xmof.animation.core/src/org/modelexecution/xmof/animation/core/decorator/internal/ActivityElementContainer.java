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
package org.modelexecution.xmof.animation.core.decorator.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ActivityElementContainer {

	private Set<String> activeNodes = new HashSet<>();
	private Set<String> activeEdges = new HashSet<>();
	private Set<String> traversedNodes = new HashSet<>();
	private Set<String> traversedEdges = new HashSet<>();

	public void addActiveNode(String nodeName) {
		if (nodeName != null) {
			activeNodes.add(nodeName);
			traversedNodes.remove(nodeName);
		}

	}

	public void addActiveEdge(String edge) {
		if (edge != null) {
			activeEdges.add(edge);
			traversedEdges.remove(edge);
		}

	}

	public void addTraversedEdge(String edge) {
		if (edge != null) {
			traversedEdges.add(edge);
		}
	}

	public void addTraversedNode(String node) {
		if (node != null) {
			traversedNodes.add(node);
		}
	}

	public Set<String> getActiveNodes() {
		return activeNodes;
	}

	public Set<String> getActiveEdges() {
		return activeEdges;
	}

	public Set<String> getTraversedNodes() {
		return Collections.unmodifiableSet(traversedNodes);

	}

	public Set<String> getTraversedEdges() {
		return Collections.unmodifiableSet(traversedEdges);
	}

}
