package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.collect.Iterables;
import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.k3.al.annotationprocessor.InitializeModel;
import org.eclipse.gemoc.k3.al.annotationprocessor.Main;
import org.eclipse.gemoc.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.State;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateAspect;

@Aspect(className = Header.class)
@SuppressWarnings("all")
public class HeaderAspect extends IdentifyableElementAspect {
  @InitializeModel
  public static void initializeModel(final Header _self, final List<String> args) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectContext.getSelf(_self);
    _privk3_initializeModel(_self_, _self,args);;
  }
  
  @Main
  @Step
  public static void execute(final Header _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectContext.getSelf(_self);
    org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand command = new org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_execute(_self_, _self);
    	}
    };
    org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.IStepManager manager = org.eclipse.gemoc.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Header","execute");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static Iterable<State> getCurrentStates(final Header _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.HeaderAspectHeaderAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getCurrentStates(_self_, _self);;
    return (java.lang.Iterable<org.modelexecution.xmof.examples.iml.sequentialiml.iml.State>)result;
  }
  
  protected static void _privk3_initializeModel(final HeaderAspectHeaderAspectProperties _self_, final Header _self, final List<String> args) {
  }
  
  protected static void _privk3_execute(final HeaderAspectHeaderAspectProperties _self_, final Header _self) {
    EList<Element> _members = _self.getMembers();
    Iterable<State> _filter = Iterables.<State>filter(_members, State.class);
    final Function1<State, Boolean> _function = (State m) -> {
      boolean _and = false;
      if (!(m instanceof State)) {
        _and = false;
      } else {
        boolean _isInit = ((State) m).isInit();
        _and = _isInit;
      }
      return Boolean.valueOf(_and);
    };
    Iterable<State> _filter_1 = IterableExtensions.<State>filter(_filter, _function);
    State _get = ((State[])Conversions.unwrapArray(_filter_1, State.class))[0];
    StateAspect.activate(_get);
    boolean terminate = false;
    while ((!terminate)) {
      {
        Iterable<State> _currentStates = HeaderAspect.getCurrentStates(_self);
        for (final State s : _currentStates) {
          ConnectionPoint _target = ConnectionPointAspect.getTarget(s);
          boolean _isEnabled = ConnectionPointAspect.isEnabled(_target);
          if (_isEnabled) {
            ConnectionPoint _target_1 = ConnectionPointAspect.getTarget(s);
            ConnectionPointAspect.fire(_target_1);
          }
        }
        Iterable<State> _currentStates_1 = HeaderAspect.getCurrentStates(_self);
        final Function1<State, Boolean> _function_1 = (State cs) -> {
          return Boolean.valueOf(cs.isTerminal());
        };
        boolean _exists = IterableExtensions.<State>exists(_currentStates_1, _function_1);
        if (_exists) {
          terminate = true;
        }
      }
    }
  }
  
  protected static Iterable<State> _privk3_getCurrentStates(final HeaderAspectHeaderAspectProperties _self_, final Header _self) {
    EList<Element> _members = _self.getMembers();
    Iterable<State> _filter = Iterables.<State>filter(_members, State.class);
    final Function1<State, Boolean> _function = (State s) -> {
      return Boolean.valueOf(StateAspect.current(s));
    };
    return IterableExtensions.<State>filter(_filter, _function);
  }
}
