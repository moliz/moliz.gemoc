/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.core.decorator.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Container for a diagram element
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class ActivityElementContainer {

	private Set<String> activeNodes = new HashSet<>();
	private Set<EdgeID> activeEdges = new HashSet<>();
	private Set<String> traversedNodes = new HashSet<>();
	private Set<EdgeID> traversedEdges = new HashSet<>();

	public void addActiveNode(String nodeName) {
		if (nodeName != null) {
			activeNodes.add(nodeName);
			traversedNodes.remove(activeNodes);
		}

	}

	public void addActiveEdge(EdgeID edge) {
		if (edge != null) {
			activeEdges.add(edge);
			traversedEdges.remove(edge);
		}

	}

	public void addTraversedEdge(EdgeID edge) {
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

	public Set<EdgeID> getActiveEdges() {
		return activeEdges;
	}

	public Set<String> getTraversedNodes() {
		return Collections.unmodifiableSet(traversedNodes);

	}

	public Set<EdgeID> getTraversedEdges() {
		return Collections.unmodifiableSet(traversedEdges);
	}

}
