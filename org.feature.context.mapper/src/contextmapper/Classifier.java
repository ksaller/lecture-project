/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.cdo.CDOObject;

import org.featuremapper.models.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.Classifier#getFeatureClassification <em>Feature Classification</em>}</li>
 *   <li>{@link contextmapper.Classifier#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link contextmapper.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Classification</em>' attribute.
	 * @see contextmapper.Classification
	 * @see #setFeatureClassification(Classification)
	 * @see contextmapper.ContextmapperPackage#getClassifier_FeatureClassification()
	 * @model
	 * @generated
	 */
	Classification getFeatureClassification();

	/**
	 * Sets the value of the '{@link contextmapper.Classifier#getFeatureClassification <em>Feature Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Classification</em>' attribute.
	 * @see contextmapper.Classification
	 * @see #getFeatureClassification()
	 * @generated
	 */
	void setFeatureClassification(Classification value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see contextmapper.ContextmapperPackage#getClassifier_Feature()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link contextmapper.Classifier#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Classifier
