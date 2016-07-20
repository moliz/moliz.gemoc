package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties;

@SuppressWarnings("all")
public class SelectionDivergenceAspectSelectionDivergenceAspectContext {
  public final static SelectionDivergenceAspectSelectionDivergenceAspectContext INSTANCE = new SelectionDivergenceAspectSelectionDivergenceAspectContext();
  
  public static SelectionDivergenceAspectSelectionDivergenceAspectProperties getSelf(final SelectionDivergence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SelectionDivergence, SelectionDivergenceAspectSelectionDivergenceAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.SelectionDivergenceAspectSelectionDivergenceAspectProperties>();
  
  public Map<SelectionDivergence, SelectionDivergenceAspectSelectionDivergenceAspectProperties> getMap() {
    return map;
  }
}
