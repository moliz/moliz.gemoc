package org.modelexecution.xmof.codegen

import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EPackage
import java.util.Set
import java.util.HashSet

/**
 * Extends the Copier class to enable the copying/transformation into eObjects instances of super types
 * of the the original classes, ie. with less features.
 */
class GenericSuperTypeTransformer extends Copier {

	private val Set<EPackage> targetSuperMetamodel
	private val Set<EClass> targetSuperMetamodelEClasses = new HashSet

	new(Set<EPackage> targetSuperMetamodel) {
		this.targetSuperMetamodel = targetSuperMetamodel
		targetSuperMetamodelEClasses.addAll(
			targetSuperMetamodel.map[p|p.eAllContents.filter(EClass).toSet].flatten.toSet)
	}

	private def EClass findTargetType(Set<EClass> classes) {
		for (c : classes.filter[!abstract && !interface]) {
			if (targetSuperMetamodelEClasses.contains(c)) {
				return c
			}
		}
		val Set<EClass> superTypes = classes.map[c|c.ESuperTypes].flatten.toSet
		if (!superTypes.empty)
			return findTargetType(superTypes)
		else
			return null
	}

	/*
	 * Makes created eObjects use of of the target super types, if any.
	 */
	override protected getTarget(EClass eClass) {
		val candidateTarget = findTargetType(#{eClass})
		if (candidateTarget != null) {
			return candidateTarget
		} else {
			return super.getTarget(eClass)
		}
	}

	/*
	 * Since the copyEObject may be an instance of a target class, it may not have the feature. 
	 */
	override protected copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
		if (copyEObject.eClass.EAllAttributes.contains(eAttribute)) {
			super.copyAttribute(eAttribute, eObject, copyEObject)
		}
	}

	/*
	 * Since the copyEObject may be an instance of a target class, it may not have the feature. 
	 */
	override protected copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
		if (copyEObject.eClass.EAllReferences.contains(eReference)) {
			super.copyContainment(eReference, eObject, copyEObject)
		}
	}

	/*
	 * Since the copyEObject may be an instance of a target class, it may not have the feature. 
	 */
	override protected copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
		if (copyEObject.eClass.EAllReferences.contains(eReference)) {
			super.copyReference(eReference, eObject, copyEObject)
		}
	}

}