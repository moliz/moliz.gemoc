/**
 */
package fumlConfigurationFewStepsTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import fumlConfigurationFewStepsTrace.FumlConfigurationFewStepsTracePackage;
import fumlConfigurationFewStepsTrace.SpecificTrace;

import fumlConfigurationFewStepsTrace.States.State;

import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedActionActivation;
import fumlConfigurationFewStepsTrace.States.fumlConfigurationFewSteps.ActionsFewSteps.BasicActionsFewSteps.TracedPinActivation;

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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getBasicActionsFewSteps_tracedActionActivations <em>Basic Actions Few Steps traced Action Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getBasicActionsFewSteps_tracedPinActivations <em>Basic Actions Few Steps traced Pin Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances <em>Intermediate Activities Few Steps traced Activity Edge Instances</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations <em>Intermediate Activities Few Steps traced Activity Final Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedActivityNodeActivations <em>Intermediate Activities Few Steps traced Activity Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations <em>Intermediate Activities Few Steps traced Activity Parameter Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations <em>Intermediate Activities Few Steps traced Decision Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedForkNodeActivations <em>Intermediate Activities Few Steps traced Fork Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedInitialNodeActivations <em>Intermediate Activities Few Steps traced Initial Node Activations</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getIntermediateActivitiesFewSteps_tracedTokens <em>Intermediate Activities Few Steps traced Tokens</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getLociFewSteps_tracedSemanticVisitors <em>Loci Few Steps traced Semantic Visitors</em>}</li>
 *   <li>{@link fumlConfigurationFewStepsTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence() <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Fire Action Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation> fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence() <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Should Fire Again Action Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation> fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence() <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Action Activation Take Offered Tokens Action Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation> fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence() <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Fire Pin Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation> fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence() <em>Fuml Configuration Few Steps Actions Few Steps Basic Actions Few Steps Pin Activation Take Offered Tokens Pin Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation> fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens Activity Edge Instance Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Edge Instance Take Offered Tokens int Activity Edge Instance Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Final Node Activation Fire Activity Final Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Fire Activity Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Node Activation Take Offered Tokens Activity Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Activity Parameter Node Activation Fire Activity Parameter Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Control Node Activation Fire Control Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Fire Decision Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Decision Node Activation Take Offered Tokens Decision Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Fork Node Activation Fire Fork Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence() <em>Fuml Configuration Few Steps Activities Few Steps Intermediate Activities Few Steps Initial Node Activation Fire Initial Node Activation Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation> fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence;

	/**
	 * The cached value of the '{@link #getBasicActionsFewSteps_tracedActionActivations() <em>Basic Actions Few Steps traced Action Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicActionsFewSteps_tracedActionActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActionActivation> basicActionsFewSteps_tracedActionActivations;

	/**
	 * The cached value of the '{@link #getBasicActionsFewSteps_tracedPinActivations() <em>Basic Actions Few Steps traced Pin Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicActionsFewSteps_tracedPinActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPinActivation> basicActionsFewSteps_tracedPinActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances() <em>Intermediate Activities Few Steps traced Activity Edge Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdgeInstance> intermediateActivitiesFewSteps_tracedActivityEdgeInstances;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations() <em>Intermediate Activities Few Steps traced Activity Final Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityFinalNodeActivation> intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedActivityNodeActivations() <em>Intermediate Activities Few Steps traced Activity Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedActivityNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNodeActivation> intermediateActivitiesFewSteps_tracedActivityNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations() <em>Intermediate Activities Few Steps traced Activity Parameter Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityParameterNodeActivation> intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations() <em>Intermediate Activities Few Steps traced Decision Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedDecisionNodeActivation> intermediateActivitiesFewSteps_tracedDecisionNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedForkNodeActivations() <em>Intermediate Activities Few Steps traced Fork Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedForkNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkNodeActivation> intermediateActivitiesFewSteps_tracedForkNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedInitialNodeActivations() <em>Intermediate Activities Few Steps traced Initial Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedInitialNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInitialNodeActivation> intermediateActivitiesFewSteps_tracedInitialNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivitiesFewSteps_tracedTokens() <em>Intermediate Activities Few Steps traced Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivitiesFewSteps_tracedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> intermediateActivitiesFewSteps_tracedTokens;

	/**
	 * The cached value of the '{@link #getLociFewSteps_tracedSemanticVisitors() <em>Loci Few Steps traced Semantic Visitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLociFewSteps_tracedSemanticVisitors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSemanticVisitor> lociFewSteps_tracedSemanticVisitors;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FumlConfigurationFewStepsTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation>(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation>(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation>(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation>(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation> getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation>(FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation> getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence() {
		if (fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence == null) {
			fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence = new EObjectResolvingEList<FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation>(FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE);
		}
		return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActionActivation> getBasicActionsFewSteps_tracedActionActivations() {
		if (basicActionsFewSteps_tracedActionActivations == null) {
			basicActionsFewSteps_tracedActionActivations = new EObjectContainmentEList<TracedActionActivation>(TracedActionActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS);
		}
		return basicActionsFewSteps_tracedActionActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPinActivation> getBasicActionsFewSteps_tracedPinActivations() {
		if (basicActionsFewSteps_tracedPinActivations == null) {
			basicActionsFewSteps_tracedPinActivations = new EObjectContainmentEList<TracedPinActivation>(TracedPinActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS);
		}
		return basicActionsFewSteps_tracedPinActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityEdgeInstance> getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances() {
		if (intermediateActivitiesFewSteps_tracedActivityEdgeInstances == null) {
			intermediateActivitiesFewSteps_tracedActivityEdgeInstances = new EObjectContainmentEList<TracedActivityEdgeInstance>(TracedActivityEdgeInstance.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES);
		}
		return intermediateActivitiesFewSteps_tracedActivityEdgeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityFinalNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations = new EObjectContainmentEList<TracedActivityFinalNodeActivation>(TracedActivityFinalNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedActivityNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedActivityNodeActivations = new EObjectContainmentEList<TracedActivityNodeActivation>(TracedActivityNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedActivityNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityParameterNodeActivation> getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations = new EObjectContainmentEList<TracedActivityParameterNodeActivation>(TracedActivityParameterNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedDecisionNodeActivation> getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedDecisionNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedDecisionNodeActivations = new EObjectContainmentEList<TracedDecisionNodeActivation>(TracedDecisionNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedDecisionNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkNodeActivation> getIntermediateActivitiesFewSteps_tracedForkNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedForkNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedForkNodeActivations = new EObjectContainmentEList<TracedForkNodeActivation>(TracedForkNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedForkNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInitialNodeActivation> getIntermediateActivitiesFewSteps_tracedInitialNodeActivations() {
		if (intermediateActivitiesFewSteps_tracedInitialNodeActivations == null) {
			intermediateActivitiesFewSteps_tracedInitialNodeActivations = new EObjectContainmentEList<TracedInitialNodeActivation>(TracedInitialNodeActivation.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS);
		}
		return intermediateActivitiesFewSteps_tracedInitialNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getIntermediateActivitiesFewSteps_tracedTokens() {
		if (intermediateActivitiesFewSteps_tracedTokens == null) {
			intermediateActivitiesFewSteps_tracedTokens = new EObjectContainmentEList<TracedToken>(TracedToken.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS);
		}
		return intermediateActivitiesFewSteps_tracedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSemanticVisitor> getLociFewSteps_tracedSemanticVisitors() {
		if (lociFewSteps_tracedSemanticVisitors == null) {
			lociFewSteps_tracedSemanticVisitors = new EObjectContainmentEList<TracedSemanticVisitor>(TracedSemanticVisitor.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS);
		}
		return lociFewSteps_tracedSemanticVisitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS:
				return ((InternalEList<?>)getBasicActionsFewSteps_tracedActionActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS:
				return ((InternalEList<?>)getBasicActionsFewSteps_tracedPinActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedActivityNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedForkNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedInitialNodeActivations()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS:
				return ((InternalEList<?>)getIntermediateActivitiesFewSteps_tracedTokens()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS:
				return ((InternalEList<?>)getLociFewSteps_tracedSemanticVisitors()).basicRemove(otherEnd, msgs);
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE:
				return getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS:
				return getBasicActionsFewSteps_tracedActionActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS:
				return getBasicActionsFewSteps_tracedPinActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES:
				return getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedActivityNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedForkNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS:
				return getIntermediateActivitiesFewSteps_tracedInitialNodeActivations();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS:
				return getIntermediateActivitiesFewSteps_tracedTokens();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS:
				return getLociFewSteps_tracedSemanticVisitors();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence().clear();
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence().addAll((Collection<? extends FumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS:
				getBasicActionsFewSteps_tracedActionActivations().clear();
				getBasicActionsFewSteps_tracedActionActivations().addAll((Collection<? extends TracedActionActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS:
				getBasicActionsFewSteps_tracedPinActivations().clear();
				getBasicActionsFewSteps_tracedPinActivations().addAll((Collection<? extends TracedPinActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES:
				getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances().clear();
				getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances().addAll((Collection<? extends TracedActivityEdgeInstance>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations().addAll((Collection<? extends TracedActivityFinalNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedActivityNodeActivations().addAll((Collection<? extends TracedActivityNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations().addAll((Collection<? extends TracedActivityParameterNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations().addAll((Collection<? extends TracedDecisionNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedForkNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedForkNodeActivations().addAll((Collection<? extends TracedForkNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedInitialNodeActivations().clear();
				getIntermediateActivitiesFewSteps_tracedInitialNodeActivations().addAll((Collection<? extends TracedInitialNodeActivation>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS:
				getIntermediateActivitiesFewSteps_tracedTokens().clear();
				getIntermediateActivitiesFewSteps_tracedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS:
				getLociFewSteps_tracedSemanticVisitors().clear();
				getLociFewSteps_tracedSemanticVisitors().addAll((Collection<? extends TracedSemanticVisitor>)newValue);
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE:
				getFumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS:
				getBasicActionsFewSteps_tracedActionActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS:
				getBasicActionsFewSteps_tracedPinActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES:
				getIntermediateActivitiesFewSteps_tracedActivityEdgeInstances().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityFinalNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedActivityParameterNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedDecisionNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedForkNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS:
				getIntermediateActivitiesFewSteps_tracedInitialNodeActivations().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS:
				getIntermediateActivitiesFewSteps_tracedTokens().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS:
				getLociFewSteps_tracedSemanticVisitors().clear();
				return;
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_FIRE_ACTION_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence != null && !fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_Fire_ActionActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_SHOULD_FIRE_AGAIN_ACTION_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence != null && !fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_ShouldFireAgain_ActionActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_ACTION_ACTIVATION_TAKE_OFFERED_TOKENS_ACTION_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence != null && !fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_ActionActivation_TakeOfferedTokens_ActionActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_FIRE_PIN_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence != null && !fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_Fire_PinActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIONS_FEW_STEPS_BASIC_ACTIONS_FEW_STEPS_PIN_ACTIVATION_TAKE_OFFERED_TOKENS_PIN_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence != null && !fumlConfigurationFewSteps_ActionsFewSteps_BasicActionsFewSteps_PinActivation_TakeOfferedTokens_PinActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_ActivityEdgeInstance_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_EDGE_INSTANCE_TAKE_OFFERED_TOKENS_INT_ACTIVITY_EDGE_INSTANCE_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityEdgeInstance_TakeOfferedTokens_int_ActivityEdgeInstance_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_FINAL_NODE_ACTIVATION_FIRE_ACTIVITY_FINAL_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityFinalNodeActivation_Fire_ActivityFinalNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_FIRE_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_Fire_ActivityNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_ACTIVITY_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityNodeActivation_TakeOfferedTokens_ActivityNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_ACTIVITY_PARAMETER_NODE_ACTIVATION_FIRE_ACTIVITY_PARAMETER_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ActivityParameterNodeActivation_Fire_ActivityParameterNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_CONTROL_NODE_ACTIVATION_FIRE_CONTROL_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ControlNodeActivation_Fire_ControlNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_FIRE_DECISION_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_Fire_DecisionNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_DECISION_NODE_ACTIVATION_TAKE_OFFERED_TOKENS_DECISION_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_DecisionNodeActivation_TakeOfferedTokens_DecisionNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_FORK_NODE_ACTIVATION_FIRE_FORK_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_ForkNodeActivation_Fire_ForkNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_FEW_STEPS_ACTIVITIES_FEW_STEPS_INTERMEDIATE_ACTIVITIES_FEW_STEPS_INITIAL_NODE_ACTIVATION_FIRE_INITIAL_NODE_ACTIVATION_SEQUENCE:
				return fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence != null && !fumlConfigurationFewSteps_ActivitiesFewSteps_IntermediateActivitiesFewSteps_InitialNodeActivation_Fire_InitialNodeActivation_Sequence.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_ACTION_ACTIVATIONS:
				return basicActionsFewSteps_tracedActionActivations != null && !basicActionsFewSteps_tracedActionActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__BASIC_ACTIONS_FEW_STEPS_TRACED_PIN_ACTIVATIONS:
				return basicActionsFewSteps_tracedPinActivations != null && !basicActionsFewSteps_tracedPinActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_EDGE_INSTANCES:
				return intermediateActivitiesFewSteps_tracedActivityEdgeInstances != null && !intermediateActivitiesFewSteps_tracedActivityEdgeInstances.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_FINAL_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations != null && !intermediateActivitiesFewSteps_tracedActivityFinalNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedActivityNodeActivations != null && !intermediateActivitiesFewSteps_tracedActivityNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_ACTIVITY_PARAMETER_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations != null && !intermediateActivitiesFewSteps_tracedActivityParameterNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_DECISION_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedDecisionNodeActivations != null && !intermediateActivitiesFewSteps_tracedDecisionNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_FORK_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedForkNodeActivations != null && !intermediateActivitiesFewSteps_tracedForkNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_INITIAL_NODE_ACTIVATIONS:
				return intermediateActivitiesFewSteps_tracedInitialNodeActivations != null && !intermediateActivitiesFewSteps_tracedInitialNodeActivations.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_FEW_STEPS_TRACED_TOKENS:
				return intermediateActivitiesFewSteps_tracedTokens != null && !intermediateActivitiesFewSteps_tracedTokens.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__LOCI_FEW_STEPS_TRACED_SEMANTIC_VISITORS:
				return lociFewSteps_tracedSemanticVisitors != null && !lociFewSteps_tracedSemanticVisitors.isEmpty();
			case FumlConfigurationFewStepsTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
