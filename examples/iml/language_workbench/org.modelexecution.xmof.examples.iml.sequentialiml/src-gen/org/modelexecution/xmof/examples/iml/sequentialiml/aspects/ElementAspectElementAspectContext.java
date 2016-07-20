package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ElementAspectElementAspectProperties;

@SuppressWarnings("all")
public class ElementAspectElementAspectContext {
  public final static ElementAspectElementAspectContext INSTANCE = new ElementAspectElementAspectContext();
  
  public static ElementAspectElementAspectProperties getSelf(final Element _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ElementAspectElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Element, ElementAspectElementAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.Element, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ElementAspectElementAspectProperties>();
  
  public Map<Element, ElementAspectElementAspectProperties> getMap() {
    return map;
  }
}
