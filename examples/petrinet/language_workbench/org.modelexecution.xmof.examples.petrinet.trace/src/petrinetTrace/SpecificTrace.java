/**
 */
package petrinetTrace;

import org.eclipse.emf.common.util.EList;

import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.Trace;

import petrinetTrace.States.State;

import petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

import petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run;
import petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire;
import petrinetTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Run_Sequence <em>Petrinet Configuration Net Configuration Run Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence <em>Petrinet Configuration Transition Configuration Fire Sequence</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getPetrinetConfiguration_tracedPlaceConfigurations <em>Petrinet Configuration traced Place Configurations</em>}</li>
 *   <li>{@link petrinetTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Petrinet Configuration Net Configuration Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.PetrinetConfiguration_NetConfiguration_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration Net Configuration Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration Net Configuration Run Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<PetrinetConfiguration_NetConfiguration_Run> getPetrinetConfiguration_NetConfiguration_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Configuration Transition Configuration Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration Transition Configuration Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration Transition Configuration Fire Sequence</em>' reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<PetrinetConfiguration_TransitionConfiguration_Fire> getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Configuration traced Place Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.petrinetConfiguration.TracedPlaceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration traced Place Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration traced Place Configurations</em>' containment reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlaceConfiguration> getPetrinetConfiguration_tracedPlaceConfigurations();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetTrace.PetrinetTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
