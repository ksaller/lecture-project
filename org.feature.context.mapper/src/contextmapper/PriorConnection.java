/**
 */
package contextmapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prior Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.PriorConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getPriorConnection()
 * @model
 * @generated
 */
public interface PriorConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"priorize"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see contextmapper.ContextmapperPackage#getPriorConnection_Type()
	 * @model default="priorize" unique="false" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // PriorConnection
