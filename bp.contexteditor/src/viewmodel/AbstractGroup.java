/**
 */
package viewmodel;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link viewmodel.AbstractGroup#getViewPointReference <em>View Point Reference</em>}</li>
 *   <li>{@link viewmodel.AbstractGroup#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see viewmodel.ViewmodelPackage#getAbstractGroup()
 * @model
 * @generated
 */
public interface AbstractGroup extends Element {
	/**
	 * Returns the value of the '<em><b>View Point Reference</b></em>' reference list.
	 * The list contents are of type {@link viewmodel.ViewPoint}.
	 * It is bidirectional and its opposite is '{@link viewmodel.ViewPoint#getContainedInGroup <em>Contained In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Point Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Point Reference</em>' reference list.
	 * @see viewmodel.ViewmodelPackage#getAbstractGroup_ViewPointReference()
	 * @see viewmodel.ViewPoint#getContainedInGroup
	 * @model opposite="containedInGroup"
	 * @generated
	 */
	EList<ViewPoint> getViewPointReference();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link viewmodel.Group}.
	 * It is bidirectional and its opposite is '{@link viewmodel.Group#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see viewmodel.ViewmodelPackage#getAbstractGroup_Groups()
	 * @see viewmodel.Group#getParentGroup
	 * @model opposite="parentGroup" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" eDiagnosticChainRequired="true" eMapRequired="true"
	 * @generated
	 */
	boolean checkForRedundantViewPoints(DiagnosticChain eDiagnosticChain, Map<?, ?> eMap);

} // AbstractGroup
