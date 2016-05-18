/**
 */
package umlTrace.States.fumlConfiguration.Activities.IntermediateActivities;

import fumlConfiguration.Activities.IntermediateActivities.Token;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import umlTrace.States.Token_holder_Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getHolderSequence <em>Holder Sequence</em>}</li>
 *   <li>{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getOriginalObject_Token <em>Original Object Token</em>}</li>
 * </ul>
 *
 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedToken()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='//Activities/IntermediateActivities/Token'"
 * @generated
 */
public interface TracedToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Holder Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link umlTrace.States.Token_holder_Value}.
	 * It is bidirectional and its opposite is '{@link umlTrace.States.Token_holder_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder Sequence</em>' containment reference list.
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedToken_HolderSequence()
	 * @see umlTrace.States.Token_holder_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Token_holder_Value> getHolderSequence();

	/**
	 * Returns the value of the '<em><b>Original Object Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Token</em>' reference.
	 * @see #setOriginalObject_Token(Token)
	 * @see umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.IntermediateActivitiesPackage#getTracedToken_OriginalObject_Token()
	 * @model
	 * @generated
	 */
	Token getOriginalObject_Token();

	/**
	 * Sets the value of the '{@link umlTrace.States.fumlConfiguration.Activities.IntermediateActivities.TracedToken#getOriginalObject_Token <em>Original Object Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Token</em>' reference.
	 * @see #getOriginalObject_Token()
	 * @generated
	 */
	void setOriginalObject_Token(Token value);

} // TracedToken
