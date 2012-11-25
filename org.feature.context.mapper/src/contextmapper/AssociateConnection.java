/**
 */
package contextmapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associate Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.AssociateConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getAssociateConnection()
 * @model
 * @generated
 */
public interface AssociateConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"associate"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see contextmapper.ContextmapperPackage#getAssociateConnection_Type()
	 * @model default="associate" unique="false" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // AssociateConnection
