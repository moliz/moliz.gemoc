/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.Evaluation;
import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.Value;

import fumlConfiguration.Loci.Locus;

import fumlConfiguration.Loci.impl.SemanticVisitorImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Classes.Kernel.impl.EvaluationImpl#getSpecification_Evaluation <em>Specification Evaluation</em>}</li>
 *   <li>{@link fumlConfiguration.Classes.Kernel.impl.EvaluationImpl#getLocus_Evaluation <em>Locus Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EvaluationImpl extends SemanticVisitorImpl implements Evaluation {
	/**
	 * The cached value of the '{@link #getSpecification_Evaluation() <em>Specification Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_Evaluation()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification specification_Evaluation;

	/**
	 * The cached value of the '{@link #getLocus_Evaluation() <em>Locus Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_Evaluation()
	 * @generated
	 * @ordered
	 */
	protected Locus locus_Evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getSpecification_Evaluation() {
		if (specification_Evaluation != null && specification_Evaluation.eIsProxy()) {
			InternalEObject oldSpecification_Evaluation = (InternalEObject)specification_Evaluation;
			specification_Evaluation = (ValueSpecification)eResolveProxy(oldSpecification_Evaluation);
			if (specification_Evaluation != oldSpecification_Evaluation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.EVALUATION__SPECIFICATION_EVALUATION, oldSpecification_Evaluation, specification_Evaluation));
			}
		}
		return specification_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetSpecification_Evaluation() {
		return specification_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification_Evaluation(ValueSpecification newSpecification_Evaluation) {
		ValueSpecification oldSpecification_Evaluation = specification_Evaluation;
		specification_Evaluation = newSpecification_Evaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.EVALUATION__SPECIFICATION_EVALUATION, oldSpecification_Evaluation, specification_Evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_Evaluation() {
		if (locus_Evaluation != null && locus_Evaluation.eIsProxy()) {
			InternalEObject oldLocus_Evaluation = (InternalEObject)locus_Evaluation;
			locus_Evaluation = (Locus)eResolveProxy(oldLocus_Evaluation);
			if (locus_Evaluation != oldLocus_Evaluation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.EVALUATION__LOCUS_EVALUATION, oldLocus_Evaluation, locus_Evaluation));
			}
		}
		return locus_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus basicGetLocus_Evaluation() {
		return locus_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_Evaluation(Locus newLocus_Evaluation) {
		Locus oldLocus_Evaluation = locus_Evaluation;
		locus_Evaluation = newLocus_Evaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.EVALUATION__LOCUS_EVALUATION, oldLocus_Evaluation, locus_Evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluate(Value value) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.EVALUATION__SPECIFICATION_EVALUATION:
				if (resolve) return getSpecification_Evaluation();
				return basicGetSpecification_Evaluation();
			case KernelPackage.EVALUATION__LOCUS_EVALUATION:
				if (resolve) return getLocus_Evaluation();
				return basicGetLocus_Evaluation();
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
			case KernelPackage.EVALUATION__SPECIFICATION_EVALUATION:
				setSpecification_Evaluation((ValueSpecification)newValue);
				return;
			case KernelPackage.EVALUATION__LOCUS_EVALUATION:
				setLocus_Evaluation((Locus)newValue);
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
			case KernelPackage.EVALUATION__SPECIFICATION_EVALUATION:
				setSpecification_Evaluation((ValueSpecification)null);
				return;
			case KernelPackage.EVALUATION__LOCUS_EVALUATION:
				setLocus_Evaluation((Locus)null);
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
			case KernelPackage.EVALUATION__SPECIFICATION_EVALUATION:
				return specification_Evaluation != null;
			case KernelPackage.EVALUATION__LOCUS_EVALUATION:
				return locus_Evaluation != null;
		}
		return super.eIsSet(featureID);
	}

} //EvaluationImpl
