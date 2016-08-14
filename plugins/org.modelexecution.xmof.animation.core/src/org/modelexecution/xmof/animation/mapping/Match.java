/*******************************************************************************
 * Copyright (c) 2016
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.modelexecution.xmof.animation.mapping;

/**
 * Container class for events with names and xMOF-types
 * 
 * @author Matthias Hoellthaler (e1025709@student.tuwien.ac.at)
 * @author Tobias Ortmayr (e1026279@student.tuwien.ac.at)
 * @version 1.0
 *
 */
public class Match {

	private XMOFType type = XMOFType.UNKOWN;
	private String mseName;
	private String xmofElementName;
	private String callerObjectName;



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

	public XMOFType getType() {
		return type;
	}

	public void setType(XMOFType type) {
		this.type = type;
	}
	
	public String getCallerObjectName() {
		return callerObjectName;
	}

	public void setCallerObjectName(String invokerObjectName) {
		this.callerObjectName = invokerObjectName;
	}

}
