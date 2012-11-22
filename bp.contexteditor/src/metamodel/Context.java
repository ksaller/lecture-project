/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Context#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.Context#getClassifies <em>Classifies</em>}</li>
 *   <li>{@link metamodel.Context#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link metamodel.Context#getIncluded <em>Included</em>}</li>
 *   <li>{@link metamodel.Context#getSourceConnections <em>Source Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
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
	 * @see metamodel.MetamodelPackage#getContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifies</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifies</em>' reference list.
	 * @see metamodel.MetamodelPackage#getContext_Classifies()
	 * @model
	 * @generated
	 */
	EList<Classifier> getClassifies();

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Connection}.
	 * It is bidirectional and its opposite is '{@link metamodel.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference list.
	 * @see metamodel.MetamodelPackage#getContext_TargetConnections()
	 * @see metamodel.Connection#getSource
	 * @model opposite="source" transient="true" derived="true"
	 * @generated
	 */
	EList<Connection> getTargetConnections();

	/**
	 * Returns the value of the '<em><b>Included</b></em>' reference list.
	 * The list contents are of type {@link metamodel.IncludeConnection}.
	 * It is bidirectional and its opposite is '{@link metamodel.IncludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' reference list.
	 * @see metamodel.MetamodelPackage#getContext_Included()
	 * @see metamodel.IncludeConnection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<IncludeConnection> getIncluded();

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Connection}.
	 * It is bidirectional and its opposite is '{@link metamodel.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getContext_SourceConnections()
	 * @see metamodel.Connection#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<Connection> getSourceConnections();

} // Context
