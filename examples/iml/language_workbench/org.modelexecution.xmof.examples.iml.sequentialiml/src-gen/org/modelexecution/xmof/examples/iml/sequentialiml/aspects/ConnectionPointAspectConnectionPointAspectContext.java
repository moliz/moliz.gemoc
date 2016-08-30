package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties;

@SuppressWarnings("all")
public class ConnectionPointAspectConnectionPointAspectContext {
  public final static ConnectionPointAspectConnectionPointAspectContext INSTANCE = new ConnectionPointAspectConnectionPointAspectContext();
  
  public static ConnectionPointAspectConnectionPointAspectProperties getSelf(final ConnectionPoint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ConnectionPoint, ConnectionPointAspectConnectionPointAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.ConnectionPoint, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspectConnectionPointAspectProperties>();
  
  public Map<ConnectionPoint, ConnectionPointAspectConnectionPointAspectProperties> getMap() {
    return map;
  }
}
