package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionAspectConnectionAspectProperties;

@SuppressWarnings("all")
public class ConnectionAspectConnectionAspectContext {
  public final static ConnectionAspectConnectionAspectContext INSTANCE = new ConnectionAspectConnectionAspectContext();
  
  public static ConnectionAspectConnectionAspectProperties getSelf(final Connection _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionAspectConnectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Connection, ConnectionAspectConnectionAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionAspectConnectionAspectProperties>();
  
  public Map<Connection, ConnectionAspectConnectionAspectProperties> getMap() {
    return map;
  }
}
