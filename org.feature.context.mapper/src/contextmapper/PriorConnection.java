/**
 */
package contextmapper;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prior Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.PriorConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link contextmapper.PriorConnection#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getPriorConnection()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PriorConnection extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Context)
	 * @see contextmapper.ContextmapperPackage#getPriorConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link contextmapper.PriorConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getPriorize <em>Priorize</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Context)
	 * @see contextmapper.ContextmapperPackage#getPriorConnection_Source()
	 * @see contextmapper.Context#getPriorize
	 * @model opposite="priorize" required="true" transient="false"
	 * @generated
	 */
	Context getSource();

	/**
	 * Sets the value of the '{@link contextmapper.PriorConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Context value);

} // PriorConnection
