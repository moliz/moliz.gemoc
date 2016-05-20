/**
 */
package umlTrace.States.fumlConfiguration.Loci.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Loci.LociPackage;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Loci.impl.TracedExecutionEnvironmentImpl#getLocus_ExecutionEnvironmentSequence <em>Locus Execution Environment Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedExecutionEnvironmentImpl extends MinimalEObjectImpl.Container implements TracedExecutionEnvironment {
	/**
	 * The cached value of the '{@link #getLocus_ExecutionEnvironmentSequence() <em>Locus Execution Environment Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutionEnvironmentSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> locus_ExecutionEnvironmentSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedExecutionEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.TRACED_EXECUTION_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionEnvironment_locus_ExecutionEnvironment_Value> getLocus_ExecutionEnvironmentSequence() {
		if (locus_ExecutionEnvironmentSequence == null) {
			locus_ExecutionEnvironmentSequence = new EObjectContainmentWithInverseEList<ExecutionEnvironment_locus_ExecutionEnvironment_Value>(ExecutionEnvironment_locus_ExecutionEnvironment_Value.class, this, LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE, StatesPackage.EXECUTION_ENVIRONMENT_LOCUS_EXECUTION_ENVIRONMENT_VALUE__PARENT);
		}
		return locus_ExecutionEnvironmentSequence;
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_ExecutionEnvironmentSequence()).basicAdd(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				return ((InternalEList<?>)getLocus_ExecutionEnvironmentSequence()).basicRemove(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				return getLocus_ExecutionEnvironmentSequence();
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				getLocus_ExecutionEnvironmentSequence().clear();
				getLocus_ExecutionEnvironmentSequence().addAll((Collection<? extends ExecutionEnvironment_locus_ExecutionEnvironment_Value>)newValue);
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				getLocus_ExecutionEnvironmentSequence().clear();
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
			case LociPackage.TRACED_EXECUTION_ENVIRONMENT__LOCUS_EXECUTION_ENVIRONMENT_SEQUENCE:
				return locus_ExecutionEnvironmentSequence != null && !locus_ExecutionEnvironmentSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedExecutionEnvironmentImpl
