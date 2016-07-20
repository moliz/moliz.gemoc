package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends IdentifyableElementAspect {
  public static void execute(final Activity _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self);;
  }
  
  @Step
  public static void doExecute(final Activity _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_doExecute(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Activity","doExecute");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static boolean current(final Activity _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_current(_self_, _self);;
    return (boolean)result;
  }
  
  public static void current(final Activity _self, final boolean current) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_current(_self_, _self,current);;
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.current(_self, true);
    ActivityAspect.doExecute(_self);
    ActivityAspect.current(_self, false);
  }
  
  protected static void _privk3_doExecute(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
  }
  
  protected static boolean _privk3_current(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
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
  
  protected static void _privk3_current(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final boolean current) {
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
