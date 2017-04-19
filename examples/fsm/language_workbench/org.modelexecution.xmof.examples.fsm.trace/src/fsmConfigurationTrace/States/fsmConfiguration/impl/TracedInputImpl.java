/**
 */
package fsmConfigurationTrace.States.fsmConfiguration.impl;

import fsmConfiguration.Input;

import fsmConfigurationTrace.States.Input_stringSeq_Dimension;
import fsmConfigurationTrace.States.SpecificDimension;

import fsmConfigurationTrace.States.fsmConfiguration.FsmConfigurationPackage;
import fsmConfigurationTrace.States.fsmConfiguration.TracedInput;

import fsmConfigurationTrace.States.impl.SpecificTracedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl#getInput_stringSeq_Dimension <em>Input string Seq Dimension</em>}</li>
 *   <li>{@link fsmConfigurationTrace.States.fsmConfiguration.impl.TracedInputImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedInputImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedInput {
	/**
	 * The cached value of the '{@link #getInput_stringSeq_Dimension() <em>Input string Seq Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_stringSeq_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Input_stringSeq_Dimension input_stringSeq_Dimension;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Input originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmConfigurationPackage.Literals.TRACED_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_stringSeq_Dimension getInput_stringSeq_Dimension() {
		return input_stringSeq_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput_stringSeq_Dimension(Input_stringSeq_Dimension newInput_stringSeq_Dimension, NotificationChain msgs) {
		Input_stringSeq_Dimension oldInput_stringSeq_Dimension = input_stringSeq_Dimension;
		input_stringSeq_Dimension = newInput_stringSeq_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION, oldInput_stringSeq_Dimension, newInput_stringSeq_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_stringSeq_Dimension(Input_stringSeq_Dimension newInput_stringSeq_Dimension) {
		if (newInput_stringSeq_Dimension != input_stringSeq_Dimension) {
			NotificationChain msgs = null;
			if (input_stringSeq_Dimension != null)
				msgs = ((InternalEObject)input_stringSeq_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION, null, msgs);
			if (newInput_stringSeq_Dimension != null)
				msgs = ((InternalEObject)newInput_stringSeq_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION, null, msgs);
			msgs = basicSetInput_stringSeq_Dimension(newInput_stringSeq_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION, newInput_stringSeq_Dimension, newInput_stringSeq_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Input)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Input newOriginalObject) {
		Input oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getInput_stringSeq_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION:
				return basicSetInput_stringSeq_Dimension(null, msgs);
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
			case FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION:
				return getInput_stringSeq_Dimension();
			case FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION:
				setInput_stringSeq_Dimension((Input_stringSeq_Dimension)newValue);
				return;
			case FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				setOriginalObject((Input)newValue);
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
			case FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION:
				setInput_stringSeq_Dimension((Input_stringSeq_Dimension)null);
				return;
			case FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				setOriginalObject((Input)null);
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
			case FsmConfigurationPackage.TRACED_INPUT__INPUT_STRING_SEQ_DIMENSION:
				return input_stringSeq_Dimension != null;
			case FsmConfigurationPackage.TRACED_INPUT__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedInputImpl
