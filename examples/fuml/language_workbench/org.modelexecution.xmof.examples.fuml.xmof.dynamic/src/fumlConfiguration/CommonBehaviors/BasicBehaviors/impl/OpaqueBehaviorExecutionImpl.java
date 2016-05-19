/**
 */
package fumlConfiguration.CommonBehaviors.BasicBehaviors.impl;

import fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution;
import fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OpaqueBehaviorExecutionImpl extends ExecutionImpl implements OpaqueBehaviorExecution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueBehaviorExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsPackage.Literals.OPAQUE_BEHAVIOR_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doBody(EList<ParameterValue> inputParameters, EList<ParameterValue> outputParameters) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicBehaviorsPackage.OPAQUE_BEHAVIOR_EXECUTION___DO_BODY__ELIST_ELIST:
				doBody((EList<ParameterValue>)arguments.get(0), (EList<ParameterValue>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OpaqueBehaviorExecutionImpl
