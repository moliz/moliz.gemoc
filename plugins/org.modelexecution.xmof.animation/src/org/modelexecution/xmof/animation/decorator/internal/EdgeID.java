/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.decorator.internal;

import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.ActivityEdge;

/**
 * Combined ID for activity edges that include the source and target node IDs
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class EdgeID {

	private String sourceNodeId;
	private String targetNodeId;

	public EdgeID(ActivityEdge edge) {
		if (edge.getSource() != null) {
			sourceNodeId = edge.getSource().getName();
		}
		if (edge.getTarget() != null) {
			targetNodeId = edge.getTarget().getName();
		}
	}

	public EdgeID(String sourceNodeName, String targetNodeName) {
		super();

		this.sourceNodeId = sourceNodeName;
		this.targetNodeId = targetNodeName;

	}

	public String getSourceNodeName() {
		return sourceNodeId;
	}

	public String getTargetNodeName() {
		return targetNodeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sourceNodeId == null) ? 0 : sourceNodeId.hashCode());
		result = prime * result + ((targetNodeId == null) ? 0 : targetNodeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdgeID other = (EdgeID) obj;
		if (sourceNodeId == null) {
			if (other.sourceNodeId != null)
				return false;
		} else if (!sourceNodeId.equals(other.sourceNodeId))
			return false;
		if (targetNodeId == null) {
			if (other.targetNodeId != null)
				return false;
		} else if (!targetNodeId.equals(other.targetNodeId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "_" + "(" + sourceNodeId + "|" + targetNodeId + ")";
	}

}
