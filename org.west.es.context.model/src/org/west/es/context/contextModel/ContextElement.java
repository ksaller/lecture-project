/**
 */
package org.west.es.context.contextModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.feature.multi.perspective.mapping.viewmapping.Mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getAssociatedMapping <em>Associated Mapping</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getPriorizeLinks <em>Priorize Links</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getExtendsLink <em>Extends Link</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getExcludeLinks <em>Exclude Links</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextElement#getClassifiedFeatures <em>Classified Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement()
 * @model
 * @generated
 */
public interface ContextElement extends EObject {
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
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ContextElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Associated Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Mapping</em>' reference.
	 * @see #setAssociatedMapping(Mapping)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_AssociatedMapping()
	 * @model required="true"
	 * @generated
	 */
	Mapping getAssociatedMapping();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ContextElement#getAssociatedMapping <em>Associated Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Mapping</em>' reference.
	 * @see #getAssociatedMapping()
	 * @generated
	 */
	void setAssociatedMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Priorize Links</b></em>' reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorize Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorize Links</em>' reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_PriorizeLinks()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getPriorizeLinks();

	/**
	 * Returns the value of the '<em><b>Extends Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Link</em>' reference.
	 * @see #setExtendsLink(ContextElement)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_ExtendsLink()
	 * @model
	 * @generated
	 */
	ContextElement getExtendsLink();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ContextElement#getExtendsLink <em>Extends Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends Link</em>' reference.
	 * @see #getExtendsLink()
	 * @generated
	 */
	void setExtendsLink(ContextElement value);

	/**
	 * Returns the value of the '<em><b>Exclude Links</b></em>' reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Links</em>' reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_ExcludeLinks()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getExcludeLinks();

	/**
	 * Returns the value of the '<em><b>Classified Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ClassifiedFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Features</em>' containment reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextElement_ClassifiedFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassifiedFeature> getClassifiedFeatures();

} // ContextElement
