/**
 */
package umlTrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.executionframework.engine.mse.SequentialStep;

import org.gemoc.executionframework.engine.mse.impl.TraceImpl;

import umlTrace.SpecificTrace;

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

import umlTrace.UmlTracePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getBasicBehaviors_tracedParameterValues <em>Basic Behaviors traced Parameter Values</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getFumlConfiguration_tracedElementConfigurations <em>Fuml Configuration traced Element Configurations</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getInput_tracedInputParameterValuess <em>Input traced Input Parameter Valuess</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedActivityEdgeInstances <em>Intermediate Activities traced Activity Edge Instances</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedActivityExecutions <em>Intermediate Activities traced Activity Executions</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedActivityNodeActivationGroups <em>Intermediate Activities traced Activity Node Activation Groups</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedActivityNodeActivations <em>Intermediate Activities traced Activity Node Activations</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedForkedTokens <em>Intermediate Activities traced Forked Tokens</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedObjectTokens <em>Intermediate Activities traced Object Tokens</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedOffers <em>Intermediate Activities traced Offers</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getIntermediateActivities_tracedTokens <em>Intermediate Activities traced Tokens</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getKernel_tracedBooleanValues <em>Kernel traced Boolean Values</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getKernel_tracedIntegerValues <em>Kernel traced Integer Values</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getKernel_tracedObjects <em>Kernel traced Objects</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getKernel_tracedReferences <em>Kernel traced References</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getLoci_tracedExecutionEnvironments <em>Loci traced Execution Environments</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getLoci_tracedExecutionFactorys <em>Loci traced Execution Factorys</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getLoci_tracedExecutors <em>Loci traced Executors</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getLoci_tracedLocuss <em>Loci traced Locuss</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getLoci_tracedSemanticVisitors <em>Loci traced Semantic Visitors</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getUml_tracedClasss <em>Uml traced Classs</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getUml_tracedParameters <em>Uml traced Parameters</em>}</li>
 *   <li>{@link umlTrace.impl.SpecificTraceImpl#getUml_tracedPrimitiveTypes <em>Uml traced Primitive Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getBasicBehaviors_tracedParameterValues() <em>Basic Behaviors traced Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicBehaviors_tracedParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedParameterValue> basicBehaviors_tracedParameterValues;

	/**
	 * The cached value of the '{@link #getFumlConfiguration_tracedElementConfigurations() <em>Fuml Configuration traced Element Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFumlConfiguration_tracedElementConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedElementConfiguration> fumlConfiguration_tracedElementConfigurations;

	/**
	 * The cached value of the '{@link #getInput_tracedInputParameterValuess() <em>Input traced Input Parameter Valuess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_tracedInputParameterValuess()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedInputParameterValues> input_tracedInputParameterValuess;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedActivityEdgeInstances() <em>Intermediate Activities traced Activity Edge Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedActivityEdgeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityEdgeInstance> intermediateActivities_tracedActivityEdgeInstances;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedActivityExecutions() <em>Intermediate Activities traced Activity Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedActivityExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityExecution> intermediateActivities_tracedActivityExecutions;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedActivityNodeActivationGroups() <em>Intermediate Activities traced Activity Node Activation Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedActivityNodeActivationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNodeActivationGroup> intermediateActivities_tracedActivityNodeActivationGroups;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedActivityNodeActivations() <em>Intermediate Activities traced Activity Node Activations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedActivityNodeActivations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedActivityNodeActivation> intermediateActivities_tracedActivityNodeActivations;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedForkedTokens() <em>Intermediate Activities traced Forked Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedForkedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedForkedToken> intermediateActivities_tracedForkedTokens;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedObjectTokens() <em>Intermediate Activities traced Object Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedObjectTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedObjectToken> intermediateActivities_tracedObjectTokens;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedOffers() <em>Intermediate Activities traced Offers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedOffer> intermediateActivities_tracedOffers;

	/**
	 * The cached value of the '{@link #getIntermediateActivities_tracedTokens() <em>Intermediate Activities traced Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateActivities_tracedTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedToken> intermediateActivities_tracedTokens;

	/**
	 * The cached value of the '{@link #getKernel_tracedBooleanValues() <em>Kernel traced Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_tracedBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedBooleanValue> kernel_tracedBooleanValues;

	/**
	 * The cached value of the '{@link #getKernel_tracedIntegerValues() <em>Kernel traced Integer Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_tracedIntegerValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedIntegerValue> kernel_tracedIntegerValues;

	/**
	 * The cached value of the '{@link #getKernel_tracedObjects() <em>Kernel traced Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_tracedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedObject> kernel_tracedObjects;

	/**
	 * The cached value of the '{@link #getKernel_tracedReferences() <em>Kernel traced References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_tracedReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedReference> kernel_tracedReferences;

	/**
	 * The cached value of the '{@link #getLoci_tracedExecutionEnvironments() <em>Loci traced Execution Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoci_tracedExecutionEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedExecutionEnvironment> loci_tracedExecutionEnvironments;

	/**
	 * The cached value of the '{@link #getLoci_tracedExecutionFactorys() <em>Loci traced Execution Factorys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoci_tracedExecutionFactorys()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedExecutionFactory> loci_tracedExecutionFactorys;

	/**
	 * The cached value of the '{@link #getLoci_tracedExecutors() <em>Loci traced Executors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoci_tracedExecutors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedExecutor> loci_tracedExecutors;

	/**
	 * The cached value of the '{@link #getLoci_tracedLocuss() <em>Loci traced Locuss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoci_tracedLocuss()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedLocus> loci_tracedLocuss;

	/**
	 * The cached value of the '{@link #getLoci_tracedSemanticVisitors() <em>Loci traced Semantic Visitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoci_tracedSemanticVisitors()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedSemanticVisitor> loci_tracedSemanticVisitors;

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
	 * The cached value of the '{@link #getUml_tracedClasss() <em>Uml traced Classs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUml_tracedClasss()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedClass> uml_tracedClasss;

	/**
	 * The cached value of the '{@link #getUml_tracedParameters() <em>Uml traced Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUml_tracedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedParameter> uml_tracedParameters;

	/**
	 * The cached value of the '{@link #getUml_tracedPrimitiveTypes() <em>Uml traced Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUml_tracedPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedPrimitiveType> uml_tracedPrimitiveTypes;

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
		return UmlTracePackage.Literals.SPECIFIC_TRACE;
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
	public EList<TracedParameterValue> getBasicBehaviors_tracedParameterValues() {
		if (basicBehaviors_tracedParameterValues == null) {
			basicBehaviors_tracedParameterValues = new EObjectContainmentEList<TracedParameterValue>(TracedParameterValue.class, this, UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES);
		}
		return basicBehaviors_tracedParameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedElementConfiguration> getFumlConfiguration_tracedElementConfigurations() {
		if (fumlConfiguration_tracedElementConfigurations == null) {
			fumlConfiguration_tracedElementConfigurations = new EObjectContainmentEList<TracedElementConfiguration>(TracedElementConfiguration.class, this, UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS);
		}
		return fumlConfiguration_tracedElementConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedInputParameterValues> getInput_tracedInputParameterValuess() {
		if (input_tracedInputParameterValuess == null) {
			input_tracedInputParameterValuess = new EObjectContainmentEList<TracedInputParameterValues>(TracedInputParameterValues.class, this, UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS);
		}
		return input_tracedInputParameterValuess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityEdgeInstance> getIntermediateActivities_tracedActivityEdgeInstances() {
		if (intermediateActivities_tracedActivityEdgeInstances == null) {
			intermediateActivities_tracedActivityEdgeInstances = new EObjectContainmentEList<TracedActivityEdgeInstance>(TracedActivityEdgeInstance.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES);
		}
		return intermediateActivities_tracedActivityEdgeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityExecution> getIntermediateActivities_tracedActivityExecutions() {
		if (intermediateActivities_tracedActivityExecutions == null) {
			intermediateActivities_tracedActivityExecutions = new EObjectContainmentEList<TracedActivityExecution>(TracedActivityExecution.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS);
		}
		return intermediateActivities_tracedActivityExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNodeActivationGroup> getIntermediateActivities_tracedActivityNodeActivationGroups() {
		if (intermediateActivities_tracedActivityNodeActivationGroups == null) {
			intermediateActivities_tracedActivityNodeActivationGroups = new EObjectContainmentEList<TracedActivityNodeActivationGroup>(TracedActivityNodeActivationGroup.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS);
		}
		return intermediateActivities_tracedActivityNodeActivationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedActivityNodeActivation> getIntermediateActivities_tracedActivityNodeActivations() {
		if (intermediateActivities_tracedActivityNodeActivations == null) {
			intermediateActivities_tracedActivityNodeActivations = new EObjectContainmentEList<TracedActivityNodeActivation>(TracedActivityNodeActivation.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS);
		}
		return intermediateActivities_tracedActivityNodeActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedForkedToken> getIntermediateActivities_tracedForkedTokens() {
		if (intermediateActivities_tracedForkedTokens == null) {
			intermediateActivities_tracedForkedTokens = new EObjectContainmentEList<TracedForkedToken>(TracedForkedToken.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS);
		}
		return intermediateActivities_tracedForkedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedObjectToken> getIntermediateActivities_tracedObjectTokens() {
		if (intermediateActivities_tracedObjectTokens == null) {
			intermediateActivities_tracedObjectTokens = new EObjectContainmentEList<TracedObjectToken>(TracedObjectToken.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS);
		}
		return intermediateActivities_tracedObjectTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedOffer> getIntermediateActivities_tracedOffers() {
		if (intermediateActivities_tracedOffers == null) {
			intermediateActivities_tracedOffers = new EObjectContainmentEList<TracedOffer>(TracedOffer.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS);
		}
		return intermediateActivities_tracedOffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedToken> getIntermediateActivities_tracedTokens() {
		if (intermediateActivities_tracedTokens == null) {
			intermediateActivities_tracedTokens = new EObjectContainmentEList<TracedToken>(TracedToken.class, this, UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS);
		}
		return intermediateActivities_tracedTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedBooleanValue> getKernel_tracedBooleanValues() {
		if (kernel_tracedBooleanValues == null) {
			kernel_tracedBooleanValues = new EObjectContainmentEList<TracedBooleanValue>(TracedBooleanValue.class, this, UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES);
		}
		return kernel_tracedBooleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedIntegerValue> getKernel_tracedIntegerValues() {
		if (kernel_tracedIntegerValues == null) {
			kernel_tracedIntegerValues = new EObjectContainmentEList<TracedIntegerValue>(TracedIntegerValue.class, this, UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES);
		}
		return kernel_tracedIntegerValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedObject> getKernel_tracedObjects() {
		if (kernel_tracedObjects == null) {
			kernel_tracedObjects = new EObjectContainmentEList<TracedObject>(TracedObject.class, this, UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS);
		}
		return kernel_tracedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedReference> getKernel_tracedReferences() {
		if (kernel_tracedReferences == null) {
			kernel_tracedReferences = new EObjectContainmentEList<TracedReference>(TracedReference.class, this, UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES);
		}
		return kernel_tracedReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedExecutionEnvironment> getLoci_tracedExecutionEnvironments() {
		if (loci_tracedExecutionEnvironments == null) {
			loci_tracedExecutionEnvironments = new EObjectContainmentEList<TracedExecutionEnvironment>(TracedExecutionEnvironment.class, this, UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS);
		}
		return loci_tracedExecutionEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedExecutionFactory> getLoci_tracedExecutionFactorys() {
		if (loci_tracedExecutionFactorys == null) {
			loci_tracedExecutionFactorys = new EObjectContainmentEList<TracedExecutionFactory>(TracedExecutionFactory.class, this, UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS);
		}
		return loci_tracedExecutionFactorys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedExecutor> getLoci_tracedExecutors() {
		if (loci_tracedExecutors == null) {
			loci_tracedExecutors = new EObjectContainmentEList<TracedExecutor>(TracedExecutor.class, this, UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS);
		}
		return loci_tracedExecutors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedLocus> getLoci_tracedLocuss() {
		if (loci_tracedLocuss == null) {
			loci_tracedLocuss = new EObjectContainmentEList<TracedLocus>(TracedLocus.class, this, UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS);
		}
		return loci_tracedLocuss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedSemanticVisitor> getLoci_tracedSemanticVisitors() {
		if (loci_tracedSemanticVisitors == null) {
			loci_tracedSemanticVisitors = new EObjectContainmentEList<TracedSemanticVisitor>(TracedSemanticVisitor.class, this, UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS);
		}
		return loci_tracedSemanticVisitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedClass> getUml_tracedClasss() {
		if (uml_tracedClasss == null) {
			uml_tracedClasss = new EObjectContainmentEList<TracedClass>(TracedClass.class, this, UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS);
		}
		return uml_tracedClasss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedParameter> getUml_tracedParameters() {
		if (uml_tracedParameters == null) {
			uml_tracedParameters = new EObjectContainmentEList<TracedParameter>(TracedParameter.class, this, UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS);
		}
		return uml_tracedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedPrimitiveType> getUml_tracedPrimitiveTypes() {
		if (uml_tracedPrimitiveTypes == null) {
			uml_tracedPrimitiveTypes = new EObjectContainmentEList<TracedPrimitiveType>(TracedPrimitiveType.class, this, UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES);
		}
		return uml_tracedPrimitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES:
				return ((InternalEList<?>)getBasicBehaviors_tracedParameterValues()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS:
				return ((InternalEList<?>)getFumlConfiguration_tracedElementConfigurations()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS:
				return ((InternalEList<?>)getInput_tracedInputParameterValuess()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES:
				return ((InternalEList<?>)getIntermediateActivities_tracedActivityEdgeInstances()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS:
				return ((InternalEList<?>)getIntermediateActivities_tracedActivityExecutions()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS:
				return ((InternalEList<?>)getIntermediateActivities_tracedActivityNodeActivationGroups()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return ((InternalEList<?>)getIntermediateActivities_tracedActivityNodeActivations()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS:
				return ((InternalEList<?>)getIntermediateActivities_tracedForkedTokens()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS:
				return ((InternalEList<?>)getIntermediateActivities_tracedObjectTokens()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS:
				return ((InternalEList<?>)getIntermediateActivities_tracedOffers()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS:
				return ((InternalEList<?>)getIntermediateActivities_tracedTokens()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES:
				return ((InternalEList<?>)getKernel_tracedBooleanValues()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES:
				return ((InternalEList<?>)getKernel_tracedIntegerValues()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS:
				return ((InternalEList<?>)getKernel_tracedObjects()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES:
				return ((InternalEList<?>)getKernel_tracedReferences()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS:
				return ((InternalEList<?>)getLoci_tracedExecutionEnvironments()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS:
				return ((InternalEList<?>)getLoci_tracedExecutionFactorys()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS:
				return ((InternalEList<?>)getLoci_tracedExecutors()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS:
				return ((InternalEList<?>)getLoci_tracedLocuss()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS:
				return ((InternalEList<?>)getLoci_tracedSemanticVisitors()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS:
				return ((InternalEList<?>)getUml_tracedClasss()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS:
				return ((InternalEList<?>)getUml_tracedParameters()).basicRemove(otherEnd, msgs);
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES:
				return ((InternalEList<?>)getUml_tracedPrimitiveTypes()).basicRemove(otherEnd, msgs);
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
			case UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES:
				return getBasicBehaviors_tracedParameterValues();
			case UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS:
				return getFumlConfiguration_tracedElementConfigurations();
			case UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS:
				return getInput_tracedInputParameterValuess();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES:
				return getIntermediateActivities_tracedActivityEdgeInstances();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS:
				return getIntermediateActivities_tracedActivityExecutions();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS:
				return getIntermediateActivities_tracedActivityNodeActivationGroups();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return getIntermediateActivities_tracedActivityNodeActivations();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS:
				return getIntermediateActivities_tracedForkedTokens();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS:
				return getIntermediateActivities_tracedObjectTokens();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS:
				return getIntermediateActivities_tracedOffers();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS:
				return getIntermediateActivities_tracedTokens();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES:
				return getKernel_tracedBooleanValues();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES:
				return getKernel_tracedIntegerValues();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS:
				return getKernel_tracedObjects();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES:
				return getKernel_tracedReferences();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS:
				return getLoci_tracedExecutionEnvironments();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS:
				return getLoci_tracedExecutionFactorys();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS:
				return getLoci_tracedExecutors();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS:
				return getLoci_tracedLocuss();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS:
				return getLoci_tracedSemanticVisitors();
			case UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS:
				return getUml_tracedClasss();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS:
				return getUml_tracedParameters();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES:
				return getUml_tracedPrimitiveTypes();
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
			case UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES:
				getBasicBehaviors_tracedParameterValues().clear();
				getBasicBehaviors_tracedParameterValues().addAll((Collection<? extends TracedParameterValue>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS:
				getFumlConfiguration_tracedElementConfigurations().clear();
				getFumlConfiguration_tracedElementConfigurations().addAll((Collection<? extends TracedElementConfiguration>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS:
				getInput_tracedInputParameterValuess().clear();
				getInput_tracedInputParameterValuess().addAll((Collection<? extends TracedInputParameterValues>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES:
				getIntermediateActivities_tracedActivityEdgeInstances().clear();
				getIntermediateActivities_tracedActivityEdgeInstances().addAll((Collection<? extends TracedActivityEdgeInstance>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS:
				getIntermediateActivities_tracedActivityExecutions().clear();
				getIntermediateActivities_tracedActivityExecutions().addAll((Collection<? extends TracedActivityExecution>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS:
				getIntermediateActivities_tracedActivityNodeActivationGroups().clear();
				getIntermediateActivities_tracedActivityNodeActivationGroups().addAll((Collection<? extends TracedActivityNodeActivationGroup>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				getIntermediateActivities_tracedActivityNodeActivations().clear();
				getIntermediateActivities_tracedActivityNodeActivations().addAll((Collection<? extends TracedActivityNodeActivation>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS:
				getIntermediateActivities_tracedForkedTokens().clear();
				getIntermediateActivities_tracedForkedTokens().addAll((Collection<? extends TracedForkedToken>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS:
				getIntermediateActivities_tracedObjectTokens().clear();
				getIntermediateActivities_tracedObjectTokens().addAll((Collection<? extends TracedObjectToken>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS:
				getIntermediateActivities_tracedOffers().clear();
				getIntermediateActivities_tracedOffers().addAll((Collection<? extends TracedOffer>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS:
				getIntermediateActivities_tracedTokens().clear();
				getIntermediateActivities_tracedTokens().addAll((Collection<? extends TracedToken>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES:
				getKernel_tracedBooleanValues().clear();
				getKernel_tracedBooleanValues().addAll((Collection<? extends TracedBooleanValue>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES:
				getKernel_tracedIntegerValues().clear();
				getKernel_tracedIntegerValues().addAll((Collection<? extends TracedIntegerValue>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS:
				getKernel_tracedObjects().clear();
				getKernel_tracedObjects().addAll((Collection<? extends TracedObject>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES:
				getKernel_tracedReferences().clear();
				getKernel_tracedReferences().addAll((Collection<? extends TracedReference>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS:
				getLoci_tracedExecutionEnvironments().clear();
				getLoci_tracedExecutionEnvironments().addAll((Collection<? extends TracedExecutionEnvironment>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS:
				getLoci_tracedExecutionFactorys().clear();
				getLoci_tracedExecutionFactorys().addAll((Collection<? extends TracedExecutionFactory>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS:
				getLoci_tracedExecutors().clear();
				getLoci_tracedExecutors().addAll((Collection<? extends TracedExecutor>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS:
				getLoci_tracedLocuss().clear();
				getLoci_tracedLocuss().addAll((Collection<? extends TracedLocus>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS:
				getLoci_tracedSemanticVisitors().clear();
				getLoci_tracedSemanticVisitors().addAll((Collection<? extends TracedSemanticVisitor>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS:
				getUml_tracedClasss().clear();
				getUml_tracedClasss().addAll((Collection<? extends TracedClass>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS:
				getUml_tracedParameters().clear();
				getUml_tracedParameters().addAll((Collection<? extends TracedParameter>)newValue);
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES:
				getUml_tracedPrimitiveTypes().clear();
				getUml_tracedPrimitiveTypes().addAll((Collection<? extends TracedPrimitiveType>)newValue);
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
			case UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES:
				getBasicBehaviors_tracedParameterValues().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS:
				getFumlConfiguration_tracedElementConfigurations().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS:
				getInput_tracedInputParameterValuess().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES:
				getIntermediateActivities_tracedActivityEdgeInstances().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS:
				getIntermediateActivities_tracedActivityExecutions().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS:
				getIntermediateActivities_tracedActivityNodeActivationGroups().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				getIntermediateActivities_tracedActivityNodeActivations().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS:
				getIntermediateActivities_tracedForkedTokens().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS:
				getIntermediateActivities_tracedObjectTokens().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS:
				getIntermediateActivities_tracedOffers().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS:
				getIntermediateActivities_tracedTokens().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES:
				getKernel_tracedBooleanValues().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES:
				getKernel_tracedIntegerValues().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS:
				getKernel_tracedObjects().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES:
				getKernel_tracedReferences().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS:
				getLoci_tracedExecutionEnvironments().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS:
				getLoci_tracedExecutionFactorys().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS:
				getLoci_tracedExecutors().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS:
				getLoci_tracedLocuss().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS:
				getLoci_tracedSemanticVisitors().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS:
				getUml_tracedClasss().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS:
				getUml_tracedParameters().clear();
				return;
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES:
				getUml_tracedPrimitiveTypes().clear();
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
			case UmlTracePackage.SPECIFIC_TRACE__BASIC_BEHAVIORS_TRACED_PARAMETER_VALUES:
				return basicBehaviors_tracedParameterValues != null && !basicBehaviors_tracedParameterValues.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__FUML_CONFIGURATION_TRACED_ELEMENT_CONFIGURATIONS:
				return fumlConfiguration_tracedElementConfigurations != null && !fumlConfiguration_tracedElementConfigurations.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INPUT_TRACED_INPUT_PARAMETER_VALUESS:
				return input_tracedInputParameterValuess != null && !input_tracedInputParameterValuess.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EDGE_INSTANCES:
				return intermediateActivities_tracedActivityEdgeInstances != null && !intermediateActivities_tracedActivityEdgeInstances.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_EXECUTIONS:
				return intermediateActivities_tracedActivityExecutions != null && !intermediateActivities_tracedActivityExecutions.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATION_GROUPS:
				return intermediateActivities_tracedActivityNodeActivationGroups != null && !intermediateActivities_tracedActivityNodeActivationGroups.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_ACTIVITY_NODE_ACTIVATIONS:
				return intermediateActivities_tracedActivityNodeActivations != null && !intermediateActivities_tracedActivityNodeActivations.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_FORKED_TOKENS:
				return intermediateActivities_tracedForkedTokens != null && !intermediateActivities_tracedForkedTokens.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OBJECT_TOKENS:
				return intermediateActivities_tracedObjectTokens != null && !intermediateActivities_tracedObjectTokens.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_OFFERS:
				return intermediateActivities_tracedOffers != null && !intermediateActivities_tracedOffers.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__INTERMEDIATE_ACTIVITIES_TRACED_TOKENS:
				return intermediateActivities_tracedTokens != null && !intermediateActivities_tracedTokens.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_BOOLEAN_VALUES:
				return kernel_tracedBooleanValues != null && !kernel_tracedBooleanValues.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_INTEGER_VALUES:
				return kernel_tracedIntegerValues != null && !kernel_tracedIntegerValues.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_OBJECTS:
				return kernel_tracedObjects != null && !kernel_tracedObjects.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__KERNEL_TRACED_REFERENCES:
				return kernel_tracedReferences != null && !kernel_tracedReferences.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_ENVIRONMENTS:
				return loci_tracedExecutionEnvironments != null && !loci_tracedExecutionEnvironments.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTION_FACTORYS:
				return loci_tracedExecutionFactorys != null && !loci_tracedExecutionFactorys.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_EXECUTORS:
				return loci_tracedExecutors != null && !loci_tracedExecutors.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_LOCUSS:
				return loci_tracedLocuss != null && !loci_tracedLocuss.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__LOCI_TRACED_SEMANTIC_VISITORS:
				return loci_tracedSemanticVisitors != null && !loci_tracedSemanticVisitors.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_CLASSS:
				return uml_tracedClasss != null && !uml_tracedClasss.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PARAMETERS:
				return uml_tracedParameters != null && !uml_tracedParameters.isEmpty();
			case UmlTracePackage.SPECIFIC_TRACE__UML_TRACED_PRIMITIVE_TYPES:
				return uml_tracedPrimitiveTypes != null && !uml_tracedPrimitiveTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
