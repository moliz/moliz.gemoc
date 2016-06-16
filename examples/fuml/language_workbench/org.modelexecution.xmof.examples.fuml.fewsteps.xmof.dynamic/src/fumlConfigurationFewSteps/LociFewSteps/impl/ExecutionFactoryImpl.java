/**
 */
package fumlConfigurationFewSteps.LociFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Evaluation;

import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.Execution;
import fumlConfigurationFewSteps.CommonBehaviorsFewSteps.BasicBehaviorsFewSteps.OpaqueBehaviorExecution;

import fumlConfigurationFewSteps.LociFewSteps.ExecutionFactory;
import fumlConfigurationFewSteps.LociFewSteps.LociFewStepsPackage;
import fumlConfigurationFewSteps.LociFewSteps.Locus;
import fumlConfigurationFewSteps.LociFewSteps.SemanticVisitor;

import java.lang.reflect.InvocationTargetException;

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
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl#getLocus_ExecutionFactory <em>Locus Execution Factory</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl#getPrimitiveBehaviorPrototypes <em>Primitive Behavior Prototypes</em>}</li>
 *   <li>{@link fumlConfigurationFewSteps.LociFewSteps.impl.ExecutionFactoryImpl#getBuiltInTypes <em>Built In Types</em>}</li>
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
		return LociFewStepsPackage.Literals.EXECUTION_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus_ExecutionFactory() {
		if (eContainerFeatureID() != LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY) return null;
		return (Locus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus_ExecutionFactory(Locus newLocus_ExecutionFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocus_ExecutionFactory, LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus_ExecutionFactory(Locus newLocus_ExecutionFactory) {
		if (newLocus_ExecutionFactory != eInternalContainer() || (eContainerFeatureID() != LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY && newLocus_ExecutionFactory != null)) {
			if (EcoreUtil.isAncestor(this, newLocus_ExecutionFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocus_ExecutionFactory != null)
				msgs = ((InternalEObject)newLocus_ExecutionFactory).eInverseAdd(this, LociFewStepsPackage.LOCUS__FACTORY, Locus.class, msgs);
			msgs = basicSetLocus_ExecutionFactory(newLocus_ExecutionFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY, newLocus_ExecutionFactory, newLocus_ExecutionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueBehaviorExecution> getPrimitiveBehaviorPrototypes() {
		if (primitiveBehaviorPrototypes == null) {
			primitiveBehaviorPrototypes = new EObjectResolvingEList<OpaqueBehaviorExecution>(OpaqueBehaviorExecution.class, this, LociFewStepsPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES);
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
			builtInTypes = new EObjectResolvingEList<PrimitiveType>(PrimitiveType.class, this, LociFewStepsPackage.EXECUTION_FACTORY__BUILT_IN_TYPES);
		}
		return builtInTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createExecution(Behavior behavior, fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object context, Execution execution) {
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return eInternalContainer().eInverseRemove(this, LociFewStepsPackage.LOCUS__FACTORY, Locus.class, msgs);
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return getLocus_ExecutionFactory();
			case LociFewStepsPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				return getPrimitiveBehaviorPrototypes();
			case LociFewStepsPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((Locus)newValue);
				return;
			case LociFewStepsPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				getPrimitiveBehaviorPrototypes().clear();
				getPrimitiveBehaviorPrototypes().addAll((Collection<? extends OpaqueBehaviorExecution>)newValue);
				return;
			case LociFewStepsPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				setLocus_ExecutionFactory((Locus)null);
				return;
			case LociFewStepsPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				getPrimitiveBehaviorPrototypes().clear();
				return;
			case LociFewStepsPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
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
			case LociFewStepsPackage.EXECUTION_FACTORY__LOCUS_EXECUTION_FACTORY:
				return getLocus_ExecutionFactory() != null;
			case LociFewStepsPackage.EXECUTION_FACTORY__PRIMITIVE_BEHAVIOR_PROTOTYPES:
				return primitiveBehaviorPrototypes != null && !primitiveBehaviorPrototypes.isEmpty();
			case LociFewStepsPackage.EXECUTION_FACTORY__BUILT_IN_TYPES:
				return builtInTypes != null && !builtInTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LociFewStepsPackage.EXECUTION_FACTORY___CREATE_EXECUTION__BEHAVIOR_OBJECT_EXECUTION:
				createExecution((Behavior)arguments.get(0), (fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object)arguments.get(1), (Execution)arguments.get(2));
				return null;
			case LociFewStepsPackage.EXECUTION_FACTORY___INSTANTIATE_VISITOR__ELEMENT_SEMANTICVISITOR:
				instantiateVisitor((Element)arguments.get(0), (SemanticVisitor)arguments.get(1));
				return null;
			case LociFewStepsPackage.EXECUTION_FACTORY___CREATE_EVALUATION__EVALUATION_VALUESPECIFICATION:
				createEvaluation((Evaluation)arguments.get(0), (ValueSpecification)arguments.get(1));
				return null;
			case LociFewStepsPackage.EXECUTION_FACTORY___GET_BUILT_IN_TYPE__STRING_PRIMITIVETYPE:
				getBuiltInType((String)arguments.get(0), (PrimitiveType)arguments.get(1));
				return null;
			case LociFewStepsPackage.EXECUTION_FACTORY___INSTANTIATE_OPAQUE_BEHAVIOR_EXECUTION__OPAQUEBEHAVIOR_OPAQUEBEHAVIOREXECUTION:
				instantiateOpaqueBehaviorExecution((OpaqueBehavior)arguments.get(0), (OpaqueBehaviorExecution)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExecutionFactoryImpl
