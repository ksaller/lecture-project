/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.cdo.CDOObject;

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
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getIncludeConnection()
 * @model
 * @generated
 */
public interface IncludeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RuntimeConfig)
	 * @see contextmapper.ContextmapperPackage#getIncludeConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	RuntimeConfig getSource();

	/**
	 * Sets the value of the '{@link contextmapper.IncludeConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RuntimeConfig value);

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
	 * @see contextmapper.ContextmapperPackage#getIncludeConnection_Target()
	 * @model required="true"
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

} // IncludeConnection
