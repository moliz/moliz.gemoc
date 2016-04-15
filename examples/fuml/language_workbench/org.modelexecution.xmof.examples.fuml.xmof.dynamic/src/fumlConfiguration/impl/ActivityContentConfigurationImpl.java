/**
 */
package fumlConfiguration.impl;

import fumlConfiguration.ActivityContentConfiguration;
import fumlConfiguration.FumlConfigurationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Content Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActivityContentConfigurationImpl extends MinimalEObjectImpl.Container implements ActivityContentConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityContentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationPackage.eINSTANCE.getActivityContentConfiguration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity containingActivity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FumlConfigurationPackage.ACTIVITY_CONTENT_CONFIGURATION___CONTAINING_ACTIVITY:
				return containingActivity();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActivityContentConfigurationImpl
