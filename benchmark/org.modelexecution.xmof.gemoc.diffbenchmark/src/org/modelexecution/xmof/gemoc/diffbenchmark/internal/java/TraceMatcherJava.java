package org.modelexecution.xmof.gemoc.diffbenchmark.internal.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.reporting.TraceReportEntry;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.EMFUtil;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.Util;
import org.modelexecution.xmof.states.states.StateSystem;

public abstract class TraceMatcherJava {

	private ResourceSet resourceSet;
	
	private Resource leftModelResource;
	private Resource rightModelResource;
	
	private boolean runtimeException = false;
	
	private long timeStart = -1;
	private long timeEnd = -1;
	
	private TraceReportEntry leftTraceReportEntry;
	private TraceReportEntry rightTraceReportEntry;
	
	public TraceMatcherJava() {
		setupResourceSet();
	}
	
	private void setupResourceSet() {
		resourceSet = EMFUtil.createResourceSet();
		EMFUtil.registerXMIFactory(resourceSet);
		EMFUtil.registerEcoreFactory(resourceSet);
	}
	
	public boolean match(String leftModelPath, String rightModelPath) {
		loadResources(leftModelPath, rightModelPath);

		EObject left = leftModelResource.getContents().get(0);
		EObject right = rightModelResource.getContents().get(0);
		computeTraceReportEntries();
		
		boolean match = false;
		try {
			match = doMatching(left, right);
		} catch (Exception e) {
			runtimeException = true;
		}

		unloadResources();

		return match;
	}

	private boolean doMatching(EObject left, EObject right) {
		boolean match;
		timeStart = System.nanoTime();
		match = match(left, right);
		timeEnd = System.nanoTime();
		System.out.println(";" + (timeEnd - timeStart));
		return match;
	}
	
	abstract protected boolean match(EObject left, EObject right);
	
	public boolean matchedWithoutErrors() {
		return !runtimeException;
	}

	private void loadResources(String leftModelPath, String rightModelPath) {
		leftModelResource = Util.loadResource(resourceSet, leftModelPath);
		rightModelResource = Util.loadResource(resourceSet, rightModelPath);
	}
	
	private void unloadResources() {
		for(Resource resource : resourceSet.getResources()) {
			try {
				resource.unload();
			} catch(Exception e) {
			}
		}
		resourceSet = null;
	}
	
	public long getTimeStart() {
		return timeStart;
	}
	
	public long getTimeEnd() {
		return timeEnd;
	}
	
	public TraceReportEntry getTraceReportEntryLeftModel() {
		return leftTraceReportEntry;
	}
	
	public TraceReportEntry getTraceReportEntryRightModel() {
		return rightTraceReportEntry;
	}
	
	private void computeTraceReportEntries() {
		leftTraceReportEntry = computeTraceReportEntry(leftModelResource);
		rightTraceReportEntry = computeTraceReportEntry(rightModelResource);
	}
	
	private TraceReportEntry computeTraceReportEntry(Resource modelResource) {
		return new TraceReportEntry(modelResource.getURI().toString(), computeStateNumber(modelResource));
	}

	private int computeStateNumber(Resource modelResource) {
		int statenumber = 0;
		EObject trace = modelResource.getContents().get(0);
		if (trace instanceof StateSystem) {
			StateSystem stateSystem = (StateSystem) trace;
			statenumber = stateSystem.getStates().size();
		} else {
			EStructuralFeature statesTraceFeature = trace.eClass().getEStructuralFeature("statesTrace");
			EList<?> statesTrace = (EList<?>)trace.eGet(statesTraceFeature);
			statenumber = statesTrace.size();
		}
		return statenumber;
	}
}
