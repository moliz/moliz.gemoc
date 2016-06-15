package org.modelexecution.xmof.gemoc.diffbenchmark.internal.java;

import java.util.Calendar;
import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingEvent;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingListener;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.TraceMatchingEvent.EventType;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.EMFUtil;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.Util;
import org.modelexecution.xmof.states.states.StateSystem;

import fumlConfiguration.Activities.IntermediateActivities.ActivityExecution;

public abstract class TraceMatcherJava {

	private ResourceSet resourceSet;
	
	private Resource leftModelResource;
	private Resource rightModelResource;
	
	private LinkedHashSet<TraceMatchingListener> listeners = new LinkedHashSet<TraceMatchingListener>();
	
	private boolean runtimeException = false;
	
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

//findActivityExecution(left);		
		boolean match = false;

		try {
			notifyMatchingStart();
			long start = getTime();
			match = match(left, right);
			long end = getTime();
			System.out.println(";" + (end - start));
			notifyMatchingEnd();
		} catch (Exception e) {
			runtimeException = true;
		}

		unloadResources();

		return match;
	}
	
	private void findActivityExecution(StateSystem stateSystem) {
		TreeIterator<EObject> eAllContents = stateSystem.eAllContents();
		while(eAllContents.hasNext()) {
			EObject next = eAllContents.next();
			if (next instanceof ActivityExecution) {
				System.out.println("found");
			}
		}
		
	}
	
	abstract protected boolean match(EObject left, EObject right);
		
	private void notifyMatchingStart() {
		notify(EventType.MATCHING_START);
	}
	
	private void notifyMatchingEnd() {
		notify(EventType.MATCHING_END);
	}

	private void notify(EventType eventType) {
		TraceMatchingEvent event = new TraceMatchingEvent(getTime(), eventType);
		for (TraceMatchingListener listener : listeners) {
			listener.notify(event);
		}
	}
	
	public void registerListener(TraceMatchingListener listener) {
		this.listeners.add(listener);
	}
	
	private long getTime() {
		Calendar c = Calendar.getInstance();
		return c.getTimeInMillis();
	}
	
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
}
