/**
 */
package org.west.es.context.contextModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.ContextInstance#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.ContextInstance#getIncludeLinks <em>Include Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.west.es.context.contextModel.ContextModelPackage#getContextInstance()
 * @model
 * @generated
 */
public interface ContextInstance extends EObject {
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
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.ContextInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Include Links</b></em>' reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Links</em>' reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContextInstance_IncludeLinks()
	 * @model
	 * @generated
	 */
	EList<ContextElement> getIncludeLinks();

} // ContextInstance
