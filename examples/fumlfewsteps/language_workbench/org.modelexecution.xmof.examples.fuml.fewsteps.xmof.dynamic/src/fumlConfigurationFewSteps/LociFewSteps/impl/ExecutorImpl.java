/**
 */
package fumlConfigurationFewSteps.LociFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Value;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.ParameterValue;

import fumlConfigurationFewSteps.LociFewSteps.Executor;
import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;
import fumlConfigurationFewSteps.LociFewSteps.Locus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutorImpl#getLocus_Executor <em>Locus Executor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutorImpl extends MinimalEObjectImpl.Container implements Executor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociFewStepsPackage.Literals.EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_Executor() {
		if (eContainerFeatureID() != LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR) return null;
		return (Locus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus_Executor(Locus newLocus_Executor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocus_Executor, LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_Executor(Locus newLocus_Executor) {
		if (newLocus_Executor != eInternalContainer() || (eContainerFeatureID() != LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR && newLocus_Executor != null)) {
			if (EcoreUtil.isAncestor(this, newLocus_Executor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocus_Executor != null)
				msgs = ((InternalEObject)newLocus_Executor).eInverseAdd(this, LociFewStepsPackage.LOCUS__EXECUTOR, Locus.class, msgs);
			msgs = basicSetLocus_Executor(newLocus_Executor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR, newLocus_Executor, newLocus_Executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(Behavior behavior, fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context, EList<ParameterValue> inputs, EList<ParameterValue> outputs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluate(ValueSpecification specification, Value value) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocus_Executor((Locus)otherEnd, msgs);
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
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				return basicSetLocus_Executor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				return eInternalContainer().eInverseRemove(this, LociFewStepsPackage.LOCUS__EXECUTOR, Locus.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				return getLocus_Executor();
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
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				setLocus_Executor((Locus)newValue);
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
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				setLocus_Executor((Locus)null);
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
			case LociFewStepsPackage.EXECUTOR__LOCUS_EXECUTOR:
				return getLocus_Executor() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutorImpl
