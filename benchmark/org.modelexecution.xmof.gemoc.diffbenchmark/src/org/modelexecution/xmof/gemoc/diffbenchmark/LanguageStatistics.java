package org.modelexecution.xmof.gemoc.diffbenchmark;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.gemoc.diffbenchmark.internal.util.EMFUtil;

public class LanguageStatistics {

	@Test
	public void test() {
		ResourceSet resourceSet = EMFUtil.createResourceSet();
		Resource executionMM = EMFUtil.loadResource(resourceSet, EMFUtil.createPlatformPluginURI(Evaluation.FUML_CONFIGURATION_PATH.replace("platform:/plugin/", "")));
		
		int structuralFeatureCount = 0;
		int activityCount = 0;
		int classCount = 0;
		TreeIterator<EObject> allContents = executionMM.getAllContents();
		while(allContents.hasNext()) {
			EObject eObject = allContents.next();
			if(eObject instanceof EStructuralFeature) {
				++structuralFeatureCount;
			} else if (eObject instanceof Activity) {
				++activityCount;
			} else if (eObject instanceof EClass) {
				EClass eClass = (EClass) eObject;
				if (eClass.eContainer().eContainer() instanceof EPackage) {
					++classCount;
				}
			}
		}
		System.out.println("Classes: " + classCount);
		System.out.println("Properties: " + structuralFeatureCount);
		System.out.println("Activities: " + activityCount);
	}

}
