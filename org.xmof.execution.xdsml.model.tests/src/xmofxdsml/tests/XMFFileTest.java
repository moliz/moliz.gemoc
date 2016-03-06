/**
 */
package xmofxdsml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmofxdsml.XMFFile;
import xmofxdsml.XmofxdsmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XMF File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMFFileTest extends TestCase {

	/**
	 * The fixture for this XMF File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMFFile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMFFileTest.class);
	}

	/**
	 * Constructs a new XMF File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMFFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this XMF File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(XMFFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this XMF File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMFFile getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(XmofxdsmlFactory.eINSTANCE.createXMFFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //XMFFileTest
