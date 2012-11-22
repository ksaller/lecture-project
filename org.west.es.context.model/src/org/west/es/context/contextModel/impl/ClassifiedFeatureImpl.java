/**
 */
package org.west.es.context.contextModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.featuremapper.models.feature.Feature;

import org.west.es.context.contextModel.Classification;
import org.west.es.context.contextModel.ClassifiedFeature;
import org.west.es.context.contextModel.ContextModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classified Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.impl.ClassifiedFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ClassifiedFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.impl.ClassifiedFeatureImpl#getClassification <em>Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifiedFeatureImpl extends EObjectImpl implements ClassifiedFeature {
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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final Classification CLASSIFICATION_EDEFAULT = Classification.UNBOUND;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification classification = CLASSIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifiedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextModelPackage.Literals.CLASSIFIED_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CLASSIFIED_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextModelPackage.CLASSIFIED_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CLASSIFIED_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(Classification newClassification) {
		Classification oldClassification = classification;
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextModelPackage.CLASSIFIED_FEATURE__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextModelPackage.CLASSIFIED_FEATURE__NAME:
				return getName();
			case ContextModelPackage.CLASSIFIED_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case ContextModelPackage.CLASSIFIED_FEATURE__CLASSIFICATION:
				return getClassification();
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
			case ContextModelPackage.CLASSIFIED_FEATURE__NAME:
				setName((String)newValue);
				return;
			case ContextModelPackage.CLASSIFIED_FEATURE__FEATURE:
				setFeature((Feature)newValue);
				return;
			case ContextModelPackage.CLASSIFIED_FEATURE__CLASSIFICATION:
				setClassification((Classification)newValue);
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
			case ContextModelPackage.CLASSIFIED_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextModelPackage.CLASSIFIED_FEATURE__FEATURE:
				setFeature((Feature)null);
				return;
			case ContextModelPackage.CLASSIFIED_FEATURE__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
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
			case ContextModelPackage.CLASSIFIED_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextModelPackage.CLASSIFIED_FEATURE__FEATURE:
				return feature != null;
			case ContextModelPackage.CLASSIFIED_FEATURE__CLASSIFICATION:
				return classification != CLASSIFICATION_EDEFAULT;
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
		result.append(", classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

} //ClassifiedFeatureImpl
