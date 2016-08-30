/**
 */
package org.modelexecution.xmof.examples.iml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.modelexecution.xmof.examples.iml.ImlPackage;
import org.modelexecution.xmof.examples.iml.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getEarliestStart <em>Earliest Start</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getLatestStart <em>Latest Start</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getEarliestEnd <em>Earliest End</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getLatestEnd <em>Latest End</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.modelexecution.xmof.examples.iml.impl.TimeImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends EObjectImpl implements Time {
	/**
	 * The default value of the '{@link #getEarliestStart() <em>Earliest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStart()
	 * @generated
	 * @ordered
	 */
	protected static final int EARLIEST_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEarliestStart() <em>Earliest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStart()
	 * @generated
	 * @ordered
	 */
	protected int earliestStart = EARLIEST_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestStart() <em>Latest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestStart()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestStart() <em>Latest Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestStart()
	 * @generated
	 * @ordered
	 */
	protected int latestStart = LATEST_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarliestEnd() <em>Earliest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int EARLIEST_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEarliestEnd() <em>Earliest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestEnd()
	 * @generated
	 * @ordered
	 */
	protected int earliestEnd = EARLIEST_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestEnd() <em>Latest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestEnd() <em>Latest End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEnd()
	 * @generated
	 * @ordered
	 */
	protected int latestEnd = LATEST_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected int delay = DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImlPackage.Literals.TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEarliestStart() {
		return earliestStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestStart(int newEarliestStart) {
		int oldEarliestStart = earliestStart;
		earliestStart = newEarliestStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__EARLIEST_START, oldEarliestStart, earliestStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestStart() {
		return latestStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestStart(int newLatestStart) {
		int oldLatestStart = latestStart;
		latestStart = newLatestStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__LATEST_START, oldLatestStart, latestStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEarliestEnd() {
		return earliestEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestEnd(int newEarliestEnd) {
		int oldEarliestEnd = earliestEnd;
		earliestEnd = newEarliestEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__EARLIEST_END, oldEarliestEnd, earliestEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestEnd() {
		return latestEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestEnd(int newLatestEnd) {
		int oldLatestEnd = latestEnd;
		latestEnd = newLatestEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__LATEST_END, oldLatestEnd, latestEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		int oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImlPackage.TIME__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImlPackage.TIME__EARLIEST_START:
				return getEarliestStart();
			case ImlPackage.TIME__LATEST_START:
				return getLatestStart();
			case ImlPackage.TIME__EARLIEST_END:
				return getEarliestEnd();
			case ImlPackage.TIME__LATEST_END:
				return getLatestEnd();
			case ImlPackage.TIME__DURATION:
				return getDuration();
			case ImlPackage.TIME__DELAY:
				return getDelay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImlPackage.TIME__EARLIEST_START:
				setEarliestStart((Integer)newValue);
				return;
			case ImlPackage.TIME__LATEST_START:
				setLatestStart((Integer)newValue);
				return;
			case ImlPackage.TIME__EARLIEST_END:
				setEarliestEnd((Integer)newValue);
				return;
			case ImlPackage.TIME__LATEST_END:
				setLatestEnd((Integer)newValue);
				return;
			case ImlPackage.TIME__DURATION:
				setDuration((Integer)newValue);
				return;
			case ImlPackage.TIME__DELAY:
				setDelay((Integer)newValue);
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
			case ImlPackage.TIME__EARLIEST_START:
				setEarliestStart(EARLIEST_START_EDEFAULT);
				return;
			case ImlPackage.TIME__LATEST_START:
				setLatestStart(LATEST_START_EDEFAULT);
				return;
			case ImlPackage.TIME__EARLIEST_END:
				setEarliestEnd(EARLIEST_END_EDEFAULT);
				return;
			case ImlPackage.TIME__LATEST_END:
				setLatestEnd(LATEST_END_EDEFAULT);
				return;
			case ImlPackage.TIME__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ImlPackage.TIME__DELAY:
				setDelay(DELAY_EDEFAULT);
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
			case ImlPackage.TIME__EARLIEST_START:
				return earliestStart != EARLIEST_START_EDEFAULT;
			case ImlPackage.TIME__LATEST_START:
				return latestStart != LATEST_START_EDEFAULT;
			case ImlPackage.TIME__EARLIEST_END:
				return earliestEnd != EARLIEST_END_EDEFAULT;
			case ImlPackage.TIME__LATEST_END:
				return latestEnd != LATEST_END_EDEFAULT;
			case ImlPackage.TIME__DURATION:
				return duration != DURATION_EDEFAULT;
			case ImlPackage.TIME__DELAY:
				return delay != DELAY_EDEFAULT;
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
		result.append(" (earliestStart: ");
		result.append(earliestStart);
		result.append(", latestStart: ");
		result.append(latestStart);
		result.append(", earliestEnd: ");
		result.append(earliestEnd);
		result.append(", latestEnd: ");
		result.append(latestEnd);
		result.append(", duration: ");
		result.append(duration);
		result.append(", delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //TimeImpl
