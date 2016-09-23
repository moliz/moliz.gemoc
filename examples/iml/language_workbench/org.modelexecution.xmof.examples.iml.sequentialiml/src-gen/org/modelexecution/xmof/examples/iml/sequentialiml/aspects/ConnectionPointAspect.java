package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Header;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties;

@Aspect(className = ConnectionPoint.class)
@SuppressWarnings("all")
public abstract class ConnectionPointAspect {
  @Abstract
  public static boolean isEnabled(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspect.isEnabled((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					result = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect._privk3_isEnabled(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  public static void fire(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    _privk3_fire(_self_, _self);;
  }
  
  @Abstract
  public static void doFire(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
     if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionConvergenceAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousConvergenceAspect.doFire((org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousConvergence)_self);
    } else  if (_self instanceof org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint){
    					org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect._privk3_doFire(_self_, (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static Iterable<ConnectionPoint> getPredecessors(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getPredecessors(_self_, _self);;
    return (java.lang.Iterable<org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint>)result;
  }
  
  public static Iterable<ConnectionPoint> getSuccessors(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getSuccessors(_self_, _self);;
    return (java.lang.Iterable<org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint>)result;
  }
  
  public static ConnectionPoint getSource(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getSource(_self_, _self);;
    return (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)result;
  }
  
  public static ConnectionPoint getTarget(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getTarget(_self_, _self);;
    return (org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint)result;
  }
  
  public static boolean firing(final ConnectionPoint _self) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_firing(_self_, _self);;
    return (boolean)result;
  }
  
  public static void firing(final ConnectionPoint _self, final boolean firing) {
    final org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties _self_ = org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectContext.getSelf(_self);
    _privk3_firing(_self_, _self,firing);;
  }
  
  protected static boolean _privk3_isEnabled(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_fire(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    ConnectionPointAspect.firing(_self, true);
    ConnectionPointAspect.doFire(_self);
    ConnectionPointAspect.firing(_self, false);
  }
  
  protected static void _privk3_doFire(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static Iterable<ConnectionPoint> _privk3_getPredecessors(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    Iterable<ConnectionPoint> _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      final Header container = ((Header) _eContainer);
      EList<Element> _members = container.getMembers();
      Iterable<Connection> _filter = Iterables.<Connection>filter(_members, Connection.class);
      final Function1<Connection, Boolean> _function = (Connection c) -> {
        ConnectionPoint _target = c.getTarget();
        return Boolean.valueOf(Objects.equal(_target, _self));
      };
      Iterable<Connection> _filter_1 = IterableExtensions.<Connection>filter(_filter, _function);
      final Function1<Connection, ConnectionPoint> _function_1 = (Connection c) -> {
        return c.getSource();
      };
      _xblockexpression = IterableExtensions.<Connection, ConnectionPoint>map(_filter_1, _function_1);
    }
    return _xblockexpression;
  }
  
  protected static Iterable<ConnectionPoint> _privk3_getSuccessors(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    Iterable<ConnectionPoint> _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      final Header container = ((Header) _eContainer);
      EList<Element> _members = container.getMembers();
      Iterable<Connection> _filter = Iterables.<Connection>filter(_members, Connection.class);
      final Function1<Connection, Boolean> _function = (Connection c) -> {
        ConnectionPoint _source = c.getSource();
        return Boolean.valueOf(Objects.equal(_source, _self));
      };
      Iterable<Connection> _filter_1 = IterableExtensions.<Connection>filter(_filter, _function);
      final Function1<Connection, ConnectionPoint> _function_1 = (Connection c) -> {
        return c.getTarget();
      };
      _xblockexpression = IterableExtensions.<Connection, ConnectionPoint>map(_filter_1, _function_1);
    }
    return _xblockexpression;
  }
  
  protected static ConnectionPoint _privk3_getSource(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    ConnectionPoint _xifexpression = null;
    Iterable<ConnectionPoint> _predecessors = ConnectionPointAspect.getPredecessors(_self);
    int _size = IterableExtensions.size(_predecessors);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Iterable<ConnectionPoint> _predecessors_1 = ConnectionPointAspect.getPredecessors(_self);
      _xifexpression = ((ConnectionPoint[])Conversions.unwrapArray(_predecessors_1, ConnectionPoint.class))[0];
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  protected static ConnectionPoint _privk3_getTarget(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    ConnectionPoint _xifexpression = null;
    Iterable<ConnectionPoint> _successors = ConnectionPointAspect.getSuccessors(_self);
    int _size = IterableExtensions.size(_successors);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Iterable<ConnectionPoint> _successors_1 = ConnectionPointAspect.getSuccessors(_self);
      _xifexpression = ((ConnectionPoint[])Conversions.unwrapArray(_successors_1, ConnectionPoint.class))[0];
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  protected static boolean _privk3_firing(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFiring") &&
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
    return _self_.firing;
  }
  
  protected static void _privk3_firing(final ConnectionPointAspectConnectionPointAspectProperties _self_, final ConnectionPoint _self, final boolean firing) {
    _self_.firing = firing; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFiring")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, firing);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
