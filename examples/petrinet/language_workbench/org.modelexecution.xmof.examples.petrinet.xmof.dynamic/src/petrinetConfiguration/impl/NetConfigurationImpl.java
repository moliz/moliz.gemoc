/**
 */
package petrinetConfiguration.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import petrinet.impl.NetImpl;

import petrinetConfiguration.NetConfiguration;
import petrinetConfiguration.PetrinetConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NetConfigurationImpl extends NetImpl implements NetConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetConfigurationPackage.Literals.NET_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void main() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run() {
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
			case PetrinetConfigurationPackage.NET_CONFIGURATION___MAIN:
				main();
				return null;
			case PetrinetConfigurationPackage.NET_CONFIGURATION___RUN:
				run();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NetConfigurationImpl
