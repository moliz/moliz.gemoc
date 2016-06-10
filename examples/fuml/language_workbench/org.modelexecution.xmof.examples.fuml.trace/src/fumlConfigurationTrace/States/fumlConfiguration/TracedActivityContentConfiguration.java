/**
 */
package fumlConfigurationTrace.States.fumlConfiguration;

import fumlConfiguration.ActivityContentConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Activity Content Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration#getOriginalObject_ActivityContentConfiguration <em>Original Object Activity Content Configuration</em>}</li>
 * </ul>
 *
 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedActivityContentConfiguration()
 * @model
 * @generated
 */
public interface TracedActivityContentConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Original Object Activity Content Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object Activity Content Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object Activity Content Configuration</em>' reference.
	 * @see #setOriginalObject_ActivityContentConfiguration(ActivityContentConfiguration)
	 * @see fumlConfigurationTrace.States.fumlConfiguration.FumlConfigurationPackage#getTracedActivityContentConfiguration_OriginalObject_ActivityContentConfiguration()
	 * @model
	 * @generated
	 */
	ActivityContentConfiguration getOriginalObject_ActivityContentConfiguration();

	/**
	 * Sets the value of the '{@link fumlConfigurationTrace.States.fumlConfiguration.TracedActivityContentConfiguration#getOriginalObject_ActivityContentConfiguration <em>Original Object Activity Content Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object Activity Content Configuration</em>' reference.
	 * @see #getOriginalObject_ActivityContentConfiguration()
	 * @generated
	 */
	void setOriginalObject_ActivityContentConfiguration(ActivityContentConfiguration value);

} // TracedActivityContentConfiguration
