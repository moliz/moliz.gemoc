/**
 */
package umlTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Loci Semantic Visitor Initialize Semantic Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor()
 * @model
 * @generated
 */
public interface FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor extends FumlConfiguration_Loci_ExecutionFactory_InstantiateVisitor_ExecutionFactory_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedSemanticVisitor getCaller();

} // FumlConfiguration_Loci_SemanticVisitor_Initialize_SemanticVisitor
