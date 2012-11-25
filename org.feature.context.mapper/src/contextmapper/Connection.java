/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link contextmapper.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Context)
	 * @see contextmapper.ContextmapperPackage#getConnection_Source()
	 * @see contextmapper.Context#getTargetConnections
	 * @model opposite="targetConnections" resolveProxies="false" required="true"
	 * @generated
	 */
	Context getSource();

	/**
	 * Sets the value of the '{@link contextmapper.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Context value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(Context)
	 * @see contextmapper.ContextmapperPackage#getConnection_Target()
	 * @see contextmapper.Context#getSourceConnections
	 * @model opposite="sourceConnections" required="true" transient="false"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link contextmapper.Connection#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

} // Connection
