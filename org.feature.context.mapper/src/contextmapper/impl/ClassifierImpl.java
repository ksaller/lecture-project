/**
 */
package contextmapper.impl;

import contextmapper.Classification;
import contextmapper.Classifier;
import contextmapper.ContextmapperPackage;

import org.eclipse.emf.ecore.EClass;

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
public class ClassifierImpl extends CDOObjectImpl implements Classifier {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getFeatureClassification() {
		return (Classification)eGet(ContextmapperPackage.Literals.CLASSIFIER__FEATURE_CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureClassification(Classification newFeatureClassification) {
		eSet(ContextmapperPackage.Literals.CLASSIFIER__FEATURE_CLASSIFICATION, newFeatureClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		return (Feature)eGet(ContextmapperPackage.Literals.CLASSIFIER__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		eSet(ContextmapperPackage.Literals.CLASSIFIER__FEATURE, newFeature);
	}

} //ClassifierImpl
