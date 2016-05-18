/**
 */
package umlTrace;

import org.eclipse.emf.common.util.EList;

import org.gemoc.executionframework.engine.mse.SequentialStep;
import org.gemoc.executionframework.engine.mse.Trace;

import umlTrace.States.State;

import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer;
import umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken;

import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject;
import umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference;

import umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue;

import umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues;

import umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory;
import umlTrace.States.fumlConfiguration.Loci.TracedExecutor;
import umlTrace.States.fumlConfiguration.Loci.TracedLocus;
import umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor;

import umlTrace.States.fumlConfiguration.TracedElementConfiguration;

import umlTrace.States.uml.TracedClass;
import umlTrace.States.uml.TracedParameter;
import umlTrace.States.uml.TracedPrimitiveType;

import umlTrace.Steps.SpecificStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.SpecificTrace#getBasicBehaviors_tracedParameterValues <em>Basic Behaviors traced Parameter Values</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getFumlConfiguration_tracedElementConfigurations <em>Fuml Configuration traced Element Configurations</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getInput_tracedInputParameterValuess <em>Input traced Input Parameter Valuess</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityEdgeInstances <em>Intermediate Activities traced Activity Edge Instances</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityExecutions <em>Intermediate Activities traced Activity Executions</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivationGroups <em>Intermediate Activities traced Activity Node Activation Groups</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedActivityNodeActivations <em>Intermediate Activities traced Activity Node Activations</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedForkedTokens <em>Intermediate Activities traced Forked Tokens</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedObjectTokens <em>Intermediate Activities traced Object Tokens</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedOffers <em>Intermediate Activities traced Offers</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getIntermediateActivities_tracedTokens <em>Intermediate Activities traced Tokens</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getKernel_tracedBooleanValues <em>Kernel traced Boolean Values</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getKernel_tracedIntegerValues <em>Kernel traced Integer Values</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getKernel_tracedObjects <em>Kernel traced Objects</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getKernel_tracedReferences <em>Kernel traced References</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getLoci_tracedExecutionEnvironments <em>Loci traced Execution Environments</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getLoci_tracedExecutionFactorys <em>Loci traced Execution Factorys</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getLoci_tracedExecutors <em>Loci traced Executors</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getLoci_tracedLocuss <em>Loci traced Locuss</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getLoci_tracedSemanticVisitors <em>Loci traced Semantic Visitors</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getUml_tracedClasss <em>Uml traced Classs</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getUml_tracedParameters <em>Uml traced Parameters</em>}</li>
 *   <li>{@link umlTrace.SpecificTrace#getUml_tracedPrimitiveTypes <em>Uml traced Primitive Types</em>}</li>
 * </ul>
 *
 * @see umlTrace.UmlTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Basic Behaviors traced Parameter Values</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Behaviors traced Parameter Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Behaviors traced Parameter Values</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_BasicBehaviors_tracedParameterValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedParameterValue> getBasicBehaviors_tracedParameterValues();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration traced Element Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.TracedElementConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration traced Element Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration traced Element Configurations</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_FumlConfiguration_tracedElementConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedElementConfiguration> getFumlConfiguration_tracedElementConfigurations();

	/**
	 * Returns the value of the '<em><b>Input traced Input Parameter Valuess</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input traced Input Parameter Valuess</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input traced Input Parameter Valuess</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Input_tracedInputParameterValuess()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInputParameterValues> getInput_tracedInputParameterValuess();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Activity Edge Instances</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Activity Edge Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Activity Edge Instances</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedActivityEdgeInstances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityEdgeInstance> getIntermediateActivities_tracedActivityEdgeInstances();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Activity Executions</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Activity Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Activity Executions</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedActivityExecutions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityExecution> getIntermediateActivities_tracedActivityExecutions();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Activity Node Activation Groups</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Activity Node Activation Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Activity Node Activation Groups</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedActivityNodeActivationGroups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityNodeActivationGroup> getIntermediateActivities_tracedActivityNodeActivationGroups();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Activity Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Activity Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Activity Node Activations</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedActivityNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityNodeActivation> getIntermediateActivities_tracedActivityNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Forked Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Forked Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Forked Tokens</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedForkedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkedToken> getIntermediateActivities_tracedForkedTokens();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Object Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Object Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Object Tokens</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedObjectTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedObjectToken> getIntermediateActivities_tracedObjectTokens();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Offers</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Offers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Offers</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedOffers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedOffer> getIntermediateActivities_tracedOffers();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities traced Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities traced Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities traced Tokens</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_IntermediateActivities_tracedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedToken> getIntermediateActivities_tracedTokens();

	/**
	 * Returns the value of the '<em><b>Kernel traced Boolean Values</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel traced Boolean Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel traced Boolean Values</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Kernel_tracedBooleanValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedBooleanValue> getKernel_tracedBooleanValues();

	/**
	 * Returns the value of the '<em><b>Kernel traced Integer Values</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel traced Integer Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel traced Integer Values</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Kernel_tracedIntegerValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedIntegerValue> getKernel_tracedIntegerValues();

	/**
	 * Returns the value of the '<em><b>Kernel traced Objects</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel traced Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel traced Objects</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Kernel_tracedObjects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedObject> getKernel_tracedObjects();

	/**
	 * Returns the value of the '<em><b>Kernel traced References</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel traced References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel traced References</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Kernel_tracedReferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedReference> getKernel_tracedReferences();

	/**
	 * Returns the value of the '<em><b>Loci traced Execution Environments</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci traced Execution Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci traced Execution Environments</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Loci_tracedExecutionEnvironments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedExecutionEnvironment> getLoci_tracedExecutionEnvironments();

	/**
	 * Returns the value of the '<em><b>Loci traced Execution Factorys</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci traced Execution Factorys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci traced Execution Factorys</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Loci_tracedExecutionFactorys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedExecutionFactory> getLoci_tracedExecutionFactorys();

	/**
	 * Returns the value of the '<em><b>Loci traced Executors</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedExecutor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci traced Executors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci traced Executors</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Loci_tracedExecutors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedExecutor> getLoci_tracedExecutors();

	/**
	 * Returns the value of the '<em><b>Loci traced Locuss</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedLocus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci traced Locuss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci traced Locuss</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Loci_tracedLocuss()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedLocus> getLoci_tracedLocuss();

	/**
	 * Returns the value of the '<em><b>Loci traced Semantic Visitors</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci traced Semantic Visitors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci traced Semantic Visitors</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Loci_tracedSemanticVisitors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSemanticVisitor> getLoci_tracedSemanticVisitors();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

	/**
	 * Returns the value of the '<em><b>Uml traced Classs</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.uml.TracedClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml traced Classs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml traced Classs</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Uml_tracedClasss()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedClass> getUml_tracedClasss();

	/**
	 * Returns the value of the '<em><b>Uml traced Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.uml.TracedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml traced Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml traced Parameters</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Uml_tracedParameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedParameter> getUml_tracedParameters();

	/**
	 * Returns the value of the '<em><b>Uml traced Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.uml.TracedPrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml traced Primitive Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml traced Primitive Types</em>' containment reference list.
	 * @see umlTrace.UmlTracePackage#getSpecificTrace_Uml_tracedPrimitiveTypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedPrimitiveType> getUml_tracedPrimitiveTypes();

} // SpecificTrace
