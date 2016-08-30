package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties;

@SuppressWarnings("all")
public class ActivityAspectActivityAspectContext {
  public final static ActivityAspectActivityAspectContext INSTANCE = new ActivityAspectActivityAspectContext();
  
  public static ActivityAspectActivityAspectProperties getSelf(final Activity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Activity, ActivityAspectActivityAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.Activity, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ActivityAspectActivityAspectProperties>();
  
  public Map<Activity, ActivityAspectActivityAspectProperties> getMap() {
    return map;
  }
}
