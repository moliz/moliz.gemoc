/**
 */
package iml.impl;

import iml.Connection;
import iml.Header;
import iml.ImlPackage;
import iml.SimultaneousConvergence;
import iml.State;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simultaneous Convergence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimultaneousConvergenceImpl extends IdentifyableElementImpl implements SimultaneousConvergence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimultaneousConvergenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.SIMULTANEOUS_CONVERGENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean allIncomingStatesActive(Header context) {
		
		boolean allIncomingStatesActive = true;
		EList<Connection> incomingStates = context.getConnectionsByTarget(this);
		
		//iterate through all incoming connections
		for(Connection conn: incomingStates){
			//Check if Incoming Connection's source is a state
			if(conn.getSource() instanceof State){
				if(((State)conn.getSource()).isCurrent() == false){
					allIncomingStatesActive = false;
				}
			}
		}
		
		return allIncomingStatesActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deactivateAllIncomingStates(Header context) {
		
		EList<Connection> incomingStates = context.getConnectionsByTarget(this);
		for(Connection conn: incomingStates){
			if(conn.getSource() instanceof State){
				((State)conn.getSource()).setCurrent(false, context);
			}	
		}
	}
	
	

} //SimultaneousConvergenceImpl
