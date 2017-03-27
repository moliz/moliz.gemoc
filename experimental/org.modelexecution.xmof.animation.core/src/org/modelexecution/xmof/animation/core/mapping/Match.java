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

import org.eclipse.emf.ecore.EObject;

/**
 * Container class used by the mappingservice to store the result of the mapping process 
 * 
 */
public class Match {

	public final static String XMOF_ACTIVITY_MAIN = "MainActivity";
	public final static String XMOF_ACTIVITY = "Activity";
	public final static String XMOF_ACTIVITYNODE = "ActivityNode";

	private String mseName;
	private String xmofElementName;
	private String xmofType;
	private EObject callerObject;

	public Match() {
		super();
	}

	public Match(String mseName) {
		super();
		this.mseName = mseName;
	}

	public String getMseName() {
		return mseName;
	}

	public void setMseName(String mseOccurenceName) {
		this.mseName = mseOccurenceName;
	}

	public String getXmofElementName() {
		return xmofElementName;
	}

	public void setXmofElementName(String xmofElementName) {
		this.xmofElementName = xmofElementName.trim();
	}

	public String getXmofType() {
		return xmofType;
	}

	public void setXmofType(String xmofType) {
		this.xmofType = xmofType;
	}

	public EObject getCallerObject() {
		return callerObject;
	}

	public void setCallerObject(EObject callerObject) {
		this.callerObject = callerObject;
	}

}
