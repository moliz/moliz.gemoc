/**
 */
package fumlConfiguration.Classes.Kernel;

import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fumlConfiguration.Classes.Kernel.KernelPackage#getLiteralEvaluation()
 * @model abstract="true"
 * @generated
 */
public interface LiteralEvaluation extends Evaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model builtInTypeNameRequired="true" typeRequired="true"
	 *        annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void getType(String builtInTypeName, PrimitiveType type);

} // LiteralEvaluation
