package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;

@Aspect(className = SelectionConvergence.class)
@SuppressWarnings("all")
public class SelectionConvergenceAspect extends ConnectionPointAspect {
  /**
   * One of the predecessor state transitions has to be firing
   */
  @OverrideAspectMethod
  public static boolean isEnabled(final SelectionConvergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  /**
   * Activates target state
   */
  @OverrideAspectMethod
  @Step
  public static void doFire(final SelectionConvergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspectSelectionConvergenceAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"SelectionConvergence","doFire");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean _privk3_isEnabled(final SelectionConvergenceAspectSelectionConvergenceAspectProperties _self_, final SelectionConvergence _self) {
    Iterable<ConnectionPoint> _predecessors = ConnectionPointAspect.getPredecessors(_self);
    Iterable<StateTransition> _filter = Iterables.<StateTransition>filter(_predecessors, StateTransition.class);
    final Function1<StateTransition, Boolean> _function = (StateTransition t) -> {
      return Boolean.valueOf(ConnectionPointAspect.firing(t));
    };
    return IterableExtensions.<StateTransition>exists(_filter, _function);
  }
  
  protected static void _privk3_doFire(final SelectionConvergenceAspectSelectionConvergenceAspectProperties _self_, final SelectionConvergence _self) {
    ConnectionPoint _target = ConnectionPointAspect.getTarget(_self);
    StateAspect.activate(((State) _target));
  }
}
