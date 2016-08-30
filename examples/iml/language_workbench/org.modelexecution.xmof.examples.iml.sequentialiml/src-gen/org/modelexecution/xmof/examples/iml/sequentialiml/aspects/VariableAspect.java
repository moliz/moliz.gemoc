package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Variable;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect extends IdentifyableElementAspect {
  public static String value(final Variable _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_value(_self_, _self);;
    return (java.lang.String)result;
  }
  
  public static void value(final Variable _self, final String value) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);;
  }
  
  protected static String _privk3_value(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final VariableAspectVariableAspectProperties _self_, final Variable _self, final String value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
