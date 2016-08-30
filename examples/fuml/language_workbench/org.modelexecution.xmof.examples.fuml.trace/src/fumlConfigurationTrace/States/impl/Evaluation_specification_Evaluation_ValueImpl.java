/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.Evaluation_specification_Evaluation_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Classes.Kernel.TracedEvaluation;

import fumlConfigurationTrace.States.fumlConfiguration.TracedValueSpecificationConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation specification Evaluation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl#getSpecification_Evaluation <em>Specification Evaluation</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.Evaluation_specification_Evaluation_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Evaluation_specification_Evaluation_ValueImpl extends MinimalEObjectImpl.Container implements Evaluation_specification_Evaluation_Value {
	/**
	 * The cached value of the '{@link #getSpecification_Evaluation() <em>Specification Evaluation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification_Evaluation()
	 * @generated
	 * @ordered
	 */
	protected TracedValueSpecificationConfiguration specification_Evaluation;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Evaluation_specification_Evaluation_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.EVALUATION_SPECIFICATION_EVALUATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedEvaluation getParent() {
		if (eContainerFeatureID() != StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT) return null;
		return (TracedEvaluation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedEvaluation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedEvaluation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE, TracedEvaluation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValueSpecificationConfiguration getSpecification_Evaluation() {
		if (specification_Evaluation != null && specification_Evaluation.eIsProxy()) {
			InternalEObject oldSpecification_Evaluation = (InternalEObject)specification_Evaluation;
			specification_Evaluation = (TracedValueSpecificationConfiguration)eResolveProxy(oldSpecification_Evaluation);
			if (specification_Evaluation != oldSpecification_Evaluation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION, oldSpecification_Evaluation, specification_Evaluation));
			}
		}
		return specification_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedValueSpecificationConfiguration basicGetSpecification_Evaluation() {
		return specification_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification_Evaluation(TracedValueSpecificationConfiguration newSpecification_Evaluation) {
		TracedValueSpecificationConfiguration oldSpecification_Evaluation = specification_Evaluation;
		specification_Evaluation = newSpecification_Evaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION, oldSpecification_Evaluation, specification_Evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES, StatesPackage.STATE__EVALUATION_SPECIFICATION_EVALUATION_VALUES);
		}
		return states;
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedEvaluation)otherEnd, msgs);
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, KernelPackage.TRACED_EVALUATION__SPECIFICATION_EVALUATION_SEQUENCE, TracedEvaluation.class, msgs);
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				return getParent();
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION:
				if (resolve) return getSpecification_Evaluation();
				return basicGetSpecification_Evaluation();
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				return getStates();
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				setParent((TracedEvaluation)newValue);
				return;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION:
				setSpecification_Evaluation((TracedValueSpecificationConfiguration)newValue);
				return;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				setParent((TracedEvaluation)null);
				return;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION:
				setSpecification_Evaluation((TracedValueSpecificationConfiguration)null);
				return;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__SPECIFICATION_EVALUATION:
				return specification_Evaluation != null;
			case StatesPackage.EVALUATION_SPECIFICATION_EVALUATION_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Evaluation_specification_Evaluation_ValueImpl
