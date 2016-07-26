/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.decorator.internal;

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
public class ElementContainer {

	private String activeNode;
	private EdgeID activeEdge;
	private Set<String> traversedNodes = new HashSet<>();
	private Set<EdgeID> traversedEdges = new HashSet<>();

	public void setActiveNode(String nodeName) {
		if (nodeName != null) {
			activeNode = nodeName;
			traversedNodes.remove(activeNode);
		}

	}

	public void setActiveEdge(EdgeID edge) {
		if (edge != null) {
			activeEdge = edge;
			traversedEdges.remove(activeEdge);
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

	public String getActiveNode() {
		return activeNode;
	}

	public EdgeID getActiveEdge() {
		return activeEdge;
	}

	public Set<String> getTraversedNodes() {
		return Collections.unmodifiableSet(traversedNodes);

	}

	public Set<EdgeID> getTraversedEdges() {
		return Collections.unmodifiableSet(traversedEdges);
	}

}
