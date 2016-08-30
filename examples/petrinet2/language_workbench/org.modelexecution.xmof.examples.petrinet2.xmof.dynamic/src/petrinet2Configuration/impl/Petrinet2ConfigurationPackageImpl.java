/**
 */
package petrinet2Configuration.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.IntegerFunctions.IntegerFunctionsPackage;

import org.modelexecution.xmof.standardlibrary.XMOF.PrimitiveBehaviors.ListFunctions.ListFunctionsPackage;

import petrinet2.Petrinet2Package;

import petrinet2Configuration.Petrinet2ConfigurationFactory;
import petrinet2Configuration.Petrinet2ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Petrinet2ConfigurationPackageImpl extends EPackageImpl implements Petrinet2ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "petrinet2Configuration.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeConfigurationEClass = null;

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
	private EClass tokenDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

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
	 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Petrinet2ConfigurationPackageImpl() {
		super(eNS_URI, Petrinet2ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Petrinet2ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Petrinet2ConfigurationPackage init() {
		if (isInited) return (Petrinet2ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Petrinet2ConfigurationPackageImpl thePetrinet2ConfigurationPackage = (Petrinet2ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Petrinet2ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Petrinet2ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Petrinet2Package.eINSTANCE.eClass();
		IntegerFunctionsPackage.eINSTANCE.eClass();
		ListFunctionsPackage.eINSTANCE.eClass();

		// Load packages
		thePetrinet2ConfigurationPackage.loadPackage();

		// Fix loaded packages
		thePetrinet2ConfigurationPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetrinet2ConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Petrinet2ConfigurationPackage.eNS_URI, thePetrinet2ConfigurationPackage);
		return thePetrinet2ConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetConfiguration() {
		if (netConfigurationEClass == null) {
			netConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI).getEClassifiers().get(0);
		}
		return netConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceConfiguration() {
		if (placeConfigurationEClass == null) {
			placeConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI).getEClassifiers().get(1);
		}
		return placeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceConfiguration_HeldTokens() {
        return (EReference)getPlaceConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionConfiguration() {
		if (transitionConfigurationEClass == null) {
			transitionConfigurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI).getEClassifiers().get(2);
		}
		return transitionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenDistribution() {
		if (tokenDistributionEClass == null) {
			tokenDistributionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tokenDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenDistribution_InitialTokens() {
        return (EReference)getTokenDistribution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		if (tokenEClass == null) {
			tokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Petrinet2ConfigurationPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_HoldingPlace() {
        return (EReference)getToken().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinet2ConfigurationFactory getPetrinet2ConfigurationFactory() {
		return (Petrinet2ConfigurationFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("petrinet2Configuration." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Petrinet2ConfigurationPackageImpl
