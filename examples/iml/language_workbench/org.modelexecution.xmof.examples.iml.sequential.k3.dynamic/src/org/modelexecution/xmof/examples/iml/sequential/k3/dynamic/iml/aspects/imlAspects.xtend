package org.modelexecution.xmof.examples.iml.sequential.k3.dynamic.iml.aspects

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect
import org.modelexecution.xmof.examples.iml.IdentifyableElement
import org.modelexecution.xmof.examples.iml.Header
import org.modelexecution.xmof.examples.iml.Element
import org.modelexecution.xmof.examples.iml.Comment
import org.modelexecution.xmof.examples.iml.AddData
import org.modelexecution.xmof.examples.iml.State
import org.modelexecution.xmof.examples.iml.StateTransition
import org.modelexecution.xmof.examples.iml.Jump
import org.modelexecution.xmof.examples.iml.Activity
import org.modelexecution.xmof.examples.iml.Variable
import org.modelexecution.xmof.examples.iml.Event
import org.modelexecution.xmof.examples.iml.SimultaneousDivergence
import org.modelexecution.xmof.examples.iml.SimultaneousConvergence
import org.modelexecution.xmof.examples.iml.SelectionDivergence
import org.modelexecution.xmof.examples.iml.SelectionConvergence
import org.modelexecution.xmof.examples.iml.ConnectionPoint
import org.modelexecution.xmof.examples.iml.Connection

import static extension org.modelexecution.xmof.examples.iml.sequential.k3.dynamic.iml.aspects.StateAspect.*
import static extension org.modelexecution.xmof.examples.iml.sequential.k3.dynamic.iml.aspects.StateTransitionAspect.*
import static extension org.modelexecution.xmof.examples.iml.sequential.k3.dynamic.iml.aspects.ActivityAspect.*
import static extension org.modelexecution.xmof.examples.iml.sequential.k3.dynamic.iml.aspects.ConnectionPointAspect.*
import org.eclipse.gemoc.k3.al.annotationprocessor.Main
import org.eclipse.gemoc.k3.al.annotationprocessor.Step
import org.eclipse.gemoc.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.gemoc.k3.al.annotationprocessor.InitializeModel
import java.util.List

@Aspect(className=Header)
class HeaderAspect extends IdentifyableElementAspect {

	@InitializeModel
	def void initializeModel(List<String> args) {
	}

	@Main
	@Step
	def void execute() {
		_self.members.filter(State).filter(m|m instanceof State && (m as State).init).get(0).activate();

		var boolean terminate = false
		while (!terminate) {
			for (State s : _self.currentStates) {
				if (s.target.isEnabled()) {
					s.target.fire();
				}
			}
			if (_self.currentStates.exists[cs|cs.terminal]) {
				terminate = true
			}
		}
	}

	def Iterable<State> getCurrentStates() {
		_self.members.filter(State).filter(s|s.current)
	}
}

@Aspect(className=State)
class StateAspect extends ConnectionPointAspect {

	public var boolean current = false

	@Step
	def void activate() {
		_self.current = true;
		_self.executeActivities();
	}

	@Step
	def void deactivate() {
		_self.current = false;
	}

	@Step
	def void executeActivities() {
		for (Activity activity : _self.activities) {
			activity.execute();
		}
	}

}

@Aspect(className=Activity)
class ActivityAspect extends IdentifyableElementAspect {

	public var boolean current = false;

	def void execute() {
		_self.current = true
		_self.doExecute()
		_self.current = false;
	}

	@Step
	def void doExecute() {
	}
}

@Aspect(className=ConnectionPoint)
abstract class ConnectionPointAspect {

	public var boolean firing = false

	abstract def boolean isEnabled()

	def void fire() {
		_self.firing = true;
		_self.doFire();
		_self.firing = false;
	}

	abstract def void doFire()

	def Iterable<ConnectionPoint> getPredecessors() {
		val Header container = _self.eContainer as Header;
		container.members.filter(Connection).filter(c|c.target == _self).map[c|c.source];
	}

	def Iterable<ConnectionPoint> getSuccessors() {
		val Header container = _self.eContainer as Header;
		container.members.filter(Connection).filter(c|c.source == _self).map[c|c.target];
	}

	def ConnectionPoint getSource() {
		if (_self.predecessors.size > 0)
			_self.predecessors.get(0)
		else
			null
	}

	def ConnectionPoint getTarget() {
		if (_self.successors.size > 0)
			_self.successors.get(0)
		else
			null
	}
}

@Aspect(className=StateTransition)
class StateTransitionAspect extends ConnectionPointAspect {

	/**
	 * If the predecessor is a state, this state has to be active.  
	 * If the predecessor is a simultaneous convergence, the state transition is enabled.
	 */
	@OverrideAspectMethod
	def boolean isEnabled() {
		var boolean isEnabled = false;
		if (_self.source instanceof State) {
			isEnabled = (_self.source as State).current
		} else if (_self.source instanceof SimultaneousConvergence) {
			isEnabled = true
		}
		isEnabled
	}

	/**
	 * First deactivates the predecessor state(s):
	 * If the predecessor is a state, this state is deactivated; 
	 * 
	 * Second processes successor elements:
	 * If the successor is a state, this state is activated;
	 * If the successor is a simultaneous divergence, fires this simultaneous divergence
	 */
	@OverrideAspectMethod
	@Step
	def void doFire() {
		if (_self.source instanceof State && (_self.source as State).current) {
			(_self.source as State).deactivate()
		}
//		else if (_self.source instanceof SimultaneousConvergence) {
//			(_self.source as SimultaneousConvergence).predecessors.filter(State).forEach[s | s.deactivate()]
//		}
		if (_self.target instanceof State) {
			(_self.target as State).activate()
		} else if (_self.target.isEnabled()) {
			_self.target.fire()
		}
	}
}

@Aspect(className=Variable)
class VariableAspect extends IdentifyableElementAspect {
	public var String value = null
}

@Aspect(className=SimultaneousDivergence)
class SimultaneousDivergenceAspect extends ConnectionPointAspect {

	@OverrideAspectMethod
	def boolean isEnabled() {
		true
	}

	/**
	 * Activates the successor states
	 */
	@OverrideAspectMethod
	@Step
	def void doFire() {
		_self.successors.filter(State).forEach[s|s.activate()]
	}

}

@Aspect(className=SimultaneousConvergence)
class SimultaneousConvergenceAspect extends ConnectionPointAspect {

	/**
	 * All source states have to be activated
	 */
	@OverrideAspectMethod
	def boolean isEnabled() {
		var boolean isEnabled = true
		for (predecessor : _self.predecessors) {
			val State predecessorState = predecessor as State
			if (! predecessorState.current) {
				isEnabled = false
			}
		}
		isEnabled
	}

	/**
	 * Deactivates predecessor states and fires successor state transition
	 */
	@OverrideAspectMethod
	@Step
	def void doFire() {
		_self.predecessors.filter(State).forEach[s|s.deactivate()]

		val StateTransition successorStateTransition = _self.target as StateTransition
		if (successorStateTransition.isEnabled()) {
			successorStateTransition.fire()
		}
	}
}

@Aspect(className=SelectionDivergence)
class SelectionDivergenceAspect extends ConnectionPointAspect {
	
	/**
	 * The predecessor state has to be activated 
	 */
	@OverrideAspectMethod
	def boolean isEnabled() {
		(_self.source as State).isEnabled;
	}

	/**
	 * Deactivates predecessor state and fires enabled successor state transition 
	 */
	@OverrideAspectMethod
	@Step
	def void doFire() {
		(_self.predecessors as State).deactivate();
		var StateTransition next = _self.successors.filter(StateTransition).findFirst(t | t.isEnabled) as StateTransition;
		if (next != null) {
			next.fire();
		}
	}
}

@Aspect(className=SelectionConvergence)
class SelectionConvergenceAspect extends ConnectionPointAspect {
	
	/**
	 * One of the predecessor state transitions has to be firing 
	 */
	@OverrideAspectMethod
	def boolean isEnabled() {
		_self.predecessors.filter(StateTransition).exists[t | t.firing ];
	}

	/**
	 * Activates target state
	 */
	@OverrideAspectMethod
	@Step
	def void doFire() {
		(_self.target as State).activate();
	}
	
}

@Aspect(className=IdentifyableElement)
abstract class IdentifyableElementAspect extends ElementAspect {
}

@Aspect(className=Connection)
class ConnectionAspect extends IdentifyableElementAspect {
}

@Aspect(className=Element)
abstract class ElementAspect {
}

@Aspect(className=Comment)
class CommentAspect {
}

@Aspect(className=AddData)
class AddDataAspect extends IdentifyableElementAspect {
}

@Aspect(className=Jump)
class JumpAspect extends ConnectionPointAspect {
}

@Aspect(className=Event)
class EventAspect extends ElementAspect {
}
