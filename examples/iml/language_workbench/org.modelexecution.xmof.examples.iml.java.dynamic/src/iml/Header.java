/**
 */
package iml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iml.Header#getName <em>Name</em>}</li>
 *   <li>{@link iml.Header#getMembers <em>Members</em>}</li>
 *   <li>{@link iml.Header#getCurrentStates <em>Current States</em>}</li>
 * </ul>
 * </p>
 *
 * @see iml.ImlPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends IdentifyableElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iml.ImlPackage#getHeader_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iml.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link iml.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see iml.ImlPackage#getHeader_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getMembers();

	/**
	 * Returns the value of the '<em><b>Current States</b></em>' containment reference list.
	 * The list contents are of type {@link iml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current States</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current States</em>' containment reference list.
	 * @see #isSetCurrentStates()
	 * @see iml.ImlPackage#getHeader_CurrentStates()
	 * @model containment="true" unsettable="true" changeable="false"
	 * @generated
	 */
	EList<State> getCurrentStates();

	/**
	 * Returns whether the value of the '{@link iml.Header#getCurrentStates <em>Current States</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current States</em>' containment reference list is set.
	 * @see #getCurrentStates()
	 * @generated
	 */
	boolean isSetCurrentStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();
	
	
	public EList<Connection> getConnectionsBySource(ConnectionPoint src);
	
	public EList<Connection> getConnectionsByTarget(ConnectionPoint target);
	
} // Header
