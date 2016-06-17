package org.modelexecution.xmof.gemoc.diffbenchmark.internal.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fumlConfigurationFewSteps.ElementConfiguration;
import fumlConfigurationFewSteps.OpaqueActionConfiguration;
import fumlConfigurationFewStepsTrace.SpecificTrace;
import fumlConfigurationFewStepsTrace.States.ActionActivation_firing_Value;
import fumlConfigurationFewStepsTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationFewStepsTrace.States.State;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;

public class PartialTraceMatcherJava extends TraceMatcherJava {
	
	public boolean match(EObject left, EObject right) {
		return compareTraces((SpecificTrace)left, (SpecificTrace)right);
	}
	
	private boolean compareTraces(SpecificTrace left, SpecificTrace right) {
		List<OpaqueActionConfiguration> leftFiringActions = collectFiringActions(left);
		List<OpaqueActionConfiguration> rightFiringActions = collectFiringActions(right);
		return matchesOrdered(leftFiringActions, rightFiringActions);
	}

	private List<OpaqueActionConfiguration> collectFiringActions(SpecificTrace self) {
		Map<Integer, OpaqueActionConfiguration> firingActionsMap = new HashMap<Integer, OpaqueActionConfiguration>();
		for (TracedActionActivation tracedAction :  self.getBasicActionsFewSteps_tracedActionActivations()){
			OpaqueActionConfiguration action = getAction(tracedAction);
			for (ActionActivation_firing_Value firingTrace : tracedAction.getFiringSequence()) {
				if(firingTrace.isFiring()) {
					State state = firingTrace.getStates().get(0);
					int stateIndex = self.getStatesTrace().indexOf(state);
					firingActionsMap.put(stateIndex, action);
				}
			}
		}
		List<OpaqueActionConfiguration> firingActions = new ArrayList<OpaqueActionConfiguration>();
		List<Integer> sortedStateIndexes = new ArrayList<Integer>(firingActionsMap.keySet());
		Collections.sort(sortedStateIndexes);
		for(Integer index : sortedStateIndexes) {
			firingActions.add(firingActionsMap.get(index));
		}
		return firingActions;
	}

	private OpaqueActionConfiguration getAction(TracedActionActivation self) {
		OpaqueActionConfiguration action = null;
		for (SemanticVisitor_runtimeModelElement_Value runtimeModelElementState : self.getRuntimeModelElementSequence()) {
			ElementConfiguration runtimeModelElement = runtimeModelElementState.getRuntimeModelElement();
			if(runtimeModelElement != null) {
				action = (OpaqueActionConfiguration)runtimeModelElement;
//				TracedOpaqueActionConfiguration tracedOpaqueActionConfiguration = (TracedactionconOpaqueActionConfiguration) runtimeModelElement;
//				action = (OpaqueActionConfiguration)tracedOpaqueActionConfiguration.getOriginalObject_ActivityContentConfiguration();
			}
		}
		return action;
	}
	
	private boolean matches(OpaqueActionConfiguration left, OpaqueActionConfiguration right) {
		return compareActions(left, right);
	}

	private boolean compareActions(OpaqueActionConfiguration left, OpaqueActionConfiguration right) {
		return left.getName().equals(right.getName());
	}

	///////////////////////////////////////////////////////////////////////////////////////
	
	private boolean matchesOrdered(List<OpaqueActionConfiguration> left, List<OpaqueActionConfiguration> right) {
		if(left.size() != right.size()) {
			return false;
		}
		if(left.size()==0 && right.size() == 0) {
			return true;
		}
		boolean matches = true;
		Iterator<OpaqueActionConfiguration> leftIterator = left.iterator();
		Iterator<OpaqueActionConfiguration> rightIterator = right.iterator();		
		while (leftIterator.hasNext() && matches) {
			OpaqueActionConfiguration source = leftIterator.next();
			OpaqueActionConfiguration target = rightIterator.next();
			if (!matches(source, target)) {
				matches = false;
			}
		}
		return matches;
	}
}
