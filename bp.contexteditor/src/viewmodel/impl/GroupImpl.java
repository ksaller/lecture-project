/**
 */
package viewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import viewmodel.AbstractGroup;
import viewmodel.Group;
import viewmodel.ViewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link viewmodel.impl.GroupImpl#getParentGroup <em>Parent Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends AbstractGroupImpl implements Group {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewmodelPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGroup getParentGroup() {
		if (eContainerFeatureID() != ViewmodelPackage.GROUP__PARENT_GROUP) return null;
		return (AbstractGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGroup(AbstractGroup newParentGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentGroup, ViewmodelPackage.GROUP__PARENT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroup(AbstractGroup newParentGroup) {
		if (newParentGroup != eInternalContainer() || (eContainerFeatureID() != ViewmodelPackage.GROUP__PARENT_GROUP && newParentGroup != null)) {
			if (EcoreUtil.isAncestor(this, newParentGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentGroup != null)
				msgs = ((InternalEObject)newParentGroup).eInverseAdd(this, ViewmodelPackage.ABSTRACT_GROUP__GROUPS, AbstractGroup.class, msgs);
			msgs = basicSetParentGroup(newParentGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewmodelPackage.GROUP__PARENT_GROUP, newParentGroup, newParentGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentGroup((AbstractGroup)otherEnd, msgs);
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
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				return basicSetParentGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				return eInternalContainer().eInverseRemove(this, ViewmodelPackage.ABSTRACT_GROUP__GROUPS, AbstractGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				return getParentGroup();
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
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				setParentGroup((AbstractGroup)newValue);
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
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				setParentGroup((AbstractGroup)null);
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
			case ViewmodelPackage.GROUP__PARENT_GROUP:
				return getParentGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
