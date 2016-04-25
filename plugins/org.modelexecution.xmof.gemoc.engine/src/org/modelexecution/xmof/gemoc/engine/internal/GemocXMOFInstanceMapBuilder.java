package org.modelexecution.xmof.gemoc.engine.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelexecution.xmof.vm.XMOFInstanceMap;
import org.modelexecution.xmof.vm.internal.XMOFInstanceMapBuilder;

import fUML.Syntax.Classes.Kernel.Association;
import fUML.Syntax.Classes.Kernel.Class_;
import fUML.Syntax.Classes.Kernel.Property;

public class GemocXMOFInstanceMapBuilder extends XMOFInstanceMapBuilder {

	private Map<EClass, EClass> registeredClass2XmofClass = new HashMap<EClass, EClass>();
	private Map<String, EPackage> nsUri2XmofPackage = new HashMap<String, EPackage>();

	public GemocXMOFInstanceMapBuilder(EPackage registeredEPackage,
			EPackage xmofEPackage, XMOFInstanceMap map) {
		super(map);
		buildXMOFEPackageMap(xmofEPackage);
		buildEClassMap(registeredEPackage, xmofEPackage);
	}

	private void buildXMOFEPackageMap(EPackage xmofEPackage) {
		nsUri2XmofPackage.put(xmofEPackage.getNsURI(), xmofEPackage);
		for(EPackage xmofSubpackage : xmofEPackage.getESubpackages()) {
			buildXMOFEPackageMap(xmofSubpackage);
		}
	}

	private void buildEClassMap(EPackage registeredEPackage,
			EPackage xmofEPackage) {
		for (EClassifier registeredEClassifier : registeredEPackage
				.getEClassifiers()) {
			if (registeredEClassifier instanceof EClass) {
				EClass registeredEClass = (EClass) registeredEClassifier;
				EClass xmofEClass = (EClass) xmofEPackage
						.getEClassifier(registeredEClass.getName());
				registeredClass2XmofClass.put(registeredEClass, xmofEClass);
			}
		}
		for (EPackage registeredESubpackage : registeredEPackage
				.getESubpackages()) {
			EPackage xmofESubpackage = nsUri2XmofPackage.get(registeredESubpackage.getNsURI());
			buildEClassMap(registeredESubpackage, xmofESubpackage);
		}
	}

	@Override
	protected Class_ getFumlType(EObject eObject) {
		Class_ fUMLType = null;
		EClass registeredEClass = eObject.eClass();
		EClass xmofEClass = registeredClass2XmofClass.get(registeredEClass);
		fUMLType = (Class_) getConversionResult().getFUMLElement(xmofEClass);
		return fUMLType;
	}

	public EClass getXMOFConfigurationClass(
			EClass registeredXMOFConfigurationClass) {
		return registeredClass2XmofClass.get(registeredXMOFConfigurationClass);
	}

	@Override
	protected Property getFUMLProperty(EAttribute eAttribute) {
		EAttribute registeredEAttribute = eAttribute;
		EAttribute xmofEAttribute = (EAttribute) getXMOFEStructuralFeature(registeredEAttribute);
		Property fumlProperty = (Property) getConversionResult()
				.getFUMLElement(xmofEAttribute);
		return fumlProperty;
	}

	@Override
	protected Association getFUMLAssociation(EReference eReference) {
		EReference registeredEReference = eReference;
		EReference xMOFEReference = (EReference) getXMOFEStructuralFeature(registeredEReference);
		Association fUMLEReference = (Association) getConversionResult()
				.getFUMLElement(xMOFEReference);
		return fUMLEReference;
	}

	private EStructuralFeature getXMOFEStructuralFeature(
			EStructuralFeature eFeature) {
		EStructuralFeature registeredEFeature = eFeature;
		EClass registeredEClass = registeredEFeature.getEContainingClass();
		EClass xmofEClass = registeredClass2XmofClass.get(registeredEClass);
		EStructuralFeature xmofEFeature = null;
		if (xmofEClass != null) {
			xmofEFeature = xmofEClass.getEStructuralFeature(registeredEFeature
					.getName());
		} else {
			xmofEFeature = registeredEFeature;
		}
		return xmofEFeature;
	}

	@Override
	protected void initializeClassMap() {
		super.initializeClassMap();
		for (EClass registeredEClass : registeredClass2XmofClass.keySet()) {
			EClass xmofEClass = registeredClass2XmofClass.get(registeredEClass);
			Class_ fumlClass = getXMOFInstanceMap().getClass(xmofEClass);
			getXMOFInstanceMap().addMapping(fumlClass, registeredEClass);
		}
	}
}
