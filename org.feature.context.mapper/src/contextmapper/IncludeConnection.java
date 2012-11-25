/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.IncludeConnection#getSource <em>Source</em>}</li>
 *   <li>{@link contextmapper.IncludeConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link contextmapper.IncludeConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getIncludeConnection()
 * @model
 * @generated
 */
public interface IncludeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.RuntimeConfig#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(RuntimeConfig)
	 * @see contextmapper.ContextmapperPackage#getIncludeConnection_Source()
	 * @see contextmapper.RuntimeConfig#getIncludes
	 * @model opposite="includes" resolveProxies="false" required="true" transient="false"
	 * @generated
	 */
	RuntimeConfig getSource();

	/**
	 * Sets the value of the '{@link contextmapper.IncludeConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RuntimeConfig value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Context)
	 * @see contextmapper.ContextmapperPackage#getIncludeConnection_Target()
	 * @see contextmapper.Context#getIncluded
	 * @model opposite="included" required="true"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link contextmapper.IncludeConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"includes"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see contextmapper.ContextmapperPackage#getIncludeConnection_Type()
	 * @model default="includes" changeable="false"
	 * @generated
	 */
	String getType();

} // IncludeConnection
