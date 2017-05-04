/**
 */
package fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.impl;

import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.BooleanValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.IntegerValue;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsFactory;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.KernelFewStepsPackage;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.LiteralBooleanEvaluation;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.LiteralIntegerEvaluation;
import fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Reference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KernelFewStepsFactoryImpl extends EFactoryImpl implements KernelFewStepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KernelFewStepsFactory init() {
		try {
			KernelFewStepsFactory theKernelFewStepsFactory = (KernelFewStepsFactory)EPackage.Registry.INSTANCE.getEFactory(KernelFewStepsPackage.eNS_URI);
			if (theKernelFewStepsFactory != null) {
				return theKernelFewStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KernelFewStepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFewStepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KernelFewStepsPackage.OBJECT: return createObject();
			case KernelFewStepsPackage.LITERAL_INTEGER_EVALUATION: return createLiteralIntegerEvaluation();
			case KernelFewStepsPackage.INTEGER_VALUE: return createIntegerValue();
			case KernelFewStepsPackage.BOOLEAN_VALUE: return createBooleanValue();
			case KernelFewStepsPackage.LITERAL_BOOLEAN_EVALUATION: return createLiteralBooleanEvaluation();
			case KernelFewStepsPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fumlConfigurationFewSteps.ClassesFewSteps.KernelFewSteps.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralIntegerEvaluation createLiteralIntegerEvaluation() {
		LiteralIntegerEvaluationImpl literalIntegerEvaluation = new LiteralIntegerEvaluationImpl();
		return literalIntegerEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralBooleanEvaluation createLiteralBooleanEvaluation() {
		LiteralBooleanEvaluationImpl literalBooleanEvaluation = new LiteralBooleanEvaluationImpl();
		return literalBooleanEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFewStepsPackage getKernelFewStepsPackage() {
		return (KernelFewStepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KernelFewStepsPackage getPackage() {
		return KernelFewStepsPackage.eINSTANCE;
	}

} //KernelFewStepsFactoryImpl
