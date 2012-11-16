/**
 */
package metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Context#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Context)
	 * @see metamodel.MetamodelPackage#getConnection_Source()
	 * @see metamodel.Context#getTargetConnections
	 * @model opposite="targetConnections" resolveProxies="false" required="true"
	 * @generated
	 */
	Context getSource();

	/**
	 * Sets the value of the '{@link metamodel.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Context value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Context#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(Context)
	 * @see metamodel.MetamodelPackage#getConnection_Target()
	 * @see metamodel.Context#getSourceConnections
	 * @model opposite="sourceConnections" required="true" transient="false"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link metamodel.Connection#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

} // Connection
