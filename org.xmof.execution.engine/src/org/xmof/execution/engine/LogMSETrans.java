package org.xmof.execution.engine;

import org.eclipse.emf.transaction.impl.EMFCommandTransaction;
import org.gemoc.executionframework.engine.mse.LogicalStep;
import org.gemoc.executionframework.engine.mse.MSEOccurrence;

public class LogMSETrans {
	private LogicalStep logicalStep = null;
	private MSEOccurrence mseOccurence = null;
	private EMFCommandTransaction transaction = null;

	public LogicalStep getLogicalStep() {
		return logicalStep;
	}

	public void setLogicalStep(LogicalStep logicalStep) {
		this.logicalStep = logicalStep;
	}

	public MSEOccurrence getMseOccurence() {
		return mseOccurence;
	}

	public void setMseOccurence(MSEOccurrence mseOccurence) {
		this.mseOccurence = mseOccurence;
	}

	public EMFCommandTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(EMFCommandTransaction transaction) {
		this.transaction = transaction;
	}

}