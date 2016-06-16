/**
 */
package fumlConfigurationFewStepsTrace;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Trace;

import fumlConfigurationFewStepsTrace.States.State;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityParameterNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedForkNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedInitialNodeActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedToken;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor;

import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation;
import fumlConfigurationFewStepsTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances <em>Intermediate Activities Few Steps traced Activity Edge Instances</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations <em>Intermediate Activities Few Steps traced Activity Final Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedActivityNodeActivations <em>Intermediate Activities Few Steps traced Activity Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations <em>Intermediate Activities Few Steps traced Activity Parameter Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations <em>Intermediate Activities Few Steps traced Decision Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedForkNodeActivations <em>Intermediate Activities Few Steps traced Fork Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedInitialNodeActivations <em>Intermediate Activities Few Steps traced Initial Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getIntermediateActivitiesFewSteps_tracedTokens <em>Intermediate Activities Few Steps traced Tokens</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getLociFewSteps_tracedSemanticVisitors <em>Loci Few Steps traced Semantic Visitors</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<SpecificStep>> {
	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</b></em>' reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.Steps.FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</em>' reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
	 * @model
	 * @generated
	 */
	EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Activity Edge Instances</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityEdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Activity Edge Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Activity Edge Instances</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityEdgeInstances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityEdgeInstance> getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Activity Final Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityFinalNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Activity Final Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Activity Final Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityFinalNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Activity Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Activity Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Activity Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Activity Parameter Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedActivityParameterNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Activity Parameter Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Activity Parameter Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedActivityParameterNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Decision Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedDecisionNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Decision Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Decision Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedDecisionNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedDecisionNodeActivation> getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Fork Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedForkNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Fork Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Fork Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedForkNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedForkNodeActivation> getIntermediateActivitiesFewSteps_tracedForkNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Initial Node Activations</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedInitialNodeActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Initial Node Activations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Initial Node Activations</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedInitialNodeActivations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedInitialNodeActivation> getIntermediateActivitiesFewSteps_tracedInitialNodeActivations();

	/**
	 * Returns the value of the '<em><b>Intermediate Activities Few Steps traced Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActivitiesFewSteps.IntermediateActivitiesFewSteps.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Activities Few Steps traced Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Activities Few Steps traced Tokens</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_IntermediateActivitiesFewSteps_tracedTokens()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedToken> getIntermediateActivitiesFewSteps_tracedTokens();

	/**
	 * Returns the value of the '<em><b>Loci Few Steps traced Semantic Visitors</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.LociFewSteps.TracedSemanticVisitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loci Few Steps traced Semantic Visitors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loci Few Steps traced Semantic Visitors</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_LociFewSteps_tracedSemanticVisitors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TracedSemanticVisitor> getLociFewSteps_tracedSemanticVisitors();

	/**
	 * Returns the value of the '<em><b>States Trace</b></em>' containment reference list.
	 * The list contents are of type {@link fumlConfigurationFewStepsTrace.States.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States Trace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Trace</em>' containment reference list.
	 * @see fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage#getSpecificTrace_StatesTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStatesTrace();

} // SpecificTrace
