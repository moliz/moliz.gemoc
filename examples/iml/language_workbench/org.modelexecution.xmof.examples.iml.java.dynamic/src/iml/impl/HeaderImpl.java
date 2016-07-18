/**
 */
package iml.impl;

import iml.Connection;
import iml.ConnectionPoint;
import iml.Element;
import iml.Header;
import iml.ImlPackage;
import iml.SelectionDivergence;
import iml.SimultaneousConvergence;
import iml.State;
import iml.StateTransition;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iml.impl.HeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link iml.impl.HeaderImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link iml.impl.HeaderImpl#getCurrentStates <em>Current States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderImpl extends IdentifyableElementImpl implements Header {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> members;
	
	/**
	 * The cached value of the '{@link #getCurrentStates() <em>Current States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> currentStates;

	protected EList<Connection> connectors;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Element>(Element.class, this, ImlPackage.HEADER__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getCurrentStates() {
		if (currentStates == null) {
			currentStates = new EObjectContainmentEList.Unsettable<State>(State.class, this, ImlPackage.HEADER__CURRENT_STATES);
		}
		return currentStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentStates() {
		return currentStates != null && ((InternalEList.Unsettable<?>)currentStates).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void execute() {
		System.out.println("------------------------------");
		System.out.println("Execution of IML Model starts");
		
		EList<State> currentStates = new BasicEList<State>();
		connectors = new BasicEList<Connection>();
		
		boolean terminal = false;
		
		// Set initial state as current state
		Iterator<Element> iter = this.getMembers().iterator();
		while(iter.hasNext()){
			Element member = iter.next();
			if(member instanceof State){
				State s = (State) member;
				if(s.isInit()){
					currentStates.add(s);
				}
			}
			if(member instanceof Connection){
				connectors.add((Connection)member);
			}
		}
		
		for(State current: currentStates){
			if(currentStates.contains(current) == false){
				this.getCurrentStates().add(current);
			}
		}
		
		while(!terminal){

			//get all current states
			for(State st: currentStates){				
				//Iterate through all Outgoing Connections (=Transitions)
				for(Connection con: this.getConnectionsBySource(st)){
					
					//State -> State Transition
					if(con.getTarget() instanceof StateTransition){
						StateTransition stOut = (StateTransition)con.getTarget();
						//if outgoing transition is enabled -> fire
						if(stOut.isEnabled(this)){
							stOut.fire(this);
						}
						
					// State -> Simultaneous Convergence
					}else if (con.getTarget() instanceof SimultaneousConvergence){
						if(((SimultaneousConvergence)con.getTarget()).allIncomingStatesActive(this)){			
							Connection convToSt = this.getConnectionsBySource(con.getTarget()).get(0);
							if(convToSt.getTarget() instanceof StateTransition){
								((StateTransition)convToSt.getTarget()).fire(this);
							}
						}
						
					// State -> SelectiveDivergence
					}else if (con.getTarget() instanceof SelectionDivergence){
						EList<Connection> outConnections = this.getConnectionsBySource(con.getTarget());
						for(Connection outConnection: outConnections){
							if(outConnection.getTarget() instanceof StateTransition){
								StateTransition outTransition = (StateTransition) outConnection.getTarget();
								
								//check if Transition out of Divergence is enabled
								if(outTransition.isEnabled(this)){
									outTransition.fire(this);
								}
							}					
						}
					}
				}
				
				//Test if terminal State is reached
				if(st.isTerminal()){
					terminal = true;
				}
			}	
			
			//refill currentState collection
			currentStates.clear();
			for(State st: this.getCurrentStates()){
				if(currentStates.contains(st) == false){
					currentStates.add(st);
				}
			}
			
		}

		System.out.println("Terminal State reached --> Execution terminated");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImlPackage.HEADER__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case ImlPackage.HEADER__CURRENT_STATES:
				return ((InternalEList<?>)getCurrentStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.HEADER__NAME:
				return getName();
			case ImlPackage.HEADER__MEMBERS:
				return getMembers();
			case ImlPackage.HEADER__CURRENT_STATES:
				return getCurrentStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImlPackage.HEADER__NAME:
				setName((String)newValue);
				return;
			case ImlPackage.HEADER__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Element>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImlPackage.HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImlPackage.HEADER__MEMBERS:
				getMembers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImlPackage.HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImlPackage.HEADER__MEMBERS:
				return members != null && !members.isEmpty();
			case ImlPackage.HEADER__CURRENT_STATES:
				return isSetCurrentStates();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<Connection> getConnectionsBySource(ConnectionPoint src) {

		EList<Connection> selectedConnections = new BasicEList<Connection>();
		for(Connection con: connectors){
			if(con.getSource() == src && selectedConnections.contains(con) == false){
				selectedConnections.add(con);
			}
		}

		return selectedConnections;
	}

	@Override
	public EList<Connection> getConnectionsByTarget(ConnectionPoint target) {
		EList<Connection> selectedConnections = new BasicEList<Connection>();
		for(Connection con: connectors){
			if(con.getTarget() == target && selectedConnections.contains(con) == false){
				selectedConnections.add(con);
			}
		}

		return selectedConnections;
	}
	
	

} //HeaderImpl
