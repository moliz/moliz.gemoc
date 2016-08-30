package org.modelexecution.xmof.gemoc.diffbenchmark.internal.java;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.OpaqueAction;
import org.modelexecution.xmof.states.states.State;
import org.modelexecution.xmof.states.states.StateSystem;

import fumlConfiguration.Actions.BasicActions.OpaqueActionActivation;
import fumlConfiguration.Activities.IntermediateActivities.ActivityExecution;
import fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation;
import fumlConfiguration.Classes.Kernel.ExtensionalValue;
import fumlConfiguration.Loci.ExecutionEnvironment;
import fumlConfiguration.Loci.Locus;

public class GenericTraceMatcherJava extends TraceMatcherJava {
	
	public boolean match(EObject left, EObject right) {
		return compareTraces((StateSystem)left, (StateSystem)right);
	}
	
	private boolean compareTraces(StateSystem left, StateSystem right) {
		OrderedSet<State> leftFiringActionStates = getStatesWithFiringAction(left);
		OrderedSet<State> rightFiringActionStates = getStatesWithFiringAction(right);
		return matchesOrdered(leftFiringActionStates, rightFiringActionStates);
	}

	private OrderedSet<State> getStatesWithFiringAction(StateSystem self) {
		OrderedSet<State> statesWithFiringAction = new OrderedSet<State>();
		int i = 0;
		while (i < self.getStates().size()) {
			State state = self.getStates().get(i);
			if (hasFiringAction(state)) {
				if (statesWithFiringAction.size() == 0) {
					statesWithFiringAction.add(state);
				} else {
					State previousState = self.getStates().get(i-1);
					if (!compareStates(state, previousState)) {
						statesWithFiringAction.add(state);
					}
				}
			}
			i = i+1;
		}
		return statesWithFiringAction;
	}
	
	private boolean hasFiringAction(State self) {
		OrderedSet<OpaqueActionActivation> firingActions = getFiringActions(self);
		return firingActions.size() > 0;
	}
	
	private OrderedSet<OpaqueActionActivation> getFiringActions(State self) {
		OrderedSet<OpaqueActionActivation> firingActionActivations = new OrderedSet<OpaqueActionActivation>();
		ActivityExecution activityExecution = getActivityExecution(self);
		if(activityExecution != null) {
			firingActionActivations = getFiringActions(activityExecution);
		}
		return firingActionActivations;
	}
	
	private OrderedSet<OpaqueActionActivation> getFiringActions(ActivityExecution self) {
		OrderedSet<OpaqueActionActivation> firingActions = new OrderedSet<OpaqueActionActivation>();
		if (self.getActivationGroup() != null) {
			for (ActivityNodeActivation nodeActivation : self.getActivationGroup().getNodeActivations()) {
				if (nodeActivation instanceof OpaqueActionActivation) {
					OpaqueActionActivation actionActivation = (OpaqueActionActivation)nodeActivation;
					if (actionActivation.isFiring()) {
						firingActions.add(actionActivation);
					}
				}
			}
		}
		return firingActions;
	}
	
	private ActivityExecution getActivityExecution(State self) {
		ActivityExecution activityExecution = null;
		ExecutionEnvironment executionEnvironment = getExecutionEnvironment(self);
		Locus locus = executionEnvironment.getLocus_ExecutionEnvironment();
		activityExecution = getActivityExecution(locus);
		if (activityExecution != null && activityExecution.getRuntimeModelElement() == null) {
			locus = getLocus(self);
			activityExecution = getActivityExecution(locus);
		}
		return activityExecution;
	}
	
	private ExecutionEnvironment getExecutionEnvironment(State self) {
		ExecutionEnvironment executionEnvironment = null;
		for (EObject object : self.getObjects()) {
			if (object instanceof ExecutionEnvironment) {
				executionEnvironment = (ExecutionEnvironment)object;
			}
		}
		return executionEnvironment;
	}
	
	private Locus getLocus(State self) {
		Locus locus = null;
		for (EObject object : self.getObjects()) {
			if (object instanceof Locus) {
				locus = (Locus) object;
			}
		}
		return locus;
	}
	
	private ActivityExecution getActivityExecution(Locus self) {
		for (ExtensionalValue extensionalValue : self.getExtensionalValues()) {
			if (extensionalValue instanceof ActivityExecution) {
				return (ActivityExecution)extensionalValue;
			}
		}
		return null;
	}
	
	private boolean matches(State left, State right) {
		return compareStates(left, right);
	}
	
	private boolean compareStates(State left, State right) {
		OrderedSet<OpaqueActionActivation> leftFiringActions = getFiringActions(left);
		OrderedSet<OpaqueActionActivation> rightFiringActions = getFiringActions(right);
		return compareActionActivations(leftFiringActions, rightFiringActions);
	}
	
	private boolean compareActionActivations(OrderedSet<OpaqueActionActivation> left, OrderedSet<OpaqueActionActivation> right) {
		return matchesUnordered(left, right);
	}
	
	private boolean matches(OpaqueActionActivation left, OpaqueActionActivation right){
		return compareActions(left, right);
	}

	private boolean compareActions(OpaqueActionActivation left, OpaqueActionActivation right) {
		OpaqueAction leftOpaqueAction = (OpaqueAction)left.getRuntimeModelElement();
		OpaqueAction rightOpaqueAction = (OpaqueAction)right.getRuntimeModelElement();
		return (leftOpaqueAction.getName().equals(rightOpaqueAction.getName())) && (left.isFiring() == right.isFiring());
	}
	
///////////////////////////////////////////////////////////////////////////////////////
	private boolean matchesOrdered(OrderedSet<State> left, OrderedSet<State> right) {
		if(left.size() != right.size()) {
			return false;
		}
		if(left.size()==0 && right.size() == 0) {
			return true;
		}
		boolean matches = true;
		Iterator<State> leftIterator = left.iterator();
		Iterator<State> rightIterator = right.iterator();		
		while (leftIterator.hasNext() && matches) {
			State source = leftIterator.next();
			State target = rightIterator.next();
			if (!matches(source, target)) {
				matches = false;
			}
		}
		return matches;
	}
	
	private boolean matchesUnordered(OrderedSet<OpaqueActionActivation> left, OrderedSet<OpaqueActionActivation> right) {
		boolean matches = true;
		for (OpaqueActionActivation source : left) {
			boolean sourceTargetMatchFound = false;
			for (OpaqueActionActivation target : right) {
				if (matches(source, target)) {
					sourceTargetMatchFound = true;
				}
			}
			if (!sourceTargetMatchFound) {
				matches = false;
			}
		}
		return matches;
	}
}
