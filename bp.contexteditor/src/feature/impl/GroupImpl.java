/**
 */
package feature.impl;

import feature.Feature;
import feature.FeaturePackage;
import feature.Group;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link feature.impl.GroupImpl#getParentFeature <em>Parent Feature</em>}</li>
 *   <li>{@link feature.impl.GroupImpl#getChildFeatures <em>Child Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends FeatureTreeNodeImpl implements Group {
	/**
	 * The cached value of the '{@link #getChildFeatures() <em>Child Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> childFeatures;

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
		return FeaturePackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getParentFeature() {
		if (eContainerFeatureID() != FeaturePackage.GROUP__PARENT_FEATURE) return null;
		return (Feature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFeature(Feature newParentFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFeature, FeaturePackage.GROUP__PARENT_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFeature(Feature newParentFeature) {
		if (newParentFeature != eInternalContainer() || (eContainerFeatureID() != FeaturePackage.GROUP__PARENT_FEATURE && newParentFeature != null)) {
			if (EcoreUtil.isAncestor(this, newParentFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFeature != null)
				msgs = ((InternalEObject)newParentFeature).eInverseAdd(this, FeaturePackage.FEATURE__GROUPS, Feature.class, msgs);
			msgs = basicSetParentFeature(newParentFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.GROUP__PARENT_FEATURE, newParentFeature, newParentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getChildFeatures() {
		if (childFeatures == null) {
			childFeatures = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, FeaturePackage.GROUP__CHILD_FEATURES, FeaturePackage.FEATURE__PARENT_GROUP);
		}
		return childFeatures;
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFeature((Feature)otherEnd, msgs);
			case FeaturePackage.GROUP__CHILD_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildFeatures()).basicAdd(otherEnd, msgs);
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				return basicSetParentFeature(null, msgs);
			case FeaturePackage.GROUP__CHILD_FEATURES:
				return ((InternalEList<?>)getChildFeatures()).basicRemove(otherEnd, msgs);
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				return eInternalContainer().eInverseRemove(this, FeaturePackage.FEATURE__GROUPS, Feature.class, msgs);
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				return getParentFeature();
			case FeaturePackage.GROUP__CHILD_FEATURES:
				return getChildFeatures();
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				setParentFeature((Feature)newValue);
				return;
			case FeaturePackage.GROUP__CHILD_FEATURES:
				getChildFeatures().clear();
				getChildFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				setParentFeature((Feature)null);
				return;
			case FeaturePackage.GROUP__CHILD_FEATURES:
				getChildFeatures().clear();
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
			case FeaturePackage.GROUP__PARENT_FEATURE:
				return getParentFeature() != null;
			case FeaturePackage.GROUP__CHILD_FEATURES:
				return childFeatures != null && !childFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
