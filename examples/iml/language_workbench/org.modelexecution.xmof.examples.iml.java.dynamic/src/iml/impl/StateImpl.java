/**
 */
package iml.impl;

import iml.Activity;
import iml.Header;
import iml.ImlPackage;
import iml.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iml.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link iml.impl.StateImpl#isInit <em>Init</em>}</li>
 *   <li>{@link iml.impl.StateImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link iml.impl.StateImpl#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link iml.impl.StateImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends IdentifyableElementImpl implements State {
	
	protected boolean activitiesStarted = false;
	
	
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
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean current = CURRENT_EDEFAULT;

	/**
	 * This is true if the Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentESet;

	/**
	 * The default value of the '{@link #isTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TERMINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTerminal() <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTerminal()
	 * @generated
	 * @ordered
	 */
	protected boolean terminal = TERMINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(boolean newCurrent) {
		boolean oldCurrent = current;
		current = newCurrent;
		boolean oldCurrentESet = currentESet;
		currentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE__CURRENT, oldCurrent, current, !oldCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrent() {
		boolean oldCurrent = current;
		boolean oldCurrentESet = currentESet;
		current = CURRENT_EDEFAULT;
		currentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ImlPackage.STATE__CURRENT, oldCurrent, CURRENT_EDEFAULT, oldCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrent() {
		return currentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCurrent(boolean newCurrent, Header context) {
		boolean oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE__CURRENT, oldCurrent, current));
		
		if(current){
			
			this.setCurrent(true);
			
			if(context.getCurrentStates().contains(this) == false){
				context.getCurrentStates().add(this);
			}
			
			//execute activities when State changed to running
			if(activities != null){
				for(Activity a: activities){
					a.execute(this,context);
				}
			}
			
			activitiesStarted = true;
			
			System.out.println("New current State: " + this.name);
		} else {
			this.setCurrent(false);
			context.getCurrentStates().remove(this);
			
			System.out.println("Left State: " + this.name);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(boolean newTerminal) {
		boolean oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.STATE__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectResolvingEList<Activity>(Activity.class, this, ImlPackage.STATE__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allActivitiesFinished() {
		
		//Case: There are no activities
		if(activities == null || activities.size() < 1){
			return true;
		}

		//check if activities were started
		if(activitiesStarted == false && this.isInit() == false){
			return false;
		}else{
			for(Activity a: this.getActivities()){
				//if at least one activity is still running
				if(a.isCurrent()){
					return false;
				}
			}
		}

		return true;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.STATE__NAME:
				return getName();
			case ImlPackage.STATE__INIT:
				return isInit();
			case ImlPackage.STATE__CURRENT:
				return isCurrent();
			case ImlPackage.STATE__TERMINAL:
				return isTerminal();
			case ImlPackage.STATE__ACTIVITIES:
				return getActivities();
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
			case ImlPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case ImlPackage.STATE__INIT:
				setInit((Boolean)newValue);
				return;
			case ImlPackage.STATE__CURRENT:
				setCurrent((Boolean)newValue);
				return;
			case ImlPackage.STATE__TERMINAL:
				setTerminal((Boolean)newValue);
				return;
			case ImlPackage.STATE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case ImlPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImlPackage.STATE__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case ImlPackage.STATE__CURRENT:
				unsetCurrent();
				return;
			case ImlPackage.STATE__TERMINAL:
				setTerminal(TERMINAL_EDEFAULT);
				return;
			case ImlPackage.STATE__ACTIVITIES:
				getActivities().clear();
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
			case ImlPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImlPackage.STATE__INIT:
				return init != INIT_EDEFAULT;
			case ImlPackage.STATE__CURRENT:
				return isSetCurrent();
			case ImlPackage.STATE__TERMINAL:
				return terminal != TERMINAL_EDEFAULT;
			case ImlPackage.STATE__ACTIVITIES:
				return activities != null && !activities.isEmpty();
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
		result.append(", init: ");
		result.append(init);
		result.append(", current: ");
		if (currentESet) result.append(current); else result.append("<unset>");
		result.append(", terminal: ");
		result.append(terminal);
		result.append(')');
		return result.toString();
	}

} //StateImpl
