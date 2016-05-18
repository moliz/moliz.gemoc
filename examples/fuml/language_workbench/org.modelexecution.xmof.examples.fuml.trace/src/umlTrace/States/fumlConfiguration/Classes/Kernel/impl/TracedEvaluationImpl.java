/**
 */
package umlTrace.States.fumlConfiguration.Classes.Kernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.Evaluation_locus_Evaluation_Value;
import umlTrace.States.Evaluation_specification_Evaluation_Value;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;

import umlTrace.States.fumlConfiguration.Loci.impl.TracedSemanticVisitorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl#getLocus_EvaluationSequence <em>Locus Evaluation Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Classes.Kernel.impl.TracedEvaluationImpl#getSpecification_EvaluationSequence <em>Specification Evaluation Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TracedEvaluationImpl extends TracedSemanticVisitorImpl implements TracedEvaluation {
	/**
	 * The cached value of the '{@link #getLocus_EvaluationSequence() <em>Locus Evaluation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_EvaluationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation_locus_Evaluation_Value> locus_EvaluationSequence;

	/**
	 * The cached value of the '{@link #getSpecification_EvaluationSequence() <em>Specification Evaluation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_EvaluationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation_specification_Evaluation_Value> specification_EvaluationSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.TRACED_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation_locus_Evaluation_Value> getLocus_EvaluationSequence() {
		if (locus_EvaluationSequence == null) {
			locus_EvaluationSequence = new EObjectContainmentWithInverseEList<Evaluation_locus_Evaluation_Value>(Evaluation_locus_Evaluation_Value.class, this, KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE, StatesPackage.EVALUATION_LOCUS_EVALUATION_VALUE__PARENT);
		}
		return locus_EvaluationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation_specification_Evaluation_Value> getSpecification_EvaluationSequence() {
		if (specification_EvaluationSequence == null) {
			specification_EvaluationSequence = new EObjectContainmentWithInverseEList<Evaluation_specification_Evaluation_Value>(Evaluation_specification_Evaluation_Value.class, this, KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT);
		}
		return specification_EvaluationSequence;
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_EvaluationSequence()).basicAdd(otherEnd, msgs);
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecification_EvaluationSequence()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				return ((InternalEList<?>)getLocus_EvaluationSequence()).basicRemove(otherEnd, msgs);
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				return ((InternalEList<?>)getSpecification_EvaluationSequence()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				return getLocus_EvaluationSequence();
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				return getSpecification_EvaluationSequence();
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				getLocus_EvaluationSequence().clear();
				getLocus_EvaluationSequence().addAll((Collection<? extends Evaluation_locus_Evaluation_Value>)newValue);
				return;
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				getSpecification_EvaluationSequence().clear();
				getSpecification_EvaluationSequence().addAll((Collection<? extends Evaluation_specification_Evaluation_Value>)newValue);
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				getLocus_EvaluationSequence().clear();
				return;
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				getSpecification_EvaluationSequence().clear();
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
			case KernelPackage.TRACED_EVALUATION__LOCUS_EVALUATION_SEQUENCE:
				return locus_EvaluationSequence != null && !locus_EvaluationSequence.isEmpty();
			case KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE:
				return specification_EvaluationSequence != null && !specification_EvaluationSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedEvaluationImpl
