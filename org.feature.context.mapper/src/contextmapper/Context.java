/**
 */
package contextmapper;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.feature.multi.perspective.mapping.viewmapping.Mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link contextmapper.Context#getName <em>Name</em>}</li>
 *   <li>{@link contextmapper.Context#getMapping <em>Mapping</em>}</li>
 *   <li>{@link contextmapper.Context#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link contextmapper.Context#getExtend <em>Extend</em>}</li>
 *   <li>{@link contextmapper.Context#getExclude <em>Exclude</em>}</li>
 *   <li>{@link contextmapper.Context#getExcluded <em>Excluded</em>}</li>
 *   <li>{@link contextmapper.Context#getPriorize <em>Priorize</em>}</li>
 * </ul>
 * </p>
 *
 * @see contextmapper.ContextmapperPackage#getContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraint='self.mapping <> null'"
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see contextmapper.ContextmapperPackage#getContext_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link contextmapper.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Mapping)
	 * @see contextmapper.ContextmapperPackage#getContext_Mapping()
	 * @model
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link contextmapper.Context#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Priorize</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.PriorConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.PriorConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorize</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorize</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Priorize()
	 * @see contextmapper.PriorConnection#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<PriorConnection> getPriorize();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.ExtendConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.ExtendConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Extend()
	 * @see contextmapper.ExtendConnection#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<ExtendConnection> getExtend();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link contextmapper.ExcludeConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.ExcludeConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Exclude()
	 * @see contextmapper.ExcludeConnection#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<ExcludeConnection> getExclude();

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' reference list.
	 * The list contents are of type {@link contextmapper.ExcludeConnection}.
	 * It is bidirectional and its opposite is '{@link contextmapper.ExcludeConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excluded</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' reference list.
	 * @see contextmapper.ContextmapperPackage#getContext_Excluded()
	 * @see contextmapper.ExcludeConnection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ExcludeConnection> getExcluded();

} // Context
