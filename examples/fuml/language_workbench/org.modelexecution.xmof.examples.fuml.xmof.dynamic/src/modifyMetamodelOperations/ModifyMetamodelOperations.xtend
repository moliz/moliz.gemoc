package modifyMetamodelOperations

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.BehavioredClassifier
import org.eclipse.emf.ecore.EPackage

class ModifyMetamodelOperations {

	@Test
	def void renameAllPackages() {

		// Open xmof file
		val ResourceSet rs = new ResourceSetImpl
		val Resource r = rs.getResource(URI::createFileURI("xmof/fuml.xmof.zwithfewsteps.xmof"), true)

		for (p : r.allContents.toSet.filter(EPackage)) {
			p.name = p.name + "FewSteps"
			p.nsURI = p.nsURI + "FewSteps"
			p.nsPrefix = p.nsPrefix + "FewSteps"
		}

		// Serialize to new file
		r.URI = r.URI.appendFileExtension("withrenamedPackages")
		r.save(null)
	}

	@Test def void removeAllAnnotationsBut() {
		// Open xmof file
		val ResourceSet rs = new ResourceSetImpl
		val Resource r = rs.getResource(URI::createFileURI("xmof/fuml.xmof"), true)

		val operations = #{"takeOfferedTokens", "fire", "shouldFireAgain"}

		for (op : r.allContents.toSet.filter(EOperation)) {
			if (!operations.contains(op.name)) {
				op.EAnnotations.clear
			}
		}

		// Serialize to new file
		r.URI = r.URI.appendFileExtension("withfewsteps")
		r.save(null)

	}

	@Test
	public def void addAnnotations() {
		// Open xmof file
		val ResourceSet rs = new ResourceSetImpl
		val Resource r = rs.getResource(URI::createFileURI("xmof/fuml.xmof"), true)

		// Add step annotations
		for (op : r.allContents.toSet.filter(EOperation)) {
			val stepAnnotation = EcoreFactory.eINSTANCE.createEAnnotation
			stepAnnotation.source = "http://www.modelexecution.org/xmof"
			stepAnnotation.details.put("Step", "true")
			op.EAnnotations.add(stepAnnotation)
		}

		// Serialize to new file
		r.URI = r.URI.appendFileExtension("withannotations")
		r.save(null)
	}

	@Test
	public def void removeActivities() {
		// Open ecore file
		val ResourceSet rs = new ResourceSetImpl
		val Resource r = rs.getResource(URI::createFileURI("xmof/fuml.xmof.zwithfewsteps.xmof.withrenamedPackages"), true)

		// Remove behaviors
		for (c : r.allContents.toSet.filter(BehavioredClassifier)) {
			c.ownedBehavior.clear
		}
		for (o : r.allContents.toSet.filter(BehavioredEOperation)) {
			o.method.clear
		}

		// Serialize to new file
		r.URI = r.URI.appendFileExtension("withoutactivities")
		r.save(null)
	}

/*
 * Done manually, replace this:
 * http://www.eclipse.org/uml2/5.0.0/UML
 * by this:
 * platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore
 * only in the ecore, not on the xmof!
 */
}
