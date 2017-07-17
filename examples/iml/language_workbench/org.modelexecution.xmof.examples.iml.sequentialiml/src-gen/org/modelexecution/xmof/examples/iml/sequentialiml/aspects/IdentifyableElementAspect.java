package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.IdentifyableElement;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ElementAspect;

@Aspect(className = IdentifyableElement.class)
@SuppressWarnings("all")
public abstract class IdentifyableElementAspect extends ElementAspect {
}
