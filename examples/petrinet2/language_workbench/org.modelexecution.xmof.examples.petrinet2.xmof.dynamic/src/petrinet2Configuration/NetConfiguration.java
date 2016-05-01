/**
 */
package petrinet2Configuration;

import org.eclipse.emf.common.util.EList;

import petrinet2.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see petrinet2Configuration.Petrinet2ConfigurationPackage#getNetConfiguration()
 * @model
 * @generated
 */
public interface NetConfiguration extends Net {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.modelexecution.org/xmof Step='true'"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialTokensMany="true"
	 * @generated
	 */
	void main(EList<Token> initialTokens);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model initialTokensMany="true"
	 * @generated
	 */
	void initializeMarking(EList<Token> initialTokens);

} // NetConfiguration
