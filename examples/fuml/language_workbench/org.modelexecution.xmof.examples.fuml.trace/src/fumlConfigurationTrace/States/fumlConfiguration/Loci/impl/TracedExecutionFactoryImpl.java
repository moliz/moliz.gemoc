/**
 */
package fumlConfigurationTrace.States.fumlConfiguration.Loci.impl;

import fumlConfigurationTrace.States.ExecutionFactory_builtInTypes_Value;
import fumlConfigurationTrace.States.ExecutionFactory_locus_ExecutionFactory_Value;
import fumlConfigurationTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value;
import fumlConfigurationTrace.States.StatesPackage;

import fumlConfigurationTrace.States.fumlConfiguration.Loci.LociPackage;
import fumlConfigurationTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Execution Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl#getBuiltInTypesSequence <em>Built In Types Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl#getLocus_ExecutionFactorySequence <em>Locus Execution Factory Sequence</em>}</li>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.Loci.impl.TracedExecutionFactoryImpl#getPrimitiveBehaviorPrototypesSequence <em>Primitive Behavior Prototypes Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedExecutionFactoryImpl extends MinimalEObjectImpl.Container implements TracedExecutionFactory {
	/**
	 * The cached value of the '{@link #getBuiltInTypesSequence() <em>Built In Types Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInTypesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_builtInTypes_Value> builtInTypesSequence;

	/**
	 * The cached value of the '{@link #getLocus_ExecutionFactorySequence() <em>Locus Execution Factory Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocus_ExecutionFactorySequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_locus_ExecutionFactory_Value> locus_ExecutionFactorySequence;

	/**
	 * The cached value of the '{@link #getPrimitiveBehaviorPrototypesSequence() <em>Primitive Behavior Prototypes Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveBehaviorPrototypesSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> primitiveBehaviorPrototypesSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedExecutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociPackage.Literals.TRACED_EXECUTION_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_builtInTypes_Value> getBuiltInTypesSequence() {
		if (builtInTypesSequence == null) {
			builtInTypesSequence = new EObjectContainmentWithInverseEList<ExecutionFactory_builtInTypes_Value>(ExecutionFactory_builtInTypes_Value.class, this, LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE, StatesPackage.EXECUTION_FACTORY_BUILT_IN_TYPES_VALUE__PARENT);
		}
		return builtInTypesSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_locus_ExecutionFactory_Value> getLocus_ExecutionFactorySequence() {
		if (locus_ExecutionFactorySequence == null) {
			locus_ExecutionFactorySequence = new EObjectContainmentWithInverseEList<ExecutionFactory_locus_ExecutionFactory_Value>(ExecutionFactory_locus_ExecutionFactory_Value.class, this, LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE, StatesPackage.EXECUTION_FACTORY_LOCUS_EXECUTION_FACTORY_VALUE__PARENT);
		}
		return locus_ExecutionFactorySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionFactory_primitiveBehaviorPrototypes_Value> getPrimitiveBehaviorPrototypesSequence() {
		if (primitiveBehaviorPrototypesSequence == null) {
			primitiveBehaviorPrototypesSequence = new EObjectContainmentWithInverseEList<ExecutionFactory_primitiveBehaviorPrototypes_Value>(ExecutionFactory_primitiveBehaviorPrototypes_Value.class, this, LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE, StatesPackage.EXECUTION_FACTORY_PRIMITIVE_BEHAVIOR_PROTOTYPES_VALUE__PARENT);
		}
		return primitiveBehaviorPrototypesSequence;
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuiltInTypesSequence()).basicAdd(otherEnd, msgs);
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocus_ExecutionFactorySequence()).basicAdd(otherEnd, msgs);
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimitiveBehaviorPrototypesSequence()).basicAdd(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				return ((InternalEList<?>)getBuiltInTypesSequence()).basicRemove(otherEnd, msgs);
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				return ((InternalEList<?>)getLocus_ExecutionFactorySequence()).basicRemove(otherEnd, msgs);
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				return ((InternalEList<?>)getPrimitiveBehaviorPrototypesSequence()).basicRemove(otherEnd, msgs);
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				return getBuiltInTypesSequence();
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				return getLocus_ExecutionFactorySequence();
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				return getPrimitiveBehaviorPrototypesSequence();
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				getBuiltInTypesSequence().clear();
				getBuiltInTypesSequence().addAll((Collection<? extends ExecutionFactory_builtInTypes_Value>)newValue);
				return;
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				getLocus_ExecutionFactorySequence().clear();
				getLocus_ExecutionFactorySequence().addAll((Collection<? extends ExecutionFactory_locus_ExecutionFactory_Value>)newValue);
				return;
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				getPrimitiveBehaviorPrototypesSequence().clear();
				getPrimitiveBehaviorPrototypesSequence().addAll((Collection<? extends ExecutionFactory_primitiveBehaviorPrototypes_Value>)newValue);
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				getBuiltInTypesSequence().clear();
				return;
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				getLocus_ExecutionFactorySequence().clear();
				return;
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				getPrimitiveBehaviorPrototypesSequence().clear();
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
			case LociPackage.TRACED_EXECUTION_FACTORY__BUILT_IN_TYPES_SEQUENCE:
				return builtInTypesSequence != null && !builtInTypesSequence.isEmpty();
			case LociPackage.TRACED_EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY_SEQUENCE:
				return locus_ExecutionFactorySequence != null && !locus_ExecutionFactorySequence.isEmpty();
			case LociPackage.TRACED_EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES_SEQUENCE:
				return primitiveBehaviorPrototypesSequence != null && !primitiveBehaviorPrototypesSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedExecutionFactoryImpl
