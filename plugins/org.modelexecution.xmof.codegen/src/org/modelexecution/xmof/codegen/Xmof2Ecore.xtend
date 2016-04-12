package org.modelexecution.xmof.codegen

import java.util.Set
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EcorePackage

class Xmof2Ecore {

	public def static Set<EPackage> transform(Set<EPackage> xmofModel) {
		val transformer = new GenericSuperTypeTransformer(#{EcorePackage.eINSTANCE})
		val Set<EPackage> result = transformer.copyAll(xmofModel) as Set<EPackage>
		transformer.copyReferences
		
		// hack: some EParameters of some xmof models have no EType, so we put EObject instead
		for (package : result) {
			for (param : package.eAllContents.filter(EParameter).filter[p|p.EType == null].toSet) {
				param.EType = EcorePackage.eINSTANCE.EObject
			}
		}
		return result
	}

}