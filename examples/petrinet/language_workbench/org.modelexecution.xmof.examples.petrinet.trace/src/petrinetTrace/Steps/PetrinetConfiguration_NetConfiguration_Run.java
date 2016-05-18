/**
 */
package petrinetTrace.Steps;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import petrinetConfiguration.NetConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet Configuration Net Configuration Run</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetTrace.Steps.StepsPackage#getPetrinetConfiguration_NetConfiguration_Run()
 * @model
 * @generated
 */
public interface PetrinetConfiguration_NetConfiguration_Run extends SpecificStep, SequentialStep<PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (petrinetConfiguration.NetConfiguration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	NetConfiguration getCaller();

} // PetrinetConfiguration_NetConfiguration_Run
