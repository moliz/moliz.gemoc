package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties;

@SuppressWarnings("all")
public class CommentAspectCommentAspectContext {
  public final static CommentAspectCommentAspectContext INSTANCE = new CommentAspectCommentAspectContext();
  
  public static CommentAspectCommentAspectProperties getSelf(final Comment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.xmof.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Comment, CommentAspectCommentAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.xmof.examples.iml.sequentialiml.iml.Comment, org.modelexecution.xmof.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties>();
  
  public Map<Comment, CommentAspectCommentAspectProperties> getMap() {
    return map;
  }
}
