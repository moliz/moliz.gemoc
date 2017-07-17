package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.Jump;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;

@Aspect(className = Jump.class)
@SuppressWarnings("all")
public class JumpAspect extends ConnectionPointAspect {
}
