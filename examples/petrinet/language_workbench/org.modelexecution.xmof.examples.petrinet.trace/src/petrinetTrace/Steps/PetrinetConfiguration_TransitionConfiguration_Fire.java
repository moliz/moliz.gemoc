/**
 */
package petrinetTrace.Steps;

import org.gemoc.executionframework.engine.mse.SmallStep;

import petrinetConfiguration.TransitionConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet Configuration Transition Configuration Fire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinetTrace.Steps.StepsPackage#getPetrinetConfiguration_TransitionConfiguration_Fire()
 * @model
 * @generated
 */
public interface PetrinetConfiguration_TransitionConfiguration_Fire extends PetrinetConfiguration_NetConfiguration_Run_AbstractSubStep, SpecificStep, SmallStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (petrinetConfiguration.TransitionConfiguration) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TransitionConfiguration getCaller();

} // PetrinetConfiguration_TransitionConfiguration_Fire
