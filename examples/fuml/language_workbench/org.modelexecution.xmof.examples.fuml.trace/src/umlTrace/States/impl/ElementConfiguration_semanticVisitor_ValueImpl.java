/**
 */
package umlTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import umlTrace.States.ElementConfiguration_semanticVisitor_Value;
import umlTrace.States.State;
import umlTrace.States.StatesPackage;

import umlTrace.States.fumlConfiguration.FumlConfigurationPackage;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import umlTrace.States.fumlConfiguration.TracedElementConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Configuration semantic Visitor Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl#getSemanticVisitor <em>Semantic Visitor</em>}</li>
 *   <li>{@link umlTrace.States.impl.ElementConfiguration_semanticVisitor_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementConfiguration_semanticVisitor_ValueImpl extends MinimalEObjectImpl.Container implements ElementConfiguration_semanticVisitor_Value {
	/**
	 * The cached value of the '{@link #getSemanticVisitor() <em>Semantic Visitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticVisitor()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSemanticVisitor> semanticVisitor;

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
	protected ElementConfiguration_semanticVisitor_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE;
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
	public TracedElementConfiguration getParent() {
		if (eContainerFeatureID() != StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT) return null;
		return (TracedElementConfiguration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedElementConfiguration newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedElementConfiguration newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE, TracedElementConfiguration.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSemanticVisitor> getSemanticVisitor() {
		if (semanticVisitor == null) {
			semanticVisitor = new EObjectResolvingEList<TracedSemanticVisitor>(TracedSemanticVisitor.class, this, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR);
		}
		return semanticVisitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES, StatesPackage.STATE__ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUES);
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedElementConfiguration)otherEnd, msgs);
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, FumlConfigurationPackage.TRACED_ELEMENT_CONFIGURATION__SEMANTIC_VISITOR_SEQUENCE, TracedElementConfiguration.class, msgs);
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				return getParent();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR:
				return getSemanticVisitor();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				setParent((TracedElementConfiguration)newValue);
				return;
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR:
				getSemanticVisitor().clear();
				getSemanticVisitor().addAll((Collection<? extends TracedSemanticVisitor>)newValue);
				return;
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				setParent((TracedElementConfiguration)null);
				return;
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR:
				getSemanticVisitor().clear();
				return;
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
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
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__SEMANTIC_VISITOR:
				return semanticVisitor != null && !semanticVisitor.isEmpty();
			case StatesPackage.ELEMENT_CONFIGURATION_SEMANTIC_VISITOR_VALUE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementConfiguration_semanticVisitor_ValueImpl
