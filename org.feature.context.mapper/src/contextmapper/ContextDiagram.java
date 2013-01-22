/**
 */
package contextmapper;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.feature.multi.perspective.mapping.viewmapping.MappingModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.ContextDiagram#getMappingReference <em>Mapping Reference</em>}</li>
 *   <li>{@link contextmapper.ContextDiagram#getContext <em>Context</em>}</li>
 *   <li>{@link contextmapper.ContextDiagram#getRuntimeconfig <em>Runtimeconfig</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getContextDiagram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraint='self.context->forAll(c1, c2  | c1.name<>c2.name)'"
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
	 * @see #setMappingReference(MappingModel)
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_MappingReference()
	 * @model required="true"
	 * @generated
	 */
	MappingModel getMappingReference();

	/**
	 * Sets the value of the '{@link contextmapper.ContextDiagram#getMappingReference <em>Mapping Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Reference</em>' reference.
	 * @see #getMappingReference()
	 * @generated
	 */
	void setMappingReference(MappingModel value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Runtimeconfig</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.RuntimeConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtimeconfig</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtimeconfig</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContextDiagram_Runtimeconfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeConfig> getRuntimeconfig();

} // ContextDiagram
