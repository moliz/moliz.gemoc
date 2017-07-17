package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.collect.Iterables;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect;

@Aspect(className = SimultaneousConvergence.class)
@SuppressWarnings("all")
public class SimultaneousConvergenceAspect extends ConnectionPointAspect {
  /**
   * All source states have to be activated
   */
  @OverrideAspectMethod
  public static boolean isEnabled(final SimultaneousConvergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  /**
   * Deactivates predecessor states and fires successor state transition
   */
  @OverrideAspectMethod
  @Step
  public static void doFire(final SimultaneousConvergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspectSimultaneousConvergenceAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence){
    					org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence)_self);
    						}
    					};
    					org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"SimultaneousConvergence","doFire");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean _privk3_isEnabled(final SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties _self_, final SimultaneousConvergence _self) {
    boolean _xblockexpression = false;
    {
      boolean isEnabled = true;
      Iterable<ConnectionPoint> _predecessors = ConnectionPointAspect.getPredecessors(_self);
      for (final ConnectionPoint predecessor : _predecessors) {
        {
          final State predecessorState = ((State) predecessor);
          boolean _current = StateAspect.current(predecessorState);
          boolean _not = (!_current);
          if (_not) {
            isEnabled = false;
          }
        }
      }
      _xblockexpression = isEnabled;
    }
    return _xblockexpression;
  }
  
  protected static void _privk3_doFire(final SimultaneousConvergenceAspectSimultaneousConvergenceAspectProperties _self_, final SimultaneousConvergence _self) {
    Iterable<ConnectionPoint> _predecessors = ConnectionPointAspect.getPredecessors(_self);
    Iterable<State> _filter = Iterables.<State>filter(_predecessors, State.class);
    final Consumer<State> _function = (State s) -> {
      StateAspect.deactivate(s);
    };
    _filter.forEach(_function);
    ConnectionPoint _target = ConnectionPointAspect.getTarget(_self);
    final StateTransition successorStateTransition = ((StateTransition) _target);
    boolean _isEnabled = StateTransitionAspect.isEnabled(successorStateTransition);
    if (_isEnabled) {
      ConnectionPointAspect.fire(successorStateTransition);
    }
  }
}
