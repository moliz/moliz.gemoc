/**
 */
package fsmConfigurationTrace.States.impl;

import org.eclipse.gemoc.trace.commons.model.trace.impl.TracedObjectImpl;

import fsmConfigurationTrace.States.SpecificDimension;
import fsmConfigurationTrace.States.SpecificTracedObject;
import fsmConfigurationTrace.States.SpecificValue;
import fsmConfigurationTrace.States.StatesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Traced Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SpecificTracedObjectImpl<DimensionSubType extends SpecificDimension<? extends SpecificValue>> extends TracedObjectImpl<DimensionSubType> implements SpecificTracedObject<DimensionSubType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTracedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.SPECIFIC_TRACED_OBJECT;
	}

} //SpecificTracedObjectImpl
