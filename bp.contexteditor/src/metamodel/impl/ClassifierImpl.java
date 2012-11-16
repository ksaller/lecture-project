/**
 */
package metamodel.impl;

import feature.Feature;

import metamodel.Classification;
import metamodel.Classifier;
import metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link metamodel.impl.ClassifierImpl#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends EObjectImpl implements Classifier {
	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final Classification FEATURE_EDEFAULT = Classification.DEAD;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Classification feature = FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureReference() <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected Feature featureReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Classification newFeature) {
		Classification oldFeature = feature;
		feature = newFeature == null ? FEATURE_EDEFAULT : newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASSIFIER__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureReference() {
		if (featureReference != null && featureReference.eIsProxy()) {
			InternalEObject oldFeatureReference = (InternalEObject)featureReference;
			featureReference = (Feature)eResolveProxy(oldFeatureReference);
			if (featureReference != oldFeatureReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE, oldFeatureReference, featureReference));
			}
		}
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatureReference() {
		return featureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureReference(Feature newFeatureReference) {
		Feature oldFeatureReference = featureReference;
		featureReference = newFeatureReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE, oldFeatureReference, featureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE:
				if (resolve) return getFeatureReference();
				return basicGetFeatureReference();
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
			case MetamodelPackage.CLASSIFIER__FEATURE:
				setFeature((Classification)newValue);
				return;
			case MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE:
				setFeatureReference((Feature)newValue);
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
			case MetamodelPackage.CLASSIFIER__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE:
				setFeatureReference((Feature)null);
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
			case MetamodelPackage.CLASSIFIER__FEATURE:
				return feature != FEATURE_EDEFAULT;
			case MetamodelPackage.CLASSIFIER__FEATURE_REFERENCE:
				return featureReference != null;
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
		result.append(" (feature: ");
		result.append(feature);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
