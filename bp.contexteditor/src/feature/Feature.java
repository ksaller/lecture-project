/**
 */
package feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link feature.Feature#getName <em>Name</em>}</li>
 *   <li>{@link feature.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link feature.Feature#getGroups <em>Groups</em>}</li>
 *   <li>{@link feature.Feature#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link feature.Feature#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link feature.Feature#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see feature.FeaturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends FeatureTreeNode {
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
	 * @see feature.FeaturePackage#getFeature_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link feature.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link feature.Attribute}.
	 * It is bidirectional and its opposite is '{@link feature.Attribute#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see feature.FeaturePackage#getFeature_Attributes()
	 * @see feature.Attribute#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link feature.Group}.
	 * It is bidirectional and its opposite is '{@link feature.Group#getParentFeature <em>Parent Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see feature.FeaturePackage#getFeature_Groups()
	 * @see feature.Group#getParentFeature
	 * @model opposite="parentFeature" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Parent Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link feature.Group#getChildFeatures <em>Child Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group</em>' container reference.
	 * @see #setParentGroup(Group)
	 * @see feature.FeaturePackage#getFeature_ParentGroup()
	 * @see feature.Group#getChildFeatures
	 * @model opposite="childFeatures" transient="false"
	 * @generated
	 */
	Group getParentGroup();

	/**
	 * Sets the value of the '{@link feature.Feature#getParentGroup <em>Parent Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group</em>' container reference.
	 * @see #getParentGroup()
	 * @generated
	 */
	void setParentGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link feature.Annotation}.
	 * It is bidirectional and its opposite is '{@link feature.Annotation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see feature.FeaturePackage#getFeature_Annotations()
	 * @see feature.Annotation#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link feature.Constraint}.
	 * It is bidirectional and its opposite is '{@link feature.Constraint#getConstrainedFeatures <em>Constrained Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see feature.FeaturePackage#getFeature_Constraints()
	 * @see feature.Constraint#getConstrainedFeatures
	 * @model opposite="constrainedFeatures"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isMandatory();

} // Feature
