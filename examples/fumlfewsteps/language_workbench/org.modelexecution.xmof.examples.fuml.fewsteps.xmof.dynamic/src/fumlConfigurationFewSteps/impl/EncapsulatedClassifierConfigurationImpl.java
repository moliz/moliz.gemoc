/**
 */
package fumlConfigurationFewSteps.impl;

import fumlConfigurationFewSteps.ClassifierConfiguration;
import fumlConfigurationFewSteps.ElementConfiguration;
import fumlConfigurationFewSteps.EncapsulatedClassifierConfiguration;
import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;
import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import fumlConfigurationFewSteps.NamedElementConfiguration;
import fumlConfigurationFewSteps.NamespaceConfiguration;
import fumlConfigurationFewSteps.PackageableElementConfiguration;
import fumlConfigurationFewSteps.ParameterableElementConfiguration;
import fumlConfigurationFewSteps.RedefinableElementConfiguration;
import fumlConfigurationFewSteps.StructuredClassifierConfiguration;
import fumlConfigurationFewSteps.TemplateableElementConfiguration;
import fumlConfigurationFewSteps.TypeConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.impl.EncapsulatedClassifierConfigurationImpl#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncapsulatedClassifierConfigurationImpl extends EncapsulatedClassifierImpl implements EncapsulatedClassifierConfiguration {
	/**
	 * The cached value of the '{@link #getSemanticVisitor() <em>Semantic Visitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVisitor()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticVisitor> semanticVisitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationFewStepsPackage.eINSTANCE.getEncapsulatedClassifierConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVisitor> getSemanticVisitor() {
		if (semanticVisitor == null) {
			semanticVisitor = new EObjectWithInverseResolvingEList<SemanticVisitor>(SemanticVisitor.class, this, FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR, LociFewStepsPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT);
		}
		return semanticVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemanticVisitor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				return ((InternalEList<?>)getSemanticVisitor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				return getSemanticVisitor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				getSemanticVisitor().clear();
				getSemanticVisitor().addAll((Collection<? extends SemanticVisitor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				getSemanticVisitor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR:
				return semanticVisitor != null && !semanticVisitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementConfiguration.class) {
			switch (derivedFeatureID) {
				case FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationFewStepsPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR;
				default: return -1;
			}
		}
		if (baseClass == NamedElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamespaceConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RedefinableElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParameterableElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageableElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ClassifierConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifierConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementConfiguration.class) {
			switch (baseFeatureID) {
				case FumlConfigurationFewStepsPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationFewStepsPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION__SEMANTIC_VISITOR;
				default: return -1;
			}
		}
		if (baseClass == NamedElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamespaceConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RedefinableElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParameterableElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageableElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypeConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ClassifierConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifierConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EncapsulatedClassifierConfigurationImpl
