/**
 */
package feature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.Annotation#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.FeaturePackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link feature.Feature#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see #setFeature(Feature)
	 * @see feature.FeaturePackage#getAnnotation_Feature()
	 * @see feature.Feature#getAnnotations
	 * @model opposite="annotations" required="true" transient="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link feature.Annotation#getFeature <em>Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' container reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Annotation
