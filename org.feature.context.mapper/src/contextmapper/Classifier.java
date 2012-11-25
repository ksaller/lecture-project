/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;

import org.featuremapper.models.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link contextmapper.Classifier#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * The literals are from the enumeration {@link contextmapper.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see contextmapper.Classification
	 * @see #setFeature(Classification)
	 * @see contextmapper.ContextmapperPackage#getClassifier_Feature()
	 * @model
	 * @generated
	 */
	Classification getFeature();

	/**
	 * Sets the value of the '{@link contextmapper.Classifier#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see contextmapper.Classification
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Classification value);

	/**
	 * Returns the value of the '<em><b>Feature Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Reference</em>' reference.
	 * @see #setFeatureReference(Feature)
	 * @see contextmapper.ContextmapperPackage#getClassifier_FeatureReference()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeatureReference();

	/**
	 * Sets the value of the '{@link contextmapper.Classifier#getFeatureReference <em>Feature Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Reference</em>' reference.
	 * @see #getFeatureReference()
	 * @generated
	 */
	void setFeatureReference(Feature value);

} // Classifier
