/**
 */
package fumlConfiguration.util;

import fumlConfiguration.*;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.AcceptCallAction;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActionExecutionSpecification;
import org.eclipse.uml2.uml.ActionInputPin;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityContent;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.AddVariableValueAction;
import org.eclipse.uml2.uml.AnyReceiveEvent;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.BroadcastSignalAction;
import org.eclipse.uml2.uml.CallAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.Clause;
import org.eclipse.uml2.uml.ClearAssociationAction;
import org.eclipse.uml2.uml.ClearStructuralFeatureAction;
import org.eclipse.uml2.uml.ClearVariableAction;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Continuation;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.ControlNode;
import org.eclipse.uml2.uml.CreateLinkAction;
import org.eclipse.uml2.uml.CreateLinkObjectAction;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DeployedArtifact;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DestroyLinkAction;
import org.eclipse.uml2.uml.DestroyObjectAction;
import org.eclipse.uml2.uml.DestructionOccurrenceSpecification;
import org.eclipse.uml2.uml.Device;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.ExecutionEnvironment;
import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.Expression;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.Gate;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.InformationItem;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionConstraint;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.InteractionUse;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.Interval;
import org.eclipse.uml2.uml.IntervalConstraint;
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndCreationData;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.LinkEndDestructionData;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralNull;
import org.eclipse.uml2.uml.LiteralReal;
import org.eclipse.uml2.uml.LiteralSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageEvent;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.OperationTemplateParameter;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PartDecomposition;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolConformance;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.ProtocolTransition;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipse.uml2.uml.RaiseExceptionAction;
import org.eclipse.uml2.uml.ReadExtentAction;
import org.eclipse.uml2.uml.ReadIsClassifiedObjectAction;
import org.eclipse.uml2.uml.ReadLinkAction;
import org.eclipse.uml2.uml.ReadLinkObjectEndAction;
import org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction;
import org.eclipse.uml2.uml.ReadSelfAction;
import org.eclipse.uml2.uml.ReadStructuralFeatureAction;
import org.eclipse.uml2.uml.ReadVariableAction;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.ReclassifyObjectAction;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.ReduceAction;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction;
import org.eclipse.uml2.uml.RemoveVariableValueAction;
import org.eclipse.uml2.uml.ReplyAction;
import org.eclipse.uml2.uml.SendObjectAction;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.SequenceNode;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StartClassifierBehaviorAction;
import org.eclipse.uml2.uml.StartObjectBehaviorAction;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuralFeatureAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.TestIdentityAction;
import org.eclipse.uml2.uml.TimeConstraint;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.TimeExpression;
import org.eclipse.uml2.uml.TimeInterval;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UnmarshallAction;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.ValuePin;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.ValueSpecificationAction;
import org.eclipse.uml2.uml.Variable;
import org.eclipse.uml2.uml.VariableAction;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.WriteLinkAction;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;
import org.eclipse.uml2.uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fumlConfiguration.FumlConfigurationPackage
 * @generated
 */
public class FumlConfigurationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FumlConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FumlConfigurationSwitch() {
		if (modelPackage == null) {
			modelPackage = FumlConfigurationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FumlConfigurationPackage.MODEL_CONFIGURATION: {
				ModelConfiguration modelConfiguration = (ModelConfiguration)theEObject;
				T result = caseModelConfiguration(modelConfiguration);
				if (result == null) result = caseModel(modelConfiguration);
				if (result == null) result = casePackageConfiguration(modelConfiguration);
				if (result == null) result = casePackage(modelConfiguration);
				if (result == null) result = caseNamespaceConfiguration(modelConfiguration);
				if (result == null) result = casePackageableElementConfiguration(modelConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(modelConfiguration);
				if (result == null) result = caseNamespace(modelConfiguration);
				if (result == null) result = casePackageableElement(modelConfiguration);
				if (result == null) result = caseTemplateableElement(modelConfiguration);
				if (result == null) result = caseNamedElementConfiguration(modelConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(modelConfiguration);
				if (result == null) result = caseNamedElement(modelConfiguration);
				if (result == null) result = caseParameterableElement(modelConfiguration);
				if (result == null) result = caseElementConfiguration(modelConfiguration);
				if (result == null) result = caseElement(modelConfiguration);
				if (result == null) result = caseEModelElement(modelConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ELEMENT_CONFIGURATION: {
				ElementConfiguration elementConfiguration = (ElementConfiguration)theEObject;
				T result = caseElementConfiguration(elementConfiguration);
				if (result == null) result = caseElement(elementConfiguration);
				if (result == null) result = caseEModelElement(elementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_CONTENT_CONFIGURATION: {
				ActivityContentConfiguration activityContentConfiguration = (ActivityContentConfiguration)theEObject;
				T result = caseActivityContentConfiguration(activityContentConfiguration);
				if (result == null) result = caseActivityContent(activityContentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_CONFIGURATION: {
				ActivityConfiguration activityConfiguration = (ActivityConfiguration)theEObject;
				T result = caseActivityConfiguration(activityConfiguration);
				if (result == null) result = caseActivity(activityConfiguration);
				if (result == null) result = caseBehaviorConfiguration(activityConfiguration);
				if (result == null) result = caseBehavior(activityConfiguration);
				if (result == null) result = caseClassConfiguration(activityConfiguration);
				if (result == null) result = caseClass(activityConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(activityConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(activityConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(activityConfiguration);
				if (result == null) result = caseBehavioredClassifier(activityConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(activityConfiguration);
				if (result == null) result = caseStructuredClassifier(activityConfiguration);
				if (result == null) result = caseClassifierConfiguration(activityConfiguration);
				if (result == null) result = caseClassifier(activityConfiguration);
				if (result == null) result = caseNamespaceConfiguration(activityConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(activityConfiguration);
				if (result == null) result = caseTypeConfiguration(activityConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(activityConfiguration);
				if (result == null) result = caseNamespace(activityConfiguration);
				if (result == null) result = caseRedefinableElement(activityConfiguration);
				if (result == null) result = caseType(activityConfiguration);
				if (result == null) result = caseTemplateableElement(activityConfiguration);
				if (result == null) result = casePackageableElementConfiguration(activityConfiguration);
				if (result == null) result = casePackageableElement(activityConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(activityConfiguration);
				if (result == null) result = caseNamedElement(activityConfiguration);
				if (result == null) result = caseParameterableElement(activityConfiguration);
				if (result == null) result = caseElementConfiguration(activityConfiguration);
				if (result == null) result = caseElement(activityConfiguration);
				if (result == null) result = caseEModelElement(activityConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.BEHAVIOR_CONFIGURATION: {
				BehaviorConfiguration behaviorConfiguration = (BehaviorConfiguration)theEObject;
				T result = caseBehaviorConfiguration(behaviorConfiguration);
				if (result == null) result = caseBehavior(behaviorConfiguration);
				if (result == null) result = caseClassConfiguration(behaviorConfiguration);
				if (result == null) result = caseClass(behaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(behaviorConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(behaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(behaviorConfiguration);
				if (result == null) result = caseBehavioredClassifier(behaviorConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(behaviorConfiguration);
				if (result == null) result = caseStructuredClassifier(behaviorConfiguration);
				if (result == null) result = caseClassifierConfiguration(behaviorConfiguration);
				if (result == null) result = caseClassifier(behaviorConfiguration);
				if (result == null) result = caseNamespaceConfiguration(behaviorConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(behaviorConfiguration);
				if (result == null) result = caseTypeConfiguration(behaviorConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(behaviorConfiguration);
				if (result == null) result = caseNamespace(behaviorConfiguration);
				if (result == null) result = caseRedefinableElement(behaviorConfiguration);
				if (result == null) result = caseType(behaviorConfiguration);
				if (result == null) result = caseTemplateableElement(behaviorConfiguration);
				if (result == null) result = casePackageableElementConfiguration(behaviorConfiguration);
				if (result == null) result = casePackageableElement(behaviorConfiguration);
				if (result == null) result = caseNamedElementConfiguration(behaviorConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(behaviorConfiguration);
				if (result == null) result = caseNamedElement(behaviorConfiguration);
				if (result == null) result = caseParameterableElement(behaviorConfiguration);
				if (result == null) result = caseElementConfiguration(behaviorConfiguration);
				if (result == null) result = caseElement(behaviorConfiguration);
				if (result == null) result = caseEModelElement(behaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLASS_CONFIGURATION: {
				ClassConfiguration classConfiguration = (ClassConfiguration)theEObject;
				T result = caseClassConfiguration(classConfiguration);
				if (result == null) result = caseClass(classConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(classConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(classConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(classConfiguration);
				if (result == null) result = caseBehavioredClassifier(classConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(classConfiguration);
				if (result == null) result = caseStructuredClassifier(classConfiguration);
				if (result == null) result = caseClassifierConfiguration(classConfiguration);
				if (result == null) result = caseClassifier(classConfiguration);
				if (result == null) result = caseNamespaceConfiguration(classConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(classConfiguration);
				if (result == null) result = caseTypeConfiguration(classConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(classConfiguration);
				if (result == null) result = caseNamespace(classConfiguration);
				if (result == null) result = caseRedefinableElement(classConfiguration);
				if (result == null) result = caseType(classConfiguration);
				if (result == null) result = caseTemplateableElement(classConfiguration);
				if (result == null) result = casePackageableElementConfiguration(classConfiguration);
				if (result == null) result = casePackageableElement(classConfiguration);
				if (result == null) result = caseNamedElementConfiguration(classConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(classConfiguration);
				if (result == null) result = caseNamedElement(classConfiguration);
				if (result == null) result = caseParameterableElement(classConfiguration);
				if (result == null) result = caseElementConfiguration(classConfiguration);
				if (result == null) result = caseElement(classConfiguration);
				if (result == null) result = caseEModelElement(classConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.BEHAVIORED_CLASSIFIER_CONFIGURATION: {
				BehavioredClassifierConfiguration behavioredClassifierConfiguration = (BehavioredClassifierConfiguration)theEObject;
				T result = caseBehavioredClassifierConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseBehavioredClassifier(behavioredClassifierConfiguration);
				if (result == null) result = caseClassifierConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseClassifier(behavioredClassifierConfiguration);
				if (result == null) result = caseNamespaceConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseTypeConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseNamespace(behavioredClassifierConfiguration);
				if (result == null) result = caseRedefinableElement(behavioredClassifierConfiguration);
				if (result == null) result = caseType(behavioredClassifierConfiguration);
				if (result == null) result = caseTemplateableElement(behavioredClassifierConfiguration);
				if (result == null) result = casePackageableElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = casePackageableElement(behavioredClassifierConfiguration);
				if (result == null) result = caseNamedElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseNamedElement(behavioredClassifierConfiguration);
				if (result == null) result = caseParameterableElement(behavioredClassifierConfiguration);
				if (result == null) result = caseElementConfiguration(behavioredClassifierConfiguration);
				if (result == null) result = caseElement(behavioredClassifierConfiguration);
				if (result == null) result = caseEModelElement(behavioredClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLASSIFIER_CONFIGURATION: {
				ClassifierConfiguration classifierConfiguration = (ClassifierConfiguration)theEObject;
				T result = caseClassifierConfiguration(classifierConfiguration);
				if (result == null) result = caseClassifier(classifierConfiguration);
				if (result == null) result = caseNamespaceConfiguration(classifierConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(classifierConfiguration);
				if (result == null) result = caseTypeConfiguration(classifierConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(classifierConfiguration);
				if (result == null) result = caseNamespace(classifierConfiguration);
				if (result == null) result = caseRedefinableElement(classifierConfiguration);
				if (result == null) result = caseType(classifierConfiguration);
				if (result == null) result = caseTemplateableElement(classifierConfiguration);
				if (result == null) result = casePackageableElementConfiguration(classifierConfiguration);
				if (result == null) result = casePackageableElement(classifierConfiguration);
				if (result == null) result = caseNamedElementConfiguration(classifierConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(classifierConfiguration);
				if (result == null) result = caseNamedElement(classifierConfiguration);
				if (result == null) result = caseParameterableElement(classifierConfiguration);
				if (result == null) result = caseElementConfiguration(classifierConfiguration);
				if (result == null) result = caseElement(classifierConfiguration);
				if (result == null) result = caseEModelElement(classifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.NAMESPACE_CONFIGURATION: {
				NamespaceConfiguration namespaceConfiguration = (NamespaceConfiguration)theEObject;
				T result = caseNamespaceConfiguration(namespaceConfiguration);
				if (result == null) result = caseNamespace(namespaceConfiguration);
				if (result == null) result = caseNamedElementConfiguration(namespaceConfiguration);
				if (result == null) result = caseNamedElement(namespaceConfiguration);
				if (result == null) result = caseElementConfiguration(namespaceConfiguration);
				if (result == null) result = caseElement(namespaceConfiguration);
				if (result == null) result = caseEModelElement(namespaceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.NAMED_ELEMENT_CONFIGURATION: {
				NamedElementConfiguration namedElementConfiguration = (NamedElementConfiguration)theEObject;
				T result = caseNamedElementConfiguration(namedElementConfiguration);
				if (result == null) result = caseNamedElement(namedElementConfiguration);
				if (result == null) result = caseElementConfiguration(namedElementConfiguration);
				if (result == null) result = caseElement(namedElementConfiguration);
				if (result == null) result = caseEModelElement(namedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COMMENT_CONFIGURATION: {
				CommentConfiguration commentConfiguration = (CommentConfiguration)theEObject;
				T result = caseCommentConfiguration(commentConfiguration);
				if (result == null) result = caseComment(commentConfiguration);
				if (result == null) result = caseElementConfiguration(commentConfiguration);
				if (result == null) result = caseElement(commentConfiguration);
				if (result == null) result = caseEModelElement(commentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STEREOTYPE_CONFIGURATION: {
				StereotypeConfiguration stereotypeConfiguration = (StereotypeConfiguration)theEObject;
				T result = caseStereotypeConfiguration(stereotypeConfiguration);
				if (result == null) result = caseStereotype(stereotypeConfiguration);
				if (result == null) result = caseClassConfiguration(stereotypeConfiguration);
				if (result == null) result = caseClass(stereotypeConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(stereotypeConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(stereotypeConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(stereotypeConfiguration);
				if (result == null) result = caseBehavioredClassifier(stereotypeConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(stereotypeConfiguration);
				if (result == null) result = caseStructuredClassifier(stereotypeConfiguration);
				if (result == null) result = caseClassifierConfiguration(stereotypeConfiguration);
				if (result == null) result = caseClassifier(stereotypeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(stereotypeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(stereotypeConfiguration);
				if (result == null) result = caseTypeConfiguration(stereotypeConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(stereotypeConfiguration);
				if (result == null) result = caseNamespace(stereotypeConfiguration);
				if (result == null) result = caseRedefinableElement(stereotypeConfiguration);
				if (result == null) result = caseType(stereotypeConfiguration);
				if (result == null) result = caseTemplateableElement(stereotypeConfiguration);
				if (result == null) result = casePackageableElementConfiguration(stereotypeConfiguration);
				if (result == null) result = casePackageableElement(stereotypeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(stereotypeConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(stereotypeConfiguration);
				if (result == null) result = caseNamedElement(stereotypeConfiguration);
				if (result == null) result = caseParameterableElement(stereotypeConfiguration);
				if (result == null) result = caseElementConfiguration(stereotypeConfiguration);
				if (result == null) result = caseElement(stereotypeConfiguration);
				if (result == null) result = caseEModelElement(stereotypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.IMAGE_CONFIGURATION: {
				ImageConfiguration imageConfiguration = (ImageConfiguration)theEObject;
				T result = caseImageConfiguration(imageConfiguration);
				if (result == null) result = caseImage(imageConfiguration);
				if (result == null) result = caseElementConfiguration(imageConfiguration);
				if (result == null) result = caseElement(imageConfiguration);
				if (result == null) result = caseEModelElement(imageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROFILE_CONFIGURATION: {
				ProfileConfiguration profileConfiguration = (ProfileConfiguration)theEObject;
				T result = caseProfileConfiguration(profileConfiguration);
				if (result == null) result = caseProfile(profileConfiguration);
				if (result == null) result = casePackageConfiguration(profileConfiguration);
				if (result == null) result = casePackage(profileConfiguration);
				if (result == null) result = caseNamespaceConfiguration(profileConfiguration);
				if (result == null) result = casePackageableElementConfiguration(profileConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(profileConfiguration);
				if (result == null) result = caseNamespace(profileConfiguration);
				if (result == null) result = casePackageableElement(profileConfiguration);
				if (result == null) result = caseTemplateableElement(profileConfiguration);
				if (result == null) result = caseNamedElementConfiguration(profileConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(profileConfiguration);
				if (result == null) result = caseNamedElement(profileConfiguration);
				if (result == null) result = caseParameterableElement(profileConfiguration);
				if (result == null) result = caseElementConfiguration(profileConfiguration);
				if (result == null) result = caseElement(profileConfiguration);
				if (result == null) result = caseEModelElement(profileConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PACKAGE_CONFIGURATION: {
				PackageConfiguration packageConfiguration = (PackageConfiguration)theEObject;
				T result = casePackageConfiguration(packageConfiguration);
				if (result == null) result = casePackage(packageConfiguration);
				if (result == null) result = caseNamespaceConfiguration(packageConfiguration);
				if (result == null) result = casePackageableElementConfiguration(packageConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(packageConfiguration);
				if (result == null) result = caseNamespace(packageConfiguration);
				if (result == null) result = casePackageableElement(packageConfiguration);
				if (result == null) result = caseTemplateableElement(packageConfiguration);
				if (result == null) result = caseNamedElementConfiguration(packageConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(packageConfiguration);
				if (result == null) result = caseNamedElement(packageConfiguration);
				if (result == null) result = caseParameterableElement(packageConfiguration);
				if (result == null) result = caseElementConfiguration(packageConfiguration);
				if (result == null) result = caseElement(packageConfiguration);
				if (result == null) result = caseEModelElement(packageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PACKAGEABLE_ELEMENT_CONFIGURATION: {
				PackageableElementConfiguration packageableElementConfiguration = (PackageableElementConfiguration)theEObject;
				T result = casePackageableElementConfiguration(packageableElementConfiguration);
				if (result == null) result = casePackageableElement(packageableElementConfiguration);
				if (result == null) result = caseNamedElementConfiguration(packageableElementConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(packageableElementConfiguration);
				if (result == null) result = caseNamedElement(packageableElementConfiguration);
				if (result == null) result = caseParameterableElement(packageableElementConfiguration);
				if (result == null) result = caseElementConfiguration(packageableElementConfiguration);
				if (result == null) result = caseElement(packageableElementConfiguration);
				if (result == null) result = caseEModelElement(packageableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PARAMETERABLE_ELEMENT_CONFIGURATION: {
				ParameterableElementConfiguration parameterableElementConfiguration = (ParameterableElementConfiguration)theEObject;
				T result = caseParameterableElementConfiguration(parameterableElementConfiguration);
				if (result == null) result = caseParameterableElement(parameterableElementConfiguration);
				if (result == null) result = caseElementConfiguration(parameterableElementConfiguration);
				if (result == null) result = caseElement(parameterableElementConfiguration);
				if (result == null) result = caseEModelElement(parameterableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEMPLATE_PARAMETER_CONFIGURATION: {
				TemplateParameterConfiguration templateParameterConfiguration = (TemplateParameterConfiguration)theEObject;
				T result = caseTemplateParameterConfiguration(templateParameterConfiguration);
				if (result == null) result = caseTemplateParameter(templateParameterConfiguration);
				if (result == null) result = caseElementConfiguration(templateParameterConfiguration);
				if (result == null) result = caseElement(templateParameterConfiguration);
				if (result == null) result = caseEModelElement(templateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEMPLATE_SIGNATURE_CONFIGURATION: {
				TemplateSignatureConfiguration templateSignatureConfiguration = (TemplateSignatureConfiguration)theEObject;
				T result = caseTemplateSignatureConfiguration(templateSignatureConfiguration);
				if (result == null) result = caseTemplateSignature(templateSignatureConfiguration);
				if (result == null) result = caseElementConfiguration(templateSignatureConfiguration);
				if (result == null) result = caseElement(templateSignatureConfiguration);
				if (result == null) result = caseEModelElement(templateSignatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEMPLATEABLE_ELEMENT_CONFIGURATION: {
				TemplateableElementConfiguration templateableElementConfiguration = (TemplateableElementConfiguration)theEObject;
				T result = caseTemplateableElementConfiguration(templateableElementConfiguration);
				if (result == null) result = caseTemplateableElement(templateableElementConfiguration);
				if (result == null) result = caseElementConfiguration(templateableElementConfiguration);
				if (result == null) result = caseElement(templateableElementConfiguration);
				if (result == null) result = caseEModelElement(templateableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEMPLATE_BINDING_CONFIGURATION: {
				TemplateBindingConfiguration templateBindingConfiguration = (TemplateBindingConfiguration)theEObject;
				T result = caseTemplateBindingConfiguration(templateBindingConfiguration);
				if (result == null) result = caseTemplateBinding(templateBindingConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(templateBindingConfiguration);
				if (result == null) result = caseDirectedRelationship(templateBindingConfiguration);
				if (result == null) result = caseRelationshipConfiguration(templateBindingConfiguration);
				if (result == null) result = caseRelationship(templateBindingConfiguration);
				if (result == null) result = caseElementConfiguration(templateBindingConfiguration);
				if (result == null) result = caseElement(templateBindingConfiguration);
				if (result == null) result = caseEModelElement(templateBindingConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DIRECTED_RELATIONSHIP_CONFIGURATION: {
				DirectedRelationshipConfiguration directedRelationshipConfiguration = (DirectedRelationshipConfiguration)theEObject;
				T result = caseDirectedRelationshipConfiguration(directedRelationshipConfiguration);
				if (result == null) result = caseDirectedRelationship(directedRelationshipConfiguration);
				if (result == null) result = caseRelationshipConfiguration(directedRelationshipConfiguration);
				if (result == null) result = caseRelationship(directedRelationshipConfiguration);
				if (result == null) result = caseElementConfiguration(directedRelationshipConfiguration);
				if (result == null) result = caseElement(directedRelationshipConfiguration);
				if (result == null) result = caseEModelElement(directedRelationshipConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.RELATIONSHIP_CONFIGURATION: {
				RelationshipConfiguration relationshipConfiguration = (RelationshipConfiguration)theEObject;
				T result = caseRelationshipConfiguration(relationshipConfiguration);
				if (result == null) result = caseRelationship(relationshipConfiguration);
				if (result == null) result = caseElementConfiguration(relationshipConfiguration);
				if (result == null) result = caseElement(relationshipConfiguration);
				if (result == null) result = caseEModelElement(relationshipConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CONFIGURATION: {
				TemplateParameterSubstitutionConfiguration templateParameterSubstitutionConfiguration = (TemplateParameterSubstitutionConfiguration)theEObject;
				T result = caseTemplateParameterSubstitutionConfiguration(templateParameterSubstitutionConfiguration);
				if (result == null) result = caseTemplateParameterSubstitution(templateParameterSubstitutionConfiguration);
				if (result == null) result = caseElementConfiguration(templateParameterSubstitutionConfiguration);
				if (result == null) result = caseElement(templateParameterSubstitutionConfiguration);
				if (result == null) result = caseEModelElement(templateParameterSubstitutionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TYPE_CONFIGURATION: {
				TypeConfiguration typeConfiguration = (TypeConfiguration)theEObject;
				T result = caseTypeConfiguration(typeConfiguration);
				if (result == null) result = caseType(typeConfiguration);
				if (result == null) result = casePackageableElementConfiguration(typeConfiguration);
				if (result == null) result = casePackageableElement(typeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(typeConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(typeConfiguration);
				if (result == null) result = caseNamedElement(typeConfiguration);
				if (result == null) result = caseParameterableElement(typeConfiguration);
				if (result == null) result = caseElementConfiguration(typeConfiguration);
				if (result == null) result = caseElement(typeConfiguration);
				if (result == null) result = caseEModelElement(typeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ASSOCIATION_CONFIGURATION: {
				AssociationConfiguration associationConfiguration = (AssociationConfiguration)theEObject;
				T result = caseAssociationConfiguration(associationConfiguration);
				if (result == null) result = caseAssociation(associationConfiguration);
				if (result == null) result = caseClassifierConfiguration(associationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(associationConfiguration);
				if (result == null) result = caseClassifier(associationConfiguration);
				if (result == null) result = caseRelationship(associationConfiguration);
				if (result == null) result = caseNamespaceConfiguration(associationConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(associationConfiguration);
				if (result == null) result = caseTypeConfiguration(associationConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(associationConfiguration);
				if (result == null) result = caseNamespace(associationConfiguration);
				if (result == null) result = caseRedefinableElement(associationConfiguration);
				if (result == null) result = caseType(associationConfiguration);
				if (result == null) result = caseTemplateableElement(associationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(associationConfiguration);
				if (result == null) result = casePackageableElement(associationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(associationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(associationConfiguration);
				if (result == null) result = caseNamedElement(associationConfiguration);
				if (result == null) result = caseParameterableElement(associationConfiguration);
				if (result == null) result = caseElementConfiguration(associationConfiguration);
				if (result == null) result = caseElement(associationConfiguration);
				if (result == null) result = caseEModelElement(associationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROPERTY_CONFIGURATION: {
				PropertyConfiguration propertyConfiguration = (PropertyConfiguration)theEObject;
				T result = casePropertyConfiguration(propertyConfiguration);
				if (result == null) result = caseProperty(propertyConfiguration);
				if (result == null) result = caseStructuralFeatureConfiguration(propertyConfiguration);
				if (result == null) result = caseConnectableElementConfiguration(propertyConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(propertyConfiguration);
				if (result == null) result = caseStructuralFeature(propertyConfiguration);
				if (result == null) result = caseConnectableElement(propertyConfiguration);
				if (result == null) result = caseDeploymentTarget(propertyConfiguration);
				if (result == null) result = caseFeatureConfiguration(propertyConfiguration);
				if (result == null) result = caseTypedElementConfiguration(propertyConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(propertyConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(propertyConfiguration);
				if (result == null) result = caseFeature(propertyConfiguration);
				if (result == null) result = caseTypedElement(propertyConfiguration);
				if (result == null) result = caseMultiplicityElement(propertyConfiguration);
				if (result == null) result = caseParameterableElement(propertyConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(propertyConfiguration);
				if (result == null) result = caseRedefinableElement(propertyConfiguration);
				if (result == null) result = caseNamedElementConfiguration(propertyConfiguration);
				if (result == null) result = caseNamedElement(propertyConfiguration);
				if (result == null) result = caseElementConfiguration(propertyConfiguration);
				if (result == null) result = caseElement(propertyConfiguration);
				if (result == null) result = caseEModelElement(propertyConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONNECTABLE_ELEMENT_CONFIGURATION: {
				ConnectableElementConfiguration connectableElementConfiguration = (ConnectableElementConfiguration)theEObject;
				T result = caseConnectableElementConfiguration(connectableElementConfiguration);
				if (result == null) result = caseConnectableElement(connectableElementConfiguration);
				if (result == null) result = caseTypedElementConfiguration(connectableElementConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(connectableElementConfiguration);
				if (result == null) result = caseTypedElement(connectableElementConfiguration);
				if (result == null) result = caseParameterableElement(connectableElementConfiguration);
				if (result == null) result = caseNamedElementConfiguration(connectableElementConfiguration);
				if (result == null) result = caseNamedElement(connectableElementConfiguration);
				if (result == null) result = caseElementConfiguration(connectableElementConfiguration);
				if (result == null) result = caseElement(connectableElementConfiguration);
				if (result == null) result = caseEModelElement(connectableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TYPED_ELEMENT_CONFIGURATION: {
				TypedElementConfiguration typedElementConfiguration = (TypedElementConfiguration)theEObject;
				T result = caseTypedElementConfiguration(typedElementConfiguration);
				if (result == null) result = caseTypedElement(typedElementConfiguration);
				if (result == null) result = caseNamedElementConfiguration(typedElementConfiguration);
				if (result == null) result = caseNamedElement(typedElementConfiguration);
				if (result == null) result = caseElementConfiguration(typedElementConfiguration);
				if (result == null) result = caseElement(typedElementConfiguration);
				if (result == null) result = caseEModelElement(typedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONNECTOR_END_CONFIGURATION: {
				ConnectorEndConfiguration connectorEndConfiguration = (ConnectorEndConfiguration)theEObject;
				T result = caseConnectorEndConfiguration(connectorEndConfiguration);
				if (result == null) result = caseConnectorEnd(connectorEndConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(connectorEndConfiguration);
				if (result == null) result = caseMultiplicityElement(connectorEndConfiguration);
				if (result == null) result = caseElementConfiguration(connectorEndConfiguration);
				if (result == null) result = caseElement(connectorEndConfiguration);
				if (result == null) result = caseEModelElement(connectorEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MULTIPLICITY_ELEMENT_CONFIGURATION: {
				MultiplicityElementConfiguration multiplicityElementConfiguration = (MultiplicityElementConfiguration)theEObject;
				T result = caseMultiplicityElementConfiguration(multiplicityElementConfiguration);
				if (result == null) result = caseMultiplicityElement(multiplicityElementConfiguration);
				if (result == null) result = caseElementConfiguration(multiplicityElementConfiguration);
				if (result == null) result = caseElement(multiplicityElementConfiguration);
				if (result == null) result = caseEModelElement(multiplicityElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VALUE_SPECIFICATION_CONFIGURATION: {
				ValueSpecificationConfiguration valueSpecificationConfiguration = (ValueSpecificationConfiguration)theEObject;
				T result = caseValueSpecificationConfiguration(valueSpecificationConfiguration);
				if (result == null) result = caseValueSpecification(valueSpecificationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(valueSpecificationConfiguration);
				if (result == null) result = caseTypedElementConfiguration(valueSpecificationConfiguration);
				if (result == null) result = casePackageableElement(valueSpecificationConfiguration);
				if (result == null) result = caseTypedElement(valueSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(valueSpecificationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(valueSpecificationConfiguration);
				if (result == null) result = caseNamedElement(valueSpecificationConfiguration);
				if (result == null) result = caseParameterableElement(valueSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(valueSpecificationConfiguration);
				if (result == null) result = caseElement(valueSpecificationConfiguration);
				if (result == null) result = caseEModelElement(valueSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER_CONFIGURATION: {
				ConnectableElementTemplateParameterConfiguration connectableElementTemplateParameterConfiguration = (ConnectableElementTemplateParameterConfiguration)theEObject;
				T result = caseConnectableElementTemplateParameterConfiguration(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseConnectableElementTemplateParameter(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameterConfiguration(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameter(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseElementConfiguration(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseElement(connectableElementTemplateParameterConfiguration);
				if (result == null) result = caseEModelElement(connectableElementTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEPLOYMENT_TARGET_CONFIGURATION: {
				DeploymentTargetConfiguration deploymentTargetConfiguration = (DeploymentTargetConfiguration)theEObject;
				T result = caseDeploymentTargetConfiguration(deploymentTargetConfiguration);
				if (result == null) result = caseDeploymentTarget(deploymentTargetConfiguration);
				if (result == null) result = caseNamedElementConfiguration(deploymentTargetConfiguration);
				if (result == null) result = caseNamedElement(deploymentTargetConfiguration);
				if (result == null) result = caseElementConfiguration(deploymentTargetConfiguration);
				if (result == null) result = caseElement(deploymentTargetConfiguration);
				if (result == null) result = caseEModelElement(deploymentTargetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEPLOYMENT_CONFIGURATION: {
				DeploymentConfiguration deploymentConfiguration = (DeploymentConfiguration)theEObject;
				T result = caseDeploymentConfiguration(deploymentConfiguration);
				if (result == null) result = caseDeployment(deploymentConfiguration);
				if (result == null) result = caseDependencyConfiguration(deploymentConfiguration);
				if (result == null) result = caseDependency(deploymentConfiguration);
				if (result == null) result = casePackageableElementConfiguration(deploymentConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(deploymentConfiguration);
				if (result == null) result = casePackageableElement(deploymentConfiguration);
				if (result == null) result = caseDirectedRelationship(deploymentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(deploymentConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(deploymentConfiguration);
				if (result == null) result = caseRelationshipConfiguration(deploymentConfiguration);
				if (result == null) result = caseNamedElement(deploymentConfiguration);
				if (result == null) result = caseParameterableElement(deploymentConfiguration);
				if (result == null) result = caseRelationship(deploymentConfiguration);
				if (result == null) result = caseElementConfiguration(deploymentConfiguration);
				if (result == null) result = caseElement(deploymentConfiguration);
				if (result == null) result = caseEModelElement(deploymentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEPENDENCY_CONFIGURATION: {
				DependencyConfiguration dependencyConfiguration = (DependencyConfiguration)theEObject;
				T result = caseDependencyConfiguration(dependencyConfiguration);
				if (result == null) result = caseDependency(dependencyConfiguration);
				if (result == null) result = casePackageableElementConfiguration(dependencyConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(dependencyConfiguration);
				if (result == null) result = casePackageableElement(dependencyConfiguration);
				if (result == null) result = caseDirectedRelationship(dependencyConfiguration);
				if (result == null) result = caseNamedElementConfiguration(dependencyConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(dependencyConfiguration);
				if (result == null) result = caseRelationshipConfiguration(dependencyConfiguration);
				if (result == null) result = caseNamedElement(dependencyConfiguration);
				if (result == null) result = caseParameterableElement(dependencyConfiguration);
				if (result == null) result = caseRelationship(dependencyConfiguration);
				if (result == null) result = caseElementConfiguration(dependencyConfiguration);
				if (result == null) result = caseElement(dependencyConfiguration);
				if (result == null) result = caseEModelElement(dependencyConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEPLOYMENT_SPECIFICATION_CONFIGURATION: {
				DeploymentSpecificationConfiguration deploymentSpecificationConfiguration = (DeploymentSpecificationConfiguration)theEObject;
				T result = caseDeploymentSpecificationConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseDeploymentSpecification(deploymentSpecificationConfiguration);
				if (result == null) result = caseArtifactConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseArtifact(deploymentSpecificationConfiguration);
				if (result == null) result = caseClassifierConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseDeployedArtifactConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseClassifier(deploymentSpecificationConfiguration);
				if (result == null) result = caseDeployedArtifact(deploymentSpecificationConfiguration);
				if (result == null) result = caseNamespaceConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseTypeConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseNamespace(deploymentSpecificationConfiguration);
				if (result == null) result = caseRedefinableElement(deploymentSpecificationConfiguration);
				if (result == null) result = caseType(deploymentSpecificationConfiguration);
				if (result == null) result = caseTemplateableElement(deploymentSpecificationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = casePackageableElement(deploymentSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseNamedElement(deploymentSpecificationConfiguration);
				if (result == null) result = caseParameterableElement(deploymentSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(deploymentSpecificationConfiguration);
				if (result == null) result = caseElement(deploymentSpecificationConfiguration);
				if (result == null) result = caseEModelElement(deploymentSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ARTIFACT_CONFIGURATION: {
				ArtifactConfiguration artifactConfiguration = (ArtifactConfiguration)theEObject;
				T result = caseArtifactConfiguration(artifactConfiguration);
				if (result == null) result = caseArtifact(artifactConfiguration);
				if (result == null) result = caseClassifierConfiguration(artifactConfiguration);
				if (result == null) result = caseDeployedArtifactConfiguration(artifactConfiguration);
				if (result == null) result = caseClassifier(artifactConfiguration);
				if (result == null) result = caseDeployedArtifact(artifactConfiguration);
				if (result == null) result = caseNamespaceConfiguration(artifactConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(artifactConfiguration);
				if (result == null) result = caseTypeConfiguration(artifactConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(artifactConfiguration);
				if (result == null) result = caseNamespace(artifactConfiguration);
				if (result == null) result = caseRedefinableElement(artifactConfiguration);
				if (result == null) result = caseType(artifactConfiguration);
				if (result == null) result = caseTemplateableElement(artifactConfiguration);
				if (result == null) result = casePackageableElementConfiguration(artifactConfiguration);
				if (result == null) result = casePackageableElement(artifactConfiguration);
				if (result == null) result = caseNamedElementConfiguration(artifactConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(artifactConfiguration);
				if (result == null) result = caseNamedElement(artifactConfiguration);
				if (result == null) result = caseParameterableElement(artifactConfiguration);
				if (result == null) result = caseElementConfiguration(artifactConfiguration);
				if (result == null) result = caseElement(artifactConfiguration);
				if (result == null) result = caseEModelElement(artifactConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEPLOYED_ARTIFACT_CONFIGURATION: {
				DeployedArtifactConfiguration deployedArtifactConfiguration = (DeployedArtifactConfiguration)theEObject;
				T result = caseDeployedArtifactConfiguration(deployedArtifactConfiguration);
				if (result == null) result = caseDeployedArtifact(deployedArtifactConfiguration);
				if (result == null) result = caseNamedElementConfiguration(deployedArtifactConfiguration);
				if (result == null) result = caseNamedElement(deployedArtifactConfiguration);
				if (result == null) result = caseElementConfiguration(deployedArtifactConfiguration);
				if (result == null) result = caseElement(deployedArtifactConfiguration);
				if (result == null) result = caseEModelElement(deployedArtifactConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MANIFESTATION_CONFIGURATION: {
				ManifestationConfiguration manifestationConfiguration = (ManifestationConfiguration)theEObject;
				T result = caseManifestationConfiguration(manifestationConfiguration);
				if (result == null) result = caseManifestation(manifestationConfiguration);
				if (result == null) result = caseAbstractionConfiguration(manifestationConfiguration);
				if (result == null) result = caseAbstraction(manifestationConfiguration);
				if (result == null) result = caseDependencyConfiguration(manifestationConfiguration);
				if (result == null) result = caseDependency(manifestationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(manifestationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(manifestationConfiguration);
				if (result == null) result = casePackageableElement(manifestationConfiguration);
				if (result == null) result = caseDirectedRelationship(manifestationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(manifestationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(manifestationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(manifestationConfiguration);
				if (result == null) result = caseNamedElement(manifestationConfiguration);
				if (result == null) result = caseParameterableElement(manifestationConfiguration);
				if (result == null) result = caseRelationship(manifestationConfiguration);
				if (result == null) result = caseElementConfiguration(manifestationConfiguration);
				if (result == null) result = caseElement(manifestationConfiguration);
				if (result == null) result = caseEModelElement(manifestationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ABSTRACTION_CONFIGURATION: {
				AbstractionConfiguration abstractionConfiguration = (AbstractionConfiguration)theEObject;
				T result = caseAbstractionConfiguration(abstractionConfiguration);
				if (result == null) result = caseAbstraction(abstractionConfiguration);
				if (result == null) result = caseDependencyConfiguration(abstractionConfiguration);
				if (result == null) result = caseDependency(abstractionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(abstractionConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(abstractionConfiguration);
				if (result == null) result = casePackageableElement(abstractionConfiguration);
				if (result == null) result = caseDirectedRelationship(abstractionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(abstractionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(abstractionConfiguration);
				if (result == null) result = caseRelationshipConfiguration(abstractionConfiguration);
				if (result == null) result = caseNamedElement(abstractionConfiguration);
				if (result == null) result = caseParameterableElement(abstractionConfiguration);
				if (result == null) result = caseRelationship(abstractionConfiguration);
				if (result == null) result = caseElementConfiguration(abstractionConfiguration);
				if (result == null) result = caseElement(abstractionConfiguration);
				if (result == null) result = caseEModelElement(abstractionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OPAQUE_EXPRESSION_CONFIGURATION: {
				OpaqueExpressionConfiguration opaqueExpressionConfiguration = (OpaqueExpressionConfiguration)theEObject;
				T result = caseOpaqueExpressionConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseOpaqueExpression(opaqueExpressionConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseValueSpecification(opaqueExpressionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseTypedElementConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = casePackageableElement(opaqueExpressionConfiguration);
				if (result == null) result = caseTypedElement(opaqueExpressionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseNamedElement(opaqueExpressionConfiguration);
				if (result == null) result = caseParameterableElement(opaqueExpressionConfiguration);
				if (result == null) result = caseElementConfiguration(opaqueExpressionConfiguration);
				if (result == null) result = caseElement(opaqueExpressionConfiguration);
				if (result == null) result = caseEModelElement(opaqueExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PARAMETER_CONFIGURATION: {
				ParameterConfiguration parameterConfiguration = (ParameterConfiguration)theEObject;
				T result = caseParameterConfiguration(parameterConfiguration);
				if (result == null) result = caseParameter(parameterConfiguration);
				if (result == null) result = caseConnectableElementConfiguration(parameterConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(parameterConfiguration);
				if (result == null) result = caseConnectableElement(parameterConfiguration);
				if (result == null) result = caseMultiplicityElement(parameterConfiguration);
				if (result == null) result = caseTypedElementConfiguration(parameterConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(parameterConfiguration);
				if (result == null) result = caseTypedElement(parameterConfiguration);
				if (result == null) result = caseParameterableElement(parameterConfiguration);
				if (result == null) result = caseNamedElementConfiguration(parameterConfiguration);
				if (result == null) result = caseNamedElement(parameterConfiguration);
				if (result == null) result = caseElementConfiguration(parameterConfiguration);
				if (result == null) result = caseElement(parameterConfiguration);
				if (result == null) result = caseEModelElement(parameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OPERATION_CONFIGURATION: {
				OperationConfiguration operationConfiguration = (OperationConfiguration)theEObject;
				T result = caseOperationConfiguration(operationConfiguration);
				if (result == null) result = caseOperation(operationConfiguration);
				if (result == null) result = caseBehavioralFeatureConfiguration(operationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(operationConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(operationConfiguration);
				if (result == null) result = caseBehavioralFeature(operationConfiguration);
				if (result == null) result = caseParameterableElement(operationConfiguration);
				if (result == null) result = caseTemplateableElement(operationConfiguration);
				if (result == null) result = caseNamespaceConfiguration(operationConfiguration);
				if (result == null) result = caseFeatureConfiguration(operationConfiguration);
				if (result == null) result = caseNamespace(operationConfiguration);
				if (result == null) result = caseFeature(operationConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(operationConfiguration);
				if (result == null) result = caseRedefinableElement(operationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(operationConfiguration);
				if (result == null) result = caseElementConfiguration(operationConfiguration);
				if (result == null) result = caseNamedElement(operationConfiguration);
				if (result == null) result = caseElement(operationConfiguration);
				if (result == null) result = caseEModelElement(operationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.BEHAVIORAL_FEATURE_CONFIGURATION: {
				BehavioralFeatureConfiguration behavioralFeatureConfiguration = (BehavioralFeatureConfiguration)theEObject;
				T result = caseBehavioralFeatureConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseBehavioralFeature(behavioralFeatureConfiguration);
				if (result == null) result = caseNamespaceConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseFeatureConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseNamespace(behavioralFeatureConfiguration);
				if (result == null) result = caseFeature(behavioralFeatureConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseRedefinableElement(behavioralFeatureConfiguration);
				if (result == null) result = caseNamedElementConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseElementConfiguration(behavioralFeatureConfiguration);
				if (result == null) result = caseNamedElement(behavioralFeatureConfiguration);
				if (result == null) result = caseElement(behavioralFeatureConfiguration);
				if (result == null) result = caseEModelElement(behavioralFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FEATURE_CONFIGURATION: {
				FeatureConfiguration featureConfiguration = (FeatureConfiguration)theEObject;
				T result = caseFeatureConfiguration(featureConfiguration);
				if (result == null) result = caseFeature(featureConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(featureConfiguration);
				if (result == null) result = caseRedefinableElement(featureConfiguration);
				if (result == null) result = caseNamedElementConfiguration(featureConfiguration);
				if (result == null) result = caseNamedElement(featureConfiguration);
				if (result == null) result = caseElementConfiguration(featureConfiguration);
				if (result == null) result = caseElement(featureConfiguration);
				if (result == null) result = caseEModelElement(featureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REDEFINABLE_ELEMENT_CONFIGURATION: {
				RedefinableElementConfiguration redefinableElementConfiguration = (RedefinableElementConfiguration)theEObject;
				T result = caseRedefinableElementConfiguration(redefinableElementConfiguration);
				if (result == null) result = caseRedefinableElement(redefinableElementConfiguration);
				if (result == null) result = caseNamedElementConfiguration(redefinableElementConfiguration);
				if (result == null) result = caseNamedElement(redefinableElementConfiguration);
				if (result == null) result = caseElementConfiguration(redefinableElementConfiguration);
				if (result == null) result = caseElement(redefinableElementConfiguration);
				if (result == null) result = caseEModelElement(redefinableElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PARAMETER_SET_CONFIGURATION: {
				ParameterSetConfiguration parameterSetConfiguration = (ParameterSetConfiguration)theEObject;
				T result = caseParameterSetConfiguration(parameterSetConfiguration);
				if (result == null) result = caseParameterSet(parameterSetConfiguration);
				if (result == null) result = caseNamedElementConfiguration(parameterSetConfiguration);
				if (result == null) result = caseNamedElement(parameterSetConfiguration);
				if (result == null) result = caseElementConfiguration(parameterSetConfiguration);
				if (result == null) result = caseElement(parameterSetConfiguration);
				if (result == null) result = caseEModelElement(parameterSetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONSTRAINT_CONFIGURATION: {
				ConstraintConfiguration constraintConfiguration = (ConstraintConfiguration)theEObject;
				T result = caseConstraintConfiguration(constraintConfiguration);
				if (result == null) result = caseConstraint(constraintConfiguration);
				if (result == null) result = casePackageableElementConfiguration(constraintConfiguration);
				if (result == null) result = casePackageableElement(constraintConfiguration);
				if (result == null) result = caseNamedElementConfiguration(constraintConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(constraintConfiguration);
				if (result == null) result = caseNamedElement(constraintConfiguration);
				if (result == null) result = caseParameterableElement(constraintConfiguration);
				if (result == null) result = caseElementConfiguration(constraintConfiguration);
				if (result == null) result = caseElement(constraintConfiguration);
				if (result == null) result = caseEModelElement(constraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DATA_TYPE_CONFIGURATION: {
				DataTypeConfiguration dataTypeConfiguration = (DataTypeConfiguration)theEObject;
				T result = caseDataTypeConfiguration(dataTypeConfiguration);
				if (result == null) result = caseDataType(dataTypeConfiguration);
				if (result == null) result = caseClassifierConfiguration(dataTypeConfiguration);
				if (result == null) result = caseClassifier(dataTypeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(dataTypeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(dataTypeConfiguration);
				if (result == null) result = caseTypeConfiguration(dataTypeConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(dataTypeConfiguration);
				if (result == null) result = caseNamespace(dataTypeConfiguration);
				if (result == null) result = caseRedefinableElement(dataTypeConfiguration);
				if (result == null) result = caseType(dataTypeConfiguration);
				if (result == null) result = caseTemplateableElement(dataTypeConfiguration);
				if (result == null) result = casePackageableElementConfiguration(dataTypeConfiguration);
				if (result == null) result = casePackageableElement(dataTypeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(dataTypeConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(dataTypeConfiguration);
				if (result == null) result = caseNamedElement(dataTypeConfiguration);
				if (result == null) result = caseParameterableElement(dataTypeConfiguration);
				if (result == null) result = caseElementConfiguration(dataTypeConfiguration);
				if (result == null) result = caseElement(dataTypeConfiguration);
				if (result == null) result = caseEModelElement(dataTypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERFACE_CONFIGURATION: {
				InterfaceConfiguration interfaceConfiguration = (InterfaceConfiguration)theEObject;
				T result = caseInterfaceConfiguration(interfaceConfiguration);
				if (result == null) result = caseInterface(interfaceConfiguration);
				if (result == null) result = caseClassifierConfiguration(interfaceConfiguration);
				if (result == null) result = caseClassifier(interfaceConfiguration);
				if (result == null) result = caseNamespaceConfiguration(interfaceConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(interfaceConfiguration);
				if (result == null) result = caseTypeConfiguration(interfaceConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(interfaceConfiguration);
				if (result == null) result = caseNamespace(interfaceConfiguration);
				if (result == null) result = caseRedefinableElement(interfaceConfiguration);
				if (result == null) result = caseType(interfaceConfiguration);
				if (result == null) result = caseTemplateableElement(interfaceConfiguration);
				if (result == null) result = casePackageableElementConfiguration(interfaceConfiguration);
				if (result == null) result = casePackageableElement(interfaceConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interfaceConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(interfaceConfiguration);
				if (result == null) result = caseNamedElement(interfaceConfiguration);
				if (result == null) result = caseParameterableElement(interfaceConfiguration);
				if (result == null) result = caseElementConfiguration(interfaceConfiguration);
				if (result == null) result = caseElement(interfaceConfiguration);
				if (result == null) result = caseEModelElement(interfaceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.RECEPTION_CONFIGURATION: {
				ReceptionConfiguration receptionConfiguration = (ReceptionConfiguration)theEObject;
				T result = caseReceptionConfiguration(receptionConfiguration);
				if (result == null) result = caseReception(receptionConfiguration);
				if (result == null) result = caseBehavioralFeatureConfiguration(receptionConfiguration);
				if (result == null) result = caseBehavioralFeature(receptionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(receptionConfiguration);
				if (result == null) result = caseFeatureConfiguration(receptionConfiguration);
				if (result == null) result = caseNamespace(receptionConfiguration);
				if (result == null) result = caseFeature(receptionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(receptionConfiguration);
				if (result == null) result = caseRedefinableElement(receptionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(receptionConfiguration);
				if (result == null) result = caseElementConfiguration(receptionConfiguration);
				if (result == null) result = caseNamedElement(receptionConfiguration);
				if (result == null) result = caseElement(receptionConfiguration);
				if (result == null) result = caseEModelElement(receptionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SIGNAL_CONFIGURATION: {
				SignalConfiguration signalConfiguration = (SignalConfiguration)theEObject;
				T result = caseSignalConfiguration(signalConfiguration);
				if (result == null) result = caseSignal(signalConfiguration);
				if (result == null) result = caseClassifierConfiguration(signalConfiguration);
				if (result == null) result = caseClassifier(signalConfiguration);
				if (result == null) result = caseNamespaceConfiguration(signalConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(signalConfiguration);
				if (result == null) result = caseTypeConfiguration(signalConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(signalConfiguration);
				if (result == null) result = caseNamespace(signalConfiguration);
				if (result == null) result = caseRedefinableElement(signalConfiguration);
				if (result == null) result = caseType(signalConfiguration);
				if (result == null) result = caseTemplateableElement(signalConfiguration);
				if (result == null) result = casePackageableElementConfiguration(signalConfiguration);
				if (result == null) result = casePackageableElement(signalConfiguration);
				if (result == null) result = caseNamedElementConfiguration(signalConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(signalConfiguration);
				if (result == null) result = caseNamedElement(signalConfiguration);
				if (result == null) result = caseParameterableElement(signalConfiguration);
				if (result == null) result = caseElementConfiguration(signalConfiguration);
				if (result == null) result = caseElement(signalConfiguration);
				if (result == null) result = caseEModelElement(signalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROTOCOL_STATE_MACHINE_CONFIGURATION: {
				ProtocolStateMachineConfiguration protocolStateMachineConfiguration = (ProtocolStateMachineConfiguration)theEObject;
				T result = caseProtocolStateMachineConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseProtocolStateMachine(protocolStateMachineConfiguration);
				if (result == null) result = caseStateMachineConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseStateMachine(protocolStateMachineConfiguration);
				if (result == null) result = caseBehaviorConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseBehavior(protocolStateMachineConfiguration);
				if (result == null) result = caseClassConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseClass(protocolStateMachineConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(protocolStateMachineConfiguration);
				if (result == null) result = caseBehavioredClassifier(protocolStateMachineConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseStructuredClassifier(protocolStateMachineConfiguration);
				if (result == null) result = caseClassifierConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseClassifier(protocolStateMachineConfiguration);
				if (result == null) result = caseNamespaceConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseTypeConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseNamespace(protocolStateMachineConfiguration);
				if (result == null) result = caseRedefinableElement(protocolStateMachineConfiguration);
				if (result == null) result = caseType(protocolStateMachineConfiguration);
				if (result == null) result = caseTemplateableElement(protocolStateMachineConfiguration);
				if (result == null) result = casePackageableElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = casePackageableElement(protocolStateMachineConfiguration);
				if (result == null) result = caseNamedElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseNamedElement(protocolStateMachineConfiguration);
				if (result == null) result = caseParameterableElement(protocolStateMachineConfiguration);
				if (result == null) result = caseElementConfiguration(protocolStateMachineConfiguration);
				if (result == null) result = caseElement(protocolStateMachineConfiguration);
				if (result == null) result = caseEModelElement(protocolStateMachineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STATE_MACHINE_CONFIGURATION: {
				StateMachineConfiguration stateMachineConfiguration = (StateMachineConfiguration)theEObject;
				T result = caseStateMachineConfiguration(stateMachineConfiguration);
				if (result == null) result = caseStateMachine(stateMachineConfiguration);
				if (result == null) result = caseBehaviorConfiguration(stateMachineConfiguration);
				if (result == null) result = caseBehavior(stateMachineConfiguration);
				if (result == null) result = caseClassConfiguration(stateMachineConfiguration);
				if (result == null) result = caseClass(stateMachineConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(stateMachineConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(stateMachineConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(stateMachineConfiguration);
				if (result == null) result = caseBehavioredClassifier(stateMachineConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(stateMachineConfiguration);
				if (result == null) result = caseStructuredClassifier(stateMachineConfiguration);
				if (result == null) result = caseClassifierConfiguration(stateMachineConfiguration);
				if (result == null) result = caseClassifier(stateMachineConfiguration);
				if (result == null) result = caseNamespaceConfiguration(stateMachineConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(stateMachineConfiguration);
				if (result == null) result = caseTypeConfiguration(stateMachineConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(stateMachineConfiguration);
				if (result == null) result = caseNamespace(stateMachineConfiguration);
				if (result == null) result = caseRedefinableElement(stateMachineConfiguration);
				if (result == null) result = caseType(stateMachineConfiguration);
				if (result == null) result = caseTemplateableElement(stateMachineConfiguration);
				if (result == null) result = casePackageableElementConfiguration(stateMachineConfiguration);
				if (result == null) result = casePackageableElement(stateMachineConfiguration);
				if (result == null) result = caseNamedElementConfiguration(stateMachineConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(stateMachineConfiguration);
				if (result == null) result = caseNamedElement(stateMachineConfiguration);
				if (result == null) result = caseParameterableElement(stateMachineConfiguration);
				if (result == null) result = caseElementConfiguration(stateMachineConfiguration);
				if (result == null) result = caseElement(stateMachineConfiguration);
				if (result == null) result = caseEModelElement(stateMachineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PSEUDOSTATE_CONFIGURATION: {
				PseudostateConfiguration pseudostateConfiguration = (PseudostateConfiguration)theEObject;
				T result = casePseudostateConfiguration(pseudostateConfiguration);
				if (result == null) result = casePseudostate(pseudostateConfiguration);
				if (result == null) result = caseVertexConfiguration(pseudostateConfiguration);
				if (result == null) result = caseVertex(pseudostateConfiguration);
				if (result == null) result = caseNamedElementConfiguration(pseudostateConfiguration);
				if (result == null) result = caseNamedElement(pseudostateConfiguration);
				if (result == null) result = caseElementConfiguration(pseudostateConfiguration);
				if (result == null) result = caseElement(pseudostateConfiguration);
				if (result == null) result = caseEModelElement(pseudostateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VERTEX_CONFIGURATION: {
				VertexConfiguration vertexConfiguration = (VertexConfiguration)theEObject;
				T result = caseVertexConfiguration(vertexConfiguration);
				if (result == null) result = caseVertex(vertexConfiguration);
				if (result == null) result = caseNamedElementConfiguration(vertexConfiguration);
				if (result == null) result = caseNamedElement(vertexConfiguration);
				if (result == null) result = caseElementConfiguration(vertexConfiguration);
				if (result == null) result = caseElement(vertexConfiguration);
				if (result == null) result = caseEModelElement(vertexConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REGION_CONFIGURATION: {
				RegionConfiguration regionConfiguration = (RegionConfiguration)theEObject;
				T result = caseRegionConfiguration(regionConfiguration);
				if (result == null) result = caseRegion(regionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(regionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(regionConfiguration);
				if (result == null) result = caseNamespace(regionConfiguration);
				if (result == null) result = caseRedefinableElement(regionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(regionConfiguration);
				if (result == null) result = caseNamedElement(regionConfiguration);
				if (result == null) result = caseElementConfiguration(regionConfiguration);
				if (result == null) result = caseElement(regionConfiguration);
				if (result == null) result = caseEModelElement(regionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STATE_CONFIGURATION: {
				StateConfiguration stateConfiguration = (StateConfiguration)theEObject;
				T result = caseStateConfiguration(stateConfiguration);
				if (result == null) result = caseState(stateConfiguration);
				if (result == null) result = caseNamespaceConfiguration(stateConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(stateConfiguration);
				if (result == null) result = caseVertexConfiguration(stateConfiguration);
				if (result == null) result = caseNamespace(stateConfiguration);
				if (result == null) result = caseRedefinableElement(stateConfiguration);
				if (result == null) result = caseVertex(stateConfiguration);
				if (result == null) result = caseNamedElementConfiguration(stateConfiguration);
				if (result == null) result = caseNamedElement(stateConfiguration);
				if (result == null) result = caseElementConfiguration(stateConfiguration);
				if (result == null) result = caseElement(stateConfiguration);
				if (result == null) result = caseEModelElement(stateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONNECTION_POINT_REFERENCE_CONFIGURATION: {
				ConnectionPointReferenceConfiguration connectionPointReferenceConfiguration = (ConnectionPointReferenceConfiguration)theEObject;
				T result = caseConnectionPointReferenceConfiguration(connectionPointReferenceConfiguration);
				if (result == null) result = caseConnectionPointReference(connectionPointReferenceConfiguration);
				if (result == null) result = caseVertexConfiguration(connectionPointReferenceConfiguration);
				if (result == null) result = caseVertex(connectionPointReferenceConfiguration);
				if (result == null) result = caseNamedElementConfiguration(connectionPointReferenceConfiguration);
				if (result == null) result = caseNamedElement(connectionPointReferenceConfiguration);
				if (result == null) result = caseElementConfiguration(connectionPointReferenceConfiguration);
				if (result == null) result = caseElement(connectionPointReferenceConfiguration);
				if (result == null) result = caseEModelElement(connectionPointReferenceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRIGGER_CONFIGURATION: {
				TriggerConfiguration triggerConfiguration = (TriggerConfiguration)theEObject;
				T result = caseTriggerConfiguration(triggerConfiguration);
				if (result == null) result = caseTrigger(triggerConfiguration);
				if (result == null) result = caseNamedElementConfiguration(triggerConfiguration);
				if (result == null) result = caseNamedElement(triggerConfiguration);
				if (result == null) result = caseElementConfiguration(triggerConfiguration);
				if (result == null) result = caseElement(triggerConfiguration);
				if (result == null) result = caseEModelElement(triggerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EVENT_CONFIGURATION: {
				EventConfiguration eventConfiguration = (EventConfiguration)theEObject;
				T result = caseEventConfiguration(eventConfiguration);
				if (result == null) result = caseEvent(eventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(eventConfiguration);
				if (result == null) result = casePackageableElement(eventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(eventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(eventConfiguration);
				if (result == null) result = caseNamedElement(eventConfiguration);
				if (result == null) result = caseParameterableElement(eventConfiguration);
				if (result == null) result = caseElementConfiguration(eventConfiguration);
				if (result == null) result = caseElement(eventConfiguration);
				if (result == null) result = caseEModelElement(eventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PORT_CONFIGURATION: {
				PortConfiguration portConfiguration = (PortConfiguration)theEObject;
				T result = casePortConfiguration(portConfiguration);
				if (result == null) result = casePort(portConfiguration);
				if (result == null) result = casePropertyConfiguration(portConfiguration);
				if (result == null) result = caseProperty(portConfiguration);
				if (result == null) result = caseStructuralFeatureConfiguration(portConfiguration);
				if (result == null) result = caseConnectableElementConfiguration(portConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(portConfiguration);
				if (result == null) result = caseStructuralFeature(portConfiguration);
				if (result == null) result = caseConnectableElement(portConfiguration);
				if (result == null) result = caseDeploymentTarget(portConfiguration);
				if (result == null) result = caseFeatureConfiguration(portConfiguration);
				if (result == null) result = caseTypedElementConfiguration(portConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(portConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(portConfiguration);
				if (result == null) result = caseFeature(portConfiguration);
				if (result == null) result = caseTypedElement(portConfiguration);
				if (result == null) result = caseMultiplicityElement(portConfiguration);
				if (result == null) result = caseParameterableElement(portConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(portConfiguration);
				if (result == null) result = caseRedefinableElement(portConfiguration);
				if (result == null) result = caseNamedElementConfiguration(portConfiguration);
				if (result == null) result = caseNamedElement(portConfiguration);
				if (result == null) result = caseElementConfiguration(portConfiguration);
				if (result == null) result = caseElement(portConfiguration);
				if (result == null) result = caseEModelElement(portConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TRANSITION_CONFIGURATION: {
				TransitionConfiguration transitionConfiguration = (TransitionConfiguration)theEObject;
				T result = caseTransitionConfiguration(transitionConfiguration);
				if (result == null) result = caseTransition(transitionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(transitionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(transitionConfiguration);
				if (result == null) result = caseNamespace(transitionConfiguration);
				if (result == null) result = caseRedefinableElement(transitionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(transitionConfiguration);
				if (result == null) result = caseNamedElement(transitionConfiguration);
				if (result == null) result = caseElementConfiguration(transitionConfiguration);
				if (result == null) result = caseElement(transitionConfiguration);
				if (result == null) result = caseEModelElement(transitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROTOCOL_CONFORMANCE_CONFIGURATION: {
				ProtocolConformanceConfiguration protocolConformanceConfiguration = (ProtocolConformanceConfiguration)theEObject;
				T result = caseProtocolConformanceConfiguration(protocolConformanceConfiguration);
				if (result == null) result = caseProtocolConformance(protocolConformanceConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(protocolConformanceConfiguration);
				if (result == null) result = caseDirectedRelationship(protocolConformanceConfiguration);
				if (result == null) result = caseRelationshipConfiguration(protocolConformanceConfiguration);
				if (result == null) result = caseRelationship(protocolConformanceConfiguration);
				if (result == null) result = caseElementConfiguration(protocolConformanceConfiguration);
				if (result == null) result = caseElement(protocolConformanceConfiguration);
				if (result == null) result = caseEModelElement(protocolConformanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OPERATION_TEMPLATE_PARAMETER_CONFIGURATION: {
				OperationTemplateParameterConfiguration operationTemplateParameterConfiguration = (OperationTemplateParameterConfiguration)theEObject;
				T result = caseOperationTemplateParameterConfiguration(operationTemplateParameterConfiguration);
				if (result == null) result = caseOperationTemplateParameter(operationTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameterConfiguration(operationTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameter(operationTemplateParameterConfiguration);
				if (result == null) result = caseElementConfiguration(operationTemplateParameterConfiguration);
				if (result == null) result = caseElement(operationTemplateParameterConfiguration);
				if (result == null) result = caseEModelElement(operationTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STRUCTURAL_FEATURE_CONFIGURATION: {
				StructuralFeatureConfiguration structuralFeatureConfiguration = (StructuralFeatureConfiguration)theEObject;
				T result = caseStructuralFeatureConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseStructuralFeature(structuralFeatureConfiguration);
				if (result == null) result = caseFeatureConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseTypedElementConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseFeature(structuralFeatureConfiguration);
				if (result == null) result = caseTypedElement(structuralFeatureConfiguration);
				if (result == null) result = caseMultiplicityElement(structuralFeatureConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseRedefinableElement(structuralFeatureConfiguration);
				if (result == null) result = caseNamedElementConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseNamedElement(structuralFeatureConfiguration);
				if (result == null) result = caseElementConfiguration(structuralFeatureConfiguration);
				if (result == null) result = caseElement(structuralFeatureConfiguration);
				if (result == null) result = caseEModelElement(structuralFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PACKAGE_MERGE_CONFIGURATION: {
				PackageMergeConfiguration packageMergeConfiguration = (PackageMergeConfiguration)theEObject;
				T result = casePackageMergeConfiguration(packageMergeConfiguration);
				if (result == null) result = casePackageMerge(packageMergeConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(packageMergeConfiguration);
				if (result == null) result = caseDirectedRelationship(packageMergeConfiguration);
				if (result == null) result = caseRelationshipConfiguration(packageMergeConfiguration);
				if (result == null) result = caseRelationship(packageMergeConfiguration);
				if (result == null) result = caseElementConfiguration(packageMergeConfiguration);
				if (result == null) result = caseElement(packageMergeConfiguration);
				if (result == null) result = caseEModelElement(packageMergeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROFILE_APPLICATION_CONFIGURATION: {
				ProfileApplicationConfiguration profileApplicationConfiguration = (ProfileApplicationConfiguration)theEObject;
				T result = caseProfileApplicationConfiguration(profileApplicationConfiguration);
				if (result == null) result = caseProfileApplication(profileApplicationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(profileApplicationConfiguration);
				if (result == null) result = caseDirectedRelationship(profileApplicationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(profileApplicationConfiguration);
				if (result == null) result = caseRelationship(profileApplicationConfiguration);
				if (result == null) result = caseElementConfiguration(profileApplicationConfiguration);
				if (result == null) result = caseElement(profileApplicationConfiguration);
				if (result == null) result = caseEModelElement(profileApplicationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ENUMERATION_CONFIGURATION: {
				EnumerationConfiguration enumerationConfiguration = (EnumerationConfiguration)theEObject;
				T result = caseEnumerationConfiguration(enumerationConfiguration);
				if (result == null) result = caseEnumeration(enumerationConfiguration);
				if (result == null) result = caseDataTypeConfiguration(enumerationConfiguration);
				if (result == null) result = caseDataType(enumerationConfiguration);
				if (result == null) result = caseClassifierConfiguration(enumerationConfiguration);
				if (result == null) result = caseClassifier(enumerationConfiguration);
				if (result == null) result = caseNamespaceConfiguration(enumerationConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(enumerationConfiguration);
				if (result == null) result = caseTypeConfiguration(enumerationConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(enumerationConfiguration);
				if (result == null) result = caseNamespace(enumerationConfiguration);
				if (result == null) result = caseRedefinableElement(enumerationConfiguration);
				if (result == null) result = caseType(enumerationConfiguration);
				if (result == null) result = caseTemplateableElement(enumerationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(enumerationConfiguration);
				if (result == null) result = casePackageableElement(enumerationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(enumerationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(enumerationConfiguration);
				if (result == null) result = caseNamedElement(enumerationConfiguration);
				if (result == null) result = caseParameterableElement(enumerationConfiguration);
				if (result == null) result = caseElementConfiguration(enumerationConfiguration);
				if (result == null) result = caseElement(enumerationConfiguration);
				if (result == null) result = caseEModelElement(enumerationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ENUMERATION_LITERAL_CONFIGURATION: {
				EnumerationLiteralConfiguration enumerationLiteralConfiguration = (EnumerationLiteralConfiguration)theEObject;
				T result = caseEnumerationLiteralConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseEnumerationLiteral(enumerationLiteralConfiguration);
				if (result == null) result = caseInstanceSpecificationConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseInstanceSpecification(enumerationLiteralConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = casePackageableElementConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseDeployedArtifactConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseDeploymentTarget(enumerationLiteralConfiguration);
				if (result == null) result = casePackageableElement(enumerationLiteralConfiguration);
				if (result == null) result = caseDeployedArtifact(enumerationLiteralConfiguration);
				if (result == null) result = caseNamedElementConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseNamedElement(enumerationLiteralConfiguration);
				if (result == null) result = caseParameterableElement(enumerationLiteralConfiguration);
				if (result == null) result = caseElementConfiguration(enumerationLiteralConfiguration);
				if (result == null) result = caseElement(enumerationLiteralConfiguration);
				if (result == null) result = caseEModelElement(enumerationLiteralConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INSTANCE_SPECIFICATION_CONFIGURATION: {
				InstanceSpecificationConfiguration instanceSpecificationConfiguration = (InstanceSpecificationConfiguration)theEObject;
				T result = caseInstanceSpecificationConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseInstanceSpecification(instanceSpecificationConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseDeployedArtifactConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseDeploymentTarget(instanceSpecificationConfiguration);
				if (result == null) result = casePackageableElement(instanceSpecificationConfiguration);
				if (result == null) result = caseDeployedArtifact(instanceSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseNamedElement(instanceSpecificationConfiguration);
				if (result == null) result = caseParameterableElement(instanceSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(instanceSpecificationConfiguration);
				if (result == null) result = caseElement(instanceSpecificationConfiguration);
				if (result == null) result = caseEModelElement(instanceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SLOT_CONFIGURATION: {
				SlotConfiguration slotConfiguration = (SlotConfiguration)theEObject;
				T result = caseSlotConfiguration(slotConfiguration);
				if (result == null) result = caseSlot(slotConfiguration);
				if (result == null) result = caseElementConfiguration(slotConfiguration);
				if (result == null) result = caseElement(slotConfiguration);
				if (result == null) result = caseEModelElement(slotConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PRIMITIVE_TYPE_CONFIGURATION: {
				PrimitiveTypeConfiguration primitiveTypeConfiguration = (PrimitiveTypeConfiguration)theEObject;
				T result = casePrimitiveTypeConfiguration(primitiveTypeConfiguration);
				if (result == null) result = casePrimitiveType(primitiveTypeConfiguration);
				if (result == null) result = caseDataTypeConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseDataType(primitiveTypeConfiguration);
				if (result == null) result = caseClassifierConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseClassifier(primitiveTypeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseTypeConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseNamespace(primitiveTypeConfiguration);
				if (result == null) result = caseRedefinableElement(primitiveTypeConfiguration);
				if (result == null) result = caseType(primitiveTypeConfiguration);
				if (result == null) result = caseTemplateableElement(primitiveTypeConfiguration);
				if (result == null) result = casePackageableElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = casePackageableElement(primitiveTypeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseNamedElement(primitiveTypeConfiguration);
				if (result == null) result = caseParameterableElement(primitiveTypeConfiguration);
				if (result == null) result = caseElementConfiguration(primitiveTypeConfiguration);
				if (result == null) result = caseElement(primitiveTypeConfiguration);
				if (result == null) result = caseEModelElement(primitiveTypeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ELEMENT_IMPORT_CONFIGURATION: {
				ElementImportConfiguration elementImportConfiguration = (ElementImportConfiguration)theEObject;
				T result = caseElementImportConfiguration(elementImportConfiguration);
				if (result == null) result = caseElementImport(elementImportConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(elementImportConfiguration);
				if (result == null) result = caseDirectedRelationship(elementImportConfiguration);
				if (result == null) result = caseRelationshipConfiguration(elementImportConfiguration);
				if (result == null) result = caseRelationship(elementImportConfiguration);
				if (result == null) result = caseElementConfiguration(elementImportConfiguration);
				if (result == null) result = caseElement(elementImportConfiguration);
				if (result == null) result = caseEModelElement(elementImportConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PACKAGE_IMPORT_CONFIGURATION: {
				PackageImportConfiguration packageImportConfiguration = (PackageImportConfiguration)theEObject;
				T result = casePackageImportConfiguration(packageImportConfiguration);
				if (result == null) result = casePackageImport(packageImportConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(packageImportConfiguration);
				if (result == null) result = caseDirectedRelationship(packageImportConfiguration);
				if (result == null) result = caseRelationshipConfiguration(packageImportConfiguration);
				if (result == null) result = caseRelationship(packageImportConfiguration);
				if (result == null) result = caseElementConfiguration(packageImportConfiguration);
				if (result == null) result = caseElement(packageImportConfiguration);
				if (result == null) result = caseEModelElement(packageImportConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXTENSION_CONFIGURATION: {
				ExtensionConfiguration extensionConfiguration = (ExtensionConfiguration)theEObject;
				T result = caseExtensionConfiguration(extensionConfiguration);
				if (result == null) result = caseExtension(extensionConfiguration);
				if (result == null) result = caseAssociationConfiguration(extensionConfiguration);
				if (result == null) result = caseAssociation(extensionConfiguration);
				if (result == null) result = caseClassifierConfiguration(extensionConfiguration);
				if (result == null) result = caseRelationshipConfiguration(extensionConfiguration);
				if (result == null) result = caseClassifier(extensionConfiguration);
				if (result == null) result = caseRelationship(extensionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(extensionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(extensionConfiguration);
				if (result == null) result = caseTypeConfiguration(extensionConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(extensionConfiguration);
				if (result == null) result = caseNamespace(extensionConfiguration);
				if (result == null) result = caseRedefinableElement(extensionConfiguration);
				if (result == null) result = caseType(extensionConfiguration);
				if (result == null) result = caseTemplateableElement(extensionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(extensionConfiguration);
				if (result == null) result = casePackageableElement(extensionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(extensionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(extensionConfiguration);
				if (result == null) result = caseNamedElement(extensionConfiguration);
				if (result == null) result = caseParameterableElement(extensionConfiguration);
				if (result == null) result = caseElementConfiguration(extensionConfiguration);
				if (result == null) result = caseElement(extensionConfiguration);
				if (result == null) result = caseEModelElement(extensionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXTENSION_END_CONFIGURATION: {
				ExtensionEndConfiguration extensionEndConfiguration = (ExtensionEndConfiguration)theEObject;
				T result = caseExtensionEndConfiguration(extensionEndConfiguration);
				if (result == null) result = caseExtensionEnd(extensionEndConfiguration);
				if (result == null) result = casePropertyConfiguration(extensionEndConfiguration);
				if (result == null) result = caseProperty(extensionEndConfiguration);
				if (result == null) result = caseStructuralFeatureConfiguration(extensionEndConfiguration);
				if (result == null) result = caseConnectableElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(extensionEndConfiguration);
				if (result == null) result = caseStructuralFeature(extensionEndConfiguration);
				if (result == null) result = caseConnectableElement(extensionEndConfiguration);
				if (result == null) result = caseDeploymentTarget(extensionEndConfiguration);
				if (result == null) result = caseFeatureConfiguration(extensionEndConfiguration);
				if (result == null) result = caseTypedElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseFeature(extensionEndConfiguration);
				if (result == null) result = caseTypedElement(extensionEndConfiguration);
				if (result == null) result = caseMultiplicityElement(extensionEndConfiguration);
				if (result == null) result = caseParameterableElement(extensionEndConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseRedefinableElement(extensionEndConfiguration);
				if (result == null) result = caseNamedElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseNamedElement(extensionEndConfiguration);
				if (result == null) result = caseElementConfiguration(extensionEndConfiguration);
				if (result == null) result = caseElement(extensionEndConfiguration);
				if (result == null) result = caseEModelElement(extensionEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STRING_EXPRESSION_CONFIGURATION: {
				StringExpressionConfiguration stringExpressionConfiguration = (StringExpressionConfiguration)theEObject;
				T result = caseStringExpressionConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseStringExpression(stringExpressionConfiguration);
				if (result == null) result = caseExpressionConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseExpression(stringExpressionConfiguration);
				if (result == null) result = caseTemplateableElement(stringExpressionConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseValueSpecification(stringExpressionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseTypedElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = casePackageableElement(stringExpressionConfiguration);
				if (result == null) result = caseTypedElement(stringExpressionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseNamedElement(stringExpressionConfiguration);
				if (result == null) result = caseParameterableElement(stringExpressionConfiguration);
				if (result == null) result = caseElementConfiguration(stringExpressionConfiguration);
				if (result == null) result = caseElement(stringExpressionConfiguration);
				if (result == null) result = caseEModelElement(stringExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXPRESSION_CONFIGURATION: {
				ExpressionConfiguration expressionConfiguration = (ExpressionConfiguration)theEObject;
				T result = caseExpressionConfiguration(expressionConfiguration);
				if (result == null) result = caseExpression(expressionConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(expressionConfiguration);
				if (result == null) result = caseValueSpecification(expressionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(expressionConfiguration);
				if (result == null) result = caseTypedElementConfiguration(expressionConfiguration);
				if (result == null) result = casePackageableElement(expressionConfiguration);
				if (result == null) result = caseTypedElement(expressionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(expressionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(expressionConfiguration);
				if (result == null) result = caseNamedElement(expressionConfiguration);
				if (result == null) result = caseParameterableElement(expressionConfiguration);
				if (result == null) result = caseElementConfiguration(expressionConfiguration);
				if (result == null) result = caseElement(expressionConfiguration);
				if (result == null) result = caseEModelElement(expressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.USAGE_CONFIGURATION: {
				UsageConfiguration usageConfiguration = (UsageConfiguration)theEObject;
				T result = caseUsageConfiguration(usageConfiguration);
				if (result == null) result = caseUsage(usageConfiguration);
				if (result == null) result = caseDependencyConfiguration(usageConfiguration);
				if (result == null) result = caseDependency(usageConfiguration);
				if (result == null) result = casePackageableElementConfiguration(usageConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(usageConfiguration);
				if (result == null) result = casePackageableElement(usageConfiguration);
				if (result == null) result = caseDirectedRelationship(usageConfiguration);
				if (result == null) result = caseNamedElementConfiguration(usageConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(usageConfiguration);
				if (result == null) result = caseRelationshipConfiguration(usageConfiguration);
				if (result == null) result = caseNamedElement(usageConfiguration);
				if (result == null) result = caseParameterableElement(usageConfiguration);
				if (result == null) result = caseRelationship(usageConfiguration);
				if (result == null) result = caseElementConfiguration(usageConfiguration);
				if (result == null) result = caseElement(usageConfiguration);
				if (result == null) result = caseEModelElement(usageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COLLABORATION_USE_CONFIGURATION: {
				CollaborationUseConfiguration collaborationUseConfiguration = (CollaborationUseConfiguration)theEObject;
				T result = caseCollaborationUseConfiguration(collaborationUseConfiguration);
				if (result == null) result = caseCollaborationUse(collaborationUseConfiguration);
				if (result == null) result = caseNamedElementConfiguration(collaborationUseConfiguration);
				if (result == null) result = caseNamedElement(collaborationUseConfiguration);
				if (result == null) result = caseElementConfiguration(collaborationUseConfiguration);
				if (result == null) result = caseElement(collaborationUseConfiguration);
				if (result == null) result = caseEModelElement(collaborationUseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COLLABORATION_CONFIGURATION: {
				CollaborationConfiguration collaborationConfiguration = (CollaborationConfiguration)theEObject;
				T result = caseCollaborationConfiguration(collaborationConfiguration);
				if (result == null) result = caseCollaboration(collaborationConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(collaborationConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(collaborationConfiguration);
				if (result == null) result = caseStructuredClassifier(collaborationConfiguration);
				if (result == null) result = caseBehavioredClassifier(collaborationConfiguration);
				if (result == null) result = caseClassifierConfiguration(collaborationConfiguration);
				if (result == null) result = caseClassifier(collaborationConfiguration);
				if (result == null) result = caseNamespaceConfiguration(collaborationConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(collaborationConfiguration);
				if (result == null) result = caseTypeConfiguration(collaborationConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(collaborationConfiguration);
				if (result == null) result = caseNamespace(collaborationConfiguration);
				if (result == null) result = caseRedefinableElement(collaborationConfiguration);
				if (result == null) result = caseType(collaborationConfiguration);
				if (result == null) result = caseTemplateableElement(collaborationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(collaborationConfiguration);
				if (result == null) result = casePackageableElement(collaborationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(collaborationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(collaborationConfiguration);
				if (result == null) result = caseNamedElement(collaborationConfiguration);
				if (result == null) result = caseParameterableElement(collaborationConfiguration);
				if (result == null) result = caseElementConfiguration(collaborationConfiguration);
				if (result == null) result = caseElement(collaborationConfiguration);
				if (result == null) result = caseEModelElement(collaborationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STRUCTURED_CLASSIFIER_CONFIGURATION: {
				StructuredClassifierConfiguration structuredClassifierConfiguration = (StructuredClassifierConfiguration)theEObject;
				T result = caseStructuredClassifierConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseStructuredClassifier(structuredClassifierConfiguration);
				if (result == null) result = caseClassifierConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseClassifier(structuredClassifierConfiguration);
				if (result == null) result = caseNamespaceConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseTypeConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseNamespace(structuredClassifierConfiguration);
				if (result == null) result = caseRedefinableElement(structuredClassifierConfiguration);
				if (result == null) result = caseType(structuredClassifierConfiguration);
				if (result == null) result = caseTemplateableElement(structuredClassifierConfiguration);
				if (result == null) result = casePackageableElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = casePackageableElement(structuredClassifierConfiguration);
				if (result == null) result = caseNamedElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseNamedElement(structuredClassifierConfiguration);
				if (result == null) result = caseParameterableElement(structuredClassifierConfiguration);
				if (result == null) result = caseElementConfiguration(structuredClassifierConfiguration);
				if (result == null) result = caseElement(structuredClassifierConfiguration);
				if (result == null) result = caseEModelElement(structuredClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONNECTOR_CONFIGURATION: {
				ConnectorConfiguration connectorConfiguration = (ConnectorConfiguration)theEObject;
				T result = caseConnectorConfiguration(connectorConfiguration);
				if (result == null) result = caseConnector(connectorConfiguration);
				if (result == null) result = caseFeatureConfiguration(connectorConfiguration);
				if (result == null) result = caseFeature(connectorConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(connectorConfiguration);
				if (result == null) result = caseRedefinableElement(connectorConfiguration);
				if (result == null) result = caseNamedElementConfiguration(connectorConfiguration);
				if (result == null) result = caseNamedElement(connectorConfiguration);
				if (result == null) result = caseElementConfiguration(connectorConfiguration);
				if (result == null) result = caseElement(connectorConfiguration);
				if (result == null) result = caseEModelElement(connectorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.GENERALIZATION_CONFIGURATION: {
				GeneralizationConfiguration generalizationConfiguration = (GeneralizationConfiguration)theEObject;
				T result = caseGeneralizationConfiguration(generalizationConfiguration);
				if (result == null) result = caseGeneralization(generalizationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(generalizationConfiguration);
				if (result == null) result = caseDirectedRelationship(generalizationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(generalizationConfiguration);
				if (result == null) result = caseRelationship(generalizationConfiguration);
				if (result == null) result = caseElementConfiguration(generalizationConfiguration);
				if (result == null) result = caseElement(generalizationConfiguration);
				if (result == null) result = caseEModelElement(generalizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.GENERALIZATION_SET_CONFIGURATION: {
				GeneralizationSetConfiguration generalizationSetConfiguration = (GeneralizationSetConfiguration)theEObject;
				T result = caseGeneralizationSetConfiguration(generalizationSetConfiguration);
				if (result == null) result = caseGeneralizationSet(generalizationSetConfiguration);
				if (result == null) result = casePackageableElementConfiguration(generalizationSetConfiguration);
				if (result == null) result = casePackageableElement(generalizationSetConfiguration);
				if (result == null) result = caseNamedElementConfiguration(generalizationSetConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(generalizationSetConfiguration);
				if (result == null) result = caseNamedElement(generalizationSetConfiguration);
				if (result == null) result = caseParameterableElement(generalizationSetConfiguration);
				if (result == null) result = caseElementConfiguration(generalizationSetConfiguration);
				if (result == null) result = caseElement(generalizationSetConfiguration);
				if (result == null) result = caseEModelElement(generalizationSetConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REDEFINABLE_TEMPLATE_SIGNATURE_CONFIGURATION: {
				RedefinableTemplateSignatureConfiguration redefinableTemplateSignatureConfiguration = (RedefinableTemplateSignatureConfiguration)theEObject;
				T result = caseRedefinableTemplateSignatureConfiguration(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseRedefinableTemplateSignature(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTemplateSignatureConfiguration(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseRedefinableElement(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseTemplateSignature(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseNamedElementConfiguration(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseNamedElement(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseElementConfiguration(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseElement(redefinableTemplateSignatureConfiguration);
				if (result == null) result = caseEModelElement(redefinableTemplateSignatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.USE_CASE_CONFIGURATION: {
				UseCaseConfiguration useCaseConfiguration = (UseCaseConfiguration)theEObject;
				T result = caseUseCaseConfiguration(useCaseConfiguration);
				if (result == null) result = caseUseCase(useCaseConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(useCaseConfiguration);
				if (result == null) result = caseBehavioredClassifier(useCaseConfiguration);
				if (result == null) result = caseClassifierConfiguration(useCaseConfiguration);
				if (result == null) result = caseClassifier(useCaseConfiguration);
				if (result == null) result = caseNamespaceConfiguration(useCaseConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(useCaseConfiguration);
				if (result == null) result = caseTypeConfiguration(useCaseConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(useCaseConfiguration);
				if (result == null) result = caseNamespace(useCaseConfiguration);
				if (result == null) result = caseRedefinableElement(useCaseConfiguration);
				if (result == null) result = caseType(useCaseConfiguration);
				if (result == null) result = caseTemplateableElement(useCaseConfiguration);
				if (result == null) result = casePackageableElementConfiguration(useCaseConfiguration);
				if (result == null) result = casePackageableElement(useCaseConfiguration);
				if (result == null) result = caseNamedElementConfiguration(useCaseConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(useCaseConfiguration);
				if (result == null) result = caseNamedElement(useCaseConfiguration);
				if (result == null) result = caseParameterableElement(useCaseConfiguration);
				if (result == null) result = caseElementConfiguration(useCaseConfiguration);
				if (result == null) result = caseElement(useCaseConfiguration);
				if (result == null) result = caseEModelElement(useCaseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXTEND_CONFIGURATION: {
				ExtendConfiguration extendConfiguration = (ExtendConfiguration)theEObject;
				T result = caseExtendConfiguration(extendConfiguration);
				if (result == null) result = caseExtend(extendConfiguration);
				if (result == null) result = caseNamedElementConfiguration(extendConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(extendConfiguration);
				if (result == null) result = caseNamedElement(extendConfiguration);
				if (result == null) result = caseDirectedRelationship(extendConfiguration);
				if (result == null) result = caseRelationshipConfiguration(extendConfiguration);
				if (result == null) result = caseRelationship(extendConfiguration);
				if (result == null) result = caseElementConfiguration(extendConfiguration);
				if (result == null) result = caseElement(extendConfiguration);
				if (result == null) result = caseEModelElement(extendConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXTENSION_POINT_CONFIGURATION: {
				ExtensionPointConfiguration extensionPointConfiguration = (ExtensionPointConfiguration)theEObject;
				T result = caseExtensionPointConfiguration(extensionPointConfiguration);
				if (result == null) result = caseExtensionPoint(extensionPointConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(extensionPointConfiguration);
				if (result == null) result = caseRedefinableElement(extensionPointConfiguration);
				if (result == null) result = caseNamedElementConfiguration(extensionPointConfiguration);
				if (result == null) result = caseNamedElement(extensionPointConfiguration);
				if (result == null) result = caseElementConfiguration(extensionPointConfiguration);
				if (result == null) result = caseElement(extensionPointConfiguration);
				if (result == null) result = caseEModelElement(extensionPointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INCLUDE_CONFIGURATION: {
				IncludeConfiguration includeConfiguration = (IncludeConfiguration)theEObject;
				T result = caseIncludeConfiguration(includeConfiguration);
				if (result == null) result = caseInclude(includeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(includeConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(includeConfiguration);
				if (result == null) result = caseNamedElement(includeConfiguration);
				if (result == null) result = caseDirectedRelationship(includeConfiguration);
				if (result == null) result = caseRelationshipConfiguration(includeConfiguration);
				if (result == null) result = caseRelationship(includeConfiguration);
				if (result == null) result = caseElementConfiguration(includeConfiguration);
				if (result == null) result = caseElement(includeConfiguration);
				if (result == null) result = caseEModelElement(includeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SUBSTITUTION_CONFIGURATION: {
				SubstitutionConfiguration substitutionConfiguration = (SubstitutionConfiguration)theEObject;
				T result = caseSubstitutionConfiguration(substitutionConfiguration);
				if (result == null) result = caseSubstitution(substitutionConfiguration);
				if (result == null) result = caseRealizationConfiguration(substitutionConfiguration);
				if (result == null) result = caseRealization(substitutionConfiguration);
				if (result == null) result = caseAbstractionConfiguration(substitutionConfiguration);
				if (result == null) result = caseAbstraction(substitutionConfiguration);
				if (result == null) result = caseDependencyConfiguration(substitutionConfiguration);
				if (result == null) result = caseDependency(substitutionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(substitutionConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(substitutionConfiguration);
				if (result == null) result = casePackageableElement(substitutionConfiguration);
				if (result == null) result = caseDirectedRelationship(substitutionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(substitutionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(substitutionConfiguration);
				if (result == null) result = caseRelationshipConfiguration(substitutionConfiguration);
				if (result == null) result = caseNamedElement(substitutionConfiguration);
				if (result == null) result = caseParameterableElement(substitutionConfiguration);
				if (result == null) result = caseRelationship(substitutionConfiguration);
				if (result == null) result = caseElementConfiguration(substitutionConfiguration);
				if (result == null) result = caseElement(substitutionConfiguration);
				if (result == null) result = caseEModelElement(substitutionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REALIZATION_CONFIGURATION: {
				RealizationConfiguration realizationConfiguration = (RealizationConfiguration)theEObject;
				T result = caseRealizationConfiguration(realizationConfiguration);
				if (result == null) result = caseRealization(realizationConfiguration);
				if (result == null) result = caseAbstractionConfiguration(realizationConfiguration);
				if (result == null) result = caseAbstraction(realizationConfiguration);
				if (result == null) result = caseDependencyConfiguration(realizationConfiguration);
				if (result == null) result = caseDependency(realizationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(realizationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(realizationConfiguration);
				if (result == null) result = casePackageableElement(realizationConfiguration);
				if (result == null) result = caseDirectedRelationship(realizationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(realizationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(realizationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(realizationConfiguration);
				if (result == null) result = caseNamedElement(realizationConfiguration);
				if (result == null) result = caseParameterableElement(realizationConfiguration);
				if (result == null) result = caseRelationship(realizationConfiguration);
				if (result == null) result = caseElementConfiguration(realizationConfiguration);
				if (result == null) result = caseElement(realizationConfiguration);
				if (result == null) result = caseEModelElement(realizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLASSIFIER_TEMPLATE_PARAMETER_CONFIGURATION: {
				ClassifierTemplateParameterConfiguration classifierTemplateParameterConfiguration = (ClassifierTemplateParameterConfiguration)theEObject;
				T result = caseClassifierTemplateParameterConfiguration(classifierTemplateParameterConfiguration);
				if (result == null) result = caseClassifierTemplateParameter(classifierTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameterConfiguration(classifierTemplateParameterConfiguration);
				if (result == null) result = caseTemplateParameter(classifierTemplateParameterConfiguration);
				if (result == null) result = caseElementConfiguration(classifierTemplateParameterConfiguration);
				if (result == null) result = caseElement(classifierTemplateParameterConfiguration);
				if (result == null) result = caseEModelElement(classifierTemplateParameterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERFACE_REALIZATION_CONFIGURATION: {
				InterfaceRealizationConfiguration interfaceRealizationConfiguration = (InterfaceRealizationConfiguration)theEObject;
				T result = caseInterfaceRealizationConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseInterfaceRealization(interfaceRealizationConfiguration);
				if (result == null) result = caseRealizationConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseRealization(interfaceRealizationConfiguration);
				if (result == null) result = caseAbstractionConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseAbstraction(interfaceRealizationConfiguration);
				if (result == null) result = caseDependencyConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseDependency(interfaceRealizationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = casePackageableElement(interfaceRealizationConfiguration);
				if (result == null) result = caseDirectedRelationship(interfaceRealizationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseNamedElement(interfaceRealizationConfiguration);
				if (result == null) result = caseParameterableElement(interfaceRealizationConfiguration);
				if (result == null) result = caseRelationship(interfaceRealizationConfiguration);
				if (result == null) result = caseElementConfiguration(interfaceRealizationConfiguration);
				if (result == null) result = caseElement(interfaceRealizationConfiguration);
				if (result == null) result = caseEModelElement(interfaceRealizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ENCAPSULATED_CLASSIFIER_CONFIGURATION: {
				EncapsulatedClassifierConfiguration encapsulatedClassifierConfiguration = (EncapsulatedClassifierConfiguration)theEObject;
				T result = caseEncapsulatedClassifierConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(encapsulatedClassifierConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseStructuredClassifier(encapsulatedClassifierConfiguration);
				if (result == null) result = caseClassifierConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseClassifier(encapsulatedClassifierConfiguration);
				if (result == null) result = caseNamespaceConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseTypeConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseNamespace(encapsulatedClassifierConfiguration);
				if (result == null) result = caseRedefinableElement(encapsulatedClassifierConfiguration);
				if (result == null) result = caseType(encapsulatedClassifierConfiguration);
				if (result == null) result = caseTemplateableElement(encapsulatedClassifierConfiguration);
				if (result == null) result = casePackageableElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = casePackageableElement(encapsulatedClassifierConfiguration);
				if (result == null) result = caseNamedElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseNamedElement(encapsulatedClassifierConfiguration);
				if (result == null) result = caseParameterableElement(encapsulatedClassifierConfiguration);
				if (result == null) result = caseElementConfiguration(encapsulatedClassifierConfiguration);
				if (result == null) result = caseElement(encapsulatedClassifierConfiguration);
				if (result == null) result = caseEModelElement(encapsulatedClassifierConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_GROUP_CONFIGURATION: {
				ActivityGroupConfiguration activityGroupConfiguration = (ActivityGroupConfiguration)theEObject;
				T result = caseActivityGroupConfiguration(activityGroupConfiguration);
				if (result == null) result = caseActivityGroup(activityGroupConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityGroupConfiguration);
				if (result == null) result = caseActivityContentConfiguration(activityGroupConfiguration);
				if (result == null) result = caseNamedElement(activityGroupConfiguration);
				if (result == null) result = caseActivityContent(activityGroupConfiguration);
				if (result == null) result = caseElementConfiguration(activityGroupConfiguration);
				if (result == null) result = caseElement(activityGroupConfiguration);
				if (result == null) result = caseEModelElement(activityGroupConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_EDGE_CONFIGURATION: {
				ActivityEdgeConfiguration activityEdgeConfiguration = (ActivityEdgeConfiguration)theEObject;
				T result = caseActivityEdgeConfiguration(activityEdgeConfiguration);
				if (result == null) result = caseActivityEdge(activityEdgeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(activityEdgeConfiguration);
				if (result == null) result = caseRedefinableElement(activityEdgeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityEdgeConfiguration);
				if (result == null) result = caseNamedElement(activityEdgeConfiguration);
				if (result == null) result = caseElementConfiguration(activityEdgeConfiguration);
				if (result == null) result = caseElement(activityEdgeConfiguration);
				if (result == null) result = caseEModelElement(activityEdgeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_PARTITION_CONFIGURATION: {
				ActivityPartitionConfiguration activityPartitionConfiguration = (ActivityPartitionConfiguration)theEObject;
				T result = caseActivityPartitionConfiguration(activityPartitionConfiguration);
				if (result == null) result = caseActivityPartition(activityPartitionConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(activityPartitionConfiguration);
				if (result == null) result = caseActivityGroup(activityPartitionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityPartitionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(activityPartitionConfiguration);
				if (result == null) result = caseNamedElement(activityPartitionConfiguration);
				if (result == null) result = caseActivityContent(activityPartitionConfiguration);
				if (result == null) result = caseElementConfiguration(activityPartitionConfiguration);
				if (result == null) result = caseElement(activityPartitionConfiguration);
				if (result == null) result = caseEModelElement(activityPartitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_NODE_CONFIGURATION: {
				ActivityNodeConfiguration activityNodeConfiguration = (ActivityNodeConfiguration)theEObject;
				T result = caseActivityNodeConfiguration(activityNodeConfiguration);
				if (result == null) result = caseActivityNode(activityNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(activityNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(activityNodeConfiguration);
				if (result == null) result = caseRedefinableElement(activityNodeConfiguration);
				if (result == null) result = caseActivityContent(activityNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityNodeConfiguration);
				if (result == null) result = caseNamedElement(activityNodeConfiguration);
				if (result == null) result = caseElementConfiguration(activityNodeConfiguration);
				if (result == null) result = caseElement(activityNodeConfiguration);
				if (result == null) result = caseEModelElement(activityNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERRUPTIBLE_ACTIVITY_REGION_CONFIGURATION: {
				InterruptibleActivityRegionConfiguration interruptibleActivityRegionConfiguration = (InterruptibleActivityRegionConfiguration)theEObject;
				T result = caseInterruptibleActivityRegionConfiguration(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseInterruptibleActivityRegion(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseActivityGroup(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseNamedElement(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseActivityContent(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseElementConfiguration(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseElement(interruptibleActivityRegionConfiguration);
				if (result == null) result = caseEModelElement(interruptibleActivityRegionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STRUCTURED_ACTIVITY_NODE_CONFIGURATION: {
				StructuredActivityNodeConfiguration structuredActivityNodeConfiguration = (StructuredActivityNodeConfiguration)theEObject;
				T result = caseStructuredActivityNodeConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseStructuredActivityNode(structuredActivityNodeConfiguration);
				if (result == null) result = caseActionConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseAction(structuredActivityNodeConfiguration);
				if (result == null) result = caseNamespace(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityGroup(structuredActivityNodeConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseExecutableNode(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityNode(structuredActivityNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseRedefinableElement(structuredActivityNodeConfiguration);
				if (result == null) result = caseActivityContent(structuredActivityNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseNamedElement(structuredActivityNodeConfiguration);
				if (result == null) result = caseElementConfiguration(structuredActivityNodeConfiguration);
				if (result == null) result = caseElement(structuredActivityNodeConfiguration);
				if (result == null) result = caseEModelElement(structuredActivityNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTION_CONFIGURATION: {
				ActionConfiguration actionConfiguration = (ActionConfiguration)theEObject;
				T result = caseActionConfiguration(actionConfiguration);
				if (result == null) result = caseAction(actionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(actionConfiguration);
				if (result == null) result = caseExecutableNode(actionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(actionConfiguration);
				if (result == null) result = caseActivityNode(actionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(actionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(actionConfiguration);
				if (result == null) result = caseRedefinableElement(actionConfiguration);
				if (result == null) result = caseActivityContent(actionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(actionConfiguration);
				if (result == null) result = caseNamedElement(actionConfiguration);
				if (result == null) result = caseElementConfiguration(actionConfiguration);
				if (result == null) result = caseElement(actionConfiguration);
				if (result == null) result = caseEModelElement(actionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXECUTABLE_NODE_CONFIGURATION: {
				ExecutableNodeConfiguration executableNodeConfiguration = (ExecutableNodeConfiguration)theEObject;
				T result = caseExecutableNodeConfiguration(executableNodeConfiguration);
				if (result == null) result = caseExecutableNode(executableNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(executableNodeConfiguration);
				if (result == null) result = caseActivityNode(executableNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(executableNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(executableNodeConfiguration);
				if (result == null) result = caseRedefinableElement(executableNodeConfiguration);
				if (result == null) result = caseActivityContent(executableNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(executableNodeConfiguration);
				if (result == null) result = caseNamedElement(executableNodeConfiguration);
				if (result == null) result = caseElementConfiguration(executableNodeConfiguration);
				if (result == null) result = caseElement(executableNodeConfiguration);
				if (result == null) result = caseEModelElement(executableNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXCEPTION_HANDLER_CONFIGURATION: {
				ExceptionHandlerConfiguration exceptionHandlerConfiguration = (ExceptionHandlerConfiguration)theEObject;
				T result = caseExceptionHandlerConfiguration(exceptionHandlerConfiguration);
				if (result == null) result = caseExceptionHandler(exceptionHandlerConfiguration);
				if (result == null) result = caseElementConfiguration(exceptionHandlerConfiguration);
				if (result == null) result = caseElement(exceptionHandlerConfiguration);
				if (result == null) result = caseEModelElement(exceptionHandlerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OBJECT_NODE_CONFIGURATION: {
				ObjectNodeConfiguration objectNodeConfiguration = (ObjectNodeConfiguration)theEObject;
				T result = caseObjectNodeConfiguration(objectNodeConfiguration);
				if (result == null) result = caseObjectNode(objectNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(objectNodeConfiguration);
				if (result == null) result = caseTypedElementConfiguration(objectNodeConfiguration);
				if (result == null) result = caseActivityNode(objectNodeConfiguration);
				if (result == null) result = caseTypedElement(objectNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(objectNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(objectNodeConfiguration);
				if (result == null) result = caseRedefinableElement(objectNodeConfiguration);
				if (result == null) result = caseActivityContent(objectNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(objectNodeConfiguration);
				if (result == null) result = caseNamedElement(objectNodeConfiguration);
				if (result == null) result = caseElementConfiguration(objectNodeConfiguration);
				if (result == null) result = caseElement(objectNodeConfiguration);
				if (result == null) result = caseEModelElement(objectNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INPUT_PIN_CONFIGURATION: {
				InputPinConfiguration inputPinConfiguration = (InputPinConfiguration)theEObject;
				T result = caseInputPinConfiguration(inputPinConfiguration);
				if (result == null) result = caseInputPin(inputPinConfiguration);
				if (result == null) result = casePinConfiguration(inputPinConfiguration);
				if (result == null) result = casePin(inputPinConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(inputPinConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(inputPinConfiguration);
				if (result == null) result = caseObjectNode(inputPinConfiguration);
				if (result == null) result = caseMultiplicityElement(inputPinConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(inputPinConfiguration);
				if (result == null) result = caseTypedElementConfiguration(inputPinConfiguration);
				if (result == null) result = caseActivityNode(inputPinConfiguration);
				if (result == null) result = caseTypedElement(inputPinConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(inputPinConfiguration);
				if (result == null) result = caseActivityContentConfiguration(inputPinConfiguration);
				if (result == null) result = caseRedefinableElement(inputPinConfiguration);
				if (result == null) result = caseActivityContent(inputPinConfiguration);
				if (result == null) result = caseNamedElementConfiguration(inputPinConfiguration);
				if (result == null) result = caseNamedElement(inputPinConfiguration);
				if (result == null) result = caseElementConfiguration(inputPinConfiguration);
				if (result == null) result = caseElement(inputPinConfiguration);
				if (result == null) result = caseEModelElement(inputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PIN_CONFIGURATION: {
				PinConfiguration pinConfiguration = (PinConfiguration)theEObject;
				T result = casePinConfiguration(pinConfiguration);
				if (result == null) result = casePin(pinConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(pinConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(pinConfiguration);
				if (result == null) result = caseObjectNode(pinConfiguration);
				if (result == null) result = caseMultiplicityElement(pinConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(pinConfiguration);
				if (result == null) result = caseTypedElementConfiguration(pinConfiguration);
				if (result == null) result = caseActivityNode(pinConfiguration);
				if (result == null) result = caseTypedElement(pinConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(pinConfiguration);
				if (result == null) result = caseActivityContentConfiguration(pinConfiguration);
				if (result == null) result = caseRedefinableElement(pinConfiguration);
				if (result == null) result = caseActivityContent(pinConfiguration);
				if (result == null) result = caseNamedElementConfiguration(pinConfiguration);
				if (result == null) result = caseNamedElement(pinConfiguration);
				if (result == null) result = caseElementConfiguration(pinConfiguration);
				if (result == null) result = caseElement(pinConfiguration);
				if (result == null) result = caseEModelElement(pinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OUTPUT_PIN_CONFIGURATION: {
				OutputPinConfiguration outputPinConfiguration = (OutputPinConfiguration)theEObject;
				T result = caseOutputPinConfiguration(outputPinConfiguration);
				if (result == null) result = caseOutputPin(outputPinConfiguration);
				if (result == null) result = casePinConfiguration(outputPinConfiguration);
				if (result == null) result = casePin(outputPinConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(outputPinConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(outputPinConfiguration);
				if (result == null) result = caseObjectNode(outputPinConfiguration);
				if (result == null) result = caseMultiplicityElement(outputPinConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(outputPinConfiguration);
				if (result == null) result = caseTypedElementConfiguration(outputPinConfiguration);
				if (result == null) result = caseActivityNode(outputPinConfiguration);
				if (result == null) result = caseTypedElement(outputPinConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(outputPinConfiguration);
				if (result == null) result = caseActivityContentConfiguration(outputPinConfiguration);
				if (result == null) result = caseRedefinableElement(outputPinConfiguration);
				if (result == null) result = caseActivityContent(outputPinConfiguration);
				if (result == null) result = caseNamedElementConfiguration(outputPinConfiguration);
				if (result == null) result = caseNamedElement(outputPinConfiguration);
				if (result == null) result = caseElementConfiguration(outputPinConfiguration);
				if (result == null) result = caseElement(outputPinConfiguration);
				if (result == null) result = caseEModelElement(outputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VARIABLE_CONFIGURATION: {
				VariableConfiguration variableConfiguration = (VariableConfiguration)theEObject;
				T result = caseVariableConfiguration(variableConfiguration);
				if (result == null) result = caseVariable(variableConfiguration);
				if (result == null) result = caseConnectableElementConfiguration(variableConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(variableConfiguration);
				if (result == null) result = caseConnectableElement(variableConfiguration);
				if (result == null) result = caseMultiplicityElement(variableConfiguration);
				if (result == null) result = caseTypedElementConfiguration(variableConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(variableConfiguration);
				if (result == null) result = caseTypedElement(variableConfiguration);
				if (result == null) result = caseParameterableElement(variableConfiguration);
				if (result == null) result = caseNamedElementConfiguration(variableConfiguration);
				if (result == null) result = caseNamedElement(variableConfiguration);
				if (result == null) result = caseElementConfiguration(variableConfiguration);
				if (result == null) result = caseElement(variableConfiguration);
				if (result == null) result = caseEModelElement(variableConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VALUE_SPECIFICATION_ACTION_CONFIGURATION: {
				ValueSpecificationActionConfiguration valueSpecificationActionConfiguration = (ValueSpecificationActionConfiguration)theEObject;
				T result = caseValueSpecificationActionConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseValueSpecificationAction(valueSpecificationActionConfiguration);
				if (result == null) result = caseActionConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseAction(valueSpecificationActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseExecutableNode(valueSpecificationActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseActivityNode(valueSpecificationActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseRedefinableElement(valueSpecificationActionConfiguration);
				if (result == null) result = caseActivityContent(valueSpecificationActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseNamedElement(valueSpecificationActionConfiguration);
				if (result == null) result = caseElementConfiguration(valueSpecificationActionConfiguration);
				if (result == null) result = caseElement(valueSpecificationActionConfiguration);
				if (result == null) result = caseEModelElement(valueSpecificationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VARIABLE_ACTION_CONFIGURATION: {
				VariableActionConfiguration variableActionConfiguration = (VariableActionConfiguration)theEObject;
				T result = caseVariableActionConfiguration(variableActionConfiguration);
				if (result == null) result = caseVariableAction(variableActionConfiguration);
				if (result == null) result = caseActionConfiguration(variableActionConfiguration);
				if (result == null) result = caseAction(variableActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(variableActionConfiguration);
				if (result == null) result = caseExecutableNode(variableActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(variableActionConfiguration);
				if (result == null) result = caseActivityNode(variableActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(variableActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(variableActionConfiguration);
				if (result == null) result = caseRedefinableElement(variableActionConfiguration);
				if (result == null) result = caseActivityContent(variableActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(variableActionConfiguration);
				if (result == null) result = caseNamedElement(variableActionConfiguration);
				if (result == null) result = caseElementConfiguration(variableActionConfiguration);
				if (result == null) result = caseElement(variableActionConfiguration);
				if (result == null) result = caseEModelElement(variableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.WRITE_LINK_ACTION_CONFIGURATION: {
				WriteLinkActionConfiguration writeLinkActionConfiguration = (WriteLinkActionConfiguration)theEObject;
				T result = caseWriteLinkActionConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseWriteLinkAction(writeLinkActionConfiguration);
				if (result == null) result = caseLinkActionConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseLinkAction(writeLinkActionConfiguration);
				if (result == null) result = caseActionConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseAction(writeLinkActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseExecutableNode(writeLinkActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseActivityNode(writeLinkActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseRedefinableElement(writeLinkActionConfiguration);
				if (result == null) result = caseActivityContent(writeLinkActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseNamedElement(writeLinkActionConfiguration);
				if (result == null) result = caseElementConfiguration(writeLinkActionConfiguration);
				if (result == null) result = caseElement(writeLinkActionConfiguration);
				if (result == null) result = caseEModelElement(writeLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LINK_ACTION_CONFIGURATION: {
				LinkActionConfiguration linkActionConfiguration = (LinkActionConfiguration)theEObject;
				T result = caseLinkActionConfiguration(linkActionConfiguration);
				if (result == null) result = caseLinkAction(linkActionConfiguration);
				if (result == null) result = caseActionConfiguration(linkActionConfiguration);
				if (result == null) result = caseAction(linkActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(linkActionConfiguration);
				if (result == null) result = caseExecutableNode(linkActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(linkActionConfiguration);
				if (result == null) result = caseActivityNode(linkActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(linkActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(linkActionConfiguration);
				if (result == null) result = caseRedefinableElement(linkActionConfiguration);
				if (result == null) result = caseActivityContent(linkActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(linkActionConfiguration);
				if (result == null) result = caseNamedElement(linkActionConfiguration);
				if (result == null) result = caseElementConfiguration(linkActionConfiguration);
				if (result == null) result = caseElement(linkActionConfiguration);
				if (result == null) result = caseEModelElement(linkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LINK_END_DATA_CONFIGURATION: {
				LinkEndDataConfiguration linkEndDataConfiguration = (LinkEndDataConfiguration)theEObject;
				T result = caseLinkEndDataConfiguration(linkEndDataConfiguration);
				if (result == null) result = caseLinkEndData(linkEndDataConfiguration);
				if (result == null) result = caseElementConfiguration(linkEndDataConfiguration);
				if (result == null) result = caseElement(linkEndDataConfiguration);
				if (result == null) result = caseEModelElement(linkEndDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.QUALIFIER_VALUE_CONFIGURATION: {
				QualifierValueConfiguration qualifierValueConfiguration = (QualifierValueConfiguration)theEObject;
				T result = caseQualifierValueConfiguration(qualifierValueConfiguration);
				if (result == null) result = caseQualifierValue(qualifierValueConfiguration);
				if (result == null) result = caseElementConfiguration(qualifierValueConfiguration);
				if (result == null) result = caseElement(qualifierValueConfiguration);
				if (result == null) result = caseEModelElement(qualifierValueConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.WRITE_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				WriteStructuralFeatureActionConfiguration writeStructuralFeatureActionConfiguration = (WriteStructuralFeatureActionConfiguration)theEObject;
				T result = caseWriteStructuralFeatureActionConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseWriteStructuralFeatureAction(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureActionConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseActionConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseAction(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNode(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNode(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElement(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContent(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElement(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseElementConfiguration(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseElement(writeStructuralFeatureActionConfiguration);
				if (result == null) result = caseEModelElement(writeStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				StructuralFeatureActionConfiguration structuralFeatureActionConfiguration = (StructuralFeatureActionConfiguration)theEObject;
				T result = caseStructuralFeatureActionConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(structuralFeatureActionConfiguration);
				if (result == null) result = caseActionConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseAction(structuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNode(structuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNode(structuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElement(structuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContent(structuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElement(structuralFeatureActionConfiguration);
				if (result == null) result = caseElementConfiguration(structuralFeatureActionConfiguration);
				if (result == null) result = caseElement(structuralFeatureActionConfiguration);
				if (result == null) result = caseEModelElement(structuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.WRITE_VARIABLE_ACTION_CONFIGURATION: {
				WriteVariableActionConfiguration writeVariableActionConfiguration = (WriteVariableActionConfiguration)theEObject;
				T result = caseWriteVariableActionConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseWriteVariableAction(writeVariableActionConfiguration);
				if (result == null) result = caseVariableActionConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseVariableAction(writeVariableActionConfiguration);
				if (result == null) result = caseActionConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseAction(writeVariableActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseExecutableNode(writeVariableActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseActivityNode(writeVariableActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseRedefinableElement(writeVariableActionConfiguration);
				if (result == null) result = caseActivityContent(writeVariableActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseNamedElement(writeVariableActionConfiguration);
				if (result == null) result = caseElementConfiguration(writeVariableActionConfiguration);
				if (result == null) result = caseElement(writeVariableActionConfiguration);
				if (result == null) result = caseEModelElement(writeVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACCEPT_CALL_ACTION_CONFIGURATION: {
				AcceptCallActionConfiguration acceptCallActionConfiguration = (AcceptCallActionConfiguration)theEObject;
				T result = caseAcceptCallActionConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseAcceptCallAction(acceptCallActionConfiguration);
				if (result == null) result = caseAcceptEventActionConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseAcceptEventAction(acceptCallActionConfiguration);
				if (result == null) result = caseActionConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseAction(acceptCallActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseExecutableNode(acceptCallActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseActivityNode(acceptCallActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseRedefinableElement(acceptCallActionConfiguration);
				if (result == null) result = caseActivityContent(acceptCallActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseNamedElement(acceptCallActionConfiguration);
				if (result == null) result = caseElementConfiguration(acceptCallActionConfiguration);
				if (result == null) result = caseElement(acceptCallActionConfiguration);
				if (result == null) result = caseEModelElement(acceptCallActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACCEPT_EVENT_ACTION_CONFIGURATION: {
				AcceptEventActionConfiguration acceptEventActionConfiguration = (AcceptEventActionConfiguration)theEObject;
				T result = caseAcceptEventActionConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseAcceptEventAction(acceptEventActionConfiguration);
				if (result == null) result = caseActionConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseAction(acceptEventActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseExecutableNode(acceptEventActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseActivityNode(acceptEventActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseRedefinableElement(acceptEventActionConfiguration);
				if (result == null) result = caseActivityContent(acceptEventActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseNamedElement(acceptEventActionConfiguration);
				if (result == null) result = caseElementConfiguration(acceptEventActionConfiguration);
				if (result == null) result = caseElement(acceptEventActionConfiguration);
				if (result == null) result = caseEModelElement(acceptEventActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTION_INPUT_PIN_CONFIGURATION: {
				ActionInputPinConfiguration actionInputPinConfiguration = (ActionInputPinConfiguration)theEObject;
				T result = caseActionInputPinConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseActionInputPin(actionInputPinConfiguration);
				if (result == null) result = caseInputPinConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseInputPin(actionInputPinConfiguration);
				if (result == null) result = casePinConfiguration(actionInputPinConfiguration);
				if (result == null) result = casePin(actionInputPinConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseObjectNode(actionInputPinConfiguration);
				if (result == null) result = caseMultiplicityElement(actionInputPinConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseTypedElementConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseActivityNode(actionInputPinConfiguration);
				if (result == null) result = caseTypedElement(actionInputPinConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseActivityContentConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseRedefinableElement(actionInputPinConfiguration);
				if (result == null) result = caseActivityContent(actionInputPinConfiguration);
				if (result == null) result = caseNamedElementConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseNamedElement(actionInputPinConfiguration);
				if (result == null) result = caseElementConfiguration(actionInputPinConfiguration);
				if (result == null) result = caseElement(actionInputPinConfiguration);
				if (result == null) result = caseEModelElement(actionInputPinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: {
				AddStructuralFeatureValueActionConfiguration addStructuralFeatureValueActionConfiguration = (AddStructuralFeatureValueActionConfiguration)theEObject;
				T result = caseAddStructuralFeatureValueActionConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseAddStructuralFeatureValueAction(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseWriteStructuralFeatureActionConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseWriteStructuralFeatureAction(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseStructuralFeatureActionConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActionConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseAction(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseExecutableNode(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityNode(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseRedefinableElement(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityContent(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseNamedElement(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseElementConfiguration(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseElement(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseEModelElement(addStructuralFeatureValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ADD_VARIABLE_VALUE_ACTION_CONFIGURATION: {
				AddVariableValueActionConfiguration addVariableValueActionConfiguration = (AddVariableValueActionConfiguration)theEObject;
				T result = caseAddVariableValueActionConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseAddVariableValueAction(addVariableValueActionConfiguration);
				if (result == null) result = caseWriteVariableActionConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseWriteVariableAction(addVariableValueActionConfiguration);
				if (result == null) result = caseVariableActionConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseVariableAction(addVariableValueActionConfiguration);
				if (result == null) result = caseActionConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseAction(addVariableValueActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseExecutableNode(addVariableValueActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseActivityNode(addVariableValueActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseRedefinableElement(addVariableValueActionConfiguration);
				if (result == null) result = caseActivityContent(addVariableValueActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseNamedElement(addVariableValueActionConfiguration);
				if (result == null) result = caseElementConfiguration(addVariableValueActionConfiguration);
				if (result == null) result = caseElement(addVariableValueActionConfiguration);
				if (result == null) result = caseEModelElement(addVariableValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.BROADCAST_SIGNAL_ACTION_CONFIGURATION: {
				BroadcastSignalActionConfiguration broadcastSignalActionConfiguration = (BroadcastSignalActionConfiguration)theEObject;
				T result = caseBroadcastSignalActionConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseBroadcastSignalAction(broadcastSignalActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseInvocationAction(broadcastSignalActionConfiguration);
				if (result == null) result = caseActionConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseAction(broadcastSignalActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseExecutableNode(broadcastSignalActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseActivityNode(broadcastSignalActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseRedefinableElement(broadcastSignalActionConfiguration);
				if (result == null) result = caseActivityContent(broadcastSignalActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseNamedElement(broadcastSignalActionConfiguration);
				if (result == null) result = caseElementConfiguration(broadcastSignalActionConfiguration);
				if (result == null) result = caseElement(broadcastSignalActionConfiguration);
				if (result == null) result = caseEModelElement(broadcastSignalActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INVOCATION_ACTION_CONFIGURATION: {
				InvocationActionConfiguration invocationActionConfiguration = (InvocationActionConfiguration)theEObject;
				T result = caseInvocationActionConfiguration(invocationActionConfiguration);
				if (result == null) result = caseInvocationAction(invocationActionConfiguration);
				if (result == null) result = caseActionConfiguration(invocationActionConfiguration);
				if (result == null) result = caseAction(invocationActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(invocationActionConfiguration);
				if (result == null) result = caseExecutableNode(invocationActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(invocationActionConfiguration);
				if (result == null) result = caseActivityNode(invocationActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(invocationActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(invocationActionConfiguration);
				if (result == null) result = caseRedefinableElement(invocationActionConfiguration);
				if (result == null) result = caseActivityContent(invocationActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(invocationActionConfiguration);
				if (result == null) result = caseNamedElement(invocationActionConfiguration);
				if (result == null) result = caseElementConfiguration(invocationActionConfiguration);
				if (result == null) result = caseElement(invocationActionConfiguration);
				if (result == null) result = caseEModelElement(invocationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CALL_ACTION_CONFIGURATION: {
				CallActionConfiguration callActionConfiguration = (CallActionConfiguration)theEObject;
				T result = caseCallActionConfiguration(callActionConfiguration);
				if (result == null) result = caseCallAction(callActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(callActionConfiguration);
				if (result == null) result = caseInvocationAction(callActionConfiguration);
				if (result == null) result = caseActionConfiguration(callActionConfiguration);
				if (result == null) result = caseAction(callActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(callActionConfiguration);
				if (result == null) result = caseExecutableNode(callActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(callActionConfiguration);
				if (result == null) result = caseActivityNode(callActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(callActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(callActionConfiguration);
				if (result == null) result = caseRedefinableElement(callActionConfiguration);
				if (result == null) result = caseActivityContent(callActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(callActionConfiguration);
				if (result == null) result = caseNamedElement(callActionConfiguration);
				if (result == null) result = caseElementConfiguration(callActionConfiguration);
				if (result == null) result = caseElement(callActionConfiguration);
				if (result == null) result = caseEModelElement(callActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CALL_BEHAVIOR_ACTION_CONFIGURATION: {
				CallBehaviorActionConfiguration callBehaviorActionConfiguration = (CallBehaviorActionConfiguration)theEObject;
				T result = caseCallBehaviorActionConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseCallBehaviorAction(callBehaviorActionConfiguration);
				if (result == null) result = caseCallActionConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseCallAction(callBehaviorActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseInvocationAction(callBehaviorActionConfiguration);
				if (result == null) result = caseActionConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseAction(callBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNode(callBehaviorActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseActivityNode(callBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElement(callBehaviorActionConfiguration);
				if (result == null) result = caseActivityContent(callBehaviorActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseNamedElement(callBehaviorActionConfiguration);
				if (result == null) result = caseElementConfiguration(callBehaviorActionConfiguration);
				if (result == null) result = caseElement(callBehaviorActionConfiguration);
				if (result == null) result = caseEModelElement(callBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CALL_OPERATION_ACTION_CONFIGURATION: {
				CallOperationActionConfiguration callOperationActionConfiguration = (CallOperationActionConfiguration)theEObject;
				T result = caseCallOperationActionConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseCallOperationAction(callOperationActionConfiguration);
				if (result == null) result = caseCallActionConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseCallAction(callOperationActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseInvocationAction(callOperationActionConfiguration);
				if (result == null) result = caseActionConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseAction(callOperationActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseExecutableNode(callOperationActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseActivityNode(callOperationActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseRedefinableElement(callOperationActionConfiguration);
				if (result == null) result = caseActivityContent(callOperationActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseNamedElement(callOperationActionConfiguration);
				if (result == null) result = caseElementConfiguration(callOperationActionConfiguration);
				if (result == null) result = caseElement(callOperationActionConfiguration);
				if (result == null) result = caseEModelElement(callOperationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLAUSE_CONFIGURATION: {
				ClauseConfiguration clauseConfiguration = (ClauseConfiguration)theEObject;
				T result = caseClauseConfiguration(clauseConfiguration);
				if (result == null) result = caseClause(clauseConfiguration);
				if (result == null) result = caseElementConfiguration(clauseConfiguration);
				if (result == null) result = caseElement(clauseConfiguration);
				if (result == null) result = caseEModelElement(clauseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLEAR_ASSOCIATION_ACTION_CONFIGURATION: {
				ClearAssociationActionConfiguration clearAssociationActionConfiguration = (ClearAssociationActionConfiguration)theEObject;
				T result = caseClearAssociationActionConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseClearAssociationAction(clearAssociationActionConfiguration);
				if (result == null) result = caseActionConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseAction(clearAssociationActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseExecutableNode(clearAssociationActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseActivityNode(clearAssociationActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseRedefinableElement(clearAssociationActionConfiguration);
				if (result == null) result = caseActivityContent(clearAssociationActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseNamedElement(clearAssociationActionConfiguration);
				if (result == null) result = caseElementConfiguration(clearAssociationActionConfiguration);
				if (result == null) result = caseElement(clearAssociationActionConfiguration);
				if (result == null) result = caseEModelElement(clearAssociationActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLEAR_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				ClearStructuralFeatureActionConfiguration clearStructuralFeatureActionConfiguration = (ClearStructuralFeatureActionConfiguration)theEObject;
				T result = caseClearStructuralFeatureActionConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseClearStructuralFeatureAction(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureActionConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseActionConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseAction(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNode(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNode(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElement(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContent(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElement(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseElementConfiguration(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseElement(clearStructuralFeatureActionConfiguration);
				if (result == null) result = caseEModelElement(clearStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CLEAR_VARIABLE_ACTION_CONFIGURATION: {
				ClearVariableActionConfiguration clearVariableActionConfiguration = (ClearVariableActionConfiguration)theEObject;
				T result = caseClearVariableActionConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseClearVariableAction(clearVariableActionConfiguration);
				if (result == null) result = caseVariableActionConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseVariableAction(clearVariableActionConfiguration);
				if (result == null) result = caseActionConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseAction(clearVariableActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseExecutableNode(clearVariableActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseActivityNode(clearVariableActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseRedefinableElement(clearVariableActionConfiguration);
				if (result == null) result = caseActivityContent(clearVariableActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseNamedElement(clearVariableActionConfiguration);
				if (result == null) result = caseElementConfiguration(clearVariableActionConfiguration);
				if (result == null) result = caseElement(clearVariableActionConfiguration);
				if (result == null) result = caseEModelElement(clearVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONDITIONAL_NODE_CONFIGURATION: {
				ConditionalNodeConfiguration conditionalNodeConfiguration = (ConditionalNodeConfiguration)theEObject;
				T result = caseConditionalNodeConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseConditionalNode(conditionalNodeConfiguration);
				if (result == null) result = caseStructuredActivityNodeConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseStructuredActivityNode(conditionalNodeConfiguration);
				if (result == null) result = caseActionConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseAction(conditionalNodeConfiguration);
				if (result == null) result = caseNamespace(conditionalNodeConfiguration);
				if (result == null) result = caseActivityGroup(conditionalNodeConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseExecutableNode(conditionalNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseActivityNode(conditionalNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseRedefinableElement(conditionalNodeConfiguration);
				if (result == null) result = caseActivityContent(conditionalNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseNamedElement(conditionalNodeConfiguration);
				if (result == null) result = caseElementConfiguration(conditionalNodeConfiguration);
				if (result == null) result = caseElement(conditionalNodeConfiguration);
				if (result == null) result = caseEModelElement(conditionalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CREATE_LINK_ACTION_CONFIGURATION: {
				CreateLinkActionConfiguration createLinkActionConfiguration = (CreateLinkActionConfiguration)theEObject;
				T result = caseCreateLinkActionConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseCreateLinkAction(createLinkActionConfiguration);
				if (result == null) result = caseWriteLinkActionConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseWriteLinkAction(createLinkActionConfiguration);
				if (result == null) result = caseLinkActionConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseLinkAction(createLinkActionConfiguration);
				if (result == null) result = caseActionConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseAction(createLinkActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseExecutableNode(createLinkActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseActivityNode(createLinkActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseRedefinableElement(createLinkActionConfiguration);
				if (result == null) result = caseActivityContent(createLinkActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseNamedElement(createLinkActionConfiguration);
				if (result == null) result = caseElementConfiguration(createLinkActionConfiguration);
				if (result == null) result = caseElement(createLinkActionConfiguration);
				if (result == null) result = caseEModelElement(createLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LINK_END_CREATION_DATA_CONFIGURATION: {
				LinkEndCreationDataConfiguration linkEndCreationDataConfiguration = (LinkEndCreationDataConfiguration)theEObject;
				T result = caseLinkEndCreationDataConfiguration(linkEndCreationDataConfiguration);
				if (result == null) result = caseLinkEndCreationData(linkEndCreationDataConfiguration);
				if (result == null) result = caseLinkEndDataConfiguration(linkEndCreationDataConfiguration);
				if (result == null) result = caseLinkEndData(linkEndCreationDataConfiguration);
				if (result == null) result = caseElementConfiguration(linkEndCreationDataConfiguration);
				if (result == null) result = caseElement(linkEndCreationDataConfiguration);
				if (result == null) result = caseEModelElement(linkEndCreationDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CREATE_LINK_OBJECT_ACTION_CONFIGURATION: {
				CreateLinkObjectActionConfiguration createLinkObjectActionConfiguration = (CreateLinkObjectActionConfiguration)theEObject;
				T result = caseCreateLinkObjectActionConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseCreateLinkObjectAction(createLinkObjectActionConfiguration);
				if (result == null) result = caseCreateLinkActionConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseCreateLinkAction(createLinkObjectActionConfiguration);
				if (result == null) result = caseWriteLinkActionConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseWriteLinkAction(createLinkObjectActionConfiguration);
				if (result == null) result = caseLinkActionConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseLinkAction(createLinkObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseAction(createLinkObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(createLinkObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseActivityNode(createLinkObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(createLinkObjectActionConfiguration);
				if (result == null) result = caseActivityContent(createLinkObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseNamedElement(createLinkObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(createLinkObjectActionConfiguration);
				if (result == null) result = caseElement(createLinkObjectActionConfiguration);
				if (result == null) result = caseEModelElement(createLinkObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CREATE_OBJECT_ACTION_CONFIGURATION: {
				CreateObjectActionConfiguration createObjectActionConfiguration = (CreateObjectActionConfiguration)theEObject;
				T result = caseCreateObjectActionConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseCreateObjectAction(createObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseAction(createObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(createObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseActivityNode(createObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(createObjectActionConfiguration);
				if (result == null) result = caseActivityContent(createObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseNamedElement(createObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(createObjectActionConfiguration);
				if (result == null) result = caseElement(createObjectActionConfiguration);
				if (result == null) result = caseEModelElement(createObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DESTROY_LINK_ACTION_CONFIGURATION: {
				DestroyLinkActionConfiguration destroyLinkActionConfiguration = (DestroyLinkActionConfiguration)theEObject;
				T result = caseDestroyLinkActionConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseDestroyLinkAction(destroyLinkActionConfiguration);
				if (result == null) result = caseWriteLinkActionConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseWriteLinkAction(destroyLinkActionConfiguration);
				if (result == null) result = caseLinkActionConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseLinkAction(destroyLinkActionConfiguration);
				if (result == null) result = caseActionConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseAction(destroyLinkActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseExecutableNode(destroyLinkActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseActivityNode(destroyLinkActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseRedefinableElement(destroyLinkActionConfiguration);
				if (result == null) result = caseActivityContent(destroyLinkActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseNamedElement(destroyLinkActionConfiguration);
				if (result == null) result = caseElementConfiguration(destroyLinkActionConfiguration);
				if (result == null) result = caseElement(destroyLinkActionConfiguration);
				if (result == null) result = caseEModelElement(destroyLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LINK_END_DESTRUCTION_DATA_CONFIGURATION: {
				LinkEndDestructionDataConfiguration linkEndDestructionDataConfiguration = (LinkEndDestructionDataConfiguration)theEObject;
				T result = caseLinkEndDestructionDataConfiguration(linkEndDestructionDataConfiguration);
				if (result == null) result = caseLinkEndDestructionData(linkEndDestructionDataConfiguration);
				if (result == null) result = caseLinkEndDataConfiguration(linkEndDestructionDataConfiguration);
				if (result == null) result = caseLinkEndData(linkEndDestructionDataConfiguration);
				if (result == null) result = caseElementConfiguration(linkEndDestructionDataConfiguration);
				if (result == null) result = caseElement(linkEndDestructionDataConfiguration);
				if (result == null) result = caseEModelElement(linkEndDestructionDataConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DESTROY_OBJECT_ACTION_CONFIGURATION: {
				DestroyObjectActionConfiguration destroyObjectActionConfiguration = (DestroyObjectActionConfiguration)theEObject;
				T result = caseDestroyObjectActionConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseDestroyObjectAction(destroyObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseAction(destroyObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(destroyObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseActivityNode(destroyObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(destroyObjectActionConfiguration);
				if (result == null) result = caseActivityContent(destroyObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseNamedElement(destroyObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(destroyObjectActionConfiguration);
				if (result == null) result = caseElement(destroyObjectActionConfiguration);
				if (result == null) result = caseEModelElement(destroyObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXPANSION_NODE_CONFIGURATION: {
				ExpansionNodeConfiguration expansionNodeConfiguration = (ExpansionNodeConfiguration)theEObject;
				T result = caseExpansionNodeConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseExpansionNode(expansionNodeConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseObjectNode(expansionNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseTypedElementConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseActivityNode(expansionNodeConfiguration);
				if (result == null) result = caseTypedElement(expansionNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseRedefinableElement(expansionNodeConfiguration);
				if (result == null) result = caseActivityContent(expansionNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseNamedElement(expansionNodeConfiguration);
				if (result == null) result = caseElementConfiguration(expansionNodeConfiguration);
				if (result == null) result = caseElement(expansionNodeConfiguration);
				if (result == null) result = caseEModelElement(expansionNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXPANSION_REGION_CONFIGURATION: {
				ExpansionRegionConfiguration expansionRegionConfiguration = (ExpansionRegionConfiguration)theEObject;
				T result = caseExpansionRegionConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseExpansionRegion(expansionRegionConfiguration);
				if (result == null) result = caseStructuredActivityNodeConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseStructuredActivityNode(expansionRegionConfiguration);
				if (result == null) result = caseActionConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseAction(expansionRegionConfiguration);
				if (result == null) result = caseNamespace(expansionRegionConfiguration);
				if (result == null) result = caseActivityGroup(expansionRegionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseExecutableNode(expansionRegionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseActivityNode(expansionRegionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseRedefinableElement(expansionRegionConfiguration);
				if (result == null) result = caseActivityContent(expansionRegionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseNamedElement(expansionRegionConfiguration);
				if (result == null) result = caseElementConfiguration(expansionRegionConfiguration);
				if (result == null) result = caseElement(expansionRegionConfiguration);
				if (result == null) result = caseEModelElement(expansionRegionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LOOP_NODE_CONFIGURATION: {
				LoopNodeConfiguration loopNodeConfiguration = (LoopNodeConfiguration)theEObject;
				T result = caseLoopNodeConfiguration(loopNodeConfiguration);
				if (result == null) result = caseLoopNode(loopNodeConfiguration);
				if (result == null) result = caseStructuredActivityNodeConfiguration(loopNodeConfiguration);
				if (result == null) result = caseStructuredActivityNode(loopNodeConfiguration);
				if (result == null) result = caseActionConfiguration(loopNodeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(loopNodeConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(loopNodeConfiguration);
				if (result == null) result = caseAction(loopNodeConfiguration);
				if (result == null) result = caseNamespace(loopNodeConfiguration);
				if (result == null) result = caseActivityGroup(loopNodeConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(loopNodeConfiguration);
				if (result == null) result = caseExecutableNode(loopNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(loopNodeConfiguration);
				if (result == null) result = caseActivityNode(loopNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(loopNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(loopNodeConfiguration);
				if (result == null) result = caseRedefinableElement(loopNodeConfiguration);
				if (result == null) result = caseActivityContent(loopNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(loopNodeConfiguration);
				if (result == null) result = caseNamedElement(loopNodeConfiguration);
				if (result == null) result = caseElementConfiguration(loopNodeConfiguration);
				if (result == null) result = caseElement(loopNodeConfiguration);
				if (result == null) result = caseEModelElement(loopNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OPAQUE_ACTION_CONFIGURATION: {
				OpaqueActionConfiguration opaqueActionConfiguration = (OpaqueActionConfiguration)theEObject;
				T result = caseOpaqueActionConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseOpaqueAction(opaqueActionConfiguration);
				if (result == null) result = caseActionConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseAction(opaqueActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseExecutableNode(opaqueActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseActivityNode(opaqueActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseRedefinableElement(opaqueActionConfiguration);
				if (result == null) result = caseActivityContent(opaqueActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseNamedElement(opaqueActionConfiguration);
				if (result == null) result = caseElementConfiguration(opaqueActionConfiguration);
				if (result == null) result = caseElement(opaqueActionConfiguration);
				if (result == null) result = caseEModelElement(opaqueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.RAISE_EXCEPTION_ACTION_CONFIGURATION: {
				RaiseExceptionActionConfiguration raiseExceptionActionConfiguration = (RaiseExceptionActionConfiguration)theEObject;
				T result = caseRaiseExceptionActionConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseRaiseExceptionAction(raiseExceptionActionConfiguration);
				if (result == null) result = caseActionConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseAction(raiseExceptionActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseExecutableNode(raiseExceptionActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseActivityNode(raiseExceptionActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseRedefinableElement(raiseExceptionActionConfiguration);
				if (result == null) result = caseActivityContent(raiseExceptionActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseNamedElement(raiseExceptionActionConfiguration);
				if (result == null) result = caseElementConfiguration(raiseExceptionActionConfiguration);
				if (result == null) result = caseElement(raiseExceptionActionConfiguration);
				if (result == null) result = caseEModelElement(raiseExceptionActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_EXTENT_ACTION_CONFIGURATION: {
				ReadExtentActionConfiguration readExtentActionConfiguration = (ReadExtentActionConfiguration)theEObject;
				T result = caseReadExtentActionConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseReadExtentAction(readExtentActionConfiguration);
				if (result == null) result = caseActionConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseAction(readExtentActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseExecutableNode(readExtentActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseActivityNode(readExtentActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseRedefinableElement(readExtentActionConfiguration);
				if (result == null) result = caseActivityContent(readExtentActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseNamedElement(readExtentActionConfiguration);
				if (result == null) result = caseElementConfiguration(readExtentActionConfiguration);
				if (result == null) result = caseElement(readExtentActionConfiguration);
				if (result == null) result = caseEModelElement(readExtentActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_IS_CLASSIFIED_OBJECT_ACTION_CONFIGURATION: {
				ReadIsClassifiedObjectActionConfiguration readIsClassifiedObjectActionConfiguration = (ReadIsClassifiedObjectActionConfiguration)theEObject;
				T result = caseReadIsClassifiedObjectActionConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseReadIsClassifiedObjectAction(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseAction(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseActivityNode(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseActivityContent(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseNamedElement(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseElement(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = caseEModelElement(readIsClassifiedObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_LINK_ACTION_CONFIGURATION: {
				ReadLinkActionConfiguration readLinkActionConfiguration = (ReadLinkActionConfiguration)theEObject;
				T result = caseReadLinkActionConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseReadLinkAction(readLinkActionConfiguration);
				if (result == null) result = caseLinkActionConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseLinkAction(readLinkActionConfiguration);
				if (result == null) result = caseActionConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseAction(readLinkActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseExecutableNode(readLinkActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseActivityNode(readLinkActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseRedefinableElement(readLinkActionConfiguration);
				if (result == null) result = caseActivityContent(readLinkActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseNamedElement(readLinkActionConfiguration);
				if (result == null) result = caseElementConfiguration(readLinkActionConfiguration);
				if (result == null) result = caseElement(readLinkActionConfiguration);
				if (result == null) result = caseEModelElement(readLinkActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_LINK_OBJECT_END_ACTION_CONFIGURATION: {
				ReadLinkObjectEndActionConfiguration readLinkObjectEndActionConfiguration = (ReadLinkObjectEndActionConfiguration)theEObject;
				T result = caseReadLinkObjectEndActionConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseReadLinkObjectEndAction(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseActionConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseAction(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseExecutableNode(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseActivityNode(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseActivityContent(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseNamedElement(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseElementConfiguration(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseElement(readLinkObjectEndActionConfiguration);
				if (result == null) result = caseEModelElement(readLinkObjectEndActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION_CONFIGURATION: {
				ReadLinkObjectEndQualifierActionConfiguration readLinkObjectEndQualifierActionConfiguration = (ReadLinkObjectEndQualifierActionConfiguration)theEObject;
				T result = caseReadLinkObjectEndQualifierActionConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseActionConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseAction(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseExecutableNode(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseActivityNode(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseActivityContent(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseNamedElement(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseElementConfiguration(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseElement(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = caseEModelElement(readLinkObjectEndQualifierActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_SELF_ACTION_CONFIGURATION: {
				ReadSelfActionConfiguration readSelfActionConfiguration = (ReadSelfActionConfiguration)theEObject;
				T result = caseReadSelfActionConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseReadSelfAction(readSelfActionConfiguration);
				if (result == null) result = caseActionConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseAction(readSelfActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseExecutableNode(readSelfActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseActivityNode(readSelfActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseRedefinableElement(readSelfActionConfiguration);
				if (result == null) result = caseActivityContent(readSelfActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseNamedElement(readSelfActionConfiguration);
				if (result == null) result = caseElementConfiguration(readSelfActionConfiguration);
				if (result == null) result = caseElement(readSelfActionConfiguration);
				if (result == null) result = caseEModelElement(readSelfActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_STRUCTURAL_FEATURE_ACTION_CONFIGURATION: {
				ReadStructuralFeatureActionConfiguration readStructuralFeatureActionConfiguration = (ReadStructuralFeatureActionConfiguration)theEObject;
				T result = caseReadStructuralFeatureActionConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseReadStructuralFeatureAction(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureActionConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseActionConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseAction(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseExecutableNode(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityNode(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseRedefinableElement(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseActivityContent(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseNamedElement(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseElementConfiguration(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseElement(readStructuralFeatureActionConfiguration);
				if (result == null) result = caseEModelElement(readStructuralFeatureActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.READ_VARIABLE_ACTION_CONFIGURATION: {
				ReadVariableActionConfiguration readVariableActionConfiguration = (ReadVariableActionConfiguration)theEObject;
				T result = caseReadVariableActionConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseReadVariableAction(readVariableActionConfiguration);
				if (result == null) result = caseVariableActionConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseVariableAction(readVariableActionConfiguration);
				if (result == null) result = caseActionConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseAction(readVariableActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseExecutableNode(readVariableActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseActivityNode(readVariableActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseRedefinableElement(readVariableActionConfiguration);
				if (result == null) result = caseActivityContent(readVariableActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseNamedElement(readVariableActionConfiguration);
				if (result == null) result = caseElementConfiguration(readVariableActionConfiguration);
				if (result == null) result = caseElement(readVariableActionConfiguration);
				if (result == null) result = caseEModelElement(readVariableActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.RECLASSIFY_OBJECT_ACTION_CONFIGURATION: {
				ReclassifyObjectActionConfiguration reclassifyObjectActionConfiguration = (ReclassifyObjectActionConfiguration)theEObject;
				T result = caseReclassifyObjectActionConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseReclassifyObjectAction(reclassifyObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseAction(reclassifyObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(reclassifyObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseActivityNode(reclassifyObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(reclassifyObjectActionConfiguration);
				if (result == null) result = caseActivityContent(reclassifyObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseNamedElement(reclassifyObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(reclassifyObjectActionConfiguration);
				if (result == null) result = caseElement(reclassifyObjectActionConfiguration);
				if (result == null) result = caseEModelElement(reclassifyObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REDUCE_ACTION_CONFIGURATION: {
				ReduceActionConfiguration reduceActionConfiguration = (ReduceActionConfiguration)theEObject;
				T result = caseReduceActionConfiguration(reduceActionConfiguration);
				if (result == null) result = caseReduceAction(reduceActionConfiguration);
				if (result == null) result = caseActionConfiguration(reduceActionConfiguration);
				if (result == null) result = caseAction(reduceActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(reduceActionConfiguration);
				if (result == null) result = caseExecutableNode(reduceActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(reduceActionConfiguration);
				if (result == null) result = caseActivityNode(reduceActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(reduceActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(reduceActionConfiguration);
				if (result == null) result = caseRedefinableElement(reduceActionConfiguration);
				if (result == null) result = caseActivityContent(reduceActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(reduceActionConfiguration);
				if (result == null) result = caseNamedElement(reduceActionConfiguration);
				if (result == null) result = caseElementConfiguration(reduceActionConfiguration);
				if (result == null) result = caseElement(reduceActionConfiguration);
				if (result == null) result = caseEModelElement(reduceActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_CONFIGURATION: {
				RemoveStructuralFeatureValueActionConfiguration removeStructuralFeatureValueActionConfiguration = (RemoveStructuralFeatureValueActionConfiguration)theEObject;
				T result = caseRemoveStructuralFeatureValueActionConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseRemoveStructuralFeatureValueAction(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseWriteStructuralFeatureActionConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseWriteStructuralFeatureAction(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseStructuralFeatureActionConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseStructuralFeatureAction(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActionConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseAction(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseExecutableNode(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityNode(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseRedefinableElement(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseActivityContent(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseNamedElement(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseElementConfiguration(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseElement(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = caseEModelElement(removeStructuralFeatureValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REMOVE_VARIABLE_VALUE_ACTION_CONFIGURATION: {
				RemoveVariableValueActionConfiguration removeVariableValueActionConfiguration = (RemoveVariableValueActionConfiguration)theEObject;
				T result = caseRemoveVariableValueActionConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseRemoveVariableValueAction(removeVariableValueActionConfiguration);
				if (result == null) result = caseWriteVariableActionConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseWriteVariableAction(removeVariableValueActionConfiguration);
				if (result == null) result = caseVariableActionConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseVariableAction(removeVariableValueActionConfiguration);
				if (result == null) result = caseActionConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseAction(removeVariableValueActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseExecutableNode(removeVariableValueActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseActivityNode(removeVariableValueActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseRedefinableElement(removeVariableValueActionConfiguration);
				if (result == null) result = caseActivityContent(removeVariableValueActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseNamedElement(removeVariableValueActionConfiguration);
				if (result == null) result = caseElementConfiguration(removeVariableValueActionConfiguration);
				if (result == null) result = caseElement(removeVariableValueActionConfiguration);
				if (result == null) result = caseEModelElement(removeVariableValueActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.REPLY_ACTION_CONFIGURATION: {
				ReplyActionConfiguration replyActionConfiguration = (ReplyActionConfiguration)theEObject;
				T result = caseReplyActionConfiguration(replyActionConfiguration);
				if (result == null) result = caseReplyAction(replyActionConfiguration);
				if (result == null) result = caseActionConfiguration(replyActionConfiguration);
				if (result == null) result = caseAction(replyActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(replyActionConfiguration);
				if (result == null) result = caseExecutableNode(replyActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(replyActionConfiguration);
				if (result == null) result = caseActivityNode(replyActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(replyActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(replyActionConfiguration);
				if (result == null) result = caseRedefinableElement(replyActionConfiguration);
				if (result == null) result = caseActivityContent(replyActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(replyActionConfiguration);
				if (result == null) result = caseNamedElement(replyActionConfiguration);
				if (result == null) result = caseElementConfiguration(replyActionConfiguration);
				if (result == null) result = caseElement(replyActionConfiguration);
				if (result == null) result = caseEModelElement(replyActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SEND_OBJECT_ACTION_CONFIGURATION: {
				SendObjectActionConfiguration sendObjectActionConfiguration = (SendObjectActionConfiguration)theEObject;
				T result = caseSendObjectActionConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseSendObjectAction(sendObjectActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseInvocationAction(sendObjectActionConfiguration);
				if (result == null) result = caseActionConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseAction(sendObjectActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseExecutableNode(sendObjectActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseActivityNode(sendObjectActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseRedefinableElement(sendObjectActionConfiguration);
				if (result == null) result = caseActivityContent(sendObjectActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseNamedElement(sendObjectActionConfiguration);
				if (result == null) result = caseElementConfiguration(sendObjectActionConfiguration);
				if (result == null) result = caseElement(sendObjectActionConfiguration);
				if (result == null) result = caseEModelElement(sendObjectActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SEND_SIGNAL_ACTION_CONFIGURATION: {
				SendSignalActionConfiguration sendSignalActionConfiguration = (SendSignalActionConfiguration)theEObject;
				T result = caseSendSignalActionConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseSendSignalAction(sendSignalActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseInvocationAction(sendSignalActionConfiguration);
				if (result == null) result = caseActionConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseAction(sendSignalActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseExecutableNode(sendSignalActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseActivityNode(sendSignalActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseRedefinableElement(sendSignalActionConfiguration);
				if (result == null) result = caseActivityContent(sendSignalActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseNamedElement(sendSignalActionConfiguration);
				if (result == null) result = caseElementConfiguration(sendSignalActionConfiguration);
				if (result == null) result = caseElement(sendSignalActionConfiguration);
				if (result == null) result = caseEModelElement(sendSignalActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SEQUENCE_NODE_CONFIGURATION: {
				SequenceNodeConfiguration sequenceNodeConfiguration = (SequenceNodeConfiguration)theEObject;
				T result = caseSequenceNodeConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseSequenceNode(sequenceNodeConfiguration);
				if (result == null) result = caseStructuredActivityNodeConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseStructuredActivityNode(sequenceNodeConfiguration);
				if (result == null) result = caseActionConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseActivityGroupConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseAction(sequenceNodeConfiguration);
				if (result == null) result = caseNamespace(sequenceNodeConfiguration);
				if (result == null) result = caseActivityGroup(sequenceNodeConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseExecutableNode(sequenceNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseActivityNode(sequenceNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseRedefinableElement(sequenceNodeConfiguration);
				if (result == null) result = caseActivityContent(sequenceNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseNamedElement(sequenceNodeConfiguration);
				if (result == null) result = caseElementConfiguration(sequenceNodeConfiguration);
				if (result == null) result = caseElement(sequenceNodeConfiguration);
				if (result == null) result = caseEModelElement(sequenceNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.START_CLASSIFIER_BEHAVIOR_ACTION_CONFIGURATION: {
				StartClassifierBehaviorActionConfiguration startClassifierBehaviorActionConfiguration = (StartClassifierBehaviorActionConfiguration)theEObject;
				T result = caseStartClassifierBehaviorActionConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseStartClassifierBehaviorAction(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseActionConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseAction(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNode(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseActivityNode(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElement(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseActivityContent(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseNamedElement(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseElementConfiguration(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseElement(startClassifierBehaviorActionConfiguration);
				if (result == null) result = caseEModelElement(startClassifierBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.START_OBJECT_BEHAVIOR_ACTION_CONFIGURATION: {
				StartObjectBehaviorActionConfiguration startObjectBehaviorActionConfiguration = (StartObjectBehaviorActionConfiguration)theEObject;
				T result = caseStartObjectBehaviorActionConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseStartObjectBehaviorAction(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseCallActionConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseCallAction(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseInvocationActionConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseInvocationAction(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseActionConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseAction(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseExecutableNode(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseActivityNode(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseRedefinableElement(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseActivityContent(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseNamedElement(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseElementConfiguration(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseElement(startObjectBehaviorActionConfiguration);
				if (result == null) result = caseEModelElement(startObjectBehaviorActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TEST_IDENTITY_ACTION_CONFIGURATION: {
				TestIdentityActionConfiguration testIdentityActionConfiguration = (TestIdentityActionConfiguration)theEObject;
				T result = caseTestIdentityActionConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseTestIdentityAction(testIdentityActionConfiguration);
				if (result == null) result = caseActionConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseAction(testIdentityActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseExecutableNode(testIdentityActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseActivityNode(testIdentityActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseRedefinableElement(testIdentityActionConfiguration);
				if (result == null) result = caseActivityContent(testIdentityActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseNamedElement(testIdentityActionConfiguration);
				if (result == null) result = caseElementConfiguration(testIdentityActionConfiguration);
				if (result == null) result = caseElement(testIdentityActionConfiguration);
				if (result == null) result = caseEModelElement(testIdentityActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.UNMARSHALL_ACTION_CONFIGURATION: {
				UnmarshallActionConfiguration unmarshallActionConfiguration = (UnmarshallActionConfiguration)theEObject;
				T result = caseUnmarshallActionConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseUnmarshallAction(unmarshallActionConfiguration);
				if (result == null) result = caseActionConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseAction(unmarshallActionConfiguration);
				if (result == null) result = caseExecutableNodeConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseExecutableNode(unmarshallActionConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseActivityNode(unmarshallActionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseActivityContentConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseRedefinableElement(unmarshallActionConfiguration);
				if (result == null) result = caseActivityContent(unmarshallActionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseNamedElement(unmarshallActionConfiguration);
				if (result == null) result = caseElementConfiguration(unmarshallActionConfiguration);
				if (result == null) result = caseElement(unmarshallActionConfiguration);
				if (result == null) result = caseEModelElement(unmarshallActionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.VALUE_PIN_CONFIGURATION: {
				ValuePinConfiguration valuePinConfiguration = (ValuePinConfiguration)theEObject;
				T result = caseValuePinConfiguration(valuePinConfiguration);
				if (result == null) result = caseValuePin(valuePinConfiguration);
				if (result == null) result = caseInputPinConfiguration(valuePinConfiguration);
				if (result == null) result = caseInputPin(valuePinConfiguration);
				if (result == null) result = casePinConfiguration(valuePinConfiguration);
				if (result == null) result = casePin(valuePinConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(valuePinConfiguration);
				if (result == null) result = caseMultiplicityElementConfiguration(valuePinConfiguration);
				if (result == null) result = caseObjectNode(valuePinConfiguration);
				if (result == null) result = caseMultiplicityElement(valuePinConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(valuePinConfiguration);
				if (result == null) result = caseTypedElementConfiguration(valuePinConfiguration);
				if (result == null) result = caseActivityNode(valuePinConfiguration);
				if (result == null) result = caseTypedElement(valuePinConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(valuePinConfiguration);
				if (result == null) result = caseActivityContentConfiguration(valuePinConfiguration);
				if (result == null) result = caseRedefinableElement(valuePinConfiguration);
				if (result == null) result = caseActivityContent(valuePinConfiguration);
				if (result == null) result = caseNamedElementConfiguration(valuePinConfiguration);
				if (result == null) result = caseNamedElement(valuePinConfiguration);
				if (result == null) result = caseElementConfiguration(valuePinConfiguration);
				if (result == null) result = caseElement(valuePinConfiguration);
				if (result == null) result = caseEModelElement(valuePinConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_FINAL_NODE_CONFIGURATION: {
				ActivityFinalNodeConfiguration activityFinalNodeConfiguration = (ActivityFinalNodeConfiguration)theEObject;
				T result = caseActivityFinalNodeConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseActivityFinalNode(activityFinalNodeConfiguration);
				if (result == null) result = caseFinalNodeConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseFinalNode(activityFinalNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseControlNode(activityFinalNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseActivityNode(activityFinalNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseRedefinableElement(activityFinalNodeConfiguration);
				if (result == null) result = caseActivityContent(activityFinalNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseNamedElement(activityFinalNodeConfiguration);
				if (result == null) result = caseElementConfiguration(activityFinalNodeConfiguration);
				if (result == null) result = caseElement(activityFinalNodeConfiguration);
				if (result == null) result = caseEModelElement(activityFinalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FINAL_NODE_CONFIGURATION: {
				FinalNodeConfiguration finalNodeConfiguration = (FinalNodeConfiguration)theEObject;
				T result = caseFinalNodeConfiguration(finalNodeConfiguration);
				if (result == null) result = caseFinalNode(finalNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(finalNodeConfiguration);
				if (result == null) result = caseControlNode(finalNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(finalNodeConfiguration);
				if (result == null) result = caseActivityNode(finalNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(finalNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(finalNodeConfiguration);
				if (result == null) result = caseRedefinableElement(finalNodeConfiguration);
				if (result == null) result = caseActivityContent(finalNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(finalNodeConfiguration);
				if (result == null) result = caseNamedElement(finalNodeConfiguration);
				if (result == null) result = caseElementConfiguration(finalNodeConfiguration);
				if (result == null) result = caseElement(finalNodeConfiguration);
				if (result == null) result = caseEModelElement(finalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONTROL_NODE_CONFIGURATION: {
				ControlNodeConfiguration controlNodeConfiguration = (ControlNodeConfiguration)theEObject;
				T result = caseControlNodeConfiguration(controlNodeConfiguration);
				if (result == null) result = caseControlNode(controlNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(controlNodeConfiguration);
				if (result == null) result = caseActivityNode(controlNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(controlNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(controlNodeConfiguration);
				if (result == null) result = caseRedefinableElement(controlNodeConfiguration);
				if (result == null) result = caseActivityContent(controlNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(controlNodeConfiguration);
				if (result == null) result = caseNamedElement(controlNodeConfiguration);
				if (result == null) result = caseElementConfiguration(controlNodeConfiguration);
				if (result == null) result = caseElement(controlNodeConfiguration);
				if (result == null) result = caseEModelElement(controlNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTIVITY_PARAMETER_NODE_CONFIGURATION: {
				ActivityParameterNodeConfiguration activityParameterNodeConfiguration = (ActivityParameterNodeConfiguration)theEObject;
				T result = caseActivityParameterNodeConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseActivityParameterNode(activityParameterNodeConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseObjectNode(activityParameterNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseTypedElementConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseActivityNode(activityParameterNodeConfiguration);
				if (result == null) result = caseTypedElement(activityParameterNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseRedefinableElement(activityParameterNodeConfiguration);
				if (result == null) result = caseActivityContent(activityParameterNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseNamedElement(activityParameterNodeConfiguration);
				if (result == null) result = caseElementConfiguration(activityParameterNodeConfiguration);
				if (result == null) result = caseElement(activityParameterNodeConfiguration);
				if (result == null) result = caseEModelElement(activityParameterNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CENTRAL_BUFFER_NODE_CONFIGURATION: {
				CentralBufferNodeConfiguration centralBufferNodeConfiguration = (CentralBufferNodeConfiguration)theEObject;
				T result = caseCentralBufferNodeConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseCentralBufferNode(centralBufferNodeConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseObjectNode(centralBufferNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseTypedElementConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseActivityNode(centralBufferNodeConfiguration);
				if (result == null) result = caseTypedElement(centralBufferNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseRedefinableElement(centralBufferNodeConfiguration);
				if (result == null) result = caseActivityContent(centralBufferNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseNamedElement(centralBufferNodeConfiguration);
				if (result == null) result = caseElementConfiguration(centralBufferNodeConfiguration);
				if (result == null) result = caseElement(centralBufferNodeConfiguration);
				if (result == null) result = caseEModelElement(centralBufferNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONTROL_FLOW_CONFIGURATION: {
				ControlFlowConfiguration controlFlowConfiguration = (ControlFlowConfiguration)theEObject;
				T result = caseControlFlowConfiguration(controlFlowConfiguration);
				if (result == null) result = caseControlFlow(controlFlowConfiguration);
				if (result == null) result = caseActivityEdgeConfiguration(controlFlowConfiguration);
				if (result == null) result = caseActivityEdge(controlFlowConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(controlFlowConfiguration);
				if (result == null) result = caseRedefinableElement(controlFlowConfiguration);
				if (result == null) result = caseNamedElementConfiguration(controlFlowConfiguration);
				if (result == null) result = caseNamedElement(controlFlowConfiguration);
				if (result == null) result = caseElementConfiguration(controlFlowConfiguration);
				if (result == null) result = caseElement(controlFlowConfiguration);
				if (result == null) result = caseEModelElement(controlFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DATA_STORE_NODE_CONFIGURATION: {
				DataStoreNodeConfiguration dataStoreNodeConfiguration = (DataStoreNodeConfiguration)theEObject;
				T result = caseDataStoreNodeConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseDataStoreNode(dataStoreNodeConfiguration);
				if (result == null) result = caseCentralBufferNodeConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseCentralBufferNode(dataStoreNodeConfiguration);
				if (result == null) result = caseObjectNodeConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseObjectNode(dataStoreNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseTypedElementConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseActivityNode(dataStoreNodeConfiguration);
				if (result == null) result = caseTypedElement(dataStoreNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseRedefinableElement(dataStoreNodeConfiguration);
				if (result == null) result = caseActivityContent(dataStoreNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseNamedElement(dataStoreNodeConfiguration);
				if (result == null) result = caseElementConfiguration(dataStoreNodeConfiguration);
				if (result == null) result = caseElement(dataStoreNodeConfiguration);
				if (result == null) result = caseEModelElement(dataStoreNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DECISION_NODE_CONFIGURATION: {
				DecisionNodeConfiguration decisionNodeConfiguration = (DecisionNodeConfiguration)theEObject;
				T result = caseDecisionNodeConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseDecisionNode(decisionNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseControlNode(decisionNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseActivityNode(decisionNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseRedefinableElement(decisionNodeConfiguration);
				if (result == null) result = caseActivityContent(decisionNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseNamedElement(decisionNodeConfiguration);
				if (result == null) result = caseElementConfiguration(decisionNodeConfiguration);
				if (result == null) result = caseElement(decisionNodeConfiguration);
				if (result == null) result = caseEModelElement(decisionNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OBJECT_FLOW_CONFIGURATION: {
				ObjectFlowConfiguration objectFlowConfiguration = (ObjectFlowConfiguration)theEObject;
				T result = caseObjectFlowConfiguration(objectFlowConfiguration);
				if (result == null) result = caseObjectFlow(objectFlowConfiguration);
				if (result == null) result = caseActivityEdgeConfiguration(objectFlowConfiguration);
				if (result == null) result = caseActivityEdge(objectFlowConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(objectFlowConfiguration);
				if (result == null) result = caseRedefinableElement(objectFlowConfiguration);
				if (result == null) result = caseNamedElementConfiguration(objectFlowConfiguration);
				if (result == null) result = caseNamedElement(objectFlowConfiguration);
				if (result == null) result = caseElementConfiguration(objectFlowConfiguration);
				if (result == null) result = caseElement(objectFlowConfiguration);
				if (result == null) result = caseEModelElement(objectFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FLOW_FINAL_NODE_CONFIGURATION: {
				FlowFinalNodeConfiguration flowFinalNodeConfiguration = (FlowFinalNodeConfiguration)theEObject;
				T result = caseFlowFinalNodeConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseFlowFinalNode(flowFinalNodeConfiguration);
				if (result == null) result = caseFinalNodeConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseFinalNode(flowFinalNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseControlNode(flowFinalNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseActivityNode(flowFinalNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseRedefinableElement(flowFinalNodeConfiguration);
				if (result == null) result = caseActivityContent(flowFinalNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseNamedElement(flowFinalNodeConfiguration);
				if (result == null) result = caseElementConfiguration(flowFinalNodeConfiguration);
				if (result == null) result = caseElement(flowFinalNodeConfiguration);
				if (result == null) result = caseEModelElement(flowFinalNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FORK_NODE_CONFIGURATION: {
				ForkNodeConfiguration forkNodeConfiguration = (ForkNodeConfiguration)theEObject;
				T result = caseForkNodeConfiguration(forkNodeConfiguration);
				if (result == null) result = caseForkNode(forkNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(forkNodeConfiguration);
				if (result == null) result = caseControlNode(forkNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(forkNodeConfiguration);
				if (result == null) result = caseActivityNode(forkNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(forkNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(forkNodeConfiguration);
				if (result == null) result = caseRedefinableElement(forkNodeConfiguration);
				if (result == null) result = caseActivityContent(forkNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(forkNodeConfiguration);
				if (result == null) result = caseNamedElement(forkNodeConfiguration);
				if (result == null) result = caseElementConfiguration(forkNodeConfiguration);
				if (result == null) result = caseElement(forkNodeConfiguration);
				if (result == null) result = caseEModelElement(forkNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INITIAL_NODE_CONFIGURATION: {
				InitialNodeConfiguration initialNodeConfiguration = (InitialNodeConfiguration)theEObject;
				T result = caseInitialNodeConfiguration(initialNodeConfiguration);
				if (result == null) result = caseInitialNode(initialNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(initialNodeConfiguration);
				if (result == null) result = caseControlNode(initialNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(initialNodeConfiguration);
				if (result == null) result = caseActivityNode(initialNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(initialNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(initialNodeConfiguration);
				if (result == null) result = caseRedefinableElement(initialNodeConfiguration);
				if (result == null) result = caseActivityContent(initialNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(initialNodeConfiguration);
				if (result == null) result = caseNamedElement(initialNodeConfiguration);
				if (result == null) result = caseElementConfiguration(initialNodeConfiguration);
				if (result == null) result = caseElement(initialNodeConfiguration);
				if (result == null) result = caseEModelElement(initialNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.JOIN_NODE_CONFIGURATION: {
				JoinNodeConfiguration joinNodeConfiguration = (JoinNodeConfiguration)theEObject;
				T result = caseJoinNodeConfiguration(joinNodeConfiguration);
				if (result == null) result = caseJoinNode(joinNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(joinNodeConfiguration);
				if (result == null) result = caseControlNode(joinNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(joinNodeConfiguration);
				if (result == null) result = caseActivityNode(joinNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(joinNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(joinNodeConfiguration);
				if (result == null) result = caseRedefinableElement(joinNodeConfiguration);
				if (result == null) result = caseActivityContent(joinNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(joinNodeConfiguration);
				if (result == null) result = caseNamedElement(joinNodeConfiguration);
				if (result == null) result = caseElementConfiguration(joinNodeConfiguration);
				if (result == null) result = caseElement(joinNodeConfiguration);
				if (result == null) result = caseEModelElement(joinNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MERGE_NODE_CONFIGURATION: {
				MergeNodeConfiguration mergeNodeConfiguration = (MergeNodeConfiguration)theEObject;
				T result = caseMergeNodeConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseMergeNode(mergeNodeConfiguration);
				if (result == null) result = caseControlNodeConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseControlNode(mergeNodeConfiguration);
				if (result == null) result = caseActivityNodeConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseActivityNode(mergeNodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseActivityContentConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseRedefinableElement(mergeNodeConfiguration);
				if (result == null) result = caseActivityContent(mergeNodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseNamedElement(mergeNodeConfiguration);
				if (result == null) result = caseElementConfiguration(mergeNodeConfiguration);
				if (result == null) result = caseElement(mergeNodeConfiguration);
				if (result == null) result = caseEModelElement(mergeNodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INSTANCE_VALUE_CONFIGURATION: {
				InstanceValueConfiguration instanceValueConfiguration = (InstanceValueConfiguration)theEObject;
				T result = caseInstanceValueConfiguration(instanceValueConfiguration);
				if (result == null) result = caseInstanceValue(instanceValueConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(instanceValueConfiguration);
				if (result == null) result = caseValueSpecification(instanceValueConfiguration);
				if (result == null) result = casePackageableElementConfiguration(instanceValueConfiguration);
				if (result == null) result = caseTypedElementConfiguration(instanceValueConfiguration);
				if (result == null) result = casePackageableElement(instanceValueConfiguration);
				if (result == null) result = caseTypedElement(instanceValueConfiguration);
				if (result == null) result = caseNamedElementConfiguration(instanceValueConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(instanceValueConfiguration);
				if (result == null) result = caseNamedElement(instanceValueConfiguration);
				if (result == null) result = caseParameterableElement(instanceValueConfiguration);
				if (result == null) result = caseElementConfiguration(instanceValueConfiguration);
				if (result == null) result = caseElement(instanceValueConfiguration);
				if (result == null) result = caseEModelElement(instanceValueConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ANY_RECEIVE_EVENT_CONFIGURATION: {
				AnyReceiveEventConfiguration anyReceiveEventConfiguration = (AnyReceiveEventConfiguration)theEObject;
				T result = caseAnyReceiveEventConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseAnyReceiveEvent(anyReceiveEventConfiguration);
				if (result == null) result = caseMessageEventConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseMessageEvent(anyReceiveEventConfiguration);
				if (result == null) result = caseEventConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseEvent(anyReceiveEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = casePackageableElement(anyReceiveEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseNamedElement(anyReceiveEventConfiguration);
				if (result == null) result = caseParameterableElement(anyReceiveEventConfiguration);
				if (result == null) result = caseElementConfiguration(anyReceiveEventConfiguration);
				if (result == null) result = caseElement(anyReceiveEventConfiguration);
				if (result == null) result = caseEModelElement(anyReceiveEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MESSAGE_EVENT_CONFIGURATION: {
				MessageEventConfiguration messageEventConfiguration = (MessageEventConfiguration)theEObject;
				T result = caseMessageEventConfiguration(messageEventConfiguration);
				if (result == null) result = caseMessageEvent(messageEventConfiguration);
				if (result == null) result = caseEventConfiguration(messageEventConfiguration);
				if (result == null) result = caseEvent(messageEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(messageEventConfiguration);
				if (result == null) result = casePackageableElement(messageEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(messageEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(messageEventConfiguration);
				if (result == null) result = caseNamedElement(messageEventConfiguration);
				if (result == null) result = caseParameterableElement(messageEventConfiguration);
				if (result == null) result = caseElementConfiguration(messageEventConfiguration);
				if (result == null) result = caseElement(messageEventConfiguration);
				if (result == null) result = caseEModelElement(messageEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CALL_EVENT_CONFIGURATION: {
				CallEventConfiguration callEventConfiguration = (CallEventConfiguration)theEObject;
				T result = caseCallEventConfiguration(callEventConfiguration);
				if (result == null) result = caseCallEvent(callEventConfiguration);
				if (result == null) result = caseMessageEventConfiguration(callEventConfiguration);
				if (result == null) result = caseMessageEvent(callEventConfiguration);
				if (result == null) result = caseEventConfiguration(callEventConfiguration);
				if (result == null) result = caseEvent(callEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(callEventConfiguration);
				if (result == null) result = casePackageableElement(callEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(callEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(callEventConfiguration);
				if (result == null) result = caseNamedElement(callEventConfiguration);
				if (result == null) result = caseParameterableElement(callEventConfiguration);
				if (result == null) result = caseElementConfiguration(callEventConfiguration);
				if (result == null) result = caseElement(callEventConfiguration);
				if (result == null) result = caseEModelElement(callEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CHANGE_EVENT_CONFIGURATION: {
				ChangeEventConfiguration changeEventConfiguration = (ChangeEventConfiguration)theEObject;
				T result = caseChangeEventConfiguration(changeEventConfiguration);
				if (result == null) result = caseChangeEvent(changeEventConfiguration);
				if (result == null) result = caseEventConfiguration(changeEventConfiguration);
				if (result == null) result = caseEvent(changeEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(changeEventConfiguration);
				if (result == null) result = casePackageableElement(changeEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(changeEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(changeEventConfiguration);
				if (result == null) result = caseNamedElement(changeEventConfiguration);
				if (result == null) result = caseParameterableElement(changeEventConfiguration);
				if (result == null) result = caseElementConfiguration(changeEventConfiguration);
				if (result == null) result = caseElement(changeEventConfiguration);
				if (result == null) result = caseEModelElement(changeEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FUNCTION_BEHAVIOR_CONFIGURATION: {
				FunctionBehaviorConfiguration functionBehaviorConfiguration = (FunctionBehaviorConfiguration)theEObject;
				T result = caseFunctionBehaviorConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseFunctionBehavior(functionBehaviorConfiguration);
				if (result == null) result = caseOpaqueBehaviorConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseOpaqueBehavior(functionBehaviorConfiguration);
				if (result == null) result = caseBehaviorConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseBehavior(functionBehaviorConfiguration);
				if (result == null) result = caseClassConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseClass(functionBehaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(functionBehaviorConfiguration);
				if (result == null) result = caseBehavioredClassifier(functionBehaviorConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseStructuredClassifier(functionBehaviorConfiguration);
				if (result == null) result = caseClassifierConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseClassifier(functionBehaviorConfiguration);
				if (result == null) result = caseNamespaceConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseTypeConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseNamespace(functionBehaviorConfiguration);
				if (result == null) result = caseRedefinableElement(functionBehaviorConfiguration);
				if (result == null) result = caseType(functionBehaviorConfiguration);
				if (result == null) result = caseTemplateableElement(functionBehaviorConfiguration);
				if (result == null) result = casePackageableElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = casePackageableElement(functionBehaviorConfiguration);
				if (result == null) result = caseNamedElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseNamedElement(functionBehaviorConfiguration);
				if (result == null) result = caseParameterableElement(functionBehaviorConfiguration);
				if (result == null) result = caseElementConfiguration(functionBehaviorConfiguration);
				if (result == null) result = caseElement(functionBehaviorConfiguration);
				if (result == null) result = caseEModelElement(functionBehaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OPAQUE_BEHAVIOR_CONFIGURATION: {
				OpaqueBehaviorConfiguration opaqueBehaviorConfiguration = (OpaqueBehaviorConfiguration)theEObject;
				T result = caseOpaqueBehaviorConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseOpaqueBehavior(opaqueBehaviorConfiguration);
				if (result == null) result = caseBehaviorConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseBehavior(opaqueBehaviorConfiguration);
				if (result == null) result = caseClassConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseClass(opaqueBehaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(opaqueBehaviorConfiguration);
				if (result == null) result = caseBehavioredClassifier(opaqueBehaviorConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseStructuredClassifier(opaqueBehaviorConfiguration);
				if (result == null) result = caseClassifierConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseClassifier(opaqueBehaviorConfiguration);
				if (result == null) result = caseNamespaceConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseTypeConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseNamespace(opaqueBehaviorConfiguration);
				if (result == null) result = caseRedefinableElement(opaqueBehaviorConfiguration);
				if (result == null) result = caseType(opaqueBehaviorConfiguration);
				if (result == null) result = caseTemplateableElement(opaqueBehaviorConfiguration);
				if (result == null) result = casePackageableElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = casePackageableElement(opaqueBehaviorConfiguration);
				if (result == null) result = caseNamedElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseNamedElement(opaqueBehaviorConfiguration);
				if (result == null) result = caseParameterableElement(opaqueBehaviorConfiguration);
				if (result == null) result = caseElementConfiguration(opaqueBehaviorConfiguration);
				if (result == null) result = caseElement(opaqueBehaviorConfiguration);
				if (result == null) result = caseEModelElement(opaqueBehaviorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.SIGNAL_EVENT_CONFIGURATION: {
				SignalEventConfiguration signalEventConfiguration = (SignalEventConfiguration)theEObject;
				T result = caseSignalEventConfiguration(signalEventConfiguration);
				if (result == null) result = caseSignalEvent(signalEventConfiguration);
				if (result == null) result = caseMessageEventConfiguration(signalEventConfiguration);
				if (result == null) result = caseMessageEvent(signalEventConfiguration);
				if (result == null) result = caseEventConfiguration(signalEventConfiguration);
				if (result == null) result = caseEvent(signalEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(signalEventConfiguration);
				if (result == null) result = casePackageableElement(signalEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(signalEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(signalEventConfiguration);
				if (result == null) result = caseNamedElement(signalEventConfiguration);
				if (result == null) result = caseParameterableElement(signalEventConfiguration);
				if (result == null) result = caseElementConfiguration(signalEventConfiguration);
				if (result == null) result = caseElement(signalEventConfiguration);
				if (result == null) result = caseEModelElement(signalEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TIME_EVENT_CONFIGURATION: {
				TimeEventConfiguration timeEventConfiguration = (TimeEventConfiguration)theEObject;
				T result = caseTimeEventConfiguration(timeEventConfiguration);
				if (result == null) result = caseTimeEvent(timeEventConfiguration);
				if (result == null) result = caseEventConfiguration(timeEventConfiguration);
				if (result == null) result = caseEvent(timeEventConfiguration);
				if (result == null) result = casePackageableElementConfiguration(timeEventConfiguration);
				if (result == null) result = casePackageableElement(timeEventConfiguration);
				if (result == null) result = caseNamedElementConfiguration(timeEventConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(timeEventConfiguration);
				if (result == null) result = caseNamedElement(timeEventConfiguration);
				if (result == null) result = caseParameterableElement(timeEventConfiguration);
				if (result == null) result = caseElementConfiguration(timeEventConfiguration);
				if (result == null) result = caseElement(timeEventConfiguration);
				if (result == null) result = caseEModelElement(timeEventConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TIME_EXPRESSION_CONFIGURATION: {
				TimeExpressionConfiguration timeExpressionConfiguration = (TimeExpressionConfiguration)theEObject;
				T result = caseTimeExpressionConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseTimeExpression(timeExpressionConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseValueSpecification(timeExpressionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseTypedElementConfiguration(timeExpressionConfiguration);
				if (result == null) result = casePackageableElement(timeExpressionConfiguration);
				if (result == null) result = caseTypedElement(timeExpressionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseNamedElement(timeExpressionConfiguration);
				if (result == null) result = caseParameterableElement(timeExpressionConfiguration);
				if (result == null) result = caseElementConfiguration(timeExpressionConfiguration);
				if (result == null) result = caseElement(timeExpressionConfiguration);
				if (result == null) result = caseEModelElement(timeExpressionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OBSERVATION_CONFIGURATION: {
				ObservationConfiguration observationConfiguration = (ObservationConfiguration)theEObject;
				T result = caseObservationConfiguration(observationConfiguration);
				if (result == null) result = caseObservation(observationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(observationConfiguration);
				if (result == null) result = casePackageableElement(observationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(observationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(observationConfiguration);
				if (result == null) result = caseNamedElement(observationConfiguration);
				if (result == null) result = caseParameterableElement(observationConfiguration);
				if (result == null) result = caseElementConfiguration(observationConfiguration);
				if (result == null) result = caseElement(observationConfiguration);
				if (result == null) result = caseEModelElement(observationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COMMUNICATION_PATH_CONFIGURATION: {
				CommunicationPathConfiguration communicationPathConfiguration = (CommunicationPathConfiguration)theEObject;
				T result = caseCommunicationPathConfiguration(communicationPathConfiguration);
				if (result == null) result = caseCommunicationPath(communicationPathConfiguration);
				if (result == null) result = caseAssociationConfiguration(communicationPathConfiguration);
				if (result == null) result = caseAssociation(communicationPathConfiguration);
				if (result == null) result = caseClassifierConfiguration(communicationPathConfiguration);
				if (result == null) result = caseRelationshipConfiguration(communicationPathConfiguration);
				if (result == null) result = caseClassifier(communicationPathConfiguration);
				if (result == null) result = caseRelationship(communicationPathConfiguration);
				if (result == null) result = caseNamespaceConfiguration(communicationPathConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(communicationPathConfiguration);
				if (result == null) result = caseTypeConfiguration(communicationPathConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(communicationPathConfiguration);
				if (result == null) result = caseNamespace(communicationPathConfiguration);
				if (result == null) result = caseRedefinableElement(communicationPathConfiguration);
				if (result == null) result = caseType(communicationPathConfiguration);
				if (result == null) result = caseTemplateableElement(communicationPathConfiguration);
				if (result == null) result = casePackageableElementConfiguration(communicationPathConfiguration);
				if (result == null) result = casePackageableElement(communicationPathConfiguration);
				if (result == null) result = caseNamedElementConfiguration(communicationPathConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(communicationPathConfiguration);
				if (result == null) result = caseNamedElement(communicationPathConfiguration);
				if (result == null) result = caseParameterableElement(communicationPathConfiguration);
				if (result == null) result = caseElementConfiguration(communicationPathConfiguration);
				if (result == null) result = caseElement(communicationPathConfiguration);
				if (result == null) result = caseEModelElement(communicationPathConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DEVICE_CONFIGURATION: {
				DeviceConfiguration deviceConfiguration = (DeviceConfiguration)theEObject;
				T result = caseDeviceConfiguration(deviceConfiguration);
				if (result == null) result = caseDevice(deviceConfiguration);
				if (result == null) result = caseNodeConfiguration(deviceConfiguration);
				if (result == null) result = caseNode(deviceConfiguration);
				if (result == null) result = caseClassConfiguration(deviceConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(deviceConfiguration);
				if (result == null) result = caseClass(deviceConfiguration);
				if (result == null) result = caseDeploymentTarget(deviceConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(deviceConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(deviceConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(deviceConfiguration);
				if (result == null) result = caseBehavioredClassifier(deviceConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(deviceConfiguration);
				if (result == null) result = caseStructuredClassifier(deviceConfiguration);
				if (result == null) result = caseClassifierConfiguration(deviceConfiguration);
				if (result == null) result = caseClassifier(deviceConfiguration);
				if (result == null) result = caseNamespaceConfiguration(deviceConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(deviceConfiguration);
				if (result == null) result = caseTypeConfiguration(deviceConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(deviceConfiguration);
				if (result == null) result = caseNamespace(deviceConfiguration);
				if (result == null) result = caseRedefinableElement(deviceConfiguration);
				if (result == null) result = caseType(deviceConfiguration);
				if (result == null) result = caseTemplateableElement(deviceConfiguration);
				if (result == null) result = casePackageableElementConfiguration(deviceConfiguration);
				if (result == null) result = casePackageableElement(deviceConfiguration);
				if (result == null) result = caseNamedElementConfiguration(deviceConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(deviceConfiguration);
				if (result == null) result = caseNamedElement(deviceConfiguration);
				if (result == null) result = caseParameterableElement(deviceConfiguration);
				if (result == null) result = caseElementConfiguration(deviceConfiguration);
				if (result == null) result = caseElement(deviceConfiguration);
				if (result == null) result = caseEModelElement(deviceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.NODE_CONFIGURATION: {
				NodeConfiguration nodeConfiguration = (NodeConfiguration)theEObject;
				T result = caseNodeConfiguration(nodeConfiguration);
				if (result == null) result = caseNode(nodeConfiguration);
				if (result == null) result = caseClassConfiguration(nodeConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(nodeConfiguration);
				if (result == null) result = caseClass(nodeConfiguration);
				if (result == null) result = caseDeploymentTarget(nodeConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(nodeConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(nodeConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(nodeConfiguration);
				if (result == null) result = caseBehavioredClassifier(nodeConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(nodeConfiguration);
				if (result == null) result = caseStructuredClassifier(nodeConfiguration);
				if (result == null) result = caseClassifierConfiguration(nodeConfiguration);
				if (result == null) result = caseClassifier(nodeConfiguration);
				if (result == null) result = caseNamespaceConfiguration(nodeConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(nodeConfiguration);
				if (result == null) result = caseTypeConfiguration(nodeConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(nodeConfiguration);
				if (result == null) result = caseNamespace(nodeConfiguration);
				if (result == null) result = caseRedefinableElement(nodeConfiguration);
				if (result == null) result = caseType(nodeConfiguration);
				if (result == null) result = caseTemplateableElement(nodeConfiguration);
				if (result == null) result = casePackageableElementConfiguration(nodeConfiguration);
				if (result == null) result = casePackageableElement(nodeConfiguration);
				if (result == null) result = caseNamedElementConfiguration(nodeConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(nodeConfiguration);
				if (result == null) result = caseNamedElement(nodeConfiguration);
				if (result == null) result = caseParameterableElement(nodeConfiguration);
				if (result == null) result = caseElementConfiguration(nodeConfiguration);
				if (result == null) result = caseElement(nodeConfiguration);
				if (result == null) result = caseEModelElement(nodeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXECUTION_ENVIRONMENT_CONFIGURATION: {
				ExecutionEnvironmentConfiguration executionEnvironmentConfiguration = (ExecutionEnvironmentConfiguration)theEObject;
				T result = caseExecutionEnvironmentConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseExecutionEnvironment(executionEnvironmentConfiguration);
				if (result == null) result = caseNodeConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseNode(executionEnvironmentConfiguration);
				if (result == null) result = caseClassConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseDeploymentTargetConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseClass(executionEnvironmentConfiguration);
				if (result == null) result = caseDeploymentTarget(executionEnvironmentConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(executionEnvironmentConfiguration);
				if (result == null) result = caseBehavioredClassifier(executionEnvironmentConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseStructuredClassifier(executionEnvironmentConfiguration);
				if (result == null) result = caseClassifierConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseClassifier(executionEnvironmentConfiguration);
				if (result == null) result = caseNamespaceConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseTypeConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseNamespace(executionEnvironmentConfiguration);
				if (result == null) result = caseRedefinableElement(executionEnvironmentConfiguration);
				if (result == null) result = caseType(executionEnvironmentConfiguration);
				if (result == null) result = caseTemplateableElement(executionEnvironmentConfiguration);
				if (result == null) result = casePackageableElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = casePackageableElement(executionEnvironmentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseNamedElement(executionEnvironmentConfiguration);
				if (result == null) result = caseParameterableElement(executionEnvironmentConfiguration);
				if (result == null) result = caseElementConfiguration(executionEnvironmentConfiguration);
				if (result == null) result = caseElement(executionEnvironmentConfiguration);
				if (result == null) result = caseEModelElement(executionEnvironmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INFORMATION_FLOW_CONFIGURATION: {
				InformationFlowConfiguration informationFlowConfiguration = (InformationFlowConfiguration)theEObject;
				T result = caseInformationFlowConfiguration(informationFlowConfiguration);
				if (result == null) result = caseInformationFlow(informationFlowConfiguration);
				if (result == null) result = casePackageableElementConfiguration(informationFlowConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(informationFlowConfiguration);
				if (result == null) result = casePackageableElement(informationFlowConfiguration);
				if (result == null) result = caseDirectedRelationship(informationFlowConfiguration);
				if (result == null) result = caseNamedElementConfiguration(informationFlowConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(informationFlowConfiguration);
				if (result == null) result = caseRelationshipConfiguration(informationFlowConfiguration);
				if (result == null) result = caseNamedElement(informationFlowConfiguration);
				if (result == null) result = caseParameterableElement(informationFlowConfiguration);
				if (result == null) result = caseRelationship(informationFlowConfiguration);
				if (result == null) result = caseElementConfiguration(informationFlowConfiguration);
				if (result == null) result = caseElement(informationFlowConfiguration);
				if (result == null) result = caseEModelElement(informationFlowConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MESSAGE_CONFIGURATION: {
				MessageConfiguration messageConfiguration = (MessageConfiguration)theEObject;
				T result = caseMessageConfiguration(messageConfiguration);
				if (result == null) result = caseMessage(messageConfiguration);
				if (result == null) result = caseNamedElementConfiguration(messageConfiguration);
				if (result == null) result = caseNamedElement(messageConfiguration);
				if (result == null) result = caseElementConfiguration(messageConfiguration);
				if (result == null) result = caseElement(messageConfiguration);
				if (result == null) result = caseEModelElement(messageConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERACTION_CONFIGURATION: {
				InteractionConfiguration interactionConfiguration = (InteractionConfiguration)theEObject;
				T result = caseInteractionConfiguration(interactionConfiguration);
				if (result == null) result = caseInteraction(interactionConfiguration);
				if (result == null) result = caseBehaviorConfiguration(interactionConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(interactionConfiguration);
				if (result == null) result = caseBehavior(interactionConfiguration);
				if (result == null) result = caseInteractionFragment(interactionConfiguration);
				if (result == null) result = caseClassConfiguration(interactionConfiguration);
				if (result == null) result = caseClass(interactionConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(interactionConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(interactionConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(interactionConfiguration);
				if (result == null) result = caseBehavioredClassifier(interactionConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(interactionConfiguration);
				if (result == null) result = caseStructuredClassifier(interactionConfiguration);
				if (result == null) result = caseClassifierConfiguration(interactionConfiguration);
				if (result == null) result = caseClassifier(interactionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(interactionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(interactionConfiguration);
				if (result == null) result = caseTypeConfiguration(interactionConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(interactionConfiguration);
				if (result == null) result = caseNamespace(interactionConfiguration);
				if (result == null) result = caseRedefinableElement(interactionConfiguration);
				if (result == null) result = caseType(interactionConfiguration);
				if (result == null) result = caseTemplateableElement(interactionConfiguration);
				if (result == null) result = casePackageableElementConfiguration(interactionConfiguration);
				if (result == null) result = casePackageableElement(interactionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interactionConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(interactionConfiguration);
				if (result == null) result = caseNamedElement(interactionConfiguration);
				if (result == null) result = caseParameterableElement(interactionConfiguration);
				if (result == null) result = caseElementConfiguration(interactionConfiguration);
				if (result == null) result = caseElement(interactionConfiguration);
				if (result == null) result = caseEModelElement(interactionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERACTION_FRAGMENT_CONFIGURATION: {
				InteractionFragmentConfiguration interactionFragmentConfiguration = (InteractionFragmentConfiguration)theEObject;
				T result = caseInteractionFragmentConfiguration(interactionFragmentConfiguration);
				if (result == null) result = caseInteractionFragment(interactionFragmentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interactionFragmentConfiguration);
				if (result == null) result = caseNamedElement(interactionFragmentConfiguration);
				if (result == null) result = caseElementConfiguration(interactionFragmentConfiguration);
				if (result == null) result = caseElement(interactionFragmentConfiguration);
				if (result == null) result = caseEModelElement(interactionFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LIFELINE_CONFIGURATION: {
				LifelineConfiguration lifelineConfiguration = (LifelineConfiguration)theEObject;
				T result = caseLifelineConfiguration(lifelineConfiguration);
				if (result == null) result = caseLifeline(lifelineConfiguration);
				if (result == null) result = caseNamedElementConfiguration(lifelineConfiguration);
				if (result == null) result = caseNamedElement(lifelineConfiguration);
				if (result == null) result = caseElementConfiguration(lifelineConfiguration);
				if (result == null) result = caseElement(lifelineConfiguration);
				if (result == null) result = caseEModelElement(lifelineConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PART_DECOMPOSITION_CONFIGURATION: {
				PartDecompositionConfiguration partDecompositionConfiguration = (PartDecompositionConfiguration)theEObject;
				T result = casePartDecompositionConfiguration(partDecompositionConfiguration);
				if (result == null) result = casePartDecomposition(partDecompositionConfiguration);
				if (result == null) result = caseInteractionUseConfiguration(partDecompositionConfiguration);
				if (result == null) result = caseInteractionUse(partDecompositionConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(partDecompositionConfiguration);
				if (result == null) result = caseInteractionFragment(partDecompositionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(partDecompositionConfiguration);
				if (result == null) result = caseNamedElement(partDecompositionConfiguration);
				if (result == null) result = caseElementConfiguration(partDecompositionConfiguration);
				if (result == null) result = caseElement(partDecompositionConfiguration);
				if (result == null) result = caseEModelElement(partDecompositionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERACTION_USE_CONFIGURATION: {
				InteractionUseConfiguration interactionUseConfiguration = (InteractionUseConfiguration)theEObject;
				T result = caseInteractionUseConfiguration(interactionUseConfiguration);
				if (result == null) result = caseInteractionUse(interactionUseConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(interactionUseConfiguration);
				if (result == null) result = caseInteractionFragment(interactionUseConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interactionUseConfiguration);
				if (result == null) result = caseNamedElement(interactionUseConfiguration);
				if (result == null) result = caseElementConfiguration(interactionUseConfiguration);
				if (result == null) result = caseElement(interactionUseConfiguration);
				if (result == null) result = caseEModelElement(interactionUseConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.GATE_CONFIGURATION: {
				GateConfiguration gateConfiguration = (GateConfiguration)theEObject;
				T result = caseGateConfiguration(gateConfiguration);
				if (result == null) result = caseGate(gateConfiguration);
				if (result == null) result = caseMessageEndConfiguration(gateConfiguration);
				if (result == null) result = caseMessageEnd(gateConfiguration);
				if (result == null) result = caseNamedElementConfiguration(gateConfiguration);
				if (result == null) result = caseNamedElement(gateConfiguration);
				if (result == null) result = caseElementConfiguration(gateConfiguration);
				if (result == null) result = caseElement(gateConfiguration);
				if (result == null) result = caseEModelElement(gateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MESSAGE_END_CONFIGURATION: {
				MessageEndConfiguration messageEndConfiguration = (MessageEndConfiguration)theEObject;
				T result = caseMessageEndConfiguration(messageEndConfiguration);
				if (result == null) result = caseMessageEnd(messageEndConfiguration);
				if (result == null) result = caseNamedElementConfiguration(messageEndConfiguration);
				if (result == null) result = caseNamedElement(messageEndConfiguration);
				if (result == null) result = caseElementConfiguration(messageEndConfiguration);
				if (result == null) result = caseElement(messageEndConfiguration);
				if (result == null) result = caseEModelElement(messageEndConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERACTION_OPERAND_CONFIGURATION: {
				InteractionOperandConfiguration interactionOperandConfiguration = (InteractionOperandConfiguration)theEObject;
				T result = caseInteractionOperandConfiguration(interactionOperandConfiguration);
				if (result == null) result = caseInteractionOperand(interactionOperandConfiguration);
				if (result == null) result = caseNamespaceConfiguration(interactionOperandConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(interactionOperandConfiguration);
				if (result == null) result = caseNamespace(interactionOperandConfiguration);
				if (result == null) result = caseInteractionFragment(interactionOperandConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interactionOperandConfiguration);
				if (result == null) result = caseNamedElement(interactionOperandConfiguration);
				if (result == null) result = caseElementConfiguration(interactionOperandConfiguration);
				if (result == null) result = caseElement(interactionOperandConfiguration);
				if (result == null) result = caseEModelElement(interactionOperandConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERACTION_CONSTRAINT_CONFIGURATION: {
				InteractionConstraintConfiguration interactionConstraintConfiguration = (InteractionConstraintConfiguration)theEObject;
				T result = caseInteractionConstraintConfiguration(interactionConstraintConfiguration);
				if (result == null) result = caseInteractionConstraint(interactionConstraintConfiguration);
				if (result == null) result = caseConstraintConfiguration(interactionConstraintConfiguration);
				if (result == null) result = caseConstraint(interactionConstraintConfiguration);
				if (result == null) result = casePackageableElementConfiguration(interactionConstraintConfiguration);
				if (result == null) result = casePackageableElement(interactionConstraintConfiguration);
				if (result == null) result = caseNamedElementConfiguration(interactionConstraintConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(interactionConstraintConfiguration);
				if (result == null) result = caseNamedElement(interactionConstraintConfiguration);
				if (result == null) result = caseParameterableElement(interactionConstraintConfiguration);
				if (result == null) result = caseElementConfiguration(interactionConstraintConfiguration);
				if (result == null) result = caseElement(interactionConstraintConfiguration);
				if (result == null) result = caseEModelElement(interactionConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.GENERAL_ORDERING_CONFIGURATION: {
				GeneralOrderingConfiguration generalOrderingConfiguration = (GeneralOrderingConfiguration)theEObject;
				T result = caseGeneralOrderingConfiguration(generalOrderingConfiguration);
				if (result == null) result = caseGeneralOrdering(generalOrderingConfiguration);
				if (result == null) result = caseNamedElementConfiguration(generalOrderingConfiguration);
				if (result == null) result = caseNamedElement(generalOrderingConfiguration);
				if (result == null) result = caseElementConfiguration(generalOrderingConfiguration);
				if (result == null) result = caseElement(generalOrderingConfiguration);
				if (result == null) result = caseEModelElement(generalOrderingConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				OccurrenceSpecificationConfiguration occurrenceSpecificationConfiguration = (OccurrenceSpecificationConfiguration)theEObject;
				T result = caseOccurrenceSpecificationConfiguration(occurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecification(occurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(occurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(occurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(occurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElement(occurrenceSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(occurrenceSpecificationConfiguration);
				if (result == null) result = caseElement(occurrenceSpecificationConfiguration);
				if (result == null) result = caseEModelElement(occurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INFORMATION_ITEM_CONFIGURATION: {
				InformationItemConfiguration informationItemConfiguration = (InformationItemConfiguration)theEObject;
				T result = caseInformationItemConfiguration(informationItemConfiguration);
				if (result == null) result = caseInformationItem(informationItemConfiguration);
				if (result == null) result = caseClassifierConfiguration(informationItemConfiguration);
				if (result == null) result = caseClassifier(informationItemConfiguration);
				if (result == null) result = caseNamespaceConfiguration(informationItemConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(informationItemConfiguration);
				if (result == null) result = caseTypeConfiguration(informationItemConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(informationItemConfiguration);
				if (result == null) result = caseNamespace(informationItemConfiguration);
				if (result == null) result = caseRedefinableElement(informationItemConfiguration);
				if (result == null) result = caseType(informationItemConfiguration);
				if (result == null) result = caseTemplateableElement(informationItemConfiguration);
				if (result == null) result = casePackageableElementConfiguration(informationItemConfiguration);
				if (result == null) result = casePackageableElement(informationItemConfiguration);
				if (result == null) result = caseNamedElementConfiguration(informationItemConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(informationItemConfiguration);
				if (result == null) result = caseNamedElement(informationItemConfiguration);
				if (result == null) result = caseParameterableElement(informationItemConfiguration);
				if (result == null) result = caseElementConfiguration(informationItemConfiguration);
				if (result == null) result = caseElement(informationItemConfiguration);
				if (result == null) result = caseEModelElement(informationItemConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTION_EXECUTION_SPECIFICATION_CONFIGURATION: {
				ActionExecutionSpecificationConfiguration actionExecutionSpecificationConfiguration = (ActionExecutionSpecificationConfiguration)theEObject;
				T result = caseActionExecutionSpecificationConfiguration(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseActionExecutionSpecification(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseExecutionSpecificationConfiguration(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseExecutionSpecification(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseNamedElement(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseElement(actionExecutionSpecificationConfiguration);
				if (result == null) result = caseEModelElement(actionExecutionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXECUTION_SPECIFICATION_CONFIGURATION: {
				ExecutionSpecificationConfiguration executionSpecificationConfiguration = (ExecutionSpecificationConfiguration)theEObject;
				T result = caseExecutionSpecificationConfiguration(executionSpecificationConfiguration);
				if (result == null) result = caseExecutionSpecification(executionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(executionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(executionSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(executionSpecificationConfiguration);
				if (result == null) result = caseNamedElement(executionSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(executionSpecificationConfiguration);
				if (result == null) result = caseElement(executionSpecificationConfiguration);
				if (result == null) result = caseEModelElement(executionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.BEHAVIOR_EXECUTION_SPECIFICATION_CONFIGURATION: {
				BehaviorExecutionSpecificationConfiguration behaviorExecutionSpecificationConfiguration = (BehaviorExecutionSpecificationConfiguration)theEObject;
				T result = caseBehaviorExecutionSpecificationConfiguration(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseBehaviorExecutionSpecification(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseExecutionSpecificationConfiguration(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseExecutionSpecification(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseNamedElement(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseElement(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = caseEModelElement(behaviorExecutionSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COMBINED_FRAGMENT_CONFIGURATION: {
				CombinedFragmentConfiguration combinedFragmentConfiguration = (CombinedFragmentConfiguration)theEObject;
				T result = caseCombinedFragmentConfiguration(combinedFragmentConfiguration);
				if (result == null) result = caseCombinedFragment(combinedFragmentConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(combinedFragmentConfiguration);
				if (result == null) result = caseInteractionFragment(combinedFragmentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(combinedFragmentConfiguration);
				if (result == null) result = caseNamedElement(combinedFragmentConfiguration);
				if (result == null) result = caseElementConfiguration(combinedFragmentConfiguration);
				if (result == null) result = caseElement(combinedFragmentConfiguration);
				if (result == null) result = caseEModelElement(combinedFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONSIDER_IGNORE_FRAGMENT_CONFIGURATION: {
				ConsiderIgnoreFragmentConfiguration considerIgnoreFragmentConfiguration = (ConsiderIgnoreFragmentConfiguration)theEObject;
				T result = caseConsiderIgnoreFragmentConfiguration(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseConsiderIgnoreFragment(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseCombinedFragmentConfiguration(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseCombinedFragment(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseInteractionFragment(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseNamedElement(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseElementConfiguration(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseElement(considerIgnoreFragmentConfiguration);
				if (result == null) result = caseEModelElement(considerIgnoreFragmentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.CONTINUATION_CONFIGURATION: {
				ContinuationConfiguration continuationConfiguration = (ContinuationConfiguration)theEObject;
				T result = caseContinuationConfiguration(continuationConfiguration);
				if (result == null) result = caseContinuation(continuationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(continuationConfiguration);
				if (result == null) result = caseInteractionFragment(continuationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(continuationConfiguration);
				if (result == null) result = caseNamedElement(continuationConfiguration);
				if (result == null) result = caseElementConfiguration(continuationConfiguration);
				if (result == null) result = caseElement(continuationConfiguration);
				if (result == null) result = caseEModelElement(continuationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				DestructionOccurrenceSpecificationConfiguration destructionOccurrenceSpecificationConfiguration = (DestructionOccurrenceSpecificationConfiguration)theEObject;
				T result = caseDestructionOccurrenceSpecificationConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseDestructionOccurrenceSpecification(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageOccurrenceSpecificationConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageOccurrenceSpecification(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecificationConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageEndConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecification(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageEnd(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElement(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElement(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseEModelElement(destructionOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.MESSAGE_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				MessageOccurrenceSpecificationConfiguration messageOccurrenceSpecificationConfiguration = (MessageOccurrenceSpecificationConfiguration)theEObject;
				T result = caseMessageOccurrenceSpecificationConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageOccurrenceSpecification(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecificationConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageEndConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecification(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseMessageEnd(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElement(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElement(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = caseEModelElement(messageOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.EXECUTION_OCCURRENCE_SPECIFICATION_CONFIGURATION: {
				ExecutionOccurrenceSpecificationConfiguration executionOccurrenceSpecificationConfiguration = (ExecutionOccurrenceSpecificationConfiguration)theEObject;
				T result = caseExecutionOccurrenceSpecificationConfiguration(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecificationConfiguration(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseOccurrenceSpecification(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseInteractionFragment(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseNamedElement(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseElement(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = caseEModelElement(executionOccurrenceSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.STATE_INVARIANT_CONFIGURATION: {
				StateInvariantConfiguration stateInvariantConfiguration = (StateInvariantConfiguration)theEObject;
				T result = caseStateInvariantConfiguration(stateInvariantConfiguration);
				if (result == null) result = caseStateInvariant(stateInvariantConfiguration);
				if (result == null) result = caseInteractionFragmentConfiguration(stateInvariantConfiguration);
				if (result == null) result = caseInteractionFragment(stateInvariantConfiguration);
				if (result == null) result = caseNamedElementConfiguration(stateInvariantConfiguration);
				if (result == null) result = caseNamedElement(stateInvariantConfiguration);
				if (result == null) result = caseElementConfiguration(stateInvariantConfiguration);
				if (result == null) result = caseElement(stateInvariantConfiguration);
				if (result == null) result = caseEModelElement(stateInvariantConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.FINAL_STATE_CONFIGURATION: {
				FinalStateConfiguration finalStateConfiguration = (FinalStateConfiguration)theEObject;
				T result = caseFinalStateConfiguration(finalStateConfiguration);
				if (result == null) result = caseFinalState(finalStateConfiguration);
				if (result == null) result = caseStateConfiguration(finalStateConfiguration);
				if (result == null) result = caseState(finalStateConfiguration);
				if (result == null) result = caseNamespaceConfiguration(finalStateConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(finalStateConfiguration);
				if (result == null) result = caseVertexConfiguration(finalStateConfiguration);
				if (result == null) result = caseNamespace(finalStateConfiguration);
				if (result == null) result = caseRedefinableElement(finalStateConfiguration);
				if (result == null) result = caseVertex(finalStateConfiguration);
				if (result == null) result = caseNamedElementConfiguration(finalStateConfiguration);
				if (result == null) result = caseNamedElement(finalStateConfiguration);
				if (result == null) result = caseElementConfiguration(finalStateConfiguration);
				if (result == null) result = caseElement(finalStateConfiguration);
				if (result == null) result = caseEModelElement(finalStateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.PROTOCOL_TRANSITION_CONFIGURATION: {
				ProtocolTransitionConfiguration protocolTransitionConfiguration = (ProtocolTransitionConfiguration)theEObject;
				T result = caseProtocolTransitionConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseProtocolTransition(protocolTransitionConfiguration);
				if (result == null) result = caseTransitionConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseTransition(protocolTransitionConfiguration);
				if (result == null) result = caseNamespaceConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseNamespace(protocolTransitionConfiguration);
				if (result == null) result = caseRedefinableElement(protocolTransitionConfiguration);
				if (result == null) result = caseNamedElementConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseNamedElement(protocolTransitionConfiguration);
				if (result == null) result = caseElementConfiguration(protocolTransitionConfiguration);
				if (result == null) result = caseElement(protocolTransitionConfiguration);
				if (result == null) result = caseEModelElement(protocolTransitionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ASSOCIATION_CLASS_CONFIGURATION: {
				AssociationClassConfiguration associationClassConfiguration = (AssociationClassConfiguration)theEObject;
				T result = caseAssociationClassConfiguration(associationClassConfiguration);
				if (result == null) result = caseAssociationClass(associationClassConfiguration);
				if (result == null) result = caseClassConfiguration(associationClassConfiguration);
				if (result == null) result = caseAssociationConfiguration(associationClassConfiguration);
				if (result == null) result = caseClass(associationClassConfiguration);
				if (result == null) result = caseAssociation(associationClassConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(associationClassConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(associationClassConfiguration);
				if (result == null) result = caseRelationshipConfiguration(associationClassConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(associationClassConfiguration);
				if (result == null) result = caseBehavioredClassifier(associationClassConfiguration);
				if (result == null) result = caseRelationship(associationClassConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(associationClassConfiguration);
				if (result == null) result = caseStructuredClassifier(associationClassConfiguration);
				if (result == null) result = caseClassifierConfiguration(associationClassConfiguration);
				if (result == null) result = caseClassifier(associationClassConfiguration);
				if (result == null) result = caseNamespaceConfiguration(associationClassConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(associationClassConfiguration);
				if (result == null) result = caseTypeConfiguration(associationClassConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(associationClassConfiguration);
				if (result == null) result = caseNamespace(associationClassConfiguration);
				if (result == null) result = caseRedefinableElement(associationClassConfiguration);
				if (result == null) result = caseType(associationClassConfiguration);
				if (result == null) result = caseTemplateableElement(associationClassConfiguration);
				if (result == null) result = casePackageableElementConfiguration(associationClassConfiguration);
				if (result == null) result = casePackageableElement(associationClassConfiguration);
				if (result == null) result = caseNamedElementConfiguration(associationClassConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(associationClassConfiguration);
				if (result == null) result = caseNamedElement(associationClassConfiguration);
				if (result == null) result = caseParameterableElement(associationClassConfiguration);
				if (result == null) result = caseElementConfiguration(associationClassConfiguration);
				if (result == null) result = caseElement(associationClassConfiguration);
				if (result == null) result = caseEModelElement(associationClassConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COMPONENT_CONFIGURATION: {
				ComponentConfiguration componentConfiguration = (ComponentConfiguration)theEObject;
				T result = caseComponentConfiguration(componentConfiguration);
				if (result == null) result = caseComponent(componentConfiguration);
				if (result == null) result = caseClassConfiguration(componentConfiguration);
				if (result == null) result = caseClass(componentConfiguration);
				if (result == null) result = caseEncapsulatedClassifierConfiguration(componentConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(componentConfiguration);
				if (result == null) result = caseEncapsulatedClassifier(componentConfiguration);
				if (result == null) result = caseBehavioredClassifier(componentConfiguration);
				if (result == null) result = caseStructuredClassifierConfiguration(componentConfiguration);
				if (result == null) result = caseStructuredClassifier(componentConfiguration);
				if (result == null) result = caseClassifierConfiguration(componentConfiguration);
				if (result == null) result = caseClassifier(componentConfiguration);
				if (result == null) result = caseNamespaceConfiguration(componentConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(componentConfiguration);
				if (result == null) result = caseTypeConfiguration(componentConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(componentConfiguration);
				if (result == null) result = caseNamespace(componentConfiguration);
				if (result == null) result = caseRedefinableElement(componentConfiguration);
				if (result == null) result = caseType(componentConfiguration);
				if (result == null) result = caseTemplateableElement(componentConfiguration);
				if (result == null) result = casePackageableElementConfiguration(componentConfiguration);
				if (result == null) result = casePackageableElement(componentConfiguration);
				if (result == null) result = caseNamedElementConfiguration(componentConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(componentConfiguration);
				if (result == null) result = caseNamedElement(componentConfiguration);
				if (result == null) result = caseParameterableElement(componentConfiguration);
				if (result == null) result = caseElementConfiguration(componentConfiguration);
				if (result == null) result = caseElement(componentConfiguration);
				if (result == null) result = caseEModelElement(componentConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.COMPONENT_REALIZATION_CONFIGURATION: {
				ComponentRealizationConfiguration componentRealizationConfiguration = (ComponentRealizationConfiguration)theEObject;
				T result = caseComponentRealizationConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseComponentRealization(componentRealizationConfiguration);
				if (result == null) result = caseRealizationConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseRealization(componentRealizationConfiguration);
				if (result == null) result = caseAbstractionConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseAbstraction(componentRealizationConfiguration);
				if (result == null) result = caseDependencyConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseDependency(componentRealizationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseDirectedRelationshipConfiguration(componentRealizationConfiguration);
				if (result == null) result = casePackageableElement(componentRealizationConfiguration);
				if (result == null) result = caseDirectedRelationship(componentRealizationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseRelationshipConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseNamedElement(componentRealizationConfiguration);
				if (result == null) result = caseParameterableElement(componentRealizationConfiguration);
				if (result == null) result = caseRelationship(componentRealizationConfiguration);
				if (result == null) result = caseElementConfiguration(componentRealizationConfiguration);
				if (result == null) result = caseElement(componentRealizationConfiguration);
				if (result == null) result = caseEModelElement(componentRealizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.ACTOR_CONFIGURATION: {
				ActorConfiguration actorConfiguration = (ActorConfiguration)theEObject;
				T result = caseActorConfiguration(actorConfiguration);
				if (result == null) result = caseActor(actorConfiguration);
				if (result == null) result = caseBehavioredClassifierConfiguration(actorConfiguration);
				if (result == null) result = caseBehavioredClassifier(actorConfiguration);
				if (result == null) result = caseClassifierConfiguration(actorConfiguration);
				if (result == null) result = caseClassifier(actorConfiguration);
				if (result == null) result = caseNamespaceConfiguration(actorConfiguration);
				if (result == null) result = caseRedefinableElementConfiguration(actorConfiguration);
				if (result == null) result = caseTypeConfiguration(actorConfiguration);
				if (result == null) result = caseTemplateableElementConfiguration(actorConfiguration);
				if (result == null) result = caseNamespace(actorConfiguration);
				if (result == null) result = caseRedefinableElement(actorConfiguration);
				if (result == null) result = caseType(actorConfiguration);
				if (result == null) result = caseTemplateableElement(actorConfiguration);
				if (result == null) result = casePackageableElementConfiguration(actorConfiguration);
				if (result == null) result = casePackageableElement(actorConfiguration);
				if (result == null) result = caseNamedElementConfiguration(actorConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(actorConfiguration);
				if (result == null) result = caseNamedElement(actorConfiguration);
				if (result == null) result = caseParameterableElement(actorConfiguration);
				if (result == null) result = caseElementConfiguration(actorConfiguration);
				if (result == null) result = caseElement(actorConfiguration);
				if (result == null) result = caseEModelElement(actorConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DURATION_CONFIGURATION: {
				DurationConfiguration durationConfiguration = (DurationConfiguration)theEObject;
				T result = caseDurationConfiguration(durationConfiguration);
				if (result == null) result = caseDuration(durationConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(durationConfiguration);
				if (result == null) result = caseValueSpecification(durationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(durationConfiguration);
				if (result == null) result = caseTypedElementConfiguration(durationConfiguration);
				if (result == null) result = casePackageableElement(durationConfiguration);
				if (result == null) result = caseTypedElement(durationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(durationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(durationConfiguration);
				if (result == null) result = caseNamedElement(durationConfiguration);
				if (result == null) result = caseParameterableElement(durationConfiguration);
				if (result == null) result = caseElementConfiguration(durationConfiguration);
				if (result == null) result = caseElement(durationConfiguration);
				if (result == null) result = caseEModelElement(durationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DURATION_CONSTRAINT_CONFIGURATION: {
				DurationConstraintConfiguration durationConstraintConfiguration = (DurationConstraintConfiguration)theEObject;
				T result = caseDurationConstraintConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseDurationConstraint(durationConstraintConfiguration);
				if (result == null) result = caseIntervalConstraintConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseIntervalConstraint(durationConstraintConfiguration);
				if (result == null) result = caseConstraintConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseConstraint(durationConstraintConfiguration);
				if (result == null) result = casePackageableElementConfiguration(durationConstraintConfiguration);
				if (result == null) result = casePackageableElement(durationConstraintConfiguration);
				if (result == null) result = caseNamedElementConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseNamedElement(durationConstraintConfiguration);
				if (result == null) result = caseParameterableElement(durationConstraintConfiguration);
				if (result == null) result = caseElementConfiguration(durationConstraintConfiguration);
				if (result == null) result = caseElement(durationConstraintConfiguration);
				if (result == null) result = caseEModelElement(durationConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERVAL_CONSTRAINT_CONFIGURATION: {
				IntervalConstraintConfiguration intervalConstraintConfiguration = (IntervalConstraintConfiguration)theEObject;
				T result = caseIntervalConstraintConfiguration(intervalConstraintConfiguration);
				if (result == null) result = caseIntervalConstraint(intervalConstraintConfiguration);
				if (result == null) result = caseConstraintConfiguration(intervalConstraintConfiguration);
				if (result == null) result = caseConstraint(intervalConstraintConfiguration);
				if (result == null) result = casePackageableElementConfiguration(intervalConstraintConfiguration);
				if (result == null) result = casePackageableElement(intervalConstraintConfiguration);
				if (result == null) result = caseNamedElementConfiguration(intervalConstraintConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(intervalConstraintConfiguration);
				if (result == null) result = caseNamedElement(intervalConstraintConfiguration);
				if (result == null) result = caseParameterableElement(intervalConstraintConfiguration);
				if (result == null) result = caseElementConfiguration(intervalConstraintConfiguration);
				if (result == null) result = caseElement(intervalConstraintConfiguration);
				if (result == null) result = caseEModelElement(intervalConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.INTERVAL_CONFIGURATION: {
				IntervalConfiguration intervalConfiguration = (IntervalConfiguration)theEObject;
				T result = caseIntervalConfiguration(intervalConfiguration);
				if (result == null) result = caseInterval(intervalConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(intervalConfiguration);
				if (result == null) result = caseValueSpecification(intervalConfiguration);
				if (result == null) result = casePackageableElementConfiguration(intervalConfiguration);
				if (result == null) result = caseTypedElementConfiguration(intervalConfiguration);
				if (result == null) result = casePackageableElement(intervalConfiguration);
				if (result == null) result = caseTypedElement(intervalConfiguration);
				if (result == null) result = caseNamedElementConfiguration(intervalConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(intervalConfiguration);
				if (result == null) result = caseNamedElement(intervalConfiguration);
				if (result == null) result = caseParameterableElement(intervalConfiguration);
				if (result == null) result = caseElementConfiguration(intervalConfiguration);
				if (result == null) result = caseElement(intervalConfiguration);
				if (result == null) result = caseEModelElement(intervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DURATION_INTERVAL_CONFIGURATION: {
				DurationIntervalConfiguration durationIntervalConfiguration = (DurationIntervalConfiguration)theEObject;
				T result = caseDurationIntervalConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseDurationInterval(durationIntervalConfiguration);
				if (result == null) result = caseIntervalConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseInterval(durationIntervalConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseValueSpecification(durationIntervalConfiguration);
				if (result == null) result = casePackageableElementConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseTypedElementConfiguration(durationIntervalConfiguration);
				if (result == null) result = casePackageableElement(durationIntervalConfiguration);
				if (result == null) result = caseTypedElement(durationIntervalConfiguration);
				if (result == null) result = caseNamedElementConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseNamedElement(durationIntervalConfiguration);
				if (result == null) result = caseParameterableElement(durationIntervalConfiguration);
				if (result == null) result = caseElementConfiguration(durationIntervalConfiguration);
				if (result == null) result = caseElement(durationIntervalConfiguration);
				if (result == null) result = caseEModelElement(durationIntervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.DURATION_OBSERVATION_CONFIGURATION: {
				DurationObservationConfiguration durationObservationConfiguration = (DurationObservationConfiguration)theEObject;
				T result = caseDurationObservationConfiguration(durationObservationConfiguration);
				if (result == null) result = caseDurationObservation(durationObservationConfiguration);
				if (result == null) result = caseObservationConfiguration(durationObservationConfiguration);
				if (result == null) result = caseObservation(durationObservationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(durationObservationConfiguration);
				if (result == null) result = casePackageableElement(durationObservationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(durationObservationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(durationObservationConfiguration);
				if (result == null) result = caseNamedElement(durationObservationConfiguration);
				if (result == null) result = caseParameterableElement(durationObservationConfiguration);
				if (result == null) result = caseElementConfiguration(durationObservationConfiguration);
				if (result == null) result = caseElement(durationObservationConfiguration);
				if (result == null) result = caseEModelElement(durationObservationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_BOOLEAN_CONFIGURATION: {
				LiteralBooleanConfiguration literalBooleanConfiguration = (LiteralBooleanConfiguration)theEObject;
				T result = caseLiteralBooleanConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseLiteralBoolean(literalBooleanConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseLiteralSpecification(literalBooleanConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseValueSpecification(literalBooleanConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalBooleanConfiguration);
				if (result == null) result = casePackageableElement(literalBooleanConfiguration);
				if (result == null) result = caseTypedElement(literalBooleanConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseNamedElement(literalBooleanConfiguration);
				if (result == null) result = caseParameterableElement(literalBooleanConfiguration);
				if (result == null) result = caseElementConfiguration(literalBooleanConfiguration);
				if (result == null) result = caseElement(literalBooleanConfiguration);
				if (result == null) result = caseEModelElement(literalBooleanConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_SPECIFICATION_CONFIGURATION: {
				LiteralSpecificationConfiguration literalSpecificationConfiguration = (LiteralSpecificationConfiguration)theEObject;
				T result = caseLiteralSpecificationConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseLiteralSpecification(literalSpecificationConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseValueSpecification(literalSpecificationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalSpecificationConfiguration);
				if (result == null) result = casePackageableElement(literalSpecificationConfiguration);
				if (result == null) result = caseTypedElement(literalSpecificationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseNamedElement(literalSpecificationConfiguration);
				if (result == null) result = caseParameterableElement(literalSpecificationConfiguration);
				if (result == null) result = caseElementConfiguration(literalSpecificationConfiguration);
				if (result == null) result = caseElement(literalSpecificationConfiguration);
				if (result == null) result = caseEModelElement(literalSpecificationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_INTEGER_CONFIGURATION: {
				LiteralIntegerConfiguration literalIntegerConfiguration = (LiteralIntegerConfiguration)theEObject;
				T result = caseLiteralIntegerConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseLiteralInteger(literalIntegerConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseLiteralSpecification(literalIntegerConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseValueSpecification(literalIntegerConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalIntegerConfiguration);
				if (result == null) result = casePackageableElement(literalIntegerConfiguration);
				if (result == null) result = caseTypedElement(literalIntegerConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseNamedElement(literalIntegerConfiguration);
				if (result == null) result = caseParameterableElement(literalIntegerConfiguration);
				if (result == null) result = caseElementConfiguration(literalIntegerConfiguration);
				if (result == null) result = caseElement(literalIntegerConfiguration);
				if (result == null) result = caseEModelElement(literalIntegerConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_NULL_CONFIGURATION: {
				LiteralNullConfiguration literalNullConfiguration = (LiteralNullConfiguration)theEObject;
				T result = caseLiteralNullConfiguration(literalNullConfiguration);
				if (result == null) result = caseLiteralNull(literalNullConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalNullConfiguration);
				if (result == null) result = caseLiteralSpecification(literalNullConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalNullConfiguration);
				if (result == null) result = caseValueSpecification(literalNullConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalNullConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalNullConfiguration);
				if (result == null) result = casePackageableElement(literalNullConfiguration);
				if (result == null) result = caseTypedElement(literalNullConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalNullConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalNullConfiguration);
				if (result == null) result = caseNamedElement(literalNullConfiguration);
				if (result == null) result = caseParameterableElement(literalNullConfiguration);
				if (result == null) result = caseElementConfiguration(literalNullConfiguration);
				if (result == null) result = caseElement(literalNullConfiguration);
				if (result == null) result = caseEModelElement(literalNullConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_REAL_CONFIGURATION: {
				LiteralRealConfiguration literalRealConfiguration = (LiteralRealConfiguration)theEObject;
				T result = caseLiteralRealConfiguration(literalRealConfiguration);
				if (result == null) result = caseLiteralReal(literalRealConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalRealConfiguration);
				if (result == null) result = caseLiteralSpecification(literalRealConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalRealConfiguration);
				if (result == null) result = caseValueSpecification(literalRealConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalRealConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalRealConfiguration);
				if (result == null) result = casePackageableElement(literalRealConfiguration);
				if (result == null) result = caseTypedElement(literalRealConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalRealConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalRealConfiguration);
				if (result == null) result = caseNamedElement(literalRealConfiguration);
				if (result == null) result = caseParameterableElement(literalRealConfiguration);
				if (result == null) result = caseElementConfiguration(literalRealConfiguration);
				if (result == null) result = caseElement(literalRealConfiguration);
				if (result == null) result = caseEModelElement(literalRealConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_STRING_CONFIGURATION: {
				LiteralStringConfiguration literalStringConfiguration = (LiteralStringConfiguration)theEObject;
				T result = caseLiteralStringConfiguration(literalStringConfiguration);
				if (result == null) result = caseLiteralString(literalStringConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalStringConfiguration);
				if (result == null) result = caseLiteralSpecification(literalStringConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalStringConfiguration);
				if (result == null) result = caseValueSpecification(literalStringConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalStringConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalStringConfiguration);
				if (result == null) result = casePackageableElement(literalStringConfiguration);
				if (result == null) result = caseTypedElement(literalStringConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalStringConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalStringConfiguration);
				if (result == null) result = caseNamedElement(literalStringConfiguration);
				if (result == null) result = caseParameterableElement(literalStringConfiguration);
				if (result == null) result = caseElementConfiguration(literalStringConfiguration);
				if (result == null) result = caseElement(literalStringConfiguration);
				if (result == null) result = caseEModelElement(literalStringConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.LITERAL_UNLIMITED_NATURAL_CONFIGURATION: {
				LiteralUnlimitedNaturalConfiguration literalUnlimitedNaturalConfiguration = (LiteralUnlimitedNaturalConfiguration)theEObject;
				T result = caseLiteralUnlimitedNaturalConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseLiteralUnlimitedNatural(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseLiteralSpecificationConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseLiteralSpecification(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseValueSpecification(literalUnlimitedNaturalConfiguration);
				if (result == null) result = casePackageableElementConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseTypedElementConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = casePackageableElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseTypedElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseNamedElementConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseNamedElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseParameterableElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseElementConfiguration(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = caseEModelElement(literalUnlimitedNaturalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TIME_CONSTRAINT_CONFIGURATION: {
				TimeConstraintConfiguration timeConstraintConfiguration = (TimeConstraintConfiguration)theEObject;
				T result = caseTimeConstraintConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseTimeConstraint(timeConstraintConfiguration);
				if (result == null) result = caseIntervalConstraintConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseIntervalConstraint(timeConstraintConfiguration);
				if (result == null) result = caseConstraintConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseConstraint(timeConstraintConfiguration);
				if (result == null) result = casePackageableElementConfiguration(timeConstraintConfiguration);
				if (result == null) result = casePackageableElement(timeConstraintConfiguration);
				if (result == null) result = caseNamedElementConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseNamedElement(timeConstraintConfiguration);
				if (result == null) result = caseParameterableElement(timeConstraintConfiguration);
				if (result == null) result = caseElementConfiguration(timeConstraintConfiguration);
				if (result == null) result = caseElement(timeConstraintConfiguration);
				if (result == null) result = caseEModelElement(timeConstraintConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TIME_INTERVAL_CONFIGURATION: {
				TimeIntervalConfiguration timeIntervalConfiguration = (TimeIntervalConfiguration)theEObject;
				T result = caseTimeIntervalConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseTimeInterval(timeIntervalConfiguration);
				if (result == null) result = caseIntervalConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseInterval(timeIntervalConfiguration);
				if (result == null) result = caseValueSpecificationConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseValueSpecification(timeIntervalConfiguration);
				if (result == null) result = casePackageableElementConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseTypedElementConfiguration(timeIntervalConfiguration);
				if (result == null) result = casePackageableElement(timeIntervalConfiguration);
				if (result == null) result = caseTypedElement(timeIntervalConfiguration);
				if (result == null) result = caseNamedElementConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseNamedElement(timeIntervalConfiguration);
				if (result == null) result = caseParameterableElement(timeIntervalConfiguration);
				if (result == null) result = caseElementConfiguration(timeIntervalConfiguration);
				if (result == null) result = caseElement(timeIntervalConfiguration);
				if (result == null) result = caseEModelElement(timeIntervalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FumlConfigurationPackage.TIME_OBSERVATION_CONFIGURATION: {
				TimeObservationConfiguration timeObservationConfiguration = (TimeObservationConfiguration)theEObject;
				T result = caseTimeObservationConfiguration(timeObservationConfiguration);
				if (result == null) result = caseTimeObservation(timeObservationConfiguration);
				if (result == null) result = caseObservationConfiguration(timeObservationConfiguration);
				if (result == null) result = caseObservation(timeObservationConfiguration);
				if (result == null) result = casePackageableElementConfiguration(timeObservationConfiguration);
				if (result == null) result = casePackageableElement(timeObservationConfiguration);
				if (result == null) result = caseNamedElementConfiguration(timeObservationConfiguration);
				if (result == null) result = caseParameterableElementConfiguration(timeObservationConfiguration);
				if (result == null) result = caseNamedElement(timeObservationConfiguration);
				if (result == null) result = caseParameterableElement(timeObservationConfiguration);
				if (result == null) result = caseElementConfiguration(timeObservationConfiguration);
				if (result == null) result = caseElement(timeObservationConfiguration);
				if (result == null) result = caseEModelElement(timeObservationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelConfiguration(ModelConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementConfiguration(ElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Content Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Content Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityContentConfiguration(ActivityContentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityConfiguration(ActivityConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorConfiguration(BehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassConfiguration(ClassConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifierConfiguration(BehavioredClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierConfiguration(ClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceConfiguration(NamespaceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementConfiguration(NamedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentConfiguration(CommentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeConfiguration(StereotypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageConfiguration(ImageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileConfiguration(ProfileConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageConfiguration(PackageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElementConfiguration(PackageableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElementConfiguration(ParameterableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterConfiguration(TemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Signature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Signature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSignatureConfiguration(TemplateSignatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElementConfiguration(TemplateableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Binding Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Binding Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBindingConfiguration(TemplateBindingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationshipConfiguration(DirectedRelationshipConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipConfiguration(RelationshipConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Substitution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Substitution Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterSubstitutionConfiguration(TemplateParameterSubstitutionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConfiguration(TypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationConfiguration(AssociationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyConfiguration(PropertyConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementConfiguration(ConnectableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementConfiguration(TypedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEndConfiguration(ConnectorEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElementConfiguration(MultiplicityElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationConfiguration(ValueSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementTemplateParameterConfiguration(ConnectableElementTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTargetConfiguration(DeploymentTargetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentConfiguration(DeploymentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyConfiguration(DependencyConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpecificationConfiguration(DeploymentSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactConfiguration(ArtifactConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Artifact Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Artifact Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedArtifactConfiguration(DeployedArtifactConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestationConfiguration(ManifestationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionConfiguration(AbstractionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpressionConfiguration(OpaqueExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterConfiguration(ParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationConfiguration(OperationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeatureConfiguration(BehavioralFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConfiguration(FeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElementConfiguration(RedefinableElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSetConfiguration(ParameterSetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintConfiguration(ConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeConfiguration(DataTypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConfiguration(InterfaceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceptionConfiguration(ReceptionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalConfiguration(SignalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol State Machine Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol State Machine Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStateMachineConfiguration(ProtocolStateMachineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineConfiguration(StateMachineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudostate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudostate Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudostateConfiguration(PseudostateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertexConfiguration(VertexConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionConfiguration(RegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateConfiguration(StateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Reference Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Reference Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointReferenceConfiguration(ConnectionPointReferenceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerConfiguration(TriggerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventConfiguration(EventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortConfiguration(PortConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionConfiguration(TransitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Conformance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Conformance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolConformanceConfiguration(ProtocolConformanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationTemplateParameterConfiguration(OperationTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureConfiguration(StructuralFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Merge Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Merge Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMergeConfiguration(PackageMergeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Application Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Application Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileApplicationConfiguration(ProfileApplicationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationConfiguration(EnumerationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteralConfiguration(EnumerationLiteralConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecificationConfiguration(InstanceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotConfiguration(SlotConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeConfiguration(PrimitiveTypeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Import Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Import Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImportConfiguration(ElementImportConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImportConfiguration(PackageImportConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionConfiguration(ExtensionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionEndConfiguration(ExtensionEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpressionConfiguration(StringExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionConfiguration(ExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageConfiguration(UsageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Use Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Use Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationUseConfiguration(CollaborationUseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationConfiguration(CollaborationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifierConfiguration(StructuredClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorConfiguration(ConnectorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationConfiguration(GeneralizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSetConfiguration(GeneralizationSetConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Template Signature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Template Signature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableTemplateSignatureConfiguration(RedefinableTemplateSignatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseConfiguration(UseCaseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendConfiguration(ExtendConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPointConfiguration(ExtensionPointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeConfiguration(IncludeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutionConfiguration(SubstitutionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizationConfiguration(RealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Template Parameter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Template Parameter Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierTemplateParameterConfiguration(ClassifierTemplateParameterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRealizationConfiguration(InterfaceRealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifierConfiguration(EncapsulatedClassifierConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroupConfiguration(ActivityGroupConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdgeConfiguration(ActivityEdgeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Partition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Partition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartitionConfiguration(ActivityPartitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNodeConfiguration(ActivityNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegionConfiguration(InterruptibleActivityRegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNodeConfiguration(StructuredActivityNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionConfiguration(ActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNodeConfiguration(ExecutableNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandlerConfiguration(ExceptionHandlerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNodeConfiguration(ObjectNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPinConfiguration(InputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinConfiguration(PinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPinConfiguration(OutputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableConfiguration(VariableConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationActionConfiguration(ValueSpecificationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableActionConfiguration(VariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkActionConfiguration(WriteLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkActionConfiguration(LinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndDataConfiguration(LinkEndDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValueConfiguration(QualifierValueConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureActionConfiguration(WriteStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureActionConfiguration(StructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteVariableActionConfiguration(WriteVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallActionConfiguration(AcceptCallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventActionConfiguration(AcceptEventActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Input Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Input Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInputPinConfiguration(ActionInputPinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueActionConfiguration(AddStructuralFeatureValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableValueActionConfiguration(AddVariableValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Signal Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Signal Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSignalActionConfiguration(BroadcastSignalActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationActionConfiguration(InvocationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallActionConfiguration(CallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorActionConfiguration(CallBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationActionConfiguration(CallOperationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClauseConfiguration(ClauseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Association Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Association Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAssociationActionConfiguration(ClearAssociationActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearStructuralFeatureActionConfiguration(ClearStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearVariableActionConfiguration(ClearVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNodeConfiguration(ConditionalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkActionConfiguration(CreateLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Creation Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Creation Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndCreationDataConfiguration(LinkEndCreationDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectActionConfiguration(CreateLinkObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectActionConfiguration(CreateObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyLinkActionConfiguration(DestroyLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Destruction Data Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Destruction Data Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndDestructionDataConfiguration(LinkEndDestructionDataConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectActionConfiguration(DestroyObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionNodeConfiguration(ExpansionNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Region Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Region Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionRegionConfiguration(ExpansionRegionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNodeConfiguration(LoopNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueActionConfiguration(OpaqueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionActionConfiguration(RaiseExceptionActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extent Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extent Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtentActionConfiguration(ReadExtentActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Is Classified Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Is Classified Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadIsClassifiedObjectActionConfiguration(ReadIsClassifiedObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkActionConfiguration(ReadLinkActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndActionConfiguration(ReadLinkObjectEndActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierActionConfiguration(ReadLinkObjectEndQualifierActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfActionConfiguration(ReadSelfActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureActionConfiguration(ReadStructuralFeatureActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Variable Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Variable Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadVariableActionConfiguration(ReadVariableActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectActionConfiguration(ReclassifyObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceActionConfiguration(ReduceActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStructuralFeatureValueActionConfiguration(RemoveStructuralFeatureValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Value Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Value Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableValueActionConfiguration(RemoveVariableValueActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyActionConfiguration(ReplyActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Object Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Object Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendObjectActionConfiguration(SendObjectActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalActionConfiguration(SendSignalActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNodeConfiguration(SequenceNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartClassifierBehaviorActionConfiguration(StartClassifierBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Object Behavior Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Object Behavior Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartObjectBehaviorActionConfiguration(StartObjectBehaviorActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Identity Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Identity Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIdentityActionConfiguration(TestIdentityActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshall Action Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshall Action Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshallActionConfiguration(UnmarshallActionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pin Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePinConfiguration(ValuePinConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNodeConfiguration(ActivityFinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNodeConfiguration(FinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNodeConfiguration(ControlNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNodeConfiguration(ActivityParameterNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNodeConfiguration(CentralBufferNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlowConfiguration(ControlFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNodeConfiguration(DataStoreNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNodeConfiguration(DecisionNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlowConfiguration(ObjectFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNodeConfiguration(FlowFinalNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNodeConfiguration(ForkNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNodeConfiguration(InitialNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNodeConfiguration(JoinNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNodeConfiguration(MergeNodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Value Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Value Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceValueConfiguration(InstanceValueConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Receive Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Receive Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyReceiveEventConfiguration(AnyReceiveEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEventConfiguration(MessageEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallEventConfiguration(CallEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEventConfiguration(ChangeEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBehaviorConfiguration(FunctionBehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Behavior Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Behavior Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueBehaviorConfiguration(OpaqueBehaviorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalEventConfiguration(SignalEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEventConfiguration(TimeEventConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpressionConfiguration(TimeExpressionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationConfiguration(ObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Path Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Path Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPathConfiguration(CommunicationPathConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceConfiguration(DeviceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeConfiguration(NodeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironmentConfiguration(ExecutionEnvironmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlowConfiguration(InformationFlowConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageConfiguration(MessageConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConfiguration(InteractionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragmentConfiguration(InteractionFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifelineConfiguration(LifelineConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecompositionConfiguration(PartDecompositionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUseConfiguration(InteractionUseConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateConfiguration(GateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEndConfiguration(MessageEndConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperandConfiguration(InteractionOperandConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraintConfiguration(InteractionConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrderingConfiguration(GeneralOrderingConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecificationConfiguration(OccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Item Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Item Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationItemConfiguration(InformationItemConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecificationConfiguration(ActionExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecificationConfiguration(ExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecificationConfiguration(BehaviorExecutionSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragmentConfiguration(CombinedFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consider Ignore Fragment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consider Ignore Fragment Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderIgnoreFragmentConfiguration(ConsiderIgnoreFragmentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuationConfiguration(ContinuationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurrenceSpecificationConfiguration(DestructionOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecificationConfiguration(MessageOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecificationConfiguration(ExecutionOccurrenceSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariantConfiguration(StateInvariantConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalStateConfiguration(FinalStateConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolTransitionConfiguration(ProtocolTransitionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClassConfiguration(AssociationClassConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentConfiguration(ComponentConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Realization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Realization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRealizationConfiguration(ComponentRealizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorConfiguration(ActorConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConfiguration(DurationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraintConfiguration(DurationConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraintConfiguration(IntervalConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConfiguration(IntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationIntervalConfiguration(DurationIntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservationConfiguration(DurationObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBooleanConfiguration(LiteralBooleanConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecificationConfiguration(LiteralSpecificationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralIntegerConfiguration(LiteralIntegerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNullConfiguration(LiteralNullConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Real Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Real Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralRealConfiguration(LiteralRealConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralStringConfiguration(LiteralStringConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unlimited Natural Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unlimited Natural Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnlimitedNaturalConfiguration(LiteralUnlimitedNaturalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraintConfiguration(TimeConstraintConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeIntervalConfiguration(TimeIntervalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservationConfiguration(TimeObservationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.eclipse.uml2.uml.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityContent(ActivityContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.eclipse.uml2.uml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSignature(TemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateBinding(TemplateBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployed Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployedArtifact(DeployedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpecification(DeploymentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestation(Manifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSet(ParameterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReception(Reception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolStateMachine(ProtocolStateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudostate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudostate(Pseudostate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointReference(ConnectionPointReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolConformance(ProtocolConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationTemplateParameter(OperationTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageMerge(PackageMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileApplication(ProfileApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSpecification(InstanceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImport(ElementImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageImport(PackageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionEnd(ExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationUse(CollaborationUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Template Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableTemplateSignature(RedefinableTemplateSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtend(Extend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitution(Substitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierTemplateParameter(ClassifierTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRealization(InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartition(ActivityPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationAction(ValueSpecificationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAction(VariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndData(LinkEndData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureAction(StructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteVariableAction(WriteVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInputPin(ActionInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableValueAction(AddVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSignalAction(BroadcastSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorAction(CallBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAssociationAction(ClearAssociationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearVariableAction(ClearVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkAction(CreateLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndCreationData(LinkEndCreationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyLinkAction(DestroyLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndDestructionData(LinkEndDestructionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionNode(ExpansionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionRegion(ExpansionRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtentAction(ReadExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkAction(ReadLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadVariableAction(ReadVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceAction(ReduceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableValueAction(RemoveVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendObjectAction(SendObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartObjectBehaviorAction(StartObjectBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIdentityAction(TestIdentityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshallAction(UnmarshallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePin(ValuePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceValue(InstanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Receive Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Receive Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyReceiveEvent(AnyReceiveEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallEvent(CallEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeEvent(ChangeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueBehavior(OpaqueBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBehavior(FunctionBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalEvent(SignalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEvent(TimeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPath(CommunicationPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEnvironment(ExecutionEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFlow(InformationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationItem(InformationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecification(ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecification(BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurrenceSpecification(DestructionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClass(AssociationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRealization(ComponentRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraint(DurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservation(DurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralReal(LiteralReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservation(TimeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FumlConfigurationSwitch
