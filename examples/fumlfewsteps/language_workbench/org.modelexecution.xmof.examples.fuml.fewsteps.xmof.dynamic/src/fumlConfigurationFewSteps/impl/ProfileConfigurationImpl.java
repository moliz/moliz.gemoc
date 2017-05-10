/**
 */
package fumlConfigurationFewSteps.impl;

import fumlConfigurationFewSteps.ElementConfiguration;
import fumlConfigurationFewSteps.FumlConfigurationFewStepsPackage;

import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;
import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import fumlConfigurationFewSteps.NamedElementConfiguration;
import fumlConfigurationFewSteps.NamespaceConfiguration;
import fumlConfigurationFewSteps.PackageConfiguration;
import fumlConfigurationFewSteps.PackageableElementConfiguration;
import fumlConfigurationFewSteps.ParameterableElementConfiguration;
import fumlConfigurationFewSteps.ProfileConfiguration;
import fumlConfigurationFewSteps.TemplateableElementConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ProfileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.impl.ProfileConfigurationImpl#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileConfigurationImpl extends ProfileImpl implements ProfileConfiguration {
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
	protected ProfileConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationFewStepsPackage.eINSTANCE.getProfileConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVisitor> getSemanticVisitor() {
		if (semanticVisitor == null) {
			semanticVisitor = new EObjectWithInverseResolvingEList<SemanticVisitor>(SemanticVisitor.class, this, FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR, LociFewStepsPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT);
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR:
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
				case FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationFewStepsPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR;
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
		if (baseClass == TemplateableElementConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageConfiguration.class) {
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
				case FumlConfigurationFewStepsPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationFewStepsPackage.PROFILE_CONFIGURATION__SEMANTIC_VISITOR;
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
		if (baseClass == TemplateableElementConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PackageConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProfileConfigurationImpl
