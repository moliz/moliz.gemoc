package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Connection;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;

@Aspect(className = Connection.class)
@SuppressWarnings("all")
public class ConnectionAspect extends IdentifyableElementAspect {
}
