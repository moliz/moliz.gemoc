package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import org.eclipse.gemoc.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.AddData;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.IdentifyableElementAspect;

@Aspect(className = AddData.class)
@SuppressWarnings("all")
public class AddDataAspect extends IdentifyableElementAspect {
}
