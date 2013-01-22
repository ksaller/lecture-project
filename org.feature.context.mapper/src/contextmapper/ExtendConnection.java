/**
 */
package contextmapper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.ExtendConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link contextmapper.ExtendConnection#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getExtendConnection()
 * @model
 * @generated
 */
public interface ExtendConnection extends EObject {
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
	 * @see contextmapper.ContextmapperPackage#getExtendConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link contextmapper.ExtendConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link contextmapper.Context#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Context)
	 * @see contextmapper.ContextmapperPackage#getExtendConnection_Source()
	 * @see contextmapper.Context#getExtend
	 * @model opposite="extend" required="true" transient="false"
	 * @generated
	 */
	Context getSource();

	/**
	 * Sets the value of the '{@link contextmapper.ExtendConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Context value);

} // ExtendConnection
