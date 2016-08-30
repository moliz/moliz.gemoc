/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.impl;

import fumlConfiguration.ActivityContentConfiguration;

import fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage;
import fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration;
import fumlConfigurationTrace.States.fumlConfiguration.TracedActivityGroupConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Activity Group Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.impl.TracedActivityGroupConfigurationImpl#getOriginalObject_ActivityContentConfiguration <em>Original Object Activity Content Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedActivityGroupConfigurationImpl extends TracedNamedElementConfigurationImpl implements TracedActivityGroupConfiguration {
	/**
	 * The cached value of the '{@link #getOriginalObject_ActivityContentConfiguration() <em>Original Object Activity Content Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject_ActivityContentConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ActivityContentConfiguration originalObject_ActivityContentConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedActivityGroupConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationPackage.eINSTANCE.getTracedActivityGroupConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContentConfiguration getOriginalObject_ActivityContentConfiguration() {
		if (originalObject_ActivityContentConfiguration != null && originalObject_ActivityContentConfiguration.eIsProxy()) {
			InternalEObject oldOriginalObject_ActivityContentConfiguration = (InternalEObject)originalObject_ActivityContentConfiguration;
			originalObject_ActivityContentConfiguration = (ActivityContentConfiguration)eResolveProxy(oldOriginalObject_ActivityContentConfiguration);
			if (originalObject_ActivityContentConfiguration != oldOriginalObject_ActivityContentConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION, oldOriginalObject_ActivityContentConfiguration, originalObject_ActivityContentConfiguration));
			}
		}
		return originalObject_ActivityContentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityContentConfiguration basicGetOriginalObject_ActivityContentConfiguration() {
		return originalObject_ActivityContentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject_ActivityContentConfiguration(ActivityContentConfiguration newOriginalObject_ActivityContentConfiguration) {
		ActivityContentConfiguration oldOriginalObject_ActivityContentConfiguration = originalObject_ActivityContentConfiguration;
		originalObject_ActivityContentConfiguration = newOriginalObject_ActivityContentConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION, oldOriginalObject_ActivityContentConfiguration, originalObject_ActivityContentConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION:
				if (resolve) return getOriginalObject_ActivityContentConfiguration();
				return basicGetOriginalObject_ActivityContentConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION:
				setOriginalObject_ActivityContentConfiguration((ActivityContentConfiguration)newValue);
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
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION:
				setOriginalObject_ActivityContentConfiguration((ActivityContentConfiguration)null);
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
			case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION:
				return originalObject_ActivityContentConfiguration != null;
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
		if (baseClass == TracedActivityContentConfiguration.class) {
			switch (derivedFeatureID) {
				case FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION: return FumlConfigurationPackage.TRACED_ACTIVITY_CONTENT_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;
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
		if (baseClass == TracedActivityContentConfiguration.class) {
			switch (baseFeatureID) {
				case FumlConfigurationPackage.TRACED_ACTIVITY_CONTENT_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION: return FumlConfigurationPackage.TRACED_ACTIVITY_GROUP_CONFIGURATION__ORIGINAL_OBJECT_ACTIVITY_CONTENT_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TracedActivityGroupConfigurationImpl
