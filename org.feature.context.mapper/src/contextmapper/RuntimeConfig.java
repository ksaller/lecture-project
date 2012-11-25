/**
 */
package contextmapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.RuntimeConfig#getIncludes <em>Includes</em>}</li>
 *   <li>{@link contextmapper.RuntimeConfig#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getRuntimeConfig()
 * @model
 * @generated
 */
public interface RuntimeConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.IncludeConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.IncludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getRuntimeConfig_Includes()
	 * @see contextmapper.IncludeConnection#getSource
	 * @model opposite="source" containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<IncludeConnection> getIncludes();

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
	 * @see contextmapper.ContextmapperPackage#getRuntimeConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link contextmapper.RuntimeConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RuntimeConfig
