/**
 */
package fumlConfiguration.Loci.impl;

import fumlConfiguration.Classes.Kernel.Evaluation;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.Execution;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;

import fumlConfiguration.Loci.ExecutionFactory;
import fumlConfiguration.Loci.LociPackage;
import fumlConfiguration.Loci.Locus;
import fumlConfiguration.Loci.SemanticVisitor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfiguration.Loci.impl.ExecutionFactoryImpl#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.impl.ExecutionFactoryImpl#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}</li>
 *   <li>{@link fumlConfiguration.Loci.impl.ExecutionFactoryImpl#getBuiltInTypes <em>Built In Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionFactoryImpl extends MinimalEObjectImpl.Container implements ExecutionFactory {
	/**
	 * The cached value of the '{@link #getPrimitiveBehaviorPrototypes() <em>Primitive Behavior Prototypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveBehaviorPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueBehaviorExecution> primitiveBehaviorPrototypes;

	/**
	 * The cached value of the '{@link #getBuiltInTypes() <em>Built In Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> builtInTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.EXECUTION_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_ExecutionFactory() {
		if (eContainerFeatureID() != LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY) return null;
		return (Locus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus_ExecutionFactory(Locus newLocus_ExecutionFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocus_ExecutionFactory, LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExecutionFactory(Locus newLocus_ExecutionFactory) {
		if (newLocus_ExecutionFactory != eInternalContainer() || (eContainerFeatureID() != LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY && newLocus_ExecutionFactory != null)) {
			if (EcoreUtil.isAncestor(this, newLocus_ExecutionFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocus_ExecutionFactory != null)
				msgs = ((InternalEObject)newLocus_ExecutionFactory).eInverseAdd(this, LociPackage.LOCUS__FACTORY, Locus.class, msgs);
			msgs = basicSetLocus_ExecutionFactory(newLocus_ExecutionFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, newLocus_ExecutionFactory, newLocus_ExecutionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueBehaviorExecution> getPrimitiveBehaviorPrototypes() {
		if (primitiveBehaviorPrototypes == null) {
			primitiveBehaviorPrototypes = new EObjectResolvingEList<OpaqueBehaviorExecution>(OpaqueBehaviorExecution.class, this, LociPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES);
		}
		return primitiveBehaviorPrototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveType> getBuiltInTypes() {
		if (builtInTypes == null) {
			builtInTypes = new EObjectResolvingEList<PrimitiveType>(PrimitiveType.class, this, LociPackage.EXECUTION_FACTORY__BUILT_IN_TYPES);
		}
		return builtInTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createExecution(Behavior behavior, fumlConfiguration.Classes.Kernel.Object context, Execution execution) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instantiateVisitor(Element element, SemanticVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createEvaluation(Evaluation evaluation, ValueSpecification specification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBuiltInType(String name, PrimitiveType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void instantiateOpaqueBehaviorExecution(OpaqueBehavior behavior, OpaqueBehaviorExecution execution) {
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocus_ExecutionFactory((Locus)otherEnd, msgs);
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return basicSetLocus_ExecutionFactory(null, msgs);
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return eInternalContainer().eInverseRemove(this, LociPackage.LOCUS__FACTORY, Locus.class, msgs);
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return getLocus_ExecutionFactory();
			case LociPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				return getPrimitiveBehaviorPrototypes();
			case LociPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
				return getBuiltInTypes();
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((Locus)newValue);
				return;
			case LociPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				getPrimitiveBehaviorPrototypes().clear();
				getPrimitiveBehaviorPrototypes().addAll((Collection<? extends OpaqueBehaviorExecution>)newValue);
				return;
			case LociPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
				getBuiltInTypes().clear();
				getBuiltInTypes().addAll((Collection<? extends PrimitiveType>)newValue);
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((Locus)null);
				return;
			case LociPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				getPrimitiveBehaviorPrototypes().clear();
				return;
			case LociPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
				getBuiltInTypes().clear();
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
			case LociPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return getLocus_ExecutionFactory() != null;
			case LociPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				return primitiveBehaviorPrototypes != null && !primitiveBehaviorPrototypes.isEmpty();
			case LociPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
				return builtInTypes != null && !builtInTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutionFactoryImpl
