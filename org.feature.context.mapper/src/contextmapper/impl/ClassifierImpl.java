/**
 */
package contextmapper.impl;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.ContextmapperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.featuremapper.models.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link contextmapper.impl.ClassifierImpl#getFeatureClassification <em>Feature Classification</em>}</li>
 *   <li>{@link contextmapper.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends EObjectImpl implements Classifier {
	/**
	 * The default value of the '{@link #getFeatureClassification() <em>Feature Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClassification()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Classification FEATURE_CLASSIFICATION_EDEFAULT = Classification.UNCLASSIFIED; //Classification.DEAD;
	/**
	 * The cached value of the '{@link #getFeatureClassification() <em>Feature Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification featureClassification = FEATURE_CLASSIFICATION_EDEFAULT;
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
		return ContextmapperPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getFeatureClassification() {
		return featureClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureClassification(Classification newFeatureClassification) {
		Classification oldFeatureClassification = featureClassification;
		featureClassification = newFeatureClassification == null ? FEATURE_CLASSIFICATION_EDEFAULT : newFeatureClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextmapperPackage.CLASSIFIER__FEATURE_CLASSIFICATION, oldFeatureClassification, featureClassification));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextmapperPackage.CLASSIFIER__FEATURE, oldFeature, feature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextmapperPackage.CLASSIFIER__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextmapperPackage.CLASSIFIER__FEATURE_CLASSIFICATION:
				return getFeatureClassification();
			case ContextmapperPackage.CLASSIFIER__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case ContextmapperPackage.CLASSIFIER__FEATURE_CLASSIFICATION:
				setFeatureClassification((Classification)newValue);
				return;
			case ContextmapperPackage.CLASSIFIER__FEATURE:
				setFeature((Feature)newValue);
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
			case ContextmapperPackage.CLASSIFIER__FEATURE_CLASSIFICATION:
				setFeatureClassification(FEATURE_CLASSIFICATION_EDEFAULT);
				return;
			case ContextmapperPackage.CLASSIFIER__FEATURE:
				setFeature((Feature)null);
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
			case ContextmapperPackage.CLASSIFIER__FEATURE_CLASSIFICATION:
				return featureClassification != FEATURE_CLASSIFICATION_EDEFAULT;
			case ContextmapperPackage.CLASSIFIER__FEATURE:
				return feature != null;
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
		result.append(" (featureClassification: ");
		result.append(featureClassification);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
