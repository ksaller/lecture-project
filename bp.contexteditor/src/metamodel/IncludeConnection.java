/**
 */
package metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.IncludeConnection#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel.IncludeConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getIncludeConnection()
 * @model
 * @generated
 */
public interface IncludeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.RuntimeConfig#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(RuntimeConfig)
	 * @see metamodel.MetamodelPackage#getIncludeConnection_Source()
	 * @see metamodel.RuntimeConfig#getIncludes
	 * @model opposite="includes" resolveProxies="false" required="true" transient="false"
	 * @generated
	 */
	RuntimeConfig getSource();

	/**
	 * Sets the value of the '{@link metamodel.IncludeConnection#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RuntimeConfig value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Context#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Context)
	 * @see metamodel.MetamodelPackage#getIncludeConnection_Target()
	 * @see metamodel.Context#getIncluded
	 * @model opposite="included" required="true"
	 * @generated
	 */
	Context getTarget();

	/**
	 * Sets the value of the '{@link metamodel.IncludeConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Context value);

} // IncludeConnection
