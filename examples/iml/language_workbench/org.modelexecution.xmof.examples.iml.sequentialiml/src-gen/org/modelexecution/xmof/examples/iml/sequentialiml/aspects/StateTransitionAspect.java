package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties;

@Aspect(className = StateTransition.class)
@SuppressWarnings("all")
public class StateTransitionAspect extends ConnectionPointAspect {
  /**
   * If the predecessor is a state, this state has to be active.
   * If the predecessor is a simultaneous convergence, the state transition is enabled.
   */
  @OverrideAspectMethod
  public static boolean isEnabled(final StateTransition _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
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
  public static void doFire(final StateTransition _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"StateTransition","doFire");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean _privk3_isEnabled(final StateTransitionAspectStateTransitionAspectProperties _self_, final StateTransition _self) {
    boolean _xblockexpression = false;
    {
      boolean isEnabled = false;
      ConnectionPoint _source = ConnectionPointAspect.getSource(_self);
      if ((_source instanceof State)) {
        ConnectionPoint _source_1 = ConnectionPointAspect.getSource(_self);
        boolean _current = StateAspect.current(((State) _source_1));
        isEnabled = _current;
      } else {
        ConnectionPoint _source_2 = ConnectionPointAspect.getSource(_self);
        if ((_source_2 instanceof SimultaneousConvergence)) {
          isEnabled = true;
        }
      }
      _xblockexpression = isEnabled;
    }
    return _xblockexpression;
  }
  
  protected static void _privk3_doFire(final StateTransitionAspectStateTransitionAspectProperties _self_, final StateTransition _self) {
    boolean _and = false;
    ConnectionPoint _source = ConnectionPointAspect.getSource(_self);
    if (!(_source instanceof State)) {
      _and = false;
    } else {
      ConnectionPoint _source_1 = ConnectionPointAspect.getSource(_self);
      boolean _current = StateAspect.current(((State) _source_1));
      _and = _current;
    }
    if (_and) {
      ConnectionPoint _source_2 = ConnectionPointAspect.getSource(_self);
      StateAspect.deactivate(((State) _source_2));
    }
    ConnectionPoint _target = ConnectionPointAspect.getTarget(_self);
    if ((_target instanceof State)) {
      ConnectionPoint _target_1 = ConnectionPointAspect.getTarget(_self);
      StateAspect.activate(((State) _target_1));
    } else {
      ConnectionPoint _target_2 = ConnectionPointAspect.getTarget(_self);
      boolean _isEnabled = ConnectionPointAspect.isEnabled(_target_2);
      if (_isEnabled) {
        ConnectionPoint _target_3 = ConnectionPointAspect.getTarget(_self);
        ConnectionPointAspect.fire(_target_3);
      }
    }
  }
}
