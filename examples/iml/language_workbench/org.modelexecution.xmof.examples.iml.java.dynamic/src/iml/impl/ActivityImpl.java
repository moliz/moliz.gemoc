/**
 */
package iml.impl;

import iml.Activity;
import iml.Connection;
import iml.Event;
import iml.Header;
import iml.ImlPackage;
import iml.State;
import iml.StateTransition;
import iml.util.ImlActivityThread;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iml.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#isInit <em>Init</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#isTerminal <em>Terminal</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#getFiredEvents <em>Fired Events</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#getTime <em>Time</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#getD <em>D</em>}</li>
 *   <li>{@link iml.impl.ActivityImpl#getSd <em>Sd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends IdentifyableElementImpl implements Activity {
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
	 * The cached value of the '{@link #getFiredEvents() <em>Fired Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiredEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> firedEvents;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final int D_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected int d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getSd() <em>Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSd()
	 * @generated
	 * @ordered
	 */
	protected static final int SD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSd() <em>Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSd()
	 * @generated
	 * @ordered
	 */
	protected int sd = SD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__INIT, oldInit, init));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__CURRENT, oldCurrent, current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getFiredEvents() {
		if (firedEvents == null) {
			firedEvents = new EObjectResolvingEList<Event>(Event.class, this, ImlPackage.ACTIVITY__FIRED_EVENTS);
		}
		return firedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(int newD) {
		int oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSd() {
		return sd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSd(int newSd) {
		int oldSd = sd;
		sd = newSd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.ACTIVITY__SD, oldSd, sd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void execute(State callingState, Header header) {

		this.setCurrent(true);
		
		//Create and start activity as thread;
		ImlActivityThread activity = new ImlActivityThread(this.getD(), this.getSd(), 1000, this);
		activity.start();
		
		EList<Connection> outgoingConn = header.getConnectionsBySource(callingState);
		for(Connection con: outgoingConn){
			if(con.getTarget() instanceof StateTransition){
				((StateTransition)con.getTarget()).setBooleanGuard(true);
			}
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.ACTIVITY__NAME:
				return getName();
			case ImlPackage.ACTIVITY__INIT:
				return isInit();
			case ImlPackage.ACTIVITY__CURRENT:
				return isCurrent();
			case ImlPackage.ACTIVITY__TERMINAL:
				return isTerminal();
			case ImlPackage.ACTIVITY__FIRED_EVENTS:
				return getFiredEvents();
			case ImlPackage.ACTIVITY__TIME:
				return getTime();
			case ImlPackage.ACTIVITY__D:
				return getD();
			case ImlPackage.ACTIVITY__SD:
				return getSd();
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
			case ImlPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case ImlPackage.ACTIVITY__INIT:
				setInit((Boolean)newValue);
				return;
			case ImlPackage.ACTIVITY__CURRENT:
				setCurrent((Boolean)newValue);
				return;
			case ImlPackage.ACTIVITY__TERMINAL:
				setTerminal((Boolean)newValue);
				return;
			case ImlPackage.ACTIVITY__FIRED_EVENTS:
				getFiredEvents().clear();
				getFiredEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ImlPackage.ACTIVITY__TIME:
				setTime((Integer)newValue);
				return;
			case ImlPackage.ACTIVITY__D:
				setD((Integer)newValue);
				return;
			case ImlPackage.ACTIVITY__SD:
				setSd((Integer)newValue);
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
			case ImlPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__TERMINAL:
				setTerminal(TERMINAL_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__FIRED_EVENTS:
				getFiredEvents().clear();
				return;
			case ImlPackage.ACTIVITY__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__D:
				setD(D_EDEFAULT);
				return;
			case ImlPackage.ACTIVITY__SD:
				setSd(SD_EDEFAULT);
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
			case ImlPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImlPackage.ACTIVITY__INIT:
				return init != INIT_EDEFAULT;
			case ImlPackage.ACTIVITY__CURRENT:
				return current != CURRENT_EDEFAULT;
			case ImlPackage.ACTIVITY__TERMINAL:
				return terminal != TERMINAL_EDEFAULT;
			case ImlPackage.ACTIVITY__FIRED_EVENTS:
				return firedEvents != null && !firedEvents.isEmpty();
			case ImlPackage.ACTIVITY__TIME:
				return time != TIME_EDEFAULT;
			case ImlPackage.ACTIVITY__D:
				return d != D_EDEFAULT;
			case ImlPackage.ACTIVITY__SD:
				return sd != SD_EDEFAULT;
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
		result.append(current);
		result.append(", terminal: ");
		result.append(terminal);
		result.append(", time: ");
		result.append(time);
		result.append(", d: ");
		result.append(d);
		result.append(", sd: ");
		result.append(sd);
		result.append(')');
		return result.toString();
	}

	@Override
	public void callback() {
		this.setCurrent(false);
		
	}

} //ActivityImpl
