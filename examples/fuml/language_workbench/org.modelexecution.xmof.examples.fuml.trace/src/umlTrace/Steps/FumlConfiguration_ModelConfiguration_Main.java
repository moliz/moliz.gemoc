/**
 */
package umlTrace.Steps;

import fumlConfiguration.ModelConfiguration;

import org.gemoc.executionframework.engine.mse.SequentialStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuml Configuration Model Configuration Main</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see umlTrace.Steps.StepsPackage#getFumlConfiguration_ModelConfiguration_Main()
 * @model
 * @generated
 */
public interface FumlConfiguration_ModelConfiguration_Main extends SpecificStep, SequentialStep<FumlConfiguration_ModelConfiguration_Main_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (fumlConfiguration.ModelConfiguration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	ModelConfiguration getCaller();

} // FumlConfiguration_ModelConfiguration_Main
