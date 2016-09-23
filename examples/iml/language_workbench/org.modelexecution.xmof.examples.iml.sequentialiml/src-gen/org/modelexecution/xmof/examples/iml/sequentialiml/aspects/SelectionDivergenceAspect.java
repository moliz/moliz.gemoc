package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect;

@Aspect(className = SelectionDivergence.class)
@SuppressWarnings("all")
public class SelectionDivergenceAspect extends ConnectionPointAspect {
  /**
   * The predecessor state has to be activated
   */
  @OverrideAspectMethod
  public static boolean isEnabled(final SelectionDivergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  /**
   * Deactivates predecessor state and fires enabled successor state transition
   */
  @OverrideAspectMethod
  @Step
  public static void doFire(final SelectionDivergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"SelectionDivergence","doFire");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean _privk3_isEnabled(final SelectionDivergenceAspectSelectionDivergenceAspectProperties _self_, final SelectionDivergence _self) {
    ConnectionPoint _source = ConnectionPointAspect.getSource(_self);
    return ConnectionPointAspect.isEnabled(((State) _source));
  }
  
  protected static void _privk3_doFire(final SelectionDivergenceAspectSelectionDivergenceAspectProperties _self_, final SelectionDivergence _self) {
    Iterable<ConnectionPoint> _predecessors = ConnectionPointAspect.getPredecessors(_self);
    StateAspect.deactivate(((State) _predecessors));
    Iterable<ConnectionPoint> _successors = ConnectionPointAspect.getSuccessors(_self);
    Iterable<StateTransition> _filter = Iterables.<StateTransition>filter(_successors, StateTransition.class);
    final Function1<StateTransition, Boolean> _function = (StateTransition t) -> {
      return Boolean.valueOf(StateTransitionAspect.isEnabled(t));
    };
    StateTransition _findFirst = IterableExtensions.<StateTransition>findFirst(_filter, _function);
    StateTransition next = ((StateTransition) _findFirst);
    boolean _notEquals = (!Objects.equal(next, null));
    if (_notEquals) {
      ConnectionPointAspect.fire(next);
    }
  }
}
