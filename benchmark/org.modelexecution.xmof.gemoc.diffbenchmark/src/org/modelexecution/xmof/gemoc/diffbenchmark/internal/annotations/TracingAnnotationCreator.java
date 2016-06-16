package org.modelexecution.xmof.gemoc.diffbenchmark.internal.annotations;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Assert;
import org.junit.Test;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.EMFUtil;

import fumlConfiguration.FumlConfigurationPackage;
import fumlConfiguration.Actions.BasicActions.BasicActionsPackage;
import fumlConfiguration.Loci.LociPackage;
import tracingannotations.TracingAnnotations;
import tracingannotations.TracingannotationsFactory;

public class TracingAnnotationCreator {

	private static final TracingannotationsFactory FACTORY = TracingannotationsFactory.eINSTANCE;

	@Test
	public void createFUMLTracingAnnotations() {
		EClass opaqueActionConfiguration = FumlConfigurationPackage.eINSTANCE.getOpaqueActionConfiguration();
		EAttribute actionActivation_Firing = BasicActionsPackage.eINSTANCE.getActionActivation_Firing();
		EReference semanticVisitor_RuntimeModelElement = LociPackage.eINSTANCE.getSemanticVisitor_RuntimeModelElement();
		
		TracingAnnotations tracingAnnotations = FACTORY.createTracingAnnotations();
		tracingAnnotations.getClassestoTrace().add(opaqueActionConfiguration);
		tracingAnnotations.getPropertiesToTrace().add(actionActivation_Firing);
		tracingAnnotations.getPropertiesToTrace().add(semanticVisitor_RuntimeModelElement);
		
		ResourceSet resourceSet = EMFUtil.createResourceSet();
		Resource resource = EMFUtil.createResource(resourceSet, EMFUtil.createFileURI("tracing_annotations/fumlTracingAnnotations.xmi"));
		resource.getContents().add(tracingAnnotations);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch(IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
