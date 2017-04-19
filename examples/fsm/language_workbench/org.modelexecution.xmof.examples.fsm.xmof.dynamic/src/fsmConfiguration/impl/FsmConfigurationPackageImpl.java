/**
 */
package fsmConfiguration.impl;

import fsm.FsmPackage;

import fsmConfiguration.FsmConfigurationFactory;
import fsmConfiguration.FsmConfigurationPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmConfigurationPackageImpl extends EPackageImpl implements FsmConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "fsmConfiguration.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsmConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fsmConfiguration.FsmConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FsmConfigurationPackageImpl() {
		super(eNS_URI, FsmConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FsmConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FsmConfigurationPackage init() {
		if (isInited) return (FsmConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		FsmConfigurationPackageImpl theFsmConfigurationPackage = (FsmConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FsmConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FsmConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FsmPackage.eINSTANCE.eClass();

		// Load packages
		theFsmConfigurationPackage.loadPackage();

		// Fix loaded packages
		theFsmConfigurationPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theFsmConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FsmConfigurationPackage.eNS_URI, theFsmConfigurationPackage);
		return theFsmConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSMConfiguration() {
		if (fsmConfigurationEClass == null) {
			fsmConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI).getEClassifiers().get(0);
		}
		return fsmConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFSMConfiguration_CurrentState() {
        return (EReference)getFSMConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMConfiguration_ProducedSequence() {
        return (EAttribute)getFSMConfiguration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFSMConfiguration_AcceptedSequence() {
        return (EAttribute)getFSMConfiguration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateConfiguration() {
		if (stateConfigurationEClass == null) {
			stateConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI).getEClassifiers().get(1);
		}
		return stateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConfiguration() {
		if (transitionConfigurationEClass == null) {
			transitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI).getEClassifiers().get(2);
		}
		return transitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		if (inputEClass == null) {
			inputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FsmConfigurationPackage.eNS_URI).getEClassifiers().get(3);
		}
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_StringSeq() {
        return (EAttribute)getInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmConfigurationFactory getFsmConfigurationFactory() {
		return (FsmConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("fsmConfiguration." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FsmConfigurationPackageImpl
