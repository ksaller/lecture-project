/**
 */
package org.west.es.context.contextModel;

import org.eclipse.emf.ecore.EObject;

import org.featuremapper.models.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classified Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.ClassifiedFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ClassifiedFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ClassifiedFeature#getClassification <em>Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.west.es.context.contextModel.ContextModelPackage#getClassifiedFeature()
 * @model
 * @generated
 */
public interface ClassifiedFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getClassifiedFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ClassifiedFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.west.es.context.contextModel.ContextModelPackage#getClassifiedFeature_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ClassifiedFeature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link org.west.es.context.contextModel.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see org.west.es.context.contextModel.Classification
	 * @see #setClassification(Classification)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getClassifiedFeature_Classification()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ClassifiedFeature#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see org.west.es.context.contextModel.Classification
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

} // ClassifiedFeature
