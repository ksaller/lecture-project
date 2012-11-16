/**
 */
package feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.Group#getParentFeature <em>Parent Feature</em>}</li>
 *   <li>{@link feature.Group#getChildFeatures <em>Child Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.FeaturePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends FeatureTreeNode {
	/**
	 * Returns the value of the '<em><b>Parent Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link feature.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Feature</em>' container reference.
	 * @see #setParentFeature(Feature)
	 * @see feature.FeaturePackage#getGroup_ParentFeature()
	 * @see feature.Feature#getGroups
	 * @model opposite="groups" required="true" transient="false"
	 * @generated
	 */
	Feature getParentFeature();

	/**
	 * Sets the value of the '{@link feature.Group#getParentFeature <em>Parent Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Feature</em>' container reference.
	 * @see #getParentFeature()
	 * @generated
	 */
	void setParentFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Child Features</b></em>' containment reference list.
	 * The list contents are of type {@link feature.Feature}.
	 * It is bidirectional and its opposite is '{@link feature.Feature#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Features</em>' containment reference list.
	 * @see feature.FeaturePackage#getGroup_ChildFeatures()
	 * @see feature.Feature#getParentGroup
	 * @model opposite="parentGroup" containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getChildFeatures();

} // Group
