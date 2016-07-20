package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;

@Aspect(className = SimultaneousDivergence.class)
@SuppressWarnings("all")
public class SimultaneousDivergenceAspect extends ConnectionPointAspect {
  @OverrideAspectMethod
  public static boolean isEnabled(final SimultaneousDivergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  /**
   * Activates the successor states
   */
  @OverrideAspectMethod
  @Step
  public static void doFire(final SimultaneousDivergence _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (manager != null) {
    						manager.executeStep(_self,command,"SimultaneousDivergence","doFire");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static boolean _privk3_isEnabled(final SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties _self_, final SimultaneousDivergence _self) {
    return true;
  }
  
  protected static void _privk3_doFire(final SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties _self_, final SimultaneousDivergence _self) {
    Iterable<ConnectionPoint> _successors = ConnectionPointAspect.getSuccessors(_self);
    Iterable<State> _filter = Iterables.<State>filter(_successors, State.class);
    final Consumer<State> _function = (State s) -> {
      StateAspect.activate(s);
    };
    _filter.forEach(_function);
  }
}
