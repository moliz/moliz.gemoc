/**
 */
package petrinetConfigurationTrace;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;

import org.eclipse.emf.common.util.EList;

import petrinetConfigurationTrace.States.State;

import petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration;

import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run;
import petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire;
import petrinetConfigurationTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Main_Sequence <em>Petrinet Configuration Net Configuration Main Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_NetConfiguration_Run_Sequence <em>Petrinet Configuration Net Configuration Run Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence <em>Petrinet Configuration Transition Configuration Fire Sequence</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.SpecificTrace#getPetrinetConfiguration_tracedPlaceConfigurations <em>Petrinet Configuration traced Place Configurations</em>}</li>
 *   <li>{@link petrinetConfigurationTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Petrinet Configuration Net Configuration Main Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Main}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration Net Configuration Main Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration Net Configuration Main Sequence</em>' reference list.
	 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace_PetrinetConfiguration_NetConfiguration_Main_Sequence()
	 * @model
	 * @generated
	 */
	EList<PetrinetConfiguration_NetConfiguration_Main> getPetrinetConfiguration_NetConfiguration_Main_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Configuration Net Configuration Run Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_NetConfiguration_Run}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration Net Configuration Run Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration Net Configuration Run Sequence</em>' reference list.
	 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace_PetrinetConfiguration_NetConfiguration_Run_Sequence()
	 * @model
	 * @generated
	 */
	EList<PetrinetConfiguration_NetConfiguration_Run> getPetrinetConfiguration_NetConfiguration_Run_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Configuration Transition Configuration Fire Sequence</b></em>' reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.Steps.PetrinetConfiguration_TransitionConfiguration_Fire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration Transition Configuration Fire Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration Transition Configuration Fire Sequence</em>' reference list.
	 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace_PetrinetConfiguration_TransitionConfiguration_Fire_Sequence()
	 * @model
	 * @generated
	 */
	EList<PetrinetConfiguration_TransitionConfiguration_Fire> getPetrinetConfiguration_TransitionConfiguration_Fire_Sequence();

	/**
	 * Returns the value of the '<em><b>Petrinet Configuration traced Place Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.States.petrinetConfiguration.TracedPlaceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet Configuration traced Place Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet Configuration traced Place Configurations</em>' containment reference list.
	 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace_PetrinetConfiguration_tracedPlaceConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPlaceConfiguration> getPetrinetConfiguration_tracedPlaceConfigurations();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetConfigurationTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see petrinetConfigurationTrace.PetrinetConfigurationTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
