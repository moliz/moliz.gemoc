/**
 */
package fumlConfiguration.Classes.Kernel.impl;

import fumlConfiguration.Classes.Kernel.KernelPackage;
import fumlConfiguration.Classes.Kernel.LiteralEvaluation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralEvaluationImpl extends EvaluationImpl implements LiteralEvaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.LITERAL_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getType(String builtInTypeName, PrimitiveType type) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KernelPackage.LITERAL_EVALUATION___GET_TYPE__STRING_PRIMITIVETYPE:
				getType((String)arguments.get(0), (PrimitiveType)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LiteralEvaluationImpl
