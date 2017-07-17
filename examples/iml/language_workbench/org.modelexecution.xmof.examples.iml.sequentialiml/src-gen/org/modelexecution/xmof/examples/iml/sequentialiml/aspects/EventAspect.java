package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Event;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ElementAspect;

@Aspect(className = Event.class)
@SuppressWarnings("all")
public class EventAspect extends ElementAspect {
}
