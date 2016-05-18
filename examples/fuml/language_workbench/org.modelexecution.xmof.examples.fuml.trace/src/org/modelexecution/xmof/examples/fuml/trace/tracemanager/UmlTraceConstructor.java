package org.modelexecution.xmof.examples.fuml.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.gemoc.executionframework.engine.mse.LaunchConfiguration;
import org.gemoc.executionframework.engine.mse.MSEModel;
import org.gemoc.executionframework.engine.mse.SequentialStep;

import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class UmlTraceConstructor implements ITraceConstructor {
	private umlTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private umlTrace.States.State lastState;

	private Resource traceResource;
	private Deque<umlTrace.Steps.SpecificStep> context = new LinkedList<umlTrace.Steps.SpecificStep>();

	public UmlTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = umlTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.ElementConfiguration) {
						fumlConfiguration.ElementConfiguration o_cast = (fumlConfiguration.ElementConfiguration) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						addNewObjectToState(o_cast, lastState);
					} else

					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.Token o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field holder
		umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
				.createToken_holder_Value();
		if (o_cast.getHolder() != null) {
			storeAsTracedObject(o_cast.getHolder());
			firstValue_holder.setHolder(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
							.get(o_cast.getHolder())));
		}
		traced.getHolderSequence().add(firstValue_holder);
		newState.getToken_holder_Values().add(firstValue_holder);
	}

	private void addNewObjectToState(fumlConfiguration.Loci.SemanticVisitor o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor traced = (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);
	}

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Reference o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field referent
		umlTrace.States.Reference_referent_Value firstValue_referent = umlTrace.States.StatesFactory.eINSTANCE
				.createReference_referent_Value();
		if (o_cast.getReferent() != null) {
			storeAsTracedObject(o_cast.getReferent());
			firstValue_referent.setReferent(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
					.get(o_cast.getReferent())));
		}
		traced.getReferentSequence().add(firstValue_referent);
		newState.getReference_referent_Values().add(firstValue_referent);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue traced = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field parameter_ParameterValue
		umlTrace.States.ParameterValue_parameter_ParameterValue_Value firstValue_parameter_ParameterValue = umlTrace.States.StatesFactory.eINSTANCE
				.createParameterValue_parameter_ParameterValue_Value();
		if (o_cast.getParameter_ParameterValue() != null) {
			storeAsTracedObject(o_cast.getParameter_ParameterValue());
			firstValue_parameter_ParameterValue.setParameter_ParameterValue(
					((umlTrace.States.uml.TracedParameter) exeToTraced.get(o_cast.getParameter_ParameterValue())));
		}
		traced.getParameter_ParameterValueSequence().add(firstValue_parameter_ParameterValue);
		newState.getParameterValue_parameter_ParameterValue_Values().add(firstValue_parameter_ParameterValue);

		// Creation of the first value of the field values_ParameterValue
		for (fumlConfiguration.Classes.Kernel.Value aValue : o_cast.getValues_ParameterValue()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ParameterValue_values_ParameterValue_Value firstValue_values_ParameterValue = umlTrace.States.StatesFactory.eINSTANCE
				.createParameterValue_values_ParameterValue_Value();
		firstValue_values_ParameterValue.getValues_ParameterValue()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue>) getExeToTraced(
						o_cast.getValues_ParameterValue()));
		traced.getValues_ParameterValueSequence().add(firstValue_values_ParameterValue);
		newState.getParameterValue_values_ParameterValue_Values().add(firstValue_values_ParameterValue);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.Offer o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field offeredTokens
		for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getOfferedTokens()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.Offer_offeredTokens_Value firstValue_offeredTokens = umlTrace.States.StatesFactory.eINSTANCE
				.createOffer_offeredTokens_Value();
		firstValue_offeredTokens.getOfferedTokens()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
						o_cast.getOfferedTokens()));
		traced.getOfferedTokensSequence().add(firstValue_offeredTokens);
		newState.getOffer_offeredTokens_Values().add(firstValue_offeredTokens);
	}

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field holder
		umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
				.createToken_holder_Value();
		if (o_cast.getHolder() != null) {
			storeAsTracedObject(o_cast.getHolder());
			firstValue_holder.setHolder(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
							.get(o_cast.getHolder())));
		}
		traced.getHolderSequence().add(firstValue_holder);
		newState.getToken_holder_Values().add(firstValue_holder);

		// Creation of the first value of the field value
		umlTrace.States.ObjectToken_value_Value firstValue_value = umlTrace.States.StatesFactory.eINSTANCE
				.createObjectToken_value_Value();
		if (o_cast.getValue() != null) {
			storeAsTracedObject(o_cast.getValue());
			firstValue_value.setValue(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue) exeToTraced
					.get(o_cast.getValue())));
		}
		traced.getValueSequence().add(firstValue_value);
		newState.getObjectToken_value_Values().add(firstValue_value);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.Object o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field featureValues
		for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
				.createCompoundValue_featureValues_Value();
		firstValue_featureValues.getFeatureValues()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
						o_cast.getFeatureValues()));
		traced.getFeatureValuesSequence().add(firstValue_featureValues);
		newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

		// Creation of the first value of the field locus_ExtensionalValue
		umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
				.createExtensionalValue_locus_ExtensionalValue_Value();
		if (o_cast.getLocus_ExtensionalValue() != null) {
			storeAsTracedObject(o_cast.getLocus_ExtensionalValue());
			firstValue_locus_ExtensionalValue
					.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
							.get(o_cast.getLocus_ExtensionalValue())));
		}
		traced.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
		newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		// Creation of the first value of the field types
		for (org.eclipse.uml2.uml.Class aValue : o_cast.getTypes()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
				.createObject_types_Value();
		firstValue_types.getTypes()
				.addAll((Collection<? extends umlTrace.States.uml.TracedClass>) getExeToTraced(o_cast.getTypes()));
		traced.getTypesSequence().add(firstValue_types);
		newState.getObject_types_Values().add(firstValue_types);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Loci.Locus o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field executor
		umlTrace.States.Locus_executor_Value firstValue_executor = umlTrace.States.StatesFactory.eINSTANCE
				.createLocus_executor_Value();
		if (o_cast.getExecutor() != null) {
			storeAsTracedObject(o_cast.getExecutor());
			firstValue_executor.setExecutor(
					((umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced.get(o_cast.getExecutor())));
		}
		traced.getExecutorSequence().add(firstValue_executor);
		newState.getLocus_executor_Values().add(firstValue_executor);

		// Creation of the first value of the field extensionalValues
		for (fumlConfiguration.Classes.Kernel.ExtensionalValue aValue : o_cast.getExtensionalValues()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.Locus_extensionalValues_Value firstValue_extensionalValues = umlTrace.States.StatesFactory.eINSTANCE
				.createLocus_extensionalValues_Value();
		firstValue_extensionalValues.getExtensionalValues()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue>) getExeToTraced(
						o_cast.getExtensionalValues()));
		traced.getExtensionalValuesSequence().add(firstValue_extensionalValues);
		newState.getLocus_extensionalValues_Values().add(firstValue_extensionalValues);

		// Creation of the first value of the field factory
		umlTrace.States.Locus_factory_Value firstValue_factory = umlTrace.States.StatesFactory.eINSTANCE
				.createLocus_factory_Value();
		if (o_cast.getFactory() != null) {
			storeAsTracedObject(o_cast.getFactory());
			firstValue_factory.setFactory(((umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
					.get(o_cast.getFactory())));
		}
		traced.getFactorySequence().add(firstValue_factory);
		newState.getLocus_factory_Values().add(firstValue_factory);
	}

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.IntegerValue o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		// Creation of the first value of the field type
		umlTrace.States.PrimitiveValue_type_Value firstValue_type = umlTrace.States.StatesFactory.eINSTANCE
				.createPrimitiveValue_type_Value();
		if (o_cast.getType() != null) {
			storeAsTracedObject(o_cast.getType());
			firstValue_type.setType(((umlTrace.States.uml.TracedPrimitiveType) exeToTraced.get(o_cast.getType())));
		}
		traced.getTypeSequence().add(firstValue_type);
		newState.getPrimitiveValue_type_Values().add(firstValue_type);

		// Creation of the first value of the field value_IntegerValue
		umlTrace.States.IntegerValue_value_IntegerValue_Value firstValue_value_IntegerValue = umlTrace.States.StatesFactory.eINSTANCE
				.createIntegerValue_value_IntegerValue_Value();
		traced.getValue_IntegerValueSequence().add(firstValue_value_IntegerValue);
		newState.getIntegerValue_value_IntegerValue_Values().add(firstValue_value_IntegerValue);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Input.InputParameterValues o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues traced = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field name
		umlTrace.States.InputParameterValues_name_Value firstValue_name = umlTrace.States.StatesFactory.eINSTANCE
				.createInputParameterValues_name_Value();
		traced.getNameSequence().add(firstValue_name);
		newState.getInputParameterValues_name_Values().add(firstValue_name);

		// Creation of the first value of the field parameterValues
		for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.InputParameterValues_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
				.createInputParameterValues_parameterValues_Value();
		firstValue_parameterValues.getParameterValues()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
						o_cast.getParameterValues()));
		traced.getParameterValuesSequence().add(firstValue_parameterValues);
		newState.getInputParameterValues_parameterValues_Values().add(firstValue_parameterValues);
	}

	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field baseToken
		umlTrace.States.ForkedToken_baseToken_Value firstValue_baseToken = umlTrace.States.StatesFactory.eINSTANCE
				.createForkedToken_baseToken_Value();
		if (o_cast.getBaseToken() != null) {
			storeAsTracedObject(o_cast.getBaseToken());
			firstValue_baseToken.setBaseToken(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
							.get(o_cast.getBaseToken())));
		}
		traced.getBaseTokenSequence().add(firstValue_baseToken);
		newState.getForkedToken_baseToken_Values().add(firstValue_baseToken);

		// Creation of the first value of the field baseTokenIsWithdrawn
		umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value firstValue_baseTokenIsWithdrawn = umlTrace.States.StatesFactory.eINSTANCE
				.createForkedToken_baseTokenIsWithdrawn_Value();
		traced.getBaseTokenIsWithdrawnSequence().add(firstValue_baseTokenIsWithdrawn);
		newState.getForkedToken_baseTokenIsWithdrawn_Values().add(firstValue_baseTokenIsWithdrawn);

		// Creation of the first value of the field holder
		umlTrace.States.Token_holder_Value firstValue_holder = umlTrace.States.StatesFactory.eINSTANCE
				.createToken_holder_Value();
		if (o_cast.getHolder() != null) {
			storeAsTracedObject(o_cast.getHolder());
			firstValue_holder.setHolder(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
							.get(o_cast.getHolder())));
		}
		traced.getHolderSequence().add(firstValue_holder);
		newState.getToken_holder_Values().add(firstValue_holder);

		// Creation of the first value of the field remainingOffersCount
		umlTrace.States.ForkedToken_remainingOffersCount_Value firstValue_remainingOffersCount = umlTrace.States.StatesFactory.eINSTANCE
				.createForkedToken_remainingOffersCount_Value();
		traced.getRemainingOffersCountSequence().add(firstValue_remainingOffersCount);
		newState.getForkedToken_remainingOffersCount_Values().add(firstValue_remainingOffersCount);
	}

	private void addNewObjectToState(fumlConfiguration.Loci.Executor o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Loci.TracedExecutor traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field locus_Executor
		umlTrace.States.Executor_locus_Executor_Value firstValue_locus_Executor = umlTrace.States.StatesFactory.eINSTANCE
				.createExecutor_locus_Executor_Value();
		if (o_cast.getLocus_Executor() != null) {
			storeAsTracedObject(o_cast.getLocus_Executor());
			firstValue_locus_Executor.setLocus_Executor(
					((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced.get(o_cast.getLocus_Executor())));
		}
		traced.getLocus_ExecutorSequence().add(firstValue_locus_Executor);
		newState.getExecutor_locus_Executor_Values().add(firstValue_locus_Executor);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Loci.ExecutionFactory o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field builtInTypes
		for (org.eclipse.uml2.uml.PrimitiveType aValue : o_cast.getBuiltInTypes()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ExecutionFactory_builtInTypes_Value firstValue_builtInTypes = umlTrace.States.StatesFactory.eINSTANCE
				.createExecutionFactory_builtInTypes_Value();
		firstValue_builtInTypes.getBuiltInTypes()
				.addAll((Collection<? extends umlTrace.States.uml.TracedPrimitiveType>) getExeToTraced(
						o_cast.getBuiltInTypes()));
		traced.getBuiltInTypesSequence().add(firstValue_builtInTypes);
		newState.getExecutionFactory_builtInTypes_Values().add(firstValue_builtInTypes);

		// Creation of the first value of the field locus_ExecutionFactory
		umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value firstValue_locus_ExecutionFactory = umlTrace.States.StatesFactory.eINSTANCE
				.createExecutionFactory_locus_ExecutionFactory_Value();
		if (o_cast.getLocus_ExecutionFactory() != null) {
			storeAsTracedObject(o_cast.getLocus_ExecutionFactory());
			firstValue_locus_ExecutionFactory
					.setLocus_ExecutionFactory(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
							.get(o_cast.getLocus_ExecutionFactory())));
		}
		traced.getLocus_ExecutionFactorySequence().add(firstValue_locus_ExecutionFactory);
		newState.getExecutionFactory_locus_ExecutionFactory_Values().add(firstValue_locus_ExecutionFactory);

		// Creation of the first value of the field primitiveBehaviorPrototypes
		for (fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aValue : o_cast
				.getPrimitiveBehaviorPrototypes()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value firstValue_primitiveBehaviorPrototypes = umlTrace.States.StatesFactory.eINSTANCE
				.createExecutionFactory_primitiveBehaviorPrototypes_Value();
		firstValue_primitiveBehaviorPrototypes.getPrimitiveBehaviorPrototypes()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution>) getExeToTraced(
						o_cast.getPrimitiveBehaviorPrototypes()));
		traced.getPrimitiveBehaviorPrototypesSequence().add(firstValue_primitiveBehaviorPrototypes);
		newState.getExecutionFactory_primitiveBehaviorPrototypes_Values().add(firstValue_primitiveBehaviorPrototypes);
	}

	private void addNewObjectToState(fumlConfiguration.Loci.ExecutionEnvironment o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field locus_ExecutionEnvironment
		umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value firstValue_locus_ExecutionEnvironment = umlTrace.States.StatesFactory.eINSTANCE
				.createExecutionEnvironment_locus_ExecutionEnvironment_Value();
		if (o_cast.getLocus_ExecutionEnvironment() != null) {
			storeAsTracedObject(o_cast.getLocus_ExecutionEnvironment());
			firstValue_locus_ExecutionEnvironment
					.setLocus_ExecutionEnvironment(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
							.get(o_cast.getLocus_ExecutionEnvironment())));
		}
		traced.getLocus_ExecutionEnvironmentSequence().add(firstValue_locus_ExecutionEnvironment);
		newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values().add(firstValue_locus_ExecutionEnvironment);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.ElementConfiguration o_cast, umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.TracedElementConfiguration traced = (umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field semanticVisitor
		for (fumlConfiguration.Loci.SemanticVisitor aValue : o_cast.getSemanticVisitor()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ElementConfiguration_semanticVisitor_Value firstValue_semanticVisitor = umlTrace.States.StatesFactory.eINSTANCE
				.createElementConfiguration_semanticVisitor_Value();
		firstValue_semanticVisitor.getSemanticVisitor()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor>) getExeToTraced(
						o_cast.getSemanticVisitor()));
		traced.getSemanticVisitorSequence().add(firstValue_semanticVisitor);
		newState.getElementConfiguration_semanticVisitor_Values().add(firstValue_semanticVisitor);
	}

	private void addNewObjectToState(fumlConfiguration.Classes.Kernel.BooleanValue o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		// Creation of the first value of the field type
		umlTrace.States.PrimitiveValue_type_Value firstValue_type = umlTrace.States.StatesFactory.eINSTANCE
				.createPrimitiveValue_type_Value();
		if (o_cast.getType() != null) {
			storeAsTracedObject(o_cast.getType());
			firstValue_type.setType(((umlTrace.States.uml.TracedPrimitiveType) exeToTraced.get(o_cast.getType())));
		}
		traced.getTypeSequence().add(firstValue_type);
		newState.getPrimitiveValue_type_Values().add(firstValue_type);

		// Creation of the first value of the field value_BooleanValue
		umlTrace.States.BooleanValue_value_BooleanValue_Value firstValue_value_BooleanValue = umlTrace.States.StatesFactory.eINSTANCE
				.createBooleanValue_value_BooleanValue_Value();
		traced.getValue_BooleanValueSequence().add(firstValue_value_BooleanValue);
		newState.getBooleanValue_value_BooleanValue_Values().add(firstValue_value_BooleanValue);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(
			fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field activityExecution
		umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value firstValue_activityExecution = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivationGroup_activityExecution_Value();
		if (o_cast.getActivityExecution() != null) {
			storeAsTracedObject(o_cast.getActivityExecution());
			firstValue_activityExecution.setActivityExecution(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
							.get(o_cast.getActivityExecution())));
		}
		traced.getActivityExecutionSequence().add(firstValue_activityExecution);
		newState.getActivityNodeActivationGroup_activityExecution_Values().add(firstValue_activityExecution);

		// Creation of the first value of the field edgeInstances
		for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
				.getEdgeInstances()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value firstValue_edgeInstances = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivationGroup_edgeInstances_Value();
		firstValue_edgeInstances.getEdgeInstances()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
						o_cast.getEdgeInstances()));
		traced.getEdgeInstancesSequence().add(firstValue_edgeInstances);
		newState.getActivityNodeActivationGroup_edgeInstances_Values().add(firstValue_edgeInstances);

		// Creation of the first value of the field nodeActivations
		for (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aValue : o_cast
				.getNodeActivations()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value firstValue_nodeActivations = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivationGroup_nodeActivations_Value();
		firstValue_nodeActivations.getNodeActivations()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation>) getExeToTraced(
						o_cast.getNodeActivations()));
		traced.getNodeActivationsSequence().add(firstValue_nodeActivations);
		newState.getActivityNodeActivationGroup_nodeActivations_Values().add(firstValue_nodeActivations);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field group_ActivityNodeActivation
		umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value firstValue_group_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_group_ActivityNodeActivation_Value();
		if (o_cast.getGroup_ActivityNodeActivation() != null) {
			storeAsTracedObject(o_cast.getGroup_ActivityNodeActivation());
			firstValue_group_ActivityNodeActivation.setGroup_ActivityNodeActivation(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
							.get(o_cast.getGroup_ActivityNodeActivation())));
		}
		traced.getGroup_ActivityNodeActivationSequence().add(firstValue_group_ActivityNodeActivation);
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.add(firstValue_group_ActivityNodeActivation);

		// Creation of the first value of the field heldTokens
		for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast.getHeldTokens()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityNodeActivation_heldTokens_Value firstValue_heldTokens = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_heldTokens_Value();
		firstValue_heldTokens.getHeldTokens()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
						o_cast.getHeldTokens()));
		traced.getHeldTokensSequence().add(firstValue_heldTokens);
		newState.getActivityNodeActivation_heldTokens_Values().add(firstValue_heldTokens);

		// Creation of the first value of the field incomingEdges
		for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
				.getIncomingEdges()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityNodeActivation_incomingEdges_Value firstValue_incomingEdges = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_incomingEdges_Value();
		firstValue_incomingEdges.getIncomingEdges()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
						o_cast.getIncomingEdges()));
		traced.getIncomingEdgesSequence().add(firstValue_incomingEdges);
		newState.getActivityNodeActivation_incomingEdges_Values().add(firstValue_incomingEdges);

		// Creation of the first value of the field isRunning
		umlTrace.States.ActivityNodeActivation_isRunning_Value firstValue_isRunning = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_isRunning_Value();
		traced.getIsRunningSequence().add(firstValue_isRunning);
		newState.getActivityNodeActivation_isRunning_Values().add(firstValue_isRunning);

		// Creation of the first value of the field node_ActivityNodeActivation
		umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value firstValue_node_ActivityNodeActivation = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_node_ActivityNodeActivation_Value();
		if (o_cast.getNode_ActivityNodeActivation() != null) {
			storeAsTracedObject(o_cast.getNode_ActivityNodeActivation());
			firstValue_node_ActivityNodeActivation
					.setNode_ActivityNodeActivation(((umlTrace.States.uml.TracedActivityNode) exeToTraced
							.get(o_cast.getNode_ActivityNodeActivation())));
		}
		traced.getNode_ActivityNodeActivationSequence().add(firstValue_node_ActivityNodeActivation);
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.add(firstValue_node_ActivityNodeActivation);

		// Creation of the first value of the field outgoingEdges
		for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
				.getOutgoingEdges()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityNodeActivation_outgoingEdges_Value firstValue_outgoingEdges = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_outgoingEdges_Value();
		firstValue_outgoingEdges.getOutgoingEdges()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
						o_cast.getOutgoingEdges()));
		traced.getOutgoingEdgesSequence().add(firstValue_outgoingEdges);
		newState.getActivityNodeActivation_outgoingEdges_Values().add(firstValue_outgoingEdges);

		// Creation of the first value of the field running
		umlTrace.States.ActivityNodeActivation_running_Value firstValue_running = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityNodeActivation_running_Value();
		traced.getRunningSequence().add(firstValue_running);
		newState.getActivityNodeActivation_running_Values().add(firstValue_running);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field activationGroup
		umlTrace.States.ActivityExecution_activationGroup_Value firstValue_activationGroup = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityExecution_activationGroup_Value();
		if (o_cast.getActivationGroup() != null) {
			storeAsTracedObject(o_cast.getActivationGroup());
			firstValue_activationGroup.setActivationGroup(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
							.get(o_cast.getActivationGroup())));
		}
		traced.getActivationGroupSequence().add(firstValue_activationGroup);
		newState.getActivityExecution_activationGroup_Values().add(firstValue_activationGroup);

		// Creation of the first value of the field context
		umlTrace.States.Execution_context_Value firstValue_context = umlTrace.States.StatesFactory.eINSTANCE
				.createExecution_context_Value();
		if (o_cast.getContext() != null) {
			storeAsTracedObject(o_cast.getContext());
			firstValue_context.setContext(((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
					.get(o_cast.getContext())));
		}
		traced.getContextSequence().add(firstValue_context);
		newState.getExecution_context_Values().add(firstValue_context);

		// Creation of the first value of the field featureValues
		for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.CompoundValue_featureValues_Value firstValue_featureValues = umlTrace.States.StatesFactory.eINSTANCE
				.createCompoundValue_featureValues_Value();
		firstValue_featureValues.getFeatureValues()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
						o_cast.getFeatureValues()));
		traced.getFeatureValuesSequence().add(firstValue_featureValues);
		newState.getCompoundValue_featureValues_Values().add(firstValue_featureValues);

		// Creation of the first value of the field locus_ExtensionalValue
		umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value firstValue_locus_ExtensionalValue = umlTrace.States.StatesFactory.eINSTANCE
				.createExtensionalValue_locus_ExtensionalValue_Value();
		if (o_cast.getLocus_ExtensionalValue() != null) {
			storeAsTracedObject(o_cast.getLocus_ExtensionalValue());
			firstValue_locus_ExtensionalValue
					.setLocus_ExtensionalValue(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
							.get(o_cast.getLocus_ExtensionalValue())));
		}
		traced.getLocus_ExtensionalValueSequence().add(firstValue_locus_ExtensionalValue);
		newState.getExtensionalValue_locus_ExtensionalValue_Values().add(firstValue_locus_ExtensionalValue);

		// Creation of the first value of the field parameterValues
		for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast.getParameterValues()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.Execution_parameterValues_Value firstValue_parameterValues = umlTrace.States.StatesFactory.eINSTANCE
				.createExecution_parameterValues_Value();
		firstValue_parameterValues.getParameterValues()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
						o_cast.getParameterValues()));
		traced.getParameterValuesSequence().add(firstValue_parameterValues);
		newState.getExecution_parameterValues_Values().add(firstValue_parameterValues);

		// Creation of the first value of the field runtimeModelElement
		umlTrace.States.SemanticVisitor_runtimeModelElement_Value firstValue_runtimeModelElement = umlTrace.States.StatesFactory.eINSTANCE
				.createSemanticVisitor_runtimeModelElement_Value();
		if (o_cast.getRuntimeModelElement() != null) {
			storeAsTracedObject(o_cast.getRuntimeModelElement());
			firstValue_runtimeModelElement
					.setRuntimeModelElement(((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
							.get(o_cast.getRuntimeModelElement())));
		}
		traced.getRuntimeModelElementSequence().add(firstValue_runtimeModelElement);
		newState.getSemanticVisitor_runtimeModelElement_Values().add(firstValue_runtimeModelElement);

		// Creation of the first value of the field types
		for (org.eclipse.uml2.uml.Class aValue : o_cast.getTypes()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.Object_types_Value firstValue_types = umlTrace.States.StatesFactory.eINSTANCE
				.createObject_types_Value();
		firstValue_types.getTypes()
				.addAll((Collection<? extends umlTrace.States.uml.TracedClass>) getExeToTraced(o_cast.getTypes()));
		traced.getTypesSequence().add(firstValue_types);
		newState.getObject_types_Values().add(firstValue_types);
	}

	@SuppressWarnings("unchecked")
	private void addNewObjectToState(fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast,
			umlTrace.States.State newState) {
		storeAsTracedObject(o_cast);
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
				.get(o_cast);

		// Creation of the first value of the field edge_ActivityEdgeInstance
		umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value firstValue_edge_ActivityEdgeInstance = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityEdgeInstance_edge_ActivityEdgeInstance_Value();
		if (o_cast.getEdge_ActivityEdgeInstance() != null) {
			storeAsTracedObject(o_cast.getEdge_ActivityEdgeInstance());
			firstValue_edge_ActivityEdgeInstance.setEdge_ActivityEdgeInstance(
					((umlTrace.States.uml.TracedActivityEdge) exeToTraced.get(o_cast.getEdge_ActivityEdgeInstance())));
		}
		traced.getEdge_ActivityEdgeInstanceSequence().add(firstValue_edge_ActivityEdgeInstance);
		newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().add(firstValue_edge_ActivityEdgeInstance);

		// Creation of the first value of the field group_ActivityEdgeInstance
		umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value firstValue_group_ActivityEdgeInstance = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityEdgeInstance_group_ActivityEdgeInstance_Value();
		if (o_cast.getGroup_ActivityEdgeInstance() != null) {
			storeAsTracedObject(o_cast.getGroup_ActivityEdgeInstance());
			firstValue_group_ActivityEdgeInstance.setGroup_ActivityEdgeInstance(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
							.get(o_cast.getGroup_ActivityEdgeInstance())));
		}
		traced.getGroup_ActivityEdgeInstanceSequence().add(firstValue_group_ActivityEdgeInstance);
		newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values().add(firstValue_group_ActivityEdgeInstance);

		// Creation of the first value of the field offers
		for (fumlConfiguration.Activities.IntermediateActivities.Offer aValue : o_cast.getOffers()) {
			storeAsTracedObject(aValue);
		}
		umlTrace.States.ActivityEdgeInstance_offers_Value firstValue_offers = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityEdgeInstance_offers_Value();
		firstValue_offers.getOffers()
				.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer>) getExeToTraced(
						o_cast.getOffers()));
		traced.getOffersSequence().add(firstValue_offers);
		newState.getActivityEdgeInstance_offers_Values().add(firstValue_offers);

		// Creation of the first value of the field source
		umlTrace.States.ActivityEdgeInstance_source_Value firstValue_source = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityEdgeInstance_source_Value();
		if (o_cast.getSource() != null) {
			storeAsTracedObject(o_cast.getSource());
			firstValue_source.setSource(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
							.get(o_cast.getSource())));
		}
		traced.getSourceSequence().add(firstValue_source);
		newState.getActivityEdgeInstance_source_Values().add(firstValue_source);

		// Creation of the first value of the field target
		umlTrace.States.ActivityEdgeInstance_target_Value firstValue_target = umlTrace.States.StatesFactory.eINSTANCE
				.createActivityEdgeInstance_target_Value();
		if (o_cast.getTarget() != null) {
			storeAsTracedObject(o_cast.getTarget());
			firstValue_target.setTarget(
					((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
							.get(o_cast.getTarget())));
		}
		traced.getTargetSequence().add(firstValue_target);
		newState.getActivityEdgeInstance_target_Values().add(firstValue_target);
	}

	private umlTrace.States.State copyState(umlTrace.States.State oldState) {
		umlTrace.States.State newState = umlTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values()
				.addAll(oldState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values());
		newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values()
				.addAll(oldState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values());
		newState.getActivityEdgeInstance_offers_Values().addAll(oldState.getActivityEdgeInstance_offers_Values());
		newState.getActivityEdgeInstance_source_Values().addAll(oldState.getActivityEdgeInstance_source_Values());
		newState.getActivityEdgeInstance_target_Values().addAll(oldState.getActivityEdgeInstance_target_Values());
		newState.getActivityExecution_activationGroup_Values()
				.addAll(oldState.getActivityExecution_activationGroup_Values());
		newState.getExecution_context_Values().addAll(oldState.getExecution_context_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getExecution_parameterValues_Values().addAll(oldState.getExecution_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getActivityNodeActivation_group_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_group_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_heldTokens_Values()
				.addAll(oldState.getActivityNodeActivation_heldTokens_Values());
		newState.getActivityNodeActivation_incomingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_incomingEdges_Values());
		newState.getActivityNodeActivation_isRunning_Values()
				.addAll(oldState.getActivityNodeActivation_isRunning_Values());
		newState.getActivityNodeActivation_node_ActivityNodeActivation_Values()
				.addAll(oldState.getActivityNodeActivation_node_ActivityNodeActivation_Values());
		newState.getActivityNodeActivation_outgoingEdges_Values()
				.addAll(oldState.getActivityNodeActivation_outgoingEdges_Values());
		newState.getActivityNodeActivation_running_Values().addAll(oldState.getActivityNodeActivation_running_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getActivityNodeActivationGroup_activityExecution_Values()
				.addAll(oldState.getActivityNodeActivationGroup_activityExecution_Values());
		newState.getActivityNodeActivationGroup_edgeInstances_Values()
				.addAll(oldState.getActivityNodeActivationGroup_edgeInstances_Values());
		newState.getActivityNodeActivationGroup_nodeActivations_Values()
				.addAll(oldState.getActivityNodeActivationGroup_nodeActivations_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getPrimitiveValue_type_Values().addAll(oldState.getPrimitiveValue_type_Values());
		newState.getBooleanValue_value_BooleanValue_Values()
				.addAll(oldState.getBooleanValue_value_BooleanValue_Values());
		newState.getElementConfiguration_semanticVisitor_Values()
				.addAll(oldState.getElementConfiguration_semanticVisitor_Values());
		newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values()
				.addAll(oldState.getExecutionEnvironment_locus_ExecutionEnvironment_Values());
		newState.getExecutionFactory_builtInTypes_Values().addAll(oldState.getExecutionFactory_builtInTypes_Values());
		newState.getExecutionFactory_locus_ExecutionFactory_Values()
				.addAll(oldState.getExecutionFactory_locus_ExecutionFactory_Values());
		newState.getExecutionFactory_primitiveBehaviorPrototypes_Values()
				.addAll(oldState.getExecutionFactory_primitiveBehaviorPrototypes_Values());
		newState.getExecutor_locus_Executor_Values().addAll(oldState.getExecutor_locus_Executor_Values());
		newState.getForkedToken_baseToken_Values().addAll(oldState.getForkedToken_baseToken_Values());
		newState.getForkedToken_baseTokenIsWithdrawn_Values()
				.addAll(oldState.getForkedToken_baseTokenIsWithdrawn_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getForkedToken_remainingOffersCount_Values()
				.addAll(oldState.getForkedToken_remainingOffersCount_Values());
		newState.getInputParameterValues_name_Values().addAll(oldState.getInputParameterValues_name_Values());
		newState.getInputParameterValues_parameterValues_Values()
				.addAll(oldState.getInputParameterValues_parameterValues_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getPrimitiveValue_type_Values().addAll(oldState.getPrimitiveValue_type_Values());
		newState.getIntegerValue_value_IntegerValue_Values()
				.addAll(oldState.getIntegerValue_value_IntegerValue_Values());
		newState.getLocus_executor_Values().addAll(oldState.getLocus_executor_Values());
		newState.getLocus_extensionalValues_Values().addAll(oldState.getLocus_extensionalValues_Values());
		newState.getLocus_factory_Values().addAll(oldState.getLocus_factory_Values());
		newState.getCompoundValue_featureValues_Values().addAll(oldState.getCompoundValue_featureValues_Values());
		newState.getExtensionalValue_locus_ExtensionalValue_Values()
				.addAll(oldState.getExtensionalValue_locus_ExtensionalValue_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getObject_types_Values().addAll(oldState.getObject_types_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		newState.getObjectToken_value_Values().addAll(oldState.getObjectToken_value_Values());
		newState.getOffer_offeredTokens_Values().addAll(oldState.getOffer_offeredTokens_Values());
		newState.getParameterValue_parameter_ParameterValue_Values()
				.addAll(oldState.getParameterValue_parameter_ParameterValue_Values());
		newState.getParameterValue_values_ParameterValue_Values()
				.addAll(oldState.getParameterValue_values_ParameterValue_Values());
		newState.getReference_referent_Values().addAll(oldState.getReference_referent_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getSemanticVisitor_runtimeModelElement_Values()
				.addAll(oldState.getSemanticVisitor_runtimeModelElement_Values());
		newState.getToken_holder_Values().addAll(oldState.getToken_holder_Values());
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(Set<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			umlTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
						fumlConfiguration.Activities.IntermediateActivities.Token o_cast = (fumlConfiguration.Activities.IntermediateActivities.Token) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getHolder());
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
						fumlConfiguration.Loci.SemanticVisitor o_cast = (fumlConfiguration.Loci.SemanticVisitor) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor traced = (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
						fumlConfiguration.Classes.Kernel.Reference o_cast = (fumlConfiguration.Classes.Kernel.Reference) o;

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getReference_Referent().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
									.get(o);
							umlTrace.States.Reference_referent_Value lastValue = traced.getReferentSequence()
									.get(traced.getReferentSequence().size() - 1);
							newState.getReference_referent_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getReferent());
							umlTrace.States.Reference_referent_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createReference_referent_Value();
							newValue.setReferent(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getReferent())));
							traced.getReferentSequence().add(newValue);
							newState.getReference_referent_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getParameterValue_Parameter_ParameterValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue traced = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
									.get(o);
							umlTrace.States.ParameterValue_parameter_ParameterValue_Value lastValue = traced
									.getParameter_ParameterValueSequence()
									.get(traced.getParameter_ParameterValueSequence().size() - 1);
							newState.getParameterValue_parameter_ParameterValue_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getParameter_ParameterValue());
							umlTrace.States.ParameterValue_parameter_ParameterValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createParameterValue_parameter_ParameterValue_Value();
							newValue.setParameter_ParameterValue(((umlTrace.States.uml.TracedParameter) exeToTraced
									.get(o_cast.getParameter_ParameterValue())));
							traced.getParameter_ParameterValueSequence().add(newValue);
							newState.getParameterValue_parameter_ParameterValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
						fumlConfiguration.Activities.IntermediateActivities.ObjectToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getObjectToken_Value().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
									.get(o);
							umlTrace.States.ObjectToken_value_Value lastValue = traced.getValueSequence()
									.get(traced.getValueSequence().size() - 1);
							newState.getObjectToken_value_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getValue());
							umlTrace.States.ObjectToken_value_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createObjectToken_value_Value();
							newValue.setValue(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue) exeToTraced
											.get(o_cast.getValue())));
							traced.getValueSequence().add(newValue);
							newState.getObjectToken_value_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getHolder());
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getLocus_ExtensionalValue());
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus_Factory()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o);
							umlTrace.States.Locus_factory_Value lastValue = traced.getFactorySequence()
									.get(traced.getFactorySequence().size() - 1);
							newState.getLocus_factory_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getFactory());
							umlTrace.States.Locus_factory_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createLocus_factory_Value();
							newValue.setFactory(
									((umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
											.get(o_cast.getFactory())));
							traced.getFactorySequence().add(newValue);
							newState.getLocus_factory_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE.getLocus_Executor()
								.getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedLocus traced = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o);
							umlTrace.States.Locus_executor_Value lastValue = traced.getExecutorSequence()
									.get(traced.getExecutorSequence().size() - 1);
							newState.getLocus_executor_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getExecutor());
							umlTrace.States.Locus_executor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createLocus_executor_Value();
							newValue.setExecutor(((umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
									.get(o_cast.getExecutor())));
							traced.getExecutorSequence().add(newValue);
							newState.getLocus_executor_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
						fumlConfiguration.Classes.Kernel.IntegerValue o_cast = (fumlConfiguration.Classes.Kernel.IntegerValue) o;

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getIntegerValue_Value_IntegerValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.IntegerValue_value_IntegerValue_Value lastValue = traced
									.getValue_IntegerValueSequence()
									.get(traced.getValue_IntegerValueSequence().size() - 1);
							newState.getIntegerValue_value_IntegerValue_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.IntegerValue_value_IntegerValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createIntegerValue_value_IntegerValue_Value();
							newValue.setValue_IntegerValue(o_cast.getValue_IntegerValue());
							traced.getValue_IntegerValueSequence().add(newValue);
							newState.getIntegerValue_value_IntegerValue_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue_Type().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.PrimitiveValue_type_Value lastValue = traced.getTypeSequence()
									.get(traced.getTypeSequence().size() - 1);
							newState.getPrimitiveValue_type_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getType());
							umlTrace.States.PrimitiveValue_type_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPrimitiveValue_type_Value();
							newValue.setType(
									((umlTrace.States.uml.TracedPrimitiveType) exeToTraced.get(o_cast.getType())));
							traced.getTypeSequence().add(newValue);
							newState.getPrimitiveValue_type_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;

						if (p.getFeatureID() == fumlConfiguration.Input.InputPackage.eINSTANCE
								.getInputParameterValues_Name().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues traced = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
									.get(o);
							umlTrace.States.InputParameterValues_name_Value lastValue = traced.getNameSequence()
									.get(traced.getNameSequence().size() - 1);
							newState.getInputParameterValues_name_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.InputParameterValues_name_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createInputParameterValues_name_Value();
							newValue.setName(o_cast.getName());
							traced.getNameSequence().add(newValue);
							newState.getInputParameterValues_name_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
						fumlConfiguration.Activities.IntermediateActivities.ForkedToken o_cast = (fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_RemainingOffersCount().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_remainingOffersCount_Value lastValue = traced
									.getRemainingOffersCountSequence()
									.get(traced.getRemainingOffersCountSequence().size() - 1);
							newState.getForkedToken_remainingOffersCount_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ForkedToken_remainingOffersCount_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_remainingOffersCount_Value();
							newValue.setRemainingOffersCount(o_cast.getRemainingOffersCount());
							traced.getRemainingOffersCountSequence().add(newValue);
							newState.getForkedToken_remainingOffersCount_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_BaseTokenIsWithdrawn().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value lastValue = traced
									.getBaseTokenIsWithdrawnSequence()
									.get(traced.getBaseTokenIsWithdrawnSequence().size() - 1);
							newState.getForkedToken_baseTokenIsWithdrawn_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ForkedToken_baseTokenIsWithdrawn_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseTokenIsWithdrawn_Value();
							newValue.setBaseTokenIsWithdrawn(o_cast.isBaseTokenIsWithdrawn());
							traced.getBaseTokenIsWithdrawnSequence().add(newValue);
							newState.getForkedToken_baseTokenIsWithdrawn_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getForkedToken_BaseToken().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.ForkedToken_baseToken_Value lastValue = traced.getBaseTokenSequence()
									.get(traced.getBaseTokenSequence().size() - 1);
							newState.getForkedToken_baseToken_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getBaseToken());
							umlTrace.States.ForkedToken_baseToken_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createForkedToken_baseToken_Value();
							newValue.setBaseToken(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken) exeToTraced
											.get(o_cast.getBaseToken())));
							traced.getBaseTokenSequence().add(newValue);
							newState.getForkedToken_baseToken_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getToken_Holder().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken) exeToTraced
									.get(o);
							umlTrace.States.Token_holder_Value lastValue = traced.getHolderSequence()
									.get(traced.getHolderSequence().size() - 1);
							newState.getToken_holder_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getHolder());
							umlTrace.States.Token_holder_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createToken_holder_Value();
							newValue.setHolder(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getHolder())));
							traced.getHolderSequence().add(newValue);
							newState.getToken_holder_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.Executor) {
						fumlConfiguration.Loci.Executor o_cast = (fumlConfiguration.Loci.Executor) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutor_Locus_Executor().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutor traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutor) exeToTraced
									.get(o);
							umlTrace.States.Executor_locus_Executor_Value lastValue = traced.getLocus_ExecutorSequence()
									.get(traced.getLocus_ExecutorSequence().size() - 1);
							newState.getExecutor_locus_Executor_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getLocus_Executor());
							umlTrace.States.Executor_locus_Executor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutor_locus_Executor_Value();
							newValue.setLocus_Executor(((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
									.get(o_cast.getLocus_Executor())));
							traced.getLocus_ExecutorSequence().add(newValue);
							newState.getExecutor_locus_Executor_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_Locus_ExecutionFactory().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
									.get(o);
							umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value lastValue = traced
									.getLocus_ExecutionFactorySequence()
									.get(traced.getLocus_ExecutionFactorySequence().size() - 1);
							newState.getExecutionFactory_locus_ExecutionFactory_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getLocus_ExecutionFactory());
							umlTrace.States.ExecutionFactory_locus_ExecutionFactory_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutionFactory_locus_ExecutionFactory_Value();
							newValue.setLocus_ExecutionFactory(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExecutionFactory())));
							traced.getLocus_ExecutionFactorySequence().add(newValue);
							newState.getExecutionFactory_locus_ExecutionFactory_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
						fumlConfiguration.Loci.ExecutionEnvironment o_cast = (fumlConfiguration.Loci.ExecutionEnvironment) o;

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionEnvironment_Locus_ExecutionEnvironment().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment traced = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment) exeToTraced
									.get(o);
							umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value lastValue = traced
									.getLocus_ExecutionEnvironmentSequence()
									.get(traced.getLocus_ExecutionEnvironmentSequence().size() - 1);
							newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getLocus_ExecutionEnvironment());
							umlTrace.States.ExecutionEnvironment_locus_ExecutionEnvironment_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecutionEnvironment_locus_ExecutionEnvironment_Value();
							newValue.setLocus_ExecutionEnvironment(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExecutionEnvironment())));
							traced.getLocus_ExecutionEnvironmentSequence().add(newValue);
							newState.getExecutionEnvironment_locus_ExecutionEnvironment_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
						fumlConfiguration.Classes.Kernel.BooleanValue o_cast = (fumlConfiguration.Classes.Kernel.BooleanValue) o;

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getPrimitiveValue_Type().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.PrimitiveValue_type_Value lastValue = traced.getTypeSequence()
									.get(traced.getTypeSequence().size() - 1);
							newState.getPrimitiveValue_type_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getType());
							umlTrace.States.PrimitiveValue_type_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createPrimitiveValue_type_Value();
							newValue.setType(
									((umlTrace.States.uml.TracedPrimitiveType) exeToTraced.get(o_cast.getType())));
							traced.getTypeSequence().add(newValue);
							newState.getPrimitiveValue_type_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getBooleanValue_Value_BooleanValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue traced = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue) exeToTraced
									.get(o);
							umlTrace.States.BooleanValue_value_BooleanValue_Value lastValue = traced
									.getValue_BooleanValueSequence()
									.get(traced.getValue_BooleanValueSequence().size() - 1);
							newState.getBooleanValue_value_BooleanValue_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.BooleanValue_value_BooleanValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createBooleanValue_value_BooleanValue_Value();
							newValue.setValue_BooleanValue(o_cast.isValue_BooleanValue());
							traced.getValue_BooleanValueSequence().add(newValue);
							newState.getBooleanValue_value_BooleanValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_ActivityExecution().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value lastValue = traced
									.getActivityExecutionSequence()
									.get(traced.getActivityExecutionSequence().size() - 1);
							newState.getActivityNodeActivationGroup_activityExecution_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getActivityExecution());
							umlTrace.States.ActivityNodeActivationGroup_activityExecution_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivationGroup_activityExecution_Value();
							newValue.setActivityExecution(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
											.get(o_cast.getActivityExecution())));
							traced.getActivityExecutionSequence().add(newValue);
							newState.getActivityNodeActivationGroup_activityExecution_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Node_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value lastValue = traced
									.getNode_ActivityNodeActivationSequence()
									.get(traced.getNode_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getNode_ActivityNodeActivation());
							umlTrace.States.ActivityNodeActivation_node_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_node_ActivityNodeActivation_Value();
							newValue.setNode_ActivityNodeActivation(
									((umlTrace.States.uml.TracedActivityNode) exeToTraced
											.get(o_cast.getNode_ActivityNodeActivation())));
							traced.getNode_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_node_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Running().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_running_Value lastValue = traced.getRunningSequence()
									.get(traced.getRunningSequence().size() - 1);
							newState.getActivityNodeActivation_running_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_running_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_running_Value();
							newValue.setRunning(o_cast.isRunning());
							traced.getRunningSequence().add(newValue);
							newState.getActivityNodeActivation_running_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_Group_ActivityNodeActivation().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value lastValue = traced
									.getGroup_ActivityNodeActivationSequence()
									.get(traced.getGroup_ActivityNodeActivationSequence().size() - 1);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getGroup_ActivityNodeActivation());
							umlTrace.States.ActivityNodeActivation_group_ActivityNodeActivation_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_group_ActivityNodeActivation_Value();
							newValue.setGroup_ActivityNodeActivation(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityNodeActivation())));
							traced.getGroup_ActivityNodeActivationSequence().add(newValue);
							newState.getActivityNodeActivation_group_ActivityNodeActivation_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IsRunning().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
									.get(o);
							umlTrace.States.ActivityNodeActivation_isRunning_Value lastValue = traced
									.getIsRunningSequence().get(traced.getIsRunningSequence().size() - 1);
							newState.getActivityNodeActivation_isRunning_Values().remove(lastValue);

							// And we create a proper new value
							umlTrace.States.ActivityNodeActivation_isRunning_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityNodeActivation_isRunning_Value();
							newValue.setIsRunning(o_cast.isIsRunning());
							traced.getIsRunningSequence().add(newValue);
							newState.getActivityNodeActivation_isRunning_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;

						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_Context().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.Execution_context_Value lastValue = traced.getContextSequence()
									.get(traced.getContextSequence().size() - 1);
							newState.getExecution_context_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getContext());
							umlTrace.States.Execution_context_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExecution_context_Value();
							newValue.setContext(
									((umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
											.get(o_cast.getContext())));
							traced.getContextSequence().add(newValue);
							newState.getExecution_context_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getSemanticVisitor_RuntimeModelElement().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value lastValue = traced
									.getRuntimeModelElementSequence()
									.get(traced.getRuntimeModelElementSequence().size() - 1);
							newState.getSemanticVisitor_runtimeModelElement_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getRuntimeModelElement());
							umlTrace.States.SemanticVisitor_runtimeModelElement_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createSemanticVisitor_runtimeModelElement_Value();
							newValue.setRuntimeModelElement(
									((umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
											.get(o_cast.getRuntimeModelElement())));
							traced.getRuntimeModelElementSequence().add(newValue);
							newState.getSemanticVisitor_runtimeModelElement_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityExecution_ActivationGroup().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.ActivityExecution_activationGroup_Value lastValue = traced
									.getActivationGroupSequence().get(traced.getActivationGroupSequence().size() - 1);
							newState.getActivityExecution_activationGroup_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getActivationGroup());
							umlTrace.States.ActivityExecution_activationGroup_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityExecution_activationGroup_Value();
							newValue.setActivationGroup(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getActivationGroup())));
							traced.getActivationGroupSequence().add(newValue);
							newState.getActivityExecution_activationGroup_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getExtensionalValue_Locus_ExtensionalValue().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
									.get(o);
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value lastValue = traced
									.getLocus_ExtensionalValueSequence()
									.get(traced.getLocus_ExtensionalValueSequence().size() - 1);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getLocus_ExtensionalValue());
							umlTrace.States.ExtensionalValue_locus_ExtensionalValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createExtensionalValue_locus_ExtensionalValue_Value();
							newValue.setLocus_ExtensionalValue(
									((umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
											.get(o_cast.getLocus_ExtensionalValue())));
							traced.getLocus_ExtensionalValueSequence().add(newValue);
							newState.getExtensionalValue_locus_ExtensionalValue_Values().add(newValue);
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Source().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_source_Value lastValue = traced.getSourceSequence()
									.get(traced.getSourceSequence().size() - 1);
							newState.getActivityEdgeInstance_source_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getSource());
							umlTrace.States.ActivityEdgeInstance_source_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_source_Value();
							newValue.setSource(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getSource())));
							traced.getSourceSequence().add(newValue);
							newState.getActivityEdgeInstance_source_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Group_ActivityEdgeInstance().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value lastValue = traced
									.getGroup_ActivityEdgeInstanceSequence()
									.get(traced.getGroup_ActivityEdgeInstanceSequence().size() - 1);
							newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getGroup_ActivityEdgeInstance());
							umlTrace.States.ActivityEdgeInstance_group_ActivityEdgeInstance_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_group_ActivityEdgeInstance_Value();
							newValue.setGroup_ActivityEdgeInstance(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
											.get(o_cast.getGroup_ActivityEdgeInstance())));
							traced.getGroup_ActivityEdgeInstanceSequence().add(newValue);
							newState.getActivityEdgeInstance_group_ActivityEdgeInstance_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Edge_ActivityEdgeInstance().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value lastValue = traced
									.getEdge_ActivityEdgeInstanceSequence()
									.get(traced.getEdge_ActivityEdgeInstanceSequence().size() - 1);
							newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getEdge_ActivityEdgeInstance());
							umlTrace.States.ActivityEdgeInstance_edge_ActivityEdgeInstance_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_edge_ActivityEdgeInstance_Value();
							newValue.setEdge_ActivityEdgeInstance(((umlTrace.States.uml.TracedActivityEdge) exeToTraced
									.get(o_cast.getEdge_ActivityEdgeInstance())));
							traced.getEdge_ActivityEdgeInstanceSequence().add(newValue);
							newState.getActivityEdgeInstance_edge_ActivityEdgeInstance_Values().add(newValue);
						}

						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Target().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance traced = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
									.get(o);
							umlTrace.States.ActivityEdgeInstance_target_Value lastValue = traced.getTargetSequence()
									.get(traced.getTargetSequence().size() - 1);
							newState.getActivityEdgeInstance_target_Values().remove(lastValue);

							// And we create a proper new value
							storeAsTracedObject(o_cast.getTarget());
							umlTrace.States.ActivityEdgeInstance_target_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
									.createActivityEdgeInstance_target_Value();
							newValue.setTarget(
									((umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
											.get(o_cast.getTarget())));
							traced.getTargetSequence().add(newValue);
							newState.getActivityEdgeInstance_target_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
						fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o_cast = (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o;
						umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject = (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getParameterValue_Values_ParameterValue().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ParameterValue_values_ParameterValue_Value> valueSequence = tracedObject
									.getValues_ParameterValueSequence();
							umlTrace.States.ParameterValue_values_ParameterValue_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.Value aValue : o_cast.getValues_ParameterValue()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getValues_ParameterValue().size() == o_cast.getValues_ParameterValue()
										.size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.Value> it = o_cast
											.getValues_ParameterValue().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue aPreviousValue : previousValue
											.getValues_ParameterValue()) {
										fumlConfiguration.Classes.Kernel.Value aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ParameterValue_values_ParameterValue_Value lastValue = tracedObject
										.getValues_ParameterValueSequence()
										.get(tracedObject.getValues_ParameterValueSequence().size() - 1);
								newState.getParameterValue_values_ParameterValue_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ParameterValue_values_ParameterValue_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createParameterValue_values_ParameterValue_Value();
								newValue.getValues_ParameterValue()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedValue>) getExeToTraced(
												o_cast.getValues_ParameterValue()));
								tracedObject.getValues_ParameterValueSequence().add(newValue);
								newState.getParameterValue_values_ParameterValue_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
						fumlConfiguration.Activities.IntermediateActivities.Offer o_cast = (fumlConfiguration.Activities.IntermediateActivities.Offer) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getOffer_OfferedTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Offer_offeredTokens_Value> valueSequence = tracedObject
									.getOfferedTokensSequence();
							umlTrace.States.Offer_offeredTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getOfferedTokens()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOfferedTokens().size() == o_cast.getOfferedTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getOfferedTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getOfferedTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.Offer_offeredTokens_Value lastValue = tracedObject
										.getOfferedTokensSequence()
										.get(tracedObject.getOfferedTokensSequence().size() - 1);
								newState.getOffer_offeredTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Offer_offeredTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createOffer_offeredTokens_Value();
								newValue.getOfferedTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getOfferedTokens()));
								tracedObject.getOfferedTokensSequence().add(newValue);
								newState.getOffer_offeredTokens_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
						fumlConfiguration.Classes.Kernel.Object o_cast = (fumlConfiguration.Classes.Kernel.Object) o;
						umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject = (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.eclipse.uml2.uml.Class aValue : o_cast.getTypes()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (umlTrace.States.uml.TracedClass aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends umlTrace.States.uml.TracedClass>) getExeToTraced(
												o_cast.getTypes()));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues()));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Loci.Locus) {
						fumlConfiguration.Loci.Locus o_cast = (fumlConfiguration.Loci.Locus) o;
						umlTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject = (umlTrace.States.fumlConfiguration.Loci.TracedLocus) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getLocus_ExtensionalValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Locus_extensionalValues_Value> valueSequence = tracedObject
									.getExtensionalValuesSequence();
							umlTrace.States.Locus_extensionalValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.ExtensionalValue aValue : o_cast
									.getExtensionalValues()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getExtensionalValues().size() == o_cast.getExtensionalValues()
										.size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.ExtensionalValue> it = o_cast
											.getExtensionalValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue aPreviousValue : previousValue
											.getExtensionalValues()) {
										fumlConfiguration.Classes.Kernel.ExtensionalValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.Locus_extensionalValues_Value lastValue = tracedObject
										.getExtensionalValuesSequence()
										.get(tracedObject.getExtensionalValuesSequence().size() - 1);
								newState.getLocus_extensionalValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Locus_extensionalValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createLocus_extensionalValues_Value();
								newValue.getExtensionalValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedExtensionalValue>) getExeToTraced(
												o_cast.getExtensionalValues()));
								tracedObject.getExtensionalValuesSequence().add(newValue);
								newState.getLocus_extensionalValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Input.InputParameterValues) {
						fumlConfiguration.Input.InputParameterValues o_cast = (fumlConfiguration.Input.InputParameterValues) o;
						umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject = (umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Input.InputPackage.eINSTANCE
								.getInputParameterValues_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.InputParameterValues_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.InputParameterValues_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.InputParameterValues_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getInputParameterValues_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.InputParameterValues_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createInputParameterValues_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues()));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getInputParameterValues_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
						fumlConfiguration.Loci.ExecutionFactory o_cast = (fumlConfiguration.Loci.ExecutionFactory) o;
						umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject = (umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_BuiltInTypes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ExecutionFactory_builtInTypes_Value> valueSequence = tracedObject
									.getBuiltInTypesSequence();
							umlTrace.States.ExecutionFactory_builtInTypes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.eclipse.uml2.uml.PrimitiveType aValue : o_cast.getBuiltInTypes()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getBuiltInTypes().size() == o_cast.getBuiltInTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.PrimitiveType> it = o_cast.getBuiltInTypes()
											.iterator();
									for (umlTrace.States.uml.TracedPrimitiveType aPreviousValue : previousValue
											.getBuiltInTypes()) {
										org.eclipse.uml2.uml.PrimitiveType aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ExecutionFactory_builtInTypes_Value lastValue = tracedObject
										.getBuiltInTypesSequence()
										.get(tracedObject.getBuiltInTypesSequence().size() - 1);
								newState.getExecutionFactory_builtInTypes_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ExecutionFactory_builtInTypes_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecutionFactory_builtInTypes_Value();
								newValue.getBuiltInTypes()
										.addAll((Collection<? extends umlTrace.States.uml.TracedPrimitiveType>) getExeToTraced(
												o_cast.getBuiltInTypes()));
								tracedObject.getBuiltInTypesSequence().add(newValue);
								newState.getExecutionFactory_builtInTypes_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Loci.LociPackage.eINSTANCE
								.getExecutionFactory_PrimitiveBehaviorPrototypes().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value> valueSequence = tracedObject
									.getPrimitiveBehaviorPrototypesSequence();
							umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aValue : o_cast
									.getPrimitiveBehaviorPrototypes()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getPrimitiveBehaviorPrototypes().size() == o_cast
										.getPrimitiveBehaviorPrototypes().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution> it = o_cast
											.getPrimitiveBehaviorPrototypes().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution aPreviousValue : previousValue
											.getPrimitiveBehaviorPrototypes()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.OpaqueBehaviorExecution aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value lastValue = tracedObject
										.getPrimitiveBehaviorPrototypesSequence()
										.get(tracedObject.getPrimitiveBehaviorPrototypesSequence().size() - 1);
								newState.getExecutionFactory_primitiveBehaviorPrototypes_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ExecutionFactory_primitiveBehaviorPrototypes_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecutionFactory_primitiveBehaviorPrototypes_Value();
								newValue.getPrimitiveBehaviorPrototypes()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedOpaqueBehaviorExecution>) getExeToTraced(
												o_cast.getPrimitiveBehaviorPrototypes()));
								tracedObject.getPrimitiveBehaviorPrototypesSequence().add(newValue);
								newState.getExecutionFactory_primitiveBehaviorPrototypes_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.ElementConfiguration) {
						fumlConfiguration.ElementConfiguration o_cast = (fumlConfiguration.ElementConfiguration) o;
						umlTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject = (umlTrace.States.fumlConfiguration.TracedElementConfiguration) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.FumlConfigurationPackage.eINSTANCE
								.getElementConfiguration_SemanticVisitor().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ElementConfiguration_semanticVisitor_Value> valueSequence = tracedObject
									.getSemanticVisitorSequence();
							umlTrace.States.ElementConfiguration_semanticVisitor_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Loci.SemanticVisitor aValue : o_cast.getSemanticVisitor()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getSemanticVisitor().size() == o_cast.getSemanticVisitor().size()) {
									java.util.Iterator<fumlConfiguration.Loci.SemanticVisitor> it = o_cast
											.getSemanticVisitor().iterator();
									for (umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor aPreviousValue : previousValue
											.getSemanticVisitor()) {
										fumlConfiguration.Loci.SemanticVisitor aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ElementConfiguration_semanticVisitor_Value lastValue = tracedObject
										.getSemanticVisitorSequence()
										.get(tracedObject.getSemanticVisitorSequence().size() - 1);
								newState.getElementConfiguration_semanticVisitor_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ElementConfiguration_semanticVisitor_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createElementConfiguration_semanticVisitor_Value();
								newValue.getSemanticVisitor()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor>) getExeToTraced(
												o_cast.getSemanticVisitor()));
								tracedObject.getSemanticVisitorSequence().add(newValue);
								newState.getElementConfiguration_semanticVisitor_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_EdgeInstances().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value> valueSequence = tracedObject
									.getEdgeInstancesSequence();
							umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getEdgeInstances()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getEdgeInstances().size() == o_cast.getEdgeInstances().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getEdgeInstances().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getEdgeInstances()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value lastValue = tracedObject
										.getEdgeInstancesSequence()
										.get(tracedObject.getEdgeInstancesSequence().size() - 1);
								newState.getActivityNodeActivationGroup_edgeInstances_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivationGroup_edgeInstances_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivationGroup_edgeInstances_Value();
								newValue.getEdgeInstances()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getEdgeInstances()));
								tracedObject.getEdgeInstancesSequence().add(newValue);
								newState.getActivityNodeActivationGroup_edgeInstances_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivationGroup_NodeActivations().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value> valueSequence = tracedObject
									.getNodeActivationsSequence();
							umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aValue : o_cast
									.getNodeActivations()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getNodeActivations().size() == o_cast.getNodeActivations().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation> it = o_cast
											.getNodeActivations().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation aPreviousValue : previousValue
											.getNodeActivations()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value lastValue = tracedObject
										.getNodeActivationsSequence()
										.get(tracedObject.getNodeActivationsSequence().size() - 1);
								newState.getActivityNodeActivationGroup_nodeActivations_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivationGroup_nodeActivations_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivationGroup_nodeActivations_Value();
								newValue.getNodeActivations()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation>) getExeToTraced(
												o_cast.getNodeActivations()));
								tracedObject.getNodeActivationsSequence().add(newValue);
								newState.getActivityNodeActivationGroup_nodeActivations_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_HeldTokens().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_heldTokens_Value> valueSequence = tracedObject
									.getHeldTokensSequence();
							umlTrace.States.ActivityNodeActivation_heldTokens_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Token aValue : o_cast
									.getHeldTokens()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getHeldTokens().size() == o_cast.getHeldTokens().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Token> it = o_cast
											.getHeldTokens().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken aPreviousValue : previousValue
											.getHeldTokens()) {
										fumlConfiguration.Activities.IntermediateActivities.Token aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityNodeActivation_heldTokens_Value lastValue = tracedObject
										.getHeldTokensSequence().get(tracedObject.getHeldTokensSequence().size() - 1);
								newState.getActivityNodeActivation_heldTokens_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_heldTokens_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_heldTokens_Value();
								newValue.getHeldTokens()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken>) getExeToTraced(
												o_cast.getHeldTokens()));
								tracedObject.getHeldTokensSequence().add(newValue);
								newState.getActivityNodeActivation_heldTokens_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_IncomingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_incomingEdges_Value> valueSequence = tracedObject
									.getIncomingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_incomingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getIncomingEdges()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getIncomingEdges().size() == o_cast.getIncomingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getIncomingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getIncomingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value lastValue = tracedObject
										.getIncomingEdgesSequence()
										.get(tracedObject.getIncomingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_incomingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_incomingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_incomingEdges_Value();
								newValue.getIncomingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getIncomingEdges()));
								tracedObject.getIncomingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_incomingEdges_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityNodeActivation_OutgoingEdges().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityNodeActivation_outgoingEdges_Value> valueSequence = tracedObject
									.getOutgoingEdgesSequence();
							umlTrace.States.ActivityNodeActivation_outgoingEdges_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aValue : o_cast
									.getOutgoingEdges()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutgoingEdges().size() == o_cast.getOutgoingEdges().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance> it = o_cast
											.getOutgoingEdges().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance aPreviousValue : previousValue
											.getOutgoingEdges()) {
										fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value lastValue = tracedObject
										.getOutgoingEdgesSequence()
										.get(tracedObject.getOutgoingEdgesSequence().size() - 1);
								newState.getActivityNodeActivation_outgoingEdges_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityNodeActivation_outgoingEdges_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityNodeActivation_outgoingEdges_Value();
								newValue.getOutgoingEdges()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance>) getExeToTraced(
												o_cast.getOutgoingEdges()));
								tracedObject.getOutgoingEdgesSequence().add(newValue);
								newState.getActivityNodeActivation_outgoingEdges_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getObject_Types().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Object_types_Value> valueSequence = tracedObject.getTypesSequence();
							umlTrace.States.Object_types_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (org.eclipse.uml2.uml.Class aValue : o_cast.getTypes()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getTypes().size() == o_cast.getTypes().size()) {
									java.util.Iterator<org.eclipse.uml2.uml.Class> it = o_cast.getTypes().iterator();
									for (umlTrace.States.uml.TracedClass aPreviousValue : previousValue.getTypes()) {
										org.eclipse.uml2.uml.Class aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.Object_types_Value lastValue = tracedObject.getTypesSequence()
										.get(tracedObject.getTypesSequence().size() - 1);
								newState.getObject_types_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Object_types_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createObject_types_Value();
								newValue.getTypes()
										.addAll((Collection<? extends umlTrace.States.uml.TracedClass>) getExeToTraced(
												o_cast.getTypes()));
								tracedObject.getTypesSequence().add(newValue);
								newState.getObject_types_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.Classes.Kernel.KernelPackage.eINSTANCE
								.getCompoundValue_FeatureValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.CompoundValue_featureValues_Value> valueSequence = tracedObject
									.getFeatureValuesSequence();
							umlTrace.States.CompoundValue_featureValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Classes.Kernel.FeatureValue aValue : o_cast.getFeatureValues()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getFeatureValues().size() == o_cast.getFeatureValues().size()) {
									java.util.Iterator<fumlConfiguration.Classes.Kernel.FeatureValue> it = o_cast
											.getFeatureValues().iterator();
									for (umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue aPreviousValue : previousValue
											.getFeatureValues()) {
										fumlConfiguration.Classes.Kernel.FeatureValue aCurrentValue = it.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.CompoundValue_featureValues_Value lastValue = tracedObject
										.getFeatureValuesSequence()
										.get(tracedObject.getFeatureValuesSequence().size() - 1);
								newState.getCompoundValue_featureValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.CompoundValue_featureValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createCompoundValue_featureValues_Value();
								newValue.getFeatureValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Classes.Kernel.TracedFeatureValue>) getExeToTraced(
												o_cast.getFeatureValues()));
								tracedObject.getFeatureValuesSequence().add(newValue);
								newState.getCompoundValue_featureValues_Values().add(newValue);
							}
						}
						if (p.getFeatureID() == fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage.eINSTANCE
								.getExecution_ParameterValues().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.Execution_parameterValues_Value> valueSequence = tracedObject
									.getParameterValuesSequence();
							umlTrace.States.Execution_parameterValues_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aValue : o_cast
									.getParameterValues()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getParameterValues().size() == o_cast.getParameterValues().size()) {
									java.util.Iterator<fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue> it = o_cast
											.getParameterValues().iterator();
									for (umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue aPreviousValue : previousValue
											.getParameterValues()) {
										fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.Execution_parameterValues_Value lastValue = tracedObject
										.getParameterValuesSequence()
										.get(tracedObject.getParameterValuesSequence().size() - 1);
								newState.getExecution_parameterValues_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.Execution_parameterValues_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createExecution_parameterValues_Value();
								newValue.getParameterValues()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue>) getExeToTraced(
												o_cast.getParameterValues()));
								tracedObject.getParameterValuesSequence().add(newValue);
								newState.getExecution_parameterValues_Values().add(newValue);
							}
						}
					} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
						fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o_cast = (fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o;
						umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject = (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage.eINSTANCE
								.getActivityEdgeInstance_Offers().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<umlTrace.States.ActivityEdgeInstance_offers_Value> valueSequence = tracedObject
									.getOffersSequence();
							umlTrace.States.ActivityEdgeInstance_offers_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							for (fumlConfiguration.Activities.IntermediateActivities.Offer aValue : o_cast
									.getOffers()) {
								storeAsTracedObject(aValue);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOffers().size() == o_cast.getOffers().size()) {
									java.util.Iterator<fumlConfiguration.Activities.IntermediateActivities.Offer> it = o_cast
											.getOffers().iterator();
									for (umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer aPreviousValue : previousValue
											.getOffers()) {
										fumlConfiguration.Activities.IntermediateActivities.Offer aCurrentValue = it
												.next();
										if (aPreviousValue != exeToTraced.get(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								umlTrace.States.ActivityEdgeInstance_offers_Value lastValue = tracedObject
										.getOffersSequence().get(tracedObject.getOffersSequence().size() - 1);
								newState.getActivityEdgeInstance_offers_Values().remove(lastValue);
								// And we create a proper new value							
								umlTrace.States.ActivityEdgeInstance_offers_Value newValue = umlTrace.States.StatesFactory.eINSTANCE
										.createActivityEdgeInstance_offers_Value();
								newValue.getOffers()
										.addAll((Collection<? extends umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer>) getExeToTraced(
												o_cast.getOffers()));
								tracedObject.getOffersSequence().add(newValue);
								newState.getActivityEdgeInstance_offers_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final umlTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof org.gemoc.executionframework.engine.mse.BigStep) {
					final umlTrace.States.State startingState = lastState;
					final umlTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(org.gemoc.executionframework.engine.mse.Step step) {
		umlTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof umlTrace.Steps.SpecificStep) {
			step_cast = (umlTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			umlTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<umlTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(umlTrace.Steps.SpecificStep currentStep, umlTrace.States.State startingState,
			umlTrace.States.State endingState) {

	}

	@Override
	public void endStep(org.gemoc.executionframework.engine.mse.Step step) {
		umlTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = umlTrace.UmlTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		org.gemoc.executionframework.engine.mse.SequentialStep<umlTrace.Steps.SpecificStep> rootStep = org.gemoc.executionframework.engine.mse.MseFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityEdgeInstance tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityEdgeInstance();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityEdgeInstances().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.ActivityExecution o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityExecution tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityExecution();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityExecutions().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivation tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityNodeActivation();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityNodeActivations().add(tracedObject);
		}
	}

	private void storeAsTracedObject(
			fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedActivityNodeActivationGroup tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedActivityNodeActivationGroup();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedActivityNodeActivationGroups().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Classes.Kernel.BooleanValue o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedBooleanValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedBooleanValue();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getKernel_tracedBooleanValues().add(tracedObject);
		}
	}

	private void storeAsTracedObject(org.eclipse.uml2.uml.Class o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.uml.TracedClass tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.uml.UmlFactory.eINSTANCE.createTracedClass();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getUml_tracedClasss().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.ElementConfiguration o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.TracedElementConfiguration tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.FumlConfigurationFactory.eINSTANCE
					.createTracedElementConfiguration();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getFumlConfiguration_tracedElementConfigurations().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Loci.ExecutionEnvironment o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Loci.TracedExecutionEnvironment tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE
					.createTracedExecutionEnvironment();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getLoci_tracedExecutionEnvironments().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Loci.ExecutionFactory o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Loci.TracedExecutionFactory tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE.createTracedExecutionFactory();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getLoci_tracedExecutionFactorys().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Loci.Executor o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Loci.TracedExecutor tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE.createTracedExecutor();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getLoci_tracedExecutors().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.ForkedToken o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedForkedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedForkedToken();
			tracedObject.setOriginalObject_Token(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedForkedTokens().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Input.InputParameterValues o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Input.TracedInputParameterValues tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Input.InputFactory.eINSTANCE
					.createTracedInputParameterValues();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getInput_tracedInputParameterValuess().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Classes.Kernel.IntegerValue o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedIntegerValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedIntegerValue();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getKernel_tracedIntegerValues().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Loci.Locus o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Loci.TracedLocus tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE.createTracedLocus();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getLoci_tracedLocuss().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Classes.Kernel.Object o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedObject tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedObject();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getKernel_tracedObjects().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.ObjectToken o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedObjectToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedObjectToken();
			tracedObject.setOriginalObject_Token(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedObjectTokens().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.Offer o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedOffer tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedOffer();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedOffers().add(tracedObject);
		}
	}

	private void storeAsTracedObject(org.eclipse.uml2.uml.Parameter o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.uml.TracedParameter tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.uml.UmlFactory.eINSTANCE.createTracedParameter();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getUml_tracedParameters().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.TracedParameterValue tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.CommonBehaviors.BasicBehaviors.BasicBehaviorsFactory.eINSTANCE
					.createTracedParameterValue();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getBasicBehaviors_tracedParameterValues().add(tracedObject);
		}
	}

	private void storeAsTracedObject(org.eclipse.uml2.uml.PrimitiveType o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.uml.TracedPrimitiveType tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.uml.UmlFactory.eINSTANCE.createTracedPrimitiveType();
			tracedObject.setOriginalObject(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getUml_tracedPrimitiveTypes().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Classes.Kernel.Reference o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Classes.Kernel.TracedReference tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Classes.Kernel.KernelFactory.eINSTANCE
					.createTracedReference();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getKernel_tracedReferences().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Loci.SemanticVisitor o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Loci.TracedSemanticVisitor tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Loci.LociFactory.eINSTANCE.createTracedSemanticVisitor();
			tracedObject.setOriginalObject_SemanticVisitor(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getLoci_tracedSemanticVisitors().add(tracedObject);
		}
	}

	private void storeAsTracedObject(fumlConfiguration.Activities.IntermediateActivities.Token o) {
		// First we find the traced object, and we create it if required
		umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken tracedObject;
		if (!exeToTraced.containsKey(o)) {
			tracedObject = umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesFactory.eINSTANCE
					.createTracedToken();
			tracedObject.setOriginalObject_Token(o);
			exeToTraced.put(o, tracedObject);
			traceRoot.getIntermediateActivities_tracedTokens().add(tracedObject);
		}
	}

	private void storeAsTracedObject(EObject o) {
		if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Token) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.Token) o);
		} else if (o instanceof fumlConfiguration.Loci.SemanticVisitor) {
			storeAsTracedObject((fumlConfiguration.Loci.SemanticVisitor) o);
		} else if (o instanceof fumlConfiguration.Classes.Kernel.Reference) {
			storeAsTracedObject((fumlConfiguration.Classes.Kernel.Reference) o);
		} else if (o instanceof org.eclipse.uml2.uml.PrimitiveType) {
			storeAsTracedObject((org.eclipse.uml2.uml.PrimitiveType) o);
		} else if (o instanceof fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) {
			storeAsTracedObject((fumlConfiguration.CommonBehaviors.BasicBehaviors.ParameterValue) o);
		} else if (o instanceof org.eclipse.uml2.uml.Parameter) {
			storeAsTracedObject((org.eclipse.uml2.uml.Parameter) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.Offer) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.Offer) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ObjectToken) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ObjectToken) o);
		} else if (o instanceof fumlConfiguration.Classes.Kernel.Object) {
			storeAsTracedObject((fumlConfiguration.Classes.Kernel.Object) o);
		} else if (o instanceof fumlConfiguration.Loci.Locus) {
			storeAsTracedObject((fumlConfiguration.Loci.Locus) o);
		} else if (o instanceof fumlConfiguration.Classes.Kernel.IntegerValue) {
			storeAsTracedObject((fumlConfiguration.Classes.Kernel.IntegerValue) o);
		} else if (o instanceof fumlConfiguration.Input.InputParameterValues) {
			storeAsTracedObject((fumlConfiguration.Input.InputParameterValues) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ForkedToken) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ForkedToken) o);
		} else if (o instanceof fumlConfiguration.Loci.Executor) {
			storeAsTracedObject((fumlConfiguration.Loci.Executor) o);
		} else if (o instanceof fumlConfiguration.Loci.ExecutionFactory) {
			storeAsTracedObject((fumlConfiguration.Loci.ExecutionFactory) o);
		} else if (o instanceof fumlConfiguration.Loci.ExecutionEnvironment) {
			storeAsTracedObject((fumlConfiguration.Loci.ExecutionEnvironment) o);
		} else if (o instanceof fumlConfiguration.ElementConfiguration) {
			storeAsTracedObject((fumlConfiguration.ElementConfiguration) o);
		} else if (o instanceof org.eclipse.uml2.uml.Class) {
			storeAsTracedObject((org.eclipse.uml2.uml.Class) o);
		} else if (o instanceof fumlConfiguration.Classes.Kernel.BooleanValue) {
			storeAsTracedObject((fumlConfiguration.Classes.Kernel.BooleanValue) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivationGroup) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ActivityNodeActivation) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ActivityExecution) o);
		} else if (o instanceof fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) {
			storeAsTracedObject((fumlConfiguration.Activities.IntermediateActivities.ActivityEdgeInstance) o);
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		return allResources;
	}

	private Collection<? extends EObject> getExeToTraced(Collection<? extends EObject> exeObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject exeObject : exeObjects) {
			storeAsTracedObject(exeObject);
			result.add(exeToTraced.get(exeObject));
		}
		return result;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
