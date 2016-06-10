/**
 */
package fumlConfigurationTrace.States.impl;

import fumlConfigurationTrace.States.SemanticVisitor_runtimeModelElement_Value;
import fumlConfigurationTrace.States.State;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import fumlConfigurationTrace.States.fumlConfiguration.TracedElementConfiguration;

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
 * An implementation of the model object '<em><b>Semantic Visitor runtime Model Element Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl#getRuntimeModelElement <em>Runtime Model Element</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.impl.SemanticVisitor_runtimeModelElement_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticVisitor_runtimeModelElement_ValueImpl extends MinimalEObjectImpl.Container implements SemanticVisitor_runtimeModelElement_Value {
	/**
	 * The cached value of the '{@link #getRuntimeModelElement() <em>Runtime Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeModelElement()
	 * @generated
	 * @ordered
	 */
	protected TracedElementConfiguration runtimeModelElement;

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
	protected SemanticVisitor_runtimeModelElement_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE;
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
	public TracedSemanticVisitor getParent() {
		if (eContainerFeatureID() != StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT) return null;
		return (TracedSemanticVisitor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedSemanticVisitor newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedSemanticVisitor newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE, TracedSemanticVisitor.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedElementConfiguration getRuntimeModelElement() {
		if (runtimeModelElement != null && runtimeModelElement.eIsProxy()) {
			InternalEObject oldRuntimeModelElement = (InternalEObject)runtimeModelElement;
			runtimeModelElement = (TracedElementConfiguration)eResolveProxy(oldRuntimeModelElement);
			if (runtimeModelElement != oldRuntimeModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT, oldRuntimeModelElement, runtimeModelElement));
			}
		}
		return runtimeModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedElementConfiguration basicGetRuntimeModelElement() {
		return runtimeModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeModelElement(TracedElementConfiguration newRuntimeModelElement) {
		TracedElementConfiguration oldRuntimeModelElement = runtimeModelElement;
		runtimeModelElement = newRuntimeModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT, oldRuntimeModelElement, runtimeModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES, StatesPackage.STATE__SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUES);
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedSemanticVisitor)otherEnd, msgs);
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, LociPackage.TRACED_SEMANTIC_VISITOR__RUNTIME_MODEL_ELEMENT_SEQUENCE, TracedSemanticVisitor.class, msgs);
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				return getParent();
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT:
				if (resolve) return getRuntimeModelElement();
				return basicGetRuntimeModelElement();
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				setParent((TracedSemanticVisitor)newValue);
				return;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT:
				setRuntimeModelElement((TracedElementConfiguration)newValue);
				return;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				setParent((TracedSemanticVisitor)null);
				return;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT:
				setRuntimeModelElement((TracedElementConfiguration)null);
				return;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
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
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__RUNTIME_MODEL_ELEMENT:
				return runtimeModelElement != null;
			case StatesPackage.SEMANTIC_VISITOR_RUNTIME_MODEL_ELEMENT_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticVisitor_runtimeModelElement_ValueImpl
