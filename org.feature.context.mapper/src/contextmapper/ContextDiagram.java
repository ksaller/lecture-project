/**
 */
package contextmapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.feature.multi.perspective.mapping.viewmapping.Mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.ContextDiagram#getMappingReference <em>Mapping Reference</em>}</li>
 *   <li>{@link contextmapper.ContextDiagram#getContainsContexts <em>Contains Contexts</em>}</li>
 *   <li>{@link contextmapper.ContextDiagram#getContainsRuntimeConfigs <em>Contains Runtime Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getContextDiagram()
 * @model
 * @generated
 */
public interface ContextDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Reference</em>' reference.
	 * @see #setMappingReference(Mapping)
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_MappingReference()
	 * @model required="true"
	 * @generated
	 */
	Mapping getMappingReference();

	/**
	 * Sets the value of the '{@link contextmapper.ContextDiagram#getMappingReference <em>Mapping Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Reference</em>' reference.
	 * @see #getMappingReference()
	 * @generated
	 */
	void setMappingReference(Mapping value);

	/**
	 * Returns the value of the '<em><b>Contains Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Contexts</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_ContainsContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContainsContexts();

	/**
	 * Returns the value of the '<em><b>Contains Runtime Configs</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.RuntimeConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Runtime Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Runtime Configs</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_ContainsRuntimeConfigs()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeConfig> getContainsRuntimeConfigs();

} // ContextDiagram
