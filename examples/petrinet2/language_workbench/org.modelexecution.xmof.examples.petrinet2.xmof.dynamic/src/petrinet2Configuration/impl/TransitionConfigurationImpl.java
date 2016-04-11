/**
 */
package petrinet2Configuration.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import petrinet2.impl.TransitionImpl;

import petrinet2Configuration.Petrinet2ConfigurationPackage;
import petrinet2Configuration.TransitionConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransitionConfigurationImpl extends TransitionImpl implements TransitionConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Petrinet2ConfigurationPackage.Literals.TRANSITION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fire() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
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
			case Petrinet2ConfigurationPackage.TRANSITION_CONFIGURATION___FIRE:
				fire();
				return null;
			case Petrinet2ConfigurationPackage.TRANSITION_CONFIGURATION___IS_ENABLED:
				return isEnabled();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionConfigurationImpl
