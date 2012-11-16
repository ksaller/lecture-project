/**
 */
package metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.RuntimeConfig#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getRuntimeConfig()
 * @model
 * @generated
 */
public interface RuntimeConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link metamodel.IncludeConnection}.
	 * It is bidirectional and its opposite is '{@link metamodel.IncludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see metamodel.MetamodelPackage#getRuntimeConfig_Includes()
	 * @see metamodel.IncludeConnection#getSource
	 * @model opposite="source" transient="true" derived="true"
	 * @generated
	 */
	EList<IncludeConnection> getIncludes();

} // RuntimeConfig
