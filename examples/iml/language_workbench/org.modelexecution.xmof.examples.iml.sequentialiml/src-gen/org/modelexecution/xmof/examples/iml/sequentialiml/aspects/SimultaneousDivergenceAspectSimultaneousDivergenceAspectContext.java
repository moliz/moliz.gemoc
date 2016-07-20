package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties;

@SuppressWarnings("all")
public class SimultaneousDivergenceAspectSimultaneousDivergenceAspectContext {
  public final static SimultaneousDivergenceAspectSimultaneousDivergenceAspectContext INSTANCE = new SimultaneousDivergenceAspectSimultaneousDivergenceAspectContext();
  
  public static SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties getSelf(final SimultaneousDivergence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SimultaneousDivergence, SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.SimultaneousDivergence, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties>();
  
  public Map<SimultaneousDivergence, SimultaneousDivergenceAspectSimultaneousDivergenceAspectProperties> getMap() {
    return map;
  }
}
