package org.modelexecution.xmof.examples.iml.sequentialiml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.modelexecution.xmof.examples.iml.sequentialiml.iml.SelectionDivergence;
import org.modelexecution.xmof.examples.iml.sequentialiml.aspects.ConnectionPointAspect;

@Aspect(className = SelectionDivergence.class)
@SuppressWarnings("all")
public class SelectionDivergenceAspect extends ConnectionPointAspect {
}
