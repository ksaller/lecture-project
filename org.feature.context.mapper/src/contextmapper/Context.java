/**
 */
package contextmapper;

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
 *   <li>{@link contextmapper.Context#getName <em>Name</em>}</li>
 *   <li>{@link contextmapper.Context#getClassifies <em>Classifies</em>}</li>
 *   <li>{@link contextmapper.Context#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link contextmapper.Context#getIncluded <em>Included</em>}</li>
 *   <li>{@link contextmapper.Context#getSourceConnections <em>Source Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getContext()
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
	 * @see contextmapper.ContextmapperPackage#getContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link contextmapper.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifies</b></em>' reference list.
	 * The list contents are of type {@link contextmapper.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifies</em>' reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Classifies()
	 * @model
	 * @generated
	 */
	EList<Classifier> getClassifies();

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference list.
	 * The list contents are of type {@link contextmapper.Connection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_TargetConnections()
	 * @see contextmapper.Connection#getSource
	 * @model opposite="source" transient="true" derived="true"
	 * @generated
	 */
	EList<Connection> getTargetConnections();

	/**
	 * Returns the value of the '<em><b>Included</b></em>' reference list.
	 * The list contents are of type {@link contextmapper.IncludeConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.IncludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Included()
	 * @see contextmapper.IncludeConnection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<IncludeConnection> getIncluded();

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.Connection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_SourceConnections()
	 * @see contextmapper.Connection#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<Connection> getSourceConnections();

} // Context
