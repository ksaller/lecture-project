/**
 */
package contextmapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.ExcludeConnection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getExcludeConnection()
 * @model
 * @generated
 */
public interface ExcludeConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"exclude"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see contextmapper.ContextmapperPackage#getExcludeConnection_Type()
	 * @model default="exclude" unique="false" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // ExcludeConnection
