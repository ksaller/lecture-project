/**
 */
package viewmodel.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import viewmodel.AbstractGroup;
import viewmodel.Group;
import viewmodel.ViewPoint;
import viewmodel.ViewmodelPackage;

import viewmodel.util.ViewmodelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link viewmodel.impl.AbstractGroupImpl#getViewPointReference <em>View Point Reference</em>}</li>
 *   <li>{@link viewmodel.impl.AbstractGroupImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractGroupImpl extends ElementImpl implements AbstractGroup {
	/**
	 * The cached value of the '{@link #getViewPointReference() <em>View Point Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPointReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewPoint> viewPointReference;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewmodelPackage.Literals.ABSTRACT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewPoint> getViewPointReference() {
		if (viewPointReference == null) {
			viewPointReference = new EObjectWithInverseResolvingEList.ManyInverse<ViewPoint>(ViewPoint.class, this, ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE, ViewmodelPackage.VIEW_POINT__CONTAINED_IN_GROUP);
		}
		return viewPointReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList<Group>(Group.class, this, ViewmodelPackage.ABSTRACT_GROUP__GROUPS, ViewmodelPackage.GROUP__PARENT_GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkForRedundantViewPoints(DiagnosticChain eDiagnosticChain, Map<?, ?> eMap) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (eDiagnosticChain != null) {
				eDiagnosticChain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ViewmodelValidator.DIAGNOSTIC_SOURCE,
						 ViewmodelValidator.ABSTRACT_GROUP__CHECK_FOR_REDUNDANT_VIEW_POINTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "checkForRedundantViewPoints", EObjectValidator.getObjectLabel(this, (Map<Object, Object>) eMap) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViewPointReference()).basicAdd(otherEnd, msgs);
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				return ((InternalEList<?>)getViewPointReference()).basicRemove(otherEnd, msgs);
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				return getViewPointReference();
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				return getGroups();
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
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				getViewPointReference().clear();
				getViewPointReference().addAll((Collection<? extends ViewPoint>)newValue);
				return;
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
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
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				getViewPointReference().clear();
				return;
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				getGroups().clear();
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
			case ViewmodelPackage.ABSTRACT_GROUP__VIEW_POINT_REFERENCE:
				return viewPointReference != null && !viewPointReference.isEmpty();
			case ViewmodelPackage.ABSTRACT_GROUP__GROUPS:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractGroupImpl
