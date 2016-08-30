package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionConvergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;

@Aspect(className = SelectionConvergence.class)
@SuppressWarnings("all")
public class SelectionConvergenceAspect extends ConnectionPointAspect {
}
