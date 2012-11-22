/**
 */
package org.west.es.context.contextModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.west.es.context.contextModel.Container#getName <em>Name</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getVersion <em>Version</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getContextElements <em>Context Elements</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getContextInstances <em>Context Instances</em>}</li>
 *   <li>{@link org.west.es.context.contextModel.Container#getAssociatedMappingModel <em>Associated Mapping Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
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
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.Container#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.Container#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.Container#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.Container#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Context Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ContextElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Elements</em>' containment reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_ContextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextElement> getContextElements();

	/**
	 * Returns the value of the '<em><b>Context Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.west.es.context.contextModel.ContextInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Instances</em>' containment reference list.
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_ContextInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextInstance> getContextInstances();

	/**
	 * Returns the value of the '<em><b>Associated Mapping Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Mapping Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Mapping Model</em>' reference.
	 * @see #setAssociatedMappingModel(MappingModel)
	 * @see org.west.es.context.contextModel.ContextModelPackage#getContainer_AssociatedMappingModel()
	 * @model required="true"
	 * @generated
	 */
	MappingModel getAssociatedMappingModel();

	/**
	 * Sets the value of the '{@link org.west.es.context.contextModel.Container#getAssociatedMappingModel <em>Associated Mapping Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Mapping Model</em>' reference.
	 * @see #getAssociatedMappingModel()
	 * @generated
	 */
	void setAssociatedMappingModel(MappingModel value);

} // Container
