/**
 */
package fsmConfigurationTrace.Steps.impl;

import org.eclipse.gemoc.trace.commons.model.trace.impl.SmallStepImpl;

import fsmConfigurationTrace.States.SpecificState;

import fsmConfigurationTrace.Steps.RootImplicitStep;
import fsmConfigurationTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Implicit Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RootImplicitStepImpl extends SmallStepImpl<SpecificState> implements RootImplicitStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImplicitStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ROOT_IMPLICIT_STEP;
	}

} //RootImplicitStepImpl
