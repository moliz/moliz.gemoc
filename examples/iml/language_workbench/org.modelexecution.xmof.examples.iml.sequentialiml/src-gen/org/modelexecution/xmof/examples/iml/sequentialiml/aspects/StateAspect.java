package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect extends ConnectionPointAspect {
  @Step
  public static void activate(final State _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_activate(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"State","activate");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void deactivate(final State _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_deactivate(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"State","deactivate");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void executeActivities(final State _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_executeActivities(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"State","executeActivities");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean current(final State _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_current(_self_, _self);;
    return (boolean)result;
  }
  
  public static void current(final State _self, final boolean current) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspectStateAspectContext.getSelf(_self);
    _privk3_current(_self_, _self,current);;
  }
  
  protected static void _privk3_activate(final StateAspectStateAspectProperties _self_, final State _self) {
    StateAspect.current(_self, true);
    StateAspect.executeActivities(_self);
  }
  
  protected static void _privk3_deactivate(final StateAspectStateAspectProperties _self_, final State _self) {
    StateAspect.current(_self, false);
  }
  
  protected static void _privk3_executeActivities(final StateAspectStateAspectProperties _self_, final State _self) {
    EList<Activity> _activities = _self.getActivities();
    for (final Activity activity : _activities) {
      ActivityAspect.execute(activity);
    }
  }
  
  protected static boolean _privk3_current(final StateAspectStateAspectProperties _self_, final State _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.current;
  }
  
  protected static void _privk3_current(final StateAspectStateAspectProperties _self_, final State _self, final boolean current) {
    _self_.current = current; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, current);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
