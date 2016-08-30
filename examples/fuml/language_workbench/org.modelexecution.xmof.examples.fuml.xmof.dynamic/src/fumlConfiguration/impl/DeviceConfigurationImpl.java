/**
 */
package fumlConfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.internal.impl.DeviceImpl;

import fumlConfiguration.BehavioredClassifierConfiguration;
import fumlConfiguration.ClassConfiguration;
import fumlConfiguration.ClassifierConfiguration;
import fumlConfiguration.DeploymentTargetConfiguration;
import fumlConfiguration.DeviceConfiguration;
import fumlConfiguration.ElementConfiguration;
import fumlConfiguration.EncapsulatedClassifierConfiguration;
import fumlConfiguration.FumlConfigurationPackage;
import fumlConfiguration.NamedElementConfiguration;
import fumlConfiguration.NamespaceConfiguration;
import fumlConfiguration.NodeConfiguration;
import fumlConfiguration.PackageableElementConfiguration;
import fumlConfiguration.ParameterableElementConfiguration;
import fumlConfiguration.RedefinableElementConfiguration;
import fumlConfiguration.StructuredClassifierConfiguration;
import fumlConfiguration.TemplateableElementConfiguration;
import fumlConfiguration.TypeConfiguration;
import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.SemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.impl.DeviceConfigurationImpl#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceConfigurationImpl extends DeviceImpl implements DeviceConfiguration {
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
	protected DeviceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationPackage.eINSTANCE.getDeviceConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticVisitor> getSemanticVisitor() {
		if (semanticVisitor == null) {
			semanticVisitor = new EObjectWithInverseResolvingEList<SemanticVisitor>(SemanticVisitor.class, this, FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR, LociPackage.SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT);
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
			case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR:
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
				case FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR;
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
		if (baseClass == EncapsulatedClassifierConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifierConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ClassConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeploymentTargetConfiguration.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NodeConfiguration.class) {
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
				case FumlConfigurationPackage.ELEMENT_CONFIGURATION__SEMANTIC_VISITOR: return FumlConfigurationPackage.DEVICE_CONFIGURATION__SEMANTIC_VISITOR;
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
		if (baseClass == EncapsulatedClassifierConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifierConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ClassConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DeploymentTargetConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NodeConfiguration.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DeviceConfigurationImpl
