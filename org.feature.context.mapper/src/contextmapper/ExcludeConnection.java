/**
 */
package contextmapper;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.ExcludeConnection#getSource <em>Source</em>}</li>
 *   <li>{@link contextmapper.ExcludeConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getExcludeConnection()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ExcludeConnection extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Context)
	 * @see contextmapper.ContextmapperPackage#getExcludeConnection_Source()
	 * @see contextmapper.Context#getExclude
	 * @model opposite="exclude" resolveProxies="false" required="true" transient="false"
	 * @generated
	 */
	Context getSource();

	/**
	 * Sets the value of the '{@link contextmapper.ExcludeConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Context value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Context)
	 * @see contextmapper.ContextmapperPackage#getExcludeConnection_Target()
	 * @see contextmapper.Context#getExcluded
	 * @model opposite="excluded" resolveProxies="false" required="true"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link contextmapper.ExcludeConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

} // ExcludeConnection
