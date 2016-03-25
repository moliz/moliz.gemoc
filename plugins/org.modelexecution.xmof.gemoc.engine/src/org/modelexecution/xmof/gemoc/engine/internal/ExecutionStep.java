package org.modelexecution.xmof.gemoc.engine.internal;

public class ExecutionStep {

	private Object caller;
	private String className;
	private String methodName;
	
	public ExecutionStep(Object caller, String className, String methodName) {
		super();
		this.caller = caller;
		this.className = className;
		this.methodName = methodName;
	}

	public Object getCaller() {
		return caller;
	}

	public void setCaller(Object caller) {
		this.caller = caller;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
}
