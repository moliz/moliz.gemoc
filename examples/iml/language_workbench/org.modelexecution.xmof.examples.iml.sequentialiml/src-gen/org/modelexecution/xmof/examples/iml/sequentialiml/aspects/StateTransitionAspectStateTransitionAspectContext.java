package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties;

@SuppressWarnings("all")
public class StateTransitionAspectStateTransitionAspectContext {
  public final static StateTransitionAspectStateTransitionAspectContext INSTANCE = new StateTransitionAspectStateTransitionAspectContext();
  
  public static StateTransitionAspectStateTransitionAspectProperties getSelf(final StateTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.StateTransition, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.StateTransitionAspectStateTransitionAspectProperties>();
  
  public Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> getMap() {
    return map;
  }
}
