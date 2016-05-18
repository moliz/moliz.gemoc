/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.impl;

import org.eclipse.emf.ecore.EClass;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue;

import umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TracedValueImpl extends TracedSemanticVisitorImpl implements TracedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_VALUE;
	}

} //TracedValueImpl
